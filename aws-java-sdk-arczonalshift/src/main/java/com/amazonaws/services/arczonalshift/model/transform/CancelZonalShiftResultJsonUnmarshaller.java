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
package com.amazonaws.services.arczonalshift.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.arczonalshift.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CancelZonalShiftResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelZonalShiftResultJsonUnmarshaller implements Unmarshaller<CancelZonalShiftResult, JsonUnmarshallerContext> {

    public CancelZonalShiftResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CancelZonalShiftResult cancelZonalShiftResult = new CancelZonalShiftResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return cancelZonalShiftResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("awayFrom", targetDepth)) {
                    context.nextToken();
                    cancelZonalShiftResult.setAwayFrom(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("comment", targetDepth)) {
                    context.nextToken();
                    cancelZonalShiftResult.setComment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("expiryTime", targetDepth)) {
                    context.nextToken();
                    cancelZonalShiftResult.setExpiryTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("resourceIdentifier", targetDepth)) {
                    context.nextToken();
                    cancelZonalShiftResult.setResourceIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    cancelZonalShiftResult.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    cancelZonalShiftResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("zonalShiftId", targetDepth)) {
                    context.nextToken();
                    cancelZonalShiftResult.setZonalShiftId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return cancelZonalShiftResult;
    }

    private static CancelZonalShiftResultJsonUnmarshaller instance;

    public static CancelZonalShiftResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CancelZonalShiftResultJsonUnmarshaller();
        return instance;
    }
}
