/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsEcsClusterDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsClusterDetailsJsonUnmarshaller implements Unmarshaller<AwsEcsClusterDetails, JsonUnmarshallerContext> {

    public AwsEcsClusterDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsEcsClusterDetails awsEcsClusterDetails = new AwsEcsClusterDetails();

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
                if (context.testExpression("ClusterArn", targetDepth)) {
                    context.nextToken();
                    awsEcsClusterDetails.setClusterArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ActiveServicesCount", targetDepth)) {
                    context.nextToken();
                    awsEcsClusterDetails.setActiveServicesCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("CapacityProviders", targetDepth)) {
                    context.nextToken();
                    awsEcsClusterDetails.setCapacityProviders(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ClusterSettings", targetDepth)) {
                    context.nextToken();
                    awsEcsClusterDetails.setClusterSettings(new ListUnmarshaller<AwsEcsClusterClusterSettingsDetails>(
                            AwsEcsClusterClusterSettingsDetailsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Configuration", targetDepth)) {
                    context.nextToken();
                    awsEcsClusterDetails.setConfiguration(AwsEcsClusterConfigurationDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DefaultCapacityProviderStrategy", targetDepth)) {
                    context.nextToken();
                    awsEcsClusterDetails.setDefaultCapacityProviderStrategy(new ListUnmarshaller<AwsEcsClusterDefaultCapacityProviderStrategyDetails>(
                            AwsEcsClusterDefaultCapacityProviderStrategyDetailsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ClusterName", targetDepth)) {
                    context.nextToken();
                    awsEcsClusterDetails.setClusterName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RegisteredContainerInstancesCount", targetDepth)) {
                    context.nextToken();
                    awsEcsClusterDetails.setRegisteredContainerInstancesCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("RunningTasksCount", targetDepth)) {
                    context.nextToken();
                    awsEcsClusterDetails.setRunningTasksCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    awsEcsClusterDetails.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsEcsClusterDetails;
    }

    private static AwsEcsClusterDetailsJsonUnmarshaller instance;

    public static AwsEcsClusterDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEcsClusterDetailsJsonUnmarshaller();
        return instance;
    }
}
