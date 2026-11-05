package com.enderdevelopment.plugin;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class HostInfoCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command,
                             @NotNull String label, @NotNull String[] args) {
        Runtime runtime = Runtime.getRuntime();
        long usedMb = (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024);
        long maxMb = runtime.maxMemory() / (1024 * 1024);

        sender.sendMessage(Component.text("========= HostHelper =========").color(NamedTextColor.GOLD));
        sender.sendMessage(Component.text("Server: ").color(NamedTextColor.GRAY)
                .append(Component.text(sender.getServer().getName() + " " + sender.getServer().getVersion()).color(NamedTextColor.WHITE)));
        sender.sendMessage(Component.text("Online players: ").color(NamedTextColor.GRAY)
                .append(Component.text(sender.getServer().getOnlinePlayers().size()
                        + "/" + sender.getServer().getMaxPlayers()).color(NamedTextColor.WHITE)));
        sender.sendMessage(Component.text("Motd: ").color(NamedTextColor.GRAY)
                .append(Component.text(sender.getServer().getMotd()).color(NamedTextColor.WHITE)));
        sender.sendMessage(Component.text("Memory used/max: ").color(NamedTextColor.GRAY)
                .append(Component.text(usedMb + " MB / " + maxMb + " MB").color(NamedTextColor.WHITE)));
        sender.sendMessage(Component.text("=================================").color(NamedTextColor.GOLD));

        if (sender instanceof Player) {
            sender.sendMessage(Component.text("Java version: ").color(NamedTextColor.GRAY)
                    .append(Component.text(System.getProperty("java.version")).color(NamedTextColor.WHITE)));
            sender.sendMessage(Component.text("CPU cores: ").color(NamedTextColor.GRAY)
                    .append(Component.text(runtime.availableProcessors()).color(NamedTextColor.WHITE)));
        }
        return true;
    }
}
