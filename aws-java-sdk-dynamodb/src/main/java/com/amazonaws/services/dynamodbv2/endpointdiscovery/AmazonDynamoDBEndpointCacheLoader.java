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
package com.amazonaws.services.dynamodbv2.endpointdiscovery;

import com.amazonaws.cache.CacheLoader;
import com.amazonaws.endpointdiscovery.Constants;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.model.DescribeEndpointsResult;
import com.amazonaws.services.dynamodbv2.model.DescribeEndpointsRequest;
import com.amazonaws.services.dynamodbv2.model.Endpoint;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonDynamoDBEndpointCacheLoader implements CacheLoader<String, Map<String, String>> {

    private final AmazonDynamoDB client;

    public AmazonDynamoDBEndpointCacheLoader(AmazonDynamoDB client) {
        this.client = client;
    }

    @Override
    public Map<String, String> load(String key) {
        DescribeEndpointsResult response = client.describeEndpoints(new DescribeEndpointsRequest());

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