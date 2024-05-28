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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.qbusiness.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutFeedbackRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutFeedbackRequestMarshaller {

    private static final MarshallingInfo<String> APPLICATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("applicationId").build();
    private static final MarshallingInfo<String> USERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("userId").build();
    private static final MarshallingInfo<String> CONVERSATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("conversationId").build();
    private static final MarshallingInfo<String> MESSAGEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("messageId").build();
    private static final MarshallingInfo<java.util.Date> MESSAGECOPIEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("messageCopiedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> MESSAGEUSEFULNESS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("messageUsefulness").build();

    private static final PutFeedbackRequestMarshaller instance = new PutFeedbackRequestMarshaller();

    public static PutFeedbackRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutFeedbackRequest putFeedbackRequest, ProtocolMarshaller protocolMarshaller) {

        if (putFeedbackRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putFeedbackRequest.getApplicationId(), APPLICATIONID_BINDING);
            protocolMarshaller.marshall(putFeedbackRequest.getUserId(), USERID_BINDING);
            protocolMarshaller.marshall(putFeedbackRequest.getConversationId(), CONVERSATIONID_BINDING);
            protocolMarshaller.marshall(putFeedbackRequest.getMessageId(), MESSAGEID_BINDING);
            protocolMarshaller.marshall(putFeedbackRequest.getMessageCopiedAt(), MESSAGECOPIEDAT_BINDING);
            protocolMarshaller.marshall(putFeedbackRequest.getMessageUsefulness(), MESSAGEUSEFULNESS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
