package com.scra.codelabs.pid.commands.tuning;

import com.scra.codelabs.pid.subsystems.ChassisSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;
import com.gos.lib.properties.PropertyManager;


public class FindChassisTurningCompensationCommand extends CommandBase {
    private static final PropertyManager.IProperty<Double> CHASSIS_SPEED = PropertyManager.createDoubleProperty(false, "Tuning.Chassis.TurningComp", 0);

    private final ChassisSubsystem m_chassisSubsystem;

    public FindChassisTurningCompensationCommand(ChassisSubsystem chassisSubsystem) {
        m_chassisSubsystem = chassisSubsystem;
        addRequirements(this.m_chassisSubsystem);
    }

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        m_chassisSubsystem.setSpeedAndSteer(0, CHASSIS_SPEED.getValue());
    }
}
