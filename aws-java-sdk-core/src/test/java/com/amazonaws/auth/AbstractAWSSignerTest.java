/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.auth;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.amazonaws.SdkClientException;

public class AbstractAWSSignerTest {

    private static final String EMPTY_STRING_SHA256_HEX = "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855";

    @Test
    public void testDigestOfEmptyString() {
        assertEquals(
            EMPTY_STRING_SHA256_HEX,
            AbstractAWSSigner.EMPTY_STRING_SHA256_HEX);
    }
    
    @Test(expected=SdkClientException.class)
    public void testMessageDigestAlgorithmDoesNotExist() {
        AbstractAWSSigner.getMessageDigestInstance("doesNotExist");
    }

}
