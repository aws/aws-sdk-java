/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.s3.model;

public interface ExpectedSourceBucketOwnerRequest {
    /**
     * This value represents the expected account id of the source Amazon S3 bucket owner. If the source Amazon S3 bucket
     * is owned by a different account than the one you specify then the request will fail.
     */
    String getExpectedSourceBucketOwner();

    /**
     * This value represents the expected account id of the source Amazon S3 bucket owner. If the source Amazon S3 bucket
     * is owned by a different account than the one you specify then the request will fail.
     */
    ExpectedSourceBucketOwnerRequest withExpectedSourceBucketOwner(String expectedSourceBucketOwner);

    /**
     * This value represents the expected account id of the source Amazon S3 bucket owner. If the source Amazon S3 bucket
     * is owned by a different account than the one you specify then the request will fail.
     */
    void setExpectedSourceBucketOwner(String expectedSourceBucketOwner);
}
