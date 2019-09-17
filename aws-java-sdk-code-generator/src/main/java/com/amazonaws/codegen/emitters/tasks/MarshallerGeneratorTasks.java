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

import static com.amazonaws.codegen.utils.FunctionalUtils.safeFunction;

import com.amazonaws.codegen.emitters.FreemarkerGeneratorTask;
import com.amazonaws.codegen.emitters.GeneratorTask;
import com.amazonaws.codegen.emitters.GeneratorTaskParams;
import com.amazonaws.codegen.model.intermediate.Metadata;
import com.amazonaws.codegen.model.intermediate.Protocol;
import com.amazonaws.codegen.model.intermediate.ShapeModel;
import com.amazonaws.codegen.model.intermediate.ShapeType;
import com.amazonaws.util.ImmutableMapParameter;
import freemarker.template.Template;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
                .flatMap(safeFunction(e -> createTask(e.getKey(), e.getValue())))
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

    private Stream<GeneratorTask> createTask(String javaShapeName, ShapeModel shapeModel) throws Exception {
        if (shapeModel.getShapeType() == ShapeType.Request && metadata.isJsonProtocol()) {
            return Stream.of(
                    createMarshallerTask(javaShapeName,
                                         freemarker.getRequestMarshallerTemplate(),
                                         javaShapeName + "ProtocolMarshaller"),
                    createMarshallerTask(javaShapeName,
                                         freemarker.getModelMarshallerTemplate(),
                                         javaShapeName + "Marshaller"));
        } else {
            return Stream.of(
                    createMarshallerTask(javaShapeName,
                                         freemarker.getModelMarshallerTemplate(),
                                         javaShapeName + "Marshaller"));
        }
    }

    private GeneratorTask createMarshallerTask(String javaShapeName, Template template, String marshallerClassName) throws
                                                                                                                    IOException {
        Map<String, Object> marshallerDataModel = ImmutableMapParameter.<String, Object>builder()
                .put("fileHeader", model.getFileHeader())
                .put("shapeName", javaShapeName)
                .put("shapes", shapes)
                .put("metadata", metadata)
                .put("transformPackage", model.getTransformPackage())
                .put("customConfig", model.getCustomizationConfig())
                .put("className", marshallerClassName)
                .put("protocolEnum", getProtocolEnumName())
                .build();

        return new FreemarkerGeneratorTask(transformClassDir,
                                           marshallerClassName,
                                           template,
                                           marshallerDataModel);
    }

    private String getProtocolEnumName() {
        switch (metadata.getProtocol()) {
            case CBOR:
            case ION:
            case AWS_JSON:
                return Protocol.AWS_JSON.name();
            default:
                return metadata.getProtocol().name();
        }
    }

}
