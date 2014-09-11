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

import com.amazonaws.services.simpleworkflow.flow.generic.ActivityImplementation;

/**
 * This exception is expected to be thrown from
 * {@link ActivityImplementation#execute(ActivityExecutionContext)}
 * as it contains details property in the format that the activity client code
 * in the decider understands.
 * <p>
 * It is not expected to be thrown by the application level code.
 * 
 * @author fateev
 */
@SuppressWarnings("serial")
public class ActivityFailureException extends RuntimeException {

    private String details;

    public ActivityFailureException(String reason) {
        super(reason);
    }
    
    /**
     * Construct exception with given arguments.
     * 
     * @param statusCode
     *            value of status code field
     * @param details
     *            application specific failure details
     */
    public ActivityFailureException(String reason, String details) {
        this(reason);
        this.details = details;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getReason() {
        return getMessage();
    }

    @Override
    public String toString() {
        return super.toString() + " : " + getDetails();
    }

}
