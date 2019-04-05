/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codecommit.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codecommit.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateCommitResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCommitResultJsonUnmarshaller implements Unmarshaller<CreateCommitResult, JsonUnmarshallerContext> {

    public CreateCommitResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateCommitResult createCommitResult = new CreateCommitResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createCommitResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("commitId", targetDepth)) {
                    context.nextToken();
                    createCommitResult.setCommitId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("treeId", targetDepth)) {
                    context.nextToken();
                    createCommitResult.setTreeId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("filesAdded", targetDepth)) {
                    context.nextToken();
                    createCommitResult.setFilesAdded(new ListUnmarshaller<FileMetadata>(FileMetadataJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("filesUpdated", targetDepth)) {
                    context.nextToken();
                    createCommitResult.setFilesUpdated(new ListUnmarshaller<FileMetadata>(FileMetadataJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("filesDeleted", targetDepth)) {
                    context.nextToken();
                    createCommitResult.setFilesDeleted(new ListUnmarshaller<FileMetadata>(FileMetadataJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createCommitResult;
    }

    private static CreateCommitResultJsonUnmarshaller instance;

    public static CreateCommitResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateCommitResultJsonUnmarshaller();
        return instance;
    }
}
