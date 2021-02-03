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
package com.amazonaws.services.gluedatabrew.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.gluedatabrew.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeJobRunResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeJobRunResultJsonUnmarshaller implements Unmarshaller<DescribeJobRunResult, JsonUnmarshallerContext> {

    public DescribeJobRunResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeJobRunResult describeJobRunResult = new DescribeJobRunResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeJobRunResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Attempt", targetDepth)) {
                    context.nextToken();
                    describeJobRunResult.setAttempt(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("CompletedOn", targetDepth)) {
                    context.nextToken();
                    describeJobRunResult.setCompletedOn(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DatasetName", targetDepth)) {
                    context.nextToken();
                    describeJobRunResult.setDatasetName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ErrorMessage", targetDepth)) {
                    context.nextToken();
                    describeJobRunResult.setErrorMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExecutionTime", targetDepth)) {
                    context.nextToken();
                    describeJobRunResult.setExecutionTime(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("JobName", targetDepth)) {
                    context.nextToken();
                    describeJobRunResult.setJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RunId", targetDepth)) {
                    context.nextToken();
                    describeJobRunResult.setRunId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    describeJobRunResult.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LogSubscription", targetDepth)) {
                    context.nextToken();
                    describeJobRunResult.setLogSubscription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LogGroupName", targetDepth)) {
                    context.nextToken();
                    describeJobRunResult.setLogGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Outputs", targetDepth)) {
                    context.nextToken();
                    describeJobRunResult.setOutputs(new ListUnmarshaller<Output>(OutputJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("RecipeReference", targetDepth)) {
                    context.nextToken();
                    describeJobRunResult.setRecipeReference(RecipeReferenceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StartedBy", targetDepth)) {
                    context.nextToken();
                    describeJobRunResult.setStartedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartedOn", targetDepth)) {
                    context.nextToken();
                    describeJobRunResult.setStartedOn(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeJobRunResult;
    }

    private static DescribeJobRunResultJsonUnmarshaller instance;

    public static DescribeJobRunResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeJobRunResultJsonUnmarshaller();
        return instance;
    }
}
