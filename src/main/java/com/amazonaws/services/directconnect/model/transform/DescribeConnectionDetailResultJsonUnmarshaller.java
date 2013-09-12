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

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;


/**
 * Describe Connection Detail Result JSON Unmarshaller
 */
public class DescribeConnectionDetailResultJsonUnmarshaller implements Unmarshaller<DescribeConnectionDetailResult, JsonUnmarshallerContext> {

    

    public DescribeConnectionDetailResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeConnectionDetailResult describeConnectionDetailResult = new DescribeConnectionDetailResult();

        
        
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("connectionId", targetDepth)) {
                    context.nextToken();
                    describeConnectionDetailResult.setConnectionId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("connectionName", targetDepth)) {
                    context.nextToken();
                    describeConnectionDetailResult.setConnectionName(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("connectionState", targetDepth)) {
                    context.nextToken();
                    describeConnectionDetailResult.setConnectionState(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("region", targetDepth)) {
                    context.nextToken();
                    describeConnectionDetailResult.setRegion(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("location", targetDepth)) {
                    context.nextToken();
                    describeConnectionDetailResult.setLocation(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("bandwidth", targetDepth)) {
                    context.nextToken();
                    describeConnectionDetailResult.setBandwidth(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("connectionCosts", targetDepth)) {
                    describeConnectionDetailResult.setConnectionCosts(new ListUnmarshaller<ConnectionCost>(ConnectionCostJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("orderSteps", targetDepth)) {
                    describeConnectionDetailResult.setOrderSteps(new ListUnmarshaller<ConnectionOrderStep>(ConnectionOrderStepJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }
            

            token = context.nextToken();
        }
        
        return describeConnectionDetailResult;
    }

    private static DescribeConnectionDetailResultJsonUnmarshaller instance;
    public static DescribeConnectionDetailResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new DescribeConnectionDetailResultJsonUnmarshaller();
        return instance;
    }
}
    