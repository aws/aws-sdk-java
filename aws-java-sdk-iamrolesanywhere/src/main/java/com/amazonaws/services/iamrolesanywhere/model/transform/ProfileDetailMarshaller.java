/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ProfileDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProfileDetailMarshaller {

    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("createdBy").build();
    private static final MarshallingInfo<Integer> DURATIONSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("durationSeconds").build();
    private static final MarshallingInfo<Boolean> ENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("enabled").build();
    private static final MarshallingInfo<List> MANAGEDPOLICYARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("managedPolicyArns").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> PROFILEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("profileArn").build();
    private static final MarshallingInfo<String> PROFILEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("profileId").build();
    private static final MarshallingInfo<Boolean> REQUIREINSTANCEPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("requireInstanceProperties").build();
    private static final MarshallingInfo<List> ROLEARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArns").build();
    private static final MarshallingInfo<String> SESSIONPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sessionPolicy").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedAt").timestampFormat("iso8601").build();

    private static final ProfileDetailMarshaller instance = new ProfileDetailMarshaller();

    public static ProfileDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProfileDetail profileDetail, ProtocolMarshaller protocolMarshaller) {

        if (profileDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(profileDetail.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(profileDetail.getCreatedBy(), CREATEDBY_BINDING);
            protocolMarshaller.marshall(profileDetail.getDurationSeconds(), DURATIONSECONDS_BINDING);
            protocolMarshaller.marshall(profileDetail.getEnabled(), ENABLED_BINDING);
            protocolMarshaller.marshall(profileDetail.getManagedPolicyArns(), MANAGEDPOLICYARNS_BINDING);
            protocolMarshaller.marshall(profileDetail.getName(), NAME_BINDING);
            protocolMarshaller.marshall(profileDetail.getProfileArn(), PROFILEARN_BINDING);
            protocolMarshaller.marshall(profileDetail.getProfileId(), PROFILEID_BINDING);
            protocolMarshaller.marshall(profileDetail.getRequireInstanceProperties(), REQUIREINSTANCEPROPERTIES_BINDING);
            protocolMarshaller.marshall(profileDetail.getRoleArns(), ROLEARNS_BINDING);
            protocolMarshaller.marshall(profileDetail.getSessionPolicy(), SESSIONPOLICY_BINDING);
            protocolMarshaller.marshall(profileDetail.getUpdatedAt(), UPDATEDAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
