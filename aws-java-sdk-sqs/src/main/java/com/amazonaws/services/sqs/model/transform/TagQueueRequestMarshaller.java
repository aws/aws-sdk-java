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
 * TagQueueRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagQueueRequestMarshaller implements Marshaller<Request<TagQueueRequest>, TagQueueRequest> {

    public Request<TagQueueRequest> marshall(TagQueueRequest tagQueueRequest) {

        if (tagQueueRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<TagQueueRequest> request = new DefaultRequest<TagQueueRequest>(tagQueueRequest, "AmazonSQS");
        request.addParameter("Action", "TagQueue");
        request.addParameter("Version", "2012-11-05");
        request.setHttpMethod(HttpMethodName.POST);

        if (tagQueueRequest.getQueueUrl() != null) {
            request.addParameter("QueueUrl", StringUtils.fromString(tagQueueRequest.getQueueUrl()));
        }

        java.util.Map<String, String> tags = tagQueueRequest.getTags();
        int tagsListIndex = 1;
        for (Map.Entry<String, String> entry : tags.entrySet()) {
            if (entry.getKey() != null) {
                request.addParameter("Tags." + tagsListIndex + ".Key", StringUtils.fromString(entry.getKey()));
            }
            if (entry.getValue() != null) {
                request.addParameter("Tags." + tagsListIndex + ".Value", StringUtils.fromString(entry.getValue()));
            }
            tagsListIndex++;
        }

        return request;
    }

}
