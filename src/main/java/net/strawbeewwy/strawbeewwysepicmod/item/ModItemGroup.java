package net.strawbeewwy.strawbeewwysepicmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.strawbeewwy.strawbeewwysepicmod.StrawbeewwysEpicMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static ItemGroup RINGS;

    ModItemGroup(){
        RINGS = FabricItemGroupBuilder.build(new Identifier(StrawbeewwysEpicMod.MOD_ID, "rings"),
                () -> new ItemStack(ModItems.RUBY));

    }

}
