/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.secretsmanager.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.secretsmanager.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeSecretResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSecretResultJsonUnmarshaller implements Unmarshaller<DescribeSecretResult, JsonUnmarshallerContext> {

    public DescribeSecretResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeSecretResult describeSecretResult = new DescribeSecretResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeSecretResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ARN", targetDepth)) {
                    context.nextToken();
                    describeSecretResult.setARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    describeSecretResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    describeSecretResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    context.nextToken();
                    describeSecretResult.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RotationEnabled", targetDepth)) {
                    context.nextToken();
                    describeSecretResult.setRotationEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RotationLambdaARN", targetDepth)) {
                    context.nextToken();
                    describeSecretResult.setRotationLambdaARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RotationRules", targetDepth)) {
                    context.nextToken();
                    describeSecretResult.setRotationRules(RotationRulesTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastRotatedDate", targetDepth)) {
                    context.nextToken();
                    describeSecretResult.setLastRotatedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastChangedDate", targetDepth)) {
                    context.nextToken();
                    describeSecretResult.setLastChangedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastAccessedDate", targetDepth)) {
                    context.nextToken();
                    describeSecretResult.setLastAccessedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DeletedDate", targetDepth)) {
                    context.nextToken();
                    describeSecretResult.setDeletedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    describeSecretResult.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("VersionIdsToStages", targetDepth)) {
                    context.nextToken();
                    describeSecretResult.setVersionIdsToStages(new MapUnmarshaller<String, java.util.List<String>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<String>(context.getUnmarshaller(String.class))).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeSecretResult;
    }

    private static DescribeSecretResultJsonUnmarshaller instance;

    public static DescribeSecretResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeSecretResultJsonUnmarshaller();
        return instance;
    }
}
