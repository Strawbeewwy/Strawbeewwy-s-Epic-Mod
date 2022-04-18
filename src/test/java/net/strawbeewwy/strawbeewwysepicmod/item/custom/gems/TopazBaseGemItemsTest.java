package net.strawbeewwy.strawbeewwysepicmod.item.custom.gems;

import net.minecraft.Bootstrap;
import net.minecraft.MinecraftVersion;
import net.minecraft.SharedConstants;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import net.strawbeewwy.strawbeewwysepicmod.item.custom.rings.ModBaseRingItem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TopazBaseGemItemsTest {


    @Test
    public void onCraftShouldHaveGemQuality() {

        SharedConstants.setGameVersion(MinecraftVersion.CURRENT);
        Bootstrap.initialize();

        var cases = new HashMap<String, Integer>();

        cases.put("chipped_topaz",401);
        cases.put("flawed_topaz",402);
        cases.put("topaz",403);
        cases.put("brilliant_topaz", 404);
        cases.put("pristine_topaz",405);

        for (var test:cases.entrySet()) {

            var item = new TopazBaseGemItems(new Item.Settings());
            var stackContent = Mockito.mock(Item.class);

            Mockito.when(stackContent.asItem()).thenReturn(stackContent);

            var stack = new ItemStack(stackContent);
            var world = Mockito.mock(World.class);
            var playerEntity = Mockito.mock(PlayerEntity.class);

            Mockito.when(stackContent.toString()).thenReturn(test.getKey());
            item.onCraft(stack,world,playerEntity);

            Assertions.assertEquals(test.getValue(),stack.getNbt().getInt("gem"));
        }
    }

    @Test
    public void AppendToolTipShouldAddToolTips() {

        SharedConstants.setGameVersion(MinecraftVersion.CURRENT);
        Bootstrap.initialize();

        var item = new TopazBaseGemItems(new Item.Settings());
        var stackContent = Mockito.mock(Item.class);

        Mockito.when(stackContent.asItem()).thenReturn(stackContent);

        var stack = new ItemStack(stackContent);
        var world = Mockito.mock(World.class);

        var tooltipContext = Mockito.mock(TooltipContext.class);

        List<Text> tooltip = new ArrayList<Text>();
        List<Text> spyList = Mockito.spy(tooltip);

        item.appendTooltip(stack,world,spyList,tooltipContext);

        Assertions.assertEquals(3,spyList.size());
    }
}