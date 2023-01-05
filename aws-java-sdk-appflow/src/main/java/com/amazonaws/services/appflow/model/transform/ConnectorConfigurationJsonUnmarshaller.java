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
package com.amazonaws.services.appflow.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.appflow.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ConnectorConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectorConfigurationJsonUnmarshaller implements Unmarshaller<ConnectorConfiguration, JsonUnmarshallerContext> {

    public ConnectorConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        ConnectorConfiguration connectorConfiguration = new ConnectorConfiguration();

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
                if (context.testExpression("canUseAsSource", targetDepth)) {
                    context.nextToken();
                    connectorConfiguration.setCanUseAsSource(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("canUseAsDestination", targetDepth)) {
                    context.nextToken();
                    connectorConfiguration.setCanUseAsDestination(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("supportedDestinationConnectors", targetDepth)) {
                    context.nextToken();
                    connectorConfiguration.setSupportedDestinationConnectors(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("supportedSchedulingFrequencies", targetDepth)) {
                    context.nextToken();
                    connectorConfiguration.setSupportedSchedulingFrequencies(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("isPrivateLinkEnabled", targetDepth)) {
                    context.nextToken();
                    connectorConfiguration.setIsPrivateLinkEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("isPrivateLinkEndpointUrlRequired", targetDepth)) {
                    context.nextToken();
                    connectorConfiguration.setIsPrivateLinkEndpointUrlRequired(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("supportedTriggerTypes", targetDepth)) {
                    context.nextToken();
                    connectorConfiguration.setSupportedTriggerTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("connectorMetadata", targetDepth)) {
                    context.nextToken();
                    connectorConfiguration.setConnectorMetadata(ConnectorMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("connectorType", targetDepth)) {
                    context.nextToken();
                    connectorConfiguration.setConnectorType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectorLabel", targetDepth)) {
                    context.nextToken();
                    connectorConfiguration.setConnectorLabel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectorDescription", targetDepth)) {
                    context.nextToken();
                    connectorConfiguration.setConnectorDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectorOwner", targetDepth)) {
                    context.nextToken();
                    connectorConfiguration.setConnectorOwner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectorName", targetDepth)) {
                    context.nextToken();
                    connectorConfiguration.setConnectorName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectorVersion", targetDepth)) {
                    context.nextToken();
                    connectorConfiguration.setConnectorVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectorArn", targetDepth)) {
                    context.nextToken();
                    connectorConfiguration.setConnectorArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectorModes", targetDepth)) {
                    context.nextToken();
                    connectorConfiguration.setConnectorModes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("authenticationConfig", targetDepth)) {
                    context.nextToken();
                    connectorConfiguration.setAuthenticationConfig(AuthenticationConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("connectorRuntimeSettings", targetDepth)) {
                    context.nextToken();
                    connectorConfiguration.setConnectorRuntimeSettings(new ListUnmarshaller<ConnectorRuntimeSetting>(ConnectorRuntimeSettingJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("supportedApiVersions", targetDepth)) {
                    context.nextToken();
                    connectorConfiguration.setSupportedApiVersions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("supportedOperators", targetDepth)) {
                    context.nextToken();
                    connectorConfiguration.setSupportedOperators(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("supportedWriteOperations", targetDepth)) {
                    context.nextToken();
                    connectorConfiguration.setSupportedWriteOperations(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("connectorProvisioningType", targetDepth)) {
                    context.nextToken();
                    connectorConfiguration.setConnectorProvisioningType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectorProvisioningConfig", targetDepth)) {
                    context.nextToken();
                    connectorConfiguration.setConnectorProvisioningConfig(ConnectorProvisioningConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("logoURL", targetDepth)) {
                    context.nextToken();
                    connectorConfiguration.setLogoURL(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("registeredAt", targetDepth)) {
                    context.nextToken();
                    connectorConfiguration.setRegisteredAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("registeredBy", targetDepth)) {
                    context.nextToken();
                    connectorConfiguration.setRegisteredBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return connectorConfiguration;
    }

    private static ConnectorConfigurationJsonUnmarshaller instance;

    public static ConnectorConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConnectorConfigurationJsonUnmarshaller();
        return instance;
    }
}
