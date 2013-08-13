/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.sns.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Create Platform Endpoint Request Marshaller
 */
public class CreatePlatformEndpointRequestMarshaller implements Marshaller<Request<CreatePlatformEndpointRequest>, CreatePlatformEndpointRequest> {

    public Request<CreatePlatformEndpointRequest> marshall(CreatePlatformEndpointRequest createPlatformEndpointRequest) {

        if (createPlatformEndpointRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<CreatePlatformEndpointRequest> request = new DefaultRequest<CreatePlatformEndpointRequest>(createPlatformEndpointRequest, "AmazonSNS");
        request.addParameter("Action", "CreatePlatformEndpoint");
        request.addParameter("Version", "2010-03-31");

        if (createPlatformEndpointRequest.getPlatformApplicationArn() != null) {
            request.addParameter("PlatformApplicationArn", StringUtils.fromString(createPlatformEndpointRequest.getPlatformApplicationArn()));
        }
        if (createPlatformEndpointRequest.getToken() != null) {
            request.addParameter("Token", StringUtils.fromString(createPlatformEndpointRequest.getToken()));
        }
        if (createPlatformEndpointRequest.getCustomUserData() != null) {
            request.addParameter("CustomUserData", StringUtils.fromString(createPlatformEndpointRequest.getCustomUserData()));
        }
        if (createPlatformEndpointRequest != null) {
            if (createPlatformEndpointRequest.getAttributes() != null) {
                int attributesListIndex = 1;
                for (Map.Entry<String, String> attributesListValue : createPlatformEndpointRequest.getAttributes().entrySet()) {

                    if (attributesListValue.getKey() != null) {
                        request.addParameter("Attributes.entry." + attributesListIndex + ".key", StringUtils.fromString(attributesListValue.getKey()));
                    }
                    if (attributesListValue.getValue() != null) {
                        request.addParameter("Attributes.entry." + attributesListIndex + ".value", StringUtils.fromString(attributesListValue.getValue()));
                    }
                    ++attributesListIndex;
                }
            }
        }


        return request;
    }
}
