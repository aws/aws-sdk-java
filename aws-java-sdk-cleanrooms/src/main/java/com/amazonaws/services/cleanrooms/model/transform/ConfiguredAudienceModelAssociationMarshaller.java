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
package com.amazonaws.services.cleanrooms.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cleanrooms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConfiguredAudienceModelAssociationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConfiguredAudienceModelAssociationMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> CONFIGUREDAUDIENCEMODELARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configuredAudienceModelArn").build();
    private static final MarshallingInfo<String> MEMBERSHIPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("membershipId").build();
    private static final MarshallingInfo<String> MEMBERSHIPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("membershipArn").build();
    private static final MarshallingInfo<String> COLLABORATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("collaborationId").build();
    private static final MarshallingInfo<String> COLLABORATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("collaborationArn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<Boolean> MANAGERESOURCEPOLICIES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("manageResourcePolicies").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<java.util.Date> CREATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> UPDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updateTime").timestampFormat("unixTimestamp").build();

    private static final ConfiguredAudienceModelAssociationMarshaller instance = new ConfiguredAudienceModelAssociationMarshaller();

    public static ConfiguredAudienceModelAssociationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConfiguredAudienceModelAssociation configuredAudienceModelAssociation, ProtocolMarshaller protocolMarshaller) {

        if (configuredAudienceModelAssociation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(configuredAudienceModelAssociation.getId(), ID_BINDING);
            protocolMarshaller.marshall(configuredAudienceModelAssociation.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(configuredAudienceModelAssociation.getConfiguredAudienceModelArn(), CONFIGUREDAUDIENCEMODELARN_BINDING);
            protocolMarshaller.marshall(configuredAudienceModelAssociation.getMembershipId(), MEMBERSHIPID_BINDING);
            protocolMarshaller.marshall(configuredAudienceModelAssociation.getMembershipArn(), MEMBERSHIPARN_BINDING);
            protocolMarshaller.marshall(configuredAudienceModelAssociation.getCollaborationId(), COLLABORATIONID_BINDING);
            protocolMarshaller.marshall(configuredAudienceModelAssociation.getCollaborationArn(), COLLABORATIONARN_BINDING);
            protocolMarshaller.marshall(configuredAudienceModelAssociation.getName(), NAME_BINDING);
            protocolMarshaller.marshall(configuredAudienceModelAssociation.getManageResourcePolicies(), MANAGERESOURCEPOLICIES_BINDING);
            protocolMarshaller.marshall(configuredAudienceModelAssociation.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(configuredAudienceModelAssociation.getCreateTime(), CREATETIME_BINDING);
            protocolMarshaller.marshall(configuredAudienceModelAssociation.getUpdateTime(), UPDATETIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
