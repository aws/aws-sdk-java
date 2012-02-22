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

import com.amazonaws.services.simpleworkflow.flow.generic.GenericWorkflowClientExternal;
import com.amazonaws.services.simpleworkflow.flow.generic.SignalExternalWorkflowParameters;
import com.amazonaws.services.simpleworkflow.flow.generic.StartWorkflowExecutionParameters;
import com.amazonaws.services.simpleworkflow.flow.generic.TerminateWorkflowExecutionParameters;
import com.amazonaws.services.simpleworkflow.model.ChildPolicy;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;
import com.amazonaws.services.simpleworkflow.model.WorkflowType;

public class DynamicWorkflowClientExternalImpl implements DynamicWorkflowClientExternal {

    protected DataConverter dataConverter;

    protected StartWorkflowOptions schedulingOptions;

    protected GenericWorkflowClientExternal genericClient;

    protected WorkflowExecution workflowExecution;

    protected WorkflowType workflowType;

    public DynamicWorkflowClientExternalImpl(String workflowId, WorkflowType workflowType) {
        this(new WorkflowExecution().withWorkflowId(workflowId), workflowType, null, null);
    }

    public DynamicWorkflowClientExternalImpl(WorkflowExecution workflowExecution) {
        this(workflowExecution, null, null, null);
    }

    public DynamicWorkflowClientExternalImpl(String workflowId, WorkflowType workflowType, StartWorkflowOptions options) {
        this(new WorkflowExecution().withWorkflowId(workflowId), workflowType, options, null, null);
    }

    public DynamicWorkflowClientExternalImpl(WorkflowExecution workflowExecution, WorkflowType workflowType,
            StartWorkflowOptions options) {
        this(workflowExecution, workflowType, options, null, null);
    }

    public DynamicWorkflowClientExternalImpl(WorkflowExecution workflowExecution, WorkflowType workflowType,
            StartWorkflowOptions options, DataConverter dataConverter) {
        this(workflowExecution, workflowType, options, dataConverter, null);
    }

    public DynamicWorkflowClientExternalImpl(WorkflowExecution workflowExecution, WorkflowType workflowType,
            StartWorkflowOptions options, DataConverter dataConverter, GenericWorkflowClientExternal genericClient) {
        this.workflowExecution = workflowExecution;
        this.workflowType = workflowType;
        this.schedulingOptions = options;
        if (dataConverter == null) {
            this.dataConverter = new JsonDataConverter();
        }
        else {
            this.dataConverter = dataConverter;
        }
        this.genericClient = genericClient;
    }

    public DataConverter getDataConverter() {
        return dataConverter;
    }

    public void setDataConverter(DataConverter dataConverter) {
        this.dataConverter = dataConverter;
    }

    public StartWorkflowOptions getSchedulingOptions() {
        return schedulingOptions;
    }

    public void setSchedulingOptions(StartWorkflowOptions schedulingOptions) {
        this.schedulingOptions = schedulingOptions;
    }

    public GenericWorkflowClientExternal getGenericClient() {
        return genericClient;
    }

    public void setGenericClient(GenericWorkflowClientExternal genericClient) {
        this.genericClient = genericClient;
    }

    public WorkflowExecution getWorkflowExecution() {
        return workflowExecution;
    }

    public void setWorkflowExecution(WorkflowExecution workflowExecution) {
        this.workflowExecution = workflowExecution;
    }

    public WorkflowType getWorkflowType() {
        return workflowType;
    }

    public void setWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType;
    }

    @Override
    public void terminateWorkflowExecution(String reason, String details, ChildPolicy childPolicy) {
        TerminateWorkflowExecutionParameters terminateParameters = new TerminateWorkflowExecutionParameters();
        terminateParameters.setReason(reason);
        terminateParameters.setDetails(details);
        terminateParameters.setChildPolicy(childPolicy);
        terminateParameters.setWorkflowExecution(workflowExecution);
        genericClient.terminateWorkflowExecution(terminateParameters);
    }

    @Override
    public void requestCancelWorkflowExecution() {
        genericClient.requestCancelWorkflowExecution(workflowExecution);
    }

    @Override
    public void startWorkflowExecution(Object[] arguments) {
        startWorkflowExecution(arguments, null);
    }

    @Override
    public void startWorkflowExecution(Object[] arguments, StartWorkflowOptions startOptionsOverride) {
        if (workflowType == null) {
            throw new IllegalStateException("Required property workflowType is null");
        }
        if (workflowExecution == null) {
            throw new IllegalStateException("wokflowExecution is null");
        }
        else if (workflowExecution.getWorkflowId() == null) {
            throw new IllegalStateException("wokflowId is null");
        }
        StartWorkflowExecutionParameters parameters = new StartWorkflowExecutionParameters();
        parameters.setWorkflowType(workflowType);
        parameters.setWorkflowId(workflowExecution.getWorkflowId());
        String input = dataConverter.toData(arguments);
        parameters.setInput(input);
        parameters = parameters.createStartWorkflowExecutionParametersFromOptions(schedulingOptions, startOptionsOverride);
        WorkflowExecution newExecution = genericClient.startWorkflow(parameters);
        String runId = newExecution.getRunId();
        workflowExecution.setRunId(runId);
    }

    @Override
    public void signalWorkflowExecution(String signalName, Object[] arguments) {
        SignalExternalWorkflowParameters signalParameters = new SignalExternalWorkflowParameters();
        signalParameters.setRunId(workflowExecution.getRunId());
        signalParameters.setWorkflowId(workflowExecution.getWorkflowId());
        signalParameters.setSignalName(signalName);
        String input = dataConverter.toData(arguments);
        signalParameters.setInput(input);
        genericClient.signalWorkflowExecution(signalParameters);
    }

    @Override
    public <T> T getWorkflowExecutionState(Class<T> returnType) throws Throwable {
        String state = genericClient.getWorkflowState(workflowExecution);
        if (state == null) return null;
        
        try {
            Throwable failure = dataConverter.fromData(state, Throwable.class);
            if (failure != null) {
                throw failure;
            }
        } catch (DataConverterException e) {
        } catch (RuntimeException e) {
        }
        
        return dataConverter.fromData(state, returnType);
    }

}
