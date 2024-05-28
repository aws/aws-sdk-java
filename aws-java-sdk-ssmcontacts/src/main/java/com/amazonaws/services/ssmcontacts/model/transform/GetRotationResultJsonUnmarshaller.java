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
package com.amazonaws.services.ssmcontacts.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ssmcontacts.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetRotationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRotationResultJsonUnmarshaller implements Unmarshaller<GetRotationResult, JsonUnmarshallerContext> {

    public GetRotationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetRotationResult getRotationResult = new GetRotationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getRotationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("RotationArn", targetDepth)) {
                    context.nextToken();
                    getRotationResult.setRotationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    getRotationResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ContactIds", targetDepth)) {
                    context.nextToken();
                    getRotationResult.setContactIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    context.nextToken();
                    getRotationResult.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TimeZoneId", targetDepth)) {
                    context.nextToken();
                    getRotationResult.setTimeZoneId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Recurrence", targetDepth)) {
                    context.nextToken();
                    getRotationResult.setRecurrence(RecurrenceSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getRotationResult;
    }

    private static GetRotationResultJsonUnmarshaller instance;

    public static GetRotationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetRotationResultJsonUnmarshaller();
        return instance;
    }
}
