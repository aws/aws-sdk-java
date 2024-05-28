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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsAmazonMqBrokerDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsAmazonMqBrokerDetailsJsonUnmarshaller implements Unmarshaller<AwsAmazonMqBrokerDetails, JsonUnmarshallerContext> {

    public AwsAmazonMqBrokerDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsAmazonMqBrokerDetails awsAmazonMqBrokerDetails = new AwsAmazonMqBrokerDetails();

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
                if (context.testExpression("AuthenticationStrategy", targetDepth)) {
                    context.nextToken();
                    awsAmazonMqBrokerDetails.setAuthenticationStrategy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutoMinorVersionUpgrade", targetDepth)) {
                    context.nextToken();
                    awsAmazonMqBrokerDetails.setAutoMinorVersionUpgrade(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("BrokerArn", targetDepth)) {
                    context.nextToken();
                    awsAmazonMqBrokerDetails.setBrokerArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BrokerName", targetDepth)) {
                    context.nextToken();
                    awsAmazonMqBrokerDetails.setBrokerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeploymentMode", targetDepth)) {
                    context.nextToken();
                    awsAmazonMqBrokerDetails.setDeploymentMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EncryptionOptions", targetDepth)) {
                    context.nextToken();
                    awsAmazonMqBrokerDetails.setEncryptionOptions(AwsAmazonMqBrokerEncryptionOptionsDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EngineType", targetDepth)) {
                    context.nextToken();
                    awsAmazonMqBrokerDetails.setEngineType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EngineVersion", targetDepth)) {
                    context.nextToken();
                    awsAmazonMqBrokerDetails.setEngineVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HostInstanceType", targetDepth)) {
                    context.nextToken();
                    awsAmazonMqBrokerDetails.setHostInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BrokerId", targetDepth)) {
                    context.nextToken();
                    awsAmazonMqBrokerDetails.setBrokerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LdapServerMetadata", targetDepth)) {
                    context.nextToken();
                    awsAmazonMqBrokerDetails
                            .setLdapServerMetadata(AwsAmazonMqBrokerLdapServerMetadataDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Logs", targetDepth)) {
                    context.nextToken();
                    awsAmazonMqBrokerDetails.setLogs(AwsAmazonMqBrokerLogsDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MaintenanceWindowStartTime", targetDepth)) {
                    context.nextToken();
                    awsAmazonMqBrokerDetails.setMaintenanceWindowStartTime(AwsAmazonMqBrokerMaintenanceWindowStartTimeDetailsJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("PubliclyAccessible", targetDepth)) {
                    context.nextToken();
                    awsAmazonMqBrokerDetails.setPubliclyAccessible(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("SecurityGroups", targetDepth)) {
                    context.nextToken();
                    awsAmazonMqBrokerDetails.setSecurityGroups(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("StorageType", targetDepth)) {
                    context.nextToken();
                    awsAmazonMqBrokerDetails.setStorageType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubnetIds", targetDepth)) {
                    context.nextToken();
                    awsAmazonMqBrokerDetails.setSubnetIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Users", targetDepth)) {
                    context.nextToken();
                    awsAmazonMqBrokerDetails.setUsers(new ListUnmarshaller<AwsAmazonMqBrokerUsersDetails>(AwsAmazonMqBrokerUsersDetailsJsonUnmarshaller
                            .getInstance())

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

        return awsAmazonMqBrokerDetails;
    }

    private static AwsAmazonMqBrokerDetailsJsonUnmarshaller instance;

    public static AwsAmazonMqBrokerDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsAmazonMqBrokerDetailsJsonUnmarshaller();
        return instance;
    }
}
