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
import com.amazonaws.codegen.model.intermediate.AuthorizerModel;
import com.amazonaws.codegen.model.intermediate.Metadata;
import com.amazonaws.util.ImmutableMapParameter;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.amazonaws.codegen.utils.FunctionalUtils.safeFunction;

public class AuthorizerGeneratorTasks extends BaseGeneratorTasks {

    private final String customRequestSignerDir;

    public AuthorizerGeneratorTasks(GeneratorTaskParams dependencies) {
        super(dependencies);
        this.customRequestSignerDir = dependencies.getPathProvider().getAuthorizerDirectory();
    }

    @Override
    protected boolean hasTasks() {
        return !model.getCustomAuthorizers().isEmpty();
    }

    @Override
    protected List<GeneratorTask> createTasks() throws Exception {
        info("Emitting Authorizer interfaces");
        return model.getCustomAuthorizers().values()
                .stream()
                .map(safeFunction(this::createTask))
                .collect(Collectors.toList());
    }

    private GeneratorTask createTask(AuthorizerModel customAuthorizer) throws Exception {
        Metadata metadata = model.getMetadata();
        Map<String, Object> dataModel = ImmutableMapParameter.of(
                "fileHeader", model.getFileHeader(),
                "className", customAuthorizer.getInterfaceName(),
                "authorizer", customAuthorizer,
                "metadata", metadata);
        return new FreemarkerGeneratorTask(customRequestSignerDir,
                                           customAuthorizer.getInterfaceName(),
                                           freemarker.getCustomAuthorizerTemplate(),
                                           dataModel);
    }
}
