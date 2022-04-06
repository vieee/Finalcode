// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.IntakeSubsystem;

public class Intakejoycommand extends CommandBase {
  private IntakeSubsystem intakeSubsystem;
  private Supplier<Double> intakeSupplier;
  /** Creates a new Intakejoycommand. */
  public Intakejoycommand(IntakeSubsystem intakeSubsystem, Supplier<Double> intakeSupplier) {
    this.intakeSubsystem = intakeSubsystem;
    this.intakeSupplier = intakeSupplier;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(this.intakeSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double intakeValue = (Math.abs(this.intakeSupplier.get()) > Constants.intakeSpeedDeadband) ? this.intakeSupplier.get() : 0;

    this.intakeSubsystem.setIntakeOpeningSpeed(intakeValue);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}