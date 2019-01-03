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
package com.amazonaws.services.directconnect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateLagResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLagResultJsonUnmarshaller implements Unmarshaller<CreateLagResult, JsonUnmarshallerContext> {

    public CreateLagResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateLagResult createLagResult = new CreateLagResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createLagResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("connectionsBandwidth", targetDepth)) {
                    context.nextToken();
                    createLagResult.setConnectionsBandwidth(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("numberOfConnections", targetDepth)) {
                    context.nextToken();
                    createLagResult.setNumberOfConnections(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("lagId", targetDepth)) {
                    context.nextToken();
                    createLagResult.setLagId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ownerAccount", targetDepth)) {
                    context.nextToken();
                    createLagResult.setOwnerAccount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lagName", targetDepth)) {
                    context.nextToken();
                    createLagResult.setLagName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lagState", targetDepth)) {
                    context.nextToken();
                    createLagResult.setLagState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("location", targetDepth)) {
                    context.nextToken();
                    createLagResult.setLocation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("region", targetDepth)) {
                    context.nextToken();
                    createLagResult.setRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("minimumLinks", targetDepth)) {
                    context.nextToken();
                    createLagResult.setMinimumLinks(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("awsDevice", targetDepth)) {
                    context.nextToken();
                    createLagResult.setAwsDevice(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("awsDeviceV2", targetDepth)) {
                    context.nextToken();
                    createLagResult.setAwsDeviceV2(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connections", targetDepth)) {
                    context.nextToken();
                    createLagResult.setConnections(new ListUnmarshaller<Connection>(ConnectionJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("allowsHostedConnections", targetDepth)) {
                    context.nextToken();
                    createLagResult.setAllowsHostedConnections(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("jumboFrameCapable", targetDepth)) {
                    context.nextToken();
                    createLagResult.setJumboFrameCapable(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("hasLogicalRedundancy", targetDepth)) {
                    context.nextToken();
                    createLagResult.setHasLogicalRedundancy(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createLagResult;
    }

    private static CreateLagResultJsonUnmarshaller instance;

    public static CreateLagResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateLagResultJsonUnmarshaller();
        return instance;
    }
}
