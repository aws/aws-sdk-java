/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.flow.examples.periodicworkflow;

public class PeriodicWorkflowOptions {

    private long executionPeriodSeconds;

    private boolean waitForActivityCompletion;

    private long continueAsNewAfterSeconds;

    private long completeAfterSeconds;

    public long getExecutionPeriodSeconds() {
        return executionPeriodSeconds;
    }

    /**
     * Interval between activity executions
     */
    public void setExecutionPeriodSeconds(long executionPeriodSeconds) {
        this.executionPeriodSeconds = executionPeriodSeconds;
    }

    public boolean isWaitForActivityCompletion() {
        return waitForActivityCompletion;
    }

    /**
     * Should the new activity execution be delayed until the previous one
     * completion?
     */
    public void setWaitForActivityCompletion(boolean waitForActivityCompletion) {
        this.waitForActivityCompletion = waitForActivityCompletion;
    }

    public long getContinueAsNewAfterSeconds() {
        return continueAsNewAfterSeconds;
    }

    /**
     * how frequently the new run of the workflow (whith an empty history)
     * should be created.
     */
    public void setContinueAsNewAfterSeconds(long continueAsNewAfterSeconds) {
        this.continueAsNewAfterSeconds = continueAsNewAfterSeconds;
    }

    public long getCompleteAfterSeconds() {
        return completeAfterSeconds;
    }

    /**
     * Complete the workflow without creating a new run after the specified
     * interval.
     */
    public void setCompleteAfterSeconds(long completeAfterSeconds) {
        this.completeAfterSeconds = completeAfterSeconds;
    }

}
