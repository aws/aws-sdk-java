/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Describe D B Subnet Groups Request Marshaller
 */
public class DescribeDBSubnetGroupsRequestMarshaller implements Marshaller<Request<DescribeDBSubnetGroupsRequest>, DescribeDBSubnetGroupsRequest> {

    public Request<DescribeDBSubnetGroupsRequest> marshall(DescribeDBSubnetGroupsRequest describeDBSubnetGroupsRequest) {

        if (describeDBSubnetGroupsRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DescribeDBSubnetGroupsRequest> request = new DefaultRequest<DescribeDBSubnetGroupsRequest>(describeDBSubnetGroupsRequest, "AmazonRDS");
        request.addParameter("Action", "DescribeDBSubnetGroups");
        request.addParameter("Version", "2012-01-15");

        if (describeDBSubnetGroupsRequest.getDBSubnetGroupName() != null) {
            request.addParameter("DBSubnetGroupName", StringUtils.fromString(describeDBSubnetGroupsRequest.getDBSubnetGroupName()));
        }
        if (describeDBSubnetGroupsRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeDBSubnetGroupsRequest.getMaxRecords()));
        }
        if (describeDBSubnetGroupsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeDBSubnetGroupsRequest.getMarker()));
        }


        return request;
    }
}
