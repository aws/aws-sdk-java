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
import com.amazonaws.codegen.internal.Utils;
import com.amazonaws.codegen.model.config.BasicCodeGenConfig;
import com.amazonaws.codegen.model.config.customization.CustomizationConfig;
import com.amazonaws.codegen.model.intermediate.*;
import com.amazonaws.codegen.model.service.ServiceModel;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static com.amazonaws.codegen.AddEmptyInputShape.addEmptyInputShapes;
import static com.amazonaws.codegen.AddMetadata.constructMetadata;
import static com.amazonaws.codegen.AddOperations.constructOperations;
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

    public IntermediateModelBuilder(CustomizationConfig customConfig,
            BasicCodeGenConfig codeGenConfig, ServiceModel service,
            ServiceExamples examples) {
        this.customConfig = customConfig;
        this.codeGenConfig = codeGenConfig;
        this.service = service;
        this.examples = examples;
    }

    public IntermediateModel build() {

        CodegenCustomizationProcessor customization = DefaultCustomizationProcessor
                .getProcessorFor(customConfig);

        customization.preprocess(service);

        Map<String, OperationModel> operations = new TreeMap<String, OperationModel>();
        Map<String, ShapeModel> shapes = new HashMap<String, ShapeModel>();

        operations.putAll(constructOperations(service));

        shapes.putAll(new AddInputShapes(service, customConfig).constructInputShapes());
        shapes.putAll(new AddOutputShapes(service, customConfig).constructOutputShapes());
        shapes.putAll(new AddExceptionShapes(service, customConfig).constructExceptionShapes());
        shapes.putAll(new AddModelShapes(service, customConfig)
                     .constructModelShapes(shapes.keySet())); // shapes to skip
        shapes.putAll(addEmptyInputShapes(operations, service));

        System.out.println(shapes.size() + " shapes found in total.");

        IntermediateModel fullModel =  new IntermediateModel(
                constructMetadata(service, codeGenConfig, customConfig),
                operations,
                shapes,
                customConfig,
                examples);

        customization.postprocess(fullModel);

        System.out.println(fullModel.getShapes().size() + " shapes remained after " +
                "applying customizations.");

        shapes = removeUnusedShapes(fullModel);

        System.out.println(shapes.size() + " shapes remained after removing unused shapes.");

        IntermediateModel trimmedModel = new IntermediateModel(
                fullModel.getMetadata(),
                fullModel.getOperations(),
                shapes,
                fullModel.getCustomizationConfig(),
                fullModel.getExamples());

        linkMembersToShapes(trimmedModel);

        return trimmedModel;
    }

    /**
     * Link the member to it's corresponding shape (if it exists).
     *
     * @param model
     *         Final IntermediateModel
     */
    private void linkMembersToShapes(IntermediateModel model) {
        for (Map.Entry<String, ShapeModel> entry : model.getShapes().entrySet()) {
            if (entry.getValue().getMembers() != null) {
                for (MemberModel member : entry.getValue().getMembers()) {
                    member.setShape(Utils.findShapeModelByC2jNameIfExists(model, member.getC2jShape()));
                }
            }
        }
    }
}
