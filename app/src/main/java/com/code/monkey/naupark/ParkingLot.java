package com.code.monkey.naupark;

/**
 * Encapsulates information needed to define a ParkingLot.
 * A parking lot has informatino about what times it becomes freely
 * available.
 * e.g. after 4:30PM on weekdays, or at any time during the weekends.
 */
abstract public class ParkingLot
{
    enum ParkingMode
    {
        NO_PERMIT_REQUIRED,
        EMPLOYEE_ONLY,
        ONLY_ON_WEEKDAYS, // some lots are open Saturday and Sunday
        NOT_ON_WEEKEND, // not all lots are open Saturday and Sunday
        ALWAYS, // lot does not require a permit
        PAY_TO_PARK
    }

    // Employee, north commuter, etc...
    String type;
    ParkingMode mode;
}
