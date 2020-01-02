/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DescribeAutoMLJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAutoMLJobResultJsonUnmarshaller implements Unmarshaller<DescribeAutoMLJobResult, JsonUnmarshallerContext> {

    public DescribeAutoMLJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeAutoMLJobResult describeAutoMLJobResult = new DescribeAutoMLJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeAutoMLJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("AutoMLJobName", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobResult.setAutoMLJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutoMLJobArn", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobResult.setAutoMLJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InputDataConfig", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobResult.setInputDataConfig(new ListUnmarshaller<AutoMLChannel>(AutoMLChannelJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("OutputDataConfig", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobResult.setOutputDataConfig(AutoMLOutputDataConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutoMLJobObjective", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobResult.setAutoMLJobObjective(AutoMLJobObjectiveJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ProblemType", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobResult.setProblemType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutoMLJobConfig", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobResult.setAutoMLJobConfig(AutoMLJobConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobResult.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobResult.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobResult.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BestCandidate", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobResult.setBestCandidate(AutoMLCandidateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AutoMLJobStatus", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobResult.setAutoMLJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutoMLJobSecondaryStatus", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobResult.setAutoMLJobSecondaryStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GenerateCandidateDefinitionsOnly", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobResult.setGenerateCandidateDefinitionsOnly(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("AutoMLJobArtifacts", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobResult.setAutoMLJobArtifacts(AutoMLJobArtifactsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ResolvedAttributes", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobResult.setResolvedAttributes(ResolvedAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeAutoMLJobResult;
    }

    private static DescribeAutoMLJobResultJsonUnmarshaller instance;

    public static DescribeAutoMLJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeAutoMLJobResultJsonUnmarshaller();
        return instance;
    }
}
