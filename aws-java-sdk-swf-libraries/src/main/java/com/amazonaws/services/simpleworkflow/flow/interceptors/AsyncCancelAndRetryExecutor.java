/*
 * Copyright 2012-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.flow.interceptors;

import java.util.concurrent.CancellationException;

import com.amazonaws.services.simpleworkflow.flow.core.Cancelable;
import com.amazonaws.services.simpleworkflow.flow.core.Settable;
import com.amazonaws.services.simpleworkflow.flow.core.Task;
import com.amazonaws.services.simpleworkflow.flow.core.TryCatchFinally;

/**
 * Cancels and reexecutes a command when {@link #cancelCurrentAndReexecute()} is
 * called. In case of command failures or successful completions it is not
 * reexecuted.
 * 
 * @author fateev
 */
public class AsyncCancelAndRetryExecutor implements AsyncExecutor {

    private Cancelable currentCommandTryCatchFinally;

    private Settable<Void> commandDone;

    /**
     * Used to inhibit retry in case of failures or successful completions
     */
    private boolean cancelledDueToRetryRequest;

    protected AsyncRunnable command;

    @Override
    public void execute(final AsyncRunnable cmd) {
        if (currentCommandTryCatchFinally != null) {
            throw new IllegalStateException("Already executing a command");
        }
        command = cmd;
        currentCommandTryCatchFinally = new TryCatchFinally() {

            @Override
            protected void doTry() throws Throwable {
                cmd.run();
            }

            @Override
            protected void doCatch(Throwable e) throws Throwable {
                if (e instanceof CancellationException && commandDone != null) {
                    cancelledDueToRetryRequest = true;
                }
                else {
                    throw e;
                }
            }

            @Override
            protected void doFinally() throws Throwable {
                if (!cancelledDueToRetryRequest) {
                    command = null;
                }
                if (commandDone != null) {
                    commandDone.set(null);
                }
                commandDone = null;
                currentCommandTryCatchFinally = null;
            }

        };
    }

    public void cancelCurrentAndReexecute() {
        if (currentCommandTryCatchFinally != null) {
            // Skip duplicated calls to cancelCurrentAndReexecute
            if (commandDone == null) {
                commandDone = new Settable<Void>();
                currentCommandTryCatchFinally.cancel(null);
                new Task(commandDone) {

                    @Override
                    protected void doExecute() throws Throwable {
                        if (cancelledDueToRetryRequest) {
                            execute(command);
                        }
                    }
                };
            }
        }
    }
}

