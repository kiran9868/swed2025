package fuas.swed2025.exercises;

/**
 * Represents the frequency at which a subscribed website should be checked for updates.
 * Each enum constant defines a specific time interval in milliseconds.
 *
 * @author Kiran Regmi
 * @version 1.0
 *
 */

public enum Frequency {
	SEC(5_000L),
    HOURLY(3600_000L),
    DAILY(86_400_000L),
    WEEKLY(604_800_000L),
    MONTHLY(2_592_000_000L),
    YEARLY(31_536_000_000L);

    private final long intervalMillis;

    Frequency(long intervalMillis) {
        this.intervalMillis = intervalMillis;
    }

    public long getIntervalMillis() {
        return intervalMillis;
    }
}

