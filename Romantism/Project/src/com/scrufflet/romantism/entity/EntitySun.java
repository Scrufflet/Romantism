package com.scrufflet.romantism.entity;

import com.scrufflet.planned.PCamera;
import com.scrufflet.planned.PColor;
import com.scrufflet.planned.PRenderable;
import com.scrufflet.planned.shape.PCircle;
import com.scrufflet.romantism.Workspace;

public class EntitySun extends Entity {
	
	public EntitySun(int size) {
		
		super(Workspace.getRealWidth() / 2 - size / 2, Workspace.getRealHeight() / 2 - size / 2, size, size);
		
		init();
		
	}
	
	public void init() {
		
		double multiply = .15;
		PColor color = new PColor(255, 255, 0);
		PColor outside = new PColor((int) (color.getRGB()[0] * multiply), (int) (color.getRGB()[1] * multiply), (int) (color.getRGB()[2] * multiply));
		System.out.println(outside.getRGB()[0] + " : " + outside.getRGB()[1] + " : " + outside.getRGB()[2]);
		PColor increase = new PColor(0, 0, 0);
		int times = 10;
		
		for(int i = 0; i < times; i ++) {
			
			increase.setColor(outside.getRGB()[0] / times * i, outside.getRGB()[1] / times * i, outside.getRGB()[2] / times * i);
			PCircle circle = new PCircle(getWidth() / 2 - 1 - i, PCircle.CIRCLE_TYPE_FILLED);
			
			if(i == times - 1)
				circle.render(this, new PCamera(i, i), color.getColor());
			else
				circle.render(this, new PCamera(i, i), increase.getColor());
			
		}
		
	}
	
	public void tick() {
		
		
		
	}
	
	public void render(PRenderable renderable, PCamera camera) {
		
		super.render(renderable, camera);
		
	}
	
}
