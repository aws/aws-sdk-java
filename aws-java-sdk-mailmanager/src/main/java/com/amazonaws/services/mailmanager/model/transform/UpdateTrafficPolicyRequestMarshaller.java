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

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateTrafficPolicyRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateTrafficPolicyRequestMarshaller {

    private static final MarshallingInfo<String> DEFAULTACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultAction").build();
    private static final MarshallingInfo<Integer> MAXMESSAGESIZEBYTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxMessageSizeBytes").build();
    private static final MarshallingInfo<List> POLICYSTATEMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PolicyStatements").build();
    private static final MarshallingInfo<String> TRAFFICPOLICYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrafficPolicyId").build();
    private static final MarshallingInfo<String> TRAFFICPOLICYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrafficPolicyName").build();

    private static final UpdateTrafficPolicyRequestMarshaller instance = new UpdateTrafficPolicyRequestMarshaller();

    public static UpdateTrafficPolicyRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateTrafficPolicyRequest updateTrafficPolicyRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateTrafficPolicyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateTrafficPolicyRequest.getDefaultAction(), DEFAULTACTION_BINDING);
            protocolMarshaller.marshall(updateTrafficPolicyRequest.getMaxMessageSizeBytes(), MAXMESSAGESIZEBYTES_BINDING);
            protocolMarshaller.marshall(updateTrafficPolicyRequest.getPolicyStatements(), POLICYSTATEMENTS_BINDING);
            protocolMarshaller.marshall(updateTrafficPolicyRequest.getTrafficPolicyId(), TRAFFICPOLICYID_BINDING);
            protocolMarshaller.marshall(updateTrafficPolicyRequest.getTrafficPolicyName(), TRAFFICPOLICYNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
