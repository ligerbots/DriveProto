// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.


package org.usfirst.frc2877.DriveProto1.subsystems;

import org.usfirst.frc2877.DriveProto1.RobotMap;
import org.usfirst.frc2877.DriveProto1.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.can.*;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class DriveTrain extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    CANJaguar leftFrontDrive = RobotMap.driveTrainLeftFrontDrive;
    CANJaguar leftRearDrive = RobotMap.driveTrainLeftRearDrive;
    CANJaguar rightFrontDrive = RobotMap.driveTrainRightFrontDrive;
    CANJaguar rightRearDrive = RobotMap.driveTrainRightRearDrive;
    RobotDrive robotDrive = RobotMap.driveTrainRobotDrive;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    double vC = 1.0;

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public DriveTrain() {
        System.out.println("driveTrain constructed.");
       
    }
    
    public void drive(double x, double y) {
        if (robotDrive != null) {
            //this is reversed because of the default variable names, which are moveValue and rotateValue, IN THAT ORDER.
            //since the Y controls going forward, we put Y first. If when you press up the robot turns, undo this.
            robotDrive.arcadeDrive(vC*y, vC*x);
        }
    }
    
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

