/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.cognitoidp.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cognitoidp.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ContextDataType JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContextDataTypeJsonUnmarshaller implements Unmarshaller<ContextDataType, JsonUnmarshallerContext> {

    public ContextDataType unmarshall(JsonUnmarshallerContext context) throws Exception {
        ContextDataType contextDataType = new ContextDataType();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("IpAddress", targetDepth)) {
                    context.nextToken();
                    contextDataType.setIpAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServerName", targetDepth)) {
                    context.nextToken();
                    contextDataType.setServerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServerPath", targetDepth)) {
                    context.nextToken();
                    contextDataType.setServerPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HttpHeaders", targetDepth)) {
                    context.nextToken();
                    contextDataType.setHttpHeaders(new ListUnmarshaller<HttpHeader>(HttpHeaderJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("EncodedData", targetDepth)) {
                    context.nextToken();
                    contextDataType.setEncodedData(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return contextDataType;
    }

    private static ContextDataTypeJsonUnmarshaller instance;

    public static ContextDataTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ContextDataTypeJsonUnmarshaller();
        return instance;
    }
}
