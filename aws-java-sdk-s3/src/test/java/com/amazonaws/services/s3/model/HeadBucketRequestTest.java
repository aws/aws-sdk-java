/*
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import org.junit.Assert;
import org.junit.Test;

public class HeadBucketRequestTest {

    @Test
    public void equalRequestsTest() {
        String bucketName1 = "test-bucket";
        String bucketName2 = "test-bucket";
        Assert.assertEquals(new HeadBucketRequest(bucketName1), new HeadBucketRequest(bucketName2));
    }

    @Test
    public void equalByReferenceTest() {
        HeadBucketRequest headBucketRequest = new HeadBucketRequest("bucket-name");
        Assert.assertEquals(headBucketRequest, headBucketRequest);
    }

    @Test
    public void notEqualRequestsTest() {
        String bucketName1 = "test-bucket1";
        String bucketName2 = "test-bucket2";
        Assert.assertNotEquals(new HeadBucketRequest(bucketName1), new HeadBucketRequest(bucketName2));
    }
}