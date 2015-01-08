/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.sqs.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.sqs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Send Message Request Marshaller
 */
public class SendMessageRequestMarshaller implements Marshaller<Request<SendMessageRequest>, SendMessageRequest> {

    public Request<SendMessageRequest> marshall(SendMessageRequest sendMessageRequest) {

        if (sendMessageRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<SendMessageRequest> request = new DefaultRequest<SendMessageRequest>(sendMessageRequest, "AmazonSQS");
        request.addParameter("Action", "SendMessage");
        request.addParameter("Version", "2012-11-05");

        if (sendMessageRequest.getQueueUrl() != null) {
            request.addParameter("QueueUrl", StringUtils.fromString(sendMessageRequest.getQueueUrl()));
        }
        if (sendMessageRequest.getMessageBody() != null) {
            request.addParameter("MessageBody", StringUtils.fromString(sendMessageRequest.getMessageBody()));
        }
        if (sendMessageRequest.getDelaySeconds() != null) {
            request.addParameter("DelaySeconds", StringUtils.fromInteger(sendMessageRequest.getDelaySeconds()));
        }
        if (sendMessageRequest != null) {
            if (sendMessageRequest.getMessageAttributes() != null) {
                int messageAttributesListIndex = 1;
                for (Map.Entry<String, MessageAttributeValue> messageAttributesListValue : sendMessageRequest.getMessageAttributes().entrySet()) {

                    if (messageAttributesListValue.getKey() != null) {
                        request.addParameter("MessageAttribute." + messageAttributesListIndex + ".Name", StringUtils.fromString(messageAttributesListValue.getKey()));
                    }
                    MessageAttributeValue messageAttributeValueValue = messageAttributesListValue.getValue();
                    if (messageAttributeValueValue != null) {
                        if (messageAttributeValueValue.getStringValue() != null) {
                            request.addParameter("MessageAttribute." + messageAttributesListIndex + ".Value.StringValue", StringUtils.fromString(messageAttributeValueValue.getStringValue()));
                        }
                        if (messageAttributeValueValue.getBinaryValue() != null) {
                            request.addParameter("MessageAttribute." + messageAttributesListIndex + ".Value.BinaryValue", StringUtils.fromByteBuffer(messageAttributeValueValue.getBinaryValue()));
                        }

                        java.util.List<String> stringListValuesList = messageAttributeValueValue.getStringListValues();
                        int stringListValuesListIndex = 1;

                        for (String stringListValuesListValue : stringListValuesList) {
                            if (stringListValuesListValue != null) {
                                request.addParameter("MessageAttribute." + messageAttributesListIndex + ".Value.StringListValue." + stringListValuesListIndex, StringUtils.fromString(stringListValuesListValue));
                            }

                            stringListValuesListIndex++;
                        }

                        java.util.List<java.nio.ByteBuffer> binaryListValuesList = messageAttributeValueValue.getBinaryListValues();
                        int binaryListValuesListIndex = 1;

                        for (java.nio.ByteBuffer binaryListValuesListValue : binaryListValuesList) {
                            if (binaryListValuesListValue != null) {
                                request.addParameter("MessageAttribute." + messageAttributesListIndex + ".Value.BinaryListValue." + binaryListValuesListIndex, StringUtils.fromByteBuffer(binaryListValuesListValue));
                            }

                            binaryListValuesListIndex++;
                        }
                        if (messageAttributeValueValue.getDataType() != null) {
                            request.addParameter("MessageAttribute." + messageAttributesListIndex + ".Value.DataType", StringUtils.fromString(messageAttributeValueValue.getDataType()));
                        }
                    }
                    ++messageAttributesListIndex;
                }
            }
        }

        return request;
    }
}
