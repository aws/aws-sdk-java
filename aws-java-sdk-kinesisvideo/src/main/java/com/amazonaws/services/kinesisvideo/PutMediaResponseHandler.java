/*
 * Copyright 2012-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.services.kinesisvideo.model.PutMediaRequest;

/**
 * Base handler interface for {@link PutMediaAckResponseHandler}.
 */
public interface PutMediaResponseHandler {

    /**
     * Called when the {@link AmazonKinesisVideoPutMedia#putMedia(PutMediaRequest, PutMediaAckResponseHandler)} call is unsuccessful
     * or aborted abnormally.
     *
     * <p>Note that only one of {@link #onFailure(Throwable)} and {@link #onComplete()} will be called</p>
     *
     * @param t Cause of failure.
     */
    void onFailure(Throwable t);

    /**
     * Called when all ack event data has been received for the stream.
     *
     * <p>Note that only one of {@link #onFailure(Throwable)} and {@link #onComplete()} will be called</p>
     */
    void onComplete();
}
