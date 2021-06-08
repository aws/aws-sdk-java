/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.accessanalyzer.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.accessanalyzer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AccessPreviewFinding JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessPreviewFindingJsonUnmarshaller implements Unmarshaller<AccessPreviewFinding, JsonUnmarshallerContext> {

    public AccessPreviewFinding unmarshall(JsonUnmarshallerContext context) throws Exception {
        AccessPreviewFinding accessPreviewFinding = new AccessPreviewFinding();

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
                if (context.testExpression("action", targetDepth)) {
                    context.nextToken();
                    accessPreviewFinding.setAction(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("changeType", targetDepth)) {
                    context.nextToken();
                    accessPreviewFinding.setChangeType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("condition", targetDepth)) {
                    context.nextToken();
                    accessPreviewFinding.setCondition(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    accessPreviewFinding.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("error", targetDepth)) {
                    context.nextToken();
                    accessPreviewFinding.setError(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("existingFindingId", targetDepth)) {
                    context.nextToken();
                    accessPreviewFinding.setExistingFindingId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("existingFindingStatus", targetDepth)) {
                    context.nextToken();
                    accessPreviewFinding.setExistingFindingStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    accessPreviewFinding.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("isPublic", targetDepth)) {
                    context.nextToken();
                    accessPreviewFinding.setIsPublic(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("principal", targetDepth)) {
                    context.nextToken();
                    accessPreviewFinding.setPrincipal(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("resource", targetDepth)) {
                    context.nextToken();
                    accessPreviewFinding.setResource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceOwnerAccount", targetDepth)) {
                    context.nextToken();
                    accessPreviewFinding.setResourceOwnerAccount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceType", targetDepth)) {
                    context.nextToken();
                    accessPreviewFinding.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sources", targetDepth)) {
                    context.nextToken();
                    accessPreviewFinding.setSources(new ListUnmarshaller<FindingSource>(FindingSourceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    accessPreviewFinding.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return accessPreviewFinding;
    }

    private static AccessPreviewFindingJsonUnmarshaller instance;

    public static AccessPreviewFindingJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AccessPreviewFindingJsonUnmarshaller();
        return instance;
    }
}
