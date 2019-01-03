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
package com.amazonaws.services.mq.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mq.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeBrokerResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBrokerResultJsonUnmarshaller implements Unmarshaller<DescribeBrokerResult, JsonUnmarshallerContext> {

    public DescribeBrokerResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeBrokerResult describeBrokerResult = new DescribeBrokerResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeBrokerResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("autoMinorVersionUpgrade", targetDepth)) {
                    context.nextToken();
                    describeBrokerResult.setAutoMinorVersionUpgrade(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("brokerArn", targetDepth)) {
                    context.nextToken();
                    describeBrokerResult.setBrokerArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("brokerId", targetDepth)) {
                    context.nextToken();
                    describeBrokerResult.setBrokerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("brokerInstances", targetDepth)) {
                    context.nextToken();
                    describeBrokerResult.setBrokerInstances(new ListUnmarshaller<BrokerInstance>(BrokerInstanceJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("brokerName", targetDepth)) {
                    context.nextToken();
                    describeBrokerResult.setBrokerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("brokerState", targetDepth)) {
                    context.nextToken();
                    describeBrokerResult.setBrokerState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("configurations", targetDepth)) {
                    context.nextToken();
                    describeBrokerResult.setConfigurations(ConfigurationsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("created", targetDepth)) {
                    context.nextToken();
                    describeBrokerResult.setCreated(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("deploymentMode", targetDepth)) {
                    context.nextToken();
                    describeBrokerResult.setDeploymentMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("engineType", targetDepth)) {
                    context.nextToken();
                    describeBrokerResult.setEngineType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("engineVersion", targetDepth)) {
                    context.nextToken();
                    describeBrokerResult.setEngineVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hostInstanceType", targetDepth)) {
                    context.nextToken();
                    describeBrokerResult.setHostInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("logs", targetDepth)) {
                    context.nextToken();
                    describeBrokerResult.setLogs(LogsSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("maintenanceWindowStartTime", targetDepth)) {
                    context.nextToken();
                    describeBrokerResult.setMaintenanceWindowStartTime(WeeklyStartTimeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("pendingEngineVersion", targetDepth)) {
                    context.nextToken();
                    describeBrokerResult.setPendingEngineVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("publiclyAccessible", targetDepth)) {
                    context.nextToken();
                    describeBrokerResult.setPubliclyAccessible(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("securityGroups", targetDepth)) {
                    context.nextToken();
                    describeBrokerResult.setSecurityGroups(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("subnetIds", targetDepth)) {
                    context.nextToken();
                    describeBrokerResult.setSubnetIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    describeBrokerResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("users", targetDepth)) {
                    context.nextToken();
                    describeBrokerResult.setUsers(new ListUnmarshaller<UserSummary>(UserSummaryJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeBrokerResult;
    }

    private static DescribeBrokerResultJsonUnmarshaller instance;

    public static DescribeBrokerResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeBrokerResultJsonUnmarshaller();
        return instance;
    }
}
