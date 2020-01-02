/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpoint.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * JourneyDateRangeKpiResponse JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JourneyDateRangeKpiResponseJsonUnmarshaller implements Unmarshaller<JourneyDateRangeKpiResponse, JsonUnmarshallerContext> {

    public JourneyDateRangeKpiResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        JourneyDateRangeKpiResponse journeyDateRangeKpiResponse = new JourneyDateRangeKpiResponse();

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
                if (context.testExpression("ApplicationId", targetDepth)) {
                    context.nextToken();
                    journeyDateRangeKpiResponse.setApplicationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    context.nextToken();
                    journeyDateRangeKpiResponse.setEndTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("JourneyId", targetDepth)) {
                    context.nextToken();
                    journeyDateRangeKpiResponse.setJourneyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KpiName", targetDepth)) {
                    context.nextToken();
                    journeyDateRangeKpiResponse.setKpiName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KpiResult", targetDepth)) {
                    context.nextToken();
                    journeyDateRangeKpiResponse.setKpiResult(BaseKpiResultJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NextToken", targetDepth)) {
                    context.nextToken();
                    journeyDateRangeKpiResponse.setNextToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    context.nextToken();
                    journeyDateRangeKpiResponse.setStartTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return journeyDateRangeKpiResponse;
    }

    private static JourneyDateRangeKpiResponseJsonUnmarshaller instance;

    public static JourneyDateRangeKpiResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JourneyDateRangeKpiResponseJsonUnmarshaller();
        return instance;
    }
}
