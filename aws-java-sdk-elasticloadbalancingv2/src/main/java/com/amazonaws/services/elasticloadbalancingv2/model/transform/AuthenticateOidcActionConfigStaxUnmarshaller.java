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
 * AuthenticateOidcActionConfig StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthenticateOidcActionConfigStaxUnmarshaller implements Unmarshaller<AuthenticateOidcActionConfig, StaxUnmarshallerContext> {

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

    public AuthenticateOidcActionConfig unmarshall(StaxUnmarshallerContext context) throws Exception {
        AuthenticateOidcActionConfig authenticateOidcActionConfig = new AuthenticateOidcActionConfig();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return authenticateOidcActionConfig;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Issuer", targetDepth)) {
                    authenticateOidcActionConfig.setIssuer(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AuthorizationEndpoint", targetDepth)) {
                    authenticateOidcActionConfig.setAuthorizationEndpoint(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TokenEndpoint", targetDepth)) {
                    authenticateOidcActionConfig.setTokenEndpoint(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("UserInfoEndpoint", targetDepth)) {
                    authenticateOidcActionConfig.setUserInfoEndpoint(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ClientId", targetDepth)) {
                    authenticateOidcActionConfig.setClientId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ClientSecret", targetDepth)) {
                    authenticateOidcActionConfig.setClientSecret(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SessionCookieName", targetDepth)) {
                    authenticateOidcActionConfig.setSessionCookieName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Scope", targetDepth)) {
                    authenticateOidcActionConfig.setScope(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SessionTimeout", targetDepth)) {
                    authenticateOidcActionConfig.setSessionTimeout(LongStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AuthenticationRequestExtraParams/entry", targetDepth)) {
                    Entry<String, String> entry = AuthenticationRequestExtraParamsMapEntryUnmarshaller.getInstance().unmarshall(context);
                    authenticateOidcActionConfig.addAuthenticationRequestExtraParamsEntry(entry.getKey(), entry.getValue());
                    continue;
                }

                if (context.testExpression("OnUnauthenticatedRequest", targetDepth)) {
                    authenticateOidcActionConfig.setOnUnauthenticatedRequest(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("UseExistingClientSecret", targetDepth)) {
                    authenticateOidcActionConfig.setUseExistingClientSecret(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return authenticateOidcActionConfig;
                }
            }
        }
    }

    private static AuthenticateOidcActionConfigStaxUnmarshaller instance;

    public static AuthenticateOidcActionConfigStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new AuthenticateOidcActionConfigStaxUnmarshaller();
        return instance;
    }
}
