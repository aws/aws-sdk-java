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
package com.amazonaws.services.codecommit.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codecommit.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ConflictMetadata JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictMetadataJsonUnmarshaller implements Unmarshaller<ConflictMetadata, JsonUnmarshallerContext> {

    public ConflictMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        ConflictMetadata conflictMetadata = new ConflictMetadata();

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
                if (context.testExpression("filePath", targetDepth)) {
                    context.nextToken();
                    conflictMetadata.setFilePath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fileSizes", targetDepth)) {
                    context.nextToken();
                    conflictMetadata.setFileSizes(FileSizesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("fileModes", targetDepth)) {
                    context.nextToken();
                    conflictMetadata.setFileModes(FileModesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("objectTypes", targetDepth)) {
                    context.nextToken();
                    conflictMetadata.setObjectTypes(ObjectTypesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("numberOfConflicts", targetDepth)) {
                    context.nextToken();
                    conflictMetadata.setNumberOfConflicts(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("isBinaryFile", targetDepth)) {
                    context.nextToken();
                    conflictMetadata.setIsBinaryFile(IsBinaryFileJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("contentConflict", targetDepth)) {
                    context.nextToken();
                    conflictMetadata.setContentConflict(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("fileModeConflict", targetDepth)) {
                    context.nextToken();
                    conflictMetadata.setFileModeConflict(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("objectTypeConflict", targetDepth)) {
                    context.nextToken();
                    conflictMetadata.setObjectTypeConflict(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("mergeOperations", targetDepth)) {
                    context.nextToken();
                    conflictMetadata.setMergeOperations(MergeOperationsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return conflictMetadata;
    }

    private static ConflictMetadataJsonUnmarshaller instance;

    public static ConflictMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConflictMetadataJsonUnmarshaller();
        return instance;
    }
}
