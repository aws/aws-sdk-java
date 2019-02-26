/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.codegen.internal.ImmutableMapParameter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EndpointDiscoveryGeneratorTasks extends BaseGeneratorTasks {

    private final String endpointDiscoveryDir;

    public EndpointDiscoveryGeneratorTasks(GeneratorTaskParams dependencies) {
        super(dependencies);
        this.endpointDiscoveryDir = dependencies.getPathProvider().getEndpointDiscoveryDirectory();
    }

    @Override
    protected List<GeneratorTask> createTasks() throws Exception {
        List<GeneratorTask> generatorTasks = new ArrayList<>();
        if (model.getEndpointOperation() != null) {

            String cacheName = model.getMetadata().getSyncInterface() + "EndpointCache";
            String cacheLoaderName = model.getMetadata().getSyncInterface() + "EndpointCacheLoader";

            Map<String, Object> cachedataModel = ImmutableMapParameter.of(
                    "fileHeader", model.getFileHeader(),
                    "className", cacheName,
                    "endpointOperation", model.getEndpointOperation(),
                    "metadata", model.getMetadata());

            Map<String, Object> loaderDataModel = ImmutableMapParameter.of(
                    "fileHeader", model.getFileHeader(),
                    "className", cacheLoaderName,
                    "endpointOperation", model.getEndpointOperation(),
                    "metadata", model.getMetadata());

            generatorTasks.add(new FreemarkerGeneratorTask(endpointDiscoveryDir, cacheName, freemarker.getEndpointDiscoveryCacheTemplate(), cachedataModel));
            generatorTasks.add(new FreemarkerGeneratorTask(endpointDiscoveryDir, cacheLoaderName, freemarker.getEndpointDiscoveryCacheLoaderTemplate(), loaderDataModel));
        }

        return generatorTasks;
    }
}
