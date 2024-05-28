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
 * RestoreTestingSelectionForUpdate JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreTestingSelectionForUpdateJsonUnmarshaller implements Unmarshaller<RestoreTestingSelectionForUpdate, JsonUnmarshallerContext> {

    public RestoreTestingSelectionForUpdate unmarshall(JsonUnmarshallerContext context) throws Exception {
        RestoreTestingSelectionForUpdate restoreTestingSelectionForUpdate = new RestoreTestingSelectionForUpdate();

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
                if (context.testExpression("IamRoleArn", targetDepth)) {
                    context.nextToken();
                    restoreTestingSelectionForUpdate.setIamRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProtectedResourceArns", targetDepth)) {
                    context.nextToken();
                    restoreTestingSelectionForUpdate.setProtectedResourceArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ProtectedResourceConditions", targetDepth)) {
                    context.nextToken();
                    restoreTestingSelectionForUpdate.setProtectedResourceConditions(ProtectedResourceConditionsJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("RestoreMetadataOverrides", targetDepth)) {
                    context.nextToken();
                    restoreTestingSelectionForUpdate.setRestoreMetadataOverrides(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class),
                            context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("ValidationWindowHours", targetDepth)) {
                    context.nextToken();
                    restoreTestingSelectionForUpdate.setValidationWindowHours(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return restoreTestingSelectionForUpdate;
    }

    private static RestoreTestingSelectionForUpdateJsonUnmarshaller instance;

    public static RestoreTestingSelectionForUpdateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RestoreTestingSelectionForUpdateJsonUnmarshaller();
        return instance;
    }
}
