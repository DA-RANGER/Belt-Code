package org.usfirst.frc.team4068.robot.lib;

import edu.wpi.first.wpilibj.DoubleSolenoid;
/**
 * 
 * 
 * @author brandonpfoff
 *
 */
public class Belt {

	Motor beltMotor = References.MOTOR.BELT;
	
	
	public void run(double speed)
	{
		
		beltMotor.set(speed);
		
	}

	
	/**
	 *      ^
	 * Belt |
	 * 
	 * 
	 * This is the start of the pneumantics.
	 * 
	 * 
	 * Pneumatics |
	 *            v
	 **/
	
	
	DoubleSolenoid brakes = References.DIO.BRAKES;
	
	public enum Mode{
	    TELEOP(1),
	    AUTO(2),
	    TEST(3);

	    private int value;
	    private Mode(int value) {
	        this.value = value;
	    }

	    public int getValue() {
	        return value;
	    }
	}
	public void Brakes(Mode state)
	{
		
		switch(state.getValue())
		{
		
		case 1:
			brakes.set(DoubleSolenoid.Value.kForward);
			break;
		case -1:
			brakes.set(DoubleSolenoid.Value.kReverse);
			break;
		case 0:
			brakes.set(DoubleSolenoid.Value.kOff);
			break;
		default:
			break;
			
		
		}
		
	}
	
	
}
