/*
 * Copyright 2012-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.services.simpleworkflow.model.ScheduleLambdaFunctionFailedCause;

/**
 * Exception used to communicate that lambda function wasn't scheduled due to some
 * cause
 */
@SuppressWarnings("serial")
public class ScheduleLambdaFunctionFailedException extends LambdaFunctionException {

    private ScheduleLambdaFunctionFailedCause failureCause;

    public ScheduleLambdaFunctionFailedException(String message) {
        super(message);
    }

    public ScheduleLambdaFunctionFailedException(String message, Throwable cause) {
        super(message, cause);
    }

    public ScheduleLambdaFunctionFailedException(long eventId, String functionName, String functionId, String cause) {
        super(cause, eventId, functionName, functionId);
        failureCause = ScheduleLambdaFunctionFailedCause.fromValue(cause);
    }

    /**
     * @return enumeration that contains the cause of the failure
     */
    public ScheduleLambdaFunctionFailedCause getFailureCause() {
        return failureCause;
    }

    public void setFailureCause(ScheduleLambdaFunctionFailedCause failureCause) {
        this.failureCause = failureCause;
    }
}
