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
 * Exception that is thrown from generic workflow implementation to indicate
 * that workflow execution should be failed with the given reason and details.
 */
@SuppressWarnings("serial")
public class WorkflowException extends Exception {

    private final String details;

    public WorkflowException(String reason, String details) {
        super(reason);
        this.details = details;
    }

    public String getReason() {
        return getMessage();
    }

    public String getDetails() {
        return details;
    }

}
