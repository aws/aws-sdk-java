/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chime.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.chime.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ProxySession JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProxySessionJsonUnmarshaller implements Unmarshaller<ProxySession, JsonUnmarshallerContext> {

    public ProxySession unmarshall(JsonUnmarshallerContext context) throws Exception {
        ProxySession proxySession = new ProxySession();

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
                if (context.testExpression("VoiceConnectorId", targetDepth)) {
                    context.nextToken();
                    proxySession.setVoiceConnectorId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProxySessionId", targetDepth)) {
                    context.nextToken();
                    proxySession.setProxySessionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    proxySession.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    proxySession.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExpiryMinutes", targetDepth)) {
                    context.nextToken();
                    proxySession.setExpiryMinutes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Capabilities", targetDepth)) {
                    context.nextToken();
                    proxySession.setCapabilities(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("CreatedTimestamp", targetDepth)) {
                    context.nextToken();
                    proxySession.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("UpdatedTimestamp", targetDepth)) {
                    context.nextToken();
                    proxySession.setUpdatedTimestamp(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("EndedTimestamp", targetDepth)) {
                    context.nextToken();
                    proxySession.setEndedTimestamp(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("Participants", targetDepth)) {
                    context.nextToken();
                    proxySession.setParticipants(new ListUnmarshaller<Participant>(ParticipantJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("NumberSelectionBehavior", targetDepth)) {
                    context.nextToken();
                    proxySession.setNumberSelectionBehavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GeoMatchLevel", targetDepth)) {
                    context.nextToken();
                    proxySession.setGeoMatchLevel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GeoMatchParams", targetDepth)) {
                    context.nextToken();
                    proxySession.setGeoMatchParams(GeoMatchParamsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return proxySession;
    }

    private static ProxySessionJsonUnmarshaller instance;

    public static ProxySessionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProxySessionJsonUnmarshaller();
        return instance;
    }
}
