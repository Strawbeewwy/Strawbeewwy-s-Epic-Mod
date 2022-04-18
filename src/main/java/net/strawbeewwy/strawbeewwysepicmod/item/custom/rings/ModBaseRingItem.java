package net.strawbeewwy.strawbeewwysepicmod.item.custom.rings;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class ModBaseRingItem  extends Item {


    public ModBaseRingItem(Settings settings) {
        super(settings);
    }

    int ringQuality = 0;

    /*
    the final ring after all crafting steps has the following NBT; example is a "Ruby Copper Ring"
    - {CustomModelData:101} -> tells the polished ring what texture it should use.
         - 100, 200, ...  = copper, iron, gold, diamond, netherite ... (first digit tells material)
         - 101, 102, ... = gemtype (ruby, sapphire ..., second and third digit indicate the gem)
    - {type:1} -> hook for the base rings (copper, iron, ...)
    - {quality:1}  -> used for the quality modifier (stars on the item)
    - Copper Rings take chipped gems, Iron Rings take flawed gems ...
     */

    @Override
    public void onCraft(ItemStack stack, World world, PlayerEntity player) {


        //checks the material and gives NBT tag for the item modifiers
        String itemType = stack.getItem().toString();
        //System.out.println(itemType);

        super.onCraft(stack, world, player);

        int type = 0;
        if (itemType.equals("base_copper_ring")) { type = 1;}
        if (itemType.equals("base_iron_ring")) { type = 2;}
        if (itemType.equals("base_gold_ring")) { type = 3;}
        if (itemType.equals("base_diamond_ring")) { type = 4;}
        if (itemType.equals("base_netherite_ring")) { type = 5;}


        //generates a number (1-5) on crafting a base ring to determine it's quality
        final Random r = new Random();
        int val = r.nextInt(100) + type*2;

        if (val <= 39)               {setRingQuality(1);} //40%
        if (val > 39  && val <= 69)  {setRingQuality(2);} //30%
        if (val > 69 && val <= 89)   {setRingQuality(3);} //20%
        if (val >89 && val <= 98)    {setRingQuality(4);} //9%
        if (val >= 99)               {setRingQuality(5);} //1%

        //test
        //System.out.println("RING QUALITY: " + val);

        NbtCompound nbtRing = new NbtCompound();
        nbtRing.putInt("quality", getRingQuality());
        nbtRing.putInt("type", type);
        stack.setNbt(nbtRing);

        //System.out.println("NBT DATA: " + stack.getNbt().toString());
    }

    public void setRingQuality(int quality)
    {
        ringQuality = quality;
    }

    public int getRingQuality()
    {
        return ringQuality;
    }



    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext tooltipContext){
        if (stack.hasNbt()) {
            assert stack.getNbt() != null;
            if (stack.getNbt().toString().contains("quality:1")) {
                tooltip.add(new TranslatableText("item.strawbeewwysepicmod.quality_1"));
            } else if (stack.getNbt().toString().contains("quality:2")) {
                tooltip.add(new TranslatableText("item.strawbeewwysepicmod.quality_2"));
            } else if (stack.getNbt().toString().contains("quality:3")) {
                tooltip.add(new TranslatableText("item.strawbeewwysepicmod.quality_3"));
            } else if (stack.getNbt().toString().contains("quality:4")) {
                tooltip.add(new TranslatableText("item.strawbeewwysepicmod.quality_4"));
            } else if (stack.getNbt().toString().contains("quality:5")) {
                tooltip.add(new TranslatableText("item.strawbeewwysepicmod.quality_5"));
            } else {
                tooltip.add(new TranslatableText("item.strawbeewwysepicmod.qualityerror"));
            }
        }
    }
}

