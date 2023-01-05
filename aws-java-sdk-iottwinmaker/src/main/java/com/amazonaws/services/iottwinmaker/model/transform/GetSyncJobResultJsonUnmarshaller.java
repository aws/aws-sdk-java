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
package com.amazonaws.services.iottwinmaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iottwinmaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetSyncJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSyncJobResultJsonUnmarshaller implements Unmarshaller<GetSyncJobResult, JsonUnmarshallerContext> {

    public GetSyncJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetSyncJobResult getSyncJobResult = new GetSyncJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getSyncJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    getSyncJobResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("workspaceId", targetDepth)) {
                    context.nextToken();
                    getSyncJobResult.setWorkspaceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("syncSource", targetDepth)) {
                    context.nextToken();
                    getSyncJobResult.setSyncSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("syncRole", targetDepth)) {
                    context.nextToken();
                    getSyncJobResult.setSyncRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getSyncJobResult.setStatus(SyncJobStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    context.nextToken();
                    getSyncJobResult.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updateDateTime", targetDepth)) {
                    context.nextToken();
                    getSyncJobResult.setUpdateDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getSyncJobResult;
    }

    private static GetSyncJobResultJsonUnmarshaller instance;

    public static GetSyncJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetSyncJobResultJsonUnmarshaller();
        return instance;
    }
}
