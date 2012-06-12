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

/**
 * AWS credentials provider chain that looks for credentials in this order:
 * <ul>
 *   <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
 *   <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
 *   <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
 * </ul>
 *
 * @see EnvironmentVariableCredentialsProvider
 * @see SystemPropertiesCredentialsProvider
 * @see InstanceProfileCredentialsProvider
 */
public class DefaultAWSCredentialsProviderChain extends AWSCredentialsProviderChain {
    public DefaultAWSCredentialsProviderChain() {
        super(new EnvironmentVariableCredentialsProvider(),
              new SystemPropertiesCredentialsProvider(),
              new InstanceProfileCredentialsProvider());
    }
}