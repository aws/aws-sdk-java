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

package com.amazonaws.services.stepfunctions.builder.internal;

import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.SdkInternalApi;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

/**
 * Utils for Jackson serialization/deserialization.
 */
@SdkInternalApi
public final class JacksonUtils {

    /**
     * Disable Jackson specific features like annotations. Support only
     * basic POJO serialization to limit our coupling to Jackson.
     */
    private static final ObjectMapper MAPPER = new ObjectMapper()
        .disable(MapperFeature.USE_ANNOTATIONS)
        .disable(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)
        .disable(MapperFeature.AUTO_DETECT_FIELDS);

    private JacksonUtils() {
    }

    /**
     * Converts a {@link JsonNode} into a string.
     *
     * @param node Node to convert.
     * @return String of JSON document.
     */
    public static String jsonToString(JsonNode node) {
        try {
            return node == null ? null : MAPPER.writeValueAsString(node);
        } catch (JsonProcessingException e) {
            throw new SdkClientException("Could not serialize JSON", e);
        }
    }

    /**
     * Converts a String containing a JSON document into a {@link JsonNode}.
     *
     * @param paramName Param name to use in exception message.
     * @param val String JSON document.
     * @return JsonNode representing document.
     */
    public static JsonNode stringToJsonNode(String paramName, String val) {
        if (val == null) {
            return null;
        }
        try {
            return MAPPER.readTree(val);
        } catch (IOException e) {
            throw new SdkClientException(paramName + " must be a valid JSON document", e);
        }
    }

    /**
     * Converts a POJO object into a JSON node. Limits Jackson features to reduce coupling.
     *
     * @param val Value to convert to {@link JsonNode}.
     * @return JsonNode representing POJO.
     */
    public static JsonNode objectToJsonNode(Object val) {
        return MAPPER.valueToTree(val);
    }
}
