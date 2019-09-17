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
package com.amazonaws.services.pinpoint.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * NumberValidateResponse JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NumberValidateResponseJsonUnmarshaller implements Unmarshaller<NumberValidateResponse, JsonUnmarshallerContext> {

    public NumberValidateResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        NumberValidateResponse numberValidateResponse = new NumberValidateResponse();

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
                if (context.testExpression("Carrier", targetDepth)) {
                    context.nextToken();
                    numberValidateResponse.setCarrier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("City", targetDepth)) {
                    context.nextToken();
                    numberValidateResponse.setCity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CleansedPhoneNumberE164", targetDepth)) {
                    context.nextToken();
                    numberValidateResponse.setCleansedPhoneNumberE164(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CleansedPhoneNumberNational", targetDepth)) {
                    context.nextToken();
                    numberValidateResponse.setCleansedPhoneNumberNational(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Country", targetDepth)) {
                    context.nextToken();
                    numberValidateResponse.setCountry(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CountryCodeIso2", targetDepth)) {
                    context.nextToken();
                    numberValidateResponse.setCountryCodeIso2(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CountryCodeNumeric", targetDepth)) {
                    context.nextToken();
                    numberValidateResponse.setCountryCodeNumeric(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("County", targetDepth)) {
                    context.nextToken();
                    numberValidateResponse.setCounty(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OriginalCountryCodeIso2", targetDepth)) {
                    context.nextToken();
                    numberValidateResponse.setOriginalCountryCodeIso2(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OriginalPhoneNumber", targetDepth)) {
                    context.nextToken();
                    numberValidateResponse.setOriginalPhoneNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PhoneType", targetDepth)) {
                    context.nextToken();
                    numberValidateResponse.setPhoneType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PhoneTypeCode", targetDepth)) {
                    context.nextToken();
                    numberValidateResponse.setPhoneTypeCode(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Timezone", targetDepth)) {
                    context.nextToken();
                    numberValidateResponse.setTimezone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ZipCode", targetDepth)) {
                    context.nextToken();
                    numberValidateResponse.setZipCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return numberValidateResponse;
    }

    private static NumberValidateResponseJsonUnmarshaller instance;

    public static NumberValidateResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NumberValidateResponseJsonUnmarshaller();
        return instance;
    }
}
