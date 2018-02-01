package org.firstinspires.ftc.teamcode.TeleOp;

/**
 * This is an area you can add all your TeleOp constants for example the closed position of a certain servo etc.
 */
public interface Constants {
    int LIFT_MAX_ROTATIONS = 10;
    int TICKS_PER_ROTATION = 1120;
    int LIFT_MIN = 0,
        LIFT_MAX = LIFT_MAX_ROTATIONS * TICKS_PER_ROTATION;
    String INIT_MESSAGE = ">>> Press Play to Start.";
    double STONE_PUSHER_DOWN = 0,
           STONE_PUSHER_UP = 0.7;
    double GLYPH_TOP_CLOSED = 1,
           GLYPH_TOP_OPENED = 0,
           GLYPH_BOTTOM_CLOSED = .55,
           GLYPH_BOTTOM_INTAKE = .6,
           GLYPH_BOTTOM_OPENED = 1;
    double FLIPPER_OUT = 0,
           FLIPPER_IN = 1;
    double INTAKE = 1,
           OUTAKE = -1;
    double LIFT_DOWN = -1,
           LIFT_UP = 1;
    double JEWEL_BLUE_IN = 0.33,
           JEWEL_BLUE_OUT = .85,
           JEWEL_BLUE_HOVER = JEWEL_BLUE_OUT - .2,
           JEWEL_RED_IN = 0.39,
           JEWEL_RED_OUT = .94,
           JEWEL_RED_HOVER = JEWEL_RED_OUT - .0125;
    double CLAW_CLOSED = 0,
           CLAW_OPENED = 1;
}
