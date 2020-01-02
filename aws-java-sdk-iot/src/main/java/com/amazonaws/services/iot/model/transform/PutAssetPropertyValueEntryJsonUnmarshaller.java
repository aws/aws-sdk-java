/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PutAssetPropertyValueEntry JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutAssetPropertyValueEntryJsonUnmarshaller implements Unmarshaller<PutAssetPropertyValueEntry, JsonUnmarshallerContext> {

    public PutAssetPropertyValueEntry unmarshall(JsonUnmarshallerContext context) throws Exception {
        PutAssetPropertyValueEntry putAssetPropertyValueEntry = new PutAssetPropertyValueEntry();

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
                if (context.testExpression("entryId", targetDepth)) {
                    context.nextToken();
                    putAssetPropertyValueEntry.setEntryId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assetId", targetDepth)) {
                    context.nextToken();
                    putAssetPropertyValueEntry.setAssetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("propertyId", targetDepth)) {
                    context.nextToken();
                    putAssetPropertyValueEntry.setPropertyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("propertyAlias", targetDepth)) {
                    context.nextToken();
                    putAssetPropertyValueEntry.setPropertyAlias(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("propertyValues", targetDepth)) {
                    context.nextToken();
                    putAssetPropertyValueEntry.setPropertyValues(new ListUnmarshaller<AssetPropertyValue>(AssetPropertyValueJsonUnmarshaller.getInstance())
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

        return putAssetPropertyValueEntry;
    }

    private static PutAssetPropertyValueEntryJsonUnmarshaller instance;

    public static PutAssetPropertyValueEntryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PutAssetPropertyValueEntryJsonUnmarshaller();
        return instance;
    }
}
