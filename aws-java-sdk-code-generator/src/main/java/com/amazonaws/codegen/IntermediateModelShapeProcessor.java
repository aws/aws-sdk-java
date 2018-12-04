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

import java.util.Map;

/**
 * Interface used by the {@link IntermediateModelBuilder} to process the service model to add and
 * modify ShapeModels to the {@link com.amazonaws.codegen.model.intermediate.IntermediateModel}.
 */
public interface IntermediateModelShapeProcessor {


    /**
     * @param currentOperations Current operations that have been added to the intermediate model.
     * @param currentShapes     Current shapes that have been added to the intermediate model
     * @return Map of shape name to ShapeModel to add to the intermediate model.
     */
    Map<String, ShapeModel> process(Map<String, OperationModel> currentOperations,
                                    Map<String, ShapeModel> currentShapes);
}
