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
package com.amazonaws.services.elasticloadbalancingv2.model.transform;

import java.util.Map;

import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticloadbalancingv2.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * AuthenticateCognitoActionConfig StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthenticateCognitoActionConfigStaxUnmarshaller implements Unmarshaller<AuthenticateCognitoActionConfig, StaxUnmarshallerContext> {

    private static class AuthenticationRequestExtraParamsMapEntryUnmarshaller implements Unmarshaller<Map.Entry<String, String>, StaxUnmarshallerContext> {

        @Override
        public Entry<String, String> unmarshall(StaxUnmarshallerContext context) throws Exception {
            int originalDepth = context.getCurrentDepth();
            int targetDepth = originalDepth + 1;

            MapEntry<String, String> entry = new MapEntry<String, String>();

            while (true) {
                XMLEvent xmlEvent = context.nextEvent();
                if (xmlEvent.isEndDocument())
                    return entry;

                if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                    if (context.testExpression("key", targetDepth)) {
                        entry.setKey(StringStaxUnmarshaller.getInstance().unmarshall(context));
                        continue;
                    }
                    if (context.testExpression("value", targetDepth)) {
                        entry.setValue(StringStaxUnmarshaller.getInstance().unmarshall(context));
                        continue;
                    }
                } else if (xmlEvent.isEndElement()) {
                    if (context.getCurrentDepth() < originalDepth)
                        return entry;
                }
            }
        }

        private static AuthenticationRequestExtraParamsMapEntryUnmarshaller instance;

        public static AuthenticationRequestExtraParamsMapEntryUnmarshaller getInstance() {
            if (instance == null)
                instance = new AuthenticationRequestExtraParamsMapEntryUnmarshaller();
            return instance;
        }

    }

    public AuthenticateCognitoActionConfig unmarshall(StaxUnmarshallerContext context) throws Exception {
        AuthenticateCognitoActionConfig authenticateCognitoActionConfig = new AuthenticateCognitoActionConfig();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return authenticateCognitoActionConfig;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("UserPoolArn", targetDepth)) {
                    authenticateCognitoActionConfig.setUserPoolArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("UserPoolClientId", targetDepth)) {
                    authenticateCognitoActionConfig.setUserPoolClientId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("UserPoolDomain", targetDepth)) {
                    authenticateCognitoActionConfig.setUserPoolDomain(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SessionCookieName", targetDepth)) {
                    authenticateCognitoActionConfig.setSessionCookieName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Scope", targetDepth)) {
                    authenticateCognitoActionConfig.setScope(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SessionTimeout", targetDepth)) {
                    authenticateCognitoActionConfig.setSessionTimeout(LongStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AuthenticationRequestExtraParams/entry", targetDepth)) {
                    Entry<String, String> entry = AuthenticationRequestExtraParamsMapEntryUnmarshaller.getInstance().unmarshall(context);
                    authenticateCognitoActionConfig.addAuthenticationRequestExtraParamsEntry(entry.getKey(), entry.getValue());
                    continue;
                }

                if (context.testExpression("OnUnauthenticatedRequest", targetDepth)) {
                    authenticateCognitoActionConfig.setOnUnauthenticatedRequest(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return authenticateCognitoActionConfig;
                }
            }
        }
    }

    private static AuthenticateCognitoActionConfigStaxUnmarshaller instance;

    public static AuthenticateCognitoActionConfigStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new AuthenticateCognitoActionConfigStaxUnmarshaller();
        return instance;
    }
}
