package com.noahbres.meepmeep.roadrunner.trajectorysequence;

import com.acmerobotics.roadrunner.geometry.Vector2d;

public interface Builder {
    TrajectorySequenceBuilder splineTo(Vector2d endPosition, double endHeading);
}
