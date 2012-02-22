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

import com.amazonaws.services.simpleworkflow.flow.ActivityExecutionContextProvider;
import com.amazonaws.services.simpleworkflow.flow.ActivityExecutionContextProviderImpl;

public class ErrorReportingActivitiesImpl implements ErrorReportingActivities {

    private final ActivityExecutionContextProvider contextProvider;
    
    public ErrorReportingActivitiesImpl() {
        this.contextProvider = new ActivityExecutionContextProviderImpl();
    }
    
    /**
     * For unit testing or IoC
     */
    public ErrorReportingActivitiesImpl(ActivityExecutionContextProvider contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override
    public void reportFailure(Throwable e) {
        String runId = contextProvider.getActivityExecutionContext().getTask().getWorkflowExecution().getRunId();
        System.err.println("Run Id: " + runId + ", Failure in periodic task:");
        e.printStackTrace();
    }

}
