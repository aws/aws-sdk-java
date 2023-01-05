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
package com.amazonaws.services.pinpointsmsvoicev2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pinpointsmsvoicev2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ReleasePhoneNumberResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReleasePhoneNumberResultJsonUnmarshaller implements Unmarshaller<ReleasePhoneNumberResult, JsonUnmarshallerContext> {

    public ReleasePhoneNumberResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReleasePhoneNumberResult releasePhoneNumberResult = new ReleasePhoneNumberResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return releasePhoneNumberResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("PhoneNumberArn", targetDepth)) {
                    context.nextToken();
                    releasePhoneNumberResult.setPhoneNumberArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PhoneNumberId", targetDepth)) {
                    context.nextToken();
                    releasePhoneNumberResult.setPhoneNumberId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PhoneNumber", targetDepth)) {
                    context.nextToken();
                    releasePhoneNumberResult.setPhoneNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    releasePhoneNumberResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IsoCountryCode", targetDepth)) {
                    context.nextToken();
                    releasePhoneNumberResult.setIsoCountryCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MessageType", targetDepth)) {
                    context.nextToken();
                    releasePhoneNumberResult.setMessageType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NumberCapabilities", targetDepth)) {
                    context.nextToken();
                    releasePhoneNumberResult.setNumberCapabilities(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("NumberType", targetDepth)) {
                    context.nextToken();
                    releasePhoneNumberResult.setNumberType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MonthlyLeasingPrice", targetDepth)) {
                    context.nextToken();
                    releasePhoneNumberResult.setMonthlyLeasingPrice(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TwoWayEnabled", targetDepth)) {
                    context.nextToken();
                    releasePhoneNumberResult.setTwoWayEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("TwoWayChannelArn", targetDepth)) {
                    context.nextToken();
                    releasePhoneNumberResult.setTwoWayChannelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SelfManagedOptOutsEnabled", targetDepth)) {
                    context.nextToken();
                    releasePhoneNumberResult.setSelfManagedOptOutsEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("OptOutListName", targetDepth)) {
                    context.nextToken();
                    releasePhoneNumberResult.setOptOutListName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTimestamp", targetDepth)) {
                    context.nextToken();
                    releasePhoneNumberResult.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return releasePhoneNumberResult;
    }

    private static ReleasePhoneNumberResultJsonUnmarshaller instance;

    public static ReleasePhoneNumberResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReleasePhoneNumberResultJsonUnmarshaller();
        return instance;
    }
}
