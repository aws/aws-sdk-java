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
package com.amazonaws.services.simpleworkflow.flow.interceptors;

import java.util.Date;
import java.util.concurrent.CancellationException;

import com.amazonaws.services.simpleworkflow.flow.WorkflowClock;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.core.Settable;
import com.amazonaws.services.simpleworkflow.flow.core.Task;
import com.amazonaws.services.simpleworkflow.flow.core.TryCatchFinally;

@SuppressWarnings("rawtypes")
public class RetryInterceptorWithResult extends RetryInterceptorBase {
    
    public RetryInterceptorWithResult(RetryCallable retryCallable, RetryPolicy retryPolicy) {
        super(retryCallable, retryPolicy);
    }

    @Override
    public Object execute() throws Throwable {
        Settable<Object> result = new Settable<Object>();
        WorkflowClock clock = contextProvider.getDecisionContext().getWorkflowClock();
        scheduleWithRetry(result, null, 1, clock.currentTimeMillis(), 
                0, clock);
        return result;
    }
    
    private void scheduleWithRetry(final Settable<Object> result, final Throwable failure, final int attempt, 
            final long firstAttemptTime, final long timeOfRecordedFailure, final WorkflowClock clock) throws Throwable {
        
        long delay = -1;
        if (attempt > 1) {
            if (!retryPolicy.isRetryable(failure)) {
                throw failure;
            }
            
            delay = retryPolicy.nextRetryDelaySeconds(new Date(firstAttemptTime), new Date(timeOfRecordedFailure), attempt);
            
            if (delay < 0) {
                throw failure;
            }
        }
        
        if (delay > 0) {
            Promise<Void> timer = clock.createTimer(delay);
            new Task(timer) {
                @Override
                protected void doExecute() throws Throwable {
                    invoke(result, attempt, firstAttemptTime, clock);
                }
            };
        } else {
            invoke(result, attempt, firstAttemptTime, clock);
        }
        
    }

    @SuppressWarnings("unchecked")
    private void invoke(final Settable<Object> result, final int attempt, final long firstAttemptTime, final WorkflowClock clock) {
        final Settable<Throwable> shouldRetry = new Settable<Throwable>();
        
        new TryCatchFinally() {
            Throwable failureToRetry = null;

            @Override
            protected void doTry() throws Throwable {
                result.chain(retryCallable.call());
            }

            @Override
            protected void doCatch(Throwable failure) throws Throwable {
                if (failure instanceof Error || failure instanceof CancellationException) {
                    throw failure;
                }
                if (result.isReady()) {
                    throw new IllegalStateException("Cannot retry as result is in ready state", failure);
                }
                result.unchain();
                failureToRetry = failure;
            }

            @Override
            protected void doFinally() throws Throwable {
                shouldRetry.set(failureToRetry);
            }
        };
        
        new Task(shouldRetry) {
            
            @Override
            protected void doExecute() throws Throwable {
                Throwable failure = shouldRetry.get();
                if (failure != null) {
                    scheduleWithRetry(result, (Exception) failure, attempt + 1, firstAttemptTime, 
                            clock.currentTimeMillis(), clock);
                }
            }
        };
    }

}
