/*
 * Copyright 2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.services.s3.model.AmazonS3Exception;

import java.util.HashSet;
import java.util.Set;

/**
 * Complete Multipart Upload API returns a 2xx
 * success response with an Error xml in the body. Some of these errors
 * can be retried as per the API documentation {@see http://docs.aws.amazon.com/AmazonS3/latest/API/mpUploadComplete.html}
 *
 * This predicate analyzes the exception and returns true if the exception
 * can be retried.
 *
 * <p/>
 * A sample success response with Error response Xml in body:
 * <p/>
 * HTTP/1.1 200 OK
 * x-amz-id-2: Uuag1LuByRx9e6j5Onimru9pO4ZVKnJ2Qz7/C1NPcfTWAtRPfTaOFg==
 * x-amz-request-id: 656c76696e6727732072657175657374
 * Date:  Mon, 1 Nov 2010 20:34:56 GMT
 * Connection: close
 * Server: AmazonS3
 *
 * <?xml version="1.0" encoding="UTF-8"?>
 * <Error>
 * <Code>InternalError</Code>
 * <Message>We encountered an internal error. Please try again.</Message>
 * <RequestId>656c76696e6727732072657175657374</RequestId>
 * <HostId>Uuag1LuByRx9e6j5Onimru9pO4ZVKnJ2Qz7/C1NPcfTWAtRPfTaOFg==</HostId>
 * </Error>
 */
public class CompleteMultipartUploadRetryablePredicate {

    private static final String INTERNAL_ERROR_CODE = "InternalError";
    private static final String SLOW_DOWN_ERROR_CODE = "SlowDown";

    public boolean test(AmazonS3Exception exception) {

        if (exception == null || exception.getErrorCode() == null) {
            return false;
        }

        return exception.getErrorCode().contains(INTERNAL_ERROR_CODE) ||
               exception.getErrorCode().contains(SLOW_DOWN_ERROR_CODE);
    }
}
