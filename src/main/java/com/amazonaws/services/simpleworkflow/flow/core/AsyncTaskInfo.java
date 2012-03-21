package com.amazonaws.services.simpleworkflow.flow.core;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class AsyncTaskInfo {

    private final StackTraceElement[] asyncStackTrace;

    private final boolean daemon;

    private final Promise<?>[] waitingFor;

    private final String name;

    public AsyncTaskInfo(String name, StackTraceElement[] asyncStackTrace, boolean daemon, Promise<?>[] waitFor) {
        this.name = name;
        this.asyncStackTrace = asyncStackTrace;
        this.daemon = daemon;
        this.waitingFor = waitFor;
    }

    public String getName() {
        return name;
    }

    public StackTraceElement[] getAsyncStackTrace() {
        return asyncStackTrace;
    }

    public boolean isDaemon() {
        return daemon;
    }

    public Promise<?>[] getWaitingFor() {
        return waitingFor;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        if (name != null) {
            result.append("\"");
            result.append(name);
            result.append("\"");
        }
        if (daemon) {
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append("daemon");
        }
        if (waitingFor != null) {
            Map<Integer, String> waitingOnArguments = new HashMap<Integer, String>();
            for (int i = 0; i < waitingFor.length; i++) {
                Promise<?> promise = waitingFor[i];
                if (promise != null && !promise.isReady()) {
                    if (promise instanceof AndPromise) {
                        AndPromise andPromise = (AndPromise) promise;
                        Promise<?>[] elements = andPromise.getValues();
                        StringBuilder description = new StringBuilder();
                        description.append("PromiseCollection[");
                        for (int j = 0; j < elements.length; j++) {
                            Promise<?> e = elements[j];
                            String d = e.getDescription();
                            if (d != null) {
                                description.append(j);
                                description.append(":\"");
                                description.append(d);
                                description.append("\"");
                            }
                        }
                        description.append("]");
                        waitingOnArguments.put(i + 1, description.toString());
                    }
                    else {
                        waitingOnArguments.put(i + 1, promise.getDescription());
                    }
                }
            }
            if (waitingOnArguments.size() > 0) {
                if (result.length() > 0) {
                    result.append(" ");
                }
                result.append("waiting on argument");
                if (waitingOnArguments.size() > 1) {
                    result.append("s");
                }
                result.append(" (starting from 1)");
                for (Entry<Integer, String> pair : waitingOnArguments.entrySet()) {
                    result.append(" ");
                    result.append(pair.getKey());
                    String description = pair.getValue();
                    if (description != null) {
                        result.append(":\"");
                        result.append(description);
                        result.append("\"");
                    }
                }
            }
        }
        if (result.length() > 0) {
            result.append("\n");
        }
        if (asyncStackTrace != null) {
            for (int i = 0; i < asyncStackTrace.length; i++) {
                result.append("\tat ");
                result.append(asyncStackTrace[i]);
                result.append("\n");
            }
        }
        else {
            result.append("Async Trace is Disabled.");
        }
        return result.toString();
    }
}
