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
package com.amazonaws.services.gamelift.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.gamelift.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * FleetAttributes JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FleetAttributesJsonUnmarshaller implements Unmarshaller<FleetAttributes, JsonUnmarshallerContext> {

    public FleetAttributes unmarshall(JsonUnmarshallerContext context) throws Exception {
        FleetAttributes fleetAttributes = new FleetAttributes();

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
                if (context.testExpression("FleetId", targetDepth)) {
                    context.nextToken();
                    fleetAttributes.setFleetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FleetArn", targetDepth)) {
                    context.nextToken();
                    fleetAttributes.setFleetArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FleetType", targetDepth)) {
                    context.nextToken();
                    fleetAttributes.setFleetType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceType", targetDepth)) {
                    context.nextToken();
                    fleetAttributes.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    fleetAttributes.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    fleetAttributes.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    fleetAttributes.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TerminationTime", targetDepth)) {
                    context.nextToken();
                    fleetAttributes.setTerminationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    fleetAttributes.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BuildId", targetDepth)) {
                    context.nextToken();
                    fleetAttributes.setBuildId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScriptId", targetDepth)) {
                    context.nextToken();
                    fleetAttributes.setScriptId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServerLaunchPath", targetDepth)) {
                    context.nextToken();
                    fleetAttributes.setServerLaunchPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServerLaunchParameters", targetDepth)) {
                    context.nextToken();
                    fleetAttributes.setServerLaunchParameters(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LogPaths", targetDepth)) {
                    context.nextToken();
                    fleetAttributes.setLogPaths(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("NewGameSessionProtectionPolicy", targetDepth)) {
                    context.nextToken();
                    fleetAttributes.setNewGameSessionProtectionPolicy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OperatingSystem", targetDepth)) {
                    context.nextToken();
                    fleetAttributes.setOperatingSystem(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceCreationLimitPolicy", targetDepth)) {
                    context.nextToken();
                    fleetAttributes.setResourceCreationLimitPolicy(ResourceCreationLimitPolicyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MetricGroups", targetDepth)) {
                    context.nextToken();
                    fleetAttributes.setMetricGroups(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("StoppedActions", targetDepth)) {
                    context.nextToken();
                    fleetAttributes.setStoppedActions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("InstanceRoleArn", targetDepth)) {
                    context.nextToken();
                    fleetAttributes.setInstanceRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return fleetAttributes;
    }

    private static FleetAttributesJsonUnmarshaller instance;

    public static FleetAttributesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FleetAttributesJsonUnmarshaller();
        return instance;
    }
}
