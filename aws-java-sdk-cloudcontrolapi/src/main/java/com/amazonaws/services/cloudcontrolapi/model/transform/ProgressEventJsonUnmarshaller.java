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
package com.amazonaws.services.cloudcontrolapi.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cloudcontrolapi.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ProgressEvent JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProgressEventJsonUnmarshaller implements Unmarshaller<ProgressEvent, JsonUnmarshallerContext> {

    public ProgressEvent unmarshall(JsonUnmarshallerContext context) throws Exception {
        ProgressEvent progressEvent = new ProgressEvent();

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
                if (context.testExpression("TypeName", targetDepth)) {
                    context.nextToken();
                    progressEvent.setTypeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Identifier", targetDepth)) {
                    context.nextToken();
                    progressEvent.setIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RequestToken", targetDepth)) {
                    context.nextToken();
                    progressEvent.setRequestToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Operation", targetDepth)) {
                    context.nextToken();
                    progressEvent.setOperation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OperationStatus", targetDepth)) {
                    context.nextToken();
                    progressEvent.setOperationStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EventTime", targetDepth)) {
                    context.nextToken();
                    progressEvent.setEventTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ResourceModel", targetDepth)) {
                    context.nextToken();
                    progressEvent.setResourceModel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusMessage", targetDepth)) {
                    context.nextToken();
                    progressEvent.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ErrorCode", targetDepth)) {
                    context.nextToken();
                    progressEvent.setErrorCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RetryAfter", targetDepth)) {
                    context.nextToken();
                    progressEvent.setRetryAfter(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return progressEvent;
    }

    private static ProgressEventJsonUnmarshaller instance;

    public static ProgressEventJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProgressEventJsonUnmarshaller();
        return instance;
    }
}
