/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.s3control.internal.handlers;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.services.s3control.model.ListTagsForResourceRequest;
import com.amazonaws.services.s3control.model.TagResourceRequest;
import com.amazonaws.services.s3control.model.UntagResourceRequest;
import com.amazonaws.util.SdkHttpUtils;

/**
 * URL-encodes the ARN for specific operations.
 */
public class ArnHandler extends RequestHandler2 {
    @Override
    public void beforeRequest(Request<?> request) {

        AmazonWebServiceRequest original = request.getOriginalRequest();

        if (original instanceof TagResourceRequest) {
            TagResourceRequest tagResourceRequest = (TagResourceRequest) original;
            updateResourcePath(request, tagResourceRequest.getResourceArn());
        } else if (original instanceof ListTagsForResourceRequest) {
            ListTagsForResourceRequest listTagsForResourceRequest = (ListTagsForResourceRequest) original;
            updateResourcePath(request, listTagsForResourceRequest.getResourceArn());
        } else if (original instanceof UntagResourceRequest) {
            UntagResourceRequest untagResourceRequest = (UntagResourceRequest) original;
            updateResourcePath(request, untagResourceRequest.getResourceArn());
        }
    }

    private void updateResourcePath(Request<?> request, String arn) {
        String encodedArn = SdkHttpUtils.urlEncode(arn, true);
        String resourcePath = request.getResourcePath().replace(arn, encodedArn);
        request.setResourcePath(resourcePath);
    }
}
