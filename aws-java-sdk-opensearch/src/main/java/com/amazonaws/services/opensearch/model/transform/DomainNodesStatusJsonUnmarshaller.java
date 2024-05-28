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
package com.amazonaws.services.opensearch.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.opensearch.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DomainNodesStatus JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainNodesStatusJsonUnmarshaller implements Unmarshaller<DomainNodesStatus, JsonUnmarshallerContext> {

    public DomainNodesStatus unmarshall(JsonUnmarshallerContext context) throws Exception {
        DomainNodesStatus domainNodesStatus = new DomainNodesStatus();

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
                if (context.testExpression("NodeId", targetDepth)) {
                    context.nextToken();
                    domainNodesStatus.setNodeId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NodeType", targetDepth)) {
                    context.nextToken();
                    domainNodesStatus.setNodeType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AvailabilityZone", targetDepth)) {
                    context.nextToken();
                    domainNodesStatus.setAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceType", targetDepth)) {
                    context.nextToken();
                    domainNodesStatus.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NodeStatus", targetDepth)) {
                    context.nextToken();
                    domainNodesStatus.setNodeStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StorageType", targetDepth)) {
                    context.nextToken();
                    domainNodesStatus.setStorageType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StorageVolumeType", targetDepth)) {
                    context.nextToken();
                    domainNodesStatus.setStorageVolumeType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StorageSize", targetDepth)) {
                    context.nextToken();
                    domainNodesStatus.setStorageSize(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return domainNodesStatus;
    }

    private static DomainNodesStatusJsonUnmarshaller instance;

    public static DomainNodesStatusJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DomainNodesStatusJsonUnmarshaller();
        return instance;
    }
}
