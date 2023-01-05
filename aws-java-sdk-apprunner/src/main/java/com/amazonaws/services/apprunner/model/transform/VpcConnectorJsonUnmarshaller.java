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
package com.amazonaws.services.apprunner.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.apprunner.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * VpcConnector JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcConnectorJsonUnmarshaller implements Unmarshaller<VpcConnector, JsonUnmarshallerContext> {

    public VpcConnector unmarshall(JsonUnmarshallerContext context) throws Exception {
        VpcConnector vpcConnector = new VpcConnector();

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
                if (context.testExpression("VpcConnectorName", targetDepth)) {
                    context.nextToken();
                    vpcConnector.setVpcConnectorName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcConnectorArn", targetDepth)) {
                    context.nextToken();
                    vpcConnector.setVpcConnectorArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcConnectorRevision", targetDepth)) {
                    context.nextToken();
                    vpcConnector.setVpcConnectorRevision(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Subnets", targetDepth)) {
                    context.nextToken();
                    vpcConnector.setSubnets(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("SecurityGroups", targetDepth)) {
                    context.nextToken();
                    vpcConnector.setSecurityGroups(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    vpcConnector.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    vpcConnector.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DeletedAt", targetDepth)) {
                    context.nextToken();
                    vpcConnector.setDeletedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return vpcConnector;
    }

    private static VpcConnectorJsonUnmarshaller instance;

    public static VpcConnectorJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VpcConnectorJsonUnmarshaller();
        return instance;
    }
}
