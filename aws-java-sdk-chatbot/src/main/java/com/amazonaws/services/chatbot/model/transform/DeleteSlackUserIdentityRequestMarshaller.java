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
 * DeleteSlackUserIdentityRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeleteSlackUserIdentityRequestMarshaller {

    private static final MarshallingInfo<String> CHATCONFIGURATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChatConfigurationArn").build();
    private static final MarshallingInfo<String> SLACKTEAMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SlackTeamId").build();
    private static final MarshallingInfo<String> SLACKUSERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SlackUserId").build();

    private static final DeleteSlackUserIdentityRequestMarshaller instance = new DeleteSlackUserIdentityRequestMarshaller();

    public static DeleteSlackUserIdentityRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeleteSlackUserIdentityRequest deleteSlackUserIdentityRequest, ProtocolMarshaller protocolMarshaller) {

        if (deleteSlackUserIdentityRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deleteSlackUserIdentityRequest.getChatConfigurationArn(), CHATCONFIGURATIONARN_BINDING);
            protocolMarshaller.marshall(deleteSlackUserIdentityRequest.getSlackTeamId(), SLACKTEAMID_BINDING);
            protocolMarshaller.marshall(deleteSlackUserIdentityRequest.getSlackUserId(), SLACKUSERID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
