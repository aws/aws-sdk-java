/*
 * Copyright 2012-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.sqs.buffered;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.handlers.AsyncHandler;

/**
 * This class combines the handler we are supposed to call after the request is completed and the
 * original request object. The reason to hold on to the original request is that we have to provide
 * it to the async handler on successful completion. Storing the request object here means we don't
 * have to store it in the classes that do actual work. Those classes tend to forget about the
 * request objects as soon as the required data was extracted from them.
 */
class QueueBufferCallback<RequestType extends AmazonWebServiceRequest, ResultType> {

    private final AsyncHandler<RequestType, ResultType> handler;
    private final RequestType request;

    public QueueBufferCallback(AsyncHandler<RequestType, ResultType> paramHandler, RequestType request) {
        this.handler = paramHandler;
        this.request = request;
    }

    public void onError(Exception e) {
        if (null != handler)
            handler.onError(e);
    }

    public void onSuccess(ResultType result) {
        if (null != handler)
            handler.onSuccess(request, result);
    }

}
