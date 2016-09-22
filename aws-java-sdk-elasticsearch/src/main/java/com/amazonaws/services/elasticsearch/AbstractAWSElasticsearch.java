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
package com.amazonaws.services.elasticsearch;

import com.amazonaws.services.elasticsearch.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSElasticsearch}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
public class AbstractAWSElasticsearch implements AWSElasticsearch {

    protected AbstractAWSElasticsearch() {
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
    public AddTagsResult addTags(AddTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateElasticsearchDomainResult createElasticsearchDomain(CreateElasticsearchDomainRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteElasticsearchDomainResult deleteElasticsearchDomain(DeleteElasticsearchDomainRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeElasticsearchDomainResult describeElasticsearchDomain(DescribeElasticsearchDomainRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeElasticsearchDomainConfigResult describeElasticsearchDomainConfig(DescribeElasticsearchDomainConfigRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeElasticsearchDomainsResult describeElasticsearchDomains(DescribeElasticsearchDomainsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListDomainNamesResult listDomainNames(ListDomainNamesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsResult listTags(ListTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RemoveTagsResult removeTags(RemoveTagsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateElasticsearchDomainConfigResult updateElasticsearchDomainConfig(UpdateElasticsearchDomainConfigRequest request) {
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
