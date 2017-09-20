package org.usfirst.frc.team2643.robot;

import edu.wpi.first.wpilibj.networktables.NetworkTable;

public class TalkToPI 
{
	public static NetworkTable table = NetworkTable.getTable("Test");
	public static NetworkTable table1 = NetworkTable.getTable("Vision");

	public static double testMet()
	{
		return table1.getNumber("Hello", 0.0);
	}
	
	public static void placeVal(double val)
	{
		table.putNumber("Returned Val", val);
	}
}
