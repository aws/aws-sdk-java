/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sns.model.transform;

import java.util.Map;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.sns.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * PublishBatchRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PublishBatchRequestMarshaller implements Marshaller<Request<PublishBatchRequest>, PublishBatchRequest> {

    public Request<PublishBatchRequest> marshall(PublishBatchRequest publishBatchRequest) {

        if (publishBatchRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<PublishBatchRequest> request = new DefaultRequest<PublishBatchRequest>(publishBatchRequest, "AmazonSNS");
        request.addParameter("Action", "PublishBatch");
        request.addParameter("Version", "2010-03-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (publishBatchRequest.getTopicArn() != null) {
            request.addParameter("TopicArn", StringUtils.fromString(publishBatchRequest.getTopicArn()));
        }

        if (!publishBatchRequest.getPublishBatchRequestEntries().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<PublishBatchRequestEntry>) publishBatchRequest.getPublishBatchRequestEntries()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<PublishBatchRequestEntry> publishBatchRequestEntriesList = (com.amazonaws.internal.SdkInternalList<PublishBatchRequestEntry>) publishBatchRequest
                    .getPublishBatchRequestEntries();
            int publishBatchRequestEntriesListIndex = 1;

            for (PublishBatchRequestEntry publishBatchRequestEntriesListValue : publishBatchRequestEntriesList) {
                if (publishBatchRequestEntriesListValue != null) {

                    if (publishBatchRequestEntriesListValue.getId() != null) {
                        request.addParameter("PublishBatchRequestEntries.member." + publishBatchRequestEntriesListIndex + ".Id",
                                StringUtils.fromString(publishBatchRequestEntriesListValue.getId()));
                    }

                    if (publishBatchRequestEntriesListValue.getMessage() != null) {
                        request.addParameter("PublishBatchRequestEntries.member." + publishBatchRequestEntriesListIndex + ".Message",
                                StringUtils.fromString(publishBatchRequestEntriesListValue.getMessage()));
                    }

                    if (publishBatchRequestEntriesListValue.getSubject() != null) {
                        request.addParameter("PublishBatchRequestEntries.member." + publishBatchRequestEntriesListIndex + ".Subject",
                                StringUtils.fromString(publishBatchRequestEntriesListValue.getSubject()));
                    }

                    if (publishBatchRequestEntriesListValue.getMessageStructure() != null) {
                        request.addParameter("PublishBatchRequestEntries.member." + publishBatchRequestEntriesListIndex + ".MessageStructure",
                                StringUtils.fromString(publishBatchRequestEntriesListValue.getMessageStructure()));
                    }

                    java.util.Map<String, MessageAttributeValue> messageAttributes = publishBatchRequestEntriesListValue.getMessageAttributes();
                    int messageAttributesListIndex = 1;
                    for (Map.Entry<String, MessageAttributeValue> entry : messageAttributes.entrySet()) {
                        if (entry != null && entry.getKey() != null) {
                            request.addParameter("PublishBatchRequestEntries.member." + publishBatchRequestEntriesListIndex + ".MessageAttributes.entry."
                                    + messageAttributesListIndex + ".Name", StringUtils.fromString(entry.getKey()));
                        }
                        if (entry != null && entry.getValue() != null) {

                            if (entry.getValue().getDataType() != null) {
                                request.addParameter("PublishBatchRequestEntries.member." + publishBatchRequestEntriesListIndex + ".MessageAttributes.entry."
                                        + messageAttributesListIndex + ".Value.DataType", StringUtils.fromString(entry.getValue().getDataType()));
                            }

                            if (entry.getValue().getStringValue() != null) {
                                request.addParameter("PublishBatchRequestEntries.member." + publishBatchRequestEntriesListIndex + ".MessageAttributes.entry."
                                        + messageAttributesListIndex + ".Value.StringValue", StringUtils.fromString(entry.getValue().getStringValue()));
                            }

                            if (entry.getValue().getBinaryValue() != null) {
                                request.addParameter("PublishBatchRequestEntries.member." + publishBatchRequestEntriesListIndex + ".MessageAttributes.entry."
                                        + messageAttributesListIndex + ".Value.BinaryValue", StringUtils.fromByteBuffer(entry.getValue().getBinaryValue()));
                            }
                        }
                        messageAttributesListIndex++;
                    }

                    if (publishBatchRequestEntriesListValue.getMessageDeduplicationId() != null) {
                        request.addParameter("PublishBatchRequestEntries.member." + publishBatchRequestEntriesListIndex + ".MessageDeduplicationId",
                                StringUtils.fromString(publishBatchRequestEntriesListValue.getMessageDeduplicationId()));
                    }

                    if (publishBatchRequestEntriesListValue.getMessageGroupId() != null) {
                        request.addParameter("PublishBatchRequestEntries.member." + publishBatchRequestEntriesListIndex + ".MessageGroupId",
                                StringUtils.fromString(publishBatchRequestEntriesListValue.getMessageGroupId()));
                    }
                }
                publishBatchRequestEntriesListIndex++;
            }
        }

        return request;
    }

}
