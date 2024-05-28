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
package com.amazonaws.services.chatbot.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chatbot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TeamsUserIdentityMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TeamsUserIdentityMarshaller {

    private static final MarshallingInfo<String> IAMROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IamRoleArn").build();
    private static final MarshallingInfo<String> CHATCONFIGURATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChatConfigurationArn").build();
    private static final MarshallingInfo<String> TEAMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TeamId").build();
    private static final MarshallingInfo<String> USERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UserId").build();
    private static final MarshallingInfo<String> AWSUSERIDENTITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsUserIdentity").build();
    private static final MarshallingInfo<String> TEAMSCHANNELID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TeamsChannelId").build();
    private static final MarshallingInfo<String> TEAMSTENANTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TeamsTenantId").build();

    private static final TeamsUserIdentityMarshaller instance = new TeamsUserIdentityMarshaller();

    public static TeamsUserIdentityMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TeamsUserIdentity teamsUserIdentity, ProtocolMarshaller protocolMarshaller) {

        if (teamsUserIdentity == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(teamsUserIdentity.getIamRoleArn(), IAMROLEARN_BINDING);
            protocolMarshaller.marshall(teamsUserIdentity.getChatConfigurationArn(), CHATCONFIGURATIONARN_BINDING);
            protocolMarshaller.marshall(teamsUserIdentity.getTeamId(), TEAMID_BINDING);
            protocolMarshaller.marshall(teamsUserIdentity.getUserId(), USERID_BINDING);
            protocolMarshaller.marshall(teamsUserIdentity.getAwsUserIdentity(), AWSUSERIDENTITY_BINDING);
            protocolMarshaller.marshall(teamsUserIdentity.getTeamsChannelId(), TEAMSCHANNELID_BINDING);
            protocolMarshaller.marshall(teamsUserIdentity.getTeamsTenantId(), TEAMSTENANTID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
