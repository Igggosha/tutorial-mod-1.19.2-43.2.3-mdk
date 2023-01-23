package com.igggosha.tutorialmod.item;

import com.igggosha.tutorialmod.TutorialMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MODID);

    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine", ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));






    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);


    }
}



