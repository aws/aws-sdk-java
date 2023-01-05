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
package com.amazonaws.services.opensearchserverless.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.opensearchserverless.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CollectionDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CollectionDetailJsonUnmarshaller implements Unmarshaller<CollectionDetail, JsonUnmarshallerContext> {

    public CollectionDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        CollectionDetail collectionDetail = new CollectionDetail();

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
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    collectionDetail.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("collectionEndpoint", targetDepth)) {
                    context.nextToken();
                    collectionDetail.setCollectionEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdDate", targetDepth)) {
                    context.nextToken();
                    collectionDetail.setCreatedDate(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("dashboardEndpoint", targetDepth)) {
                    context.nextToken();
                    collectionDetail.setDashboardEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    collectionDetail.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    collectionDetail.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("kmsKeyArn", targetDepth)) {
                    context.nextToken();
                    collectionDetail.setKmsKeyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastModifiedDate", targetDepth)) {
                    context.nextToken();
                    collectionDetail.setLastModifiedDate(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    collectionDetail.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    collectionDetail.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    collectionDetail.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return collectionDetail;
    }

    private static CollectionDetailJsonUnmarshaller instance;

    public static CollectionDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CollectionDetailJsonUnmarshaller();
        return instance;
    }
}
