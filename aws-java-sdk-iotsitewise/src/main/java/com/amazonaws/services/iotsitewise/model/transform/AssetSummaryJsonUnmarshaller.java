/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotsitewise.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotsitewise.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AssetSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetSummaryJsonUnmarshaller implements Unmarshaller<AssetSummary, JsonUnmarshallerContext> {

    public AssetSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AssetSummary assetSummary = new AssetSummary();

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
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    assetSummary.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    assetSummary.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    assetSummary.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assetModelId", targetDepth)) {
                    context.nextToken();
                    assetSummary.setAssetModelId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDate", targetDepth)) {
                    context.nextToken();
                    assetSummary.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdateDate", targetDepth)) {
                    context.nextToken();
                    assetSummary.setLastUpdateDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    assetSummary.setStatus(AssetStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("hierarchies", targetDepth)) {
                    context.nextToken();
                    assetSummary.setHierarchies(new ListUnmarshaller<AssetHierarchy>(AssetHierarchyJsonUnmarshaller.getInstance())

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

        return assetSummary;
    }

    private static AssetSummaryJsonUnmarshaller instance;

    public static AssetSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssetSummaryJsonUnmarshaller();
        return instance;
    }
}
