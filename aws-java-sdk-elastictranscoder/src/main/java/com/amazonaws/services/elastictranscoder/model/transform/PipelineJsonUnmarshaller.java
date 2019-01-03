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
package com.amazonaws.services.elastictranscoder.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.elastictranscoder.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Pipeline JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipelineJsonUnmarshaller implements Unmarshaller<Pipeline, JsonUnmarshallerContext> {

    public Pipeline unmarshall(JsonUnmarshallerContext context) throws Exception {
        Pipeline pipeline = new Pipeline();

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
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    pipeline.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    pipeline.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    pipeline.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    pipeline.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InputBucket", targetDepth)) {
                    context.nextToken();
                    pipeline.setInputBucket(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OutputBucket", targetDepth)) {
                    context.nextToken();
                    pipeline.setOutputBucket(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Role", targetDepth)) {
                    context.nextToken();
                    pipeline.setRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AwsKmsKeyArn", targetDepth)) {
                    context.nextToken();
                    pipeline.setAwsKmsKeyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Notifications", targetDepth)) {
                    context.nextToken();
                    pipeline.setNotifications(NotificationsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ContentConfig", targetDepth)) {
                    context.nextToken();
                    pipeline.setContentConfig(PipelineOutputConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ThumbnailConfig", targetDepth)) {
                    context.nextToken();
                    pipeline.setThumbnailConfig(PipelineOutputConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return pipeline;
    }

    private static PipelineJsonUnmarshaller instance;

    public static PipelineJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PipelineJsonUnmarshaller();
        return instance;
    }
}
