package net.strawbeewwy.strawbeewwysepicmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.strawbeewwy.strawbeewwysepicmod.StrawbeewwysEpicMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup MYTHRIL = FabricItemGroupBuilder.build(new Identifier(StrawbeewwysEpicMod.MOD_ID, "mythril"),
            () -> new ItemStack(ModItems.MYTHRIL_INGOT));

    public static final ItemGroup RINGS = FabricItemGroupBuilder.build(new Identifier(StrawbeewwysEpicMod.MOD_ID, "rings"),
            () -> new ItemStack(ModItems.RUBY));

}
