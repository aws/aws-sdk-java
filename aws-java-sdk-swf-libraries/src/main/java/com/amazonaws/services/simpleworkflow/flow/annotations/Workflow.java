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

import com.amazonaws.services.simpleworkflow.flow.DataConverter;
import com.amazonaws.services.simpleworkflow.flow.DecisionContext;
import com.amazonaws.services.simpleworkflow.flow.JsonDataConverter;

/**
 * @Workflow annotation is allowed on interfaces to define a workflow.  This 
 * interface forms the contract between the implementation of WorkflowType 
 * and clients interested in starting executions, sending signals, and getting
 * current state of execution.
 * 
 * Use {@link Execute} annotation on the method to mark it as the entry-point 
 * for WorkflowType.  @Workflow interface cannot have more than one method marked
 * with {@link Execute} annotation.
 * 
 * Use {@link Signal} annotation on the methods to mark them as signals 
 * supported by WorkflowType.  @Workflow interface can have zero or more methods
 * marked with {@link Signal} annotation.
 * 
 * Use {@link GetState} annotation on the method which framework will use to 
 * update the current workflow state for WorkflowType.  @Workflow interface 
 * cannot have more than one method marked with {@link GetState} annotation. 
 * 
 * {@link Execute}, {@link Signal} and {@link GetState} annotations are mutually
 * exclusive and cannot be used simultaneously on a method.  AWS Flow Framework
 * annotation processor will auto-generate three different clients which can 
 * be used to start new executions, sending signals and retrieving workflow states 
 * for different situations. 
 * 
 * @see DecisionContext
 * @author fateev, samar
 * 
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Workflow {

    /**
     * This is used to specify {@link DataConverter} type to use for 
     * serialization/de-serialization of workflow method parameters and return types.
     * 
     * Default is {@link NullDataConverter} which means to use the default 
     * DataConverter used by framework.  Default DataConverter used by framework is 
     * {@link JsonDataConverter}.
     */
    Class<? extends DataConverter> dataConverter() default NullDataConverter.class;

}
