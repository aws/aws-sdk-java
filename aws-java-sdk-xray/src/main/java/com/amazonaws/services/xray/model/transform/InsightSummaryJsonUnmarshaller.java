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
package com.amazonaws.services.xray.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.xray.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InsightSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InsightSummaryJsonUnmarshaller implements Unmarshaller<InsightSummary, JsonUnmarshallerContext> {

    public InsightSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        InsightSummary insightSummary = new InsightSummary();

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
                if (context.testExpression("InsightId", targetDepth)) {
                    context.nextToken();
                    insightSummary.setInsightId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GroupARN", targetDepth)) {
                    context.nextToken();
                    insightSummary.setGroupARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GroupName", targetDepth)) {
                    context.nextToken();
                    insightSummary.setGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RootCauseServiceId", targetDepth)) {
                    context.nextToken();
                    insightSummary.setRootCauseServiceId(ServiceIdJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Categories", targetDepth)) {
                    context.nextToken();
                    insightSummary.setCategories(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    insightSummary.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    context.nextToken();
                    insightSummary.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    context.nextToken();
                    insightSummary.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Summary", targetDepth)) {
                    context.nextToken();
                    insightSummary.setSummary(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClientRequestImpactStatistics", targetDepth)) {
                    context.nextToken();
                    insightSummary.setClientRequestImpactStatistics(RequestImpactStatisticsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RootCauseServiceRequestImpactStatistics", targetDepth)) {
                    context.nextToken();
                    insightSummary.setRootCauseServiceRequestImpactStatistics(RequestImpactStatisticsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TopAnomalousServices", targetDepth)) {
                    context.nextToken();
                    insightSummary.setTopAnomalousServices(new ListUnmarshaller<AnomalousService>(AnomalousServiceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("LastUpdateTime", targetDepth)) {
                    context.nextToken();
                    insightSummary.setLastUpdateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return insightSummary;
    }

    private static InsightSummaryJsonUnmarshaller instance;

    public static InsightSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InsightSummaryJsonUnmarshaller();
        return instance;
    }
}
