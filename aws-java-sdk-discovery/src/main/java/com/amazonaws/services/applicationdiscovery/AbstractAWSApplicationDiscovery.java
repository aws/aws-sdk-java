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
package com.amazonaws.services.applicationdiscovery;

import com.amazonaws.services.applicationdiscovery.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSApplicationDiscovery}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
public class AbstractAWSApplicationDiscovery implements AWSApplicationDiscovery {

    protected AbstractAWSApplicationDiscovery() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateTagsResult createTags(CreateTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteTagsResult deleteTags(DeleteTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAgentsResult describeAgents(DescribeAgentsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeConfigurationsResult describeConfigurations(DescribeConfigurationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeExportConfigurationsResult describeExportConfigurations(DescribeExportConfigurationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeTagsResult describeTags(DescribeTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ExportConfigurationsResult exportConfigurations(ExportConfigurationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListConfigurationsResult listConfigurations(ListConfigurationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartDataCollectionByAgentIdsResult startDataCollectionByAgentIds(StartDataCollectionByAgentIdsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StopDataCollectionByAgentIdsResult stopDataCollectionByAgentIds(StopDataCollectionByAgentIdsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}
