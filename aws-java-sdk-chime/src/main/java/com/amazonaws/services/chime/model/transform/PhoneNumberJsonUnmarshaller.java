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
 * PhoneNumber JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PhoneNumberJsonUnmarshaller implements Unmarshaller<PhoneNumber, JsonUnmarshallerContext> {

    public PhoneNumber unmarshall(JsonUnmarshallerContext context) throws Exception {
        PhoneNumber phoneNumber = new PhoneNumber();

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
                if (context.testExpression("PhoneNumberId", targetDepth)) {
                    context.nextToken();
                    phoneNumber.setPhoneNumberId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("E164PhoneNumber", targetDepth)) {
                    context.nextToken();
                    phoneNumber.setE164PhoneNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProductType", targetDepth)) {
                    context.nextToken();
                    phoneNumber.setProductType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    phoneNumber.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Capabilities", targetDepth)) {
                    context.nextToken();
                    phoneNumber.setCapabilities(PhoneNumberCapabilitiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Associations", targetDepth)) {
                    context.nextToken();
                    phoneNumber.setAssociations(new ListUnmarshaller<PhoneNumberAssociation>(PhoneNumberAssociationJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("CreatedTimestamp", targetDepth)) {
                    context.nextToken();
                    phoneNumber.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("UpdatedTimestamp", targetDepth)) {
                    context.nextToken();
                    phoneNumber.setUpdatedTimestamp(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("DeletionTimestamp", targetDepth)) {
                    context.nextToken();
                    phoneNumber.setDeletionTimestamp(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return phoneNumber;
    }

    private static PhoneNumberJsonUnmarshaller instance;

    public static PhoneNumberJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PhoneNumberJsonUnmarshaller();
        return instance;
    }
}
