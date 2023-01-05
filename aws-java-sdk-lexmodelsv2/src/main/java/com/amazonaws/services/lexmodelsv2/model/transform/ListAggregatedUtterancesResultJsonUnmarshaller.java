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
package com.amazonaws.services.lexmodelsv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lexmodelsv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ListAggregatedUtterancesResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAggregatedUtterancesResultJsonUnmarshaller implements Unmarshaller<ListAggregatedUtterancesResult, JsonUnmarshallerContext> {

    public ListAggregatedUtterancesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListAggregatedUtterancesResult listAggregatedUtterancesResult = new ListAggregatedUtterancesResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return listAggregatedUtterancesResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("botId", targetDepth)) {
                    context.nextToken();
                    listAggregatedUtterancesResult.setBotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botAliasId", targetDepth)) {
                    context.nextToken();
                    listAggregatedUtterancesResult.setBotAliasId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botVersion", targetDepth)) {
                    context.nextToken();
                    listAggregatedUtterancesResult.setBotVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("localeId", targetDepth)) {
                    context.nextToken();
                    listAggregatedUtterancesResult.setLocaleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("aggregationDuration", targetDepth)) {
                    context.nextToken();
                    listAggregatedUtterancesResult.setAggregationDuration(UtteranceAggregationDurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("aggregationWindowStartTime", targetDepth)) {
                    context.nextToken();
                    listAggregatedUtterancesResult.setAggregationWindowStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("aggregationWindowEndTime", targetDepth)) {
                    context.nextToken();
                    listAggregatedUtterancesResult.setAggregationWindowEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("aggregationLastRefreshedDateTime", targetDepth)) {
                    context.nextToken();
                    listAggregatedUtterancesResult.setAggregationLastRefreshedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(
                            context));
                }
                if (context.testExpression("aggregatedUtterancesSummaries", targetDepth)) {
                    context.nextToken();
                    listAggregatedUtterancesResult.setAggregatedUtterancesSummaries(new ListUnmarshaller<AggregatedUtterancesSummary>(
                            AggregatedUtterancesSummaryJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("nextToken", targetDepth)) {
                    context.nextToken();
                    listAggregatedUtterancesResult.setNextToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return listAggregatedUtterancesResult;
    }

    private static ListAggregatedUtterancesResultJsonUnmarshaller instance;

    public static ListAggregatedUtterancesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListAggregatedUtterancesResultJsonUnmarshaller();
        return instance;
    }
}
