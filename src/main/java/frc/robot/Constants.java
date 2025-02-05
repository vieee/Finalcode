// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean
 * constants. This class should not be used for any other purpose. All constants
 * should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the
 * constants are needed, to reduce verbosity.
 * 
 */
public final class Constants {

    public static final double intakeSpeedDeadband = 0.1;
    public static final double intakeSpeedMax = -0.4;
    public static double shooterspeedmax = -0.4;

    public static double shooterDirectSpeed = 0.25;
    public static double shooterFarawaySpeed = 0.35;
    public static boolean changeShooterSpeeds = false;

    public static final double shooterSpeedDeadband = 0.1;

    public static final int intakeButton_JoyDriving_4 = 4;
    public static final int indexingButton_JoyDriving_3 = 3;
    public static final int shootingButton_JoyDriving_2 = 2;
    public static final int shootingFarawayButton_JoyDriving_1 = 1;

    public static final double indexingSpeedDeadband = 0.05;
    public static final double indexingSpeedMax = 0.15;

}
