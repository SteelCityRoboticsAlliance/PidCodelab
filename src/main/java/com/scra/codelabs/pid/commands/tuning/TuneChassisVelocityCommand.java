package com.scra.codelabs.pid.commands.tuning;

import com.scra.codelabs.pid.subsystems.ChassisSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;
import com.gos.lib.properties.GosDoubleProperty;

public class TuneChassisVelocityCommand extends CommandBase {
    private static final GosDoubleProperty CHASSIS_VELOCITY = new GosDoubleProperty(false, "Tuning.Chassis.Velocity", 0);

    private final ChassisSubsystem m_chassisSubsystem;

    public TuneChassisVelocityCommand(ChassisSubsystem chassisSubsystem) {
        m_chassisSubsystem = chassisSubsystem;
        addRequirements(this.m_chassisSubsystem);
    }

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        m_chassisSubsystem.driveWithVelocity(CHASSIS_VELOCITY.getValue(), CHASSIS_VELOCITY.getValue());
    }
}
