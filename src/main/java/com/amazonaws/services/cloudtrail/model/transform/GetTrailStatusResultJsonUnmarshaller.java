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

package com.amazonaws.services.cloudtrail.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.cloudtrail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;


/**
 * Get Trail Status Result JSON Unmarshaller
 */
public class GetTrailStatusResultJsonUnmarshaller implements Unmarshaller<GetTrailStatusResult, JsonUnmarshallerContext> {

    

    public GetTrailStatusResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetTrailStatusResult getTrailStatusResult = new GetTrailStatusResult();

        
        
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("IsLogging", targetDepth)) {
                    context.nextToken();
                    getTrailStatusResult.setIsLogging(BooleanJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LatestDeliveryError", targetDepth)) {
                    context.nextToken();
                    getTrailStatusResult.setLatestDeliveryError(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LatestNotificationError", targetDepth)) {
                    context.nextToken();
                    getTrailStatusResult.setLatestNotificationError(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LatestDeliveryAttemptTime", targetDepth)) {
                    context.nextToken();
                    getTrailStatusResult.setLatestDeliveryAttemptTime(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LatestDeliveryAttemptSucceeded", targetDepth)) {
                    context.nextToken();
                    getTrailStatusResult.setLatestDeliveryAttemptSucceeded(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LatestNotificationAttemptTime", targetDepth)) {
                    context.nextToken();
                    getTrailStatusResult.setLatestNotificationAttemptTime(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LatestNotificationAttemptSucceeded", targetDepth)) {
                    context.nextToken();
                    getTrailStatusResult.setLatestNotificationAttemptSucceeded(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TimeLoggingStarted", targetDepth)) {
                    context.nextToken();
                    getTrailStatusResult.setTimeLoggingStarted(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TimeLoggingStopped", targetDepth)) {
                    context.nextToken();
                    getTrailStatusResult.setTimeLoggingStopped(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }
            

            token = context.nextToken();
        }
        
        return getTrailStatusResult;
    }

    private static GetTrailStatusResultJsonUnmarshaller instance;
    public static GetTrailStatusResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new GetTrailStatusResultJsonUnmarshaller();
        return instance;
    }
}
    