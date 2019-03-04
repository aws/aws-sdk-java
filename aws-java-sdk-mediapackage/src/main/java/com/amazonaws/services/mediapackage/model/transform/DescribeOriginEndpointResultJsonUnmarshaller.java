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
 * DescribeOriginEndpointResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeOriginEndpointResultJsonUnmarshaller implements Unmarshaller<DescribeOriginEndpointResult, JsonUnmarshallerContext> {

    public DescribeOriginEndpointResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeOriginEndpointResult describeOriginEndpointResult = new DescribeOriginEndpointResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeOriginEndpointResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    describeOriginEndpointResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("channelId", targetDepth)) {
                    context.nextToken();
                    describeOriginEndpointResult.setChannelId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("cmafPackage", targetDepth)) {
                    context.nextToken();
                    describeOriginEndpointResult.setCmafPackage(CmafPackageJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("dashPackage", targetDepth)) {
                    context.nextToken();
                    describeOriginEndpointResult.setDashPackage(DashPackageJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    describeOriginEndpointResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hlsPackage", targetDepth)) {
                    context.nextToken();
                    describeOriginEndpointResult.setHlsPackage(HlsPackageJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    describeOriginEndpointResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("manifestName", targetDepth)) {
                    context.nextToken();
                    describeOriginEndpointResult.setManifestName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("mssPackage", targetDepth)) {
                    context.nextToken();
                    describeOriginEndpointResult.setMssPackage(MssPackageJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("startoverWindowSeconds", targetDepth)) {
                    context.nextToken();
                    describeOriginEndpointResult.setStartoverWindowSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    describeOriginEndpointResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("timeDelaySeconds", targetDepth)) {
                    context.nextToken();
                    describeOriginEndpointResult.setTimeDelaySeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("url", targetDepth)) {
                    context.nextToken();
                    describeOriginEndpointResult.setUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("whitelist", targetDepth)) {
                    context.nextToken();
                    describeOriginEndpointResult.setWhitelist(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeOriginEndpointResult;
    }

    private static DescribeOriginEndpointResultJsonUnmarshaller instance;

    public static DescribeOriginEndpointResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeOriginEndpointResultJsonUnmarshaller();
        return instance;
    }
}
