package net.strawbeewwy.strawbeewwysepicmod.item.custom.gems;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

import java.util.List;

public class TopazBaseGemItems extends Item {

    public TopazBaseGemItems(Settings settings) {
        super(settings);
    }


    @Override
    public void onCraft(ItemStack stack, World world, PlayerEntity player) {


        //checks the material and gives NBT tag for the item modifiers
        String itemType = stack.getItem().toString();
        //System.out.println(itemType);

        super.onCraft(stack, world, player);

        int gem = 0;
        if (itemType.equals("chipped_topaz")) { gem = 401;};
        if (itemType.equals("flawed_topaz")) { gem = 402;};
        if (itemType.equals("topaz")) { gem = 403;};
        if (itemType.equals("brilliant_topaz")) { gem = 404;};
        if (itemType.equals("pristine_topaz")) { gem = 405;};

        NbtCompound nbtGem = new NbtCompound();
        nbtGem.putInt("gem", gem);
        stack.setNbt(nbtGem);

        //System.out.println("NBT DATA: " + stack.getNbt().toString());
    }


    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext tooltipContext){
        tooltip.add(new TranslatableText("item.strawbeewwysepicmod.topaz_gem_tip_line_1"));
        tooltip.add(new TranslatableText("item.strawbeewwysepicmod.topaz_gem_tip_line_2"));
        tooltip.add(new TranslatableText("item.strawbeewwysepicmod.topaz_gem_tip_line_3"));
    }

}