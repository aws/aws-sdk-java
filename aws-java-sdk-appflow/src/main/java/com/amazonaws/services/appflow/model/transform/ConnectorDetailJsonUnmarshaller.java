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
 * ConnectorDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectorDetailJsonUnmarshaller implements Unmarshaller<ConnectorDetail, JsonUnmarshallerContext> {

    public ConnectorDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        ConnectorDetail connectorDetail = new ConnectorDetail();

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
                if (context.testExpression("connectorDescription", targetDepth)) {
                    context.nextToken();
                    connectorDetail.setConnectorDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectorName", targetDepth)) {
                    context.nextToken();
                    connectorDetail.setConnectorName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectorOwner", targetDepth)) {
                    context.nextToken();
                    connectorDetail.setConnectorOwner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectorVersion", targetDepth)) {
                    context.nextToken();
                    connectorDetail.setConnectorVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("applicationType", targetDepth)) {
                    context.nextToken();
                    connectorDetail.setApplicationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectorType", targetDepth)) {
                    context.nextToken();
                    connectorDetail.setConnectorType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectorLabel", targetDepth)) {
                    context.nextToken();
                    connectorDetail.setConnectorLabel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("registeredAt", targetDepth)) {
                    context.nextToken();
                    connectorDetail.setRegisteredAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("registeredBy", targetDepth)) {
                    context.nextToken();
                    connectorDetail.setRegisteredBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectorProvisioningType", targetDepth)) {
                    context.nextToken();
                    connectorDetail.setConnectorProvisioningType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectorModes", targetDepth)) {
                    context.nextToken();
                    connectorDetail.setConnectorModes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return connectorDetail;
    }

    private static ConnectorDetailJsonUnmarshaller instance;

    public static ConnectorDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConnectorDetailJsonUnmarshaller();
        return instance;
    }
}
