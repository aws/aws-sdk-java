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
package com.amazonaws.services.kinesisvideo;

import javax.annotation.Generated;

import com.amazonaws.services.kinesisvideo.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonKinesisVideo}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonKinesisVideo implements AmazonKinesisVideo {

    protected AbstractAmazonKinesisVideo() {
    }

    @Override
    public CreateStreamResult createStream(CreateStreamRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteStreamResult deleteStream(DeleteStreamRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeStreamResult describeStream(DescribeStreamRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetDataEndpointResult getDataEndpoint(GetDataEndpointRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListStreamsResult listStreams(ListStreamsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForStreamResult listTagsForStream(ListTagsForStreamRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TagStreamResult tagStream(TagStreamRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UntagStreamResult untagStream(UntagStreamRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateDataRetentionResult updateDataRetention(UpdateDataRetentionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateStreamResult updateStream(UpdateStreamRequest request) {
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
