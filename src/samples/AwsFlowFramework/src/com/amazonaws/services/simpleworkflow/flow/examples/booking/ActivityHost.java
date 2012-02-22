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
package com.amazonaws.services.simpleworkflow.flow.examples.booking;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;

import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.flow.ActivityWorker;
import com.amazonaws.services.simpleworkflow.flow.examples.common.ConfigHelper;

/**
 * This is the process which hosts all Activities in this sample
 */
public class ActivityHost {    
    private static AmazonSimpleWorkflow swfService;
    private static String domain;
    private static long domainRetentionPeriodInDays;
    private static ActivityWorker worker;
    private static ActivityHost activityWorker;

    // ActivityWorker Factory method
    public synchronized static ActivityHost getActivityHost() {
        if (activityWorker == null) {
            activityWorker = new ActivityHost();
        }
        return activityWorker;
    }

    public static void main(String[] args) throws Exception {
    	// load configuration
    	ConfigHelper configHelper = loadConfig();
    	
    	// Start Activity Worker
        getActivityHost().startWorker(configHelper);
                        
        // Add a Shutdown hook to close ActivityWorker
        addShutDownHook();

        System.out.println("Please press any key to terminate service.");

        try {
            System.in.read();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        System.exit(0);

    }
    
    private void startWorker(ConfigHelper configHelper) throws Exception {    	
    	// Create activity implementations
    	BookingActivities bookingActivitiesImpl = new BookingActivitiesImpl();
    	
    	// Start worker to poll the common task list
    	String taskList = configHelper.getValueFromConfig(BookingConfigKeys.ACTIVITY_WORKER_TASKLIST);
        worker = new ActivityWorker(swfService, domain, taskList);
        worker.setDomainRetentionPeriodInDays(domainRetentionPeriodInDays);
        worker.setRegisterDomain(true);
    	worker.addActivitiesImplementation(bookingActivitiesImpl);
    	worker.start();
        System.out.println("Worker Started for Activity Task List: " + taskList);    	
	}

    private void stopWorker() throws InterruptedException {
        System.out.println("Stopping Worker...");
        worker.shutdownAndAwaitTermination(10, TimeUnit.SECONDS);
        System.out.println("Worker Stopped...");
    }
    
    
    static ConfigHelper loadConfig() throws IllegalArgumentException, IOException{
       	ConfigHelper configHelper = ConfigHelper.createConfig();
        swfService = configHelper.createSWFClient();
        domain = configHelper.getDomain();
        domainRetentionPeriodInDays = configHelper.getDomainRetentionPeriodInDays();
        
        return configHelper;
    }
    
    static void addShutDownHook(){
    	  Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {

              public void run() {
                  try {
                      getActivityHost().stopWorker();
                  }
                  catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
          }));    	
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
