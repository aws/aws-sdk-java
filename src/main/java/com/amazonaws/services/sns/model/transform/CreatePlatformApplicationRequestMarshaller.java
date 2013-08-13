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
 * Create Platform Application Request Marshaller
 */
public class CreatePlatformApplicationRequestMarshaller implements Marshaller<Request<CreatePlatformApplicationRequest>, CreatePlatformApplicationRequest> {

    public Request<CreatePlatformApplicationRequest> marshall(CreatePlatformApplicationRequest createPlatformApplicationRequest) {

        if (createPlatformApplicationRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<CreatePlatformApplicationRequest> request = new DefaultRequest<CreatePlatformApplicationRequest>(createPlatformApplicationRequest, "AmazonSNS");
        request.addParameter("Action", "CreatePlatformApplication");
        request.addParameter("Version", "2010-03-31");

        if (createPlatformApplicationRequest.getName() != null) {
            request.addParameter("Name", StringUtils.fromString(createPlatformApplicationRequest.getName()));
        }
        if (createPlatformApplicationRequest.getPlatform() != null) {
            request.addParameter("Platform", StringUtils.fromString(createPlatformApplicationRequest.getPlatform()));
        }
        if (createPlatformApplicationRequest != null) {
            if (createPlatformApplicationRequest.getAttributes() != null) {
                int attributesListIndex = 1;
                for (Map.Entry<String, String> attributesListValue : createPlatformApplicationRequest.getAttributes().entrySet()) {

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
