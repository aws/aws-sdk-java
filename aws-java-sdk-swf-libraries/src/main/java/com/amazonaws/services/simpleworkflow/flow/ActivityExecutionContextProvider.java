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
package com.amazonaws.services.simpleworkflow.flow;

/**
 * Used to access execution context of the currently executed activity. An
 * implementation might rely on thread local storage. So it is guaranteed to
 * return current context only in the thread that invoked the activity
 * implementation. If activity implementation needs to pass its execution
 * context to other threads it has to do it explicitly.
 * 
 * @author fateev
 */
public interface ActivityExecutionContextProvider {

    public ActivityExecutionContext getActivityExecutionContext();

}
