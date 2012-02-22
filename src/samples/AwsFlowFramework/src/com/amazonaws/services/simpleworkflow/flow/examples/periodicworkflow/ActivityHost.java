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

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.flow.ActivityWorker;
import com.amazonaws.services.simpleworkflow.flow.examples.common.ConfigHelper;

/**
 * This is the process which hosts all Activities in this sample
 */
public class ActivityHost {    
    
    private static final String ACTIVITIES_TASK_LIST = "Periodic";

    public static void main(String[] args) throws Exception {
        ConfigHelper configHelper = ConfigHelper.createConfig();
        AmazonSimpleWorkflow swfService = configHelper.createSWFClient();
        String domain = configHelper.getDomain();

        final ActivityWorker worker = new ActivityWorker(swfService, domain, ACTIVITIES_TASK_LIST);

        // Create activity implementations
        PeriodicWorkflowActivities periodicActivitiesImpl = new PeriodicWorkflowActivitiesImpl();
        worker.addActivitiesImplementation(periodicActivitiesImpl);

        worker.start();

        System.out.println("Activity Worker Started for Task List: " + worker.getTaskListToPoll());

        Runtime.getRuntime().addShutdownHook(new Thread() {

            public void run() {
                try {
                    worker.shutdownAndAwaitTermination(1, TimeUnit.MINUTES);
                    System.out.println("Activity Worker Exited.");
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        System.out.println("Please press any key to terminate service.");

        try {
            System.in.read();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.exit(0);

    }
 
}


