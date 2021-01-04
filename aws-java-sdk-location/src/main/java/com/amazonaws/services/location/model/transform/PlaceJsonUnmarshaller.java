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
package com.amazonaws.services.location.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.location.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Place JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PlaceJsonUnmarshaller implements Unmarshaller<Place, JsonUnmarshallerContext> {

    public Place unmarshall(JsonUnmarshallerContext context) throws Exception {
        Place place = new Place();

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
                if (context.testExpression("AddressNumber", targetDepth)) {
                    context.nextToken();
                    place.setAddressNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Country", targetDepth)) {
                    context.nextToken();
                    place.setCountry(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Geometry", targetDepth)) {
                    context.nextToken();
                    place.setGeometry(PlaceGeometryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Label", targetDepth)) {
                    context.nextToken();
                    place.setLabel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Municipality", targetDepth)) {
                    context.nextToken();
                    place.setMunicipality(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Neighborhood", targetDepth)) {
                    context.nextToken();
                    place.setNeighborhood(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PostalCode", targetDepth)) {
                    context.nextToken();
                    place.setPostalCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Region", targetDepth)) {
                    context.nextToken();
                    place.setRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Street", targetDepth)) {
                    context.nextToken();
                    place.setStreet(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubRegion", targetDepth)) {
                    context.nextToken();
                    place.setSubRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return place;
    }

    private static PlaceJsonUnmarshaller instance;

    public static PlaceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PlaceJsonUnmarshaller();
        return instance;
    }
}
