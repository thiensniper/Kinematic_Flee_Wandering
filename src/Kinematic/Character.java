package Kinematic;

public class Character {
	private Vector2D position;
    private float orientation;
    private Vector2D velocity;
    private float rotation;

    public Character() {
    }

    public Character(Vector2D position, float orientation, Vector2D velocity, float rotation) {
        this.position = position;
        this.orientation = orientation;
        this.velocity = velocity;
        this.rotation = rotation;
    }

    public Vector2D getPosition() {
        return position;
    }

    public void setPosition(Vector2D position) {
        this.position = position;
    }

    public float getOrientation() {
        return orientation;
    }

    public void setOrientation(float orientation) {
        this.orientation = orientation;
    }

    public Vector2D getVelocity() {
        return velocity;
    }

    public void setVelocity(Vector2D velocity) {
        this.velocity = velocity;
    }

    public float getRotation() {
        return rotation;
    }

    public void setRotation(float rotation) {
        this.rotation = rotation;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        return "Character{" + "position=" + position + ", orientation=" + orientation + ", velocity=" + velocity + ", rotation=" + rotation + '}';
    }
    
    public void update(KinematicOutput kinematicOutput, float time) {
        this.velocity = kinematicOutput.getVelocity();
        this.rotation = kinematicOutput.getRotation();
        
        this.position = this.position.addVector2D(velocity.mulConstant(time));
        this.orientation = this.rotation * time;
    }
}
