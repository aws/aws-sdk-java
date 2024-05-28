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
package com.amazonaws.services.sqs.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sqs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SendMessageBatchResultEntryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SendMessageBatchResultEntryMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> MESSAGEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MessageId").build();
    private static final MarshallingInfo<String> MD5OFMESSAGEBODY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MD5OfMessageBody").build();
    private static final MarshallingInfo<String> MD5OFMESSAGEATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MD5OfMessageAttributes").build();
    private static final MarshallingInfo<String> MD5OFMESSAGESYSTEMATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MD5OfMessageSystemAttributes").build();
    private static final MarshallingInfo<String> SEQUENCENUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SequenceNumber").build();

    private static final SendMessageBatchResultEntryMarshaller instance = new SendMessageBatchResultEntryMarshaller();

    public static SendMessageBatchResultEntryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SendMessageBatchResultEntry sendMessageBatchResultEntry, ProtocolMarshaller protocolMarshaller) {

        if (sendMessageBatchResultEntry == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sendMessageBatchResultEntry.getId(), ID_BINDING);
            protocolMarshaller.marshall(sendMessageBatchResultEntry.getMessageId(), MESSAGEID_BINDING);
            protocolMarshaller.marshall(sendMessageBatchResultEntry.getMD5OfMessageBody(), MD5OFMESSAGEBODY_BINDING);
            protocolMarshaller.marshall(sendMessageBatchResultEntry.getMD5OfMessageAttributes(), MD5OFMESSAGEATTRIBUTES_BINDING);
            protocolMarshaller.marshall(sendMessageBatchResultEntry.getMD5OfMessageSystemAttributes(), MD5OFMESSAGESYSTEMATTRIBUTES_BINDING);
            protocolMarshaller.marshall(sendMessageBatchResultEntry.getSequenceNumber(), SEQUENCENUMBER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
