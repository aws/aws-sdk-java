/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;

/**
 * {@link AWSCredentialsProvider} implementation that provides credentials
 * by looking at the <code>AWS_ACCESS_KEY_ID</code> and
 * <code>AWS_SECRET_KEY</code> environment variables.
 */
public class EnvironmentVariableCredentialsProvider implements AWSCredentialsProvider {

    /** Environment variable name for the AWS access key ID */
    private static final String ACCESS_KEY_ENV_VAR = "AWS_ACCESS_KEY_ID";

    /** Environment variable name for the AWS secret key */
    private static final String SECRET_KEY_ENV_VAR = "AWS_SECRET_KEY";

    public AWSCredentials getCredentials() {
        if (System.getenv(ACCESS_KEY_ENV_VAR) != null &&
            System.getenv(SECRET_KEY_ENV_VAR) != null) {

            return new BasicAWSCredentials(
                    System.getenv(ACCESS_KEY_ENV_VAR),
                    System.getenv(SECRET_KEY_ENV_VAR));
        }

        throw new AmazonClientException(
                "Unable to load AWS credentials from environment variables " +
                "(" + ACCESS_KEY_ENV_VAR + " and " + SECRET_KEY_ENV_VAR + ")");
    }

    public void refresh() {}

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}