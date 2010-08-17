/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.sns.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Publish Request Marshaller
 */
public class PublishRequestMarshaller implements Marshaller<Request<PublishRequest>, PublishRequest> {

    public Request<PublishRequest> marshall(PublishRequest publishRequest) {
        Request<PublishRequest> request = new DefaultRequest<PublishRequest>(publishRequest, "AmazonSNS");
        request.addParameter("Action", "Publish");
        request.addParameter("Version", "2010-03-31");
        if (publishRequest != null) {
            if (publishRequest.getTopicArn() != null) {
                request.addParameter("TopicArn", StringUtils.fromString(publishRequest.getTopicArn()));
            }
        }
        if (publishRequest != null) {
            if (publishRequest.getMessage() != null) {
                request.addParameter("Message", StringUtils.fromString(publishRequest.getMessage()));
            }
        }
        if (publishRequest != null) {
            if (publishRequest.getSubject() != null) {
                request.addParameter("Subject", StringUtils.fromString(publishRequest.getSubject()));
            }
        }


        return request;
    }
}
