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
 * DescribeAssetResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAssetResultJsonUnmarshaller implements Unmarshaller<DescribeAssetResult, JsonUnmarshallerContext> {

    public DescribeAssetResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeAssetResult describeAssetResult = new DescribeAssetResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeAssetResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("assetId", targetDepth)) {
                    context.nextToken();
                    describeAssetResult.setAssetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assetArn", targetDepth)) {
                    context.nextToken();
                    describeAssetResult.setAssetArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assetName", targetDepth)) {
                    context.nextToken();
                    describeAssetResult.setAssetName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assetModelId", targetDepth)) {
                    context.nextToken();
                    describeAssetResult.setAssetModelId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assetProperties", targetDepth)) {
                    context.nextToken();
                    describeAssetResult.setAssetProperties(new ListUnmarshaller<AssetProperty>(AssetPropertyJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("assetHierarchies", targetDepth)) {
                    context.nextToken();
                    describeAssetResult.setAssetHierarchies(new ListUnmarshaller<AssetHierarchy>(AssetHierarchyJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("assetCompositeModels", targetDepth)) {
                    context.nextToken();
                    describeAssetResult.setAssetCompositeModels(new ListUnmarshaller<AssetCompositeModel>(AssetCompositeModelJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("assetCreationDate", targetDepth)) {
                    context.nextToken();
                    describeAssetResult.setAssetCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("assetLastUpdateDate", targetDepth)) {
                    context.nextToken();
                    describeAssetResult.setAssetLastUpdateDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("assetStatus", targetDepth)) {
                    context.nextToken();
                    describeAssetResult.setAssetStatus(AssetStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeAssetResult;
    }

    private static DescribeAssetResultJsonUnmarshaller instance;

    public static DescribeAssetResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeAssetResultJsonUnmarshaller();
        return instance;
    }
}
