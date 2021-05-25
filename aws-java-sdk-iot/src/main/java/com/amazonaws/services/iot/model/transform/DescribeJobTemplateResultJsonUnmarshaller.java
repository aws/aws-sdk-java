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
package com.amazonaws.services.iot.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeJobTemplateResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeJobTemplateResultJsonUnmarshaller implements Unmarshaller<DescribeJobTemplateResult, JsonUnmarshallerContext> {

    public DescribeJobTemplateResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeJobTemplateResult describeJobTemplateResult = new DescribeJobTemplateResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeJobTemplateResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("jobTemplateArn", targetDepth)) {
                    context.nextToken();
                    describeJobTemplateResult.setJobTemplateArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobTemplateId", targetDepth)) {
                    context.nextToken();
                    describeJobTemplateResult.setJobTemplateId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    describeJobTemplateResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("documentSource", targetDepth)) {
                    context.nextToken();
                    describeJobTemplateResult.setDocumentSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("document", targetDepth)) {
                    context.nextToken();
                    describeJobTemplateResult.setDocument(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    describeJobTemplateResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("presignedUrlConfig", targetDepth)) {
                    context.nextToken();
                    describeJobTemplateResult.setPresignedUrlConfig(PresignedUrlConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("jobExecutionsRolloutConfig", targetDepth)) {
                    context.nextToken();
                    describeJobTemplateResult.setJobExecutionsRolloutConfig(JobExecutionsRolloutConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("abortConfig", targetDepth)) {
                    context.nextToken();
                    describeJobTemplateResult.setAbortConfig(AbortConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("timeoutConfig", targetDepth)) {
                    context.nextToken();
                    describeJobTemplateResult.setTimeoutConfig(TimeoutConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeJobTemplateResult;
    }

    private static DescribeJobTemplateResultJsonUnmarshaller instance;

    public static DescribeJobTemplateResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeJobTemplateResultJsonUnmarshaller();
        return instance;
    }
}
