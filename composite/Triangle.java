package com.designpattern.composite;

/**
 * Created by Eason Yang on 12/17/2015.
 */
public class Triangle implements Shape {
    @Override
	public void draw(String fillColor) {
		System.out.println("当前三角形颜色为："+fillColor);
	}
}
