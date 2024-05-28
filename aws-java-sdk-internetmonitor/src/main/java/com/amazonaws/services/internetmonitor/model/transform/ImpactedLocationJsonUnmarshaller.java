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
package com.amazonaws.services.internetmonitor.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.internetmonitor.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ImpactedLocation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImpactedLocationJsonUnmarshaller implements Unmarshaller<ImpactedLocation, JsonUnmarshallerContext> {

    public ImpactedLocation unmarshall(JsonUnmarshallerContext context) throws Exception {
        ImpactedLocation impactedLocation = new ImpactedLocation();

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
                if (context.testExpression("ASName", targetDepth)) {
                    context.nextToken();
                    impactedLocation.setASName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ASNumber", targetDepth)) {
                    context.nextToken();
                    impactedLocation.setASNumber(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Country", targetDepth)) {
                    context.nextToken();
                    impactedLocation.setCountry(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Subdivision", targetDepth)) {
                    context.nextToken();
                    impactedLocation.setSubdivision(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Metro", targetDepth)) {
                    context.nextToken();
                    impactedLocation.setMetro(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("City", targetDepth)) {
                    context.nextToken();
                    impactedLocation.setCity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Latitude", targetDepth)) {
                    context.nextToken();
                    impactedLocation.setLatitude(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("Longitude", targetDepth)) {
                    context.nextToken();
                    impactedLocation.setLongitude(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("CountryCode", targetDepth)) {
                    context.nextToken();
                    impactedLocation.setCountryCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubdivisionCode", targetDepth)) {
                    context.nextToken();
                    impactedLocation.setSubdivisionCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceLocation", targetDepth)) {
                    context.nextToken();
                    impactedLocation.setServiceLocation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    impactedLocation.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CausedBy", targetDepth)) {
                    context.nextToken();
                    impactedLocation.setCausedBy(NetworkImpairmentJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InternetHealth", targetDepth)) {
                    context.nextToken();
                    impactedLocation.setInternetHealth(InternetHealthJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Ipv4Prefixes", targetDepth)) {
                    context.nextToken();
                    impactedLocation.setIpv4Prefixes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return impactedLocation;
    }

    private static ImpactedLocationJsonUnmarshaller instance;

    public static ImpactedLocationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImpactedLocationJsonUnmarshaller();
        return instance;
    }
}
