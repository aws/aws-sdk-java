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
 * Abstract implementation of {@code AmazonKinesisVideoArchivedMedia}. Convenient method forms pass through to the
 * corresponding overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonKinesisVideoArchivedMedia implements AmazonKinesisVideoArchivedMedia {

    protected AbstractAmazonKinesisVideoArchivedMedia() {
    }

    @Override
    public GetHLSStreamingSessionURLResult getHLSStreamingSessionURL(GetHLSStreamingSessionURLRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetMediaForFragmentListResult getMediaForFragmentList(GetMediaForFragmentListRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListFragmentsResult listFragments(ListFragmentsRequest request) {
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
