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
	public static final double elevMotorSpdOne = 1.0;
	public static final double elevMotorSpdTwo = 1.0;
	public static final double climbMotorSpdOne = 1.0;
	public static final double climbMotorSpdTwo = 1.0;
	public static final double minLowGoalServoPos = 0.0;
	public static final double maxLowGoalServoPos = 0.5;
	
	public static final double gyroSensitivity = 0.007;
	public static final double wheelDiameterIN = 6.0; //in
	public static final double wheelDiameterM = 0.1524; //mm
	public static final double distPP = Constants.wheelDiameterM*Math.PI;
			//(4.0/* in */ * Math.PI) / (360.0 * 12.0/* in/ft */));
	public static final double kTolerance = 0.1;
	public static double kP = -1.0 / 5.0;
	public static double kI = -1.0 / 5.0;
	public static double kD = -1.0 / 5.0;
	public static double defaultAutoDriveMaxSpeed = 0.5;
	public static double defaultAutoDriveDist = 10;
	
//CAN BUS ASSIGNMENT
	
	public static final int CANpowerDistributionPanel = 0;
	public static final int CANdriveMotorD1 = 1;
	public static final int CANdriveMotorD2 = 2;
	public static final int CANdriveMotorD3 = 3;
	public static final int CANdriveMotorD4 = 4;
	public static final int CANballCollectorMotorBC = 5;
	public static final int CANshooterMotorShoot = 6;   
	public static final int CANelevatorMotorOne= 7;
	public static final int CANelevatorMotorTwo= 8;
	public static final int CANclimbMotorOne= 9;
	public static final int CANclimbMotorTwo= 10;
}
