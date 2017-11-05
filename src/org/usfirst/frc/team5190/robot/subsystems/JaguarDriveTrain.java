package org.usfirst.frc.team5190.robot.subsystems;

import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team5190.robot.Robot;

import static org.usfirst.frc.team5190.robot.RobotMap.*;

/**
 * Class for testing purposes.
 */

public class JaguarDriveTrain extends DriveTrain
{
    RobotDrive robotDrive;

    public JaguarDriveTrain()
    {
        robotDrive = new RobotDrive(jFrontLeft, jRearLeft, jFrontRight, jRearRight);
        gyro = new AHRS(I2C.Port.kMXP);
    }

    @Override
    public void initDefaultCommand()
    {
        super.drive();
    }
}