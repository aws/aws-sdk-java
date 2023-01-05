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
package com.amazonaws.services.guardduty.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * KubernetesApiCallAction JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KubernetesApiCallActionJsonUnmarshaller implements Unmarshaller<KubernetesApiCallAction, JsonUnmarshallerContext> {

    public KubernetesApiCallAction unmarshall(JsonUnmarshallerContext context) throws Exception {
        KubernetesApiCallAction kubernetesApiCallAction = new KubernetesApiCallAction();

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
                if (context.testExpression("requestUri", targetDepth)) {
                    context.nextToken();
                    kubernetesApiCallAction.setRequestUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("verb", targetDepth)) {
                    context.nextToken();
                    kubernetesApiCallAction.setVerb(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceIps", targetDepth)) {
                    context.nextToken();
                    kubernetesApiCallAction.setSourceIps(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("userAgent", targetDepth)) {
                    context.nextToken();
                    kubernetesApiCallAction.setUserAgent(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("remoteIpDetails", targetDepth)) {
                    context.nextToken();
                    kubernetesApiCallAction.setRemoteIpDetails(RemoteIpDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("statusCode", targetDepth)) {
                    context.nextToken();
                    kubernetesApiCallAction.setStatusCode(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("parameters", targetDepth)) {
                    context.nextToken();
                    kubernetesApiCallAction.setParameters(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return kubernetesApiCallAction;
    }

    private static KubernetesApiCallActionJsonUnmarshaller instance;

    public static KubernetesApiCallActionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new KubernetesApiCallActionJsonUnmarshaller();
        return instance;
    }
}
