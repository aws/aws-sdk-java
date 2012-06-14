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
package com.amazonaws.services.simpleworkflow.flow.test;

import java.util.Collection;

import com.amazonaws.services.simpleworkflow.flow.DataConverter;
import com.amazonaws.services.simpleworkflow.flow.DecisionContextProvider;
import com.amazonaws.services.simpleworkflow.flow.WorkflowException;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.generic.ContinueAsNewWorkflowExecutionParameters;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericWorkflowClient;
import com.amazonaws.services.simpleworkflow.flow.generic.SignalExternalWorkflowParameters;
import com.amazonaws.services.simpleworkflow.flow.generic.StartChildWorkflowExecutionParameters;
import com.amazonaws.services.simpleworkflow.flow.generic.StartChildWorkflowReply;
import com.amazonaws.services.simpleworkflow.flow.pojo.POJOWorkflowDefinitionFactoryFactory;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;
import com.amazonaws.services.simpleworkflow.model.WorkflowType;


public class TestPOJOWorkflowImplementationGenericWorkflowClient implements GenericWorkflowClient {

    private final TestGenericWorkflowClient genericClient;
    private final POJOWorkflowDefinitionFactoryFactory factoryFactory;
    
    public TestPOJOWorkflowImplementationGenericWorkflowClient() {
        factoryFactory = new POJOWorkflowDefinitionFactoryFactory();
        genericClient = new TestGenericWorkflowClient(factoryFactory);
    }

    public DecisionContextProvider getDecisionContextProvider() {
        return genericClient.getDecisionContextProvider();
    }

    public void setDecisionContextProvider(DecisionContextProvider decisionContextProvider) {
        genericClient.setDecisionContextProvider(decisionContextProvider);
    }

    public Promise<StartChildWorkflowReply> startChildWorkflow(StartChildWorkflowExecutionParameters parameters) {
        return genericClient.startChildWorkflow(parameters);
    }

    public Promise<String> startChildWorkflow(String workflow, String version, String input) {
        return genericClient.startChildWorkflow(workflow, version, input);
    }

    public Promise<String> startChildWorkflow(String workflow, String version, Promise<String> input) {
        return genericClient.startChildWorkflow(workflow, version, input);
    }

    public Promise<Void> signalWorkflowExecution(SignalExternalWorkflowParameters signalParameters) {
        return genericClient.signalWorkflowExecution(signalParameters);
    }

    public void requestCancelWorkflowExecution(WorkflowExecution execution) {
        genericClient.requestCancelWorkflowExecution(execution);
    }

    public String getWorkflowState(WorkflowExecution execution) throws WorkflowException {
        return genericClient.getWorkflowState(execution);
    }

    public void continueAsNewOnCompletion(ContinueAsNewWorkflowExecutionParameters parameters) {
        genericClient.continueAsNewOnCompletion(parameters);
    }

    public String generateUniqueId() {
        return genericClient.generateUniqueId();
    }

    public void setDataConverter(DataConverter converter) {
        factoryFactory.setDataConverter(converter);
    }

    public Iterable<WorkflowType> getWorkflowTypesToRegister() {
        return factoryFactory.getWorkflowTypesToRegister();
    }

    public void addWorkflowImplementationType(Class<?> workflowImplementationType)
            throws InstantiationException, IllegalAccessException {
        factoryFactory.addWorkflowImplementationType(workflowImplementationType);
    }

    public void addWorkflowImplementationType(Class<?> workflowImplementationType, DataConverter converterOverride)
            throws InstantiationException, IllegalAccessException {
        factoryFactory.addWorkflowImplementationType(workflowImplementationType, converterOverride);
    }

    public void setWorkflowImplementationTypes(Collection<Class<?>> workflowImplementationTypes)
            throws InstantiationException, IllegalAccessException {
        factoryFactory.setWorkflowImplementationTypes(workflowImplementationTypes);
    }
    
}
