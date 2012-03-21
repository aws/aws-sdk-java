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
package com.amazonaws.services.simpleworkflow.flow.test;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;

import com.amazonaws.services.simpleworkflow.flow.ChildWorkflowFailedException;
import com.amazonaws.services.simpleworkflow.flow.DecisionContext;
import com.amazonaws.services.simpleworkflow.flow.DecisionContextProvider;
import com.amazonaws.services.simpleworkflow.flow.DecisionContextProviderImpl;
import com.amazonaws.services.simpleworkflow.flow.SignalExternalWorkflowException;
import com.amazonaws.services.simpleworkflow.flow.StartChildWorkflowFailedException;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClock;
import com.amazonaws.services.simpleworkflow.flow.WorkflowContext;
import com.amazonaws.services.simpleworkflow.flow.WorkflowException;
import com.amazonaws.services.simpleworkflow.flow.common.FlowConstants;
import com.amazonaws.services.simpleworkflow.flow.core.Functor;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.core.Settable;
import com.amazonaws.services.simpleworkflow.flow.core.Task;
import com.amazonaws.services.simpleworkflow.flow.core.TryCatchFinally;
import com.amazonaws.services.simpleworkflow.flow.generic.ContinueAsNewWorkflowExecutionParameters;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericActivityClient;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericWorkflowClient;
import com.amazonaws.services.simpleworkflow.flow.generic.SignalExternalWorkflowParameters;
import com.amazonaws.services.simpleworkflow.flow.generic.StartChildWorkflowExecutionParameters;
import com.amazonaws.services.simpleworkflow.flow.generic.StartChildWorkflowReply;
import com.amazonaws.services.simpleworkflow.flow.generic.WorkflowDefinition;
import com.amazonaws.services.simpleworkflow.flow.generic.WorkflowDefinitionFactory;
import com.amazonaws.services.simpleworkflow.flow.generic.WorkflowDefinitionFactoryFactory;
import com.amazonaws.services.simpleworkflow.model.StartChildWorkflowExecutionFailedCause;
import com.amazonaws.services.simpleworkflow.model.UnknownResourceException;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;
import com.amazonaws.services.simpleworkflow.model.WorkflowType;

public class TestGenericWorkflowClient implements GenericWorkflowClient {

    private static class StartChildWorkflowReplyImpl implements StartChildWorkflowReply {

        private final Settable<String> result;

        private final String runId;

        private StartChildWorkflowReplyImpl(Settable<String> result, String runId) {
            this.result = result;
            this.runId = runId;
        }

        @Override
        public String getRunId() {
            return runId;
        }

        @Override
        public Promise<String> getResult() {
            return result;
        }
    }

    private static final class TestWorkflowContext implements WorkflowContext {

        private TryCatchFinally encosingTryCatch;

        private final StartChildWorkflowExecutionParameters parameters;

        private final WorkflowExecution childExecution;

        private ContinueAsNewWorkflowExecutionParameters continueParameters;

        private TestWorkflowContext(StartChildWorkflowExecutionParameters parameters, WorkflowExecution childExecution) {
            this.parameters = parameters;
            this.childExecution = childExecution;
        }

        public void setEncosingTryCatch(TryCatchFinally encosingTryCatch) {
            this.encosingTryCatch = encosingTryCatch;
        }

        @Override
        public void setContinueAsNewOnCompletion(ContinueAsNewWorkflowExecutionParameters continueParameters) {
            this.continueParameters = continueParameters;
        }

        @Override
        public boolean isCancelRequested() {
            return encosingTryCatch.isCancelRequested();
        }

        @Override
        public WorkflowType getWorkflowType() {
            return parameters.getWorkflowType();
        }

        @Override
        public WorkflowExecution getWorkflowExecution() {
            return childExecution;
        }

        @Override
        public ContinueAsNewWorkflowExecutionParameters getContinueAsNewOnCompletion() {
            return continueParameters;
        }

    }

    private final class ChildWorkflowTryCatchFinally extends TryCatchFinally {

        private final StartChildWorkflowExecutionParameters parameters;

        private final WorkflowExecution childExecution;

        private final Settable<String> result;

        /**
         * Child workflow doesn't set result to ready state before completing
         * all its tasks. So we need to set external result only in doFinally.
         */
        private final Settable<String> executeResult = new Settable<String>();

        private final WorkflowDefinition childWorkflowDefinition;

        private final DecisionContext childContext;

        private boolean failed;

        private final Settable<ContinueAsNewWorkflowExecutionParameters> continueAsNew = new Settable<ContinueAsNewWorkflowExecutionParameters>();

        private ChildWorkflowTryCatchFinally(StartChildWorkflowExecutionParameters parameters, WorkflowExecution childExecution,
                WorkflowDefinition childWorkflowDefinition, DecisionContext context, Settable<String> result) {
            this.parameters = parameters;
            this.childExecution = childExecution;
            this.childWorkflowDefinition = childWorkflowDefinition;
            this.childContext = context;
            this.result = result;
        }

        @Override
        protected void doTry() throws Throwable {
            executeResult.chain(childWorkflowDefinition.execute(parameters.getInput()));
        }

        @Override
        protected void doCatch(Throwable e) throws Throwable {
            failed = true;
            if (e instanceof WorkflowException) {
                WorkflowException we = (WorkflowException) e;
                throw new ChildWorkflowFailedException(0, childExecution, parameters.getWorkflowType(), e.getMessage(),
                        we.getDetails());
            }
            else if (e instanceof CancellationException) {
                throw e;
            }
            // Unless there is problem in the framework or generic workflow implementation this shouldn't be executed
            Exception failure = new ChildWorkflowFailedException(0, childExecution, parameters.getWorkflowType(), e.getMessage(),
                    "null");
            failure.initCause(e);
            throw failure;
        }

        @Override
        protected void doFinally() throws Throwable {
            if (!failed) {
                continueAsNew.set(childContext.getWorkflowContext().getContinueAsNewOnCompletion());
                if (continueAsNew.get() == null && executeResult.isReady()) {
                    result.set(executeResult.get());
                    return;
                }
            }
            else {
                continueAsNew.set(null);
            }
            workflowExecutions.remove(this.childExecution.getWorkflowId());
        }

        public void signalRecieved(final String signalName, final String details) {
            if (getState() != State.TRYING) {
                throw new SignalExternalWorkflowException(0, childExecution, "Completed");
            }
            new Task(this) {

                @Override
                protected void doExecute() throws Throwable {
                    childWorkflowDefinition.signalRecieved(signalName, details);
                }
            };
        }

        public StartChildWorkflowExecutionParameters getParameters() {
            return parameters;
        }

        public String getWorkflowState() throws WorkflowException {
            return childWorkflowDefinition.getWorkflowState();
        }

        public WorkflowExecution getWorkflowExecution() {
            return childExecution;
        }

        public Promise<ContinueAsNewWorkflowExecutionParameters> getContinueAsNew() {
            return continueAsNew;
        }

    }

    private final Map<String, ChildWorkflowTryCatchFinally> workflowExecutions = new HashMap<String, ChildWorkflowTryCatchFinally>();

    protected WorkflowDefinitionFactoryFactory factoryFactory;

    protected DecisionContextProvider decisionContextProvider;

    public TestGenericWorkflowClient(WorkflowDefinitionFactoryFactory factoryFactory,
            DecisionContextProvider decisionContextProvider) {
        this.factoryFactory = factoryFactory;
        this.decisionContextProvider = decisionContextProvider;
    }

    public TestGenericWorkflowClient(WorkflowDefinitionFactoryFactory factoryFactory) {
        this(factoryFactory, new DecisionContextProviderImpl());
    }

    public TestGenericWorkflowClient() {
        this(null, new DecisionContextProviderImpl());
    }

    public WorkflowDefinitionFactoryFactory getFactoryFactory() {
        return factoryFactory;
    }

    public void setFactoryFactory(WorkflowDefinitionFactoryFactory factoryFactory) {
        this.factoryFactory = factoryFactory;
    }

    public DecisionContextProvider getDecisionContextProvider() {
        return decisionContextProvider;
    }

    public void setDecisionContextProvider(DecisionContextProvider decisionContextProvider) {
        this.decisionContextProvider = decisionContextProvider;
    }

    @Override
    public Promise<StartChildWorkflowReply> startChildWorkflow(final StartChildWorkflowExecutionParameters parameters) {
        Settable<StartChildWorkflowReply> reply = new Settable<StartChildWorkflowReply>();
        Settable<String> result = new Settable<String>();
        startChildWorkflow(parameters, reply, result);
        return reply;
    }

    private void startChildWorkflow(final StartChildWorkflowExecutionParameters parameters,
            final Settable<StartChildWorkflowReply> reply, final Settable<String> result) {
        String workflowId = parameters.getWorkflowId();
        WorkflowType workflowType = parameters.getWorkflowType();
        WorkflowExecution childExecution = new WorkflowExecution();
        final String runId = UUID.randomUUID().toString();
        //TODO: Validate parameters against registration options to find missing timeouts or other options
        try {
            DecisionContext parentDecisionContext = decisionContextProvider.getDecisionContext();
            if (workflowId == null) {
                workflowId = decisionContextProvider.getDecisionContext().getWorkflowClient().generateUniqueId();
            }
            childExecution.setWorkflowId(workflowId);
            childExecution.setRunId(runId);

            final GenericActivityClient activityClient = parentDecisionContext.getActivityClient();
            final WorkflowClock workflowClock = parentDecisionContext.getWorkflowClock();
            WorkflowDefinitionFactory factory;
            if (factoryFactory == null) {
                throw new IllegalStateException("required property factoryFactory is null");
            }
            factory = factoryFactory.getWorkflowDefinitionFactory(workflowType);
            if (factory == null) {
                String cause = StartChildWorkflowExecutionFailedCause.WORKFLOW_TYPE_DOES_NOT_EXIST.toString();
                throw new StartChildWorkflowFailedException(0, childExecution, workflowType, cause);
            }
            TestWorkflowContext workfowContext = new TestWorkflowContext(parameters, childExecution);
            DecisionContext context = new TestDecisionContext(activityClient, TestGenericWorkflowClient.this, workflowClock,
                    workfowContext);
            //this, parameters, childExecution, workflowClock, activityClient);
            final WorkflowDefinition childWorkflowDefinition = factory.getWorkflowDefinition(context);
            final ChildWorkflowTryCatchFinally tryCatch = new ChildWorkflowTryCatchFinally(parameters, childExecution,
                    childWorkflowDefinition, context, result);
            workfowContext.setEncosingTryCatch(tryCatch);
            ChildWorkflowTryCatchFinally currentRun = workflowExecutions.get(workflowId);
            if (currentRun != null) {
                String cause = StartChildWorkflowExecutionFailedCause.WORKFLOW_ALREADY_RUNNING.toString();
                throw new StartChildWorkflowFailedException(0, childExecution, workflowType, cause);
            }
            workflowExecutions.put(workflowId, tryCatch);
            continueAsNewWorkflowExecution(tryCatch, result);
        }
        catch (StartChildWorkflowFailedException e) {
            throw e;
        }
        catch (Throwable e) {
            // This cause is chosen to represent internal error for sub-workflow creation
            String cause = StartChildWorkflowExecutionFailedCause.OPEN_CHILDREN_LIMIT_EXCEEDED.toString();
            StartChildWorkflowFailedException failure = new StartChildWorkflowFailedException(0, childExecution, workflowType,
                    cause);
            failure.initCause(e);
            throw failure;
        }
        finally {
            reply.set(new StartChildWorkflowReplyImpl(result, runId));
        }
    }

    private void continueAsNewWorkflowExecution(final ChildWorkflowTryCatchFinally tryCatch, final Settable<String> result) {
        // It is always set to ready with null if no continuation is necessary
        final Promise<ContinueAsNewWorkflowExecutionParameters> continueAsNew = tryCatch.getContinueAsNew();
        new Task(continueAsNew) {

            @Override
            protected void doExecute() throws Throwable {
                ContinueAsNewWorkflowExecutionParameters cp = continueAsNew.get();
                if (cp == null) {
                    return;
                }
                StartChildWorkflowExecutionParameters nextParameters = new StartChildWorkflowExecutionParameters();
                nextParameters.setInput(cp.getInput());
                WorkflowExecution previousWorkflowExecution = tryCatch.getWorkflowExecution();
                String workflowId = previousWorkflowExecution.getWorkflowId();
                nextParameters.setWorkflowId(workflowId);
                StartChildWorkflowExecutionParameters previousParameters = tryCatch.getParameters();
                nextParameters.setWorkflowType(previousParameters.getWorkflowType());
                long startToClose = cp.getExecutionStartToCloseTimeoutSeconds();
                if (startToClose == FlowConstants.NONE) {
                    startToClose = previousParameters.getExecutionStartToCloseTimeoutSeconds();
                }
                nextParameters.setExecutionStartToCloseTimeoutSeconds(startToClose);
                long taskStartToClose = cp.getTaskStartToCloseTimeoutSeconds();
                if (taskStartToClose == FlowConstants.NONE) {
                    taskStartToClose = previousParameters.getTaskStartToCloseTimeoutSeconds();
                }
                nextParameters.setTaskStartToCloseTimeoutSeconds(taskStartToClose);
                workflowExecutions.remove(workflowId);
                Settable<StartChildWorkflowReply> reply = new Settable<StartChildWorkflowReply>();
                startChildWorkflow(nextParameters, reply, result);
            }

        };
    }

    @Override
    public Promise<String> startChildWorkflow(String workflow, String version, String input) {
        StartChildWorkflowExecutionParameters parameters = new StartChildWorkflowExecutionParameters();
        WorkflowType workflowType = new WorkflowType().withName(workflow).withVersion(version);
        parameters.setWorkflowType(workflowType);
        parameters.setInput(input);
        Settable<StartChildWorkflowReply> reply = new Settable<StartChildWorkflowReply>();
        Settable<String> result = new Settable<String>();
        startChildWorkflow(parameters, reply, result);
        return result;
    }

    @Override
    public Promise<String> startChildWorkflow(final String workflow, final String version, final Promise<String> input) {
        return new Functor<String>(input) {

            @Override
            protected Promise<String> doExecute() throws Throwable {
                return startChildWorkflow(workflow, version, input.get());
            }
        };
    }

    @Override
    public Promise<Void> signalWorkflowExecution(final SignalExternalWorkflowParameters signalParameters) {
        WorkflowExecution signaledExecution = new WorkflowExecution();
        signaledExecution.setWorkflowId(signalParameters.getWorkflowId());
        signaledExecution.setRunId(signalParameters.getRunId());
        final ChildWorkflowTryCatchFinally childTryCatch = workflowExecutions.get(signalParameters.getWorkflowId());
        if (childTryCatch == null) {
            throw new SignalExternalWorkflowException(0, signaledExecution, "Unknown Execution");
        }
        String openExecutionRunId = childTryCatch.getWorkflowExecution().getRunId();
        if (signalParameters.getRunId() != null && !openExecutionRunId.equals(signalParameters.getRunId())) {
            throw new SignalExternalWorkflowException(0, signaledExecution, "Unknown Execution (runId doesn't match)");
        }
        childTryCatch.signalRecieved(signalParameters.getSignalName(), signalParameters.getInput());
        return Promise.Void();
    }

    @Override
    public void requestCancelWorkflowExecution(WorkflowExecution execution) {
        String workflowId = execution.getWorkflowId();
        if (workflowId == null) {
            throw new IllegalArgumentException("null workflowId");
        }
        final ChildWorkflowTryCatchFinally childTryCatch = workflowExecutions.get(workflowId);
        if (childTryCatch == null) {
            throw new UnknownResourceException("Unknown excution: " + execution.toString());
        }
        String openExecutionRunId = childTryCatch.getWorkflowExecution().getRunId();
        if (execution.getRunId() != null && !openExecutionRunId.equals(execution.getRunId())) {
            throw new UnknownResourceException("Unknown Execution (runId doesn't match)");
        }
        childTryCatch.cancel(new CancellationException());
    }

    public String getWorkflowState(WorkflowExecution execution) throws WorkflowException {
        String workflowId = execution.getWorkflowId();
        if (workflowId == null) {
            throw new IllegalArgumentException("null workflowId");
        }
        final ChildWorkflowTryCatchFinally childTryCatch = workflowExecutions.get(workflowId);
        if (childTryCatch == null) {
            throw new UnknownResourceException(execution.toString());
        }
        String openExecutionRunId = childTryCatch.getWorkflowExecution().getRunId();
        if (execution.getRunId() != null && !openExecutionRunId.equals(execution.getRunId())) {
            throw new UnknownResourceException("Unknown Execution (runId doesn't match)");
        }
        return childTryCatch.getWorkflowState();
    }

    @Override
    public void continueAsNewOnCompletion(ContinueAsNewWorkflowExecutionParameters parameters) {
        DecisionContext decisionContext = decisionContextProvider.getDecisionContext();
        decisionContext.getWorkflowContext().setContinueAsNewOnCompletion(parameters);
    }

    @Override
    public String generateUniqueId() {
        return UUID.randomUUID().toString();
    }

}
