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
package com.amazonaws.services.kafka.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kafka.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateVpcConnectionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVpcConnectionResultJsonUnmarshaller implements Unmarshaller<CreateVpcConnectionResult, JsonUnmarshallerContext> {

    public CreateVpcConnectionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateVpcConnectionResult createVpcConnectionResult = new CreateVpcConnectionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createVpcConnectionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("vpcConnectionArn", targetDepth)) {
                    context.nextToken();
                    createVpcConnectionResult.setVpcConnectionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    context.nextToken();
                    createVpcConnectionResult.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("authentication", targetDepth)) {
                    context.nextToken();
                    createVpcConnectionResult.setAuthentication(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vpcId", targetDepth)) {
                    context.nextToken();
                    createVpcConnectionResult.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clientSubnets", targetDepth)) {
                    context.nextToken();
                    createVpcConnectionResult.setClientSubnets(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("securityGroups", targetDepth)) {
                    context.nextToken();
                    createVpcConnectionResult.setSecurityGroups(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    createVpcConnectionResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    createVpcConnectionResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createVpcConnectionResult;
    }

    private static CreateVpcConnectionResultJsonUnmarshaller instance;

    public static CreateVpcConnectionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateVpcConnectionResultJsonUnmarshaller();
        return instance;
    }
}
