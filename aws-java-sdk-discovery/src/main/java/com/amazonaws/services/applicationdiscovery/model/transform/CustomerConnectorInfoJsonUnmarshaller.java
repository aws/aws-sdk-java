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
package com.amazonaws.services.applicationdiscovery.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.applicationdiscovery.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CustomerConnectorInfo JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomerConnectorInfoJsonUnmarshaller implements Unmarshaller<CustomerConnectorInfo, JsonUnmarshallerContext> {

    public CustomerConnectorInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        CustomerConnectorInfo customerConnectorInfo = new CustomerConnectorInfo();

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
                if (context.testExpression("activeConnectors", targetDepth)) {
                    context.nextToken();
                    customerConnectorInfo.setActiveConnectors(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("healthyConnectors", targetDepth)) {
                    context.nextToken();
                    customerConnectorInfo.setHealthyConnectors(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("blackListedConnectors", targetDepth)) {
                    context.nextToken();
                    customerConnectorInfo.setBlackListedConnectors(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("shutdownConnectors", targetDepth)) {
                    context.nextToken();
                    customerConnectorInfo.setShutdownConnectors(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("unhealthyConnectors", targetDepth)) {
                    context.nextToken();
                    customerConnectorInfo.setUnhealthyConnectors(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("totalConnectors", targetDepth)) {
                    context.nextToken();
                    customerConnectorInfo.setTotalConnectors(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("unknownConnectors", targetDepth)) {
                    context.nextToken();
                    customerConnectorInfo.setUnknownConnectors(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return customerConnectorInfo;
    }

    private static CustomerConnectorInfoJsonUnmarshaller instance;

    public static CustomerConnectorInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CustomerConnectorInfoJsonUnmarshaller();
        return instance;
    }
}
