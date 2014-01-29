/*
 * Copyright 2014-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.net.URI;
import java.util.List;

import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.auth.Signer;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.http.ExecutionContext;

public class S3ExecutionContext extends ExecutionContext {
    private Signer signer;

    public S3ExecutionContext(List<RequestHandler2> requestHandler2s,
            boolean isMetricEnabled, AmazonWebServiceClient awsClient) {
        super(requestHandler2s, isMetricEnabled, awsClient);
    }

    @Override
    public void setSigner(Signer signer) {
        this.signer = signer;
    }

    @Override
    public Signer getSignerByURI(URI uri) {
        // We don't support the mutation of the request URI by the request
        // handlers in S3.  Hence the signer will remain the same.
        return signer;
    }
}
