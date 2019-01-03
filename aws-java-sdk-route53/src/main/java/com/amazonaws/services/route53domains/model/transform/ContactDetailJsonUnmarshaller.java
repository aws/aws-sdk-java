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
package com.amazonaws.services.route53domains.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.route53domains.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ContactDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContactDetailJsonUnmarshaller implements Unmarshaller<ContactDetail, JsonUnmarshallerContext> {

    public ContactDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        ContactDetail contactDetail = new ContactDetail();

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
                if (context.testExpression("FirstName", targetDepth)) {
                    context.nextToken();
                    contactDetail.setFirstName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastName", targetDepth)) {
                    context.nextToken();
                    contactDetail.setLastName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ContactType", targetDepth)) {
                    context.nextToken();
                    contactDetail.setContactType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OrganizationName", targetDepth)) {
                    context.nextToken();
                    contactDetail.setOrganizationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AddressLine1", targetDepth)) {
                    context.nextToken();
                    contactDetail.setAddressLine1(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AddressLine2", targetDepth)) {
                    context.nextToken();
                    contactDetail.setAddressLine2(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("City", targetDepth)) {
                    context.nextToken();
                    contactDetail.setCity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    contactDetail.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CountryCode", targetDepth)) {
                    context.nextToken();
                    contactDetail.setCountryCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ZipCode", targetDepth)) {
                    context.nextToken();
                    contactDetail.setZipCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PhoneNumber", targetDepth)) {
                    context.nextToken();
                    contactDetail.setPhoneNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Email", targetDepth)) {
                    context.nextToken();
                    contactDetail.setEmail(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Fax", targetDepth)) {
                    context.nextToken();
                    contactDetail.setFax(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExtraParams", targetDepth)) {
                    context.nextToken();
                    contactDetail.setExtraParams(new ListUnmarshaller<ExtraParam>(ExtraParamJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return contactDetail;
    }

    private static ContactDetailJsonUnmarshaller instance;

    public static ContactDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ContactDetailJsonUnmarshaller();
        return instance;
    }
}
