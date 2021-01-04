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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsSecretsManagerSecretDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsSecretsManagerSecretDetailsJsonUnmarshaller implements Unmarshaller<AwsSecretsManagerSecretDetails, JsonUnmarshallerContext> {

    public AwsSecretsManagerSecretDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsSecretsManagerSecretDetails awsSecretsManagerSecretDetails = new AwsSecretsManagerSecretDetails();

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
                if (context.testExpression("RotationRules", targetDepth)) {
                    context.nextToken();
                    awsSecretsManagerSecretDetails.setRotationRules(AwsSecretsManagerSecretRotationRulesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RotationOccurredWithinFrequency", targetDepth)) {
                    context.nextToken();
                    awsSecretsManagerSecretDetails.setRotationOccurredWithinFrequency(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    context.nextToken();
                    awsSecretsManagerSecretDetails.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RotationEnabled", targetDepth)) {
                    context.nextToken();
                    awsSecretsManagerSecretDetails.setRotationEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RotationLambdaArn", targetDepth)) {
                    context.nextToken();
                    awsSecretsManagerSecretDetails.setRotationLambdaArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Deleted", targetDepth)) {
                    context.nextToken();
                    awsSecretsManagerSecretDetails.setDeleted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    awsSecretsManagerSecretDetails.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    awsSecretsManagerSecretDetails.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsSecretsManagerSecretDetails;
    }

    private static AwsSecretsManagerSecretDetailsJsonUnmarshaller instance;

    public static AwsSecretsManagerSecretDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsSecretsManagerSecretDetailsJsonUnmarshaller();
        return instance;
    }
}
