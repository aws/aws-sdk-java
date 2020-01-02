/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateTemplatePermissionsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTemplatePermissionsResultJsonUnmarshaller implements Unmarshaller<UpdateTemplatePermissionsResult, JsonUnmarshallerContext> {

    public UpdateTemplatePermissionsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateTemplatePermissionsResult updateTemplatePermissionsResult = new UpdateTemplatePermissionsResult();

        updateTemplatePermissionsResult.setStatus(context.getHttpResponse().getStatusCode());

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateTemplatePermissionsResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("TemplateId", targetDepth)) {
                    context.nextToken();
                    updateTemplatePermissionsResult.setTemplateId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TemplateArn", targetDepth)) {
                    context.nextToken();
                    updateTemplatePermissionsResult.setTemplateArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Permissions", targetDepth)) {
                    context.nextToken();
                    updateTemplatePermissionsResult.setPermissions(new ListUnmarshaller<ResourcePermission>(ResourcePermissionJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("RequestId", targetDepth)) {
                    context.nextToken();
                    updateTemplatePermissionsResult.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateTemplatePermissionsResult;
    }

    private static UpdateTemplatePermissionsResultJsonUnmarshaller instance;

    public static UpdateTemplatePermissionsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateTemplatePermissionsResultJsonUnmarshaller();
        return instance;
    }
}
