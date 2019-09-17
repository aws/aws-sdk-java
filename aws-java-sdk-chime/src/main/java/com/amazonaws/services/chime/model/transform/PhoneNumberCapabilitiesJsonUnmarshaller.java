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
package com.amazonaws.services.chime.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.chime.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PhoneNumberCapabilities JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PhoneNumberCapabilitiesJsonUnmarshaller implements Unmarshaller<PhoneNumberCapabilities, JsonUnmarshallerContext> {

    public PhoneNumberCapabilities unmarshall(JsonUnmarshallerContext context) throws Exception {
        PhoneNumberCapabilities phoneNumberCapabilities = new PhoneNumberCapabilities();

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
                if (context.testExpression("InboundCall", targetDepth)) {
                    context.nextToken();
                    phoneNumberCapabilities.setInboundCall(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("OutboundCall", targetDepth)) {
                    context.nextToken();
                    phoneNumberCapabilities.setOutboundCall(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("InboundSMS", targetDepth)) {
                    context.nextToken();
                    phoneNumberCapabilities.setInboundSMS(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("OutboundSMS", targetDepth)) {
                    context.nextToken();
                    phoneNumberCapabilities.setOutboundSMS(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("InboundMMS", targetDepth)) {
                    context.nextToken();
                    phoneNumberCapabilities.setInboundMMS(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("OutboundMMS", targetDepth)) {
                    context.nextToken();
                    phoneNumberCapabilities.setOutboundMMS(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return phoneNumberCapabilities;
    }

    private static PhoneNumberCapabilitiesJsonUnmarshaller instance;

    public static PhoneNumberCapabilitiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PhoneNumberCapabilitiesJsonUnmarshaller();
        return instance;
    }
}
