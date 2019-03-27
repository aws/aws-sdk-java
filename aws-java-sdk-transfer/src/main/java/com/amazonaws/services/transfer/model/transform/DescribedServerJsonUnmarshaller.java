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
package com.amazonaws.services.transfer.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.transfer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribedServer JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribedServerJsonUnmarshaller implements Unmarshaller<DescribedServer, JsonUnmarshallerContext> {

    public DescribedServer unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribedServer describedServer = new DescribedServer();

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
                    describedServer.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointDetails", targetDepth)) {
                    context.nextToken();
                    describedServer.setEndpointDetails(EndpointDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EndpointType", targetDepth)) {
                    context.nextToken();
                    describedServer.setEndpointType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IdentityProviderDetails", targetDepth)) {
                    context.nextToken();
                    describedServer.setIdentityProviderDetails(IdentityProviderDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("IdentityProviderType", targetDepth)) {
                    context.nextToken();
                    describedServer.setIdentityProviderType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LoggingRole", targetDepth)) {
                    context.nextToken();
                    describedServer.setLoggingRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServerId", targetDepth)) {
                    context.nextToken();
                    describedServer.setServerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    describedServer.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    describedServer.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("UserCount", targetDepth)) {
                    context.nextToken();
                    describedServer.setUserCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describedServer;
    }

    private static DescribedServerJsonUnmarshaller instance;

    public static DescribedServerJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribedServerJsonUnmarshaller();
        return instance;
    }
}
