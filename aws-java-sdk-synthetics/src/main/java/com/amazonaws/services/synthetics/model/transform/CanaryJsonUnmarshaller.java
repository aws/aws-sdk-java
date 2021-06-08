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
package com.amazonaws.services.synthetics.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.synthetics.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Canary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CanaryJsonUnmarshaller implements Unmarshaller<Canary, JsonUnmarshallerContext> {

    public Canary unmarshall(JsonUnmarshallerContext context) throws Exception {
        Canary canary = new Canary();

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
                    canary.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    canary.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Code", targetDepth)) {
                    context.nextToken();
                    canary.setCode(CanaryCodeOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ExecutionRoleArn", targetDepth)) {
                    context.nextToken();
                    canary.setExecutionRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Schedule", targetDepth)) {
                    context.nextToken();
                    canary.setSchedule(CanaryScheduleOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RunConfig", targetDepth)) {
                    context.nextToken();
                    canary.setRunConfig(CanaryRunConfigOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SuccessRetentionPeriodInDays", targetDepth)) {
                    context.nextToken();
                    canary.setSuccessRetentionPeriodInDays(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("FailureRetentionPeriodInDays", targetDepth)) {
                    context.nextToken();
                    canary.setFailureRetentionPeriodInDays(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    canary.setStatus(CanaryStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Timeline", targetDepth)) {
                    context.nextToken();
                    canary.setTimeline(CanaryTimelineJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ArtifactS3Location", targetDepth)) {
                    context.nextToken();
                    canary.setArtifactS3Location(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EngineArn", targetDepth)) {
                    context.nextToken();
                    canary.setEngineArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RuntimeVersion", targetDepth)) {
                    context.nextToken();
                    canary.setRuntimeVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcConfig", targetDepth)) {
                    context.nextToken();
                    canary.setVpcConfig(VpcConfigOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    canary.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
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

        return canary;
    }

    private static CanaryJsonUnmarshaller instance;

    public static CanaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CanaryJsonUnmarshaller();
        return instance;
    }
}
