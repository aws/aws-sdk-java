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

import com.amazonaws.codegen.model.intermediate.OperationModel;
import com.amazonaws.codegen.model.intermediate.ShapeModel;
import com.amazonaws.codegen.model.intermediate.ShapeType;
import com.amazonaws.codegen.model.service.Input;
import com.amazonaws.codegen.model.service.Operation;

import java.util.HashMap;
import java.util.Map;

import static com.amazonaws.codegen.internal.Utils.createInputShapeMarshaller;

/**
 * Constructs the request shapes for the intermediate model. Analyzes the operations in the service
 * model to identify the request shapes that are to be generated.
 */
final class AddInputShapes extends AddShapes implements IntermediateModelShapeProcessor {

    AddInputShapes(IntermediateModelBuilder builder) {
        super(builder);
    }

    @Override
    public Map<String, ShapeModel> process(Map<String, OperationModel> currentOperations,
                                           Map<String, ShapeModel> currentShapes) {
        return constructInputShapes();
    }

    private Map<String, ShapeModel> constructInputShapes() {
        // Java input shape models, to be constructed
        final Map<String, ShapeModel> javaShapes = new HashMap<String, ShapeModel>();

        for (Map.Entry<String, Operation> entry : getServiceModel().getOperations().entrySet()) {

            String operationName = entry.getKey();
            Operation operation = entry.getValue();

            Input input = operation.getInput();

            if (input != null) {

                String javaRequestShapeName = getNamingStrategy()
                        .getRequestClassName(operationName);

                ShapeModel inputShape = generateInputShapeModel(operation, javaRequestShapeName);

                if (inputShape.getDocumentation() == null) {
                    inputShape.setDocumentation(input.getDocumentation());
                }

                javaShapes.put(javaRequestShapeName, inputShape);
            }
        }

        return javaShapes;
    }

    private ShapeModel generateInputShapeModel(Operation operation,
                                               String javaInputShapeNameOverride) {
        Input input = operation.getInput();
        String inputShapeName = input.getShape();

        ShapeModel shapeModel = generateShapeModel(javaInputShapeNameOverride, inputShapeName);
        shapeModel.setType(ShapeType.Request.getValue());
        shapeModel.setMarshaller(
                createInputShapeMarshaller(getServiceModel().getMetadata(), operation));

        return shapeModel;
    }
}
