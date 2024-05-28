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
package com.amazonaws.services.iotsitewise.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotsitewise.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeAssetCompositeModelResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAssetCompositeModelResultJsonUnmarshaller implements Unmarshaller<DescribeAssetCompositeModelResult, JsonUnmarshallerContext> {

    public DescribeAssetCompositeModelResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeAssetCompositeModelResult describeAssetCompositeModelResult = new DescribeAssetCompositeModelResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeAssetCompositeModelResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("assetId", targetDepth)) {
                    context.nextToken();
                    describeAssetCompositeModelResult.setAssetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assetCompositeModelId", targetDepth)) {
                    context.nextToken();
                    describeAssetCompositeModelResult.setAssetCompositeModelId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assetCompositeModelExternalId", targetDepth)) {
                    context.nextToken();
                    describeAssetCompositeModelResult.setAssetCompositeModelExternalId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assetCompositeModelPath", targetDepth)) {
                    context.nextToken();
                    describeAssetCompositeModelResult.setAssetCompositeModelPath(new ListUnmarshaller<AssetCompositeModelPathSegment>(
                            AssetCompositeModelPathSegmentJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("assetCompositeModelName", targetDepth)) {
                    context.nextToken();
                    describeAssetCompositeModelResult.setAssetCompositeModelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assetCompositeModelDescription", targetDepth)) {
                    context.nextToken();
                    describeAssetCompositeModelResult.setAssetCompositeModelDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assetCompositeModelType", targetDepth)) {
                    context.nextToken();
                    describeAssetCompositeModelResult.setAssetCompositeModelType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assetCompositeModelProperties", targetDepth)) {
                    context.nextToken();
                    describeAssetCompositeModelResult.setAssetCompositeModelProperties(new ListUnmarshaller<AssetProperty>(AssetPropertyJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("assetCompositeModelSummaries", targetDepth)) {
                    context.nextToken();
                    describeAssetCompositeModelResult.setAssetCompositeModelSummaries(new ListUnmarshaller<AssetCompositeModelSummary>(
                            AssetCompositeModelSummaryJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("actionDefinitions", targetDepth)) {
                    context.nextToken();
                    describeAssetCompositeModelResult.setActionDefinitions(new ListUnmarshaller<ActionDefinition>(ActionDefinitionJsonUnmarshaller
                            .getInstance())

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

        return describeAssetCompositeModelResult;
    }

    private static DescribeAssetCompositeModelResultJsonUnmarshaller instance;

    public static DescribeAssetCompositeModelResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeAssetCompositeModelResultJsonUnmarshaller();
        return instance;
    }
}
