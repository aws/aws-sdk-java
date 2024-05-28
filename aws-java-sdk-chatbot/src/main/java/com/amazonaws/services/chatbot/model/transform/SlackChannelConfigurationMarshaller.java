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
 * SlackChannelConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SlackChannelConfigurationMarshaller {

    private static final MarshallingInfo<String> SLACKTEAMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SlackTeamName").build();
    private static final MarshallingInfo<String> SLACKTEAMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SlackTeamId").build();
    private static final MarshallingInfo<String> SLACKCHANNELID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SlackChannelId").build();
    private static final MarshallingInfo<String> SLACKCHANNELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SlackChannelName").build();
    private static final MarshallingInfo<String> CHATCONFIGURATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChatConfigurationArn").build();
    private static final MarshallingInfo<String> IAMROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IamRoleArn").build();
    private static final MarshallingInfo<List> SNSTOPICARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SnsTopicArns").build();
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

    private static final SlackChannelConfigurationMarshaller instance = new SlackChannelConfigurationMarshaller();

    public static SlackChannelConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SlackChannelConfiguration slackChannelConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (slackChannelConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(slackChannelConfiguration.getSlackTeamName(), SLACKTEAMNAME_BINDING);
            protocolMarshaller.marshall(slackChannelConfiguration.getSlackTeamId(), SLACKTEAMID_BINDING);
            protocolMarshaller.marshall(slackChannelConfiguration.getSlackChannelId(), SLACKCHANNELID_BINDING);
            protocolMarshaller.marshall(slackChannelConfiguration.getSlackChannelName(), SLACKCHANNELNAME_BINDING);
            protocolMarshaller.marshall(slackChannelConfiguration.getChatConfigurationArn(), CHATCONFIGURATIONARN_BINDING);
            protocolMarshaller.marshall(slackChannelConfiguration.getIamRoleArn(), IAMROLEARN_BINDING);
            protocolMarshaller.marshall(slackChannelConfiguration.getSnsTopicArns(), SNSTOPICARNS_BINDING);
            protocolMarshaller.marshall(slackChannelConfiguration.getConfigurationName(), CONFIGURATIONNAME_BINDING);
            protocolMarshaller.marshall(slackChannelConfiguration.getLoggingLevel(), LOGGINGLEVEL_BINDING);
            protocolMarshaller.marshall(slackChannelConfiguration.getGuardrailPolicyArns(), GUARDRAILPOLICYARNS_BINDING);
            protocolMarshaller.marshall(slackChannelConfiguration.getUserAuthorizationRequired(), USERAUTHORIZATIONREQUIRED_BINDING);
            protocolMarshaller.marshall(slackChannelConfiguration.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
