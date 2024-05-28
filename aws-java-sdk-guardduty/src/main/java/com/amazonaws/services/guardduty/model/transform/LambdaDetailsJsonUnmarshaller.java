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
package com.amazonaws.services.guardduty.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * LambdaDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaDetailsJsonUnmarshaller implements Unmarshaller<LambdaDetails, JsonUnmarshallerContext> {

    public LambdaDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        LambdaDetails lambdaDetails = new LambdaDetails();

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
                if (context.testExpression("functionArn", targetDepth)) {
                    context.nextToken();
                    lambdaDetails.setFunctionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("functionName", targetDepth)) {
                    context.nextToken();
                    lambdaDetails.setFunctionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    lambdaDetails.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastModifiedAt", targetDepth)) {
                    context.nextToken();
                    lambdaDetails.setLastModifiedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("revisionId", targetDepth)) {
                    context.nextToken();
                    lambdaDetails.setRevisionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("functionVersion", targetDepth)) {
                    context.nextToken();
                    lambdaDetails.setFunctionVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("role", targetDepth)) {
                    context.nextToken();
                    lambdaDetails.setRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vpcConfig", targetDepth)) {
                    context.nextToken();
                    lambdaDetails.setVpcConfig(VpcConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    lambdaDetails.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

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

        return lambdaDetails;
    }

    private static LambdaDetailsJsonUnmarshaller instance;

    public static LambdaDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LambdaDetailsJsonUnmarshaller();
        return instance;
    }
}
