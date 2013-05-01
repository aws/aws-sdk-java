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

package com.amazonaws.services.directconnect.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import org.codehaus.jackson.JsonToken;
import static org.codehaus.jackson.JsonToken.*;

/**
 * Connection Order Step JSON Unmarshaller
 */
public class ConnectionOrderStepJsonUnmarshaller implements Unmarshaller<ConnectionOrderStep, JsonUnmarshallerContext> {

    

    public ConnectionOrderStep unmarshall(JsonUnmarshallerContext context) throws Exception {
        ConnectionOrderStep connectionOrderStep = new ConnectionOrderStep();

        
        
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("number", targetDepth)) {
                    context.nextToken();
                    connectionOrderStep.setNumber(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    connectionOrderStep.setName(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    connectionOrderStep.setDescription(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("owner", targetDepth)) {
                    context.nextToken();
                    connectionOrderStep.setOwner(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sla", targetDepth)) {
                    context.nextToken();
                    connectionOrderStep.setSla(IntegerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("stepState", targetDepth)) {
                    context.nextToken();
                    connectionOrderStep.setStepState(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }
            

            token = context.nextToken();
        }
        
        return connectionOrderStep;
    }

    private static ConnectionOrderStepJsonUnmarshaller instance;
    public static ConnectionOrderStepJsonUnmarshaller getInstance() {
        if (instance == null) instance = new ConnectionOrderStepJsonUnmarshaller();
        return instance;
    }
}
    