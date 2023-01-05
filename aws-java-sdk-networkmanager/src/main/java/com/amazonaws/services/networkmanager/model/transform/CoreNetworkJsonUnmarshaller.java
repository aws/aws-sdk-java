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
 * CoreNetwork JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoreNetworkJsonUnmarshaller implements Unmarshaller<CoreNetwork, JsonUnmarshallerContext> {

    public CoreNetwork unmarshall(JsonUnmarshallerContext context) throws Exception {
        CoreNetwork coreNetwork = new CoreNetwork();

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
                if (context.testExpression("GlobalNetworkId", targetDepth)) {
                    context.nextToken();
                    coreNetwork.setGlobalNetworkId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CoreNetworkId", targetDepth)) {
                    context.nextToken();
                    coreNetwork.setCoreNetworkId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CoreNetworkArn", targetDepth)) {
                    context.nextToken();
                    coreNetwork.setCoreNetworkArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    coreNetwork.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    coreNetwork.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    coreNetwork.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Segments", targetDepth)) {
                    context.nextToken();
                    coreNetwork.setSegments(new ListUnmarshaller<CoreNetworkSegment>(CoreNetworkSegmentJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Edges", targetDepth)) {
                    context.nextToken();
                    coreNetwork.setEdges(new ListUnmarshaller<CoreNetworkEdge>(CoreNetworkEdgeJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    coreNetwork.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return coreNetwork;
    }

    private static CoreNetworkJsonUnmarshaller instance;

    public static CoreNetworkJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CoreNetworkJsonUnmarshaller();
        return instance;
    }
}
