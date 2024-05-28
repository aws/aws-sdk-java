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
package com.amazonaws.services.snowball.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.snowball.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PickupDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PickupDetailsJsonUnmarshaller implements Unmarshaller<PickupDetails, JsonUnmarshallerContext> {

    public PickupDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        PickupDetails pickupDetails = new PickupDetails();

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
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    pickupDetails.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PhoneNumber", targetDepth)) {
                    context.nextToken();
                    pickupDetails.setPhoneNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Email", targetDepth)) {
                    context.nextToken();
                    pickupDetails.setEmail(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IdentificationNumber", targetDepth)) {
                    context.nextToken();
                    pickupDetails.setIdentificationNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IdentificationExpirationDate", targetDepth)) {
                    context.nextToken();
                    pickupDetails.setIdentificationExpirationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("IdentificationIssuingOrg", targetDepth)) {
                    context.nextToken();
                    pickupDetails.setIdentificationIssuingOrg(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DevicePickupId", targetDepth)) {
                    context.nextToken();
                    pickupDetails.setDevicePickupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return pickupDetails;
    }

    private static PickupDetailsJsonUnmarshaller instance;

    public static PickupDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PickupDetailsJsonUnmarshaller();
        return instance;
    }
}
