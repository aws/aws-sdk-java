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
import static com.amazonaws.SDKGlobalConfiguration.ACCESS_KEY_ENV_VAR;
import static com.amazonaws.SDKGlobalConfiguration.ALTERNATE_ACCESS_KEY_ENV_VAR;
import static com.amazonaws.SDKGlobalConfiguration.ALTERNATE_SECRET_KEY_ENV_VAR;
import static com.amazonaws.SDKGlobalConfiguration.SECRET_KEY_ENV_VAR;

import com.amazonaws.AmazonClientException;

/**
 * {@link AWSCredentialsProvider} implementation that provides credentials
 * by looking at the: <code>AWS_ACCESS_KEY_ID</code> (or <code>AWS_ACCESS_KEY</code>) and
 * <code>AWS_SECRET_KEY</code> (or <code>AWS_SECRET_ACCESS_KEY</code>) environment variables.
 */
public class EnvironmentVariableCredentialsProvider implements AWSCredentialsProvider {

    public AWSCredentials getCredentials() {
        String accessKey = System.getenv(ACCESS_KEY_ENV_VAR);
        if (accessKey == null) {
            accessKey = System.getenv(ALTERNATE_ACCESS_KEY_ENV_VAR);
        }

        String secretKey = System.getenv(SECRET_KEY_ENV_VAR);
        if (secretKey == null) {
            secretKey = System.getenv(ALTERNATE_SECRET_KEY_ENV_VAR);
        }

        if (accessKey != null && secretKey != null) {
            return new BasicAWSCredentials(accessKey, secretKey);
        }

        throw new AmazonClientException(
                "Unable to load AWS credentials from environment variables " +
                "(" + ACCESS_KEY_ENV_VAR + " (or " + ALTERNATE_ACCESS_KEY_ENV_VAR + ") and " +
                SECRET_KEY_ENV_VAR + " (or " + ALTERNATE_SECRET_KEY_ENV_VAR + "))");
    }

    public void refresh() {}

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}