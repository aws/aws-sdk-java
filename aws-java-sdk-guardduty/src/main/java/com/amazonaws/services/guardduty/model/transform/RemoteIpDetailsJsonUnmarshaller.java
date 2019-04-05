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
package com.amazonaws.services.guardduty.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RemoteIpDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoteIpDetailsJsonUnmarshaller implements Unmarshaller<RemoteIpDetails, JsonUnmarshallerContext> {

    public RemoteIpDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        RemoteIpDetails remoteIpDetails = new RemoteIpDetails();

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
                if (context.testExpression("city", targetDepth)) {
                    context.nextToken();
                    remoteIpDetails.setCity(CityJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("country", targetDepth)) {
                    context.nextToken();
                    remoteIpDetails.setCountry(CountryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("geoLocation", targetDepth)) {
                    context.nextToken();
                    remoteIpDetails.setGeoLocation(GeoLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ipAddressV4", targetDepth)) {
                    context.nextToken();
                    remoteIpDetails.setIpAddressV4(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("organization", targetDepth)) {
                    context.nextToken();
                    remoteIpDetails.setOrganization(OrganizationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return remoteIpDetails;
    }

    private static RemoteIpDetailsJsonUnmarshaller instance;

    public static RemoteIpDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RemoteIpDetailsJsonUnmarshaller();
        return instance;
    }
}
