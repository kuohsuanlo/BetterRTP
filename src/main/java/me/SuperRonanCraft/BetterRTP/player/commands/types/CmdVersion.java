package me.SuperRonanCraft.BetterRTP.player.commands.types;

import me.SuperRonanCraft.BetterRTP.Main;
import me.SuperRonanCraft.BetterRTP.player.commands.RTPCommand;
import org.bukkit.command.CommandSender;

import java.util.List;

public class CmdVersion implements RTPCommand {

    public void execute(CommandSender sendi, String label, String[] args) {
        sendi.sendMessage(Main.getInstance().getText().colorPre("&aVersion #&e" + Main.getInstance().getDescription().getVersion()));
    }

    public List<String> tabComplete(CommandSender sendi, String[] args) {
        return null;
    }

    public boolean permission(CommandSender sendi) {
        return true;
    }
}
