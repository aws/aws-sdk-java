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
package com.amazonaws.services.simpleworkflow.flow.spring;


public class WorkflowScopeBeanNames {
    
    public static final String GENERIC_ACTIVITY_CLIENT = "genericActivityClient";
    
    public static final String GENERIC_WORKFLOW_CLIENT = "genericWorkflowClient";
    
    public static final String WORKFLOW_CLOCK = "workflowClock";
    
    public static final String WORKFLOW_CONTEXT = "workflowContext";
    
    public static final String DECISION_CONTEXT = "decisionContext";

    public static boolean isWorkflowScopeBeanName(String name) {
        if (GENERIC_ACTIVITY_CLIENT.equals(name)) {
            return true;
        } 
        if (GENERIC_WORKFLOW_CLIENT.equals(name)) {
            return true;
        } 
        if (WORKFLOW_CLOCK.equals(name)) {
            return true;
        } 
        if (WORKFLOW_CONTEXT.equals(name)) {
            return true;
        } 
        if (DECISION_CONTEXT.equals(name)) {
            return true;
        } 
        return false;
    }
}
