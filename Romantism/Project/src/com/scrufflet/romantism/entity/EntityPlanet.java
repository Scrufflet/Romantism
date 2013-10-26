package com.scrufflet.romantism.entity;

import com.scrufflet.planned.PCamera;
import com.scrufflet.planned.PColor;
import com.scrufflet.planned.PRenderable;
import com.scrufflet.planned.shape.PCircle;
import com.scrufflet.romantism.Workspace;

public class EntityPlanet extends Entity {
	
	private int offsetSun;
	
	public EntityPlanet(PColor color, int size, int offsetSun) {
		
		super(Workspace.getRealWidth() / 2 - size / 2 - offsetSun, Workspace.getRealHeight() / 2 - size / 2, size, size);
		
		this.offsetSun = offsetSun;
		
		init(color);
		
	}
	
	public void init(PColor color) {
		
		PCircle circle = new PCircle(getWidth() / 2 - 1, PCircle.CIRCLE_TYPE_FILLED);
		circle.render(this, null, color.getColor());
		
	}
	
	public void tick() {
		
		  // u*t/d % 360
		  double u = 360.0/1200.0;
		  double degrees = u * System.currentTimeMillis() / offsetSun % 360;
		  this.x = (int)(((offsetSun+10)) * Math.cos(Math.toRadians(degrees)) + Workspace.getRealWidth() / 2);
		  this.y = (int)(((offsetSun+10)) * Math.sin(Math.toRadians(degrees)) + Workspace.getRealHeight() / 2);
		
	}
	
	public void render(PRenderable renderable, PCamera camera) {
		
		super.render(renderable, camera);
		
	}
	
}
