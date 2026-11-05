package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private static Main instance;

    @Override
    public void onEnable() {
        instance = this;
        getLogger().info("HostHelper enabled - server hosting toolkit ready.");
        getCommand("hostinfo").setExecutor(new HostInfoCommand());
        getCommand("tps").setExecutor(new TpsCommand());
        getCommand("ping").setExecutor(new PingCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("HostHelper disabled.");
        instance = null;
    }

    public static Main getInstance() {
        return instance;
    }
}
