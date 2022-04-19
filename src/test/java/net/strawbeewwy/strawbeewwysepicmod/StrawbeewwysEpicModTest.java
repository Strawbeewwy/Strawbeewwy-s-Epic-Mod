package net.strawbeewwy.strawbeewwysepicmod;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.Bootstrap;
import net.minecraft.MinecraftVersion;
import net.minecraft.SharedConstants;
import net.minecraft.item.Item;
import net.strawbeewwy.strawbeewwysepicmod.item.ModItemGroup;
import net.strawbeewwy.strawbeewwysepicmod.item.custom.rings.ModRingItem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

class StrawbeewwysEpicModTest {

    @Test
    void ModShouldInitialize() {

        SharedConstants.setGameVersion(MinecraftVersion.CURRENT);
        Bootstrap.initialize();

        var strawbeewwysEpicMod = Mockito.mock(StrawbeewwysEpicMod.class);
        strawbeewwysEpicMod.onInitialize();

        Assertions.assertNotNull(strawbeewwysEpicMod);
    }
}