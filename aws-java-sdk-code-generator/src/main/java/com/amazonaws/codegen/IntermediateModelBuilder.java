/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.codegen;

import com.amazonaws.codegen.customization.CodegenCustomizationProcessor;
import com.amazonaws.codegen.customization.processors.DefaultCustomizationProcessor;
import com.amazonaws.codegen.internal.TypeUtils;
import com.amazonaws.codegen.internal.Utils;
import com.amazonaws.codegen.model.config.BasicCodeGenConfig;
import com.amazonaws.codegen.model.config.customization.CustomizationConfig;
import com.amazonaws.codegen.model.intermediate.*;
import com.amazonaws.codegen.model.service.Operation;
import com.amazonaws.codegen.model.service.ServiceModel;
import com.amazonaws.codegen.model.service.Waiters;
import com.amazonaws.codegen.naming.DefaultNamingStrategy;
import com.amazonaws.codegen.naming.NamingStrategy;
import com.amazonaws.util.StringUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static com.amazonaws.codegen.AddMetadata.constructMetadata;
import static com.amazonaws.codegen.RemoveUnusedShapes.removeUnusedShapes;

/**
 * Builds an intermediate model to be used by the templates from the service model and
 * customizations.
 */
public class IntermediateModelBuilder {

    private final CustomizationConfig customConfig;
    private final BasicCodeGenConfig codeGenConfig;
    private final ServiceModel service;
    private final ServiceExamples examples;
    private final NamingStrategy namingStrategy;
    private final TypeUtils typeUtils;
    private final List<IntermediateModelShapeProcessor> shapeProcessors;
    private final Waiters waiters;

    public IntermediateModelBuilder(CustomizationConfig customConfig,
                                    BasicCodeGenConfig codeGenConfig, ServiceModel service,
                                    ServiceExamples examples, Waiters waiters) {
        this.customConfig = customConfig;
        this.codeGenConfig = codeGenConfig;
        this.service = service;
        this.examples = examples;
        this.namingStrategy = new DefaultNamingStrategy(service, codeGenConfig, customConfig);
        this.typeUtils = new TypeUtils(namingStrategy);
        this.shapeProcessors = createShapeProcessors();
        this.waiters = waiters;
    }

    /**
     * Create default shape processors.
     */
    private List<IntermediateModelShapeProcessor> createShapeProcessors() {
        final List<IntermediateModelShapeProcessor> processors = new ArrayList<>();
        processors.add(new AddInputShapes(this));
        processors.add(new AddOutputShapes(this));
        processors.add(new AddExceptionShapes(this));
        processors.add(new AddModelShapes(this));
        processors.add(new AddEmptyInputShape(this));
        processors.add(new AddEmptyOutputShape(this));
        return processors;
    }

    public IntermediateModel build() throws IOException{
        // Note: This needs to come before any pre/post processing of the
        // models, as the transformer must have access to the original shapes,
        // before any customizations have been applied (which modifies them).
        System.out.println("Applying customizations to examples...");
        new ExamplesCustomizer(service, customConfig).applyCustomizationsToExamples(examples);
        System.out.println("Examples customized.");

        CodegenCustomizationProcessor customization = DefaultCustomizationProcessor
                .getProcessorFor(customConfig);

        customization.preprocess(service);

        final Map<String, OperationModel> operations = new TreeMap<>();
        final Map<String, ShapeModel> shapes = new HashMap<>();
        final Map<String, WaiterDefinitionModel> waiters = new HashMap<>();

        operations.putAll(new AddOperations(this).constructOperations());
        waiters.putAll(new AddWaiters(this.waiters, operations).constructWaiters());

        for (IntermediateModelShapeProcessor processor : shapeProcessors) {
            shapes.putAll(processor.process(Collections.unmodifiableMap(operations),
                                            Collections.unmodifiableMap(shapes)));
        }

        System.out.println(shapes.size() + " shapes found in total.");

        IntermediateModel fullModel = new IntermediateModel(
                constructMetadata(service, codeGenConfig, customConfig), operations, shapes,
                customConfig, examples, waiters);

        customization.postprocess(fullModel);

        System.out.println(fullModel.getShapes().size() + " shapes remained after " +
                           "applying customizations.");

        Map<String, ShapeModel> trimmedShapes = removeUnusedShapes(fullModel);

        System.out.println(trimmedShapes.size() + " shapes remained after removing unused shapes.");

        IntermediateModel trimmedModel = new IntermediateModel(fullModel.getMetadata(),
                                                               fullModel.getOperations(),
                                                               trimmedShapes,
                                                               fullModel.getCustomizationConfig(),
                                                               fullModel.getExamples(),
                                                               fullModel.getWaiters());

        linkMembersToShapes(trimmedModel);
        linkOperationsToInputOutputShapes(trimmedModel);

        return trimmedModel;
    }

    /**
     * Link the member to it's corresponding shape (if it exists).
     *
     * @param model Final IntermediateModel
     */
    private void linkMembersToShapes(IntermediateModel model) {
        for (Map.Entry<String, ShapeModel> entry : model.getShapes().entrySet()) {
            if (entry.getValue().getMembers() != null) {
                for (MemberModel member : entry.getValue().getMembers()) {
                    member.setShape(
                            Utils.findShapeModelByC2jNameIfExists(model, member.getC2jShape()));
                }
            }
        }
    }

    private void linkOperationsToInputOutputShapes(IntermediateModel model) {
        for (Map.Entry<String, OperationModel> entry : model.getOperations().entrySet()) {
            Operation operation = service.getOperations().get(entry.getKey());
            if (operation.getInput() != null) {
                String inputShapeName = operation.getInput().getShape();
                entry.getValue().setInputShape(model.getShapeByC2jName(inputShapeName));
            }
            if (operation.getOutput() != null) {
                String outputShapeName = operation.getOutput().getShape();
                // TODO need to figure this out for wrapper outputs.
                // See [JAVA-1556]

                // Only link when output shape is not a result wrapper. When it is a result wrapper
                // we only preserve the single member the wrapper has in the intermediate model
                // so this lookup will fail.
                if (StringUtils.isNullOrEmpty(operation.getOutput().getResultWrapper())) {
                    entry.getValue().setOutputShape(model.getShapeByC2jName(outputShapeName));
                }
            }

        }
    }

    public CustomizationConfig getCustomConfig() {
        return customConfig;
    }

    public BasicCodeGenConfig getCodeGenConfig() {
        return codeGenConfig;
    }

    public ServiceModel getService() {
        return service;
    }

    public ServiceExamples getExamples() {
        return examples;
    }

    public NamingStrategy getNamingStrategy() {
        return namingStrategy;
    }

    public TypeUtils getTypeUtils() {
        return typeUtils;
    }

}
