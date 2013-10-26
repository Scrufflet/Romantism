package com.scrufflet.romantism;

import java.util.Random;

import com.scrufflet.planned.PCamera;
import com.scrufflet.planned.PColor;
import com.scrufflet.planned.PRenderable;
import com.scrufflet.romantism.entity.Entity;
import com.scrufflet.romantism.entity.EntityPlanet;
import com.scrufflet.romantism.entity.EntitySun;

public class SolarSystem {
	
	private Entity sun;
	private Entity[] planets;
	private PCamera camera;
	
	public SolarSystem() {
		
		init();
		
	}
	
	public void init() {
		
		sun = new EntitySun(50);
		planets = new EntityPlanet[new Random().nextInt(1) + 2];
		for(int i = 0; i < planets.length; i ++)
			planets[i] = new EntityPlanet(new PColor(new Random().nextInt(255), new Random().nextInt(255), new Random().nextInt(255)), new Random().nextInt(5) + 6, 30 + (i * 15) + new Random().nextInt(2));
			
		camera = new PCamera(0, 0);
		
	}
	
	public void tick() {
		
		sun.tick();
		for(int i = 0; i < planets.length; i ++)
			planets[i].tick();
		
	}
	
	public void render(PRenderable renderable) {
		
		sun.render(renderable, camera);
		for(int i = 0; i < planets.length; i ++)
			planets[i].render(renderable, camera);
		
	}
	
}
