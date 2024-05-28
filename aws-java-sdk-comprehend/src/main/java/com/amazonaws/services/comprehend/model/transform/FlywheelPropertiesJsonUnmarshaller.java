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
package com.amazonaws.services.comprehend.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * FlywheelProperties JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FlywheelPropertiesJsonUnmarshaller implements Unmarshaller<FlywheelProperties, JsonUnmarshallerContext> {

    public FlywheelProperties unmarshall(JsonUnmarshallerContext context) throws Exception {
        FlywheelProperties flywheelProperties = new FlywheelProperties();

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
                if (context.testExpression("FlywheelArn", targetDepth)) {
                    context.nextToken();
                    flywheelProperties.setFlywheelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ActiveModelArn", targetDepth)) {
                    context.nextToken();
                    flywheelProperties.setActiveModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataAccessRoleArn", targetDepth)) {
                    context.nextToken();
                    flywheelProperties.setDataAccessRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TaskConfig", targetDepth)) {
                    context.nextToken();
                    flywheelProperties.setTaskConfig(TaskConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DataLakeS3Uri", targetDepth)) {
                    context.nextToken();
                    flywheelProperties.setDataLakeS3Uri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataSecurityConfig", targetDepth)) {
                    context.nextToken();
                    flywheelProperties.setDataSecurityConfig(DataSecurityConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    flywheelProperties.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelType", targetDepth)) {
                    context.nextToken();
                    flywheelProperties.setModelType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Message", targetDepth)) {
                    context.nextToken();
                    flywheelProperties.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    flywheelProperties.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    flywheelProperties.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LatestFlywheelIteration", targetDepth)) {
                    context.nextToken();
                    flywheelProperties.setLatestFlywheelIteration(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return flywheelProperties;
    }

    private static FlywheelPropertiesJsonUnmarshaller instance;

    public static FlywheelPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FlywheelPropertiesJsonUnmarshaller();
        return instance;
    }
}
