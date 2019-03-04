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
package com.amazonaws.services.mediapackage.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediapackage.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateOriginEndpointResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateOriginEndpointResultJsonUnmarshaller implements Unmarshaller<UpdateOriginEndpointResult, JsonUnmarshallerContext> {

    public UpdateOriginEndpointResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateOriginEndpointResult updateOriginEndpointResult = new UpdateOriginEndpointResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateOriginEndpointResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    updateOriginEndpointResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("channelId", targetDepth)) {
                    context.nextToken();
                    updateOriginEndpointResult.setChannelId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("cmafPackage", targetDepth)) {
                    context.nextToken();
                    updateOriginEndpointResult.setCmafPackage(CmafPackageJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("dashPackage", targetDepth)) {
                    context.nextToken();
                    updateOriginEndpointResult.setDashPackage(DashPackageJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    updateOriginEndpointResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hlsPackage", targetDepth)) {
                    context.nextToken();
                    updateOriginEndpointResult.setHlsPackage(HlsPackageJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    updateOriginEndpointResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("manifestName", targetDepth)) {
                    context.nextToken();
                    updateOriginEndpointResult.setManifestName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("mssPackage", targetDepth)) {
                    context.nextToken();
                    updateOriginEndpointResult.setMssPackage(MssPackageJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("startoverWindowSeconds", targetDepth)) {
                    context.nextToken();
                    updateOriginEndpointResult.setStartoverWindowSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    updateOriginEndpointResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("timeDelaySeconds", targetDepth)) {
                    context.nextToken();
                    updateOriginEndpointResult.setTimeDelaySeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("url", targetDepth)) {
                    context.nextToken();
                    updateOriginEndpointResult.setUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("whitelist", targetDepth)) {
                    context.nextToken();
                    updateOriginEndpointResult.setWhitelist(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateOriginEndpointResult;
    }

    private static UpdateOriginEndpointResultJsonUnmarshaller instance;

    public static UpdateOriginEndpointResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateOriginEndpointResultJsonUnmarshaller();
        return instance;
    }
}
