/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectwisdom.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.connectwisdom.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ContentData JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContentDataJsonUnmarshaller implements Unmarshaller<ContentData, JsonUnmarshallerContext> {

    public ContentData unmarshall(JsonUnmarshallerContext context) throws Exception {
        ContentData contentData = new ContentData();

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
                if (context.testExpression("contentArn", targetDepth)) {
                    context.nextToken();
                    contentData.setContentArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("contentId", targetDepth)) {
                    context.nextToken();
                    contentData.setContentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("contentType", targetDepth)) {
                    context.nextToken();
                    contentData.setContentType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("knowledgeBaseArn", targetDepth)) {
                    context.nextToken();
                    contentData.setKnowledgeBaseArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("knowledgeBaseId", targetDepth)) {
                    context.nextToken();
                    contentData.setKnowledgeBaseId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("linkOutUri", targetDepth)) {
                    context.nextToken();
                    contentData.setLinkOutUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("metadata", targetDepth)) {
                    context.nextToken();
                    contentData.setMetadata(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    contentData.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("revisionId", targetDepth)) {
                    context.nextToken();
                    contentData.setRevisionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    contentData.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    contentData.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("title", targetDepth)) {
                    context.nextToken();
                    contentData.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("url", targetDepth)) {
                    context.nextToken();
                    contentData.setUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("urlExpiry", targetDepth)) {
                    context.nextToken();
                    contentData.setUrlExpiry(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return contentData;
    }

    private static ContentDataJsonUnmarshaller instance;

    public static ContentDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ContentDataJsonUnmarshaller();
        return instance;
    }
}
