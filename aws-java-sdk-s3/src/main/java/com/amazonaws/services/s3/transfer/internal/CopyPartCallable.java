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
package com.amazonaws.services.s3.transfer.internal;

import java.util.concurrent.Callable;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.CopyPartRequest;
import com.amazonaws.services.s3.model.PartETag;

/**
 * An implementation of the Callable interface responsible for carrying out the
 * Copy part requests.
 *
 */
public class CopyPartCallable implements Callable<PartETag> {

    /** Reference to the Amazon S3 client object used for initiating copy part request.*/
    private final AmazonS3 s3;
    /** Copy part request to be initiated.*/
    private final CopyPartRequest request;

    public CopyPartCallable(AmazonS3 s3, CopyPartRequest request) {
        this.s3 = s3;
        this.request = request;
    }

    public PartETag call() throws Exception {
        return s3.copyPart(request).getPartETag();
    }
}
