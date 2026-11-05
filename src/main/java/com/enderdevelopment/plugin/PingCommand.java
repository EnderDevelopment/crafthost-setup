package com.enderdevelopment.plugin;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class PingCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command,
                             @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player player)) {
            sender.sendMessage(Component.text("Only players can run this command.").color(NamedTextColor.RED));
            return true;
        }

        int ping = player.getPing();
        NamedTextColor color = ping <= 60 ? NamedTextColor.GREEN
                : ping <= 150 ? NamedTextColor.YELLOW
                : NamedTextColor.RED;

        player.sendMessage(Component.text("Your ping: ").color(NamedTextColor.GRAY)
                .append(Component.text(ping + " ms").color(color)));
        return true;
    }
}
