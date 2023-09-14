package ru.kk.task6week.service;

public class WeekendCheck {
    private enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void dayofweek() {
        DayOfWeek day = DayOfWeek.SATURDAY;
        weekendcheck(day);
    }

    private static void weekendcheck(DayOfWeek day) {
        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> {
                System.out.println(day.name() + " is a weekday.");
                System.out.println("_____________________ ");
            }
            case SATURDAY, SUNDAY -> {
                System.out.println(day.name() + " is a weekend.");
                System.out.println("_____________________ ");
            }
        }
    }
}

