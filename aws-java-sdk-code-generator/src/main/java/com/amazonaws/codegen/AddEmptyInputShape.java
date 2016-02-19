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

import static com.amazonaws.codegen.internal.Constants.REQUEST_CLASS_SUFFIX;
import static com.amazonaws.codegen.internal.NameUtils.getVariableName;
import static com.amazonaws.codegen.internal.Utils.createInputShapeMarshaller;
import static com.amazonaws.codegen.internal.Utils.unCapitialize;

import java.util.HashMap;
import java.util.Map;

import com.amazonaws.codegen.model.intermediate.OperationModel;
import com.amazonaws.codegen.model.intermediate.ShapeModel;
import com.amazonaws.codegen.model.intermediate.ShapeType;
import com.amazonaws.codegen.model.intermediate.VariableModel;
import com.amazonaws.codegen.model.service.Input;
import com.amazonaws.codegen.model.service.Operation;
import com.amazonaws.codegen.model.service.ServiceModel;

/**
 * This class adds empty input shapes to those operations which doesn't accept any input params. It
 * also creates a shape model for the shape with no members in it.
 */
final class AddEmptyInputShape {

    public static Map<String, ShapeModel> addEmptyInputShapes(
                                                              Map<String, OperationModel> javaOperationMap,
                                                              ServiceModel service) {

        final Map<String, Operation> operations = service.getOperations();

        final Map<String, ShapeModel> emptyInputShapes = new HashMap<String, ShapeModel>();

        for (Map.Entry<String, Operation> entry : operations.entrySet()) {
            String operationName = entry.getKey();
            Operation operation = entry.getValue();

            Input input = operation.getInput();
            if (input == null) {
                final String inputShape = operationName + REQUEST_CLASS_SUFFIX;
                final OperationModel operationModel = javaOperationMap
                        .get(operationName);

                operationModel.setInput(new VariableModel(
                        unCapitialize(inputShape), inputShape));

                // TODO : There is no C2j shape here. Temporarily added the
                // computed shape name. Check for side effects.
                ShapeModel shape = new ShapeModel(inputShape)
                        .withType(ShapeType.Request.getValue());
                shape.setShapeName(inputShape);

                final VariableModel inputVariable = new VariableModel(
                        getVariableName(inputShape), inputShape);
                shape.setVariable(inputVariable);

                shape.setMarshaller(createInputShapeMarshaller(service.getMetadata(), operation));

                emptyInputShapes.put(inputShape, shape);

            }
        }
        return emptyInputShapes;
    }

}
