/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.opsworks.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;


/**
 * Source JSON Unmarshaller
 */
public class SourceJsonUnmarshaller implements Unmarshaller<Source, JsonUnmarshallerContext> {

    

    public Source unmarshall(JsonUnmarshallerContext context) throws Exception {
        Source source = new Source();

        
        
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    source.setType(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Url", targetDepth)) {
                    context.nextToken();
                    source.setUrl(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Username", targetDepth)) {
                    context.nextToken();
                    source.setUsername(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Password", targetDepth)) {
                    context.nextToken();
                    source.setPassword(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SshKey", targetDepth)) {
                    context.nextToken();
                    source.setSshKey(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Revision", targetDepth)) {
                    context.nextToken();
                    source.setRevision(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }
            

            token = context.nextToken();
        }
        
        return source;
    }

    private static SourceJsonUnmarshaller instance;
    public static SourceJsonUnmarshaller getInstance() {
        if (instance == null) instance = new SourceJsonUnmarshaller();
        return instance;
    }
}
    