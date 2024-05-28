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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sqs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReceiveMessageRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReceiveMessageRequestMarshaller {

    private static final MarshallingInfo<String> QUEUEURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("QueueUrl").build();
    private static final MarshallingInfo<List> ATTRIBUTENAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AttributeNames").build();
    private static final MarshallingInfo<List> MESSAGESYSTEMATTRIBUTENAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MessageSystemAttributeNames").build();
    private static final MarshallingInfo<List> MESSAGEATTRIBUTENAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MessageAttributeNames").build();
    private static final MarshallingInfo<Integer> MAXNUMBEROFMESSAGES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxNumberOfMessages").build();
    private static final MarshallingInfo<Integer> VISIBILITYTIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VisibilityTimeout").build();
    private static final MarshallingInfo<Integer> WAITTIMESECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WaitTimeSeconds").build();
    private static final MarshallingInfo<String> RECEIVEREQUESTATTEMPTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReceiveRequestAttemptId").build();

    private static final ReceiveMessageRequestMarshaller instance = new ReceiveMessageRequestMarshaller();

    public static ReceiveMessageRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReceiveMessageRequest receiveMessageRequest, ProtocolMarshaller protocolMarshaller) {

        if (receiveMessageRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(receiveMessageRequest.getQueueUrl(), QUEUEURL_BINDING);
            protocolMarshaller.marshall(receiveMessageRequest.getAttributeNames(), ATTRIBUTENAMES_BINDING);
            protocolMarshaller.marshall(receiveMessageRequest.getMessageSystemAttributeNames(), MESSAGESYSTEMATTRIBUTENAMES_BINDING);
            protocolMarshaller.marshall(receiveMessageRequest.getMessageAttributeNames(), MESSAGEATTRIBUTENAMES_BINDING);
            protocolMarshaller.marshall(receiveMessageRequest.getMaxNumberOfMessages(), MAXNUMBEROFMESSAGES_BINDING);
            protocolMarshaller.marshall(receiveMessageRequest.getVisibilityTimeout(), VISIBILITYTIMEOUT_BINDING);
            protocolMarshaller.marshall(receiveMessageRequest.getWaitTimeSeconds(), WAITTIMESECONDS_BINDING);
            protocolMarshaller.marshall(receiveMessageRequest.getReceiveRequestAttemptId(), RECEIVEREQUESTATTEMPTID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
