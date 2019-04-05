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
package com.amazonaws.services.elasticache.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeReplicationGroupsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReplicationGroupsRequestMarshaller implements Marshaller<Request<DescribeReplicationGroupsRequest>, DescribeReplicationGroupsRequest> {

    public Request<DescribeReplicationGroupsRequest> marshall(DescribeReplicationGroupsRequest describeReplicationGroupsRequest) {

        if (describeReplicationGroupsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeReplicationGroupsRequest> request = new DefaultRequest<DescribeReplicationGroupsRequest>(describeReplicationGroupsRequest,
                "AmazonElastiCache");
        request.addParameter("Action", "DescribeReplicationGroups");
        request.addParameter("Version", "2015-02-02");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeReplicationGroupsRequest.getReplicationGroupId() != null) {
            request.addParameter("ReplicationGroupId", StringUtils.fromString(describeReplicationGroupsRequest.getReplicationGroupId()));
        }

        if (describeReplicationGroupsRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeReplicationGroupsRequest.getMaxRecords()));
        }

        if (describeReplicationGroupsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeReplicationGroupsRequest.getMarker()));
        }

        return request;
    }

}
