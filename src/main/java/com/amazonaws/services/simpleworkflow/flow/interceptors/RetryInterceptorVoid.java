package com.amazonaws.services.simpleworkflow.flow.interceptors;

import java.util.Date;
import java.util.concurrent.CancellationException;

import com.amazonaws.services.simpleworkflow.flow.WorkflowClock;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.core.Settable;
import com.amazonaws.services.simpleworkflow.flow.core.Task;
import com.amazonaws.services.simpleworkflow.flow.core.TryCatchFinally;

@SuppressWarnings("rawtypes")
public class RetryInterceptorVoid extends RetryInterceptorBase {
    
    public RetryInterceptorVoid(RetryCallable retryCallable, RetryPolicy retryPolicy) {
        super(retryCallable, retryPolicy);
    }

    @Override
    public Object execute() throws Throwable {
        WorkflowClock clock = contextProvider.getDecisionContext().getWorkflowClock();
        scheduleWithRetry(null, 1, clock.currentTimeMillis(), 0, clock);
        return null;
    }
    
    private void scheduleWithRetry(final Throwable failure, final int attempt, 
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
                    invoke(attempt, firstAttemptTime, clock);
                }
            };
        } else {
            invoke(attempt, firstAttemptTime, clock);
        }
        
    }

    private void invoke(final int attempt, final long firstAttemptTime, final WorkflowClock clock) {
        final Settable<Throwable> shouldRetry = new Settable<Throwable>();
        
        new TryCatchFinally() {
            Throwable failureToRetry = null;

            @Override
            protected void doTry() throws Throwable {
                retryCallable.call();
            }

            @Override
            protected void doCatch(Throwable failure) throws Throwable {
                if (failure instanceof Error || failure instanceof CancellationException) {
                    throw failure;
                }
                
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
                    scheduleWithRetry((Exception) failure, attempt + 1, firstAttemptTime, 
                            clock.currentTimeMillis(), clock);
                }
            }
        };
    }

}
