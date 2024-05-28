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
package com.amazonaws.services.tnb.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.tnb.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ListSolFunctionPackageInfo JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSolFunctionPackageInfoJsonUnmarshaller implements Unmarshaller<ListSolFunctionPackageInfo, JsonUnmarshallerContext> {

    public ListSolFunctionPackageInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListSolFunctionPackageInfo listSolFunctionPackageInfo = new ListSolFunctionPackageInfo();

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
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    listSolFunctionPackageInfo.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    listSolFunctionPackageInfo.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("metadata", targetDepth)) {
                    context.nextToken();
                    listSolFunctionPackageInfo.setMetadata(ListSolFunctionPackageMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("onboardingState", targetDepth)) {
                    context.nextToken();
                    listSolFunctionPackageInfo.setOnboardingState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("operationalState", targetDepth)) {
                    context.nextToken();
                    listSolFunctionPackageInfo.setOperationalState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("usageState", targetDepth)) {
                    context.nextToken();
                    listSolFunctionPackageInfo.setUsageState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vnfProductName", targetDepth)) {
                    context.nextToken();
                    listSolFunctionPackageInfo.setVnfProductName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vnfProvider", targetDepth)) {
                    context.nextToken();
                    listSolFunctionPackageInfo.setVnfProvider(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vnfdId", targetDepth)) {
                    context.nextToken();
                    listSolFunctionPackageInfo.setVnfdId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vnfdVersion", targetDepth)) {
                    context.nextToken();
                    listSolFunctionPackageInfo.setVnfdVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return listSolFunctionPackageInfo;
    }

    private static ListSolFunctionPackageInfoJsonUnmarshaller instance;

    public static ListSolFunctionPackageInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListSolFunctionPackageInfoJsonUnmarshaller();
        return instance;
    }
}
