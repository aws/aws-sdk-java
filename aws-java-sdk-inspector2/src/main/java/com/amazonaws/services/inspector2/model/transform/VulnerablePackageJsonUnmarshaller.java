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
package com.amazonaws.services.inspector2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.inspector2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * VulnerablePackage JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VulnerablePackageJsonUnmarshaller implements Unmarshaller<VulnerablePackage, JsonUnmarshallerContext> {

    public VulnerablePackage unmarshall(JsonUnmarshallerContext context) throws Exception {
        VulnerablePackage vulnerablePackage = new VulnerablePackage();

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
                if (context.testExpression("arch", targetDepth)) {
                    context.nextToken();
                    vulnerablePackage.setArch(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("epoch", targetDepth)) {
                    context.nextToken();
                    vulnerablePackage.setEpoch(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("filePath", targetDepth)) {
                    context.nextToken();
                    vulnerablePackage.setFilePath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fixedInVersion", targetDepth)) {
                    context.nextToken();
                    vulnerablePackage.setFixedInVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    vulnerablePackage.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("packageManager", targetDepth)) {
                    context.nextToken();
                    vulnerablePackage.setPackageManager(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("release", targetDepth)) {
                    context.nextToken();
                    vulnerablePackage.setRelease(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("remediation", targetDepth)) {
                    context.nextToken();
                    vulnerablePackage.setRemediation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceLambdaLayerArn", targetDepth)) {
                    context.nextToken();
                    vulnerablePackage.setSourceLambdaLayerArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceLayerHash", targetDepth)) {
                    context.nextToken();
                    vulnerablePackage.setSourceLayerHash(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    context.nextToken();
                    vulnerablePackage.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return vulnerablePackage;
    }

    private static VulnerablePackageJsonUnmarshaller instance;

    public static VulnerablePackageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VulnerablePackageJsonUnmarshaller();
        return instance;
    }
}
