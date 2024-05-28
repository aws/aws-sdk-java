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
package com.amazonaws.services.marketplacecatalog.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.marketplacecatalog.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EntityTypeSort JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityTypeSortJsonUnmarshaller implements Unmarshaller<EntityTypeSort, JsonUnmarshallerContext> {

    public EntityTypeSort unmarshall(JsonUnmarshallerContext context) throws Exception {
        EntityTypeSort entityTypeSort = new EntityTypeSort();

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
                if (context.testExpression("DataProductSort", targetDepth)) {
                    context.nextToken();
                    entityTypeSort.setDataProductSort(DataProductSortJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SaaSProductSort", targetDepth)) {
                    context.nextToken();
                    entityTypeSort.setSaaSProductSort(SaaSProductSortJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AmiProductSort", targetDepth)) {
                    context.nextToken();
                    entityTypeSort.setAmiProductSort(AmiProductSortJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OfferSort", targetDepth)) {
                    context.nextToken();
                    entityTypeSort.setOfferSort(OfferSortJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ContainerProductSort", targetDepth)) {
                    context.nextToken();
                    entityTypeSort.setContainerProductSort(ContainerProductSortJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ResaleAuthorizationSort", targetDepth)) {
                    context.nextToken();
                    entityTypeSort.setResaleAuthorizationSort(ResaleAuthorizationSortJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return entityTypeSort;
    }

    private static EntityTypeSortJsonUnmarshaller instance;

    public static EntityTypeSortJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EntityTypeSortJsonUnmarshaller();
        return instance;
    }
}
