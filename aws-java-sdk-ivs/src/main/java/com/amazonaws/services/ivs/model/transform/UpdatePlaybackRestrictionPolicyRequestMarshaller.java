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
package com.amazonaws.services.ivs.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ivs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdatePlaybackRestrictionPolicyRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdatePlaybackRestrictionPolicyRequestMarshaller {

    private static final MarshallingInfo<List> ALLOWEDCOUNTRIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("allowedCountries").build();
    private static final MarshallingInfo<List> ALLOWEDORIGINS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("allowedOrigins").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<Boolean> ENABLESTRICTORIGINENFORCEMENT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("enableStrictOriginEnforcement").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();

    private static final UpdatePlaybackRestrictionPolicyRequestMarshaller instance = new UpdatePlaybackRestrictionPolicyRequestMarshaller();

    public static UpdatePlaybackRestrictionPolicyRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdatePlaybackRestrictionPolicyRequest updatePlaybackRestrictionPolicyRequest, ProtocolMarshaller protocolMarshaller) {

        if (updatePlaybackRestrictionPolicyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updatePlaybackRestrictionPolicyRequest.getAllowedCountries(), ALLOWEDCOUNTRIES_BINDING);
            protocolMarshaller.marshall(updatePlaybackRestrictionPolicyRequest.getAllowedOrigins(), ALLOWEDORIGINS_BINDING);
            protocolMarshaller.marshall(updatePlaybackRestrictionPolicyRequest.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(updatePlaybackRestrictionPolicyRequest.getEnableStrictOriginEnforcement(), ENABLESTRICTORIGINENFORCEMENT_BINDING);
            protocolMarshaller.marshall(updatePlaybackRestrictionPolicyRequest.getName(), NAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
