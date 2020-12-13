package top.minicraft.dailyonlinetime

import io.izzel.taboolib.loader.Plugin
import io.izzel.taboolib.module.compat.PlaceholderHook
import io.izzel.taboolib.module.locale.logger.TLoggerManager
import org.bukkit.Bukkit

val logger = TLoggerManager.getLogger(DailyOnlineTime.plugin)!!

object DailyOnlineTime: Plugin() {
    override fun onEnable() {
        if(!PlaceholderHook.isHooked()) {
            logger.error("未找到PlaceholderAPI..插件已停用.")
        }
        Bukkit.getPluginManager().disablePlugin(this.plugin)
    }
}