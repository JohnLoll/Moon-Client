package moonclient.mods;

import moonclient.gui.hud.IRenderer;

import moonclient.gui.hud.ScreenPosition;

public abstract class ModDraggable extends Mod implements IRenderer{
public final int getLineOffset(ScreenPosition pos, int lineNum) {
	return pos.getAbsoluteY()* getlineoffset(lineNum);
	
}

private int getlineoffset(int lineNum) {
	return (font.FONT_HEIGHT + 3)* lineNum;
	
}
}
