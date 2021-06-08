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
package com.amazonaws.services.lookoutequipment.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lookoutequipment.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InferenceExecutionSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InferenceExecutionSummaryJsonUnmarshaller implements Unmarshaller<InferenceExecutionSummary, JsonUnmarshallerContext> {

    public InferenceExecutionSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        InferenceExecutionSummary inferenceExecutionSummary = new InferenceExecutionSummary();

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
                if (context.testExpression("ModelName", targetDepth)) {
                    context.nextToken();
                    inferenceExecutionSummary.setModelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelArn", targetDepth)) {
                    context.nextToken();
                    inferenceExecutionSummary.setModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InferenceSchedulerName", targetDepth)) {
                    context.nextToken();
                    inferenceExecutionSummary.setInferenceSchedulerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InferenceSchedulerArn", targetDepth)) {
                    context.nextToken();
                    inferenceExecutionSummary.setInferenceSchedulerArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScheduledStartTime", targetDepth)) {
                    context.nextToken();
                    inferenceExecutionSummary.setScheduledStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DataStartTime", targetDepth)) {
                    context.nextToken();
                    inferenceExecutionSummary.setDataStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DataEndTime", targetDepth)) {
                    context.nextToken();
                    inferenceExecutionSummary.setDataEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DataInputConfiguration", targetDepth)) {
                    context.nextToken();
                    inferenceExecutionSummary.setDataInputConfiguration(InferenceInputConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DataOutputConfiguration", targetDepth)) {
                    context.nextToken();
                    inferenceExecutionSummary.setDataOutputConfiguration(InferenceOutputConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CustomerResultObject", targetDepth)) {
                    context.nextToken();
                    inferenceExecutionSummary.setCustomerResultObject(S3ObjectJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    inferenceExecutionSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailedReason", targetDepth)) {
                    context.nextToken();
                    inferenceExecutionSummary.setFailedReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return inferenceExecutionSummary;
    }

    private static InferenceExecutionSummaryJsonUnmarshaller instance;

    public static InferenceExecutionSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InferenceExecutionSummaryJsonUnmarshaller();
        return instance;
    }
}
