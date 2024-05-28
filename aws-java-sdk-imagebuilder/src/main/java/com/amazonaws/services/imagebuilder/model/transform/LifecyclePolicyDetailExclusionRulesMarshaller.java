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
package com.amazonaws.services.imagebuilder.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.imagebuilder.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LifecyclePolicyDetailExclusionRulesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LifecyclePolicyDetailExclusionRulesMarshaller {

    private static final MarshallingInfo<Map> TAGMAP_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tagMap").build();
    private static final MarshallingInfo<StructuredPojo> AMIS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("amis").build();

    private static final LifecyclePolicyDetailExclusionRulesMarshaller instance = new LifecyclePolicyDetailExclusionRulesMarshaller();

    public static LifecyclePolicyDetailExclusionRulesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LifecyclePolicyDetailExclusionRules lifecyclePolicyDetailExclusionRules, ProtocolMarshaller protocolMarshaller) {

        if (lifecyclePolicyDetailExclusionRules == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(lifecyclePolicyDetailExclusionRules.getTagMap(), TAGMAP_BINDING);
            protocolMarshaller.marshall(lifecyclePolicyDetailExclusionRules.getAmis(), AMIS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
