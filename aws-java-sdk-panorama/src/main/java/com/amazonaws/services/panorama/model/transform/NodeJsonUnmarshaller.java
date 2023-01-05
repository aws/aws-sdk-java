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
package com.amazonaws.services.panorama.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.panorama.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Node JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodeJsonUnmarshaller implements Unmarshaller<Node, JsonUnmarshallerContext> {

    public Node unmarshall(JsonUnmarshallerContext context) throws Exception {
        Node node = new Node();

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
                if (context.testExpression("Category", targetDepth)) {
                    context.nextToken();
                    node.setCategory(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    context.nextToken();
                    node.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    node.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    node.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NodeId", targetDepth)) {
                    context.nextToken();
                    node.setNodeId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OwnerAccount", targetDepth)) {
                    context.nextToken();
                    node.setOwnerAccount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PackageArn", targetDepth)) {
                    context.nextToken();
                    node.setPackageArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PackageId", targetDepth)) {
                    context.nextToken();
                    node.setPackageId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PackageName", targetDepth)) {
                    context.nextToken();
                    node.setPackageName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PackageVersion", targetDepth)) {
                    context.nextToken();
                    node.setPackageVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PatchVersion", targetDepth)) {
                    context.nextToken();
                    node.setPatchVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return node;
    }

    private static NodeJsonUnmarshaller instance;

    public static NodeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NodeJsonUnmarshaller();
        return instance;
    }
}
