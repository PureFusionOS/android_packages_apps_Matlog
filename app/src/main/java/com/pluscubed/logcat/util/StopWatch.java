package com.pluscubed.logcat.util;

public class StopWatch {

    private long startTime;
    private String name;

    public StopWatch() {
        if (UtilLogger.DEBUG_MODE) {
            this.name = "removeFirst()";
            this.startTime = System.currentTimeMillis();
        }
    }

    public void log(UtilLogger log) {
        if (UtilLogger.DEBUG_MODE) {
            log.d("%s took %d ms", name, (System.currentTimeMillis() - startTime));
        }
    }
}
