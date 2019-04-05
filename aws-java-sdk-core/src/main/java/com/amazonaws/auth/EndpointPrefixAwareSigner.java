/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.auth;

/**
 * A signer that knows the endpoint prefix of the AWS service.
 *
 * For example,
 * s3 is the endpoint prefix for Amazon S3 service.
 * iot is the endpoint prefix for AWS Iot service.
 *
 * The endpoint prefix will be used to compute the region to use
 * for signing if it is not already computed.
 */
public interface EndpointPrefixAwareSigner extends Signer {

    /**
     * Configure the signer with the endpoint prefix
     * of the service it is talking to.
     *
     * @param value The endpoint prefix of the service
     */
    void setEndpointPrefix(String value);
}
