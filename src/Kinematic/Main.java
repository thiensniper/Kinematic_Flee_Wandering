package Kinematic;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character ch = new Character();
		ch.setOrientation(0);
		ch.setPosition(new Vector2D(0, 0));
		ch.setRotation(0);
		ch.setVelocity(new Vector2D(0, 0));
		KinematicWandering w = new KinematicWandering(ch, 1, 2);
		KinematicOutput out = w.generateKinematicOutput();
		ch.update(out, 1);
		System.out.println(ch.toString());
		KinematicOutput out2 = w.generateKinematicOutput();
		ch.update(out2, 1);
		System.out.println(ch.toString());
		
		
	}

}
