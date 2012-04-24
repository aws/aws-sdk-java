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
 * Describe Cache Parameters Request Marshaller
 */
public class DescribeCacheParametersRequestMarshaller implements Marshaller<Request<DescribeCacheParametersRequest>, DescribeCacheParametersRequest> {

    public Request<DescribeCacheParametersRequest> marshall(DescribeCacheParametersRequest describeCacheParametersRequest) {

        if (describeCacheParametersRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DescribeCacheParametersRequest> request = new DefaultRequest<DescribeCacheParametersRequest>(describeCacheParametersRequest, "AmazonElastiCache");
        request.addParameter("Action", "DescribeCacheParameters");
        request.addParameter("Version", "2012-03-09");

        if (describeCacheParametersRequest.getCacheParameterGroupName() != null) {
            request.addParameter("CacheParameterGroupName", StringUtils.fromString(describeCacheParametersRequest.getCacheParameterGroupName()));
        }
        if (describeCacheParametersRequest.getSource() != null) {
            request.addParameter("Source", StringUtils.fromString(describeCacheParametersRequest.getSource()));
        }
        if (describeCacheParametersRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeCacheParametersRequest.getMaxRecords()));
        }
        if (describeCacheParametersRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeCacheParametersRequest.getMarker()));
        }


        return request;
    }
}
