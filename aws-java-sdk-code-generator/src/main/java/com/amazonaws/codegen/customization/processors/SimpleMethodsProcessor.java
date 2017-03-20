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

package com.amazonaws.codegen.customization.processors;

import com.amazonaws.codegen.customization.CodegenCustomizationProcessor;
import com.amazonaws.codegen.model.config.customization.SimpleMethodFormsWrapper;
import com.amazonaws.codegen.model.intermediate.ArgumentModel;
import com.amazonaws.codegen.model.intermediate.IntermediateModel;
import com.amazonaws.codegen.model.intermediate.MemberModel;
import com.amazonaws.codegen.model.intermediate.OperationModel;
import com.amazonaws.codegen.model.intermediate.ShapeModel;
import com.amazonaws.codegen.model.service.ServiceModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * This processor adds the simple methods to each OperationModel from the customization config.
 */
final class SimpleMethodsProcessor implements CodegenCustomizationProcessor {

    private final Map<String, SimpleMethodFormsWrapper> simpleMethods;

    SimpleMethodsProcessor(Map<String, SimpleMethodFormsWrapper> simpleMethods) {
        this.simpleMethods = simpleMethods;
    }

    @Override
    public void preprocess(ServiceModel serviceModel) { }

    @Override
    public void postprocess(IntermediateModel intermediateModel) {

        if (simpleMethods == null) return;

        Map<String, OperationModel> operationModels = intermediateModel
                .getOperations();
        Map<String, ShapeModel> shapeModels = intermediateModel.getShapes();

        for (Map.Entry<String, SimpleMethodFormsWrapper> entry : simpleMethods.entrySet()) {
            String operationName = entry.getKey();
            SimpleMethodFormsWrapper methodFormsWrapper = entry.getValue();

            OperationModel opModel = operationModels.get(operationName);

            if (opModel == null) {
                throw new RuntimeException(
                        "Simple Method forms customization present for an unknown operation "
                                + operationName);
            } else {
                String inputShapeName = opModel.getInput().getSimpleType();
                ShapeModel shape = shapeModels.get(inputShapeName);
                List<List<String>> methodForms = methodFormsWrapper.getMethodForms();
                List<Boolean> deprecatedForms = methodFormsWrapper.getDeprecated();

                for (int i = 0; i < methodForms.size(); i++) {
                    List<String> argumentList = methodForms.get(i);
                    boolean deprecated = deprecatedForms != null ? deprecatedForms.get(i) : false;
                    List<ArgumentModel> simplifiedForm = new ArrayList<ArgumentModel>();

                    for (String argument : argumentList) {
                        ArgumentModel argModel = new ArgumentModel();
                        MemberModel memberModel =
                            shape.findMemberModelByC2jName(argument);
                        argModel.setDocumentation(memberModel.getDocumentation());
                        argModel.setName(memberModel.getVariable().getVariableName());
                        argModel.setType(memberModel.getVariable().getVariableType());
                        simplifiedForm.add(argModel);
                    }

                    opModel.addSimpleMethodForm(simplifiedForm, deprecated);
                }
            }
        }
    }
}
