/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devopsguru.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.devopsguru.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * LogAnomalyClass JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogAnomalyClassJsonUnmarshaller implements Unmarshaller<LogAnomalyClass, JsonUnmarshallerContext> {

    public LogAnomalyClass unmarshall(JsonUnmarshallerContext context) throws Exception {
        LogAnomalyClass logAnomalyClass = new LogAnomalyClass();

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
                if (context.testExpression("LogStreamName", targetDepth)) {
                    context.nextToken();
                    logAnomalyClass.setLogStreamName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LogAnomalyType", targetDepth)) {
                    context.nextToken();
                    logAnomalyClass.setLogAnomalyType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LogAnomalyToken", targetDepth)) {
                    context.nextToken();
                    logAnomalyClass.setLogAnomalyToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LogEventId", targetDepth)) {
                    context.nextToken();
                    logAnomalyClass.setLogEventId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Explanation", targetDepth)) {
                    context.nextToken();
                    logAnomalyClass.setExplanation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NumberOfLogLinesOccurrences", targetDepth)) {
                    context.nextToken();
                    logAnomalyClass.setNumberOfLogLinesOccurrences(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("LogEventTimestamp", targetDepth)) {
                    context.nextToken();
                    logAnomalyClass.setLogEventTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return logAnomalyClass;
    }

    private static LogAnomalyClassJsonUnmarshaller instance;

    public static LogAnomalyClassJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LogAnomalyClassJsonUnmarshaller();
        return instance;
    }
}
