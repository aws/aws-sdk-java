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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetDocumentResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDocumentResultJsonUnmarshaller implements Unmarshaller<GetDocumentResult, JsonUnmarshallerContext> {

    public GetDocumentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetDocumentResult getDocumentResult = new GetDocumentResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getDocumentResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    getDocumentResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VersionName", targetDepth)) {
                    context.nextToken();
                    getDocumentResult.setVersionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DocumentVersion", targetDepth)) {
                    context.nextToken();
                    getDocumentResult.setDocumentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    getDocumentResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusInformation", targetDepth)) {
                    context.nextToken();
                    getDocumentResult.setStatusInformation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Content", targetDepth)) {
                    context.nextToken();
                    getDocumentResult.setContent(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DocumentType", targetDepth)) {
                    context.nextToken();
                    getDocumentResult.setDocumentType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DocumentFormat", targetDepth)) {
                    context.nextToken();
                    getDocumentResult.setDocumentFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AttachmentsContent", targetDepth)) {
                    context.nextToken();
                    getDocumentResult.setAttachmentsContent(new ListUnmarshaller<AttachmentContent>(AttachmentContentJsonUnmarshaller.getInstance())
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

        return getDocumentResult;
    }

    private static GetDocumentResultJsonUnmarshaller instance;

    public static GetDocumentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetDocumentResultJsonUnmarshaller();
        return instance;
    }
}
