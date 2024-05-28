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
 * CreateSlackChannelConfigurationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateSlackChannelConfigurationRequestMarshaller {

    private static final MarshallingInfo<String> SLACKTEAMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SlackTeamId").build();
    private static final MarshallingInfo<String> SLACKCHANNELID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SlackChannelId").build();
    private static final MarshallingInfo<String> SLACKCHANNELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SlackChannelName").build();
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

    private static final CreateSlackChannelConfigurationRequestMarshaller instance = new CreateSlackChannelConfigurationRequestMarshaller();

    public static CreateSlackChannelConfigurationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateSlackChannelConfigurationRequest createSlackChannelConfigurationRequest, ProtocolMarshaller protocolMarshaller) {

        if (createSlackChannelConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createSlackChannelConfigurationRequest.getSlackTeamId(), SLACKTEAMID_BINDING);
            protocolMarshaller.marshall(createSlackChannelConfigurationRequest.getSlackChannelId(), SLACKCHANNELID_BINDING);
            protocolMarshaller.marshall(createSlackChannelConfigurationRequest.getSlackChannelName(), SLACKCHANNELNAME_BINDING);
            protocolMarshaller.marshall(createSlackChannelConfigurationRequest.getSnsTopicArns(), SNSTOPICARNS_BINDING);
            protocolMarshaller.marshall(createSlackChannelConfigurationRequest.getIamRoleArn(), IAMROLEARN_BINDING);
            protocolMarshaller.marshall(createSlackChannelConfigurationRequest.getConfigurationName(), CONFIGURATIONNAME_BINDING);
            protocolMarshaller.marshall(createSlackChannelConfigurationRequest.getLoggingLevel(), LOGGINGLEVEL_BINDING);
            protocolMarshaller.marshall(createSlackChannelConfigurationRequest.getGuardrailPolicyArns(), GUARDRAILPOLICYARNS_BINDING);
            protocolMarshaller.marshall(createSlackChannelConfigurationRequest.getUserAuthorizationRequired(), USERAUTHORIZATIONREQUIRED_BINDING);
            protocolMarshaller.marshall(createSlackChannelConfigurationRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
