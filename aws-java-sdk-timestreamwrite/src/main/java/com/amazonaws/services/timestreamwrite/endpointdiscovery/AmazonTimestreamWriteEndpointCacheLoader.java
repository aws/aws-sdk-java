/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.timestreamwrite.endpointdiscovery;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.cache.EndpointDiscoveryCacheLoader;
import com.amazonaws.endpointdiscovery.Constants;
import com.amazonaws.services.timestreamwrite.AmazonTimestreamWrite;
import com.amazonaws.services.timestreamwrite.model.DescribeEndpointsResult;
import com.amazonaws.services.timestreamwrite.model.DescribeEndpointsRequest;
import com.amazonaws.services.timestreamwrite.model.Endpoint;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonTimestreamWriteEndpointCacheLoader implements EndpointDiscoveryCacheLoader<String, Map<String, String>> {

    private final AmazonTimestreamWrite client;

    public AmazonTimestreamWriteEndpointCacheLoader(AmazonTimestreamWrite client) {
        this.client = client;
    }

    @Override
    public Map<String, String> load(String key, AmazonWebServiceRequest discoveryRequest) {
        if (discoveryRequest == null) {
            discoveryRequest = new DescribeEndpointsRequest();
        }

        DescribeEndpointsRequest request = (DescribeEndpointsRequest) discoveryRequest;
        DescribeEndpointsResult response = client.describeEndpoints(request);

        List<Endpoint> endpoints = response.getEndpoints();

        if (endpoints == null || endpoints.size() == 0) {
            return null;
        }

        Endpoint endpoint = endpoints.get(0);

        Map<String, String> endpointDetail = new HashMap<String, String>();
        endpointDetail.put(Constants.CACHE_PERIOD, String.valueOf(endpoint.getCachePeriodInMinutes()));
        endpointDetail.put(Constants.ENDPOINT, endpoint.getAddress());

        return endpointDetail;
    }
}