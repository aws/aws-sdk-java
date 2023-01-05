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
package com.amazonaws.services.applicationdiscovery.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.applicationdiscovery.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CustomerAgentlessCollectorInfo JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomerAgentlessCollectorInfoJsonUnmarshaller implements Unmarshaller<CustomerAgentlessCollectorInfo, JsonUnmarshallerContext> {

    public CustomerAgentlessCollectorInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        CustomerAgentlessCollectorInfo customerAgentlessCollectorInfo = new CustomerAgentlessCollectorInfo();

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
                if (context.testExpression("activeAgentlessCollectors", targetDepth)) {
                    context.nextToken();
                    customerAgentlessCollectorInfo.setActiveAgentlessCollectors(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("healthyAgentlessCollectors", targetDepth)) {
                    context.nextToken();
                    customerAgentlessCollectorInfo.setHealthyAgentlessCollectors(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("denyListedAgentlessCollectors", targetDepth)) {
                    context.nextToken();
                    customerAgentlessCollectorInfo.setDenyListedAgentlessCollectors(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("shutdownAgentlessCollectors", targetDepth)) {
                    context.nextToken();
                    customerAgentlessCollectorInfo.setShutdownAgentlessCollectors(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("unhealthyAgentlessCollectors", targetDepth)) {
                    context.nextToken();
                    customerAgentlessCollectorInfo.setUnhealthyAgentlessCollectors(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("totalAgentlessCollectors", targetDepth)) {
                    context.nextToken();
                    customerAgentlessCollectorInfo.setTotalAgentlessCollectors(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("unknownAgentlessCollectors", targetDepth)) {
                    context.nextToken();
                    customerAgentlessCollectorInfo.setUnknownAgentlessCollectors(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return customerAgentlessCollectorInfo;
    }

    private static CustomerAgentlessCollectorInfoJsonUnmarshaller instance;

    public static CustomerAgentlessCollectorInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CustomerAgentlessCollectorInfoJsonUnmarshaller();
        return instance;
    }
}
