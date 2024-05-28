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
 * AssetListingItem JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetListingItemJsonUnmarshaller implements Unmarshaller<AssetListingItem, JsonUnmarshallerContext> {

    public AssetListingItem unmarshall(JsonUnmarshallerContext context) throws Exception {
        AssetListingItem assetListingItem = new AssetListingItem();

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
                if (context.testExpression("additionalAttributes", targetDepth)) {
                    context.nextToken();
                    assetListingItem.setAdditionalAttributes(AssetListingItemAdditionalAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    assetListingItem.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    assetListingItem.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("entityId", targetDepth)) {
                    context.nextToken();
                    assetListingItem.setEntityId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("entityRevision", targetDepth)) {
                    context.nextToken();
                    assetListingItem.setEntityRevision(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("entityType", targetDepth)) {
                    context.nextToken();
                    assetListingItem.setEntityType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("glossaryTerms", targetDepth)) {
                    context.nextToken();
                    assetListingItem.setGlossaryTerms(new ListUnmarshaller<DetailedGlossaryTerm>(DetailedGlossaryTermJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("listingCreatedBy", targetDepth)) {
                    context.nextToken();
                    assetListingItem.setListingCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("listingId", targetDepth)) {
                    context.nextToken();
                    assetListingItem.setListingId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("listingRevision", targetDepth)) {
                    context.nextToken();
                    assetListingItem.setListingRevision(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("listingUpdatedBy", targetDepth)) {
                    context.nextToken();
                    assetListingItem.setListingUpdatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    assetListingItem.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("owningProjectId", targetDepth)) {
                    context.nextToken();
                    assetListingItem.setOwningProjectId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return assetListingItem;
    }

    private static AssetListingItemJsonUnmarshaller instance;

    public static AssetListingItemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssetListingItemJsonUnmarshaller();
        return instance;
    }
}
