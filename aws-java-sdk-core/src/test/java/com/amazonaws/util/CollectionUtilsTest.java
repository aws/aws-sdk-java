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
package com.amazonaws.util;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isEmptyString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CollectionUtilsTest {

    @Test
    public void isEmpty_NullCollection_ReturnsTrue() {
        assertTrue(CollectionUtils.isNullOrEmpty(null));
    }

    @Test
    public void isEmpty_EmptyCollection_ReturnsTrue() {
        assertTrue(CollectionUtils.isNullOrEmpty(Collections.emptyList()));
    }

    @Test
    public void isEmpty_NonEmptyCollection_ReturnsFalse() {
        assertFalse(CollectionUtils.isNullOrEmpty(Arrays.asList("something")));
    }

    @Test
    public void join_NullCollection_ReturnsNull() {
        assertThat(CollectionUtils.join(null, ","), isEmptyString());
    }

    @Test
    public void join_EmptyCollection_ReturnsNull() {
        assertThat(CollectionUtils.join(Collections.<String>emptyList(), ","), isEmptyString());
    }

    @Test
    public void join_SingleItemCollection_ReturnsItemAsString() {
        assertEquals("foo", CollectionUtils.join(Arrays.asList("foo"), ","));
    }

    @Test
    public void join_SingleItemCollectionOfNullString_ReturnsEmptyString() {
        List<String> list = new ArrayList<String>();
        list.add(null);
        assertEquals("", CollectionUtils.join(list, ","));
    }

    @Test
    public void join_MultiItemCollection_ReturnsItemsJoinedWithSeparator() {
        assertEquals("foo,bar,baz", CollectionUtils.join(Arrays.asList("foo", "bar", "baz"), ","));
    }

    @Test
    public void join_MultiItemCollectionWithNullItem_ReturnsItemsJoinedWithSeparator() {
        assertEquals("foo,,baz", CollectionUtils.join(Arrays.asList("foo", null, "baz"), ","));
    }

    @Test
    public void join_MultiItemCollectionWithAllNulls_ReturnsItemsJoinedWithSeparator() {
        assertEquals(",,", CollectionUtils.join(Arrays.<String>asList(null, null, null), ","));
    }
}
