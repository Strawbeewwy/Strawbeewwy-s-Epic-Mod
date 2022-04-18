package net.strawbeewwy.strawbeewwysepicmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.strawbeewwy.strawbeewwysepicmod.StrawbeewwysEpicMod;
import net.strawbeewwy.strawbeewwysepicmod.item.custom.gems.JadeBaseGemItems;
import net.strawbeewwy.strawbeewwysepicmod.item.custom.gems.RubyBaseGemItems;
import net.strawbeewwy.strawbeewwysepicmod.item.custom.gems.SapphireBaseGemItems;
import net.strawbeewwy.strawbeewwysepicmod.item.custom.gems.TopazBaseGemItems;
import net.strawbeewwy.strawbeewwysepicmod.item.custom.rings.*;

public class ModItems {

    public static final Item BLUEPRINT_RING = registerItem("blueprint_ring",
            new Item(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.COMMON)) );

    public static final Item RING_COPPER_SETTING = registerItem("ring_copper_setting",
            new Item(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.COMMON)) );
    public static final Item RING_IRON_SETTING = registerItem("ring_iron_setting",
            new Item(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.COMMON)) );
    public static final Item RING_GOLD_SETTING= registerItem("ring_gold_setting",
            new Item(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.COMMON)) );
    public static final Item RING_DIAMOND_SETTING = registerItem("ring_diamond_setting",
            new Item(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.COMMON)) );
    public static final Item RING_NETHERITE_SETTING = registerItem("ring_netherite_setting",
            new Item(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.COMMON)) );

    public static final Item POLISHED_COPPER_RING = registerItem("polished_copper_ring",
            new ModRingItem(new FabricItemSettings().group(ModItemGroup.RINGS).maxCount(1)) );
    public static final Item POLISHED_IRON_RING = registerItem("polished_iron_ring",
            new ModRingItem(new FabricItemSettings().group(ModItemGroup.RINGS).maxCount(1)) );
    public static final Item POLISHED_GOLD_RING = registerItem("polished_gold_ring",
            new ModRingItem(new FabricItemSettings().group(ModItemGroup.RINGS).maxCount(1)) );
    public static final Item POLISHED_DIAMOND_RING = registerItem("polished_diamond_ring",
            new ModRingItem(new FabricItemSettings().group(ModItemGroup.RINGS).maxCount(1)) );
    public static final Item POLISHED_NETHERITE_RING = registerItem("polished_netherite_ring",
            new ModRingItem(new FabricItemSettings().group(ModItemGroup.RINGS).maxCount(1)) );

    public static final Item BASE_COPPER_RING = registerItem("base_copper_ring",
            new ModBaseRingItem(new FabricItemSettings().group(ModItemGroup.RINGS).maxCount(1)) );
    public static final Item BASE_GOLD_RING = registerItem("base_gold_ring",
            new ModBaseRingItem(new FabricItemSettings().group(ModItemGroup.RINGS).maxCount(1)) );
    public static final Item BASE_IRON_RING = registerItem("base_iron_ring",
            new ModBaseRingItem(new FabricItemSettings().group(ModItemGroup.RINGS).maxCount(1)) );
    public static final Item BASE_DIAMOND_RING = registerItem("base_diamond_ring",
            new ModBaseRingItem(new FabricItemSettings().group(ModItemGroup.RINGS).maxCount(1)) );
    public static final Item BASE_NETHERITE_RING = registerItem("base_netherite_ring",
            new ModBaseRingItem(new FabricItemSettings().group(ModItemGroup.RINGS).maxCount(1)) );

    //GEAR
    //TRINKETS
    public static final Item RUBY_COPPER_RING = registerItem("ruby_copper_ring",
            new ModRingItemRuby(new FabricItemSettings().group(ModItemGroup.RINGS).maxCount(1)) );
    public static final Item SAPPHIRE_COPPER_RING = registerItem("sapphire_copper_ring",
            new ModRingItemSapphire(new FabricItemSettings().group(ModItemGroup.RINGS).maxCount(1)) );
    public static final Item JADE_COPPER_RING = registerItem("jade_copper_ring",
            new ModRingItemJade(new FabricItemSettings().group(ModItemGroup.RINGS).maxCount(1)) );
    public static final Item TOPAZ_COPPER_RING = registerItem("topaz_copper_ring",
            new ModRingItemTopaz(new FabricItemSettings().group(ModItemGroup.RINGS).maxCount(1)) );

    public static final Item RUBY_IRON_RING = registerItem("ruby_iron_ring",
            new ModRingItemRuby(new FabricItemSettings().group(ModItemGroup.RINGS).maxCount(1)) );
    public static final Item SAPPHIRE_IRON_RING = registerItem("sapphire_iron_ring",
            new ModRingItemSapphire(new FabricItemSettings().group(ModItemGroup.RINGS).maxCount(1)) );
    public static final Item JADE_IRON_RING = registerItem("jade_iron_ring",
            new ModRingItemJade(new FabricItemSettings().group(ModItemGroup.RINGS).maxCount(1)) );
    public static final Item TOPAZ_IRON_RING = registerItem("topaz_iron_ring",
            new ModRingItemTopaz(new FabricItemSettings().group(ModItemGroup.RINGS).maxCount(1)) );

    public static final Item RUBY_GOLD_RING = registerItem("ruby_gold_ring",
            new ModRingItemRuby(new FabricItemSettings().group(ModItemGroup.RINGS).maxCount(1)) );
    public static final Item SAPPHIRE_GOLD_RING = registerItem("sapphire_gold_ring",
            new ModRingItemSapphire(new FabricItemSettings().group(ModItemGroup.RINGS).maxCount(1)) );
    public static final Item JADE_GOLD_RING = registerItem("jade_gold_ring",
            new ModRingItemJade(new FabricItemSettings().group(ModItemGroup.RINGS).maxCount(1)) );
    public static final Item TOPAZ_GOLD_RING = registerItem("topaz_gold_ring",
            new ModRingItemTopaz(new FabricItemSettings().group(ModItemGroup.RINGS).maxCount(1)) );

    public static final Item RUBY_DIAMOND_RING = registerItem("ruby_diamond_ring",
            new ModRingItemRuby(new FabricItemSettings().group(ModItemGroup.RINGS).maxCount(1)) );
    public static final Item SAPPHIRE_DIAMOND_RING = registerItem("sapphire_diamond_ring",
            new ModRingItemSapphire(new FabricItemSettings().group(ModItemGroup.RINGS).maxCount(1)) );
    public static final Item JADE_DIAMOND_RING = registerItem("jade_diamond_ring",
            new ModRingItemJade(new FabricItemSettings().group(ModItemGroup.RINGS).maxCount(1)) );
    public static final Item TOPAZ_DIAMOND_RING = registerItem("topaz_diamond_ring",
            new ModRingItemTopaz(new FabricItemSettings().group(ModItemGroup.RINGS).maxCount(1)) );

    public static final Item RUBY_NETHERITE_RING = registerItem("ruby_netherite_ring",
            new ModRingItemRuby(new FabricItemSettings().group(ModItemGroup.RINGS).maxCount(1)) );
    public static final Item SAPPHIRE_NETHERITE_RING = registerItem("sapphire_netherite_ring",
            new ModRingItemSapphire(new FabricItemSettings().group(ModItemGroup.RINGS).maxCount(1)) );
    public static final Item JADE_NETHERITE_RING = registerItem("jade_netherite_ring",
            new ModRingItemJade(new FabricItemSettings().group(ModItemGroup.RINGS).maxCount(1)) );
    public static final Item TOPAZ_NETHERITE_RING = registerItem("topaz_netherite_ring",
            new ModRingItemTopaz(new FabricItemSettings().group(ModItemGroup.RINGS).maxCount(1)) );



    // RAW GEMS
    public static final Item TINY_RAW_RUBY = registerItem("tiny_raw_ruby",
            new Item(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.COMMON)) );

    public static final Item TINY_RAW_SAPPHIRE = registerItem("tiny_raw_sapphire",
            new Item(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.COMMON)) );

    public static final Item TINY_RAW_JADE = registerItem("tiny_raw_jade",
            new Item(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.COMMON)) );

    public static final Item TINY_RAW_TOPAZ = registerItem("tiny_raw_topaz",
            new Item(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.COMMON)) );

    public static final Item SMALL_RAW_RUBY = registerItem("small_raw_ruby",
            new Item(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.COMMON)) );

    public static final Item SMALL_RAW_SAPPHIRE = registerItem("small_raw_sapphire",
            new Item(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.COMMON)) );

    public static final Item SMALL_RAW_JADE = registerItem("small_raw_jade",
            new Item(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.COMMON)) );

    public static final Item SMALL_RAW_TOPAZ = registerItem("small_raw_topaz",
            new Item(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.COMMON)) );

    public static final Item RAW_RUBY = registerItem("raw_ruby",
            new Item(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.UNCOMMON)) );

    public static final Item RAW_SAPPHIRE = registerItem("raw_sapphire",
            new Item(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.UNCOMMON)) );

    public static final Item RAW_JADE = registerItem("raw_jade",
            new Item(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.UNCOMMON)) );

    public static final Item RAW_TOPAZ = registerItem("raw_topaz",
            new Item(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.UNCOMMON)) );

    public static final Item BIG_RAW_RUBY = registerItem("big_raw_ruby",
            new Item(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.RARE)) );

    public static final Item BIG_RAW_SAPPHIRE = registerItem("big_raw_sapphire",
            new Item(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.RARE)) );

    public static final Item BIG_RAW_JADE = registerItem("big_raw_jade",
            new Item(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.RARE)) );

    public static final Item BIG_RAW_TOPAZ = registerItem("big_raw_topaz",
            new Item(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.RARE)) );

    public static final Item HUGE_RAW_RUBY = registerItem("huge_raw_ruby",
            new Item(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.EPIC)) );

    public static final Item HUGE_RAW_SAPPHIRE = registerItem("huge_raw_sapphire",
            new Item(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.EPIC)) );

    public static final Item HUGE_RAW_JADE = registerItem("huge_raw_jade",
            new Item(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.EPIC)) );

    public static final Item HUGE_RAW_TOPAZ = registerItem("huge_raw_topaz",
            new Item(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.EPIC)) );

    //CUT GEMS
    public static final Item CHIPPED_RUBY = registerItem("chipped_ruby",
            new RubyBaseGemItems(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.COMMON)) );

    public static final Item CHIPPED_SAPPHIRE = registerItem("chipped_sapphire",
            new SapphireBaseGemItems(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.COMMON)) );

    public static final Item CHIPPED_JADE = registerItem("chipped_jade",
            new JadeBaseGemItems(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.COMMON)) );

    public static final Item CHIPPED_TOPAZ = registerItem("chipped_topaz",
            new TopazBaseGemItems(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.COMMON)) );

    public static final Item FLAWED_RUBY = registerItem("flawed_ruby",
            new RubyBaseGemItems(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.COMMON)) );

    public static final Item FLAWED_SAPPHIRE = registerItem("flawed_sapphire",
            new SapphireBaseGemItems(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.COMMON)) );

    public static final Item FLAWED_JADE = registerItem("flawed_jade",
            new JadeBaseGemItems(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.COMMON)) );

    public static final Item FLAWED_TOPAZ = registerItem("flawed_topaz",
            new TopazBaseGemItems(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.COMMON)) );

    public static final Item RUBY = registerItem("ruby",
            new RubyBaseGemItems(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.UNCOMMON)) );

    public static final Item SAPPHIRE = registerItem("sapphire",
            new SapphireBaseGemItems(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.UNCOMMON)) );

    public static final Item JADE = registerItem("jade",
            new JadeBaseGemItems(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.UNCOMMON)) );

    public static final Item topaz = registerItem("topaz",
            new TopazBaseGemItems(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.UNCOMMON)) );

    public static final Item BRILLIANT_RUBY = registerItem("brilliant_ruby",
            new RubyBaseGemItems(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.RARE)) );

    public static final Item BRILLIANT_SAPPHIRE = registerItem("brilliant_sapphire",
            new SapphireBaseGemItems(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.RARE)) );

    public static final Item BRILLIANT_JADE = registerItem("brilliant_jade",
            new JadeBaseGemItems(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.RARE)) );

    public static final Item BRILLIANT_TOPAZ = registerItem("brilliant_topaz",
            new TopazBaseGemItems(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.RARE)) );

    public static final Item PRISTINE_RUBY = registerItem("pristine_ruby",
            new RubyBaseGemItems(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.EPIC)) );

    public static final Item PRISTINE_SAPPHIRE = registerItem("pristine_sapphire",
            new SapphireBaseGemItems(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.EPIC)) );

    public static final Item PRISTINE_JADE = registerItem("pristine_jade",
            new JadeBaseGemItems(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.EPIC)) );

    public static final Item PRISTINE_TOPAZ = registerItem("pristine_topaz",
            new TopazBaseGemItems(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.EPIC)) );

    public static final Item POCKET_GEODE = registerItem("pocket_geode",
            new Item(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.UNCOMMON)) );

    public static final Item RAW_RESIN = registerItem("raw_resin",
            new Item(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.COMMON)) );

    public static final Item RESIN_FLASK = registerItem("resin_flask",
            new Item(new FabricItemSettings().group(ModItemGroup.RINGS).rarity(Rarity.COMMON)) );


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(StrawbeewwysEpicMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        StrawbeewwysEpicMod.LOGGER.info("Registering Mod Items for " + StrawbeewwysEpicMod.MOD_ID);
    }
}
