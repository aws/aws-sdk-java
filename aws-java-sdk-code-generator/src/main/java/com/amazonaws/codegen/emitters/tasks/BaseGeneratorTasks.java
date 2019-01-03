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
import com.amazonaws.codegen.internal.Freemarker;
import com.amazonaws.codegen.model.intermediate.IntermediateModel;

import org.apache.commons.logging.Log;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class BaseGeneratorTasks implements Iterable<GeneratorTask> {

    protected final IntermediateModel model;
    protected final Freemarker freemarker;
    protected final Log log;

    public BaseGeneratorTasks(GeneratorTaskParams dependencies) {
        this.model = dependencies.getModel();
        this.freemarker = dependencies.getFreemarker();
        this.log = dependencies.getLog();
    }

    protected void info(String message) {
        log.info(message);
    }

    /**
     * Hook to allow subclasses to indicate they have no tasks so they can assume when createTasks is called there's something to
     * emit.
     */
    protected boolean hasTasks() {
        return true;
    }

    protected abstract List<GeneratorTask> createTasks() throws Exception;

    @Override
    public Iterator<GeneratorTask> iterator() {
        try {
            if (hasTasks()) {
                return createTasks().iterator();
            } else {
                return Collections.<GeneratorTask>emptyList().iterator();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
