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
 * UpdateCloudWatchAlarmTemplateResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCloudWatchAlarmTemplateResultJsonUnmarshaller implements Unmarshaller<UpdateCloudWatchAlarmTemplateResult, JsonUnmarshallerContext> {

    public UpdateCloudWatchAlarmTemplateResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateCloudWatchAlarmTemplateResult updateCloudWatchAlarmTemplateResult = new UpdateCloudWatchAlarmTemplateResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateCloudWatchAlarmTemplateResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    updateCloudWatchAlarmTemplateResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("comparisonOperator", targetDepth)) {
                    context.nextToken();
                    updateCloudWatchAlarmTemplateResult.setComparisonOperator(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    updateCloudWatchAlarmTemplateResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("datapointsToAlarm", targetDepth)) {
                    context.nextToken();
                    updateCloudWatchAlarmTemplateResult.setDatapointsToAlarm(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    updateCloudWatchAlarmTemplateResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("evaluationPeriods", targetDepth)) {
                    context.nextToken();
                    updateCloudWatchAlarmTemplateResult.setEvaluationPeriods(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("groupId", targetDepth)) {
                    context.nextToken();
                    updateCloudWatchAlarmTemplateResult.setGroupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    updateCloudWatchAlarmTemplateResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("metricName", targetDepth)) {
                    context.nextToken();
                    updateCloudWatchAlarmTemplateResult.setMetricName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("modifiedAt", targetDepth)) {
                    context.nextToken();
                    updateCloudWatchAlarmTemplateResult.setModifiedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    updateCloudWatchAlarmTemplateResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("period", targetDepth)) {
                    context.nextToken();
                    updateCloudWatchAlarmTemplateResult.setPeriod(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("statistic", targetDepth)) {
                    context.nextToken();
                    updateCloudWatchAlarmTemplateResult.setStatistic(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    updateCloudWatchAlarmTemplateResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("targetResourceType", targetDepth)) {
                    context.nextToken();
                    updateCloudWatchAlarmTemplateResult.setTargetResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("threshold", targetDepth)) {
                    context.nextToken();
                    updateCloudWatchAlarmTemplateResult.setThreshold(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("treatMissingData", targetDepth)) {
                    context.nextToken();
                    updateCloudWatchAlarmTemplateResult.setTreatMissingData(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateCloudWatchAlarmTemplateResult;
    }

    private static UpdateCloudWatchAlarmTemplateResultJsonUnmarshaller instance;

    public static UpdateCloudWatchAlarmTemplateResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateCloudWatchAlarmTemplateResultJsonUnmarshaller();
        return instance;
    }
}
