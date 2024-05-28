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
 * ContactDataRequest JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContactDataRequestJsonUnmarshaller implements Unmarshaller<ContactDataRequest, JsonUnmarshallerContext> {

    public ContactDataRequest unmarshall(JsonUnmarshallerContext context) throws Exception {
        ContactDataRequest contactDataRequest = new ContactDataRequest();

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
                if (context.testExpression("SystemEndpoint", targetDepth)) {
                    context.nextToken();
                    contactDataRequest.setSystemEndpoint(EndpointJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CustomerEndpoint", targetDepth)) {
                    context.nextToken();
                    contactDataRequest.setCustomerEndpoint(EndpointJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RequestIdentifier", targetDepth)) {
                    context.nextToken();
                    contactDataRequest.setRequestIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QueueId", targetDepth)) {
                    context.nextToken();
                    contactDataRequest.setQueueId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Attributes", targetDepth)) {
                    context.nextToken();
                    contactDataRequest.setAttributes(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("Campaign", targetDepth)) {
                    context.nextToken();
                    contactDataRequest.setCampaign(CampaignJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return contactDataRequest;
    }

    private static ContactDataRequestJsonUnmarshaller instance;

    public static ContactDataRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ContactDataRequestJsonUnmarshaller();
        return instance;
    }
}
