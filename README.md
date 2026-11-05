# CraftHost Setup - Minecraft Server Hosting Toolkit Plugin

CraftHost Setup is a lightweight Minecraft plugin that provides essential server hosting information and performance diagnostics directly in-game. This hosting toolkit helps server administrators and players monitor vital server metrics including TPS (ticks per second), memory usage, ping, and system resources without leaving the game. With simple commands, the plugin displays real-time server health, Java version, CPU core count, online player count, and more, making it an invaluable tool for anyone managing or using a Minecraft server.

## Install

1. Download the CraftHost Setup plugin JAR file (plugin-1.0.0.jar) from the release section.
2. Stop your Minecraft server if it is running.
3. Place the downloaded JAR file into your server's `plugins` folder.
4. Restart your Minecraft server.
5. Verify the plugin loaded successfully by checking the console for the message "HostHelper enabled - server hosting toolkit ready."

## Use

The plugin provides three simple commands:

**Command: /hostinfo** - Shows general server and hosting information
- Server name and version
- Online players count (current/maximum)
- Server MOTD
- Memory usage (used/max in MB)
- Java version (players only)
- CPU cores (players only)

**Command: /tps** - Displays server performance metrics
- Current TPS (ticks per second)
- Performance rating (Excellent ≥19 TPS, Good ≥15 TPS, Poor <15 TPS)
- Memory usage (used/max in MB)

**Command: /ping** - Shows a player's connection latency
- Ping in milliseconds with color-coded status (Green ≤60ms, Yellow ≤150ms, Red >150ms)

All commands can be run by any player, and the hosting information is valuable for both server administrators and curious players.

---

More Minecraft plugin projects by EnderDevelopment: https://github.com/EnderDevelopment

Project page: https://dash.enderdevelopment.com/community/8d968c3b-f11d-48b4-87f4-36528fdca6e7?utm_source=github&utm_medium=readme&utm_campaign=auto_publish&utm_content=8d968c3b-f11d-48b4-87f4-36528fdca6e7
