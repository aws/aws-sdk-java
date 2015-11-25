package com.amazonaws.http.timers;

/**
 * Constants relevant for request timeout and client execution timeout tests
 */
public class TimeoutTestConstants {

    public static final int TEST_TIMEOUT = 25 * 1000;
    public static final int CLIENT_EXECUTION_TIMEOUT = 5 * 1000;
    public static final int SLOW_REQUEST_HANDLER_TIMEOUT = 100;

    /**
     * ScheduledThreadPoolExecutor isn't exact and can be delayed occasionally. For tests where we
     * are asserting that a certain timeout comes first (i.e. SocketTimeout is triggered before
     * Request timeout or Request Timeout is triggered before Client execution timeout) then we need
     * to add a comfortable margin to ensure tests don't fail.
     */
    public static final int PRECISION_MULTIPLIER = 5;
}
