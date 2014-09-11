/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.flow.test;

import java.util.PriorityQueue;

import com.amazonaws.services.simpleworkflow.flow.WorkflowClock;
import com.amazonaws.services.simpleworkflow.flow.core.ExternalTask;
import com.amazonaws.services.simpleworkflow.flow.core.ExternalTaskCancellationHandler;
import com.amazonaws.services.simpleworkflow.flow.core.ExternalTaskCompletionHandle;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.core.Settable;
import com.amazonaws.services.simpleworkflow.flow.core.Task;

public class TestWorkflowClock implements WorkflowClock {

    private static final int SECOND = 1000;

    private static class TimerInfo<T> implements Comparable<TimerInfo<T>> {

        final Long fireTime;

        final Settable<T> timerResult = new Settable<T>();

        final T context;

        private Settable<ExternalTaskCompletionHandle> handle = new Settable<ExternalTaskCompletionHandle>();

        public TimerInfo(long fireTime, T context) {
            this.fireTime = fireTime;
            this.context = context;
        }

        public void fire() {
            timerResult.set(context);
            if (handle.isReady()) {
                handle.get().complete();
            }
            else {
                new Task(handle) {

                    @Override
                    protected void doExecute() throws Throwable {
                        handle.get().complete();
                    }

                };
            }
        }

        public Promise<T> getResult() {
            return timerResult;
        }

        @Override
        public int compareTo(TimerInfo<T> o) {
            return fireTime.compareTo(o.fireTime);
        }

        public void cancel() {
            handle.get().complete();
        }

        public long getFireTime() {
            return fireTime;
        }

        public void setCompletionHandle(ExternalTaskCompletionHandle handle) {
            this.handle.set(handle);
        }
        
        public void setResultDescription(String description) {
            timerResult.setDescription(description);
        }
    }

    private long clockTime = 0L;

    private PriorityQueue<TimerInfo<?>> timers = new PriorityQueue<TimerInfo<?>>();

    @Override
    public long currentTimeMillis() {
        return clockTime;
    }

    public void setCurrentTimeMillis(long timeMillis) {
        clockTime = timeMillis;
    }

    @Override
    public boolean isReplaying() {
        // Unit test never replays
        return false;
    }

    @Override
    public Promise<Void> createTimer(long delaySeconds) {
        return createTimer(delaySeconds, null);
    }

    @Override
    public <T> Promise<T> createTimer(final long delaySeconds, final T context) {
        if (delaySeconds < 0) {
            throw new IllegalArgumentException("negative delaySeconds");
        }
        if (delaySeconds == 0) {
            return Promise.asPromise(context);
        }
        long fireTime = clockTime + delaySeconds * 1000;
        final TimerInfo<T> timer = new TimerInfo<T>(fireTime, context);
        String timerName = "delay=" + delaySeconds;
        timer.setResultDescription("createTimer " + timerName);
        timers.add(timer);
        new ExternalTask() {

            @Override
            protected ExternalTaskCancellationHandler doExecute(ExternalTaskCompletionHandle handle) throws Throwable {
                timer.setCompletionHandle(handle);
                return new ExternalTaskCancellationHandler() {

                    @Override
                    public void handleCancellation(Throwable e) {
                        timers.remove(timer);
                        timer.cancel();
                    }
                };
            }
        }.setName(timerName);
        return timer.getResult();
    }

    public Long fireTimers() {
        while (true) {
            TimerInfo<?> timer = timers.peek();
            if (timer == null) {
                return null;
            }
            long timerTime = timer.getFireTime();
            if (timerTime > clockTime) {
                return timerTime - clockTime;
            }
            timers.poll();
            timer.fire();
        }
    }

    public void advanceSeconds(long seconds) {
        advanceMilliseconds(seconds * SECOND);
    }

    public void advanceMilliseconds(long milliseconds) {
        clockTime += milliseconds;
        while (true) {
            TimerInfo<?> timer = timers.peek();
            if (timer == null) {
                break;
            }
            long timerTime = timer.getFireTime();
            if (timerTime > clockTime) {
                break;
            }
            timer.fire();
            timers.poll();
        }
    }
}
