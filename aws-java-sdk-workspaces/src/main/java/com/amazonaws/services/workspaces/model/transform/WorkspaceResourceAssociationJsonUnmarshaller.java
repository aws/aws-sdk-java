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
package com.amazonaws.services.workspaces.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.workspaces.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * WorkspaceResourceAssociation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkspaceResourceAssociationJsonUnmarshaller implements Unmarshaller<WorkspaceResourceAssociation, JsonUnmarshallerContext> {

    public WorkspaceResourceAssociation unmarshall(JsonUnmarshallerContext context) throws Exception {
        WorkspaceResourceAssociation workspaceResourceAssociation = new WorkspaceResourceAssociation();

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
                if (context.testExpression("AssociatedResourceId", targetDepth)) {
                    context.nextToken();
                    workspaceResourceAssociation.setAssociatedResourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AssociatedResourceType", targetDepth)) {
                    context.nextToken();
                    workspaceResourceAssociation.setAssociatedResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Created", targetDepth)) {
                    context.nextToken();
                    workspaceResourceAssociation.setCreated(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedTime", targetDepth)) {
                    context.nextToken();
                    workspaceResourceAssociation.setLastUpdatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    workspaceResourceAssociation.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StateReason", targetDepth)) {
                    context.nextToken();
                    workspaceResourceAssociation.setStateReason(AssociationStateReasonJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("WorkspaceId", targetDepth)) {
                    context.nextToken();
                    workspaceResourceAssociation.setWorkspaceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return workspaceResourceAssociation;
    }

    private static WorkspaceResourceAssociationJsonUnmarshaller instance;

    public static WorkspaceResourceAssociationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WorkspaceResourceAssociationJsonUnmarshaller();
        return instance;
    }
}
