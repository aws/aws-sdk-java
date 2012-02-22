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
package com.amazonaws.services.simpleworkflow.flow.worker;

import java.lang.management.ManagementFactory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.flow.WorkflowTypeRegistrationOptions;
import com.amazonaws.services.simpleworkflow.flow.common.FlowConstants;
import com.amazonaws.services.simpleworkflow.flow.common.FlowHelpers;
import com.amazonaws.services.simpleworkflow.flow.generic.WorkflowDefinitionFactory;
import com.amazonaws.services.simpleworkflow.flow.generic.WorkflowDefinitionFactoryFactory;
import com.amazonaws.services.simpleworkflow.model.RegisterWorkflowTypeRequest;
import com.amazonaws.services.simpleworkflow.model.TaskList;
import com.amazonaws.services.simpleworkflow.model.TypeAlreadyExistsException;
import com.amazonaws.services.simpleworkflow.model.WorkflowType;

public class GenericWorkflowWorker extends GenericWorker {

    private static final Log log = LogFactory.getLog(GenericWorkflowWorker.class);

    private static final String THREAD_NAME_PREFIX = "SWF Decider ";

    private WorkflowDefinitionFactoryFactory workflowDefinitionFactoryFactory;

    public GenericWorkflowWorker() {
        setIdentity(ManagementFactory.getRuntimeMXBean().getName());
    }

    public GenericWorkflowWorker(AmazonSimpleWorkflow service, String domain, String taskListToPoll) {
        this();
        setService(service);
        setDomain(domain);
        setTaskListToPoll(taskListToPoll);
    }

    public WorkflowDefinitionFactoryFactory getWorkflowDefinitionFactoryFactory() {
        return workflowDefinitionFactoryFactory;
    }

    public void setWorkflowDefinitionFactoryFactory(WorkflowDefinitionFactoryFactory workflowDefinitionFactoryFactory) {
        this.workflowDefinitionFactoryFactory = workflowDefinitionFactoryFactory;
    }

    protected DecisionTaskPoller createWorkflowPoller() {
        DecisionTaskPoller poller = new DecisionTaskPoller();
        return poller;
    }

    @Override
    protected void checkRequredProperties() {
        checkRequiredProperty(workflowDefinitionFactoryFactory, "workflowDefinitionFactoryFactory");
    }

    @Override
    protected String getPollThreadNamePrefix() {
        return THREAD_NAME_PREFIX + getTaskListToPoll() + " ";
    }

    @Override
    protected TaskPoller createPoller() {
        DecisionTaskPoller result = new DecisionTaskPoller();
        result.setDecisionTaskHandler(new AsyncDecisionTaskHandler(workflowDefinitionFactoryFactory));
        result.setDomain(getDomain());
        result.setIdentity(getIdentity());
        result.setService(getService());
        result.setTaskListToPoll(getTaskListToPoll());
        return result;
    }

    @Override
    public void registerTypesToPoll() {
        registerWorkflowTypes(service, domain, getTaskListToPoll(), workflowDefinitionFactoryFactory);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "[super=" + super.toString() + ", workflowDefinitionFactoryFactory="
                + workflowDefinitionFactoryFactory + "]";
    }

    public static void registerWorkflowTypes(AmazonSimpleWorkflow service, String domain, String defaultTaskList,
            WorkflowDefinitionFactoryFactory workflowDefinitionFactoryFactory) {
        for (WorkflowType typeToRegister : workflowDefinitionFactoryFactory.getWorkflowTypesToRegister()) {
            WorkflowDefinitionFactory workflowDefinitionFactory = workflowDefinitionFactoryFactory.getWorkflowDefinitionFactory(typeToRegister);
            WorkflowTypeRegistrationOptions registrationOptions = workflowDefinitionFactory.getWorkflowRegistrationOptions();
            if (registrationOptions != null) {
                WorkflowType workflowType = workflowDefinitionFactory.getWorkflowType();
                try {
                    registerWorkflowType(service, domain, workflowType, registrationOptions, defaultTaskList);
                }
                catch (TypeAlreadyExistsException ex) {
                    if (log.isTraceEnabled()) {
                        log.trace("Workflow Type already registered: " + workflowType);
                    }
                }
            }
        }
    }

    public static void registerWorkflowType(AmazonSimpleWorkflow service, String domain, WorkflowType workflowType,
            WorkflowTypeRegistrationOptions registrationOptions, String defaultTaskList) {
        RegisterWorkflowTypeRequest registerWorkflow = new RegisterWorkflowTypeRequest();

        registerWorkflow.setDomain(domain);
        registerWorkflow.setName(workflowType.getName());
        registerWorkflow.setVersion(workflowType.getVersion());
        String taskList = registrationOptions.getDefaultTaskList();
        if (taskList == null) {
            taskList = defaultTaskList;
        }
        else if (taskList.equals(FlowConstants.NO_DEFAULT_TASK_LIST)) {
            taskList = null;
        }
        if (taskList != null && !taskList.isEmpty()) {
            registerWorkflow.setDefaultTaskList(new TaskList().withName(taskList));
        }
        registerWorkflow.setDefaultChildPolicy(registrationOptions.getDefaultChildPolicy().toString());
        registerWorkflow.setDefaultTaskStartToCloseTimeout(FlowHelpers.secondsToDuration(registrationOptions.getDefaultTaskStartToCloseTimeoutSeconds()));
        registerWorkflow.setDefaultExecutionStartToCloseTimeout(FlowHelpers.secondsToDuration(registrationOptions.getDefaultExecutionStartToCloseTimeoutSeconds()));

        String description = registrationOptions.getDescription();
        if (description != null) {
            registerWorkflow.setDescription(description);
        }

        service.registerWorkflowType(registerWorkflow);
    }

}
