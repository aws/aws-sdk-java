/*
 * Copyright 2011-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.util.json.JSONException;
import com.amazonaws.util.json.JSONObject;

/**
 * Unmarshaller for JSON error responses from AWS services.
 */
public class JsonErrorUnmarshaller extends AbstractErrorUnmarshaller<JSONObject> {

    public JsonErrorUnmarshaller() {}

    protected JsonErrorUnmarshaller(Class<? extends AmazonServiceException> exceptionClass) {
        super(exceptionClass);
    }

    /**
     * Subclass should override the match(String, JSONObject) method to indicate
     * whether it represents the given error type, and unmarshall(JSONObject)
     * should never return null.
     */
    public AmazonServiceException unmarshall(JSONObject json) throws Exception {
        String message = parseMessage(json);
        String errorCode = parseErrorCode(json);

        if ((null == message || message.isEmpty()) && (null == errorCode || errorCode.isEmpty())) {
            /**
             * Trigger the catch block in AmazonHttpClient.handleErrorResponse to handle 413 and 503 errors
             */
            throw new AmazonClientException("Neither error message nor error code is found in the error response payload.");
        } else {
            AmazonServiceException ase = newException(message);
            ase.setErrorCode(errorCode);
            return ase;
        }
    }

    public String parseMessage(JSONObject json) throws Exception {
        return parseMember("message", json);
    }

    public String parseMember(String key, JSONObject json) throws JSONException {
        if (key == null || key.length() == 0) {
            return null;
        }

        String firstLetterUppercaseKey;
        String firstLetterLowercaseKey;

        firstLetterLowercaseKey = key.substring(0, 1).toLowerCase()
                + key.substring(1);

        firstLetterUppercaseKey = key.substring(0, 1).toUpperCase()
                + key.substring(1);

         String value = "";
         if (json.has(firstLetterUppercaseKey)) {
             value = json.getString(firstLetterUppercaseKey);
         } else if (json.has(firstLetterLowercaseKey)) {
             value = json.getString(firstLetterLowercaseKey);
         }

         return value;
    }

    public String parseErrorCode(JSONObject json) throws Exception {
        if (json.has("__type")) {
            String type = json.getString("__type");
            int separator = type.lastIndexOf("#");
            return type.substring(separator + 1);
        }

        return null;
    }

    /**
     * Any subclass that is specific to a error type should only return true
     * when the response matches, either by matching the error type parsed from
     * header or from the JSON content.
     * 
     * @param errorTypeFromHeader
     *            The error type parsed from the response headers, or null if
     *            such information is not available in the headers.
     * 
     * @param json
     *            The JSON content of the response. Subclass should check for
     *            the error type information from this JSONObject if
     *            errorTypeFromHeader is null.
     */
    public boolean match(String errorTypeFromHeader, JSONObject json) throws Exception {
        return true;
    }
}
