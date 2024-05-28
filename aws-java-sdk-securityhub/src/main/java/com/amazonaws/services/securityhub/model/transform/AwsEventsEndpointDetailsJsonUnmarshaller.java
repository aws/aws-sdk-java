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
 * AwsEventsEndpointDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEventsEndpointDetailsJsonUnmarshaller implements Unmarshaller<AwsEventsEndpointDetails, JsonUnmarshallerContext> {

    public AwsEventsEndpointDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsEventsEndpointDetails awsEventsEndpointDetails = new AwsEventsEndpointDetails();

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
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    awsEventsEndpointDetails.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    awsEventsEndpointDetails.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointId", targetDepth)) {
                    context.nextToken();
                    awsEventsEndpointDetails.setEndpointId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointUrl", targetDepth)) {
                    context.nextToken();
                    awsEventsEndpointDetails.setEndpointUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EventBuses", targetDepth)) {
                    context.nextToken();
                    awsEventsEndpointDetails.setEventBuses(new ListUnmarshaller<AwsEventsEndpointEventBusesDetails>(
                            AwsEventsEndpointEventBusesDetailsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    awsEventsEndpointDetails.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationConfig", targetDepth)) {
                    context.nextToken();
                    awsEventsEndpointDetails.setReplicationConfig(AwsEventsEndpointReplicationConfigDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    awsEventsEndpointDetails.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoutingConfig", targetDepth)) {
                    context.nextToken();
                    awsEventsEndpointDetails.setRoutingConfig(AwsEventsEndpointRoutingConfigDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    awsEventsEndpointDetails.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StateReason", targetDepth)) {
                    context.nextToken();
                    awsEventsEndpointDetails.setStateReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsEventsEndpointDetails;
    }

    private static AwsEventsEndpointDetailsJsonUnmarshaller instance;

    public static AwsEventsEndpointDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEventsEndpointDetailsJsonUnmarshaller();
        return instance;
    }
}
