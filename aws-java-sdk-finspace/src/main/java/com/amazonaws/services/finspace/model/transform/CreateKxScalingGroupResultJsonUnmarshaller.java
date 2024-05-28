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
package com.amazonaws.services.finspace.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.finspace.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateKxScalingGroupResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateKxScalingGroupResultJsonUnmarshaller implements Unmarshaller<CreateKxScalingGroupResult, JsonUnmarshallerContext> {

    public CreateKxScalingGroupResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateKxScalingGroupResult createKxScalingGroupResult = new CreateKxScalingGroupResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createKxScalingGroupResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("environmentId", targetDepth)) {
                    context.nextToken();
                    createKxScalingGroupResult.setEnvironmentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scalingGroupName", targetDepth)) {
                    context.nextToken();
                    createKxScalingGroupResult.setScalingGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hostType", targetDepth)) {
                    context.nextToken();
                    createKxScalingGroupResult.setHostType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("availabilityZoneId", targetDepth)) {
                    context.nextToken();
                    createKxScalingGroupResult.setAvailabilityZoneId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    createKxScalingGroupResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastModifiedTimestamp", targetDepth)) {
                    context.nextToken();
                    createKxScalingGroupResult.setLastModifiedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("createdTimestamp", targetDepth)) {
                    context.nextToken();
                    createKxScalingGroupResult.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createKxScalingGroupResult;
    }

    private static CreateKxScalingGroupResultJsonUnmarshaller instance;

    public static CreateKxScalingGroupResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateKxScalingGroupResultJsonUnmarshaller();
        return instance;
    }
}
