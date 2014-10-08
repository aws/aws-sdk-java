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

import java.util.HashMap;
import java.util.Map;

import com.amazonaws.services.simpleworkflow.flow.DataConverter;
import com.amazonaws.services.simpleworkflow.flow.DecisionContext;
import com.amazonaws.services.simpleworkflow.flow.generic.WorkflowDefinitionFactory;
import com.amazonaws.services.simpleworkflow.flow.generic.WorkflowDefinitionFactoryFactory;
import com.amazonaws.services.simpleworkflow.flow.pojo.POJOWorkflowDefinitionFactoryFactory;
import com.amazonaws.services.simpleworkflow.flow.pojo.POJOWorkflowImplementationFactory;
import com.amazonaws.services.simpleworkflow.model.WorkflowType;

class SpringWorkflowDefinitionFactoryFactory extends WorkflowDefinitionFactoryFactory {

    private final POJOWorkflowDefinitionFactoryFactory impl = new POJOWorkflowDefinitionFactoryFactory() {

        @Override
        protected POJOWorkflowImplementationFactory getImplementationFactory(Class<?> workflowImplementationType,
                Class<?> workflowInteface, WorkflowType workflowType) {
            final Object instanceProxy = workflowImplementations.get(workflowImplementationType);
            if (instanceProxy == null) {
                throw new IllegalArgumentException("unknown workflowImplementationType: " + workflowImplementationType);
            }
            return new POJOWorkflowImplementationFactory() {

                @Override
                public Object newInstance(DecisionContext decisionContext) throws Exception {
                    WorkflowScope.setDecisionContext(decisionContext);
                    return instanceProxy;
                }

                @Override
                public void deleteInstance(Object instance) {
                    WorkflowScope.removeDecisionContext();
                }

            };
        }

    };

    private final Map<Class<?>, Object> workflowImplementations = new HashMap<Class<?>, Object>();

    @Override
    public WorkflowDefinitionFactory getWorkflowDefinitionFactory(WorkflowType workflowType) {
        return impl.getWorkflowDefinitionFactory(workflowType);
    }

    @Override
    public Iterable<WorkflowType> getWorkflowTypesToRegister() {
        return impl.getWorkflowTypesToRegister();
    }

    public void setWorkflowImplementations(Iterable<Object> workflowImplementations)
            throws InstantiationException, IllegalAccessException {
        for (Object workflowImplementation : workflowImplementations) {
            addWorkflowImplementation(workflowImplementation);
        }
    }

    public Iterable<Object> getWorkflowImplementations() {
        return workflowImplementations.values();
    }
    
    public void addWorkflowImplementation(Object workflowImplementation) throws InstantiationException, IllegalAccessException {
        Class<? extends Object> implementationClass = workflowImplementation.getClass();
        workflowImplementations.put(implementationClass, workflowImplementation);
        impl.addWorkflowImplementationType(implementationClass);
    }

    public DataConverter getDataConverter() {
        return impl.getDataConverter();
    }

    public void setDataConverter(DataConverter converter) {
        impl.setDataConverter(converter);
    }
    
}
