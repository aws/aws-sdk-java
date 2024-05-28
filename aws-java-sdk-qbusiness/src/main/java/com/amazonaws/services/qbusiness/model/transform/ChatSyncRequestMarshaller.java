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
package com.amazonaws.services.qbusiness.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.qbusiness.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ChatSyncRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ChatSyncRequestMarshaller {

    private static final MarshallingInfo<String> APPLICATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("applicationId").build();
    private static final MarshallingInfo<String> USERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("userId").build();
    private static final MarshallingInfo<List> USERGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("userGroups").build();
    private static final MarshallingInfo<String> USERMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("userMessage").build();
    private static final MarshallingInfo<List> ATTACHMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("attachments").build();
    private static final MarshallingInfo<StructuredPojo> AUTHCHALLENGERESPONSE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authChallengeResponse").build();
    private static final MarshallingInfo<String> CONVERSATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("conversationId").build();
    private static final MarshallingInfo<String> PARENTMESSAGEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("parentMessageId").build();
    private static final MarshallingInfo<StructuredPojo> ATTRIBUTEFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("attributeFilter").build();
    private static final MarshallingInfo<String> CHATMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("chatMode").build();
    private static final MarshallingInfo<StructuredPojo> CHATMODECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("chatModeConfiguration").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();

    private static final ChatSyncRequestMarshaller instance = new ChatSyncRequestMarshaller();

    public static ChatSyncRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ChatSyncRequest chatSyncRequest, ProtocolMarshaller protocolMarshaller) {

        if (chatSyncRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(chatSyncRequest.getApplicationId(), APPLICATIONID_BINDING);
            protocolMarshaller.marshall(chatSyncRequest.getUserId(), USERID_BINDING);
            protocolMarshaller.marshall(chatSyncRequest.getUserGroups(), USERGROUPS_BINDING);
            protocolMarshaller.marshall(chatSyncRequest.getUserMessage(), USERMESSAGE_BINDING);
            protocolMarshaller.marshall(chatSyncRequest.getAttachments(), ATTACHMENTS_BINDING);
            protocolMarshaller.marshall(chatSyncRequest.getAuthChallengeResponse(), AUTHCHALLENGERESPONSE_BINDING);
            protocolMarshaller.marshall(chatSyncRequest.getConversationId(), CONVERSATIONID_BINDING);
            protocolMarshaller.marshall(chatSyncRequest.getParentMessageId(), PARENTMESSAGEID_BINDING);
            protocolMarshaller.marshall(chatSyncRequest.getAttributeFilter(), ATTRIBUTEFILTER_BINDING);
            protocolMarshaller.marshall(chatSyncRequest.getChatMode(), CHATMODE_BINDING);
            protocolMarshaller.marshall(chatSyncRequest.getChatModeConfiguration(), CHATMODECONFIGURATION_BINDING);
            protocolMarshaller.marshall(chatSyncRequest.getClientToken(), CLIENTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
