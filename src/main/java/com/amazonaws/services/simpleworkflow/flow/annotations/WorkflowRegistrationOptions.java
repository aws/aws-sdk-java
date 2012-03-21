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
package com.amazonaws.services.simpleworkflow.flow.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.amazonaws.services.simpleworkflow.flow.WorkflowWorker;
import com.amazonaws.services.simpleworkflow.flow.common.FlowConstants;
import com.amazonaws.services.simpleworkflow.model.ChildPolicy;

/**
 * @WorkflowRegistrationOptions is a required annotation, unless 
 * {@link SkipTypeRegistration} is provided, on interfaces annotated with 
 * {@link Workflow}.
 * 
 * It contains all the registration options for WorkflowType which will be used for 
 * registration with Amazon SWF Service.  Registration of types happen on 
 * {@link WorkflowWorker#start()}.
 * 
 * @see WorkflowWorker
 * @author fateev, samar
 *
 */
@Target(ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface WorkflowRegistrationOptions {

    /**
     * Optional textual description of the workflow type. Maximum length is 1024
     * characters.
     */
    String description() default "";

    /**
     * Maximum time that workflow run is allowed to execute. Workflow is
     * forcefully closed by the SWF service if this timeout is exceeded.
     */
    long defaultExecutionStartToCloseTimeoutSeconds();

    /**
     * Single decision timeout. This timeout defines how long it takes to
     * reexecute a decision after {@link WorkflowWorker} catastrophic failure in
     * the middle of one. Do not confuse with the whole worklfow timeout (
     * {@link #defaultExecutionStartToCloseTimeoutSeconds()} which can be really
     * big. Default is 30 seconds.
     */
    long defaultTaskStartToCloseTimeoutSeconds() default 30;

    /**
     * Task list that decision task is delivered through for the given workflow
     * type.
     * 
     * <p>
     * Default is {@link FlowConstants#USE_WORKER_TASK_LIST}, which means to use task
     * list from the {@link WorkflowWorker} that the workflow implementation is
     * registered with.
     */
    String defaultTaskList() default FlowConstants.USE_WORKER_TASK_LIST;

    ChildPolicy defaultChildPolicy() default ChildPolicy.TERMINATE;
}
