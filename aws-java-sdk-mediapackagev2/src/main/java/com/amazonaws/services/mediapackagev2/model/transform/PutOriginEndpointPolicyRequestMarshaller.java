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
package com.amazonaws.services.mediapackagev2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediapackagev2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutOriginEndpointPolicyRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutOriginEndpointPolicyRequestMarshaller {

    private static final MarshallingInfo<String> CHANNELGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("ChannelGroupName").build();
    private static final MarshallingInfo<String> CHANNELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("ChannelName").build();
    private static final MarshallingInfo<String> ORIGINENDPOINTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("OriginEndpointName").build();
    private static final MarshallingInfo<String> POLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Policy").build();

    private static final PutOriginEndpointPolicyRequestMarshaller instance = new PutOriginEndpointPolicyRequestMarshaller();

    public static PutOriginEndpointPolicyRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutOriginEndpointPolicyRequest putOriginEndpointPolicyRequest, ProtocolMarshaller protocolMarshaller) {

        if (putOriginEndpointPolicyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putOriginEndpointPolicyRequest.getChannelGroupName(), CHANNELGROUPNAME_BINDING);
            protocolMarshaller.marshall(putOriginEndpointPolicyRequest.getChannelName(), CHANNELNAME_BINDING);
            protocolMarshaller.marshall(putOriginEndpointPolicyRequest.getOriginEndpointName(), ORIGINENDPOINTNAME_BINDING);
            protocolMarshaller.marshall(putOriginEndpointPolicyRequest.getPolicy(), POLICY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
