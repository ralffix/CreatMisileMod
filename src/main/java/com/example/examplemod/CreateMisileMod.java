package com.example.examplemod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CreateMisileMod.MODID)
public class CreateMisileMod {

    public static final String MODID = "examplemod";

    public CreateMisileMod() {
        // Correct way to get the mod event bus
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        System.out.println("Hello from CreateMisileMod!");
    }
}
