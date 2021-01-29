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
 * HoursOfOperationTimeSlice JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HoursOfOperationTimeSliceJsonUnmarshaller implements Unmarshaller<HoursOfOperationTimeSlice, JsonUnmarshallerContext> {

    public HoursOfOperationTimeSlice unmarshall(JsonUnmarshallerContext context) throws Exception {
        HoursOfOperationTimeSlice hoursOfOperationTimeSlice = new HoursOfOperationTimeSlice();

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
                if (context.testExpression("Hours", targetDepth)) {
                    context.nextToken();
                    hoursOfOperationTimeSlice.setHours(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Minutes", targetDepth)) {
                    context.nextToken();
                    hoursOfOperationTimeSlice.setMinutes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return hoursOfOperationTimeSlice;
    }

    private static HoursOfOperationTimeSliceJsonUnmarshaller instance;

    public static HoursOfOperationTimeSliceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HoursOfOperationTimeSliceJsonUnmarshaller();
        return instance;
    }
}
