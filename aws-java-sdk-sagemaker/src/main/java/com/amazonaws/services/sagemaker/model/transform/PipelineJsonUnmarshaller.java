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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
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
                if (context.testExpression("PipelineArn", targetDepth)) {
                    context.nextToken();
                    pipeline.setPipelineArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PipelineName", targetDepth)) {
                    context.nextToken();
                    pipeline.setPipelineName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PipelineDisplayName", targetDepth)) {
                    context.nextToken();
                    pipeline.setPipelineDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PipelineDescription", targetDepth)) {
                    context.nextToken();
                    pipeline.setPipelineDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    pipeline.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PipelineStatus", targetDepth)) {
                    context.nextToken();
                    pipeline.setPipelineStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    pipeline.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    pipeline.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastRunTime", targetDepth)) {
                    context.nextToken();
                    pipeline.setLastRunTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreatedBy", targetDepth)) {
                    context.nextToken();
                    pipeline.setCreatedBy(UserContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastModifiedBy", targetDepth)) {
                    context.nextToken();
                    pipeline.setLastModifiedBy(UserContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    pipeline.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

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

        return pipeline;
    }

    private static PipelineJsonUnmarshaller instance;

    public static PipelineJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PipelineJsonUnmarshaller();
        return instance;
    }
}
