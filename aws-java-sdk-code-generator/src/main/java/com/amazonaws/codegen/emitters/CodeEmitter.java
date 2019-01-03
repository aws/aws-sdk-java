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

/**
 * Submits generator tasks to executor.
 */
public class CodeEmitter implements AutoCloseable {

    private final Iterable<GeneratorTask> generatorTasks;
    private final GeneratorTaskExecutor taskExecutor;

    /**
     * @param generatorTasks Provides tasks to execute.
     * @param taskExecutor   Executes tasks.
     */
    public CodeEmitter(Iterable<GeneratorTask> generatorTasks, GeneratorTaskExecutor taskExecutor) {
        this.generatorTasks = generatorTasks;
        this.taskExecutor = taskExecutor;
    }

    public void emit() {
        generatorTasks.forEach(taskExecutor::submit);
    }

    @Override
    public void close() throws Exception {
        taskExecutor.waitForCompletion();
        taskExecutor.shutdown();
    }

}
