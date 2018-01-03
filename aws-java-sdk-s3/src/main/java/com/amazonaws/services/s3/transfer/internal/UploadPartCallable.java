/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.transfer.internal;

import java.util.concurrent.Callable;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.PartETag;
import com.amazonaws.services.s3.model.UploadPartRequest;

public class UploadPartCallable implements Callable<PartETag> {
    private final AmazonS3 s3;
    private final UploadPartRequest request;

    public UploadPartCallable(AmazonS3 s3, UploadPartRequest request) {
        this.s3 = s3;
        this.request = request;
    }

    public PartETag call() throws Exception {
        PartETag partETag = s3.uploadPart(request).getPartETag();
        return partETag;
    }
}
