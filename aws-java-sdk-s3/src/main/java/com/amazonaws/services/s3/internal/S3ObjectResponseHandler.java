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


import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;

/**
 * S3 HTTP response handler that knows how to pull S3 object content and
 * metadata out of an HTTP response and unmarshall it into an S3Object object.
 */
public class S3ObjectResponseHandler extends AbstractS3ResponseHandler<S3Object> {

    /**
     * @see com.amazonaws.http.HttpResponseHandler#handle(com.amazonaws.http.HttpResponse)
     */
    public AmazonWebServiceResponse<S3Object> handle(HttpResponse response) throws Exception {
        /*
         * TODO: It'd be nice to set the bucket name and key here, but the information isn't easy to
         * pull out of the response/request currently.
         */
        S3Object object = new S3Object();
        AmazonWebServiceResponse<S3Object> awsResponse = parseResponseMetadata(response);
        if (response.getHeaders().get(Headers.REDIRECT_LOCATION) != null) {
            object.setRedirectLocation(response.getHeaders().get(Headers.REDIRECT_LOCATION));
        }
        // If the requester is charged when downloading a object from an
        // Requester Pays bucket, then this header is set.
        if (response.getHeaders().get(Headers.REQUESTER_CHARGED_HEADER) != null) {
            object.setRequesterCharged(true);
        }

        if (response.getHeaders().get(Headers.S3_TAGGING_COUNT) != null) {
            object.setTaggingCount(Integer.parseInt(response.getHeaders().get(Headers.S3_TAGGING_COUNT)));
        }

        ObjectMetadata metadata = object.getObjectMetadata();
        populateObjectMetadata(response, metadata);

        object.setObjectContent(new S3ObjectInputStream(response.getContent(), response.getHttpRequest()));

        awsResponse.setResult(object);
        return awsResponse;
    }

    /**
     * Returns true, since the entire response isn't read while this response
     * handler handles the response. This enables us to keep the underlying HTTP
     * connection open, so that the caller can stream it off.
     *
     * @see com.amazonaws.http.HttpResponseHandler#needsConnectionLeftOpen()
     */
    @Override
    public boolean needsConnectionLeftOpen() {
        return true;
    }

    private long getContentLength(HttpResponse response) {
        final String contentLength = response.getHeader("Content-Length");
        if (contentLength == null) {
            return -1;
        } else {
            return Long.parseLong(response.getHeader("Content-Length"));
        }
    }

}
