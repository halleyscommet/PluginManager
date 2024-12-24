package us.dingl.pluginmanager;

import org.bukkit.plugin.java.JavaPlugin;

public final class PluginManager extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("PluginManager has been enabled!");


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("PluginManager has been disabled!");
    }
}
