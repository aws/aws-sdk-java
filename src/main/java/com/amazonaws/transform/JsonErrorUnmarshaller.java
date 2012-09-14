/*
 * Copyright 2011-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonServiceException;
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
        
        AmazonServiceException ase = newException(message);

        String errorCode = parseErrorCode(json);
        ase.setErrorCode(errorCode);
        return ase;
    }
    
    public String parseMessage(JSONObject json) throws Exception {
        String message = "";
        if (json.has("message")) {
            message = json.getString("message");
        }
        return message;
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
