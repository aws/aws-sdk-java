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

import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericWorkflowClientExternal;
import com.amazonaws.services.simpleworkflow.flow.worker.GenericWorkflowClientExternalImpl;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;

public abstract class WorkflowClientFactoryExternalBase<T> implements WorkflowClientFactoryExternal<T> {

    private GenericWorkflowClientExternal genericClient;

    private DataConverter dataConverter = new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter();

    private StartWorkflowOptions startWorkflowOptions = new StartWorkflowOptions();

    public WorkflowClientFactoryExternalBase(AmazonSimpleWorkflow service, String domain) {
        this(new GenericWorkflowClientExternalImpl(service, domain));
    }

    public WorkflowClientFactoryExternalBase() {
        this(null);
    }

    public WorkflowClientFactoryExternalBase(GenericWorkflowClientExternal genericClient) {
        this.genericClient = genericClient;
    }

    @Override
    public GenericWorkflowClientExternal getGenericClient() {
        return genericClient;
    }

    public void setGenericClient(GenericWorkflowClientExternal genericClient) {
        this.genericClient = genericClient;
    }

    @Override
    public DataConverter getDataConverter() {
        return dataConverter;
    }

    public void setDataConverter(DataConverter dataConverter) {
        this.dataConverter = dataConverter;
    }

    @Override
    public StartWorkflowOptions getStartWorkflowOptions() {
        return startWorkflowOptions;
    }

    public void setStartWorkflowOptions(StartWorkflowOptions startWorkflowOptions) {
        this.startWorkflowOptions = startWorkflowOptions;
    }

    @Override
    public T getClient() {
        String workflowId = genericClient.generateUniqueId();
        WorkflowExecution workflowExecution = new WorkflowExecution().withWorkflowId(workflowId);
        return getClient(workflowExecution, startWorkflowOptions, dataConverter, genericClient);
    }

    @Override
    public T getClient(String workflowId) {
        if (workflowId == null || workflowId.isEmpty()) {
            throw new IllegalArgumentException("workflowId");
        }
        WorkflowExecution workflowExecution = new WorkflowExecution().withWorkflowId(workflowId);
        return getClient(workflowExecution, startWorkflowOptions, dataConverter, genericClient);
    }

    @Override
    public T getClient(WorkflowExecution workflowExecution) {
        return getClient(workflowExecution, startWorkflowOptions, dataConverter, genericClient);
    }

    @Override
    public T getClient(WorkflowExecution workflowExecution, StartWorkflowOptions options) {
        return getClient(workflowExecution, options, dataConverter, genericClient);
    }

    @Override
    public T getClient(WorkflowExecution workflowExecution, StartWorkflowOptions options, DataConverter dataConverter) {
        return getClient(workflowExecution, options, dataConverter, genericClient);
    }

    @Override
    public T getClient(WorkflowExecution workflowExecution, StartWorkflowOptions options, DataConverter dataConverter,
            GenericWorkflowClientExternal genericClient) {
        if (genericClient == null) {
            throw new IllegalStateException("required property genericClient is null");
        }
        return createClientInstance(workflowExecution, options, dataConverter, genericClient);
    }

    protected abstract T createClientInstance(WorkflowExecution workflowExecution, StartWorkflowOptions options,
            DataConverter dataConverter, GenericWorkflowClientExternal genericClient);

}
