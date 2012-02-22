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

import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.flow.examples.common.ConfigHelper;

public class WorkflowExecutionStarter {
    private static AmazonSimpleWorkflow swfService;
    private static String domain;
    
    public static void main(String[] args) throws Exception {

    	// Load configuration
    	ConfigHelper configHelper = ConfigHelper.createConfig();
        
        // Create the client for Simple Workflow Service
        swfService = configHelper.createSWFClient();
        domain = configHelper.getDomain();
        
        // Start Workflow instance
        int requestId = Integer.parseInt(configHelper.getValueFromConfig(BookingConfigKeys.WORKFLOW_INPUT_REQUESTID_KEY));
        int customerId = Integer.parseInt(configHelper.getValueFromConfig(BookingConfigKeys.WORKFLOW_INPUT_CUSTOMERID_KEY));
        
        BookingWorkflowClientExternalFactory clientFactory = new BookingWorkflowClientExternalFactoryImpl(swfService, domain); 
        BookingWorkflowClientExternal workflow = clientFactory.getClient();
        workflow.makeBooking(requestId, customerId, true, true);
        
        System.exit(0);
    }    
}
