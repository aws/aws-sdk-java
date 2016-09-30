/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * DescribeStaleSecurityGroupsRequest Marshaller
 */

public class DescribeStaleSecurityGroupsRequestMarshaller implements
        Marshaller<Request<DescribeStaleSecurityGroupsRequest>, DescribeStaleSecurityGroupsRequest> {

    public Request<DescribeStaleSecurityGroupsRequest> marshall(DescribeStaleSecurityGroupsRequest describeStaleSecurityGroupsRequest) {

        if (describeStaleSecurityGroupsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeStaleSecurityGroupsRequest> request = new DefaultRequest<DescribeStaleSecurityGroupsRequest>(describeStaleSecurityGroupsRequest,
                "AmazonEC2");
        request.addParameter("Action", "DescribeStaleSecurityGroups");
        request.addParameter("Version", "2016-09-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeStaleSecurityGroupsRequest.getVpcId() != null) {
            request.addParameter("VpcId", StringUtils.fromString(describeStaleSecurityGroupsRequest.getVpcId()));
        }

        if (describeStaleSecurityGroupsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeStaleSecurityGroupsRequest.getMaxResults()));
        }

        if (describeStaleSecurityGroupsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeStaleSecurityGroupsRequest.getNextToken()));
        }

        return request;
    }

}
