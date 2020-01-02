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
 * DescribeTrialComponentResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTrialComponentResultJsonUnmarshaller implements Unmarshaller<DescribeTrialComponentResult, JsonUnmarshallerContext> {

    public DescribeTrialComponentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeTrialComponentResult describeTrialComponentResult = new DescribeTrialComponentResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeTrialComponentResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("TrialComponentName", targetDepth)) {
                    context.nextToken();
                    describeTrialComponentResult.setTrialComponentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TrialComponentArn", targetDepth)) {
                    context.nextToken();
                    describeTrialComponentResult.setTrialComponentArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DisplayName", targetDepth)) {
                    context.nextToken();
                    describeTrialComponentResult.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Source", targetDepth)) {
                    context.nextToken();
                    describeTrialComponentResult.setSource(TrialComponentSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    describeTrialComponentResult.setStatus(TrialComponentStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    context.nextToken();
                    describeTrialComponentResult.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    context.nextToken();
                    describeTrialComponentResult.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeTrialComponentResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreatedBy", targetDepth)) {
                    context.nextToken();
                    describeTrialComponentResult.setCreatedBy(UserContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    describeTrialComponentResult.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedBy", targetDepth)) {
                    context.nextToken();
                    describeTrialComponentResult.setLastModifiedBy(UserContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Parameters", targetDepth)) {
                    context.nextToken();
                    describeTrialComponentResult.setParameters(new MapUnmarshaller<String, TrialComponentParameterValue>(context.getUnmarshaller(String.class),
                            TrialComponentParameterValueJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("InputArtifacts", targetDepth)) {
                    context.nextToken();
                    describeTrialComponentResult.setInputArtifacts(new MapUnmarshaller<String, TrialComponentArtifact>(context.getUnmarshaller(String.class),
                            TrialComponentArtifactJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("OutputArtifacts", targetDepth)) {
                    context.nextToken();
                    describeTrialComponentResult.setOutputArtifacts(new MapUnmarshaller<String, TrialComponentArtifact>(context.getUnmarshaller(String.class),
                            TrialComponentArtifactJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Metrics", targetDepth)) {
                    context.nextToken();
                    describeTrialComponentResult.setMetrics(new ListUnmarshaller<TrialComponentMetricSummary>(TrialComponentMetricSummaryJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeTrialComponentResult;
    }

    private static DescribeTrialComponentResultJsonUnmarshaller instance;

    public static DescribeTrialComponentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeTrialComponentResultJsonUnmarshaller();
        return instance;
    }
}
