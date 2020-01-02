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
package com.amazonaws.services.comprehendmedical.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.comprehendmedical.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ListEntitiesDetectionV2JobsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEntitiesDetectionV2JobsResultJsonUnmarshaller implements Unmarshaller<ListEntitiesDetectionV2JobsResult, JsonUnmarshallerContext> {

    public ListEntitiesDetectionV2JobsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListEntitiesDetectionV2JobsResult listEntitiesDetectionV2JobsResult = new ListEntitiesDetectionV2JobsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return listEntitiesDetectionV2JobsResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ComprehendMedicalAsyncJobPropertiesList", targetDepth)) {
                    context.nextToken();
                    listEntitiesDetectionV2JobsResult.setComprehendMedicalAsyncJobPropertiesList(new ListUnmarshaller<ComprehendMedicalAsyncJobProperties>(
                            ComprehendMedicalAsyncJobPropertiesJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("NextToken", targetDepth)) {
                    context.nextToken();
                    listEntitiesDetectionV2JobsResult.setNextToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return listEntitiesDetectionV2JobsResult;
    }

    private static ListEntitiesDetectionV2JobsResultJsonUnmarshaller instance;

    public static ListEntitiesDetectionV2JobsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListEntitiesDetectionV2JobsResultJsonUnmarshaller();
        return instance;
    }
}
