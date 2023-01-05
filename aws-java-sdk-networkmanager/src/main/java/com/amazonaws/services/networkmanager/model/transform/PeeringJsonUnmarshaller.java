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
package com.amazonaws.services.networkmanager.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.networkmanager.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Peering JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PeeringJsonUnmarshaller implements Unmarshaller<Peering, JsonUnmarshallerContext> {

    public Peering unmarshall(JsonUnmarshallerContext context) throws Exception {
        Peering peering = new Peering();

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
                if (context.testExpression("CoreNetworkId", targetDepth)) {
                    context.nextToken();
                    peering.setCoreNetworkId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CoreNetworkArn", targetDepth)) {
                    context.nextToken();
                    peering.setCoreNetworkArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PeeringId", targetDepth)) {
                    context.nextToken();
                    peering.setPeeringId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OwnerAccountId", targetDepth)) {
                    context.nextToken();
                    peering.setOwnerAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PeeringType", targetDepth)) {
                    context.nextToken();
                    peering.setPeeringType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    peering.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EdgeLocation", targetDepth)) {
                    context.nextToken();
                    peering.setEdgeLocation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceArn", targetDepth)) {
                    context.nextToken();
                    peering.setResourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    peering.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    peering.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return peering;
    }

    private static PeeringJsonUnmarshaller instance;

    public static PeeringJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PeeringJsonUnmarshaller();
        return instance;
    }
}
