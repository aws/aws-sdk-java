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

import java.util.List;

/**
 * Interface between synchronous and asynchronous code. Serves as a root scope
 * for asynchronous computation and as event loop for the owning synchronous
 * code.
 * 
 * @author fateev
 */
public abstract class AsyncScope extends AsyncContextAware implements Cancelable {

    private final AsyncScopeContext context;

    public AsyncScope() {
        // The reason this(...) is not called is to keep the same stack depth for both constructors.
        // It simplifies creation of async stack traces
        this.context = new AsyncScopeContext(this, false, false);
    }

    public AsyncScope(boolean disableAsyncStackTrace, boolean excludeAsyncScopeStack) {
        this.context = new AsyncScopeContext(this, disableAsyncStackTrace, excludeAsyncScopeStack);
    }

    public void cancel(Throwable cause) {
        context.cancel(cause);
    }

    @Override
    public boolean isCancelRequested() {
        return context.isCancelRequested();
    }
    
    

    public List<AsyncTaskInfo> getAsynchronousThreadDump() {
        return context.getAsynchronousStackTraceDump();
    }

    public String getAsynchronousThreadDumpAsString() {
        return context.getAsynchronousStackTraceDumpAsString();
    }

    /**
     * Execute all queued tasks. If execution of those tasks result in addition
     * of new tasks to the queue execute them as well.
     * <p>
     * Unless there are external dependencies or bugs single call to this method
     * performs the complete asynchronous execution.
     * <p>
     * In presence of external dependencies it is expected that
     * <code>eventLoop()</code> is called every time after change in their state
     * can unblock the asynchronous execution.
     * 
     * @return true means there are no tasks originated from this scope that are
     *         not done yet.
     */
    public boolean eventLoop() throws Throwable {
        return context.eventLoop();
    }

    public boolean isComplete() {
        return context.isComplete();
    }

    public Throwable getFailure() {
        return context.getFailure();
    }

    @Override
    AsyncParentContext getContext() {
        return context.getRootContext();
    }

    protected abstract void doAsync() throws Throwable;

}
