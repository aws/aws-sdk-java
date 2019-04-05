/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.codegen.emitters;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class GeneratorTaskExecutor {

    private static final boolean DEBUG = false;

    private final List<Future<?>> futures = new ArrayList<>();
    private final ExecutorService executor = Executors.newFixedThreadPool(10);

    public void submit(GeneratorTask task) {
        if (DEBUG) {
            try {
                task.call();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            futures.add(executor.submit(task));
        }
    }

    public void waitForCompletion() throws InterruptedException, ExecutionException {
        Exception firstEx = null;
        for (Future<?> future : futures) {
            try {
                future.get();
            } catch (Exception e) {
                if (firstEx == null) {
                    firstEx = e;
                }
            }
        }
        if (firstEx instanceof ExecutionException) {
            throw (ExecutionException) firstEx;
        } else if (firstEx instanceof InterruptedException) {
            throw (InterruptedException) firstEx;
        } else if (firstEx instanceof RuntimeException) {
            throw (RuntimeException) firstEx;
        }
    }

    public void shutdown() {
        executor.shutdown();
    }
}
