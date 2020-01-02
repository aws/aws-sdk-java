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
package com.amazonaws.services.kendra.model.transform;

import java.math.*;
import java.nio.ByteBuffer;
import javax.annotation.Generated;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Document JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentJsonUnmarshaller implements Unmarshaller<Document, JsonUnmarshallerContext> {

    public Document unmarshall(JsonUnmarshallerContext context) throws Exception {
        Document document = new Document();

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
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    document.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Title", targetDepth)) {
                    context.nextToken();
                    document.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Blob", targetDepth)) {
                    context.nextToken();
                    document.setBlob(context.getUnmarshaller(java.nio.ByteBuffer.class).unmarshall(context));
                }
                if (context.testExpression("S3Path", targetDepth)) {
                    context.nextToken();
                    document.setS3Path(S3PathJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Attributes", targetDepth)) {
                    context.nextToken();
                    document.setAttributes(new ListUnmarshaller<DocumentAttribute>(DocumentAttributeJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("AccessControlList", targetDepth)) {
                    context.nextToken();
                    document.setAccessControlList(new ListUnmarshaller<Principal>(PrincipalJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("ContentType", targetDepth)) {
                    context.nextToken();
                    document.setContentType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return document;
    }

    private static DocumentJsonUnmarshaller instance;

    public static DocumentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DocumentJsonUnmarshaller();
        return instance;
    }
}
