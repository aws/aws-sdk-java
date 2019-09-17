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
package com.amazonaws.services.medialive.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ReservationResourceSpecification JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservationResourceSpecificationJsonUnmarshaller implements Unmarshaller<ReservationResourceSpecification, JsonUnmarshallerContext> {

    public ReservationResourceSpecification unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReservationResourceSpecification reservationResourceSpecification = new ReservationResourceSpecification();

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
                if (context.testExpression("channelClass", targetDepth)) {
                    context.nextToken();
                    reservationResourceSpecification.setChannelClass(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("codec", targetDepth)) {
                    context.nextToken();
                    reservationResourceSpecification.setCodec(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("maximumBitrate", targetDepth)) {
                    context.nextToken();
                    reservationResourceSpecification.setMaximumBitrate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("maximumFramerate", targetDepth)) {
                    context.nextToken();
                    reservationResourceSpecification.setMaximumFramerate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resolution", targetDepth)) {
                    context.nextToken();
                    reservationResourceSpecification.setResolution(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceType", targetDepth)) {
                    context.nextToken();
                    reservationResourceSpecification.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("specialFeature", targetDepth)) {
                    context.nextToken();
                    reservationResourceSpecification.setSpecialFeature(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("videoQuality", targetDepth)) {
                    context.nextToken();
                    reservationResourceSpecification.setVideoQuality(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return reservationResourceSpecification;
    }

    private static ReservationResourceSpecificationJsonUnmarshaller instance;

    public static ReservationResourceSpecificationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReservationResourceSpecificationJsonUnmarshaller();
        return instance;
    }
}
