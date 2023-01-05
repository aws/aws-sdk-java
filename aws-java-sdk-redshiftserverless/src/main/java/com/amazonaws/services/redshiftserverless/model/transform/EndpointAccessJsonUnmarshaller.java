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
package com.amazonaws.services.redshiftserverless.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.redshiftserverless.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EndpointAccess JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointAccessJsonUnmarshaller implements Unmarshaller<EndpointAccess, JsonUnmarshallerContext> {

    public EndpointAccess unmarshall(JsonUnmarshallerContext context) throws Exception {
        EndpointAccess endpointAccess = new EndpointAccess();

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
                if (context.testExpression("address", targetDepth)) {
                    context.nextToken();
                    endpointAccess.setAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("endpointArn", targetDepth)) {
                    context.nextToken();
                    endpointAccess.setEndpointArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("endpointCreateTime", targetDepth)) {
                    context.nextToken();
                    endpointAccess.setEndpointCreateTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("endpointName", targetDepth)) {
                    context.nextToken();
                    endpointAccess.setEndpointName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("endpointStatus", targetDepth)) {
                    context.nextToken();
                    endpointAccess.setEndpointStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("port", targetDepth)) {
                    context.nextToken();
                    endpointAccess.setPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("subnetIds", targetDepth)) {
                    context.nextToken();
                    endpointAccess.setSubnetIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("vpcEndpoint", targetDepth)) {
                    context.nextToken();
                    endpointAccess.setVpcEndpoint(VpcEndpointJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("vpcSecurityGroups", targetDepth)) {
                    context.nextToken();
                    endpointAccess.setVpcSecurityGroups(new ListUnmarshaller<VpcSecurityGroupMembership>(VpcSecurityGroupMembershipJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("workgroupName", targetDepth)) {
                    context.nextToken();
                    endpointAccess.setWorkgroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return endpointAccess;
    }

    private static EndpointAccessJsonUnmarshaller instance;

    public static EndpointAccessJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EndpointAccessJsonUnmarshaller();
        return instance;
    }
}
