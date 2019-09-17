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
package com.amazonaws.services.pinpoint.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * APNSVoipSandboxChannelRequest JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class APNSVoipSandboxChannelRequestJsonUnmarshaller implements Unmarshaller<APNSVoipSandboxChannelRequest, JsonUnmarshallerContext> {

    public APNSVoipSandboxChannelRequest unmarshall(JsonUnmarshallerContext context) throws Exception {
        APNSVoipSandboxChannelRequest aPNSVoipSandboxChannelRequest = new APNSVoipSandboxChannelRequest();

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
                if (context.testExpression("BundleId", targetDepth)) {
                    context.nextToken();
                    aPNSVoipSandboxChannelRequest.setBundleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Certificate", targetDepth)) {
                    context.nextToken();
                    aPNSVoipSandboxChannelRequest.setCertificate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DefaultAuthenticationMethod", targetDepth)) {
                    context.nextToken();
                    aPNSVoipSandboxChannelRequest.setDefaultAuthenticationMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Enabled", targetDepth)) {
                    context.nextToken();
                    aPNSVoipSandboxChannelRequest.setEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("PrivateKey", targetDepth)) {
                    context.nextToken();
                    aPNSVoipSandboxChannelRequest.setPrivateKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TeamId", targetDepth)) {
                    context.nextToken();
                    aPNSVoipSandboxChannelRequest.setTeamId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TokenKey", targetDepth)) {
                    context.nextToken();
                    aPNSVoipSandboxChannelRequest.setTokenKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TokenKeyId", targetDepth)) {
                    context.nextToken();
                    aPNSVoipSandboxChannelRequest.setTokenKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return aPNSVoipSandboxChannelRequest;
    }

    private static APNSVoipSandboxChannelRequestJsonUnmarshaller instance;

    public static APNSVoipSandboxChannelRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new APNSVoipSandboxChannelRequestJsonUnmarshaller();
        return instance;
    }
}
