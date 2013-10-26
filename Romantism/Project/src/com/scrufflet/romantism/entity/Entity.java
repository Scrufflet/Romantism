package com.scrufflet.romantism.entity;

import com.scrufflet.planned.PCamera;
import com.scrufflet.planned.PModel;
import com.scrufflet.planned.PRenderable;

public class Entity extends PModel {
	
	protected int x, y;
	
	public Entity(int x, int y, int width, int height) {
		
		super(width, height);
		this.x = x;
		this.y = y;
	
	}
	
	public void init() {
		
		
		
	}
	
	public void tick() {
		
		
		
	}
	
	public void render(PRenderable renderable, PCamera camera) {
		
		super.render(renderable, new PCamera(camera.getX() + x, camera.getY() + y));
		
	}
	
	public void setX(int x) {
		
		this.x = x;
		
	}
	
	public int getX() {
		
		return x;
		
	}
	
	public void setY(int y) {
		
		this.y = y;
		
	}
	
	public int getY() {
		
		return y;
		
	}
	
}
