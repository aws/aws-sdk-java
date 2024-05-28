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
package com.amazonaws.services.datazone.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.datazone.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SubscribedListing JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubscribedListingJsonUnmarshaller implements Unmarshaller<SubscribedListing, JsonUnmarshallerContext> {

    public SubscribedListing unmarshall(JsonUnmarshallerContext context) throws Exception {
        SubscribedListing subscribedListing = new SubscribedListing();

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
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    subscribedListing.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    subscribedListing.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("item", targetDepth)) {
                    context.nextToken();
                    subscribedListing.setItem(SubscribedListingItemJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    subscribedListing.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ownerProjectId", targetDepth)) {
                    context.nextToken();
                    subscribedListing.setOwnerProjectId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ownerProjectName", targetDepth)) {
                    context.nextToken();
                    subscribedListing.setOwnerProjectName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("revision", targetDepth)) {
                    context.nextToken();
                    subscribedListing.setRevision(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return subscribedListing;
    }

    private static SubscribedListingJsonUnmarshaller instance;

    public static SubscribedListingJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SubscribedListingJsonUnmarshaller();
        return instance;
    }
}
