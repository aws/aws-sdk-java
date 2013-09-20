/*
 * Copyright 2012-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * by looking at the: <code>AWS_ACCESS_KEY_ID</code> (or <code>AWS_ACCESS_KEY</code>) and
 * <code>AWS_SECRET_ACCESS_KEY</code> (or <code>AWS_SECRET_KEY</code>) environment variables.
 */
public class EnvironmentVariableCredentialsProvider implements AWSCredentialsProvider {

    /** Environment variable name for the AWS access key ID */
    private static final String ACCESS_KEY_ENV_VAR = "AWS_ACCESS_KEY_ID";

    /** Alternate environment variable name for the AWS access key ID */
    private static final String ACCESS_KEY_ENV_VAR_2 = "AWS_ACCESS_KEY";

    /** Environment variable name for the AWS secret key */
    private static final String SECRET_KEY_ENV_VAR = "AWS_SECRET_ACCESS_KEY";

    /** Alternate environment variable name for the AWS secret key */
    private static final String SECRET_KEY_ENV_VAR_2 = "AWS_SECRET_KEY";

    public AWSCredentials getCredentials() {
        String accessKey = System.getenv(ACCESS_KEY_ENV_VAR);
        if (accessKey == null) {
            accessKey = System.getenv(ACCESS_KEY_ENV_VAR_2);
        }

        String secretKey = System.getenv(SECRET_KEY_ENV_VAR);
        if (secretKey == null) {
            secretKey = System.getenv(SECRET_KEY_ENV_VAR_2);
        }

        if (accessKey != null && secretKey != null) {
            return new BasicAWSCredentials(accessKey, secretKey);
        }

        throw new AmazonClientException(
                "Unable to load AWS credentials from environment variables " +
                "(" + ACCESS_KEY_ENV_VAR + " (or " + ACCESS_KEY_ENV_VAR_2 + ") and " +
                SECRET_KEY_ENV_VAR + " (or " + SECRET_KEY_ENV_VAR_2 + "))");
    }

    public void refresh() {}

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}