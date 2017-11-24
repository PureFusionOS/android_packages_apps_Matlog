package com.pluscubed.logcat.reader;


abstract class AbsLogcatReader implements LogcatReader {

    boolean recordingMode;

    AbsLogcatReader(boolean recordingMode) {
        this.recordingMode = recordingMode;
    }

    public boolean isRecordingMode() {
        return recordingMode;
    }
}
