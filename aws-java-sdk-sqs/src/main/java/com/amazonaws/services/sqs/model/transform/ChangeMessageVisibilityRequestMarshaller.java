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
 * ChangeMessageVisibilityRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ChangeMessageVisibilityRequestMarshaller {

    private static final MarshallingInfo<String> QUEUEURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("QueueUrl").build();
    private static final MarshallingInfo<String> RECEIPTHANDLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReceiptHandle").build();
    private static final MarshallingInfo<Integer> VISIBILITYTIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VisibilityTimeout").build();

    private static final ChangeMessageVisibilityRequestMarshaller instance = new ChangeMessageVisibilityRequestMarshaller();

    public static ChangeMessageVisibilityRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ChangeMessageVisibilityRequest changeMessageVisibilityRequest, ProtocolMarshaller protocolMarshaller) {

        if (changeMessageVisibilityRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(changeMessageVisibilityRequest.getQueueUrl(), QUEUEURL_BINDING);
            protocolMarshaller.marshall(changeMessageVisibilityRequest.getReceiptHandle(), RECEIPTHANDLE_BINDING);
            protocolMarshaller.marshall(changeMessageVisibilityRequest.getVisibilityTimeout(), VISIBILITYTIMEOUT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
