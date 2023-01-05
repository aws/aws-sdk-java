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
package com.amazonaws.services.frauddetector.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.frauddetector.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetEventPredictionMetadataResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEventPredictionMetadataResultJsonUnmarshaller implements Unmarshaller<GetEventPredictionMetadataResult, JsonUnmarshallerContext> {

    public GetEventPredictionMetadataResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetEventPredictionMetadataResult getEventPredictionMetadataResult = new GetEventPredictionMetadataResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getEventPredictionMetadataResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("eventId", targetDepth)) {
                    context.nextToken();
                    getEventPredictionMetadataResult.setEventId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eventTypeName", targetDepth)) {
                    context.nextToken();
                    getEventPredictionMetadataResult.setEventTypeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("entityId", targetDepth)) {
                    context.nextToken();
                    getEventPredictionMetadataResult.setEntityId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("entityType", targetDepth)) {
                    context.nextToken();
                    getEventPredictionMetadataResult.setEntityType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eventTimestamp", targetDepth)) {
                    context.nextToken();
                    getEventPredictionMetadataResult.setEventTimestamp(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("detectorId", targetDepth)) {
                    context.nextToken();
                    getEventPredictionMetadataResult.setDetectorId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("detectorVersionId", targetDepth)) {
                    context.nextToken();
                    getEventPredictionMetadataResult.setDetectorVersionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("detectorVersionStatus", targetDepth)) {
                    context.nextToken();
                    getEventPredictionMetadataResult.setDetectorVersionStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eventVariables", targetDepth)) {
                    context.nextToken();
                    getEventPredictionMetadataResult.setEventVariables(new ListUnmarshaller<EventVariableSummary>(EventVariableSummaryJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("rules", targetDepth)) {
                    context.nextToken();
                    getEventPredictionMetadataResult.setRules(new ListUnmarshaller<EvaluatedRule>(EvaluatedRuleJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ruleExecutionMode", targetDepth)) {
                    context.nextToken();
                    getEventPredictionMetadataResult.setRuleExecutionMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outcomes", targetDepth)) {
                    context.nextToken();
                    getEventPredictionMetadataResult.setOutcomes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("evaluatedModelVersions", targetDepth)) {
                    context.nextToken();
                    getEventPredictionMetadataResult.setEvaluatedModelVersions(new ListUnmarshaller<EvaluatedModelVersion>(
                            EvaluatedModelVersionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("evaluatedExternalModels", targetDepth)) {
                    context.nextToken();
                    getEventPredictionMetadataResult.setEvaluatedExternalModels(new ListUnmarshaller<EvaluatedExternalModel>(
                            EvaluatedExternalModelJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("predictionTimestamp", targetDepth)) {
                    context.nextToken();
                    getEventPredictionMetadataResult.setPredictionTimestamp(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getEventPredictionMetadataResult;
    }

    private static GetEventPredictionMetadataResultJsonUnmarshaller instance;

    public static GetEventPredictionMetadataResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetEventPredictionMetadataResultJsonUnmarshaller();
        return instance;
    }
}
