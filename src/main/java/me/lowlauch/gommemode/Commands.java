package me.lowlauch.gommemode;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String commandString, String[] args) {
        if (commandString.equalsIgnoreCase("gommemode")) {
            int gommemode = 0;

            if (args.length >= 1 && args[0].equals("1")) {
                gommemode = 1;
            }

            if (gommemode == 0) {
                commandSender.sendMessage(ChatColor.DARK_AQUA + "TROLOLOLOLOLOLOL");
            } else {
                commandSender.sendMessage(ChatColor.DARK_AQUA + "So, ähm, ja, alles fertig so weit, ja, 'n Text hab ich\n" +
                        "Beat hab ich, ähm, ja, jetzt muss ich\n" +
                        "Was war? Ah ja, ins Mikrofon\n" +
                        "Ja, jetzt muss es nur noch ins Mikrofon, gut\n" +
                        "Alles klar, äh, kann ich jetzt loslegen?\n" +
                        "(Yeah, yeah) und eins, zwei, drei, vier\n" +
                        "Tja, liebe Zuschauer von Lukas\n" +
                        "Der Gommemode hat gerade\n" +
                        "Die Kontrolle übernommen\n" +
                        "Gommemodes, trololololol\n" +
                        "Er hat seinen eigenen Server, seine eigene Welt\n" +
                        "Der Typ is fly, weil ihn keiner mehr hält\n" +
                        "Kein Rüpel nein, nicht zynisch kein\n" +
                        "Verprügeln, seine Güte reicht weit bis\n" +
                        "Zu neuen Planeten, zu denen die da leben\n" +
                        "Das ganze Universum kennt ihn, alter frag jeden\n" +
                        "Hah, er wird von gar nichts geschockt\n" +
                        "Jap, er ist wahrlich ein Gott, und\n" +
                        "Das liegt vor allem an seiner geheimen Fähigkeit\n" +
                        "Von der man aber leider bisher wirklich wenig weiß\n" +
                        "Keiner kann das wirklich beschreiben\n" +
                        "Keiner weiß es\n" +
                        "Viele berichten davon, dass ein Licht aus ihm kommt\n" +
                        "Welches jegliches Leben, vernichtet und schon\n" +
                        "Seh ich wie er vor mir steht\n" +
                        "Shit, jetzt is es wohl zu spät\n" +
                        "Lauf um dein Leben, wenn der Gommemode angeht\n" +
                        "Ziel nicht daneben, wenn der Gommemode angeht\n" +
                        "Da hilft kein Reden, wenn der Gommemode angeht\n" +
                        "Gommemode, Gommemode, Gommemode angeht\n" +
                        "Lauf um dein Leben, wenn der Gommemode angeht\n" +
                        "Ziel nicht daneben, wenn der Gommemode angeht\n" +
                        "Da hilft kein Reden, wenn der Gommemode angeht\n" +
                        "Gommemode, Gommemode, Gommemode angeht\n" +
                        "Jede Runde PvP, kein Problem\n" +
                        "Ist der Modus aktiviert, wird nur einer stehen\n" +
                        "Lauf um dein Leben (wenn der Gommemode angeht)\n" +
                        "Ziel nicht daneben (wenn der Gommemode angeht)\n" +
                        "Da hilft kein Reden (wenn der Gommemode angeht)\n" +
                        "Mann, ich sag's dir doch\n" +
                        "Lauf um dein Leben (wenn der Gommemode angeht)\n" +
                        "Ziel nicht daneben (wenn der Gommemode angeht)\n" +
                        "Da hilft kein Reden (wenn der Gommemode angeht)\n" +
                        "Gommemode, Gommemode, Gommemode angeht\n" +
                        "Wenn der Gommemode angeht\n" +
                        "Wenn der Gommemode angeht\n" +
                        "Wenn der Gommemode angeht\n" +
                        "Gommemode, trololololol\n" +
                        "Lauf um dein Leben, wenn der Gommemode angeht\n" +
                        "Ziel nicht daneben, wenn der Gommemode angeht\n" +
                        "Da hilft kein Reden, wenn der Gommemode angeht\n" +
                        "Gommemode, Gommemode, Gommemode angeht\n" +
                        "Lauf um dein Leben, wenn der Gommemode angeht\n" +
                        "Ziel nicht daneben, wenn der Gommemode angeht\n" +
                        "Da hilft kein Reden, wenn der Gommemode angeht\n" +
                        "Gommemode, Gommemode, Gommemode angeht");
            }

            return true;
        }

        return false;
    }
}
