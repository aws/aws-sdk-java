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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeFeatureMetadataResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFeatureMetadataResultJsonUnmarshaller implements Unmarshaller<DescribeFeatureMetadataResult, JsonUnmarshallerContext> {

    public DescribeFeatureMetadataResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeFeatureMetadataResult describeFeatureMetadataResult = new DescribeFeatureMetadataResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeFeatureMetadataResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("FeatureGroupArn", targetDepth)) {
                    context.nextToken();
                    describeFeatureMetadataResult.setFeatureGroupArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FeatureGroupName", targetDepth)) {
                    context.nextToken();
                    describeFeatureMetadataResult.setFeatureGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FeatureName", targetDepth)) {
                    context.nextToken();
                    describeFeatureMetadataResult.setFeatureName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FeatureType", targetDepth)) {
                    context.nextToken();
                    describeFeatureMetadataResult.setFeatureType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeFeatureMetadataResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    describeFeatureMetadataResult.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    describeFeatureMetadataResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Parameters", targetDepth)) {
                    context.nextToken();
                    describeFeatureMetadataResult.setParameters(new ListUnmarshaller<FeatureParameter>(FeatureParameterJsonUnmarshaller.getInstance())

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

        return describeFeatureMetadataResult;
    }

    private static DescribeFeatureMetadataResultJsonUnmarshaller instance;

    public static DescribeFeatureMetadataResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeFeatureMetadataResultJsonUnmarshaller();
        return instance;
    }
}
