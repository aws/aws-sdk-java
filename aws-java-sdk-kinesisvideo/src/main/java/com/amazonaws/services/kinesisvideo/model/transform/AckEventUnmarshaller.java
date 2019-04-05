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

package com.amazonaws.services.kinesisvideo.model.transform;

import com.amazonaws.services.kinesisvideo.model.AckEvent;
import com.amazonaws.services.kinesisvideo.model.AckEventType;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * Unmarshaller for the {@link AckEvent} class. Uses a DOM based marshaller rather than a streaming since all
 * JSON contents will already be in memory by the time it's sent to the unmarshaller.
 */
public class AckEventUnmarshaller {

    // JSON field names
    private static final String ACK_EVENT_TYPE = "EventType";
    private static final String FRAGMENT_TIMECODE = "FragmentTimecode";
    private static final String FRAGMENT_NUMBER = "FragmentNumber";
    private static final String ERROR_CODE = "ErrorCode";
    private static final String ERROR_ID = "ErrorId";

    /**
     * Unmarshalls the given JSON into an {@link AckEvent} object.
     *
     * @param json JSON document.
     * @return {@link AckEvent} object.
     */
    public AckEvent unmarshall(JsonNode json) {
        return new AckEvent()
            .withFragmentNumber(getTextField(json, FRAGMENT_NUMBER))
            .withFragmentTimecode(getLongField(json, FRAGMENT_TIMECODE))
            .withAckEventType(AckEventType.of(getTextField(json, ACK_EVENT_TYPE)))
            .withErrorCode(getTextField(json, ERROR_CODE))
            .withErrorId(getIntegerField(json, ERROR_ID));
    }

    /**
     * Get a String field from the JSON.
     *
     * @param json      JSON document.
     * @param fieldName Field name to get.
     * @return String value of field or null if not present.
     */
    private String getTextField(JsonNode json, String fieldName) {
        if (!json.has(fieldName)) {
            return null;
        }
        return json.get(fieldName).asText();
    }

    /**
     * Get a Long field from the JSON.
     *
     * @param json JSON document.
     * @param fieldName Field name to get.
     * @return Long value of field or null if not present.
     */
    private Long getLongField(JsonNode json, String fieldName) {
        if (!json.has(fieldName)) {
            return null;
        }
        return json.get(fieldName).longValue();
    }

    /**
     * Get an Integer field from the JSON.
     *
     * @param json JSON document.
     * @param fieldName Field name to get.
     * @return Integer value of field or null if not present.
     */
    private Integer getIntegerField(JsonNode json, String fieldName) {
        if (!json.has(fieldName)) {
            return null;
        }
        return json.get(fieldName).intValue();
    }
}
