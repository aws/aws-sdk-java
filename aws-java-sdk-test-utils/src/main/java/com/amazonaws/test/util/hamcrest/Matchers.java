/*
 * Copyright (c) 2017. Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.test.util.hamcrest;

import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Matchers {

    /***
     * Creates a matcher that matches if the examined collection matches the specified matchers in order
     *
     * <p/>
     * For example:
     * <pre>assertThat(Arrays.asList("foo", "bar"), containsOnlyInOrder(startsWith("f"), endsWith("ar")))</pre>
     */
    public static <T> Matcher<Collection<T>> containsOnlyInOrder(Matcher<? super T>...matchers) {
        return CollectionContainsOnlyInOrder.containsOnlyInOrder(Arrays.asList(matchers));
    }

    /***
     * Creates a matcher that matches if the examined collection matches the specified items in order
     *
     * <p/>
     * For example:
     * <pre>assertThat(Arrays.asList("foo", "bar"), containsOnlyInOrder("foo", "bar"))</pre>
     */
    public static <T> Matcher<Collection<T>> containsOnlyInOrder(T...items) {
        return CollectionContainsOnlyInOrder.containsOnlyInOrder(convertToMatchers(Arrays.asList(items)));
    }

    /***
     * Creates a matcher that matches if the examined collection matches the specified items in any order
     *
     * <p/>
     * For example:
     * <pre>assertThat(Arrays.asList("bar", "foo"), containsOnly(startsWith("f"), endsWith("ar")))</pre>
     */
    public static <T> Matcher<Collection<T>> containsOnly(Matcher<? super T>...matchers) {
        return CollectionContainsOnly.containsOnly(Arrays.asList(matchers));
    }

    /***
     * Creates a matcher that matches if the examined collection matches the specified items in any order
     *
     * <p/>
     * For example:
     * <pre>assertThat(Arrays.asList("bar", "foo"), containsOnly("foo", "bar"))</pre>
     */
    public static <T> Matcher<Collection<T>> containsOnly(T...items) {
        return CollectionContainsOnly.containsOnly(convertToMatchers(Arrays.asList(items)));
    }

    private static <T> List<Matcher<? super T>> convertToMatchers(List<T> items) {
        List<Matcher<? super T>> matchers = new ArrayList<Matcher<? super T>>();
        for(T item : items) {
            matchers.add(CoreMatchers.equalTo(item));
        }
        return matchers;
    }

}
