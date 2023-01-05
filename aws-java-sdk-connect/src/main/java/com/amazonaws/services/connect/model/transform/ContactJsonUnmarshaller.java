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
package com.amazonaws.services.connect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Contact JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContactJsonUnmarshaller implements Unmarshaller<Contact, JsonUnmarshallerContext> {

    public Contact unmarshall(JsonUnmarshallerContext context) throws Exception {
        Contact contact = new Contact();

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
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    contact.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    contact.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InitialContactId", targetDepth)) {
                    context.nextToken();
                    contact.setInitialContactId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PreviousContactId", targetDepth)) {
                    context.nextToken();
                    contact.setPreviousContactId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InitiationMethod", targetDepth)) {
                    context.nextToken();
                    contact.setInitiationMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    contact.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    contact.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Channel", targetDepth)) {
                    context.nextToken();
                    contact.setChannel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QueueInfo", targetDepth)) {
                    context.nextToken();
                    contact.setQueueInfo(QueueInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AgentInfo", targetDepth)) {
                    context.nextToken();
                    contact.setAgentInfo(AgentInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InitiationTimestamp", targetDepth)) {
                    context.nextToken();
                    contact.setInitiationTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DisconnectTimestamp", targetDepth)) {
                    context.nextToken();
                    contact.setDisconnectTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdateTimestamp", targetDepth)) {
                    context.nextToken();
                    contact.setLastUpdateTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ScheduledTimestamp", targetDepth)) {
                    context.nextToken();
                    contact.setScheduledTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return contact;
    }

    private static ContactJsonUnmarshaller instance;

    public static ContactJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ContactJsonUnmarshaller();
        return instance;
    }
}
