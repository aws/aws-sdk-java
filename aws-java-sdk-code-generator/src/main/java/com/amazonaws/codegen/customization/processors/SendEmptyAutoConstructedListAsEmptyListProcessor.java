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
import com.amazonaws.codegen.model.intermediate.IntermediateModel;
import com.amazonaws.codegen.model.intermediate.MemberModel;
import com.amazonaws.codegen.model.intermediate.ShapeModel;
import com.amazonaws.codegen.model.service.ServiceModel;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

final public class SendEmptyAutoConstructedListAsEmptyListProcessor implements
                                                                    CodegenCustomizationProcessor {

    private Map<String, List<String>> sendEmptyQueryString;

    SendEmptyAutoConstructedListAsEmptyListProcessor(Map<String, List<String>> sendEmptyQueryString) {
        this.sendEmptyQueryString = sendEmptyQueryString;
    }

    @Override
    public void preprocess(ServiceModel serviceModel) {
        // do nothing
    }

    @Override
    public void postprocess(IntermediateModel intermediateModel) {
        if (sendEmptyQueryString == null || sendEmptyQueryString.isEmpty()) {
            return;
        }

        sanityCheck(intermediateModel);

        for (Entry<String, List<String>> entry : sendEmptyQueryString.entrySet()) {
            String shapeName = entry.getKey();
            List<String> members = entry.getValue();

            ShapeModel shapeModel = intermediateModel.getShapes().get(shapeName);
            for (String memberName : members) {
                MemberModel memberModel = shapeModel.getMemberByName(memberName);
                memberModel.getListModel().setSendEmptyQueryString(true);
            }
        }
    }

    /**
     * Verify the shape exists and the members provided exist and also verify the members
     * are list shapes.
     */
    private void sanityCheck(IntermediateModel intermediateModel) {
        sendEmptyQueryString.forEach((shapeName, memberNames) -> {
            ShapeModel shape = intermediateModel.getShapes().get(shapeName);
            if (shape == null) {
                throw new IllegalStateException(
                        String.format("Cannot find shape [%s] in the model when processing "
                                      + "customization config sendEmptyQueryStringParam.%s", shapeName, shapeName));
            }
            memberNames.forEach(memberName -> {
                if (shape.getMemberByName(memberName) == null) {
                    throw new IllegalStateException(
                            String.format("Cannot find member [%s] in the model when processing "
                                          + "customization config sendEmptyQueryStringParam.%s", memberName, shapeName));
                }
            });
            memberNames.stream()
                       .map(shape::getMemberByC2jName)
                       .forEach(member -> assertIsListMember(shapeName, member));
        });
    }

    private void assertIsListMember(String shapeName, MemberModel member) {
        if (!member.isList()) {
            throw new IllegalStateException(
                    String.format("Member %s from shape %s must be a list", member.getC2jName(), shapeName));
        }
    }

}
