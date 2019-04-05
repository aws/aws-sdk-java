/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Map;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.sqs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * SendMessageRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendMessageRequestMarshaller implements Marshaller<Request<SendMessageRequest>, SendMessageRequest> {

    public Request<SendMessageRequest> marshall(SendMessageRequest sendMessageRequest) {

        if (sendMessageRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SendMessageRequest> request = new DefaultRequest<SendMessageRequest>(sendMessageRequest, "AmazonSQS");
        request.addParameter("Action", "SendMessage");
        request.addParameter("Version", "2012-11-05");
        request.setHttpMethod(HttpMethodName.POST);

        if (sendMessageRequest.getQueueUrl() != null) {
            request.addParameter("QueueUrl", StringUtils.fromString(sendMessageRequest.getQueueUrl()));
        }

        if (sendMessageRequest.getMessageBody() != null) {
            request.addParameter("MessageBody", StringUtils.fromString(sendMessageRequest.getMessageBody()));
        }

        if (sendMessageRequest.getDelaySeconds() != null) {
            request.addParameter("DelaySeconds", StringUtils.fromInteger(sendMessageRequest.getDelaySeconds()));
        }

        java.util.Map<String, MessageAttributeValue> messageAttributes = sendMessageRequest.getMessageAttributes();
        int messageAttributesListIndex = 1;
        for (Map.Entry<String, MessageAttributeValue> entry : messageAttributes.entrySet()) {
            if (entry.getKey() != null) {
                request.addParameter("MessageAttribute." + messageAttributesListIndex + ".Name", StringUtils.fromString(entry.getKey()));
            }
            if (entry.getValue() != null) {

                if (entry.getValue().getStringValue() != null) {
                    request.addParameter("MessageAttribute." + messageAttributesListIndex + ".Value.StringValue",
                            StringUtils.fromString(entry.getValue().getStringValue()));
                }

                if (entry.getValue().getBinaryValue() != null) {
                    request.addParameter("MessageAttribute." + messageAttributesListIndex + ".Value.BinaryValue",
                            StringUtils.fromByteBuffer(entry.getValue().getBinaryValue()));
                }

                if (!entry.getValue().getStringListValues().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<String>) entry.getValue().getStringListValues()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<String> stringListValuesList = (com.amazonaws.internal.SdkInternalList<String>) entry.getValue()
                            .getStringListValues();
                    int stringListValuesListIndex = 1;

                    for (String stringListValuesListValue : stringListValuesList) {
                        if (stringListValuesListValue != null) {
                            request.addParameter("MessageAttribute." + messageAttributesListIndex + ".Value.StringListValue." + stringListValuesListIndex,
                                    StringUtils.fromString(stringListValuesListValue));
                        }
                        stringListValuesListIndex++;
                    }
                }

                if (!entry.getValue().getBinaryListValues().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<java.nio.ByteBuffer>) entry.getValue().getBinaryListValues()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<java.nio.ByteBuffer> binaryListValuesList = (com.amazonaws.internal.SdkInternalList<java.nio.ByteBuffer>) entry
                            .getValue().getBinaryListValues();
                    int binaryListValuesListIndex = 1;

                    for (java.nio.ByteBuffer binaryListValuesListValue : binaryListValuesList) {
                        if (binaryListValuesListValue != null) {
                            request.addParameter("MessageAttribute." + messageAttributesListIndex + ".Value.BinaryListValue." + binaryListValuesListIndex,
                                    StringUtils.fromByteBuffer(binaryListValuesListValue));
                        }
                        binaryListValuesListIndex++;
                    }
                }

                if (entry.getValue().getDataType() != null) {
                    request.addParameter("MessageAttribute." + messageAttributesListIndex + ".Value.DataType",
                            StringUtils.fromString(entry.getValue().getDataType()));
                }
            }
            messageAttributesListIndex++;
        }

        if (sendMessageRequest.getMessageDeduplicationId() != null) {
            request.addParameter("MessageDeduplicationId", StringUtils.fromString(sendMessageRequest.getMessageDeduplicationId()));
        }

        if (sendMessageRequest.getMessageGroupId() != null) {
            request.addParameter("MessageGroupId", StringUtils.fromString(sendMessageRequest.getMessageGroupId()));
        }

        return request;
    }

}
