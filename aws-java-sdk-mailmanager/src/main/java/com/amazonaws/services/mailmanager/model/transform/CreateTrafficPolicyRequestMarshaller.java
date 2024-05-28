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
package com.amazonaws.services.mailmanager.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mailmanager.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateTrafficPolicyRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateTrafficPolicyRequestMarshaller {

    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> DEFAULTACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultAction").build();
    private static final MarshallingInfo<Integer> MAXMESSAGESIZEBYTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxMessageSizeBytes").build();
    private static final MarshallingInfo<List> POLICYSTATEMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PolicyStatements").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<String> TRAFFICPOLICYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrafficPolicyName").build();

    private static final CreateTrafficPolicyRequestMarshaller instance = new CreateTrafficPolicyRequestMarshaller();

    public static CreateTrafficPolicyRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateTrafficPolicyRequest createTrafficPolicyRequest, ProtocolMarshaller protocolMarshaller) {

        if (createTrafficPolicyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createTrafficPolicyRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createTrafficPolicyRequest.getDefaultAction(), DEFAULTACTION_BINDING);
            protocolMarshaller.marshall(createTrafficPolicyRequest.getMaxMessageSizeBytes(), MAXMESSAGESIZEBYTES_BINDING);
            protocolMarshaller.marshall(createTrafficPolicyRequest.getPolicyStatements(), POLICYSTATEMENTS_BINDING);
            protocolMarshaller.marshall(createTrafficPolicyRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createTrafficPolicyRequest.getTrafficPolicyName(), TRAFFICPOLICYNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
