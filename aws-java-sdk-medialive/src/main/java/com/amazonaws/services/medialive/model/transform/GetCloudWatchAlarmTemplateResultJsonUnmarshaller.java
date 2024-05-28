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
package com.amazonaws.services.medialive.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetCloudWatchAlarmTemplateResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCloudWatchAlarmTemplateResultJsonUnmarshaller implements Unmarshaller<GetCloudWatchAlarmTemplateResult, JsonUnmarshallerContext> {

    public GetCloudWatchAlarmTemplateResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetCloudWatchAlarmTemplateResult getCloudWatchAlarmTemplateResult = new GetCloudWatchAlarmTemplateResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getCloudWatchAlarmTemplateResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    getCloudWatchAlarmTemplateResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("comparisonOperator", targetDepth)) {
                    context.nextToken();
                    getCloudWatchAlarmTemplateResult.setComparisonOperator(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    getCloudWatchAlarmTemplateResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("datapointsToAlarm", targetDepth)) {
                    context.nextToken();
                    getCloudWatchAlarmTemplateResult.setDatapointsToAlarm(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    getCloudWatchAlarmTemplateResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("evaluationPeriods", targetDepth)) {
                    context.nextToken();
                    getCloudWatchAlarmTemplateResult.setEvaluationPeriods(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("groupId", targetDepth)) {
                    context.nextToken();
                    getCloudWatchAlarmTemplateResult.setGroupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    getCloudWatchAlarmTemplateResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("metricName", targetDepth)) {
                    context.nextToken();
                    getCloudWatchAlarmTemplateResult.setMetricName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("modifiedAt", targetDepth)) {
                    context.nextToken();
                    getCloudWatchAlarmTemplateResult.setModifiedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    getCloudWatchAlarmTemplateResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("period", targetDepth)) {
                    context.nextToken();
                    getCloudWatchAlarmTemplateResult.setPeriod(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("statistic", targetDepth)) {
                    context.nextToken();
                    getCloudWatchAlarmTemplateResult.setStatistic(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    getCloudWatchAlarmTemplateResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("targetResourceType", targetDepth)) {
                    context.nextToken();
                    getCloudWatchAlarmTemplateResult.setTargetResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("threshold", targetDepth)) {
                    context.nextToken();
                    getCloudWatchAlarmTemplateResult.setThreshold(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("treatMissingData", targetDepth)) {
                    context.nextToken();
                    getCloudWatchAlarmTemplateResult.setTreatMissingData(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getCloudWatchAlarmTemplateResult;
    }

    private static GetCloudWatchAlarmTemplateResultJsonUnmarshaller instance;

    public static GetCloudWatchAlarmTemplateResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetCloudWatchAlarmTemplateResultJsonUnmarshaller();
        return instance;
    }
}
