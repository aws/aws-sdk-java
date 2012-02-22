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

import com.amazonaws.services.simpleworkflow.flow.core.Promise;

/**
 * @Execute annotation is used on methods of interface annotated with {@link Workflow} 
 * to specify the entry-point for WorkflowType.  
 * 
 * @Execute method can only have <code>void</code> or {@link Promise} return types.
 * Parameters of type {@link Promise} are not allowed.
 * 
 * @see Workflow, WorkflowWorker
 * @author fateev, samar
 * 
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Execute {

    /**
     * Optional name of the workflow type. When missing defaults to the
     * annotated method name. Maximum length is 256 characters.
     */
    String name() default "";

    /**
     * Required version of the workflow type. Maximum length is 64 characters.
     */
    String version();

}
