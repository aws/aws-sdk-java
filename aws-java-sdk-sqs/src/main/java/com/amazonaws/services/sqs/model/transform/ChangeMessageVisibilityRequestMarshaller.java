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
 * ChangeMessageVisibilityRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChangeMessageVisibilityRequestMarshaller implements Marshaller<Request<ChangeMessageVisibilityRequest>, ChangeMessageVisibilityRequest> {

    public Request<ChangeMessageVisibilityRequest> marshall(ChangeMessageVisibilityRequest changeMessageVisibilityRequest) {

        if (changeMessageVisibilityRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ChangeMessageVisibilityRequest> request = new DefaultRequest<ChangeMessageVisibilityRequest>(changeMessageVisibilityRequest, "AmazonSQS");
        request.addParameter("Action", "ChangeMessageVisibility");
        request.addParameter("Version", "2012-11-05");
        request.setHttpMethod(HttpMethodName.POST);

        if (changeMessageVisibilityRequest.getQueueUrl() != null) {
            request.addParameter("QueueUrl", StringUtils.fromString(changeMessageVisibilityRequest.getQueueUrl()));
        }

        if (changeMessageVisibilityRequest.getReceiptHandle() != null) {
            request.addParameter("ReceiptHandle", StringUtils.fromString(changeMessageVisibilityRequest.getReceiptHandle()));
        }

        if (changeMessageVisibilityRequest.getVisibilityTimeout() != null) {
            request.addParameter("VisibilityTimeout", StringUtils.fromInteger(changeMessageVisibilityRequest.getVisibilityTimeout()));
        }

        return request;
    }

}
