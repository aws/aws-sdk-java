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

import com.amazonaws.codegen.emitters.FreemarkerGeneratorTask;
import com.amazonaws.codegen.emitters.GeneratorTask;
import com.amazonaws.codegen.emitters.GeneratorTaskParams;
import com.amazonaws.util.ImmutableMapParameter;

import java.util.Collections;
import java.util.List;

public class BaseExceptionClassGeneratorTasks extends BaseGeneratorTasks {

    private final String modelClassDir;

    public BaseExceptionClassGeneratorTasks(GeneratorTaskParams dependencies) {
        super(dependencies);
        this.modelClassDir = dependencies.getPathProvider().getModelDirectory();
    }

    /**
     * If a custom base class is provided we assume it already exists and does not need to be generated
     */
    @Override
    protected boolean hasTasks() {

        return model.getCustomizationConfig().getSdkModeledExceptionBaseClassName() == null;
    }

    @Override
    protected List<GeneratorTask> createTasks() throws Exception {
        info("Emitting Base Service Exception class");
        final String baseClassName = model.getSdkModeledExceptionBaseClassName();
        return Collections.singletonList(
                new FreemarkerGeneratorTask(modelClassDir,
                                            baseClassName,
                                            freemarker.getBaseExceptionClassTemplate(),
                                            ImmutableMapParameter.of(
                                                    "fileHeader", model.getFileHeader(),
                                                    "className", baseClassName,
                                                    "metadata", model.getMetadata(),
                                                    "baseExceptionFqcn", model.getServiceBaseExceptionFqcn())));
    }

}
