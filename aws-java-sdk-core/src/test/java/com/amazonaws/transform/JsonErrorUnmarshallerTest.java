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

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.amazonaws.AmazonServiceException;

public class JsonErrorUnmarshallerTest {

    private static final String ERROR_TYPE = "CustomException";

    private CustomExceptionUnmarshaller unmarshaller;

    @Before
    public void setup() {
        unmarshaller = new CustomExceptionUnmarshaller();
    }

    @Test
    public void match_DefaultUnmarshaller_MatchesEverything() {
        JsonErrorUnmarshaller<?> anyErrorUnmarshaller = new JsonErrorUnmarshaller<AmazonServiceException>(null) {
            @Override
            public AmazonServiceException unmarshall(JsonUnmarshallerContext in) throws Exception {
                return null;
            }
        };
        assertTrue(anyErrorUnmarshaller.matchErrorCode(null));
        assertTrue(anyErrorUnmarshaller.matchErrorCode(""));
        assertTrue(anyErrorUnmarshaller.matchErrorCode("someErrorCode"));
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

    private static class CustomExceptionUnmarshaller extends JsonErrorUnmarshaller<CustomException> {

        public CustomExceptionUnmarshaller() {
            super(ERROR_TYPE);
        }

        @Override
        public CustomException unmarshall(JsonUnmarshallerContext in) throws Exception {
            return null;
        }
    }

    private static class CustomException extends AmazonServiceException {

        private static final long serialVersionUID = 4140670458615826397L;

        public CustomException(String errorMessage) {
            super(errorMessage);
        }

    }
}
