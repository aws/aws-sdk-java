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
package com.amazonaws.services.simpleworkflow.flow;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericWorkflowClient;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;
import com.amazonaws.services.simpleworkflow.model.WorkflowType;

public abstract class WorkflowClientBase implements WorkflowClient {

    protected final DynamicWorkflowClientImpl dynamicWorkflowClient;

    protected WorkflowClientBase(WorkflowExecution workflowExecution, WorkflowType workflowType, StartWorkflowOptions options,
            DataConverter dataConverter, GenericWorkflowClient genericClient) {
        dynamicWorkflowClient = new DynamicWorkflowClientImpl(workflowExecution, workflowType, options, dataConverter,
                genericClient);
    }

    @Override
    public DataConverter getDataConverter() {
        return dynamicWorkflowClient.getDataConverter();
    }

    @Override
    public StartWorkflowOptions getSchedulingOptions() {
        return dynamicWorkflowClient.getSchedulingOptions();
    }

    @Override
    public GenericWorkflowClient getGenericClient() {
        return dynamicWorkflowClient.getGenericClient();
    }

    @Override
    public Promise<String> getRunId() {
        return dynamicWorkflowClient.getRunId();
    }

    public WorkflowExecution getWorkflowExecution() {
        return dynamicWorkflowClient.getWorkflowExecution();
    }

    @Override
    public WorkflowType getWorkflowType() {
        return dynamicWorkflowClient.getWorkflowType();
    }

    public void requestCancelWorkflowExecution(Promise<?>... waitFor) {
        dynamicWorkflowClient.requestCancelWorkflowExecution(waitFor);
    }

    protected <T> Promise<T> startWorkflowExecution(Promise<Object>[] arguments, StartWorkflowOptions startOptionsOverride,
            Class<T> returnType, Promise<?>... waitFor) {
        return dynamicWorkflowClient.startWorkflowExecution(arguments, startOptionsOverride, returnType, waitFor);
    }

    protected <T> Promise<T> startWorkflowExecution(Object[] arguments, StartWorkflowOptions startOptionsOverride,
            Class<T> returnType, Promise<?>... waitFor) {
        return dynamicWorkflowClient.startWorkflowExecution(arguments, startOptionsOverride, returnType, waitFor);
    }

    protected void signalWorkflowExecution(String signalName, Object[] arguments, Promise<?>... waitFor) {
        dynamicWorkflowClient.signalWorkflowExecution(signalName, arguments, waitFor);
    }

}
