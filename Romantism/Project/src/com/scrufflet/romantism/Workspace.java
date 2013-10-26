package com.scrufflet.romantism;

import com.scrufflet.planned.PFont;
import com.scrufflet.planned.PModel;
import com.scrufflet.planned.PModelSheet;
import com.scrufflet.planned.PWindow;
import com.scrufflet.planned.PWorkspace;

public class Workspace extends PWorkspace {
	
	private SolarSystem solarSystem;
	private static int width, height;
	private PFont font;
	
	public Workspace(PWindow window) {
		
		super(window);
		
		Workspace.width = getWidth();
		Workspace.height = getHeight();
		
		init();
		
	}
	
	public void init() {
		
		solarSystem = new SolarSystem();
		font = new PFont(new PModelSheet(new PModel("/font.png", 0x000000), 100, 1), 1);
		
	}
	
	public void tick() {
		
		solarSystem.tick();
		
	}
	
	public void render() {
		
		fillAll(0x000000);
		
		solarSystem.render(this);
		font.renderString(this, "Solar System 0x34fc", 15, 10, 0xff00ff);
		
	}
	
	public static int getRealWidth() {
		
		return width;
		
	}
	
	public static int getRealHeight() {
		
		return height;
		
	}


}
