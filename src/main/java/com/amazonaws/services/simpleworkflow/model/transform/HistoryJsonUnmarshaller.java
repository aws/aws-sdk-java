/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.simpleworkflow.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.simpleworkflow.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import org.codehaus.jackson.JsonToken;
import static org.codehaus.jackson.JsonToken.*;

/**
 * History JSON Unmarshaller
 */
public class HistoryJsonUnmarshaller implements Unmarshaller<History, JsonUnmarshallerContext> {

    

    public History unmarshall(JsonUnmarshallerContext context) throws Exception {
        History history = new History();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();

        while (true) {
            if (token == null) return history;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("events", targetDepth)) {
                    history.setEvents(new ListUnmarshaller<HistoryEvent>(HistoryEventJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("nextPageToken", targetDepth)) {
                    context.nextToken();
                    history.setNextPageToken(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getCurrentDepth() <= originalDepth) {
                    return history;
                }
            }
            token = context.nextToken();
        }
    }

    private static HistoryJsonUnmarshaller instance;
    public static HistoryJsonUnmarshaller getInstance() {
        if (instance == null) instance = new HistoryJsonUnmarshaller();
        return instance;
    }
}
    