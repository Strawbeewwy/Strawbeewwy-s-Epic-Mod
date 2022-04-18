package net.strawbeewwy.strawbeewwysepicmod.item.custom.rings;

import net.minecraft.Bootstrap;
import net.minecraft.MinecraftVersion;
import net.minecraft.SharedConstants;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ModBaseRingItemTest {


    @Test
    public void onCraftShouldHaveMaterialType() {

        SharedConstants.setGameVersion(MinecraftVersion.CURRENT);
        Bootstrap.initialize();

        var cases = new HashMap<String, Integer>();

        cases.put("base_copper_ring",1);
        cases.put("base_iron_ring",2);
        cases.put("base_gold_ring",3);
        cases.put("base_diamond_ring", 4);
        cases.put("base_netherite_ring",5);

        for (var test:cases.entrySet()) {

            var item = new ModBaseRingItem(new Item.Settings());
            var stackContent = Mockito.mock(Item.class);

            Mockito.when(stackContent.asItem()).thenReturn(stackContent);

            var stack = new ItemStack(stackContent);
            var world = Mockito.mock(World.class);
            var playerEntity = Mockito.mock(PlayerEntity.class);

            Mockito.when(stackContent.toString()).thenReturn(test.getKey());
            item.onCraft(stack,world,playerEntity);

            Assertions.assertEquals(test.getValue(),stack.getNbt().getInt("type"));
        }
    }


    @Test
    public void AppendToolTipShouldAddToolTips() {

        SharedConstants.setGameVersion(MinecraftVersion.CURRENT);
        Bootstrap.initialize();

        var item = new ModBaseRingItem(new Item.Settings());
        var stackContent = Mockito.mock(Item.class);

        Mockito.when(stackContent.asItem()).thenReturn(stackContent);

        var stack = new ItemStack(stackContent);
        var world = Mockito.mock(World.class);
        var playerEntity = Mockito.mock(PlayerEntity.class);

        var tooltipContext = Mockito.mock(TooltipContext.class);

        List<Text> tooltip = new ArrayList<Text>();
        List<Text> spyList = Mockito.spy(tooltip);

        item.onCraft(stack,world,playerEntity);
        item.appendTooltip(stack,world,spyList,tooltipContext);

        Assertions.assertEquals(1,spyList.size());
    }
}