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
 * @Signal annotation is used on methods of interface annotated with {@link Workflow}
 * to specify the method to invoke when a particular signal is received by workflow
 * execution with a matching name.
 * 
 * @Signal methods are not allowed to have {@link Promise} parameters types and can
 * only have <code>void</code> as return types.
 * 
 * @see Workflow, WorkflowWorker
 * @author fateev, samar
 *
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Signal {
    /**
     * Optional name of the signal.
     * Default is empty-string which means to use the name of annotated method
     * as signal name. 
     * Maximum length is 256 characters.
     */
	String name() default "";
}
