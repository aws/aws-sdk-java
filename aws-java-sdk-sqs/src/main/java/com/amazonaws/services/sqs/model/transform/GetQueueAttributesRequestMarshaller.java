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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.sqs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * GetQueueAttributesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetQueueAttributesRequestMarshaller implements Marshaller<Request<GetQueueAttributesRequest>, GetQueueAttributesRequest> {

    public Request<GetQueueAttributesRequest> marshall(GetQueueAttributesRequest getQueueAttributesRequest) {

        if (getQueueAttributesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetQueueAttributesRequest> request = new DefaultRequest<GetQueueAttributesRequest>(getQueueAttributesRequest, "AmazonSQS");
        request.addParameter("Action", "GetQueueAttributes");
        request.addParameter("Version", "2012-11-05");
        request.setHttpMethod(HttpMethodName.POST);

        if (getQueueAttributesRequest.getQueueUrl() != null) {
            request.addParameter("QueueUrl", StringUtils.fromString(getQueueAttributesRequest.getQueueUrl()));
        }

        if (!getQueueAttributesRequest.getAttributeNames().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) getQueueAttributesRequest.getAttributeNames()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> attributeNamesList = (com.amazonaws.internal.SdkInternalList<String>) getQueueAttributesRequest
                    .getAttributeNames();
            int attributeNamesListIndex = 1;

            for (String attributeNamesListValue : attributeNamesList) {
                if (attributeNamesListValue != null) {
                    request.addParameter("AttributeName." + attributeNamesListIndex, StringUtils.fromString(attributeNamesListValue));
                }
                attributeNamesListIndex++;
            }
        }

        return request;
    }

}
