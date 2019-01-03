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
package com.amazonaws.services.workdocs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.workdocs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DocumentVersionMetadata JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentVersionMetadataJsonUnmarshaller implements Unmarshaller<DocumentVersionMetadata, JsonUnmarshallerContext> {

    public DocumentVersionMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        DocumentVersionMetadata documentVersionMetadata = new DocumentVersionMetadata();

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
                    documentVersionMetadata.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    documentVersionMetadata.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ContentType", targetDepth)) {
                    context.nextToken();
                    documentVersionMetadata.setContentType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Size", targetDepth)) {
                    context.nextToken();
                    documentVersionMetadata.setSize(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Signature", targetDepth)) {
                    context.nextToken();
                    documentVersionMetadata.setSignature(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    documentVersionMetadata.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTimestamp", targetDepth)) {
                    context.nextToken();
                    documentVersionMetadata.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ModifiedTimestamp", targetDepth)) {
                    context.nextToken();
                    documentVersionMetadata.setModifiedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ContentCreatedTimestamp", targetDepth)) {
                    context.nextToken();
                    documentVersionMetadata.setContentCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ContentModifiedTimestamp", targetDepth)) {
                    context.nextToken();
                    documentVersionMetadata.setContentModifiedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreatorId", targetDepth)) {
                    context.nextToken();
                    documentVersionMetadata.setCreatorId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Thumbnail", targetDepth)) {
                    context.nextToken();
                    documentVersionMetadata.setThumbnail(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("Source", targetDepth)) {
                    context.nextToken();
                    documentVersionMetadata.setSource(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
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

        return documentVersionMetadata;
    }

    private static DocumentVersionMetadataJsonUnmarshaller instance;

    public static DocumentVersionMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DocumentVersionMetadataJsonUnmarshaller();
        return instance;
    }
}
