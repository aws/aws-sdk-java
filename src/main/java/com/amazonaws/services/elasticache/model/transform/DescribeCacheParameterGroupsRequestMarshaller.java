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
package com.amazonaws.services.elasticache.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Describe Cache Parameter Groups Request Marshaller
 */
public class DescribeCacheParameterGroupsRequestMarshaller implements Marshaller<Request<DescribeCacheParameterGroupsRequest>, DescribeCacheParameterGroupsRequest> {

    public Request<DescribeCacheParameterGroupsRequest> marshall(DescribeCacheParameterGroupsRequest describeCacheParameterGroupsRequest) {

        if (describeCacheParameterGroupsRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DescribeCacheParameterGroupsRequest> request = new DefaultRequest<DescribeCacheParameterGroupsRequest>(describeCacheParameterGroupsRequest, "AmazonElastiCache");
        request.addParameter("Action", "DescribeCacheParameterGroups");
        request.addParameter("Version", "2012-03-09");

        if (describeCacheParameterGroupsRequest.getCacheParameterGroupName() != null) {
            request.addParameter("CacheParameterGroupName", StringUtils.fromString(describeCacheParameterGroupsRequest.getCacheParameterGroupName()));
        }
        if (describeCacheParameterGroupsRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeCacheParameterGroupsRequest.getMaxRecords()));
        }
        if (describeCacheParameterGroupsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeCacheParameterGroupsRequest.getMarker()));
        }


        return request;
    }
}
