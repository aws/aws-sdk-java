/*
 * Copyright 2011-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
}
