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
 * Describe Network Interface Attribute Request Marshaller
 */
public class DescribeNetworkInterfaceAttributeRequestMarshaller implements Marshaller<Request<DescribeNetworkInterfaceAttributeRequest>, DescribeNetworkInterfaceAttributeRequest> {

    public Request<DescribeNetworkInterfaceAttributeRequest> marshall(DescribeNetworkInterfaceAttributeRequest describeNetworkInterfaceAttributeRequest) {

        if (describeNetworkInterfaceAttributeRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DescribeNetworkInterfaceAttributeRequest> request = new DefaultRequest<DescribeNetworkInterfaceAttributeRequest>(describeNetworkInterfaceAttributeRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeNetworkInterfaceAttribute");
        request.addParameter("Version", "2013-10-15");

        if (describeNetworkInterfaceAttributeRequest.getNetworkInterfaceId() != null) {
            request.addParameter("NetworkInterfaceId", StringUtils.fromString(describeNetworkInterfaceAttributeRequest.getNetworkInterfaceId()));
        }
        if (describeNetworkInterfaceAttributeRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(describeNetworkInterfaceAttributeRequest.getDescription()));
        }
        if (describeNetworkInterfaceAttributeRequest.getSourceDestCheck() != null) {
            request.addParameter("SourceDestCheck", StringUtils.fromString(describeNetworkInterfaceAttributeRequest.getSourceDestCheck()));
        }
        if (describeNetworkInterfaceAttributeRequest.getGroups() != null) {
            request.addParameter("GroupSet", StringUtils.fromString(describeNetworkInterfaceAttributeRequest.getGroups()));
        }
        if (describeNetworkInterfaceAttributeRequest.getAttachment() != null) {
            request.addParameter("Attachment", StringUtils.fromString(describeNetworkInterfaceAttributeRequest.getAttachment()));
        }


        return request;
    }
}
