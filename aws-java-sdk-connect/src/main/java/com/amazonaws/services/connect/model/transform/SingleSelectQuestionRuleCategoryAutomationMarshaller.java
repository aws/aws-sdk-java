/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.connect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SingleSelectQuestionRuleCategoryAutomationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SingleSelectQuestionRuleCategoryAutomationMarshaller {

    private static final MarshallingInfo<String> CATEGORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Category").build();
    private static final MarshallingInfo<String> CONDITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Condition").build();
    private static final MarshallingInfo<String> OPTIONREFID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OptionRefId").build();

    private static final SingleSelectQuestionRuleCategoryAutomationMarshaller instance = new SingleSelectQuestionRuleCategoryAutomationMarshaller();

    public static SingleSelectQuestionRuleCategoryAutomationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SingleSelectQuestionRuleCategoryAutomation singleSelectQuestionRuleCategoryAutomation, ProtocolMarshaller protocolMarshaller) {

        if (singleSelectQuestionRuleCategoryAutomation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(singleSelectQuestionRuleCategoryAutomation.getCategory(), CATEGORY_BINDING);
            protocolMarshaller.marshall(singleSelectQuestionRuleCategoryAutomation.getCondition(), CONDITION_BINDING);
            protocolMarshaller.marshall(singleSelectQuestionRuleCategoryAutomation.getOptionRefId(), OPTIONREFID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
