package com.scrufflet.romantism;

import com.scrufflet.planned.PWindow;

public class Start {
	
	private String TITLE = "Romantism";
	private final int WIDTH = 800, HEIGHT = 600, SCALE = 4;
	
	public Start() {
		
		PWindow window = new PWindow(WIDTH, HEIGHT, SCALE);
		Workspace workspace = new Workspace(window);
		
		window.bindWorkspace(workspace);
		window.setTitle(TITLE);
		
		window.start();
		
	}
	
	public static void main(String[] args) {
		
		new Start(); // Get rid of static reference
		
	}
	
}
