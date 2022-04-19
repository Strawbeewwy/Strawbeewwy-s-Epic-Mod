package net.strawbeewwy.strawbeewwysepicmod.item.custom.rings;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketInventory;
import net.minecraft.Bootstrap;
import net.minecraft.MinecraftVersion;
import net.minecraft.SharedConstants;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ModRingItemSapphireTest {

    @Test
    void appendTooltipShouldAddToolTip() {

        SharedConstants.setGameVersion(MinecraftVersion.CURRENT);
        Bootstrap.initialize();

        int[] cases = {1,2,3,4,5};
        NbtCompound nbtRing = new NbtCompound();

        for (int test : cases) {

            var item = Mockito.mock(ModRingItemSapphire.class);

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

    @Test
    void appendTooltipShouldWriteQuality() {

        SharedConstants.setGameVersion(MinecraftVersion.CURRENT);
        Bootstrap.initialize();

        int[] cases = {1,2,3,4,5};
        NbtCompound nbtRing = new NbtCompound();

        for (int test : cases) {

            var item = Mockito.mock(ModRingItemSapphire.class);

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

            Assertions.assertEquals(test,stack.getNbt().getInt("quality"));
        }
    }

    @Test
    void ItemShouldLookIfNameIsTheSameAsFriend() {

        SharedConstants.setGameVersion(MinecraftVersion.CURRENT);
        Bootstrap.initialize();

        var item = Mockito.mock(ModRingItemSapphire.class);
        Mockito.doCallRealMethod().when(item).tick(Mockito.any(),Mockito.any(),Mockito.any());

        var stackContent = Mockito.mock(Item.class);
        Mockito.when(stackContent.asItem()).thenReturn(stackContent);
        var stack = new ItemStack(stackContent);


        var trinketInventory = Mockito.mock(TrinketInventory.class);
        var slotReference = new SlotReference(trinketInventory,0);

        var livingEntity = Mockito.mock(LivingEntity.class);
        var world = Mockito.mock(World.class);

        Mockito.when(livingEntity.getWorld()).thenReturn(world);
        var playerEntity = Mockito.mock(PlayerEntity.class);


        Mockito.when(playerEntity.getDisplayName()).thenReturn(Text.of("Player1"));

        Mockito.when(stack.getName()).thenReturn(Text.of("Player1"));

        item.tick(stack,slotReference,livingEntity);


        assertEquals(stack.getName().asString(), playerEntity.getDisplayName().asString());

    }


    @Test
    void ItemShouldGiveEffectsWhenInRange() {
        SharedConstants.setGameVersion(MinecraftVersion.CURRENT);
        Bootstrap.initialize();

        var item = Mockito.mock(ModRingItemSapphire.class);
        Mockito.doCallRealMethod().when(item).tick(Mockito.any(),Mockito.any(),Mockito.any());

        var stackContent = Mockito.mock(Item.class);
        Mockito.when(stackContent.asItem()).thenReturn(stackContent);
        var stack = new ItemStack(stackContent);


        var trinketInventory = Mockito.mock(TrinketInventory.class);
        var slotReference = new SlotReference(trinketInventory,0);

        var livingEntity = Mockito.mock(LivingEntity.class);
        var world = Mockito.mock(World.class);

        Mockito.when(livingEntity.getWorld()).thenReturn(world);
        var playerEntity = Mockito.mock(PlayerEntity.class);
        item.friend = playerEntity;

        Mockito.when(playerEntity.getDisplayName()).thenReturn(Text.of("Player1"));
        Mockito.when(stack.getName()).thenReturn(Text.of("Player1"));

        Mockito.when(item.friend.getPos()).thenReturn(new Vec3d(0,0,0));
        Mockito.when(livingEntity.getPos()).thenReturn(new Vec3d(0,0,0));

        item.tick(stack,slotReference,livingEntity);

        Assertions.assertNotNull(livingEntity.getStatusEffects());
    }

    @Test
    void onUnequipShouldClearPlayerEffect() {

        SharedConstants.setGameVersion(MinecraftVersion.CURRENT);
        Bootstrap.initialize();

        var item = Mockito.mock(ModRingItemSapphire.class);
        Mockito.doCallRealMethod().when(item).onUnequip(Mockito.any(),Mockito.any(),Mockito.any());

        var stackContent = Mockito.mock(Item.class);
        Mockito.when(stackContent.asItem()).thenReturn(stackContent);
        var stack = new ItemStack(stackContent);


        var trinketInventory = Mockito.mock(TrinketInventory.class);
        var slotReference = new SlotReference(trinketInventory,0);

        var livingEntity = Mockito.mock(LivingEntity.class);

        Mockito.when(livingEntity.clearStatusEffects()).thenReturn(true);

        item.onUnequip(stack,slotReference,livingEntity);

        Assertions.assertTrue(livingEntity.clearStatusEffects());
    }
}