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
package com.amazonaws.internal.config;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.amazonaws.util.json.Jackson;

public class SignerConfigTest {

    @Test
    public void test() throws Exception {
        p(Jackson.toJsonPrettyString(new SignerConfig("AWS3SignerType")));
        String json = Jackson.toJsonPrettyString(new SignerConfig("AWS3SignerType"));
        SignerConfig copy = Jackson.getObjectMapper().readValue(json, SignerConfigJsonHelper.class).build();
        String json2 = Jackson.toJsonPrettyString(copy);
        assertEquals(json, json2);
    }

    private static void p(Object o) {
        System.out.println(String.valueOf(o));
    }
}
