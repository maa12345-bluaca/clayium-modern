package net.maa12345.clayiummodern.registry.item;

import net.maa12345.clayiummodern.ClayiumModern;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItem {
    public static final DeferredRegister<Item> ITEMS=
            DeferredRegister.create(ForgeRegistries.ITEMS, ClayiumModern.MODID);

    public static final RegistryObject<Item> ClayShooter0 = ITEMS.register("clay_shooter_0",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ClayStick = ITEMS.register("clay_stick",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
