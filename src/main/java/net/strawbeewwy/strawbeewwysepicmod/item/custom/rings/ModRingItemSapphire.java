package net.strawbeewwy.strawbeewwysepicmod.item.custom.rings;

import dev.emi.trinkets.api.SlotReference;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

import java.util.List;
import java.util.UUID;

public class ModRingItemSapphire extends ModRingItem{
    public ModRingItemSapphire(Settings settings) {
        super(settings);
    }

    int effectiveRadius = 0;
    int effectAmplifier = 1;
    int TPS = 20;
    UUID friendUuid;
    PlayerEntity friend;

    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        if (stack.hasNbt()) {
            assert stack.getNbt() != null;
            if (stack.getNbt().toString().contains("quality:1")) {
                tooltip.add(new TranslatableText("item.strawbeewwysepicmod.quality_1"));
                effectiveRadius = 5;
                effectAmplifier = 1;
            } else if (stack.getNbt().toString().contains("quality:2")) {
                tooltip.add(new TranslatableText("item.strawbeewwysepicmod.quality_2"));
                effectiveRadius = 10;
                effectAmplifier = 2;
            } else if (stack.getNbt().toString().contains("quality:3")) {
                tooltip.add(new TranslatableText("item.strawbeewwysepicmod.quality_3"));
                effectiveRadius = 15;
                effectAmplifier = 3;
            } else if (stack.getNbt().toString().contains("quality:4")) {
                tooltip.add(new TranslatableText("item.strawbeewwysepicmod.quality_4"));
                effectiveRadius = 20;
                effectAmplifier = 4;
            } else if (stack.getNbt().toString().contains("quality:5")) {
                tooltip.add(new TranslatableText("item.strawbeewwysepicmod.quality_5"));
                effectiveRadius = 25;
                effectAmplifier = 5;
            } else {
                tooltip.add(new TranslatableText("item.strawbeewwysepicmod.qualityerror"));
            }
        }
    }

    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {


        if (friend == null || !stack.getName().asString().equals(friend.getDisplayName().asString())){
            List<? extends PlayerEntity> players = entity.getWorld().getPlayers();
            for (PlayerEntity player : players) {
                if (stack.getName().asString().equals(player.getDisplayName().asString()))
                {
                    friend = player;
                    friendUuid = player.getUuid();
                }
            }
        }

        if (friend!= null) {
            if (friend.getPos().isInRange(entity.getPos(),effectiveRadius)) {
                entity.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 5 * TPS, effectAmplifier));
                entity.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 5 * TPS, effectAmplifier));
            }
        }
    }


    public void onUnequip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        entity.clearStatusEffects();
    }

}