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
import com.amazonaws.codegen.internal.Utils;
import com.amazonaws.codegen.model.config.customization.CustomizationConfig;
import com.amazonaws.codegen.model.intermediate.IntermediateModel;
import com.amazonaws.codegen.model.intermediate.MemberModel;
import com.amazonaws.codegen.model.service.ServiceModel;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * {@link CodegenCustomizationProcessor} to identify which enum members should have a legacy setter overload emitted to the
 * model class. See {@link CustomizationConfig#getEmitLegacyEnumSetterFor()}.
 */
public final class EmitLegacyEnumSetterProcessor implements CodegenCustomizationProcessor {

    private final Map<String, List<String>> emitLegacyEnumSetterFor;
    private final boolean shouldEmitEnumSetterOverload;

    public EmitLegacyEnumSetterProcessor(CustomizationConfig customizationConfig) {
        this.emitLegacyEnumSetterFor = customizationConfig.getEmitLegacyEnumSetterFor() != null ?
                customizationConfig.getEmitLegacyEnumSetterFor() : Collections.emptyMap();
        this.shouldEmitEnumSetterOverload = customizationConfig.emitEnumSetterOverload();
    }

    @Override
    public void preprocess(ServiceModel serviceModel) {
        // do nothing
    }

    @Override
    public void postprocess(IntermediateModel intermediateModel) {
        assertShapeAndMembersAreInModel(intermediateModel, emitLegacyEnumSetterFor);

        intermediateModel.getShapes().values().stream()
                         .filter(s -> s.getMembers() != null)
                         .forEach(s -> s.getMembers()
                                        .forEach(member -> applyCustomization(s.getC2jName(), member)));
    }

    private void applyCustomization(String parentShapeName, MemberModel member) {
        if (emitLegacyEnumSetterFor.containsKey(parentShapeName)) {
            emitLegacyEnumSetterFor.get(parentShapeName)
                                   .forEach(memberName -> member.setShouldEmitLegacyEnumSetter(true));
        } else {
            member.setShouldEmitLegacyEnumSetter(shouldEmitEnumSetterOverload);
        }
    }

    /**
     * Checks that all shapes and members in a given customization are actually in the model. Good to fail fast for things like
     * typos instead of silently not applying that customization.
     *
     * @param model           {@link IntermediateModel}
     * @param shapeAndMembers Shape and members referenced by customization. Map of String (shape name) to list of strings
     *                        (member names).
     */
    private static void assertShapeAndMembersAreInModel(IntermediateModel model, Map<String, List<String>> shapeAndMembers) {
        shapeAndMembers.forEach((shapeName, members) -> {
            if (Utils.findShapeModelByC2jNameIfExists(model, shapeName) == null) {
                throw new IllegalStateException(
                        String.format("Cannot find shape [%s] in the model when processing "
                                      + "customization config emitLegacyEnumSetterFor. %s", shapeName, shapeName));
            }
            members.forEach(memberName -> {
                if (model.getShapeByC2jName(shapeName).getMemberByC2jName(memberName) == null) {
                    throw new IllegalStateException(
                            String.format("Cannot find member [%s] in the model when processing "
                                          + "customization config emitLegacyEnumSetterFor. %s", memberName, shapeName));
                }
            });
        });
    }

}
