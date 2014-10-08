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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.config.Scope;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.amazonaws.services.simpleworkflow.flow.DecisionContext;
import com.amazonaws.services.simpleworkflow.flow.DecisionContextProvider;
import com.amazonaws.services.simpleworkflow.flow.DecisionContextProviderImpl;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClock;
import com.amazonaws.services.simpleworkflow.flow.WorkflowContext;
import com.amazonaws.services.simpleworkflow.flow.WorkflowExecutionLocal;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericActivityClient;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericWorkflowClient;
import com.amazonaws.services.simpleworkflow.flow.worker.CurrentDecisionContext;

/**
 * 
 */
public class WorkflowScope implements Scope, ApplicationContextAware {

    public static final String NAME = "workflow";

    private DecisionContextProvider contextProvider = new DecisionContextProviderImpl();
    
    private static WorkflowExecutionLocal<Map<String, Object>> objects = new WorkflowExecutionLocal<Map<String, Object>>() {

        @Override
        protected Map<String, Object> initialValue() {
            return new HashMap<String, Object>();
        }
    };

    private static WorkflowExecutionLocal<List<Runnable>> destructionCallbacks = new WorkflowExecutionLocal<List<Runnable>>() {

        @Override
        protected List<Runnable> initialValue() {
            return new ArrayList<Runnable>();
        }
        
    };

    public static void setDecisionContext(DecisionContext context) {
        CurrentDecisionContext.set(context);
        destructionCallbacks.get().clear();
        set(WorkflowScopeBeanNames.GENERIC_ACTIVITY_CLIENT, context.getActivityClient());
        set(WorkflowScopeBeanNames.GENERIC_WORKFLOW_CLIENT, context.getWorkflowClient());
        set(WorkflowScopeBeanNames.WORKFLOW_CLOCK, context.getWorkflowClock());
        set(WorkflowScopeBeanNames.WORKFLOW_CONTEXT, context.getWorkflowContext());
        set(WorkflowScopeBeanNames.DECISION_CONTEXT, context);
    }

    public static void removeDecisionContext() {
        for (Runnable callback: destructionCallbacks.get()) {
            callback.run();
        }
        CurrentDecisionContext.unset();
    }
    
    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        Map<String, Object> map = objects.get();
        Object result = map.get(name);
        if (result == null) {
            result = objectFactory.getObject();
            map.put(name, result);
        }
        return result;
    }

    private static void set(String name, Object bean) {
        Map<String, Object> map = objects.get();
        map.put(name, bean);
    }

    
    
    @Override
    public String getConversationId() {
        return contextProvider.getDecisionContext().getWorkflowContext().getWorkflowExecution().getRunId();
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {
        destructionCallbacks.get().add(callback);
    }

    @Override
    public Object remove(String name) {
        Map<String, Object> map = objects.get();
        return map.remove(name);
    }

    @Override
    public Object resolveContextualObject(String name) {
        //TODO: Understand why WorkflowScopeBeans cannot be returned from this method
        return null;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        AutowireCapableBeanFactory autowireCapableBeanFactory = applicationContext.getAutowireCapableBeanFactory();
        if (!(autowireCapableBeanFactory instanceof DefaultListableBeanFactory)) {
            throw new IllegalArgumentException(
                    "The implementation returned from applicationContext.getAutowireCapableBeanFactory() "
                            + "doesn't implement DefaultListableBeanFactory");
        }
        DefaultListableBeanFactory factory = (DefaultListableBeanFactory) autowireCapableBeanFactory;
        registerBean(factory, WorkflowScopeBeanNames.GENERIC_ACTIVITY_CLIENT, GenericActivityClient.class);
        registerBean(factory, WorkflowScopeBeanNames.GENERIC_WORKFLOW_CLIENT, GenericWorkflowClient.class);
        registerBean(factory, WorkflowScopeBeanNames.WORKFLOW_CLOCK, WorkflowClock.class);
        registerBean(factory, WorkflowScopeBeanNames.WORKFLOW_CONTEXT, WorkflowContext.class);
        registerBean(factory, WorkflowScopeBeanNames.DECISION_CONTEXT, DecisionContext.class);
    }

    private void registerBean(DefaultListableBeanFactory factory, String beanName, Class<?> beanClass) {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(beanClass);
        builder.setScope(NAME);
        factory.registerBeanDefinition(beanName, builder.getBeanDefinition());
    }

}
