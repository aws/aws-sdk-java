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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InstanceProperty JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstancePropertyJsonUnmarshaller implements Unmarshaller<InstanceProperty, JsonUnmarshallerContext> {

    public InstanceProperty unmarshall(JsonUnmarshallerContext context) throws Exception {
        InstanceProperty instanceProperty = new InstanceProperty();

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
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    instanceProperty.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceId", targetDepth)) {
                    context.nextToken();
                    instanceProperty.setInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceType", targetDepth)) {
                    context.nextToken();
                    instanceProperty.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceRole", targetDepth)) {
                    context.nextToken();
                    instanceProperty.setInstanceRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KeyName", targetDepth)) {
                    context.nextToken();
                    instanceProperty.setKeyName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceState", targetDepth)) {
                    context.nextToken();
                    instanceProperty.setInstanceState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Architecture", targetDepth)) {
                    context.nextToken();
                    instanceProperty.setArchitecture(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IPAddress", targetDepth)) {
                    context.nextToken();
                    instanceProperty.setIPAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LaunchTime", targetDepth)) {
                    context.nextToken();
                    instanceProperty.setLaunchTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("PingStatus", targetDepth)) {
                    context.nextToken();
                    instanceProperty.setPingStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastPingDateTime", targetDepth)) {
                    context.nextToken();
                    instanceProperty.setLastPingDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("AgentVersion", targetDepth)) {
                    context.nextToken();
                    instanceProperty.setAgentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PlatformType", targetDepth)) {
                    context.nextToken();
                    instanceProperty.setPlatformType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PlatformName", targetDepth)) {
                    context.nextToken();
                    instanceProperty.setPlatformName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PlatformVersion", targetDepth)) {
                    context.nextToken();
                    instanceProperty.setPlatformVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ActivationId", targetDepth)) {
                    context.nextToken();
                    instanceProperty.setActivationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IamRole", targetDepth)) {
                    context.nextToken();
                    instanceProperty.setIamRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RegistrationDate", targetDepth)) {
                    context.nextToken();
                    instanceProperty.setRegistrationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ResourceType", targetDepth)) {
                    context.nextToken();
                    instanceProperty.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ComputerName", targetDepth)) {
                    context.nextToken();
                    instanceProperty.setComputerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AssociationStatus", targetDepth)) {
                    context.nextToken();
                    instanceProperty.setAssociationStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastAssociationExecutionDate", targetDepth)) {
                    context.nextToken();
                    instanceProperty.setLastAssociationExecutionDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastSuccessfulAssociationExecutionDate", targetDepth)) {
                    context.nextToken();
                    instanceProperty.setLastSuccessfulAssociationExecutionDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("AssociationOverview", targetDepth)) {
                    context.nextToken();
                    instanceProperty.setAssociationOverview(InstanceAggregatedAssociationOverviewJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SourceId", targetDepth)) {
                    context.nextToken();
                    instanceProperty.setSourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceType", targetDepth)) {
                    context.nextToken();
                    instanceProperty.setSourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return instanceProperty;
    }

    private static InstancePropertyJsonUnmarshaller instance;

    public static InstancePropertyJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstancePropertyJsonUnmarshaller();
        return instance;
    }
}
