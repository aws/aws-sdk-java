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
package com.amazonaws.services.quicksight.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AssetBundleImportJobVPCConnectionOverrideParameters JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetBundleImportJobVPCConnectionOverrideParametersJsonUnmarshaller implements
        Unmarshaller<AssetBundleImportJobVPCConnectionOverrideParameters, JsonUnmarshallerContext> {

    public AssetBundleImportJobVPCConnectionOverrideParameters unmarshall(JsonUnmarshallerContext context) throws Exception {
        AssetBundleImportJobVPCConnectionOverrideParameters assetBundleImportJobVPCConnectionOverrideParameters = new AssetBundleImportJobVPCConnectionOverrideParameters();

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
                if (context.testExpression("VPCConnectionId", targetDepth)) {
                    context.nextToken();
                    assetBundleImportJobVPCConnectionOverrideParameters.setVPCConnectionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    assetBundleImportJobVPCConnectionOverrideParameters.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubnetIds", targetDepth)) {
                    context.nextToken();
                    assetBundleImportJobVPCConnectionOverrideParameters.setSubnetIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("SecurityGroupIds", targetDepth)) {
                    context.nextToken();
                    assetBundleImportJobVPCConnectionOverrideParameters.setSecurityGroupIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("DnsResolvers", targetDepth)) {
                    context.nextToken();
                    assetBundleImportJobVPCConnectionOverrideParameters.setDnsResolvers(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    assetBundleImportJobVPCConnectionOverrideParameters.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return assetBundleImportJobVPCConnectionOverrideParameters;
    }

    private static AssetBundleImportJobVPCConnectionOverrideParametersJsonUnmarshaller instance;

    public static AssetBundleImportJobVPCConnectionOverrideParametersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssetBundleImportJobVPCConnectionOverrideParametersJsonUnmarshaller();
        return instance;
    }
}
