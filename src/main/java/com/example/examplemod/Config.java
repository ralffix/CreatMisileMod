package com.example.examplemod;

import net.minecraftforge.common.ForgeConfigSpec;

public class Config {

    // Builder for the config
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    // Example boolean config value
    public static final ForgeConfigSpec.BooleanValue LOG_DIRT_BLOCK = BUILDER
            .comment("Log dirt block during setup?")
            .define("logDirtBlock", true);

    // Build the spec
    public static final ForgeConfigSpec SPEC = BUILDER.build();
}
