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
package com.amazonaws.services.pinpoint.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PushNotificationTemplateRequest JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PushNotificationTemplateRequestJsonUnmarshaller implements Unmarshaller<PushNotificationTemplateRequest, JsonUnmarshallerContext> {

    public PushNotificationTemplateRequest unmarshall(JsonUnmarshallerContext context) throws Exception {
        PushNotificationTemplateRequest pushNotificationTemplateRequest = new PushNotificationTemplateRequest();

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
                if (context.testExpression("ADM", targetDepth)) {
                    context.nextToken();
                    pushNotificationTemplateRequest.setADM(AndroidPushNotificationTemplateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("APNS", targetDepth)) {
                    context.nextToken();
                    pushNotificationTemplateRequest.setAPNS(APNSPushNotificationTemplateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Baidu", targetDepth)) {
                    context.nextToken();
                    pushNotificationTemplateRequest.setBaidu(AndroidPushNotificationTemplateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Default", targetDepth)) {
                    context.nextToken();
                    pushNotificationTemplateRequest.setDefault(DefaultPushNotificationTemplateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DefaultSubstitutions", targetDepth)) {
                    context.nextToken();
                    pushNotificationTemplateRequest.setDefaultSubstitutions(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GCM", targetDepth)) {
                    context.nextToken();
                    pushNotificationTemplateRequest.setGCM(AndroidPushNotificationTemplateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RecommenderId", targetDepth)) {
                    context.nextToken();
                    pushNotificationTemplateRequest.setRecommenderId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    pushNotificationTemplateRequest.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("TemplateDescription", targetDepth)) {
                    context.nextToken();
                    pushNotificationTemplateRequest.setTemplateDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return pushNotificationTemplateRequest;
    }

    private static PushNotificationTemplateRequestJsonUnmarshaller instance;

    public static PushNotificationTemplateRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PushNotificationTemplateRequestJsonUnmarshaller();
        return instance;
    }
}
