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

/**
 * Abstract implementation of {@code AmazonKinesisVideoArchivedMediaAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonKinesisVideoArchivedMediaAsync extends AbstractAmazonKinesisVideoArchivedMedia implements AmazonKinesisVideoArchivedMediaAsync {

    protected AbstractAmazonKinesisVideoArchivedMediaAsync() {
    }

    @Override
    public java.util.concurrent.Future<GetHLSStreamingSessionURLResult> getHLSStreamingSessionURLAsync(GetHLSStreamingSessionURLRequest request) {

        return getHLSStreamingSessionURLAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetHLSStreamingSessionURLResult> getHLSStreamingSessionURLAsync(GetHLSStreamingSessionURLRequest request,
            com.amazonaws.handlers.AsyncHandler<GetHLSStreamingSessionURLRequest, GetHLSStreamingSessionURLResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetMediaForFragmentListResult> getMediaForFragmentListAsync(GetMediaForFragmentListRequest request) {

        return getMediaForFragmentListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMediaForFragmentListResult> getMediaForFragmentListAsync(GetMediaForFragmentListRequest request,
            com.amazonaws.handlers.AsyncHandler<GetMediaForFragmentListRequest, GetMediaForFragmentListResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListFragmentsResult> listFragmentsAsync(ListFragmentsRequest request) {

        return listFragmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFragmentsResult> listFragmentsAsync(ListFragmentsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListFragmentsRequest, ListFragmentsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
