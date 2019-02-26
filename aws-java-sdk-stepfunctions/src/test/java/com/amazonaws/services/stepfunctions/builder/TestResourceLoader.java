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
package com.amazonaws.services.stepfunctions.builder;

import com.amazonaws.util.IOUtils;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class TestResourceLoader {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static JsonNode loadAsJson(String resourcePath) {
        try {
            return MAPPER.readTree(loadAsString(resourcePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String loadAsString(String resourcePath) {
        try {
            return IOUtils.toString(TestResourceLoader.class.getResourceAsStream("/resources/state_machines/" + resourcePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
