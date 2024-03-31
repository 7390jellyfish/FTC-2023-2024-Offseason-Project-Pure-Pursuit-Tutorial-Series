package treamcode;

import treamcode.OpMode;

import java.sql.Array;
import java.util.ArrayList;
import static treamcode.RobotMovement.followCurve;

public class MyOpMode extends OpMode {

    @Override
    public void init() {
        // Add initialization code here
        System.out.println("Initializing MyOpMode...");
    }

    @Override
    public void loop() {
        // Add main loop code here
        System.out.println("Initialized");
        ArrayList<CurvePoint> allPoints = new ArrayList<>();
        allPoints.add(new CurvePoint(0, 0, 1.0, 1.0, 50, Math.toRadians(50), 1.0 ));
        allPoints.add(new CurvePoint(180, 180, 1.0, 1.0, 50, Math.toRadians(50), 1.0 ));
        allPoints.add(new CurvePoint(220, 180, 1.0, 1.0, 50, Math.toRadians(50), 1.0 ));
        allPoints.add(new CurvePoint(280, 50, 1.0, 1.0, 50, Math.toRadians(50), 1.0 ));
        allPoints.add(new CurvePoint(180, 0, 1.0, 1.0, 50, Math.toRadians(50), 1.0 ));

        followCurve(allPoints,Math.toRadians(90));
    }

    public static void main(String[] args) {
        MyOpMode myOpMode = new MyOpMode();
        myOpMode.init();
        myOpMode.loop();
    }
}