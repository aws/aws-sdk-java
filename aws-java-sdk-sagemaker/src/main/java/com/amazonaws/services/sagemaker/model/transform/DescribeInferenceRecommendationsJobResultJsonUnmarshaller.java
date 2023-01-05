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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeInferenceRecommendationsJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInferenceRecommendationsJobResultJsonUnmarshaller implements
        Unmarshaller<DescribeInferenceRecommendationsJobResult, JsonUnmarshallerContext> {

    public DescribeInferenceRecommendationsJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeInferenceRecommendationsJobResult describeInferenceRecommendationsJobResult = new DescribeInferenceRecommendationsJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeInferenceRecommendationsJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("JobName", targetDepth)) {
                    context.nextToken();
                    describeInferenceRecommendationsJobResult.setJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobDescription", targetDepth)) {
                    context.nextToken();
                    describeInferenceRecommendationsJobResult.setJobDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobType", targetDepth)) {
                    context.nextToken();
                    describeInferenceRecommendationsJobResult.setJobType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobArn", targetDepth)) {
                    context.nextToken();
                    describeInferenceRecommendationsJobResult.setJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    describeInferenceRecommendationsJobResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    describeInferenceRecommendationsJobResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeInferenceRecommendationsJobResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CompletionTime", targetDepth)) {
                    context.nextToken();
                    describeInferenceRecommendationsJobResult.setCompletionTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    describeInferenceRecommendationsJobResult.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    describeInferenceRecommendationsJobResult.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InputConfig", targetDepth)) {
                    context.nextToken();
                    describeInferenceRecommendationsJobResult.setInputConfig(RecommendationJobInputConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StoppingConditions", targetDepth)) {
                    context.nextToken();
                    describeInferenceRecommendationsJobResult.setStoppingConditions(RecommendationJobStoppingConditionsJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("InferenceRecommendations", targetDepth)) {
                    context.nextToken();
                    describeInferenceRecommendationsJobResult.setInferenceRecommendations(new ListUnmarshaller<InferenceRecommendation>(
                            InferenceRecommendationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("EndpointPerformances", targetDepth)) {
                    context.nextToken();
                    describeInferenceRecommendationsJobResult.setEndpointPerformances(new ListUnmarshaller<EndpointPerformance>(
                            EndpointPerformanceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeInferenceRecommendationsJobResult;
    }

    private static DescribeInferenceRecommendationsJobResultJsonUnmarshaller instance;

    public static DescribeInferenceRecommendationsJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeInferenceRecommendationsJobResultJsonUnmarshaller();
        return instance;
    }
}
