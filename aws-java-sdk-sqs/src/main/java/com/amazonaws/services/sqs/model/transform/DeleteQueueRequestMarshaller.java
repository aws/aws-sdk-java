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
 * DeleteQueueRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteQueueRequestMarshaller implements Marshaller<Request<DeleteQueueRequest>, DeleteQueueRequest> {

    public Request<DeleteQueueRequest> marshall(DeleteQueueRequest deleteQueueRequest) {

        if (deleteQueueRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteQueueRequest> request = new DefaultRequest<DeleteQueueRequest>(deleteQueueRequest, "AmazonSQS");
        request.addParameter("Action", "DeleteQueue");
        request.addParameter("Version", "2012-11-05");
        request.setHttpMethod(HttpMethodName.POST);

        if (deleteQueueRequest.getQueueUrl() != null) {
            request.addParameter("QueueUrl", StringUtils.fromString(deleteQueueRequest.getQueueUrl()));
        }

        return request;
    }

}
