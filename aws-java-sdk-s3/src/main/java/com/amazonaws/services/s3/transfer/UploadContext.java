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
package com.amazonaws.services.s3.transfer;

import com.amazonaws.annotation.SdkInternalApi;

import java.io.File;

/**
 * Context object provided to {@link ObjectTaggingProvider} to provide extra information about the
 * object being uploaded.
 */
public final class UploadContext {
    private final File file;
    private final String bucket;
    private final String key;

    @SdkInternalApi
    UploadContext(File file, String bucket, String key) {
        this.file = file;
        this.bucket = bucket;
        this.key = key;
    }

    public File getFile() {
        return file;
    }

    public String getBucket() {
        return bucket;
    }

    public String getKey() {
        return key;
    }
}
