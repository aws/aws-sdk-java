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
package com.amazonaws.services.snowball.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.snowball.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Address JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddressJsonUnmarshaller implements Unmarshaller<Address, JsonUnmarshallerContext> {

    public Address unmarshall(JsonUnmarshallerContext context) throws Exception {
        Address address = new Address();

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
                if (context.testExpression("AddressId", targetDepth)) {
                    context.nextToken();
                    address.setAddressId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    address.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Company", targetDepth)) {
                    context.nextToken();
                    address.setCompany(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Street1", targetDepth)) {
                    context.nextToken();
                    address.setStreet1(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Street2", targetDepth)) {
                    context.nextToken();
                    address.setStreet2(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Street3", targetDepth)) {
                    context.nextToken();
                    address.setStreet3(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("City", targetDepth)) {
                    context.nextToken();
                    address.setCity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StateOrProvince", targetDepth)) {
                    context.nextToken();
                    address.setStateOrProvince(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PrefectureOrDistrict", targetDepth)) {
                    context.nextToken();
                    address.setPrefectureOrDistrict(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Landmark", targetDepth)) {
                    context.nextToken();
                    address.setLandmark(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Country", targetDepth)) {
                    context.nextToken();
                    address.setCountry(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PostalCode", targetDepth)) {
                    context.nextToken();
                    address.setPostalCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PhoneNumber", targetDepth)) {
                    context.nextToken();
                    address.setPhoneNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IsRestricted", targetDepth)) {
                    context.nextToken();
                    address.setIsRestricted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return address;
    }

    private static AddressJsonUnmarshaller instance;

    public static AddressJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AddressJsonUnmarshaller();
        return instance;
    }
}
