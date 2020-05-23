/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediapackage;

import javax.annotation.Generated;

import com.amazonaws.services.mediapackage.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSMediaPackage}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSMediaPackage implements AWSMediaPackage {

    protected AbstractAWSMediaPackage() {
    }

    @Override
    public CreateChannelResult createChannel(CreateChannelRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateHarvestJobResult createHarvestJob(CreateHarvestJobRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateOriginEndpointResult createOriginEndpoint(CreateOriginEndpointRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteChannelResult deleteChannel(DeleteChannelRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeleteOriginEndpointResult deleteOriginEndpoint(DeleteOriginEndpointRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeChannelResult describeChannel(DescribeChannelRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeHarvestJobResult describeHarvestJob(DescribeHarvestJobRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DescribeOriginEndpointResult describeOriginEndpoint(DescribeOriginEndpointRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListChannelsResult listChannels(ListChannelsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListHarvestJobsResult listHarvestJobs(ListHarvestJobsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListOriginEndpointsResult listOriginEndpoints(ListOriginEndpointsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public RotateChannelCredentialsResult rotateChannelCredentials(RotateChannelCredentialsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public RotateIngestEndpointCredentialsResult rotateIngestEndpointCredentials(RotateIngestEndpointCredentialsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateChannelResult updateChannel(UpdateChannelRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdateOriginEndpointResult updateOriginEndpoint(UpdateOriginEndpointRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new UnsupportedOperationException();
    }

}
