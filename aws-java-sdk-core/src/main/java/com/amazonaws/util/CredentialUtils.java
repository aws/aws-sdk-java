/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is
 * distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either
 * express or implied. See the License for the specific language
 * governing
 * permissions and limitations under the License.
 */
package com.amazonaws.util;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.RequestConfig;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.internal.StaticCredentialsProvider;

public class CredentialUtils {

    /**
     *  Returns the credentials provider that will be used to fetch the
     *  credentials when signing the request. Request specific credentials
     *  takes precedence over the credentials/credentials provider set in the
     *  client.
     */
    public static AWSCredentialsProvider getCredentialsProvider(
            AmazonWebServiceRequest req,
            AWSCredentialsProvider base) {

        if (req != null && req.getRequestCredentialsProvider() != null) {
            return req.getRequestCredentialsProvider();
        }
        return base;
    }

    public static AWSCredentialsProvider getCredentialsProvider(
            RequestConfig requestConfig,
            AWSCredentialsProvider base) {

        if (requestConfig.getCredentialsProvider() != null) {
            return requestConfig.getCredentialsProvider();
        }
        return base;
    }
}
