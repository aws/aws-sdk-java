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
package com.amazonaws.services.kendra.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RetrieveResultItem JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetrieveResultItemJsonUnmarshaller implements Unmarshaller<RetrieveResultItem, JsonUnmarshallerContext> {

    public RetrieveResultItem unmarshall(JsonUnmarshallerContext context) throws Exception {
        RetrieveResultItem retrieveResultItem = new RetrieveResultItem();

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
                    retrieveResultItem.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DocumentId", targetDepth)) {
                    context.nextToken();
                    retrieveResultItem.setDocumentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DocumentTitle", targetDepth)) {
                    context.nextToken();
                    retrieveResultItem.setDocumentTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Content", targetDepth)) {
                    context.nextToken();
                    retrieveResultItem.setContent(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DocumentURI", targetDepth)) {
                    context.nextToken();
                    retrieveResultItem.setDocumentURI(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DocumentAttributes", targetDepth)) {
                    context.nextToken();
                    retrieveResultItem.setDocumentAttributes(new ListUnmarshaller<DocumentAttribute>(DocumentAttributeJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ScoreAttributes", targetDepth)) {
                    context.nextToken();
                    retrieveResultItem.setScoreAttributes(ScoreAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return retrieveResultItem;
    }

    private static RetrieveResultItemJsonUnmarshaller instance;

    public static RetrieveResultItemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RetrieveResultItemJsonUnmarshaller();
        return instance;
    }
}
