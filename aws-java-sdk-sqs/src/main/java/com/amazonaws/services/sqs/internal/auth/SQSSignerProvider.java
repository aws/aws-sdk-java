/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
package com.amazonaws.services.sqs.internal.auth;

import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.auth.Signer;
import com.amazonaws.internal.auth.SignerProviderContext;
import com.amazonaws.internal.auth.SignerProvider;

/**
 * SQS alters the request endpoint as part of a request handler which inspects
 * the request's parameters.  As a result we must always look up the signer
 * by the resulting request URI.  This signer provider always does that lookup
 * instead of defaulting to a cached signer.
 */
public class SQSSignerProvider extends SignerProvider {

    private final AmazonWebServiceClient awsClient;

    public SQSSignerProvider(AmazonWebServiceClient awsClient,
                             Signer signer) {
        this.awsClient = awsClient;
    }

    @Override
    public Signer getSigner(SignerProviderContext context) {
        return awsClient.getSignerByURI(context.getUri());
    }

}