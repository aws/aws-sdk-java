/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ContactSearchSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContactSearchSummaryJsonUnmarshaller implements Unmarshaller<ContactSearchSummary, JsonUnmarshallerContext> {

    public ContactSearchSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        ContactSearchSummary contactSearchSummary = new ContactSearchSummary();

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
                    contactSearchSummary.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    contactSearchSummary.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InitialContactId", targetDepth)) {
                    context.nextToken();
                    contactSearchSummary.setInitialContactId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PreviousContactId", targetDepth)) {
                    context.nextToken();
                    contactSearchSummary.setPreviousContactId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InitiationMethod", targetDepth)) {
                    context.nextToken();
                    contactSearchSummary.setInitiationMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Channel", targetDepth)) {
                    context.nextToken();
                    contactSearchSummary.setChannel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QueueInfo", targetDepth)) {
                    context.nextToken();
                    contactSearchSummary.setQueueInfo(ContactSearchSummaryQueueInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AgentInfo", targetDepth)) {
                    context.nextToken();
                    contactSearchSummary.setAgentInfo(ContactSearchSummaryAgentInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InitiationTimestamp", targetDepth)) {
                    context.nextToken();
                    contactSearchSummary.setInitiationTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DisconnectTimestamp", targetDepth)) {
                    context.nextToken();
                    contactSearchSummary.setDisconnectTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ScheduledTimestamp", targetDepth)) {
                    context.nextToken();
                    contactSearchSummary.setScheduledTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return contactSearchSummary;
    }

    private static ContactSearchSummaryJsonUnmarshaller instance;

    public static ContactSearchSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ContactSearchSummaryJsonUnmarshaller();
        return instance;
    }
}
