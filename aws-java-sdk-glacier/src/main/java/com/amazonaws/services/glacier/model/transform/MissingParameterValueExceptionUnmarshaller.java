/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glacier.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.transform.GlacierErrorUnmarshaller;
import com.amazonaws.util.json.JSONObject;

import com.amazonaws.services.glacier.model.MissingParameterValueException;

public class MissingParameterValueExceptionUnmarshaller extends GlacierErrorUnmarshaller {

    public MissingParameterValueExceptionUnmarshaller() {
        super(MissingParameterValueException.class);
    }

    @Override
    public boolean match(String errorTypeFromHeader, JSONObject json) throws Exception {
        if (errorTypeFromHeader == null) {
            // Parse error type from the JSON content if it's not available in the response headers
            String errorCodeFromContent = parseErrorCode(json);
            return (errorCodeFromContent != null && errorCodeFromContent.equals("MissingParameterValueException"));
        } else {
            return errorTypeFromHeader.equals("MissingParameterValueException");
        }
    }

    @Override
    public AmazonServiceException unmarshall(JSONObject json) throws Exception {
        MissingParameterValueException e = (MissingParameterValueException)super.unmarshall(json);
        e.setErrorCode("MissingParameterValueException");

        e.setType(parseMember("Type", json));
        
        e.setCode(parseMember("Code", json));
        
        return e;
    }
}
    