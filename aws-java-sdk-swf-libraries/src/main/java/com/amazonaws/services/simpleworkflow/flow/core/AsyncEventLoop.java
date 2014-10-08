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

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;

class AsyncEventLoop implements Executor {

    private final Queue<Runnable> tasks = new LinkedList<Runnable>();

    @Override
    public void execute(Runnable task) {
        synchronized (tasks) {
            tasks.add(task);
        }
    }

    public void executeAllQueued() {
        while (executeQueuedTask()) {

        }
    }

    public boolean executeQueuedTask() {
        synchronized (tasks) {
            Runnable task = tasks.peek();
            if (task == null) {
                return false;
            }
            task.run();
            tasks.remove();
            return true;
        }
    }

}
