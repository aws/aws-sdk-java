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
 * PublishRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PublishRequestMarshaller implements Marshaller<Request<PublishRequest>, PublishRequest> {

    public Request<PublishRequest> marshall(PublishRequest publishRequest) {

        if (publishRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<PublishRequest> request = new DefaultRequest<PublishRequest>(publishRequest, "AmazonSNS");
        request.addParameter("Action", "Publish");
        request.addParameter("Version", "2010-03-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (publishRequest.getTopicArn() != null) {
            request.addParameter("TopicArn", StringUtils.fromString(publishRequest.getTopicArn()));
        }

        if (publishRequest.getTargetArn() != null) {
            request.addParameter("TargetArn", StringUtils.fromString(publishRequest.getTargetArn()));
        }

        if (publishRequest.getPhoneNumber() != null) {
            request.addParameter("PhoneNumber", StringUtils.fromString(publishRequest.getPhoneNumber()));
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

        java.util.Map<String, MessageAttributeValue> messageAttributes = publishRequest.getMessageAttributes();
        int messageAttributesListIndex = 1;
        for (Map.Entry<String, MessageAttributeValue> entry : messageAttributes.entrySet()) {
            if (entry.getKey() != null) {
                request.addParameter("MessageAttributes.entry." + messageAttributesListIndex + ".Name", StringUtils.fromString(entry.getKey()));
            }
            if (entry.getValue() != null) {

                if (entry.getValue().getDataType() != null) {
                    request.addParameter("MessageAttributes.entry." + messageAttributesListIndex + ".Value.DataType",
                            StringUtils.fromString(entry.getValue().getDataType()));
                }

                if (entry.getValue().getStringValue() != null) {
                    request.addParameter("MessageAttributes.entry." + messageAttributesListIndex + ".Value.StringValue",
                            StringUtils.fromString(entry.getValue().getStringValue()));
                }

                if (entry.getValue().getBinaryValue() != null) {
                    request.addParameter("MessageAttributes.entry." + messageAttributesListIndex + ".Value.BinaryValue",
                            StringUtils.fromByteBuffer(entry.getValue().getBinaryValue()));
                }
            }
            messageAttributesListIndex++;
        }

        return request;
    }

}
