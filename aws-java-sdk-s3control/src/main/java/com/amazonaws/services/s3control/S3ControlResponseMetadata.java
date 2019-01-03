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

package com.amazonaws.services.s3control;

import com.amazonaws.ResponseMetadata;
import com.amazonaws.annotation.SdkInternalApi;
import java.util.Map;

/**
 * Response metadata for AWS S3 Control Service.
 */
public final class S3ControlResponseMetadata extends ResponseMetadata {

    @SdkInternalApi
    public S3ControlResponseMetadata(Map<String, String> metadata) {
        super(metadata);
    }

    @SdkInternalApi
    public S3ControlResponseMetadata(ResponseMetadata originalResponseMetadata) {
        super(originalResponseMetadata);
    }

    /**
     * @return The extended request ID if available. This is needed in addition to {@link #getRequestId()} to
     * troubleshoot requests with the S3 service team.
     */
    public String getExtendedRequestId() {
        return metadata.get(ResponseMetadata.AWS_EXTENDED_REQUEST_ID);
    }
}
