/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.util;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ComparableUtilsTest {

    @Test
    public void safeCompare_SecondNull_ReturnsPositive() {
        assertThat(ComparableUtils.safeCompare(1.0, null), greaterThan(0));
    }

    @Test
    public void safeCompare_FirstNull_ReturnsNegative() {
        assertThat(ComparableUtils.safeCompare(null, 7.0), lessThan(0));
    }

    @Test
    public void safeCompare_BothNull_ReturnsZero() {
        assertThat(ComparableUtils.safeCompare(null, null), equalTo(0));
    }

    @Test
    public void safeCompare_FirstLarger_ReturnsPositive() {
        assertThat(ComparableUtils.safeCompare(7.0, 6.0), greaterThan(0));
    }

    @Test
    public void safeCompare_SecondLarger_ReturnsNegative() {
        assertThat(ComparableUtils.safeCompare(6.0, 7.0), lessThan(0));
    }
}
