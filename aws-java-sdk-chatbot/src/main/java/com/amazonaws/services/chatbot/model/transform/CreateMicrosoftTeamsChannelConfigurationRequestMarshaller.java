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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chatbot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateMicrosoftTeamsChannelConfigurationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateMicrosoftTeamsChannelConfigurationRequestMarshaller {

    private static final MarshallingInfo<String> CHANNELID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ChannelId").build();
    private static final MarshallingInfo<String> CHANNELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChannelName").build();
    private static final MarshallingInfo<String> TEAMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TeamId").build();
    private static final MarshallingInfo<String> TEAMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TeamName").build();
    private static final MarshallingInfo<String> TENANTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TenantId").build();
    private static final MarshallingInfo<List> SNSTOPICARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SnsTopicArns").build();
    private static final MarshallingInfo<String> IAMROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IamRoleArn").build();
    private static final MarshallingInfo<String> CONFIGURATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConfigurationName").build();
    private static final MarshallingInfo<String> LOGGINGLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LoggingLevel").build();
    private static final MarshallingInfo<List> GUARDRAILPOLICYARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GuardrailPolicyArns").build();
    private static final MarshallingInfo<Boolean> USERAUTHORIZATIONREQUIRED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserAuthorizationRequired").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateMicrosoftTeamsChannelConfigurationRequestMarshaller instance = new CreateMicrosoftTeamsChannelConfigurationRequestMarshaller();

    public static CreateMicrosoftTeamsChannelConfigurationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateMicrosoftTeamsChannelConfigurationRequest createMicrosoftTeamsChannelConfigurationRequest, ProtocolMarshaller protocolMarshaller) {

        if (createMicrosoftTeamsChannelConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createMicrosoftTeamsChannelConfigurationRequest.getChannelId(), CHANNELID_BINDING);
            protocolMarshaller.marshall(createMicrosoftTeamsChannelConfigurationRequest.getChannelName(), CHANNELNAME_BINDING);
            protocolMarshaller.marshall(createMicrosoftTeamsChannelConfigurationRequest.getTeamId(), TEAMID_BINDING);
            protocolMarshaller.marshall(createMicrosoftTeamsChannelConfigurationRequest.getTeamName(), TEAMNAME_BINDING);
            protocolMarshaller.marshall(createMicrosoftTeamsChannelConfigurationRequest.getTenantId(), TENANTID_BINDING);
            protocolMarshaller.marshall(createMicrosoftTeamsChannelConfigurationRequest.getSnsTopicArns(), SNSTOPICARNS_BINDING);
            protocolMarshaller.marshall(createMicrosoftTeamsChannelConfigurationRequest.getIamRoleArn(), IAMROLEARN_BINDING);
            protocolMarshaller.marshall(createMicrosoftTeamsChannelConfigurationRequest.getConfigurationName(), CONFIGURATIONNAME_BINDING);
            protocolMarshaller.marshall(createMicrosoftTeamsChannelConfigurationRequest.getLoggingLevel(), LOGGINGLEVEL_BINDING);
            protocolMarshaller.marshall(createMicrosoftTeamsChannelConfigurationRequest.getGuardrailPolicyArns(), GUARDRAILPOLICYARNS_BINDING);
            protocolMarshaller.marshall(createMicrosoftTeamsChannelConfigurationRequest.getUserAuthorizationRequired(), USERAUTHORIZATIONREQUIRED_BINDING);
            protocolMarshaller.marshall(createMicrosoftTeamsChannelConfigurationRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
