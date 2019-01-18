package com.design_patterns.creational.prototype;

public interface Prototype extends Cloneable {
	public AccessControl clone() throws CloneNotSupportedException;
}
