/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ActivityResponse JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActivityResponseJsonUnmarshaller implements Unmarshaller<ActivityResponse, JsonUnmarshallerContext> {

    public ActivityResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        ActivityResponse activityResponse = new ActivityResponse();

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
                    activityResponse.setApplicationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CampaignId", targetDepth)) {
                    context.nextToken();
                    activityResponse.setCampaignId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("End", targetDepth)) {
                    context.nextToken();
                    activityResponse.setEnd(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    activityResponse.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Result", targetDepth)) {
                    context.nextToken();
                    activityResponse.setResult(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScheduledStart", targetDepth)) {
                    context.nextToken();
                    activityResponse.setScheduledStart(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Start", targetDepth)) {
                    context.nextToken();
                    activityResponse.setStart(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    activityResponse.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SuccessfulEndpointCount", targetDepth)) {
                    context.nextToken();
                    activityResponse.setSuccessfulEndpointCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TimezonesCompletedCount", targetDepth)) {
                    context.nextToken();
                    activityResponse.setTimezonesCompletedCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TimezonesTotalCount", targetDepth)) {
                    context.nextToken();
                    activityResponse.setTimezonesTotalCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TotalEndpointCount", targetDepth)) {
                    context.nextToken();
                    activityResponse.setTotalEndpointCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TreatmentId", targetDepth)) {
                    context.nextToken();
                    activityResponse.setTreatmentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return activityResponse;
    }

    private static ActivityResponseJsonUnmarshaller instance;

    public static ActivityResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ActivityResponseJsonUnmarshaller();
        return instance;
    }
}
