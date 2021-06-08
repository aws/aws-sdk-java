/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Instance JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceJsonUnmarshaller implements Unmarshaller<Instance, JsonUnmarshallerContext> {

    public Instance unmarshall(JsonUnmarshallerContext context) throws Exception {
        Instance instance = new Instance();

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
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    instance.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    instance.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IdentityManagementType", targetDepth)) {
                    context.nextToken();
                    instance.setIdentityManagementType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceAlias", targetDepth)) {
                    context.nextToken();
                    instance.setInstanceAlias(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    context.nextToken();
                    instance.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ServiceRole", targetDepth)) {
                    context.nextToken();
                    instance.setServiceRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceStatus", targetDepth)) {
                    context.nextToken();
                    instance.setInstanceStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusReason", targetDepth)) {
                    context.nextToken();
                    instance.setStatusReason(InstanceStatusReasonJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InboundCallsEnabled", targetDepth)) {
                    context.nextToken();
                    instance.setInboundCallsEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("OutboundCallsEnabled", targetDepth)) {
                    context.nextToken();
                    instance.setOutboundCallsEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return instance;
    }

    private static InstanceJsonUnmarshaller instance;

    public static InstanceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceJsonUnmarshaller();
        return instance;
    }
}
