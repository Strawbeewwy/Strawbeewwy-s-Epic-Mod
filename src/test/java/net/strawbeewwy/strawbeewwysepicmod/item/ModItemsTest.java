package net.strawbeewwy.strawbeewwysepicmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.loader.impl.launch.FabricLauncher;
import net.fabricmc.loader.impl.launch.FabricLauncherBase;
import net.fabricmc.loader.impl.launch.MappingConfiguration;
import net.minecraft.Bootstrap;
import net.minecraft.MinecraftVersion;
import net.minecraft.SharedConstants;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class ModItemsTest {

    @Test
    void registerModItems() {
        SharedConstants.setGameVersion(MinecraftVersion.CURRENT);
        Bootstrap.initialize();

        var mappingConfiguration = new MappingConfiguration();
        var fabricLauncher = Mockito.mock(FabricLauncher.class);
        var fabricLauncherBase = Mockito.mock(FabricLauncherBase.class);

        //fabricLauncherBase

        Mockito.when(fabricLauncher.getMappingConfiguration()).thenReturn(mappingConfiguration);

        var modItems = Mockito.mock(ModItems.class);


    }
}