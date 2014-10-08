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
import java.util.concurrent.Executor;

class AsyncScopeContext {

    private final class RootTryCatchFinally extends TryCatchFinally {

        private RootTryCatchFinally(boolean daemon, int skipStackLines) {
            super(daemon, "doAsync", skipStackLines, new Promise<?>[0]);
        }

        @Override
        protected void doTry() throws Throwable {
            asyncScope.doAsync();
        }

        @Override
        protected void doCatch(Throwable e) throws Throwable {
            throw e;
        }

        @Override
        protected void doFinally() {
        }

        @Override
        AsyncParentContext getContext() {
            if (super.getState() != TryCatchFinally.State.CREATED && super.getState() != TryCatchFinally.State.TRYING) {
                throw new IllegalStateException("Already executed");
            }
            return super.getContext();
        }

    }

    private final class RootAsyncContext implements AsyncParentContext {

        @Override
        public void remove(AsyncContextBase async) {
            assert !complete;
            complete = true;
        }

        @Override
        public Executor getExecutor() {
            return executor;
        }

        @Override
        public void fail(AsyncContextBase async, Throwable e) {
            assert !complete;
            failure = e;
            complete = true;
        }

        @Override
        public void add(AsyncContextBase async, Promise<?> waitFor) {
            if (waitFor != null) {
                throw new IllegalArgumentException();
            }
            executor.execute(async);
        }

        @Override
        public AsyncStackTrace getStackTrace() {
            return stackTrace;
        }

        @Override
        public boolean isRethrown(Throwable e) {
            throw new IllegalStateException("should not be called");
        }

        @Override
        public AsyncParentContext getCurrentTryCatchFinallyContext() {
            throw new IllegalStateException("should not be called");
        }

        @Override
        public boolean getDaemonFlagForHeir() {
            return false;
        }

        @Override
        public String getParentTaskMethodName() {
            return null;
        }

        @Override
        public boolean getHideStartFromMethod() {
            return false;
        }

        @Override
        public String getName() {
            return name;
        }
    }

    private final AsyncScope asyncScope;

    private boolean complete;

    private Throwable failure;

    private AsyncEventLoop executor;

    private TryCatchFinally root;

    private AsyncStackTrace stackTrace;
    
    private String name;

    public AsyncScopeContext(AsyncScope asyncScope, boolean disableAsyncStackTrace, boolean excludeAsyncScopeStack) {
        this.asyncScope = asyncScope;
        if (!disableAsyncStackTrace) {
            stackTrace = new AsyncStackTrace(null, new StackTraceElement[0], 0);
        }
        executor = new AsyncEventLoop();
        AsyncParentContext rootContext = new RootAsyncContext();
        AsyncContextBase.setCurrent(rootContext);
        try {
            int skipStackLines = excludeAsyncScopeStack ? Integer.MAX_VALUE : 10;
            root = new RootTryCatchFinally(false, skipStackLines);
        }
        finally {
            AsyncContextBase.setCurrent(null);
        }
    }

    public boolean eventLoop() throws Throwable {
        if (complete) {
            throw new IllegalStateException("already complete");
        }
        executor.executeAllQueued();
        if (complete && failure != null) {
            throw failure;
        }
        return complete;
    }

    
    public boolean isComplete() {
        return complete;
    }

    public Throwable getFailure() {
        return failure;
    }

    public void cancel(Throwable cause) {
        root.cancel(cause);
    }

    public boolean isCancelRequested() {
        return root.isCancelRequested();
    }

    public List<AsyncTaskInfo> getAsynchronousStackTraceDump() {
        return root.getAsynchronousStackTraceDump();
    }

    public String getAsynchronousStackTraceDumpAsString() {
        return root.getAsynchronousStackTraceDumpAsString();
    }

    public AsyncParentContext getRootContext() {
        return root.getContext();
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
}
