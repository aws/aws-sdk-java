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
package com.amazonaws.services.servermigration.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.servermigration.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Connector JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectorJsonUnmarshaller implements Unmarshaller<Connector, JsonUnmarshallerContext> {

    public Connector unmarshall(JsonUnmarshallerContext context) throws Exception {
        Connector connector = new Connector();

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
                if (context.testExpression("connectorId", targetDepth)) {
                    context.nextToken();
                    connector.setConnectorId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    context.nextToken();
                    connector.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    connector.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("capabilityList", targetDepth)) {
                    context.nextToken();
                    connector.setCapabilityList(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("vmManagerName", targetDepth)) {
                    context.nextToken();
                    connector.setVmManagerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vmManagerType", targetDepth)) {
                    context.nextToken();
                    connector.setVmManagerType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vmManagerId", targetDepth)) {
                    context.nextToken();
                    connector.setVmManagerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ipAddress", targetDepth)) {
                    context.nextToken();
                    connector.setIpAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("macAddress", targetDepth)) {
                    context.nextToken();
                    connector.setMacAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("associatedOn", targetDepth)) {
                    context.nextToken();
                    connector.setAssociatedOn(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return connector;
    }

    private static ConnectorJsonUnmarshaller instance;

    public static ConnectorJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConnectorJsonUnmarshaller();
        return instance;
    }
}
