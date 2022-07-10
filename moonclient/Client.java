package moonclient;

import moonclient.event.EventManager;
import moonclient.event.EventTarget;
import moonclient.event.impl.ClientTickEvent;
import moonclient.gui.SplashProgress;
import moonclient.gui.hud.HUDManager;
import moonclient.mods.ModInstances;
import net.minecraft.client.Minecraft;

public class Client {
	private static final Client INSTANCE = new Client();
	public static final Client getInstance() {
		return INSTANCE;
	}
	private DiscordRP discordRP = new DiscordRP();
	private HUDManager hudManager;
	public void init() {
		//discordRP.start();
		SplashProgress.setProgress(1, "Client - Initalising DiscordRP");
		EventManager.register(this);
		
		
	}
	
	public void start() {
		hudManager = HUDManager.getInstance();
		ModInstances.register(hudManager);
	}
	public void shutdown() {
		discordRP.shutdown();
	}
	
	public DiscordRP getDiscordRP(){
		return discordRP;
	}
	
	@EventTarget
	public void ontick(ClientTickEvent e) {
		if(Minecraft.getMinecraft().gameSettings.CLIENT_GUI_MOD_POS.isPressed()) {
			hudManager.openConfigScreen();
		}
	}
}
