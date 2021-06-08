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
package com.amazonaws.services.appintegrations.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.appintegrations.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EventIntegrationAssociation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventIntegrationAssociationJsonUnmarshaller implements Unmarshaller<EventIntegrationAssociation, JsonUnmarshallerContext> {

    public EventIntegrationAssociation unmarshall(JsonUnmarshallerContext context) throws Exception {
        EventIntegrationAssociation eventIntegrationAssociation = new EventIntegrationAssociation();

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
                if (context.testExpression("EventIntegrationAssociationArn", targetDepth)) {
                    context.nextToken();
                    eventIntegrationAssociation.setEventIntegrationAssociationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EventIntegrationAssociationId", targetDepth)) {
                    context.nextToken();
                    eventIntegrationAssociation.setEventIntegrationAssociationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EventIntegrationName", targetDepth)) {
                    context.nextToken();
                    eventIntegrationAssociation.setEventIntegrationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClientId", targetDepth)) {
                    context.nextToken();
                    eventIntegrationAssociation.setClientId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EventBridgeRuleName", targetDepth)) {
                    context.nextToken();
                    eventIntegrationAssociation.setEventBridgeRuleName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClientAssociationMetadata", targetDepth)) {
                    context.nextToken();
                    eventIntegrationAssociation.setClientAssociationMetadata(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return eventIntegrationAssociation;
    }

    private static EventIntegrationAssociationJsonUnmarshaller instance;

    public static EventIntegrationAssociationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EventIntegrationAssociationJsonUnmarshaller();
        return instance;
    }
}
