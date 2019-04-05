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
 * SendMessageBatchRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendMessageBatchRequestMarshaller implements Marshaller<Request<SendMessageBatchRequest>, SendMessageBatchRequest> {

    public Request<SendMessageBatchRequest> marshall(SendMessageBatchRequest sendMessageBatchRequest) {

        if (sendMessageBatchRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SendMessageBatchRequest> request = new DefaultRequest<SendMessageBatchRequest>(sendMessageBatchRequest, "AmazonSQS");
        request.addParameter("Action", "SendMessageBatch");
        request.addParameter("Version", "2012-11-05");
        request.setHttpMethod(HttpMethodName.POST);

        if (sendMessageBatchRequest.getQueueUrl() != null) {
            request.addParameter("QueueUrl", StringUtils.fromString(sendMessageBatchRequest.getQueueUrl()));
        }

        if (!sendMessageBatchRequest.getEntries().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<SendMessageBatchRequestEntry>) sendMessageBatchRequest.getEntries()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<SendMessageBatchRequestEntry> entriesList = (com.amazonaws.internal.SdkInternalList<SendMessageBatchRequestEntry>) sendMessageBatchRequest
                    .getEntries();
            int entriesListIndex = 1;

            for (SendMessageBatchRequestEntry entriesListValue : entriesList) {

                if (entriesListValue.getId() != null) {
                    request.addParameter("SendMessageBatchRequestEntry." + entriesListIndex + ".Id", StringUtils.fromString(entriesListValue.getId()));
                }

                if (entriesListValue.getMessageBody() != null) {
                    request.addParameter("SendMessageBatchRequestEntry." + entriesListIndex + ".MessageBody",
                            StringUtils.fromString(entriesListValue.getMessageBody()));
                }

                if (entriesListValue.getDelaySeconds() != null) {
                    request.addParameter("SendMessageBatchRequestEntry." + entriesListIndex + ".DelaySeconds",
                            StringUtils.fromInteger(entriesListValue.getDelaySeconds()));
                }

                java.util.Map<String, MessageAttributeValue> messageAttributes = entriesListValue.getMessageAttributes();
                int messageAttributesListIndex = 1;
                for (Map.Entry<String, MessageAttributeValue> entry : messageAttributes.entrySet()) {
                    if (entry.getKey() != null) {
                        request.addParameter("SendMessageBatchRequestEntry." + entriesListIndex + ".MessageAttribute." + messageAttributesListIndex + ".Name",
                                StringUtils.fromString(entry.getKey()));
                    }
                    if (entry.getValue() != null) {

                        if (entry.getValue().getStringValue() != null) {
                            request.addParameter("SendMessageBatchRequestEntry." + entriesListIndex + ".MessageAttribute." + messageAttributesListIndex
                                    + ".Value.StringValue", StringUtils.fromString(entry.getValue().getStringValue()));
                        }

                        if (entry.getValue().getBinaryValue() != null) {
                            request.addParameter("SendMessageBatchRequestEntry." + entriesListIndex + ".MessageAttribute." + messageAttributesListIndex
                                    + ".Value.BinaryValue", StringUtils.fromByteBuffer(entry.getValue().getBinaryValue()));
                        }

                        if (!entry.getValue().getStringListValues().isEmpty()
                                || !((com.amazonaws.internal.SdkInternalList<String>) entry.getValue().getStringListValues()).isAutoConstruct()) {
                            com.amazonaws.internal.SdkInternalList<String> stringListValuesList = (com.amazonaws.internal.SdkInternalList<String>) entry
                                    .getValue().getStringListValues();
                            int stringListValuesListIndex = 1;

                            for (String stringListValuesListValue : stringListValuesList) {
                                if (stringListValuesListValue != null) {
                                    request.addParameter("SendMessageBatchRequestEntry." + entriesListIndex + ".MessageAttribute." + messageAttributesListIndex
                                            + ".Value.StringListValue." + stringListValuesListIndex, StringUtils.fromString(stringListValuesListValue));
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
                                    request.addParameter("SendMessageBatchRequestEntry." + entriesListIndex + ".MessageAttribute." + messageAttributesListIndex
                                            + ".Value.BinaryListValue." + binaryListValuesListIndex, StringUtils.fromByteBuffer(binaryListValuesListValue));
                                }
                                binaryListValuesListIndex++;
                            }
                        }

                        if (entry.getValue().getDataType() != null) {
                            request.addParameter("SendMessageBatchRequestEntry." + entriesListIndex + ".MessageAttribute." + messageAttributesListIndex
                                    + ".Value.DataType", StringUtils.fromString(entry.getValue().getDataType()));
                        }
                    }
                    messageAttributesListIndex++;
                }

                if (entriesListValue.getMessageDeduplicationId() != null) {
                    request.addParameter("SendMessageBatchRequestEntry." + entriesListIndex + ".MessageDeduplicationId",
                            StringUtils.fromString(entriesListValue.getMessageDeduplicationId()));
                }

                if (entriesListValue.getMessageGroupId() != null) {
                    request.addParameter("SendMessageBatchRequestEntry." + entriesListIndex + ".MessageGroupId",
                            StringUtils.fromString(entriesListValue.getMessageGroupId()));
                }
                entriesListIndex++;
            }
        }

        return request;
    }

}
