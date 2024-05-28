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
package com.amazonaws.services.repostspace.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.repostspace.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SpaceDataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SpaceDataMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> CONFIGURATIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configurationStatus").build();
    private static final MarshallingInfo<Long> CONTENTSIZE_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("contentSize").build();
    private static final MarshallingInfo<java.util.Date> CREATEDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createDateTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> DELETEDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deleteDateTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> RANDOMDOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("randomDomain").build();
    private static final MarshallingInfo<String> SPACEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("spaceId").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<Long> STORAGELIMIT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("storageLimit").build();
    private static final MarshallingInfo<String> TIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tier").build();
    private static final MarshallingInfo<Integer> USERCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("userCount").build();
    private static final MarshallingInfo<String> USERKMSKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("userKMSKey").build();
    private static final MarshallingInfo<String> VANITYDOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vanityDomain").build();
    private static final MarshallingInfo<String> VANITYDOMAINSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vanityDomainStatus").build();

    private static final SpaceDataMarshaller instance = new SpaceDataMarshaller();

    public static SpaceDataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SpaceData spaceData, ProtocolMarshaller protocolMarshaller) {

        if (spaceData == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(spaceData.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(spaceData.getConfigurationStatus(), CONFIGURATIONSTATUS_BINDING);
            protocolMarshaller.marshall(spaceData.getContentSize(), CONTENTSIZE_BINDING);
            protocolMarshaller.marshall(spaceData.getCreateDateTime(), CREATEDATETIME_BINDING);
            protocolMarshaller.marshall(spaceData.getDeleteDateTime(), DELETEDATETIME_BINDING);
            protocolMarshaller.marshall(spaceData.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(spaceData.getName(), NAME_BINDING);
            protocolMarshaller.marshall(spaceData.getRandomDomain(), RANDOMDOMAIN_BINDING);
            protocolMarshaller.marshall(spaceData.getSpaceId(), SPACEID_BINDING);
            protocolMarshaller.marshall(spaceData.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(spaceData.getStorageLimit(), STORAGELIMIT_BINDING);
            protocolMarshaller.marshall(spaceData.getTier(), TIER_BINDING);
            protocolMarshaller.marshall(spaceData.getUserCount(), USERCOUNT_BINDING);
            protocolMarshaller.marshall(spaceData.getUserKMSKey(), USERKMSKEY_BINDING);
            protocolMarshaller.marshall(spaceData.getVanityDomain(), VANITYDOMAIN_BINDING);
            protocolMarshaller.marshall(spaceData.getVanityDomainStatus(), VANITYDOMAINSTATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
