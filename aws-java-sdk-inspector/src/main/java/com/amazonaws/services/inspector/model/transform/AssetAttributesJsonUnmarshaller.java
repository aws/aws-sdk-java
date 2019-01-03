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
package com.amazonaws.services.inspector.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.inspector.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AssetAttributes JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetAttributesJsonUnmarshaller implements Unmarshaller<AssetAttributes, JsonUnmarshallerContext> {

    public AssetAttributes unmarshall(JsonUnmarshallerContext context) throws Exception {
        AssetAttributes assetAttributes = new AssetAttributes();

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
                if (context.testExpression("schemaVersion", targetDepth)) {
                    context.nextToken();
                    assetAttributes.setSchemaVersion(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("agentId", targetDepth)) {
                    context.nextToken();
                    assetAttributes.setAgentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("autoScalingGroup", targetDepth)) {
                    context.nextToken();
                    assetAttributes.setAutoScalingGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("amiId", targetDepth)) {
                    context.nextToken();
                    assetAttributes.setAmiId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hostname", targetDepth)) {
                    context.nextToken();
                    assetAttributes.setHostname(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ipv4Addresses", targetDepth)) {
                    context.nextToken();
                    assetAttributes.setIpv4Addresses(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    assetAttributes.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("networkInterfaces", targetDepth)) {
                    context.nextToken();
                    assetAttributes.setNetworkInterfaces(new ListUnmarshaller<NetworkInterface>(NetworkInterfaceJsonUnmarshaller.getInstance())
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

        return assetAttributes;
    }

    private static AssetAttributesJsonUnmarshaller instance;

    public static AssetAttributesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssetAttributesJsonUnmarshaller();
        return instance;
    }
}
