package fuas.swed2025.exercises;

public enum Frequency {
    HOURLY(3600_000L),
    DAILY(86_400_000L),
    WEEKLY(604_800_000L),
    MONTHLY(2_592_000_000L),   // 30 days approx
    YEARLY(31_536_000_000L);   // 365 days

    private final long intervalMillis;

    Frequency(long intervalMillis) {
        this.intervalMillis = intervalMillis;
    }

    public long getIntervalMillis() {
        return intervalMillis;
    }
}

