/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * AwsLambdaFunctionDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsLambdaFunctionDetailsJsonUnmarshaller implements Unmarshaller<AwsLambdaFunctionDetails, JsonUnmarshallerContext> {

    public AwsLambdaFunctionDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsLambdaFunctionDetails awsLambdaFunctionDetails = new AwsLambdaFunctionDetails();

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
                if (context.testExpression("Code", targetDepth)) {
                    context.nextToken();
                    awsLambdaFunctionDetails.setCode(AwsLambdaFunctionCodeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CodeSha256", targetDepth)) {
                    context.nextToken();
                    awsLambdaFunctionDetails.setCodeSha256(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeadLetterConfig", targetDepth)) {
                    context.nextToken();
                    awsLambdaFunctionDetails.setDeadLetterConfig(AwsLambdaFunctionDeadLetterConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Environment", targetDepth)) {
                    context.nextToken();
                    awsLambdaFunctionDetails.setEnvironment(AwsLambdaFunctionEnvironmentJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FunctionName", targetDepth)) {
                    context.nextToken();
                    awsLambdaFunctionDetails.setFunctionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Handler", targetDepth)) {
                    context.nextToken();
                    awsLambdaFunctionDetails.setHandler(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyArn", targetDepth)) {
                    context.nextToken();
                    awsLambdaFunctionDetails.setKmsKeyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastModified", targetDepth)) {
                    context.nextToken();
                    awsLambdaFunctionDetails.setLastModified(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Layers", targetDepth)) {
                    context.nextToken();
                    awsLambdaFunctionDetails.setLayers(new ListUnmarshaller<AwsLambdaFunctionLayer>(AwsLambdaFunctionLayerJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("MasterArn", targetDepth)) {
                    context.nextToken();
                    awsLambdaFunctionDetails.setMasterArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MemorySize", targetDepth)) {
                    context.nextToken();
                    awsLambdaFunctionDetails.setMemorySize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("RevisionId", targetDepth)) {
                    context.nextToken();
                    awsLambdaFunctionDetails.setRevisionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Role", targetDepth)) {
                    context.nextToken();
                    awsLambdaFunctionDetails.setRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Runtime", targetDepth)) {
                    context.nextToken();
                    awsLambdaFunctionDetails.setRuntime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Timeout", targetDepth)) {
                    context.nextToken();
                    awsLambdaFunctionDetails.setTimeout(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TracingConfig", targetDepth)) {
                    context.nextToken();
                    awsLambdaFunctionDetails.setTracingConfig(AwsLambdaFunctionTracingConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VpcConfig", targetDepth)) {
                    context.nextToken();
                    awsLambdaFunctionDetails.setVpcConfig(AwsLambdaFunctionVpcConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Version", targetDepth)) {
                    context.nextToken();
                    awsLambdaFunctionDetails.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsLambdaFunctionDetails;
    }

    private static AwsLambdaFunctionDetailsJsonUnmarshaller instance;

    public static AwsLambdaFunctionDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsLambdaFunctionDetailsJsonUnmarshaller();
        return instance;
    }
}
