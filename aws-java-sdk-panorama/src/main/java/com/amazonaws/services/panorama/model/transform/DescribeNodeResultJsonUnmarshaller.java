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
package com.amazonaws.services.panorama.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.panorama.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeNodeResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNodeResultJsonUnmarshaller implements Unmarshaller<DescribeNodeResult, JsonUnmarshallerContext> {

    public DescribeNodeResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeNodeResult describeNodeResult = new DescribeNodeResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeNodeResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("AssetName", targetDepth)) {
                    context.nextToken();
                    describeNodeResult.setAssetName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Category", targetDepth)) {
                    context.nextToken();
                    describeNodeResult.setCategory(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    context.nextToken();
                    describeNodeResult.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    describeNodeResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastUpdatedTime", targetDepth)) {
                    context.nextToken();
                    describeNodeResult.setLastUpdatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    describeNodeResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NodeId", targetDepth)) {
                    context.nextToken();
                    describeNodeResult.setNodeId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NodeInterface", targetDepth)) {
                    context.nextToken();
                    describeNodeResult.setNodeInterface(NodeInterfaceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OwnerAccount", targetDepth)) {
                    context.nextToken();
                    describeNodeResult.setOwnerAccount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PackageArn", targetDepth)) {
                    context.nextToken();
                    describeNodeResult.setPackageArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PackageId", targetDepth)) {
                    context.nextToken();
                    describeNodeResult.setPackageId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PackageName", targetDepth)) {
                    context.nextToken();
                    describeNodeResult.setPackageName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PackageVersion", targetDepth)) {
                    context.nextToken();
                    describeNodeResult.setPackageVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PatchVersion", targetDepth)) {
                    context.nextToken();
                    describeNodeResult.setPatchVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeNodeResult;
    }

    private static DescribeNodeResultJsonUnmarshaller instance;

    public static DescribeNodeResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeNodeResultJsonUnmarshaller();
        return instance;
    }
}
