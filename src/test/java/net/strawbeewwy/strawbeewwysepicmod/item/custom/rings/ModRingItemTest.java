package net.strawbeewwy.strawbeewwysepicmod.item.custom.rings;

import dev.emi.trinkets.TrinketsClient;
import dev.emi.trinkets.TrinketsMain;
import dev.emi.trinkets.api.TrinketsApi;
import dev.onyxstudios.cca.api.v3.entity.EntityComponentFactoryRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.impl.FabricLoaderImpl;
import net.fabricmc.loader.impl.launch.FabricLauncher;
import net.fabricmc.loader.impl.launch.FabricLauncherBase;
import net.fabricmc.loader.impl.launch.FabricMixinBootstrap;
import net.minecraft.Bootstrap;
import net.minecraft.MinecraftVersion;
import net.minecraft.SharedConstants;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.strawbeewwy.strawbeewwysepicmod.StrawbeewwysEpicMod;
import net.strawbeewwy.strawbeewwysepicmod.StrawbeewwysEpicModClientMod;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

class ModRingItemTest {

    @Test
    void appendTooltipShouldAddToolTip() {

        SharedConstants.setGameVersion(MinecraftVersion.CURRENT);
        Bootstrap.initialize();

        var item = new ModRingItem(new Item.Settings());
        var stackContent = Mockito.mock(Item.class);

        Mockito.when(stackContent.asItem()).thenReturn(stackContent);

        var stack = new ItemStack(stackContent);
        var world = Mockito.mock(World.class);

        var tooltipContext = Mockito.mock(TooltipContext.class);

        List<Text> tooltip = new ArrayList<Text>();
        List<Text> spyList = Mockito.spy(tooltip);

        item.appendTooltip(stack,world,tooltip,tooltipContext);

        Assertions.assertEquals(1,tooltip.size(),"List Size Should Be 1");

    }
}