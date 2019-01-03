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
 * DescribeCacheEngineVersionsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCacheEngineVersionsRequestMarshaller implements
        Marshaller<Request<DescribeCacheEngineVersionsRequest>, DescribeCacheEngineVersionsRequest> {

    public Request<DescribeCacheEngineVersionsRequest> marshall(DescribeCacheEngineVersionsRequest describeCacheEngineVersionsRequest) {

        if (describeCacheEngineVersionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeCacheEngineVersionsRequest> request = new DefaultRequest<DescribeCacheEngineVersionsRequest>(describeCacheEngineVersionsRequest,
                "AmazonElastiCache");
        request.addParameter("Action", "DescribeCacheEngineVersions");
        request.addParameter("Version", "2015-02-02");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeCacheEngineVersionsRequest.getEngine() != null) {
            request.addParameter("Engine", StringUtils.fromString(describeCacheEngineVersionsRequest.getEngine()));
        }

        if (describeCacheEngineVersionsRequest.getEngineVersion() != null) {
            request.addParameter("EngineVersion", StringUtils.fromString(describeCacheEngineVersionsRequest.getEngineVersion()));
        }

        if (describeCacheEngineVersionsRequest.getCacheParameterGroupFamily() != null) {
            request.addParameter("CacheParameterGroupFamily", StringUtils.fromString(describeCacheEngineVersionsRequest.getCacheParameterGroupFamily()));
        }

        if (describeCacheEngineVersionsRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeCacheEngineVersionsRequest.getMaxRecords()));
        }

        if (describeCacheEngineVersionsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeCacheEngineVersionsRequest.getMarker()));
        }

        if (describeCacheEngineVersionsRequest.getDefaultOnly() != null) {
            request.addParameter("DefaultOnly", StringUtils.fromBoolean(describeCacheEngineVersionsRequest.getDefaultOnly()));
        }

        return request;
    }

}
