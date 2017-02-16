// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4089.StealthM2017;



// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;

import edu.wpi.first.wpilibj.Ultrasonic;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import com.ctre.CANTalon;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static RobotDrive driveRobotDrive41;
    
    public static Encoder shooterEncoderShoot;
    
    public static Ultrasonic sensorsSonic1;
    public static AnalogGyro sensorsAnalogGyro1;
    public static Encoder utilsEncoderDrive1;
    public static Encoder utilsEncoderDrive2;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static CANTalon driveMotorD1;
    public static CANTalon driveMotorD2;
    public static CANTalon driveMotorD3;
    public static CANTalon driveMotorD4;
    public static CANTalon ballCollectorMotorBC;
    public static CANTalon shooterMotorShoot;
    public static CANTalon elevatorMotorElev;
    
    
    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveMotorD1 = new CANTalon(0);
        LiveWindow.addActuator("Drive", "MotorD1", (CANTalon) driveMotorD1);
        
        driveMotorD2 = new CANTalon(1);
        LiveWindow.addActuator("Drive", "MotorD2", (CANTalon) driveMotorD2);
        
        driveMotorD3 = new CANTalon(2);
        LiveWindow.addActuator("Drive", "MotorD3", (CANTalon) driveMotorD3);
        
        driveMotorD4 = new CANTalon(3);
        LiveWindow.addActuator("Drive", "MotorD4", (CANTalon) driveMotorD4);
        
        driveRobotDrive41 = new RobotDrive(driveMotorD1, driveMotorD2,
              driveMotorD3, driveMotorD4);
        
        driveRobotDrive41.setSafetyEnabled(true);
        driveRobotDrive41.setExpiration(0.1);
        driveRobotDrive41.setSensitivity(0.5);
        driveRobotDrive41.setMaxOutput(1.0);
        driveRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
        driveRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        ballCollectorMotorBC = new CANTalon(4);
        LiveWindow.addActuator("BallCollector", "MotorBC", (CANTalon) ballCollectorMotorBC);
        
        shooterMotorShoot = new CANTalon(5);
        LiveWindow.addActuator("Shooter", "MotorShoot", (CANTalon) shooterMotorShoot);
        
        shooterEncoderShoot = new Encoder(0, 1, false, EncodingType.k4X);
        LiveWindow.addSensor("Shooter", "EncoderShoot", shooterEncoderShoot);
        shooterEncoderShoot.setDistancePerPulse(1.0);
        shooterEncoderShoot.setPIDSourceType(PIDSourceType.kRate);
        elevatorMotorElev = new CANTalon(6);
        LiveWindow.addActuator("Elevator", "MotorElev", (CANTalon) elevatorMotorElev);
        
        sensorsSonic1 = new Ultrasonic(2, 3);
        LiveWindow.addSensor("Sensors", "Sonic1", sensorsSonic1);
        
        sensorsAnalogGyro1 = new AnalogGyro(0);
        LiveWindow.addSensor("Sensors", "AnalogGyro 1", sensorsAnalogGyro1);
        sensorsAnalogGyro1.setSensitivity(0.007);
        utilsEncoderDrive1 = new Encoder(4, 5, false, EncodingType.k4X);
        LiveWindow.addSensor("Utils", "EncoderDrive1", utilsEncoderDrive1);
        utilsEncoderDrive1.setDistancePerPulse(1.0);
        utilsEncoderDrive1.setPIDSourceType(PIDSourceType.kRate);
        utilsEncoderDrive2 = new Encoder(6, 7, false, EncodingType.k4X);
        LiveWindow.addSensor("Utils", "EncoderDrive2", utilsEncoderDrive2);
        utilsEncoderDrive2.setDistancePerPulse(1.0);
        utilsEncoderDrive2.setPIDSourceType(PIDSourceType.kRate);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
