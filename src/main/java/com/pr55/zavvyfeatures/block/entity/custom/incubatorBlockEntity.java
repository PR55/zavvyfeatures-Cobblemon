package com.pr55.zavvyfeatures.block.entity.custom;

import com.pr55.zavvyfeatures.block.entity.ImplementedInventory;
import com.pr55.zavvyfeatures.block.entity.ModBlockEntities;
import com.pr55.zavvyfeatures.component.ModDataComponentTypes;
import com.pr55.zavvyfeatures.item.custom.EggItemPoke;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;


public class incubatorBlockEntity extends BlockEntity implements ImplementedInventory {

    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(1, ItemStack.EMPTY);

    private float rotation = 0;

    public incubatorBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.INCUBATOR_BE, pos, state);
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    @Override
    protected void readNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
        this.getItems().clear();
        super.readNbt(nbt, registryLookup);
        Inventories.readNbt(nbt, inventory, registryLookup);
    }

    @Override
    protected void writeNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
        super.writeNbt(nbt, registryLookup);
        Inventories.writeNbt(nbt,inventory,registryLookup);
    }

    @Override
    public @Nullable Packet<ClientPlayPacketListener> toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.create(this);
    }

    @Override
    public NbtCompound toInitialChunkDataNbt(RegistryWrapper.WrapperLookup registryLookup) {
        return createNbt(registryLookup);
    }

    public float getRenderingRotation(){
        rotation += 0.5f;

        if(rotation >= 360){
            rotation = 0;
        }

        return rotation;
    }

    // And add
    @Override
    public void markDirty() {
        super.markDirty();
        if(this.world != null) {
            this.world.updateListeners(pos, getCachedState(), getCachedState(), 3);
        }
    }

    public void tick(World world, BlockPos pos, BlockState state) {
        if(world.isClient()){
            return;
        }

        ItemStack stackInBlock = this.getStack(0);

        if(stackInBlock != ItemStack.EMPTY && stackInBlock.getItem() instanceof EggItemPoke){
            determinTickBlock(stackInBlock,world,state,pos);
        }

    }

    private void determinTickBlock(ItemStack stack, World world, BlockState state, BlockPos pos){
        if(stack.get(ModDataComponentTypes.TIMER) == null){return;}
        if(stack.get(ModDataComponentTypes.TIMER) <= 0 && stack.get(ModDataComponentTypes.TIMER) != null){return;}
        if(stack.get(ModDataComponentTypes.HATCHABLE) && stack.get(ModDataComponentTypes.HATCHABLE) != null && !world.isClient()){
            if(stack.get(ModDataComponentTypes.SECONDS) == null) return;
            int second = stack.get(ModDataComponentTypes.SECONDS);
            stack.set(ModDataComponentTypes.SECONDS,  second+1);
            if(stack.get(ModDataComponentTypes.SECONDS) < 20) return;
            stack.set(ModDataComponentTypes.SECONDS,  0);
            int timer = stack.get(ModDataComponentTypes.TIMER);
            stack.set(ModDataComponentTypes.TIMER, timer - 40);


        }
    }
}
