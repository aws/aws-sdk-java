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
package com.amazonaws.services.simpleworkflow.flow.examples.fileprocessing;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.flow.ActivityWorker;
import com.amazonaws.services.simpleworkflow.flow.examples.common.ConfigHelper;

/**
 * This is the process which hosts all Activities in this sample
 */
public class ActivityHost {    

    private static final String ACTIVITIES_TASK_LIST = "FileProcessing";

    public static void main(String[] args) throws Exception {
        ConfigHelper configHelper = ConfigHelper.createConfig();
        AmazonSimpleWorkflow swfService = configHelper.createSWFClient();
        AmazonS3 s3Client = configHelper.createS3Client();
        String domain = configHelper.getDomain();

        String localFolder = configHelper.getValueFromConfig(FileProcessingConfigKeys.ACTIVITY_WORKER_LOCALFOLDER);
        
        // Start worker to poll the common task list
        final ActivityWorker workerForCommonTaskList = new ActivityWorker(swfService, domain, ACTIVITIES_TASK_LIST);
        SimpleStoreActivitiesS3Impl storeActivityImpl = new SimpleStoreActivitiesS3Impl(s3Client, localFolder, getHostName());
        workerForCommonTaskList.addActivitiesImplementation(storeActivityImpl);
        workerForCommonTaskList.start();
        System.out.println("Host Service Started for Task List: " + ACTIVITIES_TASK_LIST);        
        
        // Start worker to poll the host specific task list
        final ActivityWorker workerForHostSpecificTaskList =  new ActivityWorker(swfService, domain, getHostName());
        workerForHostSpecificTaskList.addActivitiesImplementation(storeActivityImpl);
        FileProcessingActivitiesZipImpl processorActivityImpl = new FileProcessingActivitiesZipImpl(localFolder);
        workerForHostSpecificTaskList.addActivitiesImplementation(processorActivityImpl);
        workerForHostSpecificTaskList.start();
        System.out.println("Worker Started for Activity Task List: " + getHostName());      

        Runtime.getRuntime().addShutdownHook(new Thread() {

            public void run() {
                try {
                    workerForCommonTaskList.shutdown();
                    workerForHostSpecificTaskList.shutdown();
                    workerForCommonTaskList.awaitTermination(1, TimeUnit.MINUTES);
                    workerForHostSpecificTaskList.awaitTermination(1, TimeUnit.MINUTES);
                    System.out.println("Activity Workers Exited.");
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

    static String getHostName() {
        try {
            InetAddress addr = InetAddress.getLocalHost();
            return addr.getHostName();
        }
        catch (UnknownHostException e) {
            throw new Error(e);
        }
    }

}
