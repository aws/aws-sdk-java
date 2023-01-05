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
 * DescribePackageVersionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePackageVersionResultJsonUnmarshaller implements Unmarshaller<DescribePackageVersionResult, JsonUnmarshallerContext> {

    public DescribePackageVersionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribePackageVersionResult describePackageVersionResult = new DescribePackageVersionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describePackageVersionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("IsLatestPatch", targetDepth)) {
                    context.nextToken();
                    describePackageVersionResult.setIsLatestPatch(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("OwnerAccount", targetDepth)) {
                    context.nextToken();
                    describePackageVersionResult.setOwnerAccount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PackageArn", targetDepth)) {
                    context.nextToken();
                    describePackageVersionResult.setPackageArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PackageId", targetDepth)) {
                    context.nextToken();
                    describePackageVersionResult.setPackageId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PackageName", targetDepth)) {
                    context.nextToken();
                    describePackageVersionResult.setPackageName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PackageVersion", targetDepth)) {
                    context.nextToken();
                    describePackageVersionResult.setPackageVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PatchVersion", targetDepth)) {
                    context.nextToken();
                    describePackageVersionResult.setPatchVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RegisteredTime", targetDepth)) {
                    context.nextToken();
                    describePackageVersionResult.setRegisteredTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    describePackageVersionResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusDescription", targetDepth)) {
                    context.nextToken();
                    describePackageVersionResult.setStatusDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describePackageVersionResult;
    }

    private static DescribePackageVersionResultJsonUnmarshaller instance;

    public static DescribePackageVersionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribePackageVersionResultJsonUnmarshaller();
        return instance;
    }
}
