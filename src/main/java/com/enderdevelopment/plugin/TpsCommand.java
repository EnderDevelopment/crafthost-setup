package com.enderdevelopment.plugin;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class TpsCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command,
                             @NotNull String label, @NotNull String[] args) {
        double tps = sender.getServer().getTPS()[0];
        double rounded = Math.round(tps * 100.0) / 100.0;

        NamedTextColor color;
        String rating;
        if (tps >= 19.0) {
            color = NamedTextColor.GREEN;
            rating = "Excellent";
        } else if (tps >= 15.0) {
            color = NamedTextColor.YELLOW;
            rating = "Good";
        } else {
            color = NamedTextColor.RED;
            rating = "Poor";
        }

        Runtime runtime = Runtime.getRuntime();
        long usedMb = (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024);
        long maxMb = runtime.maxMemory() / (1024 * 1024);

        sender.sendMessage(Component.text("TPS: ").color(NamedTextColor.GRAY)
                .append(Component.text(rounded).color(color)));
        sender.sendMessage(Component.text("Performance rating: ").color(NamedTextColor.GRAY)
                .append(Component.text(rating).color(color)));
        sender.sendMessage(Component.text("Memory used/max: ").color(NamedTextColor.GRAY)
                .append(Component.text(usedMb + " MB / " + maxMb + " MB").color(NamedTextColor.WHITE)));
        return true;
    }
}
