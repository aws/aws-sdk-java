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

import com.amazonaws.codegen.model.config.customization.CustomizationConfig;
import com.amazonaws.codegen.model.intermediate.OperationModel;
import com.amazonaws.codegen.model.intermediate.ReturnTypeModel;
import com.amazonaws.codegen.model.intermediate.ShapeModel;
import com.amazonaws.codegen.model.intermediate.ShapeType;
import com.amazonaws.codegen.model.intermediate.ShapeUnmarshaller;
import com.amazonaws.codegen.model.intermediate.VariableModel;
import com.amazonaws.codegen.model.service.Operation;
import com.amazonaws.codegen.model.service.Output;
import com.amazonaws.codegen.model.service.ServiceModel;
import com.amazonaws.codegen.naming.NamingStrategy;
import java.util.HashMap;
import java.util.Map;

public class AddEmptyOutputShape implements IntermediateModelShapeProcessor {

    private final ServiceModel serviceModel;
    private final CustomizationConfig customizationConfig;
    private final NamingStrategy namingStrategy;

    public AddEmptyOutputShape(IntermediateModelBuilder builder) {
        this.serviceModel = builder.getService();
        this.customizationConfig = builder.getCustomConfig();
        this.namingStrategy = builder.getNamingStrategy();
    }

    @Override
    public Map<String, ShapeModel> process(Map<String, OperationModel> currentOperations,
                                           Map<String, ShapeModel> currentShapes) {
        if (customizationConfig.useModeledOutputShapeNames()) {
            return currentShapes;
        } else {
            return addEmptyOutputShapes(currentOperations);
        }

    }

    private Map<String, ShapeModel> addEmptyOutputShapes(
            Map<String, OperationModel> currentOperations) {
        final Map<String, Operation> operations = serviceModel.getOperations();

        final Map<String, ShapeModel> emptyOutputShapes = new HashMap<>();

        for (Map.Entry<String, Operation> entry : operations.entrySet()) {
            String operationName = entry.getKey();
            Operation operation = entry.getValue();

            Output output = operation.getOutput();
            if (output == null) {
                final String outputShape = namingStrategy.getResponseClassName(operationName);
                final OperationModel operationModel = currentOperations.get(operationName);

                operationModel.setReturnType(new ReturnTypeModel(outputShape));

                ShapeModel shape = new ShapeModel(outputShape)
                        .withType(ShapeType.Response.getValue());
                shape.setShapeName(outputShape);

                final VariableModel outputVariable = new VariableModel(
                        namingStrategy.getVariableName(outputShape), outputShape);
                shape.setVariable(outputVariable);
                shape.setUnmarshaller(new ShapeUnmarshaller());

                emptyOutputShapes.put(outputShape, shape);
            }
        }
        return emptyOutputShapes;
    }

}
