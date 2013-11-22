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
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Describe Image Attribute Request Marshaller
 */
public class DescribeImageAttributeRequestMarshaller implements Marshaller<Request<DescribeImageAttributeRequest>, DescribeImageAttributeRequest> {

    public Request<DescribeImageAttributeRequest> marshall(DescribeImageAttributeRequest describeImageAttributeRequest) {

        if (describeImageAttributeRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DescribeImageAttributeRequest> request = new DefaultRequest<DescribeImageAttributeRequest>(describeImageAttributeRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeImageAttribute");
        request.addParameter("Version", "2013-10-15");

        if (describeImageAttributeRequest.getImageId() != null) {
            request.addParameter("ImageId", StringUtils.fromString(describeImageAttributeRequest.getImageId()));
        }
        if (describeImageAttributeRequest.getAttribute() != null) {
            request.addParameter("Attribute", StringUtils.fromString(describeImageAttributeRequest.getAttribute()));
        }


        return request;
    }
}
