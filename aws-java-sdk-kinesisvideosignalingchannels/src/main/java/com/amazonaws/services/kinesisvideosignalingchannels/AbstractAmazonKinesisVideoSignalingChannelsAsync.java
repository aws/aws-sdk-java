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
package com.amazonaws.services.kinesisvideosignalingchannels;

import javax.annotation.Generated;

import com.amazonaws.services.kinesisvideosignalingchannels.model.*;

/**
 * Abstract implementation of {@code AmazonKinesisVideoSignalingChannelsAsync}. Convenient method forms pass through to
 * the corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonKinesisVideoSignalingChannelsAsync extends AbstractAmazonKinesisVideoSignalingChannels implements
        AmazonKinesisVideoSignalingChannelsAsync {

    protected AbstractAmazonKinesisVideoSignalingChannelsAsync() {
    }

    @Override
    public java.util.concurrent.Future<GetIceServerConfigResult> getIceServerConfigAsync(GetIceServerConfigRequest request) {

        return getIceServerConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIceServerConfigResult> getIceServerConfigAsync(GetIceServerConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<GetIceServerConfigRequest, GetIceServerConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SendAlexaOfferToMasterResult> sendAlexaOfferToMasterAsync(SendAlexaOfferToMasterRequest request) {

        return sendAlexaOfferToMasterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendAlexaOfferToMasterResult> sendAlexaOfferToMasterAsync(SendAlexaOfferToMasterRequest request,
            com.amazonaws.handlers.AsyncHandler<SendAlexaOfferToMasterRequest, SendAlexaOfferToMasterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
