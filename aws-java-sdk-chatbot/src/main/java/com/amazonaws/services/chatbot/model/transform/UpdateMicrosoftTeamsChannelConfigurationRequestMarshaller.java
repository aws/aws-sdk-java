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
 * UpdateMicrosoftTeamsChannelConfigurationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateMicrosoftTeamsChannelConfigurationRequestMarshaller {

    private static final MarshallingInfo<String> CHATCONFIGURATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChatConfigurationArn").build();
    private static final MarshallingInfo<String> CHANNELID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ChannelId").build();
    private static final MarshallingInfo<String> CHANNELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChannelName").build();
    private static final MarshallingInfo<List> SNSTOPICARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SnsTopicArns").build();
    private static final MarshallingInfo<String> IAMROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IamRoleArn").build();
    private static final MarshallingInfo<String> LOGGINGLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LoggingLevel").build();
    private static final MarshallingInfo<List> GUARDRAILPOLICYARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GuardrailPolicyArns").build();
    private static final MarshallingInfo<Boolean> USERAUTHORIZATIONREQUIRED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserAuthorizationRequired").build();

    private static final UpdateMicrosoftTeamsChannelConfigurationRequestMarshaller instance = new UpdateMicrosoftTeamsChannelConfigurationRequestMarshaller();

    public static UpdateMicrosoftTeamsChannelConfigurationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateMicrosoftTeamsChannelConfigurationRequest updateMicrosoftTeamsChannelConfigurationRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateMicrosoftTeamsChannelConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateMicrosoftTeamsChannelConfigurationRequest.getChatConfigurationArn(), CHATCONFIGURATIONARN_BINDING);
            protocolMarshaller.marshall(updateMicrosoftTeamsChannelConfigurationRequest.getChannelId(), CHANNELID_BINDING);
            protocolMarshaller.marshall(updateMicrosoftTeamsChannelConfigurationRequest.getChannelName(), CHANNELNAME_BINDING);
            protocolMarshaller.marshall(updateMicrosoftTeamsChannelConfigurationRequest.getSnsTopicArns(), SNSTOPICARNS_BINDING);
            protocolMarshaller.marshall(updateMicrosoftTeamsChannelConfigurationRequest.getIamRoleArn(), IAMROLEARN_BINDING);
            protocolMarshaller.marshall(updateMicrosoftTeamsChannelConfigurationRequest.getLoggingLevel(), LOGGINGLEVEL_BINDING);
            protocolMarshaller.marshall(updateMicrosoftTeamsChannelConfigurationRequest.getGuardrailPolicyArns(), GUARDRAILPOLICYARNS_BINDING);
            protocolMarshaller.marshall(updateMicrosoftTeamsChannelConfigurationRequest.getUserAuthorizationRequired(), USERAUTHORIZATIONREQUIRED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
