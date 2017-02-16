package org.usfirst.frc4089.StealthM2017;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class Constants {
	public static final boolean driveMotorSafety = true;
	public static final double driveMotorExpiration = 0.1;
	public static final double driveMotorSensitivity = 0.5;
	public static final double driveMotorMaxOutput = 1.0;
	
	public static final double driveFWPow = 1.0;
	public static final double driveFWTurn = 0.0;
	public static final double driveLTPow = 1.0;
	public static final double driveLTTurn = -90.0;
	public static final double driveRTPow = 1.0;
	public static final double driveRTTurn = 90.0;
	public static final double driveBWPow = 1.0;
	public static final double driveBWTurn = 180.0;
	
//CAN BUS ASSIGNMENT
	
	public static final int CANpowerDistributionPanel = 0;
	public static final int CANdriveMotorD1 = 1;
	public static final int CANdriveMotorD2 = 2;
	public static final int CANdriveMotorD3 = 3;
	public static final int CANdriveMotorD4 = 4;
	public static final int CANballCollectorMotorBC = 5;
	public static final int CANshooterMotorShoot = 6;   
	public static final int CANelevatorMotorElev = 7;
    
}
