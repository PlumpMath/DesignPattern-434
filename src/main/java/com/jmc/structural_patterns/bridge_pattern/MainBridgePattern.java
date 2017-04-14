package com.jmc.structural_patterns.bridge_pattern;

import com.jmc.structural_patterns.bridge_pattern.bridge.Shape;
import com.jmc.structural_patterns.bridge_pattern.objects.BlackPrinter;
import com.jmc.structural_patterns.bridge_pattern.objects.Circle;
import com.jmc.structural_patterns.bridge_pattern.objects.ColorPrinter;

public class MainBridgePattern {
	
	public static void startBridgePattern(){
		
		Shape redCircle = new Circle(100,100, 10, new ColorPrinter());
		Shape blackCircle = new Circle(100,100, 10, new BlackPrinter());
		
		redCircle.draw();
		blackCircle.draw();
	}

}
