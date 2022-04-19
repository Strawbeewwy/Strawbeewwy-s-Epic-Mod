package net.strawbeewwy.strawbeewwysepicmod;

import net.minecraft.Bootstrap;
import net.minecraft.MinecraftVersion;
import net.minecraft.SharedConstants;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class StrawbeewwysEpicModClientModTest {

    @Test
    void ClientShouldInitialise() {

        SharedConstants.setGameVersion(MinecraftVersion.CURRENT);
        Bootstrap.initialize();

        var strawbeewwysEpicModClientMod = Mockito.mock(StrawbeewwysEpicModClientMod.class);
        strawbeewwysEpicModClientMod.onInitializeClient();

        Assertions.assertNotNull(strawbeewwysEpicModClientMod);

    }
}