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
package com.amazonaws.services.omics.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.omics.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AnnotationStoreItem JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnnotationStoreItemJsonUnmarshaller implements Unmarshaller<AnnotationStoreItem, JsonUnmarshallerContext> {

    public AnnotationStoreItem unmarshall(JsonUnmarshallerContext context) throws Exception {
        AnnotationStoreItem annotationStoreItem = new AnnotationStoreItem();

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
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    annotationStoreItem.setCreationTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    annotationStoreItem.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    annotationStoreItem.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    annotationStoreItem.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("reference", targetDepth)) {
                    context.nextToken();
                    annotationStoreItem.setReference(ReferenceItemJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sseConfig", targetDepth)) {
                    context.nextToken();
                    annotationStoreItem.setSseConfig(SseConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    annotationStoreItem.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusMessage", targetDepth)) {
                    context.nextToken();
                    annotationStoreItem.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("storeArn", targetDepth)) {
                    context.nextToken();
                    annotationStoreItem.setStoreArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("storeFormat", targetDepth)) {
                    context.nextToken();
                    annotationStoreItem.setStoreFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("storeSizeBytes", targetDepth)) {
                    context.nextToken();
                    annotationStoreItem.setStoreSizeBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("updateTime", targetDepth)) {
                    context.nextToken();
                    annotationStoreItem.setUpdateTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return annotationStoreItem;
    }

    private static AnnotationStoreItemJsonUnmarshaller instance;

    public static AnnotationStoreItemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AnnotationStoreItemJsonUnmarshaller();
        return instance;
    }
}
