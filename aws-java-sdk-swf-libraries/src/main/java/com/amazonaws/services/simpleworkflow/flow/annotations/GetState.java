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

import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;

/**
 * Indicates that method is used to retrieve current workflow state. The method
 * is expected to perform read only access of the workflow implementation object
 * and is invoked synchronously which disallows use of any asynchronous
 * operations (like calling methods annotated with {@link Asynchronous}).
 * 
 * Method is expected to have empty list of parameters.
 * {@link Promise} or <code>void</code> return types are not allowed for the annotated method.
 * 
 * The generated external client implementation uses {@link AmazonSimpleWorkflow#describeWorkflowExecution(com.amazonaws.services.simpleworkflow.model.DescribeWorkflowExecutionRequest) 
 * visibility API to retrieve the state. It allows access to the sate using external client if decider 
 * workers are down and even after workflow execution completion.
 * 
 * @author fateev, samar
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface GetState {
}
