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
 * DescribePackageResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePackageResultJsonUnmarshaller implements Unmarshaller<DescribePackageResult, JsonUnmarshallerContext> {

    public DescribePackageResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribePackageResult describePackageResult = new DescribePackageResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describePackageResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    describePackageResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    context.nextToken();
                    describePackageResult.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("PackageId", targetDepth)) {
                    context.nextToken();
                    describePackageResult.setPackageId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PackageName", targetDepth)) {
                    context.nextToken();
                    describePackageResult.setPackageName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReadAccessPrincipalArns", targetDepth)) {
                    context.nextToken();
                    describePackageResult.setReadAccessPrincipalArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("StorageLocation", targetDepth)) {
                    context.nextToken();
                    describePackageResult.setStorageLocation(StorageLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    describePackageResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("WriteAccessPrincipalArns", targetDepth)) {
                    context.nextToken();
                    describePackageResult.setWriteAccessPrincipalArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return describePackageResult;
    }

    private static DescribePackageResultJsonUnmarshaller instance;

    public static DescribePackageResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribePackageResultJsonUnmarshaller();
        return instance;
    }
}
