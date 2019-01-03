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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InstanceInformation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceInformationJsonUnmarshaller implements Unmarshaller<InstanceInformation, JsonUnmarshallerContext> {

    public InstanceInformation unmarshall(JsonUnmarshallerContext context) throws Exception {
        InstanceInformation instanceInformation = new InstanceInformation();

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
                if (context.testExpression("InstanceId", targetDepth)) {
                    context.nextToken();
                    instanceInformation.setInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PingStatus", targetDepth)) {
                    context.nextToken();
                    instanceInformation.setPingStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastPingDateTime", targetDepth)) {
                    context.nextToken();
                    instanceInformation.setLastPingDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("AgentVersion", targetDepth)) {
                    context.nextToken();
                    instanceInformation.setAgentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IsLatestVersion", targetDepth)) {
                    context.nextToken();
                    instanceInformation.setIsLatestVersion(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("PlatformType", targetDepth)) {
                    context.nextToken();
                    instanceInformation.setPlatformType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PlatformName", targetDepth)) {
                    context.nextToken();
                    instanceInformation.setPlatformName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PlatformVersion", targetDepth)) {
                    context.nextToken();
                    instanceInformation.setPlatformVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ActivationId", targetDepth)) {
                    context.nextToken();
                    instanceInformation.setActivationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IamRole", targetDepth)) {
                    context.nextToken();
                    instanceInformation.setIamRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RegistrationDate", targetDepth)) {
                    context.nextToken();
                    instanceInformation.setRegistrationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ResourceType", targetDepth)) {
                    context.nextToken();
                    instanceInformation.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    instanceInformation.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IPAddress", targetDepth)) {
                    context.nextToken();
                    instanceInformation.setIPAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ComputerName", targetDepth)) {
                    context.nextToken();
                    instanceInformation.setComputerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AssociationStatus", targetDepth)) {
                    context.nextToken();
                    instanceInformation.setAssociationStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastAssociationExecutionDate", targetDepth)) {
                    context.nextToken();
                    instanceInformation.setLastAssociationExecutionDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastSuccessfulAssociationExecutionDate", targetDepth)) {
                    context.nextToken();
                    instanceInformation.setLastSuccessfulAssociationExecutionDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("AssociationOverview", targetDepth)) {
                    context.nextToken();
                    instanceInformation.setAssociationOverview(InstanceAggregatedAssociationOverviewJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return instanceInformation;
    }

    private static InstanceInformationJsonUnmarshaller instance;

    public static InstanceInformationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceInformationJsonUnmarshaller();
        return instance;
    }
}
