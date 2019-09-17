/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.codegen.customization.processors;

import com.amazonaws.codegen.customization.CodegenCustomizationProcessor;
import com.amazonaws.codegen.model.config.customization.CustomizationConfig;
import com.amazonaws.codegen.model.intermediate.IntermediateModel;
import com.amazonaws.codegen.model.intermediate.MemberModel;
import com.amazonaws.codegen.model.service.ServiceModel;

public class SendEmptyNonAutoConstructedListAsEmptyListProcessor implements
                                                                 CodegenCustomizationProcessor {

    public final CustomizationConfig customizationConfig;

    public SendEmptyNonAutoConstructedListAsEmptyListProcessor(
            CustomizationConfig customizationConfig) {
        this.customizationConfig = customizationConfig;
    }

    @Override
    public void preprocess(ServiceModel serviceModel) {
    }

    @Override
    public void postprocess(IntermediateModel intermediateModel) {
        if (customizationConfig.isSendExplicitlyEmptyListsForQuery()) {
            intermediateModel.getShapes().values().stream()
                    .filter(s -> s.getMembers() != null)
                    .flatMap(s -> s.getMembers().stream())
                    .filter(MemberModel::isList)
                    .map(MemberModel::getListModel)
                    .forEach(m -> m.setMarshallNonAutoConstructedEmptyLists(true));
        }
    }
}
