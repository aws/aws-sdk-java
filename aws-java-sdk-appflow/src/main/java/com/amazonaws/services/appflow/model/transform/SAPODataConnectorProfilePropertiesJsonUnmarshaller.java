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
 * SAPODataConnectorProfileProperties JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SAPODataConnectorProfilePropertiesJsonUnmarshaller implements Unmarshaller<SAPODataConnectorProfileProperties, JsonUnmarshallerContext> {

    public SAPODataConnectorProfileProperties unmarshall(JsonUnmarshallerContext context) throws Exception {
        SAPODataConnectorProfileProperties sAPODataConnectorProfileProperties = new SAPODataConnectorProfileProperties();

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
                if (context.testExpression("applicationHostUrl", targetDepth)) {
                    context.nextToken();
                    sAPODataConnectorProfileProperties.setApplicationHostUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("applicationServicePath", targetDepth)) {
                    context.nextToken();
                    sAPODataConnectorProfileProperties.setApplicationServicePath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("portNumber", targetDepth)) {
                    context.nextToken();
                    sAPODataConnectorProfileProperties.setPortNumber(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("clientNumber", targetDepth)) {
                    context.nextToken();
                    sAPODataConnectorProfileProperties.setClientNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("logonLanguage", targetDepth)) {
                    context.nextToken();
                    sAPODataConnectorProfileProperties.setLogonLanguage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("privateLinkServiceName", targetDepth)) {
                    context.nextToken();
                    sAPODataConnectorProfileProperties.setPrivateLinkServiceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("oAuthProperties", targetDepth)) {
                    context.nextToken();
                    sAPODataConnectorProfileProperties.setOAuthProperties(OAuthPropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return sAPODataConnectorProfileProperties;
    }

    private static SAPODataConnectorProfilePropertiesJsonUnmarshaller instance;

    public static SAPODataConnectorProfilePropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SAPODataConnectorProfilePropertiesJsonUnmarshaller();
        return instance;
    }
}
