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

import com.amazonaws.services.simpleworkflow.flow.core.Functor;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.core.Settable;
import com.amazonaws.services.simpleworkflow.flow.core.Task;
import com.amazonaws.services.simpleworkflow.flow.core.TryFinally;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericWorkflowClient;
import com.amazonaws.services.simpleworkflow.flow.generic.SignalExternalWorkflowParameters;
import com.amazonaws.services.simpleworkflow.flow.generic.StartChildWorkflowExecutionParameters;
import com.amazonaws.services.simpleworkflow.flow.generic.StartChildWorkflowReply;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;
import com.amazonaws.services.simpleworkflow.model.WorkflowType;

public class DynamicWorkflowClientImpl implements DynamicWorkflowClient {

    protected WorkflowType workflowType;

    protected GenericWorkflowClient genericClient;

    protected StartWorkflowOptions schedulingOptions;

    protected DataConverter dataConverter;

    protected WorkflowExecution workflowExecution;
    
    protected DecisionContextProvider decisionContextProvider = new DecisionContextProviderImpl();

    protected Settable<String> runId = new Settable<String>();

    public DynamicWorkflowClientImpl() {
        this(null, null, null, null, null);
    }

    public DynamicWorkflowClientImpl(WorkflowExecution workflowExecution) {
        this(workflowExecution, null, null, null, null);
    }

    public DynamicWorkflowClientImpl(WorkflowExecution workflowExecution, WorkflowType workflowType) {
        this(workflowExecution, workflowType, null, null, null);
    }

    public DynamicWorkflowClientImpl(WorkflowExecution workflowExecution, WorkflowType workflowType, StartWorkflowOptions options) {
        this(workflowExecution, workflowType, options, null, null);
    }

    public DynamicWorkflowClientImpl(WorkflowExecution workflowExecution, WorkflowType workflowType,
            StartWorkflowOptions options, DataConverter dataConverter) {
        this(workflowExecution, workflowType, options, dataConverter, null);
    }

    public DynamicWorkflowClientImpl(WorkflowExecution workflowExecution, WorkflowType workflowType,
            StartWorkflowOptions options, DataConverter dataConverter, GenericWorkflowClient genericClient) {
        this.workflowType = workflowType;
        this.workflowExecution = workflowExecution;
        if (dataConverter == null) {
            this.dataConverter = new JsonDataConverter();
        }
        else {
            this.dataConverter = dataConverter;
        }
        this.schedulingOptions = options;
        this.genericClient = genericClient;
        if (workflowExecution.getRunId() != null) {
            this.runId.set(workflowExecution.getRunId());
        }
    }

    @Override
    public DataConverter getDataConverter() {
        return dataConverter;
    }

    @Override
    public StartWorkflowOptions getSchedulingOptions() {
        return schedulingOptions;
    }

    @Override
    public GenericWorkflowClient getGenericClient() {
        return genericClient;
    }

    @Override
    public Promise<String> getRunId() {
        return runId;
    }

    @Override
    public WorkflowExecution getWorkflowExecution() {
        return workflowExecution;
    }

    @Override
    public WorkflowType getWorkflowType() {
        return workflowType;
    }

    public void setWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType;
    }

    public void setGenericClient(GenericWorkflowClient genericClient) {
        this.genericClient = genericClient;
    }

    public void setSchedulingOptions(StartWorkflowOptions schedulingOptions) {
        this.schedulingOptions = schedulingOptions;
    }

    public void setDataConverter(DataConverter dataConverter) {
        this.dataConverter = dataConverter;
    }

    @Override
    public void requestCancelWorkflowExecution(Promise<?>... waitFor) {
        checkWorkflowExecution();
        new Task(waitFor) {

            @Override
            protected void doExecute() throws Throwable {
                GenericWorkflowClient client = getGenericClientToUse();
                client.requestCancelWorkflowExecution(workflowExecution);
            }
        };
    }

    private void checkWorkflowExecution() {
        if (workflowExecution == null) {
            throw new IllegalStateException("required property workflowExecution is null");
        }
    }

    public <T> Promise<T> startWorkflowExecution(final Promise<Object>[] arguments,
            final StartWorkflowOptions startOptionsOverride, final Class<T> returnType, final Promise<?>... waitFor) {
        checkState();
        if (runId.isReady()) {
            runId = new Settable<String>();
        }
        return new Functor<T>(arguments) {

            @Override
            protected Promise<T> doExecute() throws Throwable {
                Object[] input = new Object[arguments.length];
                for (int i = 0; i < arguments.length; i++) {
                    Promise<Object> argument = arguments[i];
                    input[i] = argument.get();
                }
                return startWorkflowExecution(input, startOptionsOverride, returnType, waitFor);
            }

        };
    }

    public <T> Promise<T> startWorkflowExecution(final Object[] arguments, final StartWorkflowOptions startOptionsOverride,
            final Class<T> returnType, Promise<?>... waitFor) {
        checkState();
        final Settable<T> result = new Settable<T>();
        if (runId.isReady()) {
            runId = new Settable<String>();
        }
        new TryFinally(waitFor) {

            Promise<StartChildWorkflowReply> reply;

            @Override
            protected void doTry() throws Throwable {
                StartChildWorkflowExecutionParameters parameters = new StartChildWorkflowExecutionParameters();
                parameters.setWorkflowType(workflowType);
                String converterdArguments = dataConverter.toData(arguments);
                parameters.setInput(converterdArguments);
                parameters.setWorkflowId(workflowExecution.getWorkflowId());
                final StartChildWorkflowExecutionParameters startParameters = parameters.createStartChildWorkflowExecutionParametersFromOptions(
                        schedulingOptions, startOptionsOverride);
                GenericWorkflowClient client = getGenericClientToUse();
                reply = client.startChildWorkflow(startParameters);
                runId.setDescription("runId of " + reply.getDescription());
                result.setDescription(reply.getDescription());
                new Task(reply) {

                    @Override
                    protected void doExecute() throws Throwable {
                        if (!runId.isReady()) {
                            runId.set(reply.get().getRunId());
                            workflowExecution.setRunId(runId.get());
                        }
                    }

                };
            }

            @Override
            protected void doCatch(Throwable e) throws Throwable {
                if (e instanceof ChildWorkflowFailedException) {
                    ChildWorkflowFailedException taskFailedException = (ChildWorkflowFailedException) e;
                    try {
                        String details = taskFailedException.getDetails();
                        if (details != null) {
                            Throwable cause = dataConverter.fromData(details, Throwable.class);
                            if (cause != null && taskFailedException.getCause() == null) {
                                taskFailedException.initCause(cause);
                            }
                        }
                    }
                    catch (DataConverterException dataConverterException) {
                        if (dataConverterException.getCause() == null) {
                            dataConverterException.initCause(taskFailedException);
                        }
                        throw dataConverterException;
                    }
                }

                throw e;
            }

            @Override
            protected void doFinally() throws Throwable {
                if (reply != null && reply.isReady() && reply.get().getResult().isReady()) {
                    if (returnType.equals(Void.class)) {
                        result.set(null);
                    }
                    else {
                        T output = dataConverter.fromData(reply.get().getResult().get(), returnType);
                        result.set(output);
                    }
                }
            }
        };
        return result;
    }

    @Override
    public void signalWorkflowExecution(final String signalName, final Object[] arguments, Promise<?>... waitFor) {
        checkWorkflowExecution();
        new Task(waitFor) {

            @Override
            protected void doExecute() throws Throwable {
                SignalExternalWorkflowParameters parameters = new SignalExternalWorkflowParameters();
                parameters.setSignalName(signalName);
                String input = dataConverter.toData(arguments);
                parameters.setInput(input);
                parameters.setWorkflowId(workflowExecution.getWorkflowId());
                parameters.setRunId(workflowExecution.getRunId());
                GenericWorkflowClient client = getGenericClientToUse();
                client.signalWorkflowExecution(parameters);
            }
        };
    }

    private void checkState() {
        if (workflowType == null) {
            throw new IllegalStateException("required property workflowType is null");
        }
        checkWorkflowExecution();
    }

    private GenericWorkflowClient getGenericClientToUse() {
        GenericWorkflowClient client;
        if (genericClient == null) {
            client = decisionContextProvider.getDecisionContext().getWorkflowClient(); 
        } else {
            client = genericClient;
        }
        return client;
    }

}
