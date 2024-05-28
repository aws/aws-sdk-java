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
package com.amazonaws.services.omics.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.omics.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateMultipartReadSetUploadResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMultipartReadSetUploadResultJsonUnmarshaller implements Unmarshaller<CreateMultipartReadSetUploadResult, JsonUnmarshallerContext> {

    public CreateMultipartReadSetUploadResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateMultipartReadSetUploadResult createMultipartReadSetUploadResult = new CreateMultipartReadSetUploadResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createMultipartReadSetUploadResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("sequenceStoreId", targetDepth)) {
                    context.nextToken();
                    createMultipartReadSetUploadResult.setSequenceStoreId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("uploadId", targetDepth)) {
                    context.nextToken();
                    createMultipartReadSetUploadResult.setUploadId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceFileType", targetDepth)) {
                    context.nextToken();
                    createMultipartReadSetUploadResult.setSourceFileType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("subjectId", targetDepth)) {
                    context.nextToken();
                    createMultipartReadSetUploadResult.setSubjectId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sampleId", targetDepth)) {
                    context.nextToken();
                    createMultipartReadSetUploadResult.setSampleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("generatedFrom", targetDepth)) {
                    context.nextToken();
                    createMultipartReadSetUploadResult.setGeneratedFrom(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("referenceArn", targetDepth)) {
                    context.nextToken();
                    createMultipartReadSetUploadResult.setReferenceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    createMultipartReadSetUploadResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    createMultipartReadSetUploadResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    createMultipartReadSetUploadResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    createMultipartReadSetUploadResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createMultipartReadSetUploadResult;
    }

    private static CreateMultipartReadSetUploadResultJsonUnmarshaller instance;

    public static CreateMultipartReadSetUploadResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateMultipartReadSetUploadResultJsonUnmarshaller();
        return instance;
    }
}
