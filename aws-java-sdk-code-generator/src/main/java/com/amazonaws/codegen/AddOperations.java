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

import static com.amazonaws.codegen.internal.NameUtils.getExceptionName;
import static com.amazonaws.codegen.internal.NameUtils.getRequestClassName;
import static com.amazonaws.codegen.internal.NameUtils.getResponseClassName;
import static com.amazonaws.codegen.internal.Utils.unCapitialize;

import java.util.Map;
import java.util.TreeMap;

import com.amazonaws.codegen.model.intermediate.ExceptionModel;
import com.amazonaws.codegen.model.intermediate.OperationModel;
import com.amazonaws.codegen.model.intermediate.ReturnTypeModel;
import com.amazonaws.codegen.model.intermediate.VariableModel;
import com.amazonaws.codegen.model.service.ErrorMap;
import com.amazonaws.codegen.model.service.Input;
import com.amazonaws.codegen.model.service.Member;
import com.amazonaws.codegen.model.service.Operation;
import com.amazonaws.codegen.model.service.Output;
import com.amazonaws.codegen.model.service.ServiceModel;
import com.amazonaws.codegen.model.service.Shape;

/**
 * Constructs the operation model for every operation defined by the service.
 */
final class AddOperations {

    public static Map<String, OperationModel> constructOperations(
                                                                  ServiceModel serviceModel) {

        Map<String, OperationModel> javaOperationModels = new TreeMap<String, OperationModel>();
        Map<String, Shape> c2jShapes = serviceModel.getShapes();

        for (Map.Entry<String, Operation> entry : serviceModel.getOperations()
                .entrySet()) {

            final String operationName = entry.getKey();
            final Operation op = entry.getValue();

            OperationModel operationModel = new OperationModel();

            operationModel.setOperationName(operationName);
            operationModel.setDeprecated(op.isDeprecated());
            operationModel.setDocumentation(op.getDocumentation());

            final Input input = op.getInput();
            if (input != null) {
                String originalShapeName = input.getShape();
                String inputShape = getRequestClassName(originalShapeName,
                        operationName);
                String documentation = input.getDocumentation() != null ? input
                        .getDocumentation() : c2jShapes.get(originalShapeName)
                        .getDocumentation();

                operationModel.setInput(new VariableModel(
                        unCapitialize(inputShape), inputShape)
                        .withDocumentation(documentation));

            }

            final Output output = op.getOutput();
            if (output != null) {
                final Shape outputShape = c2jShapes.get(output.getShape());
                final String responseClassName = getResponseClassName(output.getShape(), operationName);
                final String documentation = getOperationDocumentation(output, outputShape);

                operationModel.setReturnType(new ReturnTypeModel(responseClassName).withDocumentation(documentation));
                if (isBlobShape(getPayloadShape(c2jShapes, outputShape))) {
                    operationModel.setHasBlobMemberAsPayload(true);
                }
            }

            if (op.getErrors() != null) {
                for (ErrorMap error : op.getErrors()) {

                    String documentation = error.getDocumentation() != null ? error
                            .getDocumentation() : c2jShapes.get(
                            error.getShape()).getDocumentation();

                    operationModel.addException(new ExceptionModel(
                            getExceptionName(error.getShape()))
                            .withDocumentation(documentation));
                }
            }

            // TODO: find the stream input parameter
            operationModel.setInputStreamPropertyName(null);

            javaOperationModels.put(operationName, operationModel);
        }

        return javaOperationModels;
    }

    private static String getOperationDocumentation(final Output output, final Shape outputShape) {
        return output.getDocumentation() != null ? output.getDocumentation() : outputShape.getDocumentation();
    }

    /**
     * @return True if shape is a Blob type. False otherwise
     */
    private static boolean isBlobShape(Shape shape) {
        return shape != null && "blob".equals(shape.getType());
    }

    /**
     * If there is a member in the output shape that is explicitly marked as the payload (with the
     * payload trait) this method returns the target shape of that member. Otherwise this method
     * returns null.
     * 
     * @param c2jShapes
     *            All C2J shapes
     * @param outputShape
     *            Output shape of operation that may contain a member designated as the payload
     */
    public static Shape getPayloadShape(Map<String, Shape> c2jShapes, Shape outputShape) {
        if (outputShape.getPayload() == null) {
            return null;
        }
        Member payloadMember = outputShape.getMembers().get(outputShape.getPayload());
        return c2jShapes.get(payloadMember.getShape());
    }
}
