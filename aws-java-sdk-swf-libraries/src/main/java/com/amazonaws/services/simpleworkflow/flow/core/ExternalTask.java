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
package com.amazonaws.services.simpleworkflow.flow.core;

/**
 * Used to bridge asynchronous execution to external asynchronous APIs or
 * events. {@link ExternalTask#doExecute(handle)} method is expected to initiate
 * call to an external API and return without blocking. Then completion or
 * failure of the external task is reported through
 * {@link ExternalTaskCompletionHandle}. A cancellation handler returned by the
 * doExecute is used to report cancellation of the external task.
 */
public abstract class ExternalTask extends AsyncContextAware {

    private final ExternalTaskContext context;

    public ExternalTask(Promise<?>... waitFor) {
        context = new ExternalTaskContext(this, null, waitFor);
    }

    public ExternalTask(boolean daemon, Promise<?>... waitFor) {
        context = new ExternalTaskContext(this, daemon, waitFor);
    }
    
    public ExternalTask(AsyncContextAware parent, Promise<?>... waitFor) {
        context = new ExternalTaskContext(parent.getContext(), this, null, waitFor);
    }

    public ExternalTask(AsyncContextAware parent, boolean daemon, Promise<?>... waitFor) {
        context = new ExternalTaskContext(parent.getContext(), this, daemon, waitFor);
    }

    public String getName() {
        return context.getName();
    }

    public void setName(String name) {
        context.setName(name);
    }

    public StackTraceElement[] getStackTrace() {
        return context.getStackTrace().getStackTrace();
    }

    @Override
    AsyncParentContext getContext() {
        return context;
    }

    protected abstract ExternalTaskCancellationHandler doExecute(ExternalTaskCompletionHandle handle) throws Throwable;

}
