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
package com.amazonaws.services.sns.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.sns.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Publish Request Marshaller
 */
public class PublishRequestMarshaller implements Marshaller<Request<PublishRequest>, PublishRequest> {

    public Request<PublishRequest> marshall(PublishRequest publishRequest) {

        if (publishRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<PublishRequest> request = new DefaultRequest<PublishRequest>(publishRequest, "AmazonSNS");
        request.addParameter("Action", "Publish");
        request.addParameter("Version", "2010-03-31");

        if (publishRequest.getTopicArn() != null) {
            request.addParameter("TopicArn", StringUtils.fromString(publishRequest.getTopicArn()));
        }
        if (publishRequest.getTargetArn() != null) {
            request.addParameter("TargetArn", StringUtils.fromString(publishRequest.getTargetArn()));
        }
        if (publishRequest.getMessage() != null) {
            request.addParameter("Message", StringUtils.fromString(publishRequest.getMessage()));
        }
        if (publishRequest.getSubject() != null) {
            request.addParameter("Subject", StringUtils.fromString(publishRequest.getSubject()));
        }
        if (publishRequest.getMessageStructure() != null) {
            request.addParameter("MessageStructure", StringUtils.fromString(publishRequest.getMessageStructure()));
        }
        if (publishRequest != null) {
            if (publishRequest.getMessageAttributes() != null) {
                int messageAttributesListIndex = 1;
                for (Map.Entry<String, MessageAttributeValue> messageAttributesListValue : publishRequest.getMessageAttributes().entrySet()) {

                    if (messageAttributesListValue.getKey() != null) {
                        request.addParameter("MessageAttributes.entry." + messageAttributesListIndex + ".Name", StringUtils.fromString(messageAttributesListValue.getKey()));
                    }
                    MessageAttributeValue messageAttributeValueValue = messageAttributesListValue.getValue();
                    if (messageAttributeValueValue != null) {
                        if (messageAttributeValueValue.getDataType() != null) {
                            request.addParameter("MessageAttributes.entry." + messageAttributesListIndex + ".Value.DataType", StringUtils.fromString(messageAttributeValueValue.getDataType()));
                        }
                        if (messageAttributeValueValue.getStringValue() != null) {
                            request.addParameter("MessageAttributes.entry." + messageAttributesListIndex + ".Value.StringValue", StringUtils.fromString(messageAttributeValueValue.getStringValue()));
                        }
                        if (messageAttributeValueValue.getBinaryValue() != null) {
                            request.addParameter("MessageAttributes.entry." + messageAttributesListIndex + ".Value.BinaryValue", StringUtils.fromByteBuffer(messageAttributeValueValue.getBinaryValue()));
                        }
                    }
                    ++messageAttributesListIndex;
                }
            }
        }

        return request;
    }
}
