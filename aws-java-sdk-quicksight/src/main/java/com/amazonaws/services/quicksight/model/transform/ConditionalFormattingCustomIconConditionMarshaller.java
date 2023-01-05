/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConditionalFormattingCustomIconConditionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConditionalFormattingCustomIconConditionMarshaller {

    private static final MarshallingInfo<String> EXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Expression").build();
    private static final MarshallingInfo<StructuredPojo> ICONOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IconOptions").build();
    private static final MarshallingInfo<String> COLOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Color").build();
    private static final MarshallingInfo<StructuredPojo> DISPLAYCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisplayConfiguration").build();

    private static final ConditionalFormattingCustomIconConditionMarshaller instance = new ConditionalFormattingCustomIconConditionMarshaller();

    public static ConditionalFormattingCustomIconConditionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConditionalFormattingCustomIconCondition conditionalFormattingCustomIconCondition, ProtocolMarshaller protocolMarshaller) {

        if (conditionalFormattingCustomIconCondition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(conditionalFormattingCustomIconCondition.getExpression(), EXPRESSION_BINDING);
            protocolMarshaller.marshall(conditionalFormattingCustomIconCondition.getIconOptions(), ICONOPTIONS_BINDING);
            protocolMarshaller.marshall(conditionalFormattingCustomIconCondition.getColor(), COLOR_BINDING);
            protocolMarshaller.marshall(conditionalFormattingCustomIconCondition.getDisplayConfiguration(), DISPLAYCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
