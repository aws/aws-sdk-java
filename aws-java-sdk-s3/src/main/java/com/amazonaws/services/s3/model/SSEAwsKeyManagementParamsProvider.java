/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model;

/**
 * Implemented by classes that support the option of using SSE with AWS Key
 * Management System.
 */
public interface SSEAwsKeyManagementParamsProvider {
    /**
     * Returns the optional SSEAwsKeyManagementParams to use to encrypt the
     * uploaded object.
     *
     * @return The optional SSEAwsKeyManagementParams to use to encrypt the
     *         uploaded object.
     */
    public SSEAwsKeyManagementParams getSSEAwsKeyManagementParams();
}
