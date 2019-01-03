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
package com.amazonaws.services.s3;

import java.util.Map;

import com.amazonaws.ResponseMetadata;

/**
 * Extension of {@link ResponseMetadata} with Amazon S3 specific data. In
 * addition to the standard AWS request ID contained in all services' response
 * metadata, Amazon S3 also includes a host ID that can be provided to AWS
 * support when debugging an issue with Amazon S3.
 */
public class S3ResponseMetadata extends ResponseMetadata {
    public static final String HOST_ID = "HOST_ID";
    public static final String CLOUD_FRONT_ID = "CLOUD_FRONT_ID";

    /**
     * Creates a new S3ResponseMetadata object from a specified map of metadata
     * information.
     *
     * @param metadata
     *            The raw metadata for the new S3ResponseMetadata object.
     */
    public S3ResponseMetadata(Map<String, String> metadata) {
        super(metadata);
    }

    /**
     * Creates a new S3ResponseMetadata object from an existing ResponseMetadata
     * object.
     *
     * @param originalResponseMetadata
     *            The ResponseMetadata object from which to create the new
     *            object.
     */
    public S3ResponseMetadata(ResponseMetadata originalResponseMetadata) {
        super(originalResponseMetadata);
    }

    /**
     * Returns the Amazon S3 host ID, providing additional debugging information
     * about how a request was handled. You can provide AWS support with this ID
     * to help troubleshoot issues where Amazon S3 isn't handling your request
     * as expected.
     *
     * @return The Amazon S3 host ID, providing additional debugging information
     *         about how a request was handled.
     */
    public String getHostId() {
        return metadata.get(HOST_ID);
    }

    public String getCloudFrontId() {
        return metadata.get(CLOUD_FRONT_ID);
    }

}
