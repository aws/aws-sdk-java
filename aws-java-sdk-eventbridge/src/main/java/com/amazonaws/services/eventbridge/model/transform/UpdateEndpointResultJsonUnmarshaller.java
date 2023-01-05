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
package com.amazonaws.services.eventbridge.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.eventbridge.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateEndpointResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEndpointResultJsonUnmarshaller implements Unmarshaller<UpdateEndpointResult, JsonUnmarshallerContext> {

    public UpdateEndpointResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateEndpointResult updateEndpointResult = new UpdateEndpointResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateEndpointResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    updateEndpointResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    updateEndpointResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoutingConfig", targetDepth)) {
                    context.nextToken();
                    updateEndpointResult.setRoutingConfig(RoutingConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ReplicationConfig", targetDepth)) {
                    context.nextToken();
                    updateEndpointResult.setReplicationConfig(ReplicationConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EventBuses", targetDepth)) {
                    context.nextToken();
                    updateEndpointResult.setEventBuses(new ListUnmarshaller<EndpointEventBus>(EndpointEventBusJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    updateEndpointResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointId", targetDepth)) {
                    context.nextToken();
                    updateEndpointResult.setEndpointId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointUrl", targetDepth)) {
                    context.nextToken();
                    updateEndpointResult.setEndpointUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    updateEndpointResult.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateEndpointResult;
    }

    private static UpdateEndpointResultJsonUnmarshaller instance;

    public static UpdateEndpointResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateEndpointResultJsonUnmarshaller();
        return instance;
    }
}
