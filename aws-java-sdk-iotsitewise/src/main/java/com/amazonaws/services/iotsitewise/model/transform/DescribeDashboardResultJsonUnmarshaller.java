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
package com.amazonaws.services.iotsitewise.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotsitewise.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeDashboardResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDashboardResultJsonUnmarshaller implements Unmarshaller<DescribeDashboardResult, JsonUnmarshallerContext> {

    public DescribeDashboardResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeDashboardResult describeDashboardResult = new DescribeDashboardResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeDashboardResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("dashboardId", targetDepth)) {
                    context.nextToken();
                    describeDashboardResult.setDashboardId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dashboardArn", targetDepth)) {
                    context.nextToken();
                    describeDashboardResult.setDashboardArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dashboardName", targetDepth)) {
                    context.nextToken();
                    describeDashboardResult.setDashboardName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("projectId", targetDepth)) {
                    context.nextToken();
                    describeDashboardResult.setProjectId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dashboardDescription", targetDepth)) {
                    context.nextToken();
                    describeDashboardResult.setDashboardDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dashboardDefinition", targetDepth)) {
                    context.nextToken();
                    describeDashboardResult.setDashboardDefinition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dashboardCreationDate", targetDepth)) {
                    context.nextToken();
                    describeDashboardResult.setDashboardCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("dashboardLastUpdateDate", targetDepth)) {
                    context.nextToken();
                    describeDashboardResult.setDashboardLastUpdateDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeDashboardResult;
    }

    private static DescribeDashboardResultJsonUnmarshaller instance;

    public static DescribeDashboardResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeDashboardResultJsonUnmarshaller();
        return instance;
    }
}
