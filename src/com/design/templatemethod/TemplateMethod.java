package com.design.templatemethod;

/***
 * java.util.abstractlist; java.util.abstractset; java.util.abstactmap;
 * 
 * @author nkupegal
 *
 */
abstract class TemplateMethod {

	abstract public void buildPiller();

	abstract public void buildWindow();

	final void templateMethod() {
		buildFoundation();
		buildPiller();
		buildWall();
		buildWindow();
	}

	private final void buildFoundation() {
		System.out.println("build foundation");
	}

	private final void buildWall() {
		System.out.println("build foundation");
	}
}
