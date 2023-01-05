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
 * AssetInfo JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetInfoJsonUnmarshaller implements Unmarshaller<AssetInfo, JsonUnmarshallerContext> {

    public AssetInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        AssetInfo assetInfo = new AssetInfo();

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
                if (context.testExpression("AssetId", targetDepth)) {
                    context.nextToken();
                    assetInfo.setAssetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RackId", targetDepth)) {
                    context.nextToken();
                    assetInfo.setRackId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AssetType", targetDepth)) {
                    context.nextToken();
                    assetInfo.setAssetType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ComputeAttributes", targetDepth)) {
                    context.nextToken();
                    assetInfo.setComputeAttributes(ComputeAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AssetLocation", targetDepth)) {
                    context.nextToken();
                    assetInfo.setAssetLocation(AssetLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return assetInfo;
    }

    private static AssetInfoJsonUnmarshaller instance;

    public static AssetInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssetInfoJsonUnmarshaller();
        return instance;
    }
}
