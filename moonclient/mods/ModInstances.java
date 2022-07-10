package moonclient.mods;

import moonclient.gui.hud.HUDManager;
import moonclient.mods.impl.ModHelloWorld;

public class ModInstances {
private static ModHelloWorld modHelloWorld;
public static void register(HUDManager api) {
	modHelloWorld = new ModHelloWorld();
	api.register(modHelloWorld);
}
public static ModHelloWorld getModHelloWorld() {
	return modHelloWorld;
}
}
