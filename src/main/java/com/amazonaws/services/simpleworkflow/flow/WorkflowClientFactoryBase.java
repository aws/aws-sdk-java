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

import com.amazonaws.services.simpleworkflow.flow.generic.GenericWorkflowClient;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;

public abstract class WorkflowClientFactoryBase<T> implements WorkflowClientFactory<T> {

    private GenericWorkflowClient genericClient;

    private DataConverter dataConverter;

    private StartWorkflowOptions startWorkflowOptions = new StartWorkflowOptions();

    private final DecisionContextProvider decisionContextProvider = new DecisionContextProviderImpl();

    public WorkflowClientFactoryBase() {
        this(null, null, null);
    }

    public WorkflowClientFactoryBase(StartWorkflowOptions startWorkflowOptions) {
        this(startWorkflowOptions, null, null);
    }

    public WorkflowClientFactoryBase(StartWorkflowOptions startWorkflowOptions, DataConverter dataConverter) {
        this(startWorkflowOptions, dataConverter, null);
    }

    public WorkflowClientFactoryBase(StartWorkflowOptions startWorkflowOptions, DataConverter dataConverter,
            GenericWorkflowClient genericClient) {
        this.startWorkflowOptions = startWorkflowOptions;
        if (dataConverter == null) {
            this.dataConverter = new JsonDataConverter();
        }
        else {
            this.dataConverter = dataConverter;
        }
        this.genericClient = genericClient;
    }

    @Override
    public GenericWorkflowClient getGenericClient() {
        return genericClient;
    }

    @Override
    public void setGenericClient(GenericWorkflowClient genericClient) {
        this.genericClient = genericClient;
    }

    @Override
    public DataConverter getDataConverter() {
        return dataConverter;
    }

    @Override
    public void setDataConverter(DataConverter dataConverter) {
        this.dataConverter = dataConverter;
    }

    @Override
    public StartWorkflowOptions getStartWorkflowOptions() {
        return startWorkflowOptions;
    }

    @Override
    public void setStartWorkflowOptions(StartWorkflowOptions startWorkflowOptions) {
        this.startWorkflowOptions = startWorkflowOptions;
    }

    @Override
    public T getClient() {
        if (genericClient == null) {
            genericClient = decisionContextProvider.getDecisionContext().getWorkflowClient();
        }
        String workflowId = genericClient.generateUniqueId();
        WorkflowExecution execution = new WorkflowExecution().withWorkflowId(workflowId);
        return getClient(execution, startWorkflowOptions, dataConverter);
    }

    @Override
    public T getClient(String workflowId) {
        if (workflowId == null || workflowId.isEmpty()) {
            throw new IllegalArgumentException("workflowId");
        }
        WorkflowExecution execution = new WorkflowExecution().withWorkflowId(workflowId);
        return getClient(execution, startWorkflowOptions, dataConverter);
    }

    @Override
    public T getClient(WorkflowExecution execution) {
        return getClient(execution, startWorkflowOptions, dataConverter);
    }

    @Override
    public T getClient(WorkflowExecution execution, StartWorkflowOptions options) {
        return getClient(execution, options, dataConverter);
    }

    @Override
    public T getClient(WorkflowExecution execution, StartWorkflowOptions options, DataConverter dataConverter) {
        if (genericClient == null) {
            genericClient = decisionContextProvider.getDecisionContext().getWorkflowClient();
        }
        return createClientInstance(execution, options, dataConverter, genericClient);
    }

    protected abstract T createClientInstance(WorkflowExecution execution, StartWorkflowOptions options,
            DataConverter dataConverter, GenericWorkflowClient genericClient);

}
