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
import com.amazonaws.codegen.model.config.ConstructorFormsWrapper;
import com.amazonaws.codegen.model.config.customization.CustomizationConfig;
import com.amazonaws.codegen.model.intermediate.ArgumentModel;
import com.amazonaws.codegen.model.intermediate.ConstructorModel;
import com.amazonaws.codegen.model.intermediate.IntermediateModel;
import com.amazonaws.codegen.model.intermediate.MemberModel;
import com.amazonaws.codegen.model.intermediate.ShapeModel;
import com.amazonaws.codegen.model.intermediate.VariableModel;
import com.amazonaws.codegen.model.service.ServiceModel;

import java.util.List;
import java.util.Map;

/**
 * Looks at the customization configuration and adds new additional constructors
 * to the intermediate shape models.
 */
final class CustomConstructorsProcessor implements CodegenCustomizationProcessor {
    private final CustomizationConfig customConfig;

    CustomConstructorsProcessor(CustomizationConfig customConfig) {
        this.customConfig = customConfig;
    }

    @Override
    public void preprocess(ServiceModel serviceModel) {
        // Do nothing
    }

    @Override
    public void postprocess(IntermediateModel intermediateModel) {
        Map<String, ShapeModel> javaShapes = intermediateModel.getShapes();
        addConstructors(javaShapes);
    }

    private void addConstructors(Map<String, ShapeModel> javaShapes) {
        Map<String, ConstructorFormsWrapper> additionalConstructors =
                customConfig.getAdditionalShapeConstructors();
        if (additionalConstructors == null)
            return;

        for (Map.Entry<String, ConstructorFormsWrapper> entry : additionalConstructors
                .entrySet()) {

            String shapeName = entry.getKey();
            List<List<String>> forms = entry.getValue().getConstructorForms();

            final ShapeModel shapeModel = javaShapes.get(shapeName);

            if (shapeModel == null) {
                throw new RuntimeException(
                        "Not able to add constructor. No shape defined with name "
                                + shapeName);
            }

            Map<String, MemberModel> members = shapeModel.getMembersAsMap();
            for (List<String> form : forms) {
                final ConstructorModel consModel = new ConstructorModel(shapeName);

                boolean hasEnumMember = false;
                for (String argument : form) {
                    MemberModel memberModel = members.get(argument);
                    if (memberModel == null) {
                        throw new RuntimeException(
                                "Not able to add constructor. Member "
                                        + argument + " not present in shape "
                                        + shapeName);
                    }
                    if (memberModel.getVariable() == null) {
                        throw new RuntimeException(
                                "Not able to add constructor. Member "
                                        + argument
                                        + " doesnt have variable defined "
                                        + shapeName);
                    }

                    if (memberModel.isSimple()
                            && memberModel.getEnumType() != null) {

                        hasEnumMember = true;
                    }

                    final String name = memberModel.getVariable()
                            .getVariableName();
                    final String type = memberModel.getVariable()
                            .getVariableType();
                    final ArgumentModel arg = new ArgumentModel()
                            .withName(name).withType(type);
                    arg.setDocumentation(memberModel.getDocumentation());

                    consModel.addArgument(arg);
                }

                shapeModel.addConstructor(consModel);

                if (hasEnumMember) {
                    final ConstructorModel enumCons = new ConstructorModel(shapeName);

                    for (String argument : form) {
                        MemberModel memberModel = members.get(argument);
                        VariableModel variable = memberModel.getVariable();
                        String enumType = memberModel.getEnumType();

                        final String type = enumType != null ? enumType
                                : variable.getVariableType();
                        final ArgumentModel arg = new ArgumentModel()
                                .withName(variable.getVariableName())
                                .withType(type).withIsEnumArg(enumType != null);
                        arg.setDocumentation(memberModel.getDocumentation());

                        enumCons.addArgument(arg);
                    }
                    shapeModel.addConstructor(enumCons);
                }
            }
        }
    }
}
