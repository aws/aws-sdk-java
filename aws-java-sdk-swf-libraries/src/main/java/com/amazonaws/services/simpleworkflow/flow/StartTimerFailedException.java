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
package com.amazonaws.services.simpleworkflow.flow;

import com.amazonaws.services.simpleworkflow.model.StartTimerFailedCause;

/**
 * Exception used to communicate that timer wasn't scheduled due to some cause
 */
@SuppressWarnings("serial")
public class StartTimerFailedException extends TimerException {

    private StartTimerFailedCause failureCause;

    public StartTimerFailedException(String message) {
        super(message);
    }

    public StartTimerFailedException(String message, Throwable cause) {
        super(message, cause);
    }

    public StartTimerFailedException(long eventId, String timerId, Object createTimerUserContext, String cause) {
        super(cause + " for timerId=\"" + timerId, eventId, timerId, createTimerUserContext);
        failureCause = StartTimerFailedCause.fromValue(cause);
    }

    /**
     * @return enumeration that contains the cause of the failure
     */
    public StartTimerFailedCause getFailureCause() {
        return failureCause;
    }

    public void setFailureCause(StartTimerFailedCause failureCause) {
        this.failureCause = failureCause;
    }

}
