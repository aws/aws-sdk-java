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

import com.amazonaws.codegen.internal.Utils;
import com.amazonaws.codegen.model.intermediate.OperationModel;
import com.amazonaws.codegen.model.intermediate.ShapeModel;
import com.amazonaws.codegen.model.intermediate.ShapeType;
import com.amazonaws.codegen.model.service.ErrorMap;
import com.amazonaws.codegen.model.service.ErrorTrait;
import com.amazonaws.codegen.model.service.Operation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Constructs the exception shapes for the intermediate model. Analyzes the operations in the
 * service model to identify the exception shapes that are to be generated.
 */
final class AddExceptionShapes extends AddShapes implements IntermediateModelShapeProcessor {

    AddExceptionShapes(IntermediateModelBuilder builder) {
        super(builder);
    }

    @Override
    public Map<String, ShapeModel> process(Map<String, OperationModel> currentOperations,
                                           Map<String, ShapeModel> currentShapes) {
        return constructExceptionShapes();
    }

    private Map<String, ShapeModel> constructExceptionShapes() {
        // Java shape models, to be constructed
        final Map<String, ShapeModel> javaShapes = new HashMap<String, ShapeModel>();

        for (Map.Entry<String, Operation> entry : getServiceModel().getOperations().entrySet()) {

            Operation operation = entry.getValue();
            List<ErrorMap> operationErrors = operation.getErrors();

            if (operationErrors != null) {
                for (ErrorMap error : operationErrors) {

                    String errorShapeName = error.getShape();
                    String javaClassName = getNamingStrategy().getExceptionName(errorShapeName);

                    ShapeModel exceptionShapeModel = generateShapeModel(javaClassName,
                                                                        errorShapeName);

                    exceptionShapeModel.setType(ShapeType.Exception.getValue());
                    exceptionShapeModel.setErrorCode(getErrorCode(errorShapeName));
                    if (exceptionShapeModel.getDocumentation() == null) {
                        exceptionShapeModel.setDocumentation(error.getDocumentation());
                    }

                    javaShapes.put(javaClassName, exceptionShapeModel);
                }
            }
        }

        return javaShapes;
    }

    /**
     * The error code may be overridden for query or rest protocols via the error trait on the
     * exception shape. If the error code isn't overridden and for all other protocols other than
     * query or rest the error code should just be the shape name
     */
    private String getErrorCode(String errorShapeName) {
        ErrorTrait errorTrait = getServiceModel().getShapes().get(errorShapeName).getErrorTrait();
        if (isErrorCodeOverridden(errorTrait)) {
            return errorTrait.getErrorCode();
        } else {
            return errorShapeName;
        }
    }

    private boolean isErrorCodeOverridden(ErrorTrait errorTrait) {
        return errorTrait != null && !Utils.isNullOrEmpty(errorTrait.getErrorCode());
    }
}
