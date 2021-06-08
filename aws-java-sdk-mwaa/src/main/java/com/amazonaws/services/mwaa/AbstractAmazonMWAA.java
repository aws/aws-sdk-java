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
package com.amazonaws.services.mwaa;

import javax.annotation.Generated;

import com.amazonaws.services.mwaa.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonMWAA}. Convenient method forms pass through to the corresponding overload
 * that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonMWAA implements AmazonMWAA {

    protected AbstractAmazonMWAA() {
    }

    @Override
    public CreateCliTokenResult createCliToken(CreateCliTokenRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateEnvironmentResult createEnvironment(CreateEnvironmentRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateWebLoginTokenResult createWebLoginToken(CreateWebLoginTokenRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteEnvironmentResult deleteEnvironment(DeleteEnvironmentRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetEnvironmentResult getEnvironment(GetEnvironmentRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListEnvironmentsResult listEnvironments(ListEnvironmentsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PublishMetricsResult publishMetrics(PublishMetricsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateEnvironmentResult updateEnvironment(UpdateEnvironmentRequest request) {
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
