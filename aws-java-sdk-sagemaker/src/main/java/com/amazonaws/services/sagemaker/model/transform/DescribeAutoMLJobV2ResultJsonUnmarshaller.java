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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeAutoMLJobV2Result JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAutoMLJobV2ResultJsonUnmarshaller implements Unmarshaller<DescribeAutoMLJobV2Result, JsonUnmarshallerContext> {

    public DescribeAutoMLJobV2Result unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeAutoMLJobV2Result describeAutoMLJobV2Result = new DescribeAutoMLJobV2Result();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeAutoMLJobV2Result;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("AutoMLJobName", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobV2Result.setAutoMLJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutoMLJobArn", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobV2Result.setAutoMLJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutoMLJobInputDataConfig", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobV2Result
                            .setAutoMLJobInputDataConfig(new ListUnmarshaller<AutoMLJobChannel>(AutoMLJobChannelJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("OutputDataConfig", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobV2Result.setOutputDataConfig(AutoMLOutputDataConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobV2Result.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutoMLJobObjective", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobV2Result.setAutoMLJobObjective(AutoMLJobObjectiveJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AutoMLProblemTypeConfig", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobV2Result.setAutoMLProblemTypeConfig(AutoMLProblemTypeConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AutoMLProblemTypeConfigName", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobV2Result.setAutoMLProblemTypeConfigName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobV2Result.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobV2Result.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobV2Result.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobV2Result.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PartialFailureReasons", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobV2Result.setPartialFailureReasons(new ListUnmarshaller<AutoMLPartialFailureReason>(
                            AutoMLPartialFailureReasonJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("BestCandidate", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobV2Result.setBestCandidate(AutoMLCandidateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AutoMLJobStatus", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobV2Result.setAutoMLJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutoMLJobSecondaryStatus", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobV2Result.setAutoMLJobSecondaryStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutoMLJobArtifacts", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobV2Result.setAutoMLJobArtifacts(AutoMLJobArtifactsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ResolvedAttributes", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobV2Result.setResolvedAttributes(AutoMLResolvedAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ModelDeployConfig", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobV2Result.setModelDeployConfig(ModelDeployConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ModelDeployResult", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobV2Result.setModelDeployResult(ModelDeployResultJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DataSplitConfig", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobV2Result.setDataSplitConfig(AutoMLDataSplitConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SecurityConfig", targetDepth)) {
                    context.nextToken();
                    describeAutoMLJobV2Result.setSecurityConfig(AutoMLSecurityConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeAutoMLJobV2Result;
    }

    private static DescribeAutoMLJobV2ResultJsonUnmarshaller instance;

    public static DescribeAutoMLJobV2ResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeAutoMLJobV2ResultJsonUnmarshaller();
        return instance;
    }
}
