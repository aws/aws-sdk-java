/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class MarshallerGeneratorTasks extends BaseGeneratorTasks {

    private final String transformClassDir;
    private final Metadata metadata;
    private final Map<String, ShapeModel> shapes;

    public MarshallerGeneratorTasks(GeneratorTaskParams dependencies) {
        super(dependencies);
        this.transformClassDir = dependencies.getPathProvider().getTransformDirectory();
        this.metadata = model.getMetadata();
        this.shapes = model.getShapes();
    }

    @Override
    protected List<GeneratorTask> createTasks() throws Exception {
        info("Emitting marshaller classes");
        return model.getShapes().entrySet().stream()
                .filter(e -> shouldGenerate(e.getValue()))
                .map(safeFunction(e -> createTask(e.getKey(), e.getValue())))
                .collect(Collectors.toList());
    }

    private boolean shouldGenerate(ShapeModel shapeModel) {
        if (shapeModel.getCustomization().isSkipGeneratingMarshaller()) {
            System.out.println("Skip generating marshaller class for " + shapeModel.getShapeName());
            return false;
        }
        return shouldGenerate(shapeModel.getShapeType());
    }

    private boolean shouldGenerate(ShapeType shapeType) {
        return ShapeType.Request == shapeType || (ShapeType.Model == shapeType && metadata.isJsonProtocol());
    }

    private GeneratorTask createTask(String javaShapeName, ShapeModel shapeModel) throws Exception {
        final Template template = freemarker.getModelMarshallerTemplate();
        final ShapeType shapeType = shapeModel.getShapeType();

        Map<String, Object> marshallerDataModel = ImmutableMapParameter.of(
                "fileHeader", model.getFileHeader(),
                "shapeName", javaShapeName,
                "shapes", shapes,
                "metadata", metadata,
                "customConfig", model.getCustomizationConfig());

        return new FreemarkerGeneratorTask(transformClassDir,
                                           getMarshallerClassName(shapeType, javaShapeName, metadata),
                                           template,
                                           marshallerDataModel);
    }

    private String getMarshallerClassName(ShapeType shapeType, String shapeName, Metadata metadata) {
        if (ShapeType.Request == shapeType) {
            return shapeName + "Marshaller";
        } else if ((ShapeType.Model == shapeType) && (metadata.isJsonProtocol())) {
            return shapeName + "JsonMarshaller";
        }
        throw new IllegalArgumentException("Not able generate marshaller class name for " + shapeName + " type "
                                           + shapeType.getValue());
    }
}
