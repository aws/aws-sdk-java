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
package com.amazonaws.services.simpleworkflow.flow.worker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.services.simpleworkflow.flow.WorkflowTypeRegistrationOptions;
import com.amazonaws.services.simpleworkflow.flow.generic.WorkflowDefinitionFactory;
import com.amazonaws.services.simpleworkflow.flow.generic.WorkflowDefinitionFactoryFactory;
import com.amazonaws.services.simpleworkflow.model.WorkflowType;

public class SimpleWorkflowDefinitionFactoryFactory extends WorkflowDefinitionFactoryFactory {

    private final Map<WorkflowType, WorkflowDefinitionFactory> factoriesMap = new HashMap<WorkflowType, WorkflowDefinitionFactory>();

    private final List<WorkflowType> typesToRegister = new ArrayList<WorkflowType>();

    @Override
    public WorkflowDefinitionFactory getWorkflowDefinitionFactory(WorkflowType workflowType) {
        return factoriesMap.get(workflowType);
    }

    @Override
    public Iterable<WorkflowType> getWorkflowTypesToRegister() {
        return typesToRegister;
    }

    public void setWorkflowDefinitionFactories(Collection<WorkflowDefinitionFactory> factories) {
        for (WorkflowDefinitionFactory factory : factories) {
            addWorkflowDefinitionFactory(factory);
        }
    }

    public Collection<WorkflowDefinitionFactory> getWorkflowDefinitionFactories() {
        return factoriesMap.values();
    }

    public void addWorkflowDefinitionFactory(WorkflowDefinitionFactory factory) {
        WorkflowType workflowType = factory.getWorkflowType();
        factoriesMap.put(workflowType, factory);
        WorkflowTypeRegistrationOptions registrationOptions = factory.getWorkflowRegistrationOptions();
        if (registrationOptions != null) {
            typesToRegister.add(workflowType);
        }
    }
}
