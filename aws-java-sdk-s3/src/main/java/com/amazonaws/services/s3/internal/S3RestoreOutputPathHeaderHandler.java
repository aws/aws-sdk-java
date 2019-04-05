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

package com.amazonaws.services.s3.internal;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.Headers;

/**
 * Header handler to pull the {@link Headers#S3_RESTORE_OUTPUT_PATH} header out of the response.
 */
public class S3RestoreOutputPathHeaderHandler<T extends S3RestoreOutputPathResult> implements HeaderHandler<T> {

    /*
     * (non-Javadoc)
     *
     * @see
     * com.amazonaws.services.s3.internal.HeaderHandler#handle(java.lang.Object,
     * com.amazonaws.http.HttpResponse)
     */
    @Override
    public void handle(T result, HttpResponse response) {
        result.setRestoreOutputPath(response.getHeaders().get(Headers.S3_RESTORE_OUTPUT_PATH));
    }
}
