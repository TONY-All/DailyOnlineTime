package top.minicraft.dailyonlinetime

import io.izzel.taboolib.module.compat.PlaceholderHook
import io.izzel.taboolib.module.inject.THook
import org.bukkit.entity.Player
import org.bukkit.plugin.Plugin

@THook
object PapiHook: PlaceholderHook.Expansion {
    override fun plugin(): Plugin {
        return DailyOnlineTime.plugin
    }

    override fun identifier(): String = "onlinetime"

    override fun onPlaceholderRequest(player: Player, str: String): String {
        TODO()
    }
}