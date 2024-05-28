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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RdsConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RdsConfigurationJsonUnmarshaller implements Unmarshaller<RdsConfiguration, JsonUnmarshallerContext> {

    public RdsConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        RdsConfiguration rdsConfiguration = new RdsConfiguration();

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
                if (context.testExpression("EngineEdition", targetDepth)) {
                    context.nextToken();
                    rdsConfiguration.setEngineEdition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceType", targetDepth)) {
                    context.nextToken();
                    rdsConfiguration.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceVcpu", targetDepth)) {
                    context.nextToken();
                    rdsConfiguration.setInstanceVcpu(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("InstanceMemory", targetDepth)) {
                    context.nextToken();
                    rdsConfiguration.setInstanceMemory(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("StorageType", targetDepth)) {
                    context.nextToken();
                    rdsConfiguration.setStorageType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StorageSize", targetDepth)) {
                    context.nextToken();
                    rdsConfiguration.setStorageSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("StorageIops", targetDepth)) {
                    context.nextToken();
                    rdsConfiguration.setStorageIops(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DeploymentOption", targetDepth)) {
                    context.nextToken();
                    rdsConfiguration.setDeploymentOption(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EngineVersion", targetDepth)) {
                    context.nextToken();
                    rdsConfiguration.setEngineVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return rdsConfiguration;
    }

    private static RdsConfigurationJsonUnmarshaller instance;

    public static RdsConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RdsConfigurationJsonUnmarshaller();
        return instance;
    }
}
