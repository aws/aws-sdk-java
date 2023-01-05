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
 * ZonalShiftSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ZonalShiftSummaryJsonUnmarshaller implements Unmarshaller<ZonalShiftSummary, JsonUnmarshallerContext> {

    public ZonalShiftSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        ZonalShiftSummary zonalShiftSummary = new ZonalShiftSummary();

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
                if (context.testExpression("awayFrom", targetDepth)) {
                    context.nextToken();
                    zonalShiftSummary.setAwayFrom(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("comment", targetDepth)) {
                    context.nextToken();
                    zonalShiftSummary.setComment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("expiryTime", targetDepth)) {
                    context.nextToken();
                    zonalShiftSummary.setExpiryTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("resourceIdentifier", targetDepth)) {
                    context.nextToken();
                    zonalShiftSummary.setResourceIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    zonalShiftSummary.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    zonalShiftSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("zonalShiftId", targetDepth)) {
                    context.nextToken();
                    zonalShiftSummary.setZonalShiftId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return zonalShiftSummary;
    }

    private static ZonalShiftSummaryJsonUnmarshaller instance;

    public static ZonalShiftSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ZonalShiftSummaryJsonUnmarshaller();
        return instance;
    }
}
