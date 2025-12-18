package net.maa12345.clayiummodern.registry;

import net.maa12345.clayiummodern.ClayiumModern;
import net.maa12345.clayiummodern.registry.item.ModItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.awt.*;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ClayiumModern.MODID);

    public static final RegistryObject<CreativeModeTab> CLAYIUM_TAB =CREATIVE_MODE_TABS.register("clayium_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.CLAY_BALL))
            .title(Component.translatable("itemGroup.clayium_modern"))
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(ModItem.ClayShooter0.get());
                pOutput.accept(ModItem.ClayStick.get());

            })
            .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}