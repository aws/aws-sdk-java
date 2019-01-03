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
package com.amazonaws.services.cognitoidp.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cognitoidp.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * NotifyConfigurationType JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotifyConfigurationTypeJsonUnmarshaller implements Unmarshaller<NotifyConfigurationType, JsonUnmarshallerContext> {

    public NotifyConfigurationType unmarshall(JsonUnmarshallerContext context) throws Exception {
        NotifyConfigurationType notifyConfigurationType = new NotifyConfigurationType();

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
                if (context.testExpression("From", targetDepth)) {
                    context.nextToken();
                    notifyConfigurationType.setFrom(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplyTo", targetDepth)) {
                    context.nextToken();
                    notifyConfigurationType.setReplyTo(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceArn", targetDepth)) {
                    context.nextToken();
                    notifyConfigurationType.setSourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BlockEmail", targetDepth)) {
                    context.nextToken();
                    notifyConfigurationType.setBlockEmail(NotifyEmailTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NoActionEmail", targetDepth)) {
                    context.nextToken();
                    notifyConfigurationType.setNoActionEmail(NotifyEmailTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MfaEmail", targetDepth)) {
                    context.nextToken();
                    notifyConfigurationType.setMfaEmail(NotifyEmailTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return notifyConfigurationType;
    }

    private static NotifyConfigurationTypeJsonUnmarshaller instance;

    public static NotifyConfigurationTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NotifyConfigurationTypeJsonUnmarshaller();
        return instance;
    }
}
