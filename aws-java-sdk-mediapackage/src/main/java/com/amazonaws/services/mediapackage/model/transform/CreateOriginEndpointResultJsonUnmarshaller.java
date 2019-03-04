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
 * CreateOriginEndpointResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateOriginEndpointResultJsonUnmarshaller implements Unmarshaller<CreateOriginEndpointResult, JsonUnmarshallerContext> {

    public CreateOriginEndpointResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateOriginEndpointResult createOriginEndpointResult = new CreateOriginEndpointResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createOriginEndpointResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    createOriginEndpointResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("channelId", targetDepth)) {
                    context.nextToken();
                    createOriginEndpointResult.setChannelId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("cmafPackage", targetDepth)) {
                    context.nextToken();
                    createOriginEndpointResult.setCmafPackage(CmafPackageJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("dashPackage", targetDepth)) {
                    context.nextToken();
                    createOriginEndpointResult.setDashPackage(DashPackageJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    createOriginEndpointResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hlsPackage", targetDepth)) {
                    context.nextToken();
                    createOriginEndpointResult.setHlsPackage(HlsPackageJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    createOriginEndpointResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("manifestName", targetDepth)) {
                    context.nextToken();
                    createOriginEndpointResult.setManifestName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("mssPackage", targetDepth)) {
                    context.nextToken();
                    createOriginEndpointResult.setMssPackage(MssPackageJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("startoverWindowSeconds", targetDepth)) {
                    context.nextToken();
                    createOriginEndpointResult.setStartoverWindowSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    createOriginEndpointResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("timeDelaySeconds", targetDepth)) {
                    context.nextToken();
                    createOriginEndpointResult.setTimeDelaySeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("url", targetDepth)) {
                    context.nextToken();
                    createOriginEndpointResult.setUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("whitelist", targetDepth)) {
                    context.nextToken();
                    createOriginEndpointResult.setWhitelist(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createOriginEndpointResult;
    }

    private static CreateOriginEndpointResultJsonUnmarshaller instance;

    public static CreateOriginEndpointResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateOriginEndpointResultJsonUnmarshaller();
        return instance;
    }
}
