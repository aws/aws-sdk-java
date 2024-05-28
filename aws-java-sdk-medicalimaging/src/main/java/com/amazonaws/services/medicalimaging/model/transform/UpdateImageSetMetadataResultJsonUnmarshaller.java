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
package com.amazonaws.services.medicalimaging.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.medicalimaging.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateImageSetMetadataResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateImageSetMetadataResultJsonUnmarshaller implements Unmarshaller<UpdateImageSetMetadataResult, JsonUnmarshallerContext> {

    public UpdateImageSetMetadataResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateImageSetMetadataResult updateImageSetMetadataResult = new UpdateImageSetMetadataResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateImageSetMetadataResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("datastoreId", targetDepth)) {
                    context.nextToken();
                    updateImageSetMetadataResult.setDatastoreId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("imageSetId", targetDepth)) {
                    context.nextToken();
                    updateImageSetMetadataResult.setImageSetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("latestVersionId", targetDepth)) {
                    context.nextToken();
                    updateImageSetMetadataResult.setLatestVersionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("imageSetState", targetDepth)) {
                    context.nextToken();
                    updateImageSetMetadataResult.setImageSetState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("imageSetWorkflowStatus", targetDepth)) {
                    context.nextToken();
                    updateImageSetMetadataResult.setImageSetWorkflowStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    updateImageSetMetadataResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    updateImageSetMetadataResult.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("message", targetDepth)) {
                    context.nextToken();
                    updateImageSetMetadataResult.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateImageSetMetadataResult;
    }

    private static UpdateImageSetMetadataResultJsonUnmarshaller instance;

    public static UpdateImageSetMetadataResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateImageSetMetadataResultJsonUnmarshaller();
        return instance;
    }
}
