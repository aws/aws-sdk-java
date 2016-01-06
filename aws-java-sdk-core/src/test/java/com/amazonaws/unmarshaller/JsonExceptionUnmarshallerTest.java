/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is
 * distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either
 * express or implied. See the License for the specific language
 * governing
 * permissions and limitations under the License.
 */
package com.amazonaws.unmarshaller;

import static org.junit.Assert.*;

import org.junit.Test;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.amazonaws.util.json.JSONObject;

public class JsonExceptionUnmarshallerTest {


    String errorResponse = "{\"__type\":\"com.amazonaws.javaSDK#InternalServerError\",\"message\":\"Requested resource not found\",\"field1\":\"value1\",\"Field2\":\"value2\"}";


    @Test
    public void testJsonExceptionUnmarshallerWithAdditionalFields() throws Exception {
        JSONObject jsonErrorMessage = new JSONObject(errorResponse);
        AmazonServiceException ase = new InternalServerErrorExceptionUnmarshaller().unmarshall(jsonErrorMessage);

        assertTrue(ase instanceof InternalServerErrorException);
        assertEquals("value1", ((InternalServerErrorException)ase).getField1());
        assertEquals("value2", ((InternalServerErrorException)ase).getField2());
        assertEquals("InternalServerError", ase.getErrorCode());

        assertEquals("Requested resource not found "
                     + "(Service: null; "
                     + "Status Code: 0; "
                     + "Error Code: InternalServerError; "
                     + "Request ID: null)",
                     ase.getMessage());

    }

    public static class InternalServerErrorExceptionUnmarshaller extends JsonErrorUnmarshaller {

        public InternalServerErrorExceptionUnmarshaller() {
            super(InternalServerErrorException.class);
        }

        public AmazonServiceException unmarshall(JSONObject json) throws Exception {
            // Bail out if this isn't the right error code that this
            // marshaller understands.
            String errorCode = parseErrorCode(json);
            if (errorCode == null || !errorCode.equals("InternalServerError"))
                return null;

            InternalServerErrorException e = (InternalServerErrorException)super.unmarshall(json);


            e.setField1(parseMember("field1", json));

            e.setField2(parseMember("field2", json));

            return e;
        }
    }

    public static class InternalServerErrorException extends AmazonServiceException {
        private static final long serialVersionUID = 1L;

        private String field1;

        private String field2;

        /**
         * Constructs a new InternalServerErrorException with the specified error
         * message.
         *
         * @param message Describes the error encountered.
         */
        public InternalServerErrorException(String message) {
            super(message);
        }

        /**
         * Returns the value of the Field1 property for this object.
         *
         * @return The value of the Field1 property for this object.
         */
        public String getField1() {
            return field1;
        }

        /**
         * Sets the value of the Field1 property for this object.
         *
         * @param field1 The new value for this object's Field1 property.
         */
        public void setField1(String field1) {
            this.field1 = field1;
        }
        /**
         * Returns the value of the Field2 property for this object.
         *
         * @return The value of the Field2 property for this object.
         */
        public String getField2() {
            return field2;
        }

        /**
         * Sets the value of the Field2 property for this object.
         *
         * @param field2 The new value for this object's Field2 property.
         */
        public void setField2(String field2) {
            this.field2 = field2;
        }
    }

}
