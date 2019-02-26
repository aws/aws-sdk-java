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

import com.amazonaws.codegen.emitters.CodeWriter;
import com.amazonaws.codegen.emitters.FreemarkerGeneratorTask;
import com.amazonaws.codegen.emitters.GeneratorTask;
import com.amazonaws.codegen.emitters.GeneratorTaskParams;

import java.util.Arrays;
import java.util.List;

import static com.amazonaws.codegen.internal.Constants.PROPERTIES_FILE_NAME_SUFFIX;

public class SmokeTestsGeneratorTasks extends BaseGeneratorTasks {

    private final String smokeTestsPackageDir;

    public SmokeTestsGeneratorTasks(GeneratorTaskParams params) {
        super(params);
        this.smokeTestsPackageDir = params.getPathProvider().getSmokeTestDirectory();
    }

    @Override
    protected boolean hasTasks() {
        return !model.getCustomizationConfig().isSkipSmokeTests();
    }

    @Override
    public List<GeneratorTask> createTasks() throws Exception {
        info("Emitting smoke test files");
        return Arrays.asList(
                new FreemarkerGeneratorTask(
                        smokeTestsPackageDir,
                        model.getMetadata().getCucumberModuleInjectorClassName(),
                        freemarker.getCucumberModuleInjectorTemplate(),
                        model),
                new FreemarkerGeneratorTask(
                        smokeTestsPackageDir,
                        "RunCucumberTest",
                        freemarker.getCucumberTestTemplate(),
                        model),
                new FreemarkerGeneratorTask(
                        new CodeWriter(smokeTestsPackageDir, "cucumber", PROPERTIES_FILE_NAME_SUFFIX),
                        freemarker.getCucumberPropertiesTemplate(),
                        model));
    }
}
