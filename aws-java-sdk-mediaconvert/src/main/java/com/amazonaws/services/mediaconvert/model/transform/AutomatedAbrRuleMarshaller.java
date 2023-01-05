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
package com.amazonaws.services.mediaconvert.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediaconvert.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AutomatedAbrRuleMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AutomatedAbrRuleMarshaller {

    private static final MarshallingInfo<List> ALLOWEDRENDITIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("allowedRenditions").build();
    private static final MarshallingInfo<List> FORCEINCLUDERENDITIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("forceIncludeRenditions").build();
    private static final MarshallingInfo<StructuredPojo> MINBOTTOMRENDITIONSIZE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("minBottomRenditionSize").build();
    private static final MarshallingInfo<StructuredPojo> MINTOPRENDITIONSIZE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("minTopRenditionSize").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();

    private static final AutomatedAbrRuleMarshaller instance = new AutomatedAbrRuleMarshaller();

    public static AutomatedAbrRuleMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AutomatedAbrRule automatedAbrRule, ProtocolMarshaller protocolMarshaller) {

        if (automatedAbrRule == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(automatedAbrRule.getAllowedRenditions(), ALLOWEDRENDITIONS_BINDING);
            protocolMarshaller.marshall(automatedAbrRule.getForceIncludeRenditions(), FORCEINCLUDERENDITIONS_BINDING);
            protocolMarshaller.marshall(automatedAbrRule.getMinBottomRenditionSize(), MINBOTTOMRENDITIONSIZE_BINDING);
            protocolMarshaller.marshall(automatedAbrRule.getMinTopRenditionSize(), MINTOPRENDITIONSIZE_BINDING);
            protocolMarshaller.marshall(automatedAbrRule.getType(), TYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
