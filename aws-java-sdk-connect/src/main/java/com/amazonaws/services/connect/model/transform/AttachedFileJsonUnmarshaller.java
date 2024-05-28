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
 * AttachedFile JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttachedFileJsonUnmarshaller implements Unmarshaller<AttachedFile, JsonUnmarshallerContext> {

    public AttachedFile unmarshall(JsonUnmarshallerContext context) throws Exception {
        AttachedFile attachedFile = new AttachedFile();

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
                    attachedFile.setCreationTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FileArn", targetDepth)) {
                    context.nextToken();
                    attachedFile.setFileArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FileId", targetDepth)) {
                    context.nextToken();
                    attachedFile.setFileId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FileName", targetDepth)) {
                    context.nextToken();
                    attachedFile.setFileName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FileSizeInBytes", targetDepth)) {
                    context.nextToken();
                    attachedFile.setFileSizeInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("FileStatus", targetDepth)) {
                    context.nextToken();
                    attachedFile.setFileStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedBy", targetDepth)) {
                    context.nextToken();
                    attachedFile.setCreatedBy(CreatedByInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FileUseCaseType", targetDepth)) {
                    context.nextToken();
                    attachedFile.setFileUseCaseType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AssociatedResourceArn", targetDepth)) {
                    context.nextToken();
                    attachedFile.setAssociatedResourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    attachedFile.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return attachedFile;
    }

    private static AttachedFileJsonUnmarshaller instance;

    public static AttachedFileJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AttachedFileJsonUnmarshaller();
        return instance;
    }
}
