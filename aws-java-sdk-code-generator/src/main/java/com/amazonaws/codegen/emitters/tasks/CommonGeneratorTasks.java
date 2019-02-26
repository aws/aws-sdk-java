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
package com.amazonaws.codegen.emitters.tasks;

import com.amazonaws.codegen.emitters.GeneratorTask;
import com.amazonaws.codegen.emitters.GeneratorTaskParams;
import com.amazonaws.codegen.utils.CompositeIterable;

import java.util.Iterator;

/**
 * Common generator tasks.
 */
class CommonGeneratorTasks implements Iterable<GeneratorTask> {

    private final Iterable<GeneratorTask> tasks;

    CommonGeneratorTasks(GeneratorTaskParams params) {
        this.tasks = createTasks(params);
    }

    private Iterable<GeneratorTask> createTasks(GeneratorTaskParams params) {
        return new CompositeIterable<>(new SyncClientGeneratorTasks(params),
                                       new MarshallerGeneratorTasks(params),
                                       new UnmarshallerGeneratorTasks(params),
                                       new ModelClassGeneratorTasks(params),
                                       new PackageInfoGeneratorTasks(params),
                                       new BaseExceptionClassGeneratorTasks(params));
    }

    @Override
    public Iterator<GeneratorTask> iterator() {
        return tasks.iterator();
    }
}
