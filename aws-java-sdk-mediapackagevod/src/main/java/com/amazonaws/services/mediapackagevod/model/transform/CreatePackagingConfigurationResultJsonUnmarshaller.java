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
package com.amazonaws.services.mediapackagevod.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediapackagevod.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreatePackagingConfigurationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePackagingConfigurationResultJsonUnmarshaller implements Unmarshaller<CreatePackagingConfigurationResult, JsonUnmarshallerContext> {

    public CreatePackagingConfigurationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreatePackagingConfigurationResult createPackagingConfigurationResult = new CreatePackagingConfigurationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createPackagingConfigurationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    createPackagingConfigurationResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("cmafPackage", targetDepth)) {
                    context.nextToken();
                    createPackagingConfigurationResult.setCmafPackage(CmafPackageJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("dashPackage", targetDepth)) {
                    context.nextToken();
                    createPackagingConfigurationResult.setDashPackage(DashPackageJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("hlsPackage", targetDepth)) {
                    context.nextToken();
                    createPackagingConfigurationResult.setHlsPackage(HlsPackageJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    createPackagingConfigurationResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("mssPackage", targetDepth)) {
                    context.nextToken();
                    createPackagingConfigurationResult.setMssPackage(MssPackageJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("packagingGroupId", targetDepth)) {
                    context.nextToken();
                    createPackagingConfigurationResult.setPackagingGroupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createPackagingConfigurationResult;
    }

    private static CreatePackagingConfigurationResultJsonUnmarshaller instance;

    public static CreatePackagingConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreatePackagingConfigurationResultJsonUnmarshaller();
        return instance;
    }
}
