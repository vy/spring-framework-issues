package org.springframework.issues;


public class A implements IA {

	@SuppressWarnings("unused")
	private IC c;
	@SuppressWarnings("unused")
	private ICWithAutoWired cWithAutoWired;

	public void setC( IC c ) {
		this.c = c;
	}

	public void setcWithAutoWired( ICWithAutoWired cWithAutoWired ) {
		this.cWithAutoWired = cWithAutoWired;
	}
}
