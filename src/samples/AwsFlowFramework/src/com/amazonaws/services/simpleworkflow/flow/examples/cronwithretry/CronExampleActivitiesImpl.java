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
package com.amazonaws.services.simpleworkflow.flow.examples.cronwithretry;

import java.util.Random;

import com.amazonaws.services.simpleworkflow.flow.ActivityExecutionContext;
import com.amazonaws.services.simpleworkflow.flow.ActivityExecutionContextProvider;
import com.amazonaws.services.simpleworkflow.flow.ActivityExecutionContextProviderImpl;
import com.amazonaws.services.simpleworkflow.model.ActivityTask;

public class CronExampleActivitiesImpl implements CronWithRetryExampleActivities {

    final ActivityExecutionContextProvider contextProvider;

    public CronExampleActivitiesImpl() {
        this(new ActivityExecutionContextProviderImpl());
    }

    /**
     * Useful for unit testing activities.
     */
    public CronExampleActivitiesImpl(ActivityExecutionContextProvider contextProvider) {
        this.contextProvider = contextProvider;
    }

    /**
     * Fail in 20% of invocations to demonstrate retry logic
     */
    @Override
    public void doSomeWork(String parameter) {
        Random r = new Random();
        if (r.nextInt(100) < 20) {
            throw new RuntimeException("simulated exception to force retry");
        }
        ActivityExecutionContext context = contextProvider.getActivityExecutionContext();
        ActivityTask task = context.getTask();
        String taskid = task.getActivityId();
        System.out.println("Processed activity task with id: " + taskid);
    }

}
