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
package com.amazonaws.services.iamrolesanywhere.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iamrolesanywhere.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateProfileRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateProfileRequestMarshaller {

    private static final MarshallingInfo<Integer> DURATIONSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("durationSeconds").build();
    private static final MarshallingInfo<List> MANAGEDPOLICYARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("managedPolicyArns").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> PROFILEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("profileId").build();
    private static final MarshallingInfo<List> ROLEARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArns").build();
    private static final MarshallingInfo<String> SESSIONPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sessionPolicy").build();

    private static final UpdateProfileRequestMarshaller instance = new UpdateProfileRequestMarshaller();

    public static UpdateProfileRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateProfileRequest updateProfileRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateProfileRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateProfileRequest.getDurationSeconds(), DURATIONSECONDS_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getManagedPolicyArns(), MANAGEDPOLICYARNS_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getProfileId(), PROFILEID_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getRoleArns(), ROLEARNS_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getSessionPolicy(), SESSIONPOLICY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
