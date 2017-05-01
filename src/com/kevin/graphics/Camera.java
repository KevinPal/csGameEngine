package com.kevin.graphics;

public class Camera {
	
	private Matrix transform;
	private Matrix invTransform;
	private Vector pos;
	
	public Camera(Matrix transform) {
		this.transform = transform;
		pos = new Vector(0, 0, 0);
		pos = pos.muliply(transform);
		invTransform = transform.inverse();
	}
	
	public Vector getPos() {
		return pos;
	}

	public void Transform(Matrix t) {
		transform = transform.mul(t);
		invTransform = transform.inverse();
	}
	
	public Matrix getTransform() {
		return transform;
	}
	public void setTransform(Matrix transform) {
		this.transform = transform;
	}
	public Matrix getInvTransform() {
		return invTransform;
	}
	public void setInvTransform(Matrix invTransform) {
		this.invTransform = invTransform;
	}
	
	
	

}
