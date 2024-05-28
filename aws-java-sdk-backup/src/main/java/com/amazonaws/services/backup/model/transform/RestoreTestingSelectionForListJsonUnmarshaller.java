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
package com.amazonaws.services.backup.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.backup.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RestoreTestingSelectionForList JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreTestingSelectionForListJsonUnmarshaller implements Unmarshaller<RestoreTestingSelectionForList, JsonUnmarshallerContext> {

    public RestoreTestingSelectionForList unmarshall(JsonUnmarshallerContext context) throws Exception {
        RestoreTestingSelectionForList restoreTestingSelectionForList = new RestoreTestingSelectionForList();

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
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    restoreTestingSelectionForList.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("IamRoleArn", targetDepth)) {
                    context.nextToken();
                    restoreTestingSelectionForList.setIamRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProtectedResourceType", targetDepth)) {
                    context.nextToken();
                    restoreTestingSelectionForList.setProtectedResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RestoreTestingPlanName", targetDepth)) {
                    context.nextToken();
                    restoreTestingSelectionForList.setRestoreTestingPlanName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RestoreTestingSelectionName", targetDepth)) {
                    context.nextToken();
                    restoreTestingSelectionForList.setRestoreTestingSelectionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ValidationWindowHours", targetDepth)) {
                    context.nextToken();
                    restoreTestingSelectionForList.setValidationWindowHours(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return restoreTestingSelectionForList;
    }

    private static RestoreTestingSelectionForListJsonUnmarshaller instance;

    public static RestoreTestingSelectionForListJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RestoreTestingSelectionForListJsonUnmarshaller();
        return instance;
    }
}
