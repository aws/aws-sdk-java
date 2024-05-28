/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.internetmonitor.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.internetmonitor.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetInternetEventResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInternetEventResultJsonUnmarshaller implements Unmarshaller<GetInternetEventResult, JsonUnmarshallerContext> {

    public GetInternetEventResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetInternetEventResult getInternetEventResult = new GetInternetEventResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getInternetEventResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("EventId", targetDepth)) {
                    context.nextToken();
                    getInternetEventResult.setEventId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EventArn", targetDepth)) {
                    context.nextToken();
                    getInternetEventResult.setEventArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartedAt", targetDepth)) {
                    context.nextToken();
                    getInternetEventResult.setStartedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("EndedAt", targetDepth)) {
                    context.nextToken();
                    getInternetEventResult.setEndedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("ClientLocation", targetDepth)) {
                    context.nextToken();
                    getInternetEventResult.setClientLocation(ClientLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EventType", targetDepth)) {
                    context.nextToken();
                    getInternetEventResult.setEventType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EventStatus", targetDepth)) {
                    context.nextToken();
                    getInternetEventResult.setEventStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getInternetEventResult;
    }

    private static GetInternetEventResultJsonUnmarshaller instance;

    public static GetInternetEventResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetInternetEventResultJsonUnmarshaller();
        return instance;
    }
}
