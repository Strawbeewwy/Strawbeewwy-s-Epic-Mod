package net.strawbeewwy.strawbeewwysepicmod.item.custom.rings;

import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.impl.launch.FabricLauncherBase;
import net.fabricmc.loader.impl.launch.MappingConfiguration;
import net.minecraft.Bootstrap;
import net.minecraft.MinecraftVersion;
import net.minecraft.SharedConstants;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


class ModRingItemTest {


    @Test
    void appendTooltipShouldAddToolTip() {

        SharedConstants.setGameVersion(MinecraftVersion.CURRENT);
        Bootstrap.initialize();

        int[] cases = {1,2,3,4,5};
        NbtCompound nbtRing = new NbtCompound();

        for (int test : cases) {

            var item = Mockito.mock(ModRingItem.class);

            Mockito.doCallRealMethod().when(item).appendTooltip(Mockito.any(),Mockito.any(),Mockito.any(),Mockito.any());

            var stackContent = Mockito.mock(Item.class);

            Mockito.when(stackContent.asItem()).thenReturn(stackContent);

            var stack = new ItemStack(stackContent);
            nbtRing.putInt("quality", test);
            stack.setNbt(nbtRing);

            var world = Mockito.mock(World.class);
            var tooltipContext = Mockito.mock(TooltipContext.class);
            List<Text> tooltip = new ArrayList<Text>();

            item.appendTooltip(stack,world,tooltip,tooltipContext);

            Assertions.assertEquals(1,tooltip.size());
        }
    }
}