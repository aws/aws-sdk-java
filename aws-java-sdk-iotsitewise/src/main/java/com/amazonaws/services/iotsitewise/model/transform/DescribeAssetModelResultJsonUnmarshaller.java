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
 * DescribeAssetModelResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAssetModelResultJsonUnmarshaller implements Unmarshaller<DescribeAssetModelResult, JsonUnmarshallerContext> {

    public DescribeAssetModelResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeAssetModelResult describeAssetModelResult = new DescribeAssetModelResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeAssetModelResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("assetModelId", targetDepth)) {
                    context.nextToken();
                    describeAssetModelResult.setAssetModelId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assetModelArn", targetDepth)) {
                    context.nextToken();
                    describeAssetModelResult.setAssetModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assetModelName", targetDepth)) {
                    context.nextToken();
                    describeAssetModelResult.setAssetModelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assetModelDescription", targetDepth)) {
                    context.nextToken();
                    describeAssetModelResult.setAssetModelDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assetModelProperties", targetDepth)) {
                    context.nextToken();
                    describeAssetModelResult.setAssetModelProperties(new ListUnmarshaller<AssetModelProperty>(AssetModelPropertyJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("assetModelHierarchies", targetDepth)) {
                    context.nextToken();
                    describeAssetModelResult.setAssetModelHierarchies(new ListUnmarshaller<AssetModelHierarchy>(AssetModelHierarchyJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("assetModelCompositeModels", targetDepth)) {
                    context.nextToken();
                    describeAssetModelResult.setAssetModelCompositeModels(new ListUnmarshaller<AssetModelCompositeModel>(
                            AssetModelCompositeModelJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("assetModelCreationDate", targetDepth)) {
                    context.nextToken();
                    describeAssetModelResult.setAssetModelCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("assetModelLastUpdateDate", targetDepth)) {
                    context.nextToken();
                    describeAssetModelResult.setAssetModelLastUpdateDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("assetModelStatus", targetDepth)) {
                    context.nextToken();
                    describeAssetModelResult.setAssetModelStatus(AssetModelStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeAssetModelResult;
    }

    private static DescribeAssetModelResultJsonUnmarshaller instance;

    public static DescribeAssetModelResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeAssetModelResultJsonUnmarshaller();
        return instance;
    }
}
