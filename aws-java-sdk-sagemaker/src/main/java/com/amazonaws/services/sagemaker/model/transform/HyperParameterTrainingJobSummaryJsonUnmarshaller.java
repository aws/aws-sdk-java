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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * HyperParameterTrainingJobSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HyperParameterTrainingJobSummaryJsonUnmarshaller implements Unmarshaller<HyperParameterTrainingJobSummary, JsonUnmarshallerContext> {

    public HyperParameterTrainingJobSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        HyperParameterTrainingJobSummary hyperParameterTrainingJobSummary = new HyperParameterTrainingJobSummary();

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
                if (context.testExpression("TrainingJobName", targetDepth)) {
                    context.nextToken();
                    hyperParameterTrainingJobSummary.setTrainingJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TrainingJobArn", targetDepth)) {
                    context.nextToken();
                    hyperParameterTrainingJobSummary.setTrainingJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TuningJobName", targetDepth)) {
                    context.nextToken();
                    hyperParameterTrainingJobSummary.setTuningJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    hyperParameterTrainingJobSummary.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TrainingStartTime", targetDepth)) {
                    context.nextToken();
                    hyperParameterTrainingJobSummary.setTrainingStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TrainingEndTime", targetDepth)) {
                    context.nextToken();
                    hyperParameterTrainingJobSummary.setTrainingEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TrainingJobStatus", targetDepth)) {
                    context.nextToken();
                    hyperParameterTrainingJobSummary.setTrainingJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TunedHyperParameters", targetDepth)) {
                    context.nextToken();
                    hyperParameterTrainingJobSummary.setTunedHyperParameters(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    hyperParameterTrainingJobSummary.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FinalHyperParameterTuningJobObjectiveMetric", targetDepth)) {
                    context.nextToken();
                    hyperParameterTrainingJobSummary.setFinalHyperParameterTuningJobObjectiveMetric(FinalHyperParameterTuningJobObjectiveMetricJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("ObjectiveStatus", targetDepth)) {
                    context.nextToken();
                    hyperParameterTrainingJobSummary.setObjectiveStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return hyperParameterTrainingJobSummary;
    }

    private static HyperParameterTrainingJobSummaryJsonUnmarshaller instance;

    public static HyperParameterTrainingJobSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HyperParameterTrainingJobSummaryJsonUnmarshaller();
        return instance;
    }
}
