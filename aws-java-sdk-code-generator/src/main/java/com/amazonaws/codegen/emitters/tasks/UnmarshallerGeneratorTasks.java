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
import com.amazonaws.codegen.model.intermediate.ShapeModel;
import com.amazonaws.codegen.model.intermediate.ShapeType;
import com.amazonaws.util.ImmutableMapParameter;

import freemarker.template.Template;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.amazonaws.codegen.utils.FunctionalUtils.safeFunction;

public class UnmarshallerGeneratorTasks extends BaseGeneratorTasks {

    private final String transformClassDir;
    private final Metadata metadata;

    public UnmarshallerGeneratorTasks(GeneratorTaskParams dependencies) {
        super(dependencies);
        this.transformClassDir = dependencies.getPathProvider().getTransformDirectory();
        this.metadata = dependencies.getModel().getMetadata();
    }

    @Override
    protected List<GeneratorTask> createTasks() throws Exception {
        info("Emitting unmarshaller classes");
        return model.getShapes().entrySet().stream()
                .filter(e -> shouldGenerate(e.getValue()))
                .map(safeFunction(e -> createTask(e.getKey(), e.getValue())))
                .collect(Collectors.toList());
    }

    private GeneratorTask createTask(String javaShapeName, ShapeModel shapeModel) throws Exception {
        final Template template = freemarker.getModelUnmarshallerTemplate();
        final ShapeType shapeType = shapeModel.getShapeType();
        Map<String, Object> dataModel = ImmutableMapParameter.<String, Object>builder()
                .put("fileHeader", model.getFileHeader())
                .put("shape", shapeModel)
                .put("metadata", metadata)
                .put("transformPackage", model.getTransformPackage())
                .put("exceptionUnmarshallerImpl", model.getExceptionUnmarshallerImpl())
                .build();

        switch (shapeType) {
            case Response:
            case Model: {
                String unmarshallerNameSuffix = metadata.isJsonProtocol() ? "JsonUnmarshaller" : "StaxUnmarshaller";
                return new FreemarkerGeneratorTask(transformClassDir,
                                         javaShapeName + unmarshallerNameSuffix,
                                                   template,
                                                   dataModel);
            }
            case Exception: {
                return new FreemarkerGeneratorTask(transformClassDir,
                                         javaShapeName + "Unmarshaller",
                                                   freemarker.getExceptionUnmarshallerTemplate(),
                                                   dataModel);
            }
        }
        // If shape doesn't need an umarshaller generated it should have been filtered out already
        throw new IllegalStateException(shapeModel.getC2jName() + " is not supported for unmarshaller generation");
    }

    private boolean shouldGenerate(ShapeModel shapeModel) {
        if (shapeModel.getCustomization().isSkipGeneratingUnmarshaller()) {
            System.out.println("Skip generating unmarshaller class for " + shapeModel.getShapeName());
            return false;
        }
        return shouldGenerate(shapeModel.getShapeType());
    }

    private boolean shouldGenerate(ShapeType shapeType) {
        switch (shapeType) {
            case Response:
            case Model:
                return true;
            case Exception:
                // Generating Exception Unmarshallers is not required for the JSON protocol
                return !metadata.isJsonProtocol();
        }
        return false;
    }

}
