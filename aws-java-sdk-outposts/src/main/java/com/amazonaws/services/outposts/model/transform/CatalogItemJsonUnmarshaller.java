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
package com.amazonaws.services.outposts.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.outposts.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CatalogItem JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CatalogItemJsonUnmarshaller implements Unmarshaller<CatalogItem, JsonUnmarshallerContext> {

    public CatalogItem unmarshall(JsonUnmarshallerContext context) throws Exception {
        CatalogItem catalogItem = new CatalogItem();

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
                if (context.testExpression("CatalogItemId", targetDepth)) {
                    context.nextToken();
                    catalogItem.setCatalogItemId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ItemStatus", targetDepth)) {
                    context.nextToken();
                    catalogItem.setItemStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EC2Capacities", targetDepth)) {
                    context.nextToken();
                    catalogItem.setEC2Capacities(new ListUnmarshaller<EC2Capacity>(EC2CapacityJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("PowerKva", targetDepth)) {
                    context.nextToken();
                    catalogItem.setPowerKva(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("WeightLbs", targetDepth)) {
                    context.nextToken();
                    catalogItem.setWeightLbs(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SupportedUplinkGbps", targetDepth)) {
                    context.nextToken();
                    catalogItem.setSupportedUplinkGbps(new ListUnmarshaller<Integer>(context.getUnmarshaller(Integer.class))

                    .unmarshall(context));
                }
                if (context.testExpression("SupportedStorage", targetDepth)) {
                    context.nextToken();
                    catalogItem.setSupportedStorage(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return catalogItem;
    }

    private static CatalogItemJsonUnmarshaller instance;

    public static CatalogItemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CatalogItemJsonUnmarshaller();
        return instance;
    }
}
