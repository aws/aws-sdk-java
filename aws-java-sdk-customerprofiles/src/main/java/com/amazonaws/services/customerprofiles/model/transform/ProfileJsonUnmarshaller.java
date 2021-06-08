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
package com.amazonaws.services.customerprofiles.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.customerprofiles.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Profile JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProfileJsonUnmarshaller implements Unmarshaller<Profile, JsonUnmarshallerContext> {

    public Profile unmarshall(JsonUnmarshallerContext context) throws Exception {
        Profile profile = new Profile();

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
                if (context.testExpression("ProfileId", targetDepth)) {
                    context.nextToken();
                    profile.setProfileId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AccountNumber", targetDepth)) {
                    context.nextToken();
                    profile.setAccountNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AdditionalInformation", targetDepth)) {
                    context.nextToken();
                    profile.setAdditionalInformation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PartyType", targetDepth)) {
                    context.nextToken();
                    profile.setPartyType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BusinessName", targetDepth)) {
                    context.nextToken();
                    profile.setBusinessName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FirstName", targetDepth)) {
                    context.nextToken();
                    profile.setFirstName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MiddleName", targetDepth)) {
                    context.nextToken();
                    profile.setMiddleName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastName", targetDepth)) {
                    context.nextToken();
                    profile.setLastName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BirthDate", targetDepth)) {
                    context.nextToken();
                    profile.setBirthDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Gender", targetDepth)) {
                    context.nextToken();
                    profile.setGender(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PhoneNumber", targetDepth)) {
                    context.nextToken();
                    profile.setPhoneNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MobilePhoneNumber", targetDepth)) {
                    context.nextToken();
                    profile.setMobilePhoneNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HomePhoneNumber", targetDepth)) {
                    context.nextToken();
                    profile.setHomePhoneNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BusinessPhoneNumber", targetDepth)) {
                    context.nextToken();
                    profile.setBusinessPhoneNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EmailAddress", targetDepth)) {
                    context.nextToken();
                    profile.setEmailAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PersonalEmailAddress", targetDepth)) {
                    context.nextToken();
                    profile.setPersonalEmailAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BusinessEmailAddress", targetDepth)) {
                    context.nextToken();
                    profile.setBusinessEmailAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Address", targetDepth)) {
                    context.nextToken();
                    profile.setAddress(AddressJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ShippingAddress", targetDepth)) {
                    context.nextToken();
                    profile.setShippingAddress(AddressJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MailingAddress", targetDepth)) {
                    context.nextToken();
                    profile.setMailingAddress(AddressJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("BillingAddress", targetDepth)) {
                    context.nextToken();
                    profile.setBillingAddress(AddressJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Attributes", targetDepth)) {
                    context.nextToken();
                    profile.setAttributes(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return profile;
    }

    private static ProfileJsonUnmarshaller instance;

    public static ProfileJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProfileJsonUnmarshaller();
        return instance;
    }
}
