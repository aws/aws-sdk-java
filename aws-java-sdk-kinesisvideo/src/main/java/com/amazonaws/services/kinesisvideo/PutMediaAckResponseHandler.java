/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.kinesisvideo;

import com.amazonaws.services.kinesisvideo.model.AckEvent;
import com.amazonaws.services.kinesisvideo.model.PutMediaRequest;

/**
 * Response handler interface for receiving {@link AckEvent}'s asynchronously during a
 * {@link AmazonKinesisVideoPutMediaClient#putMedia(PutMediaRequest, PutMediaAckResponseHandler)} request.
 */
public interface PutMediaAckResponseHandler extends PutMediaResponseHandler {

    /**
     * Called when an {@link AckEvent} is returned by the service.
     *
     * @param event Event data.
     */
    void onAckEvent(AckEvent event);
}
