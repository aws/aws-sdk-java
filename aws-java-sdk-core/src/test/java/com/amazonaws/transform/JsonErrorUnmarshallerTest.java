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
package com.amazonaws.transform;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.amazonaws.AmazonServiceException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonErrorUnmarshallerTest {

    private static final String ERROR_TYPE = "CustomException";

    private static final JsonNode JSON = new ObjectMapper().createObjectNode().put("message", "Some error message")
            .put("__type", "apiVersion#" + ERROR_TYPE).put("CustomField", "This is a customField").put("CustomInt", 42);

    private static final JsonNode INVALID_CASE_JSON = new ObjectMapper().createObjectNode()
            .put("message", "Some error message").put("__type", "apiVersion#" + ERROR_TYPE)
            .put("customField", "This is a customField").put("customInt", 42);

    private JsonErrorUnmarshaller unmarshaller;

    @Before
    public void setup() {
        unmarshaller = new JsonErrorUnmarshaller(CustomException.class, ERROR_TYPE);
    }

    @Test
    public void unmarshall_ValidJsonContent_UnmarshallsCorrectly() throws Exception {
        CustomException ase = (CustomException) unmarshaller.unmarshall(JSON);
        assertEquals("Some error message", ase.getErrorMessage());
        assertEquals("This is a customField", ase.getCustomField());
        assertEquals(Integer.valueOf(42), ase.getCustomInt());
    }

    @Test
    public void unmarshall_InvalidCaseJsonContent_DoesNotUnmarshallCustomFields() throws Exception {
        CustomException ase = (CustomException) unmarshaller.unmarshall(INVALID_CASE_JSON);
        assertEquals("Some error message", ase.getErrorMessage());
        assertNull(ase.getCustomField());
        assertNull(ase.getCustomInt());
    }

    @Test
    public void match_DefaultUnmarshaller_MatchesEverything() {
        unmarshaller = JsonErrorUnmarshaller.DEFAULT_UNMARSHALLER;
        assertTrue(unmarshaller.matchErrorCode(null));
        assertTrue(unmarshaller.matchErrorCode(""));
        assertTrue(unmarshaller.matchErrorCode("someErrorCode"));
    }

    @Test
    public void match_MatchingErrorCode_ReturnsTrue() throws Exception {
        assertTrue(unmarshaller.matchErrorCode(ERROR_TYPE));
    }

    @Test
    public void match_NonMatchingErrorCode_ReturnsFalse() throws Exception {
        assertFalse(unmarshaller.matchErrorCode("NonMatchingErrorCode"));
    }

    @Test
    public void match_NullErrorCode_ReturnsFalse() throws Exception {
        assertFalse(unmarshaller.matchErrorCode(null));
    }

    private static class CustomException extends AmazonServiceException {

        private static final long serialVersionUID = 4140670458615826397L;

        private String customField;
        private Integer customInt;

        public CustomException(String errorMessage) {
            super(errorMessage);
        }

        public String getCustomField() {
            return customField;
        }

        public void setCustomField(String customField) {
            this.customField = customField;
        }

        public Integer getCustomInt() {
            return customInt;
        }

        public void setCustomInt(Integer customInt) {
            this.customInt = customInt;
        }

    }
}
