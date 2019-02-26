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
package com.amazonaws.transform;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonGreedyPathMarshallersTest {

    private final PathMarshallers.PathMarshaller marshaller = PathMarshallers.NON_GREEDY;

    @Test(expected = IllegalArgumentException.class)
    public void nullPathValue_ThrowsException() {
        marshaller.marshall("/foo/{pathParam}", "pathParam", (String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void emptyPathValue_ThrowsException() {
        marshaller.marshall("/foo/{pathParam}", "pathParam", "");
    }

    @Test
    public void nonEmptyPathValue_ReplacesPlaceholder() {
        assertEquals("/foo/nonEmpty", marshaller.marshall("/foo/{pathParam}", "pathParam", "nonEmpty"));
    }

    @Test
    public void pathValueWithSlashes_UrlEncodedWhenReplaced() {
        assertEquals("/foo/has%2Fslash", marshaller.marshall("/foo/{pathParam}", "pathParam", "has/slash"));
    }

    @Test
    public void integerPathValue_ReplacesPlaceholder() {
        assertEquals("/foo/1234", marshaller.marshall("/foo/{pathParam}", "pathParam", 1234));
    }

    @Test
    public void longPathValue_ReplacesPlaceholder() {
        assertEquals("/foo/9001", marshaller.marshall("/foo/{pathParam}", "pathParam", 9001L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullIntegerPathValue_ThrowsException() {
        marshaller.marshall("/foo/{pathParam}", "pathParam", (Integer) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullLongPathValue_ThrowsException() {
        marshaller.marshall("/foo/{pathParam}", "pathParam", (Long) null);
    }
}
