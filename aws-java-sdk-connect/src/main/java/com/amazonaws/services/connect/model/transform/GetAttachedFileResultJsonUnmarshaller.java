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
package com.amazonaws.services.connect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetAttachedFileResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAttachedFileResultJsonUnmarshaller implements Unmarshaller<GetAttachedFileResult, JsonUnmarshallerContext> {

    public GetAttachedFileResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetAttachedFileResult getAttachedFileResult = new GetAttachedFileResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getAttachedFileResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("FileArn", targetDepth)) {
                    context.nextToken();
                    getAttachedFileResult.setFileArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FileId", targetDepth)) {
                    context.nextToken();
                    getAttachedFileResult.setFileId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    getAttachedFileResult.setCreationTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FileStatus", targetDepth)) {
                    context.nextToken();
                    getAttachedFileResult.setFileStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FileName", targetDepth)) {
                    context.nextToken();
                    getAttachedFileResult.setFileName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FileSizeInBytes", targetDepth)) {
                    context.nextToken();
                    getAttachedFileResult.setFileSizeInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("AssociatedResourceArn", targetDepth)) {
                    context.nextToken();
                    getAttachedFileResult.setAssociatedResourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FileUseCaseType", targetDepth)) {
                    context.nextToken();
                    getAttachedFileResult.setFileUseCaseType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedBy", targetDepth)) {
                    context.nextToken();
                    getAttachedFileResult.setCreatedBy(CreatedByInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DownloadUrlMetadata", targetDepth)) {
                    context.nextToken();
                    getAttachedFileResult.setDownloadUrlMetadata(DownloadUrlMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    getAttachedFileResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getAttachedFileResult;
    }

    private static GetAttachedFileResultJsonUnmarshaller instance;

    public static GetAttachedFileResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetAttachedFileResultJsonUnmarshaller();
        return instance;
    }
}
