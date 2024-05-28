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
package com.amazonaws.services.textract.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.textract.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateAdapterResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAdapterResultJsonUnmarshaller implements Unmarshaller<UpdateAdapterResult, JsonUnmarshallerContext> {

    public UpdateAdapterResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateAdapterResult updateAdapterResult = new UpdateAdapterResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateAdapterResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("AdapterId", targetDepth)) {
                    context.nextToken();
                    updateAdapterResult.setAdapterId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AdapterName", targetDepth)) {
                    context.nextToken();
                    updateAdapterResult.setAdapterName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    updateAdapterResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    updateAdapterResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FeatureTypes", targetDepth)) {
                    context.nextToken();
                    updateAdapterResult.setFeatureTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("AutoUpdate", targetDepth)) {
                    context.nextToken();
                    updateAdapterResult.setAutoUpdate(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateAdapterResult;
    }

    private static UpdateAdapterResultJsonUnmarshaller instance;

    public static UpdateAdapterResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateAdapterResultJsonUnmarshaller();
        return instance;
    }
}
