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
 * RestoreTestingSelectionForGet JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreTestingSelectionForGetJsonUnmarshaller implements Unmarshaller<RestoreTestingSelectionForGet, JsonUnmarshallerContext> {

    public RestoreTestingSelectionForGet unmarshall(JsonUnmarshallerContext context) throws Exception {
        RestoreTestingSelectionForGet restoreTestingSelectionForGet = new RestoreTestingSelectionForGet();

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
                    restoreTestingSelectionForGet.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreatorRequestId", targetDepth)) {
                    context.nextToken();
                    restoreTestingSelectionForGet.setCreatorRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IamRoleArn", targetDepth)) {
                    context.nextToken();
                    restoreTestingSelectionForGet.setIamRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProtectedResourceArns", targetDepth)) {
                    context.nextToken();
                    restoreTestingSelectionForGet.setProtectedResourceArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ProtectedResourceConditions", targetDepth)) {
                    context.nextToken();
                    restoreTestingSelectionForGet.setProtectedResourceConditions(ProtectedResourceConditionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ProtectedResourceType", targetDepth)) {
                    context.nextToken();
                    restoreTestingSelectionForGet.setProtectedResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RestoreMetadataOverrides", targetDepth)) {
                    context.nextToken();
                    restoreTestingSelectionForGet.setRestoreMetadataOverrides(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class),
                            context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("RestoreTestingPlanName", targetDepth)) {
                    context.nextToken();
                    restoreTestingSelectionForGet.setRestoreTestingPlanName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RestoreTestingSelectionName", targetDepth)) {
                    context.nextToken();
                    restoreTestingSelectionForGet.setRestoreTestingSelectionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ValidationWindowHours", targetDepth)) {
                    context.nextToken();
                    restoreTestingSelectionForGet.setValidationWindowHours(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return restoreTestingSelectionForGet;
    }

    private static RestoreTestingSelectionForGetJsonUnmarshaller instance;

    public static RestoreTestingSelectionForGetJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RestoreTestingSelectionForGetJsonUnmarshaller();
        return instance;
    }
}
