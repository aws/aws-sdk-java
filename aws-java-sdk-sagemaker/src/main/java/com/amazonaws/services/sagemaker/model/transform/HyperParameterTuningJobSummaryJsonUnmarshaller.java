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
 * HyperParameterTuningJobSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HyperParameterTuningJobSummaryJsonUnmarshaller implements Unmarshaller<HyperParameterTuningJobSummary, JsonUnmarshallerContext> {

    public HyperParameterTuningJobSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        HyperParameterTuningJobSummary hyperParameterTuningJobSummary = new HyperParameterTuningJobSummary();

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
                if (context.testExpression("HyperParameterTuningJobName", targetDepth)) {
                    context.nextToken();
                    hyperParameterTuningJobSummary.setHyperParameterTuningJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HyperParameterTuningJobArn", targetDepth)) {
                    context.nextToken();
                    hyperParameterTuningJobSummary.setHyperParameterTuningJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HyperParameterTuningJobStatus", targetDepth)) {
                    context.nextToken();
                    hyperParameterTuningJobSummary.setHyperParameterTuningJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Strategy", targetDepth)) {
                    context.nextToken();
                    hyperParameterTuningJobSummary.setStrategy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    hyperParameterTuningJobSummary.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("HyperParameterTuningEndTime", targetDepth)) {
                    context.nextToken();
                    hyperParameterTuningJobSummary.setHyperParameterTuningEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    hyperParameterTuningJobSummary.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TrainingJobStatusCounters", targetDepth)) {
                    context.nextToken();
                    hyperParameterTuningJobSummary.setTrainingJobStatusCounters(TrainingJobStatusCountersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ObjectiveStatusCounters", targetDepth)) {
                    context.nextToken();
                    hyperParameterTuningJobSummary.setObjectiveStatusCounters(ObjectiveStatusCountersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ResourceLimits", targetDepth)) {
                    context.nextToken();
                    hyperParameterTuningJobSummary.setResourceLimits(ResourceLimitsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return hyperParameterTuningJobSummary;
    }

    private static HyperParameterTuningJobSummaryJsonUnmarshaller instance;

    public static HyperParameterTuningJobSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HyperParameterTuningJobSummaryJsonUnmarshaller();
        return instance;
    }
}
