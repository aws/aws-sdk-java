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
 * DescribeTransformJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTransformJobResultJsonUnmarshaller implements Unmarshaller<DescribeTransformJobResult, JsonUnmarshallerContext> {

    public DescribeTransformJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeTransformJobResult describeTransformJobResult = new DescribeTransformJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeTransformJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("TransformJobName", targetDepth)) {
                    context.nextToken();
                    describeTransformJobResult.setTransformJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TransformJobArn", targetDepth)) {
                    context.nextToken();
                    describeTransformJobResult.setTransformJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TransformJobStatus", targetDepth)) {
                    context.nextToken();
                    describeTransformJobResult.setTransformJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    describeTransformJobResult.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelName", targetDepth)) {
                    context.nextToken();
                    describeTransformJobResult.setModelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxConcurrentTransforms", targetDepth)) {
                    context.nextToken();
                    describeTransformJobResult.setMaxConcurrentTransforms(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MaxPayloadInMB", targetDepth)) {
                    context.nextToken();
                    describeTransformJobResult.setMaxPayloadInMB(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("BatchStrategy", targetDepth)) {
                    context.nextToken();
                    describeTransformJobResult.setBatchStrategy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Environment", targetDepth)) {
                    context.nextToken();
                    describeTransformJobResult.setEnvironment(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("TransformInput", targetDepth)) {
                    context.nextToken();
                    describeTransformJobResult.setTransformInput(TransformInputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TransformOutput", targetDepth)) {
                    context.nextToken();
                    describeTransformJobResult.setTransformOutput(TransformOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TransformResources", targetDepth)) {
                    context.nextToken();
                    describeTransformJobResult.setTransformResources(TransformResourcesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeTransformJobResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TransformStartTime", targetDepth)) {
                    context.nextToken();
                    describeTransformJobResult.setTransformStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TransformEndTime", targetDepth)) {
                    context.nextToken();
                    describeTransformJobResult.setTransformEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LabelingJobArn", targetDepth)) {
                    context.nextToken();
                    describeTransformJobResult.setLabelingJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeTransformJobResult;
    }

    private static DescribeTransformJobResultJsonUnmarshaller instance;

    public static DescribeTransformJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeTransformJobResultJsonUnmarshaller();
        return instance;
    }
}
