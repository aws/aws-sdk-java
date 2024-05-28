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
 * AmiProductFilters JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmiProductFiltersJsonUnmarshaller implements Unmarshaller<AmiProductFilters, JsonUnmarshallerContext> {

    public AmiProductFilters unmarshall(JsonUnmarshallerContext context) throws Exception {
        AmiProductFilters amiProductFilters = new AmiProductFilters();

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
                if (context.testExpression("EntityId", targetDepth)) {
                    context.nextToken();
                    amiProductFilters.setEntityId(AmiProductEntityIdFilterJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastModifiedDate", targetDepth)) {
                    context.nextToken();
                    amiProductFilters.setLastModifiedDate(AmiProductLastModifiedDateFilterJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ProductTitle", targetDepth)) {
                    context.nextToken();
                    amiProductFilters.setProductTitle(AmiProductTitleFilterJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Visibility", targetDepth)) {
                    context.nextToken();
                    amiProductFilters.setVisibility(AmiProductVisibilityFilterJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return amiProductFilters;
    }

    private static AmiProductFiltersJsonUnmarshaller instance;

    public static AmiProductFiltersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AmiProductFiltersJsonUnmarshaller();
        return instance;
    }
}
