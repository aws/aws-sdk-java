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
package com.amazonaws.services.simpleworkflow.flow.worker;

public class ActivityTypeExecutionOptions {
	private boolean manualActivityCompletion;
	private long respondTaskCompletedRetryInitialInterval = 1000;
    private long respondTaskCompletedRetryMaximumInterval = 60000;
    private int respondTaskCompletedMaximumRetries = 5;
    private double respondTaskCompletedBackoffCoefficient = 2;
    private boolean doNotRetryTaskFailed;
    
    public double getRespondTaskCompletedBackoffCoefficient() {
        return respondTaskCompletedBackoffCoefficient;
    }
    
    public void setRespondTaskCompletedBackoffCoefficient(double respondTaskCompletedBackoffCoefficient) {
        this.respondTaskCompletedBackoffCoefficient = respondTaskCompletedBackoffCoefficient;
    }

    public boolean isManualActivityCompletion() {
		return manualActivityCompletion;
	}

	public void setManualActivityCompletion(boolean flag) {
		this.manualActivityCompletion = flag;
	}
	
	public long getRespondTaskCompletedRetryInitialInterval() {
        return respondTaskCompletedRetryInitialInterval;
    }
    
    public void setRespondTaskCompletedRetryInitialInterval(long respondTaskCompletedRetryInitialInterval) {
        this.respondTaskCompletedRetryInitialInterval = respondTaskCompletedRetryInitialInterval;
    }
    
    public long getRespondTaskCompletedRetryMaximumInterval() {
        return respondTaskCompletedRetryMaximumInterval;
    }

    public void setRespondTaskCompletedRetryMaximumInterval(long respondTaskCompletedRetryMaximumInterval) {
        this.respondTaskCompletedRetryMaximumInterval = respondTaskCompletedRetryMaximumInterval;
    }

    public int getRespondTaskCompletedMaximumRetries() {
        return respondTaskCompletedMaximumRetries;
    }

    public void setRespondTaskCompletedMaximumRetries(int respondTaskCompletedMaximumRetries) {
        this.respondTaskCompletedMaximumRetries = respondTaskCompletedMaximumRetries;
    }
	
    public boolean isDoNotRetryTaskFailed() {
        return doNotRetryTaskFailed;
    }
    
    public void setDoNotRetryTaskFailed(boolean doNotRetryTaskFailed) {
        this.doNotRetryTaskFailed = doNotRetryTaskFailed;
    }

    @Override
    public String toString() {
        return "ActivityTypeExecutionOptions [isAsynchronous=" + manualActivityCompletion + "]";
    }
}
