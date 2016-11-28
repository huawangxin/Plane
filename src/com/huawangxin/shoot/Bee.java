package com.huawangxin.shoot;

import java.util.Random;

/** �۷� */
public class Bee extends FlyingObject implements Award {
	private int xSpeed = 1;// x�����ƶ��ٶ�
	private int ySpeed = 2;// y�����ƶ��ٶ�
	private int awardType;// ��������
	public Bee() {
		this.image = ShootGame.bee;
		width = image.getWidth();
		height = image.getHeight();
		y = -height;
		Random rand = new Random();
		x = rand.nextInt(ShootGame.WIDTH - width);
		// x=100;
		// y=200; 
		awardType =rand.nextInt(2); 
	} 
	public int getType() { 
		return awardType; 
		}
	public void step() {//��б�� 
		x += xSpeed; 
		y +=ySpeed; 
		if(x >ShootGame.WIDTH-width){
				xSpeed = -1;
		} 
		if(x < 0){
				xSpeed = 1; 
		} 
	} 
	public boolean outOfBounds() { 
			return y>ShootGame.HEIGHT; 
	}
}