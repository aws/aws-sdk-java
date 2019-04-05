/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.retry.v2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FixedDelayBackoffStrategyTest {

    @Test(expected = IllegalArgumentException.class)
    public void negativeBackoff_ThrowsException() {
        new FixedDelayBackoffStrategy(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void zeroBackoff_ThrowsException() {
        new FixedDelayBackoffStrategy(0);
    }

    @Test
    public void positiveBackoff_ReturnsFixedBackoffOnDelay() {
        long delay = new FixedDelayBackoffStrategy(100).computeDelayBeforeNextRetry(RetryPolicyContexts.EMPTY);
        assertEquals(100, delay);
    }

}