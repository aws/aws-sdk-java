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
package com.amazonaws.services.simpleworkflow.flow.core;

/**
 * Asynchronous task that is executed when all {@link Promise}s passed to its
 * constructor are ready (<code>null</code> parameter is considered ready).
 * 
 * <p>
 * Should be created in the context of {@link AsyncScope#doAsync()} method, from
 * {@link Task#doExecute()} or from {@link TryCatchFinally} do... methods.
 * Exceptions thrown from {@link #doExecute()} are delivered asynchronously to
 * the wrapping {@link TryCatchFinally#doCatch(Throwable)} method or rethrown
 * from {@link AsyncScope#eventLoop()} if no wrapping {@link TryCatchFinally} is
 * found.
 * 
 * <p>
 * Example of using {@link Task} to implement asynchronous function that sums
 * parameters when both of them are ready:
 * 
 * <pre>
 * <tt>
 * public Promise&lt;Integer&gt; sum(Promise&lt;Integer&gt; a, Promise&lt;Integer&gt; b) {
 *     Settable&lt;Integer&gt; result = new Settable&lt;Integer&gt;();
 *     new Task(a, b) {
 *         public void doExecute() {
 *             result.set(a.get() + b.get());
 *         }
 *     };
 *     return result;
 * }
 * </tt>
 * </pre>
 * 
 * @see AsyncScope
 * @see TryCatchFinally
 * @see Promise
 */
public abstract class Task extends AsyncContextAware {

    private TaskContext context;

    public Task(Promise<?>... waitFor) {
        this((Boolean) null, waitFor);
    }

    public Task(boolean daemon, Promise<?>... waitFor) {
        context = new TaskContext(this, daemon, waitFor);
    }

    private Task(Boolean daemon, Promise<?>... waitFor) {
        context = new TaskContext(this, daemon, waitFor);
    }

    public Task(AsyncContextAware parent, boolean daemon, Promise<?>... waitFor) {
        context = new TaskContext(parent.getContext(), this, daemon, waitFor);
    }

    public Task(AsyncContextAware parent, Promise<?>... waitFor) {
        context = new TaskContext(parent.getContext(), this, null, waitFor);
    }

    protected Task(AsyncContextAware parent, Boolean daemon, String parentTaskMethodName, boolean hideParentTaskMethodName,
            int skipStackLines, Promise<?>... waitFor) {
        context = new TaskContext(parent.getContext(), this, daemon, parentTaskMethodName, hideParentTaskMethodName,
                skipStackLines, waitFor);
    }

    protected Task(Boolean daemon, String parentTaskMethodName, boolean hideParentTaskMethodName, int skipStackLines,
            Promise<?>... waitFor) {
        context = new TaskContext(this, daemon, parentTaskMethodName, hideParentTaskMethodName, skipStackLines, waitFor);
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

    public String toString() {
        return context.toString();
    }

    protected abstract void doExecute() throws Throwable;

}
