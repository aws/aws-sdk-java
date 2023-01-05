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
package com.amazonaws.services.managedgrafana.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.managedgrafana.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AssociateLicenseResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateLicenseResultJsonUnmarshaller implements Unmarshaller<AssociateLicenseResult, JsonUnmarshallerContext> {

    public AssociateLicenseResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        AssociateLicenseResult associateLicenseResult = new AssociateLicenseResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return associateLicenseResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("workspace", targetDepth)) {
                    context.nextToken();
                    associateLicenseResult.setWorkspace(WorkspaceDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return associateLicenseResult;
    }

    private static AssociateLicenseResultJsonUnmarshaller instance;

    public static AssociateLicenseResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssociateLicenseResultJsonUnmarshaller();
        return instance;
    }
}
