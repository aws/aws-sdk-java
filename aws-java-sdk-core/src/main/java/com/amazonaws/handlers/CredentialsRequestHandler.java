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
package com.amazonaws.handlers;

import com.amazonaws.auth.AWSCredentials;

/**
 * A special type of
 * <code>RequestHandler2</code> that takes in <code>AWSCredentials</code>.
 *
 * @deprecated Use of this class to retrieve the credentials is unsafe in
 * multithreading scenarios. If a client is used across multiple threads,
 * there's a possibility of running into a race condition where one handler
 * might access the credentials through the reference as another thread is
 * updating it. Retrieve the credentials from the handler context instead using
 * the {@link HandlerContextKey#AWS_CREDENTIALS} key.
 */
@Deprecated
public abstract class CredentialsRequestHandler extends RequestHandler2 {

    /** AWSCredentials to be used in the RequestHandler. */
    protected AWSCredentials awsCredentials;

    /**
     * Sets the AWSCredentials.
     */
    public void setCredentials(AWSCredentials awsCredentials) {
        this.awsCredentials = awsCredentials;
    }
}
