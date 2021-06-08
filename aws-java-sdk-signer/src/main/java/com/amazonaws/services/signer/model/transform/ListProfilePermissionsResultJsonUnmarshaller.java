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
package com.amazonaws.services.signer.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.signer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ListProfilePermissionsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProfilePermissionsResultJsonUnmarshaller implements Unmarshaller<ListProfilePermissionsResult, JsonUnmarshallerContext> {

    public ListProfilePermissionsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListProfilePermissionsResult listProfilePermissionsResult = new ListProfilePermissionsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return listProfilePermissionsResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("revisionId", targetDepth)) {
                    context.nextToken();
                    listProfilePermissionsResult.setRevisionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("policySizeBytes", targetDepth)) {
                    context.nextToken();
                    listProfilePermissionsResult.setPolicySizeBytes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("permissions", targetDepth)) {
                    context.nextToken();
                    listProfilePermissionsResult.setPermissions(new ListUnmarshaller<Permission>(PermissionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("nextToken", targetDepth)) {
                    context.nextToken();
                    listProfilePermissionsResult.setNextToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return listProfilePermissionsResult;
    }

    private static ListProfilePermissionsResultJsonUnmarshaller instance;

    public static ListProfilePermissionsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListProfilePermissionsResultJsonUnmarshaller();
        return instance;
    }
}
