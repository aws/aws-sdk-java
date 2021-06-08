/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * HoursOfOperation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HoursOfOperationJsonUnmarshaller implements Unmarshaller<HoursOfOperation, JsonUnmarshallerContext> {

    public HoursOfOperation unmarshall(JsonUnmarshallerContext context) throws Exception {
        HoursOfOperation hoursOfOperation = new HoursOfOperation();

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
                if (context.testExpression("HoursOfOperationId", targetDepth)) {
                    context.nextToken();
                    hoursOfOperation.setHoursOfOperationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HoursOfOperationArn", targetDepth)) {
                    context.nextToken();
                    hoursOfOperation.setHoursOfOperationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    hoursOfOperation.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    hoursOfOperation.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TimeZone", targetDepth)) {
                    context.nextToken();
                    hoursOfOperation.setTimeZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Config", targetDepth)) {
                    context.nextToken();
                    hoursOfOperation.setConfig(new ListUnmarshaller<HoursOfOperationConfig>(HoursOfOperationConfigJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    hoursOfOperation.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return hoursOfOperation;
    }

    private static HoursOfOperationJsonUnmarshaller instance;

    public static HoursOfOperationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HoursOfOperationJsonUnmarshaller();
        return instance;
    }
}
