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
package com.amazonaws.services.robomaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.robomaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeWorldGenerationJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeWorldGenerationJobResultJsonUnmarshaller implements Unmarshaller<DescribeWorldGenerationJobResult, JsonUnmarshallerContext> {

    public DescribeWorldGenerationJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeWorldGenerationJobResult describeWorldGenerationJobResult = new DescribeWorldGenerationJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeWorldGenerationJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    describeWorldGenerationJobResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    describeWorldGenerationJobResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    describeWorldGenerationJobResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("failureCode", targetDepth)) {
                    context.nextToken();
                    describeWorldGenerationJobResult.setFailureCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureReason", targetDepth)) {
                    context.nextToken();
                    describeWorldGenerationJobResult.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clientRequestToken", targetDepth)) {
                    context.nextToken();
                    describeWorldGenerationJobResult.setClientRequestToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("template", targetDepth)) {
                    context.nextToken();
                    describeWorldGenerationJobResult.setTemplate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("worldCount", targetDepth)) {
                    context.nextToken();
                    describeWorldGenerationJobResult.setWorldCount(WorldCountJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("finishedWorldsSummary", targetDepth)) {
                    context.nextToken();
                    describeWorldGenerationJobResult.setFinishedWorldsSummary(FinishedWorldsSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    describeWorldGenerationJobResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("worldTags", targetDepth)) {
                    context.nextToken();
                    describeWorldGenerationJobResult.setWorldTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeWorldGenerationJobResult;
    }

    private static DescribeWorldGenerationJobResultJsonUnmarshaller instance;

    public static DescribeWorldGenerationJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeWorldGenerationJobResultJsonUnmarshaller();
        return instance;
    }
}
