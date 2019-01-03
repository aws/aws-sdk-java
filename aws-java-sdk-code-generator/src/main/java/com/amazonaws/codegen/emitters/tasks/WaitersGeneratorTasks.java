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
import com.amazonaws.codegen.model.intermediate.Metadata;
import com.amazonaws.codegen.model.intermediate.WaiterDefinitionModel;
import com.amazonaws.util.ImmutableMapParameter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WaitersGeneratorTasks extends BaseGeneratorTasks {

    private final String waiterClassDir;

    public WaitersGeneratorTasks(GeneratorTaskParams dependencies) {
        super(dependencies);
        this.waiterClassDir = dependencies.getPathProvider().getWaitersDirectory();
    }

    @Override
    protected boolean hasTasks() {
        return model.getHasWaiters();
    }

    @Override
    protected List<GeneratorTask> createTasks() throws Exception {
        info("Emitting waiter classes");
        return Stream.of(createWaiterOpFunctionClassTasks(), createWaiterAcceptorClassTasks(), createWaiterClassTasks())
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    /**
     * Constructs the data model and submits tasks for every generating SDKFunction for every unique operation in the waiter
     * intermediate model
     */
    private List<GeneratorTask> createWaiterOpFunctionClassTasks() throws IOException {
        List<GeneratorTask> generatorTasks = new ArrayList<>();
        List<String> generatedOperations = new ArrayList<>();
        for (Map.Entry<String, WaiterDefinitionModel> entry : model.getWaiters().entrySet()) {

            final WaiterDefinitionModel waiterModel = entry.getValue();

            if (!generatedOperations.contains(waiterModel.getOperationName())) {
                generatedOperations.add(waiterModel.getOperationName());
                Map<String, Object> dataModel = ImmutableMapParameter.of(
                        "fileHeader", model.getFileHeader(),
                        "waiter", waiterModel,
                        "operation", model.getOperation(waiterModel.getOperationName()),
                        "metadata", model.getMetadata());

                final String className = waiterModel.getOperationModel().getOperationName() + "Function";

                generatorTasks.add(new FreemarkerGeneratorTask(waiterClassDir,
                                                               className,
                                                               freemarker.getWaiterSDKFunctionTemplate(),
                                                               dataModel));
            }
        }
        return generatorTasks;
    }

    /**
     * Constructs the data model and submits tasks for every generating Acceptor for each waiter definition in the intermediate
     * model
     */
    private List<GeneratorTask> createWaiterAcceptorClassTasks() throws IOException {
        List<GeneratorTask> generatorTasks = new ArrayList<>();
        for (Map.Entry<String, WaiterDefinitionModel> entry : model.getWaiters().entrySet()) {
            if (containsAllStatusMatchers(entry)) {
                continue;
            }

            final String waiterName = entry.getKey();
            final WaiterDefinitionModel waiterModel = entry.getValue();

            Map<String, Object> dataModel = ImmutableMapParameter.of(
                    "fileHeader", model.getFileHeader(),
                    "waiter", waiterModel,
                    "operation", model.getOperation(waiterModel.getOperationName()),
                    "metadata", model.getMetadata());

            generatorTasks.add(new FreemarkerGeneratorTask(waiterClassDir,
                                                           waiterName,
                                                           freemarker.getWaiterAcceptorTemplate(),
                                                           dataModel));

        }
        return generatorTasks;
    }

    private static boolean containsAllStatusMatchers(Map.Entry<String, WaiterDefinitionModel> entry) {
        return entry.getValue().getAcceptors().stream()
                .allMatch(a -> a.getMatcher().equals("status"));
    }

    /**
     * Constructs the data model and submits tasks for every generating synchronous waiter and asynchronous waiter for each waiter
     * in the intermediate model.
     */
    private List<GeneratorTask> createWaiterClassTasks() throws IOException {
        Metadata metadata = model.getMetadata();
        final String className = metadata.getSyncInterface() + "Waiters";
        Map<String, Object> dataModel = ImmutableMapParameter.of(
                "fileHeader", model.getFileHeader(),
                "className", className,
                "waiters", model.getWaiters(),
                "operation", model.getOperations(),
                "metadata", metadata);

        return Collections.singletonList(new FreemarkerGeneratorTask(waiterClassDir,
                                                                     className,
                                                                     freemarker.getWaiterTemplate(),
                                                                     dataModel));
    }
}
