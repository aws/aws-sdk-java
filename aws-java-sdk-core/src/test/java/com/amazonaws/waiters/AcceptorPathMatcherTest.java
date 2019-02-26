/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.waiters;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.BooleanNode;
import com.fasterxml.jackson.databind.node.NullNode;
import org.junit.Assert;
import org.junit.Test;

public class AcceptorPathMatcherTest {
    ObjectMapper mapper = new ObjectMapper();

    @Test
    public void pathMatcher_NullFinalResult() throws Exception{
        JsonNode expectedResult = mapper.readTree("\"ACTIVE\"");
        Assert.assertFalse("Expected result not equals final result", new AcceptorPathMatcher().path(expectedResult, NullNode.getInstance()));
    }

    @Test
    public void pathMatcher_ValidFinalResult() throws Exception {
        JsonNode expectedResult = mapper.readTree("\"ACTIVE\"");
        Assert.assertTrue("Expected result not equals final result", new AcceptorPathMatcher().path(expectedResult, mapper.readTree("\"ACTIVE\"")));
    }

    @Test
    public void pathMatcher_BooleanFinalResult() throws Exception{
        JsonNode expectedResultBoolean = mapper.readTree("true");
        Assert.assertTrue("Expected result not equals final result", new AcceptorPathMatcher().path(expectedResultBoolean, BooleanNode.TRUE));
    }

    @Test
    public void pathAllMatcher_SuccessState() throws Exception{
        JsonNode expectedResult = mapper.readTree("\"running\"");
        Assert.assertTrue("Expected result not equals final result", new AcceptorPathMatcher().pathAll(expectedResult,
                                                        mapper.readTree("[\"running\", \"running\", \"running\", \"running\"]")));
    }

    @Test
    public void pathAllMatcher_FailureState() throws Exception{
        JsonNode expectedResult = mapper.readTree("\"running\"");
        Assert.assertFalse("Expected result not equals final result", new AcceptorPathMatcher().pathAll(expectedResult,
                                                        mapper.readTree("[\"running\", \"terminated\", \"running\", \"running\"]")));
    }

    @Test
    public void pathAllMatcher_FinalResultEmptyArray_ReturnsTrue() throws Exception{
        JsonNode expectedResult = mapper.readTree("\"running\"");
        Assert.assertTrue(new AcceptorPathMatcher().pathAll(expectedResult, mapper.readTree("[]")));
    }

    @Test(expected = RuntimeException.class)
    public void pathAllMatcher_FinalResultNotAnArray_ThrowsRunTimeException() throws Exception{
        JsonNode expectedResult = mapper.readTree("\"running\"");
        new AcceptorPathMatcher().pathAll(expectedResult, mapper.readTree("\"running\""));
    }

    @Test
    public void pathAnyMatcher_SuccessState() throws Exception{
        JsonNode expectedResult = mapper.readTree("\"terminated\"");
        Assert.assertTrue("Expected result not equals final result", new AcceptorPathMatcher().pathAny(expectedResult,
                                                        mapper.readTree("[\"running\", \"terminated\", \"running\", \"running\"]")));
    }

    @Test
    public void pathAnyMatcherFailureState() throws Exception {
        JsonNode expectedResult = mapper.readTree("\"terminated\"");
        Assert.assertFalse("Expected result not equals final result", new AcceptorPathMatcher().pathAny(expectedResult,
                                                        mapper.readTree("[\"running\", \"running\", \"running\", \"running\"]")));
    }

    @Test
    public void pathAnyMatcherFinalResultEmptyArray() throws Exception {
        JsonNode expectedResult = mapper.readTree("\"terminated\"");
        Assert.assertFalse("Expected result not equals final result", new AcceptorPathMatcher().pathAny(expectedResult, mapper.readTree("[]")));
    }

    @Test(expected = RuntimeException.class)
    public void pathAnyMatcherFinalResultNotAnArray() throws Exception{
        JsonNode expectedResult = mapper.readTree("\"terminated\"");
        new AcceptorPathMatcher().pathAny(expectedResult, BooleanNode.TRUE);
    }

    @Test
    public void pathAnyMatcherNullFinalResult() throws Exception{
        JsonNode expectedResult = mapper.readTree("\"terminated\"");
        Assert.assertFalse("Expected result not equals final result", new AcceptorPathMatcher().pathAny(expectedResult, NullNode.getInstance()));
    }

}
