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
package com.amazonaws.services.simpleworkflow.flow;

/**
 * Exception used to communicate failure of a timer.
 */
@SuppressWarnings("serial")
public abstract class TimerException extends DecisionException {

    private String timerId;
    
    private Object createTimerUserContext;
    
    public TimerException(String message) {
        super(message);
    }

    public TimerException(String message, Throwable cause) {
        super(message, cause);
    }

    public TimerException(String message, long eventId, String timerId, Object createTimerUserContext) {
        super(message, eventId);
        this.timerId = timerId;
        this.createTimerUserContext = createTimerUserContext;
    }

    public String getTimerId() {
        return timerId;
    }
    
    public void setTimerId(String timerId) {
        this.timerId = timerId;
    }

    public Object getCreateTimerUserContext() {
        return createTimerUserContext;
    }
    
    public void setCreateTimerUserContext(Object createTimerUserContext) {
        this.createTimerUserContext = createTimerUserContext;
    }
    
}
