package com.amazonaws.services.simpleworkflow.flow.interceptors;

import java.util.Date;
import java.util.concurrent.CancellationException;

import com.amazonaws.services.simpleworkflow.flow.WorkflowClock;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.core.Settable;
import com.amazonaws.services.simpleworkflow.flow.core.Task;
import com.amazonaws.services.simpleworkflow.flow.core.TryCatchFinally;

/**
 * 
 * @author fateev
 */
public class AsyncRetryingExecutor implements AsyncExecutor {

    private final RetryPolicy retryPolicy;

    private WorkflowClock clock;

    public AsyncRetryingExecutor(RetryPolicy retryPolicy, WorkflowClock clock) {
        this.retryPolicy = retryPolicy;
        this.clock = clock;
    }

    @Override
    public void execute(AsyncRunnable command) throws Throwable {
        scheduleWithRetry(command, null, 1, clock.currentTimeMillis(), 0);
    }

    private void scheduleWithRetry(final AsyncRunnable command, final Throwable failure, final int attempt,
            final long firstAttemptTime, final long timeOfRecordedFailure) throws Throwable {

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
                    invoke(command, attempt, firstAttemptTime);
                }
            };
        }
        else {
            invoke(command, attempt, firstAttemptTime);
        }

    }

    private void invoke(final AsyncRunnable command, final int attempt, final long firstAttemptTime) {
        final Settable<Throwable> shouldRetry = new Settable<Throwable>();

        new TryCatchFinally() {

            Throwable failureToRetry = null;

            @Override
            protected void doTry() throws Throwable {
                command.run();
            }

            @Override
            protected void doCatch(Throwable failure) throws Throwable {
                if (failure instanceof CancellationException) {
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
                    scheduleWithRetry(command, failure, attempt + 1, firstAttemptTime, clock.currentTimeMillis());
                }
            }
        };
    }

}
