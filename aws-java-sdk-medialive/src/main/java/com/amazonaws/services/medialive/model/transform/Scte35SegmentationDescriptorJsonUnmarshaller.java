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
 * Scte35SegmentationDescriptor JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Scte35SegmentationDescriptorJsonUnmarshaller implements Unmarshaller<Scte35SegmentationDescriptor, JsonUnmarshallerContext> {

    public Scte35SegmentationDescriptor unmarshall(JsonUnmarshallerContext context) throws Exception {
        Scte35SegmentationDescriptor scte35SegmentationDescriptor = new Scte35SegmentationDescriptor();

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
                if (context.testExpression("deliveryRestrictions", targetDepth)) {
                    context.nextToken();
                    scte35SegmentationDescriptor.setDeliveryRestrictions(Scte35DeliveryRestrictionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("segmentNum", targetDepth)) {
                    context.nextToken();
                    scte35SegmentationDescriptor.setSegmentNum(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("segmentationCancelIndicator", targetDepth)) {
                    context.nextToken();
                    scte35SegmentationDescriptor.setSegmentationCancelIndicator(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("segmentationDuration", targetDepth)) {
                    context.nextToken();
                    scte35SegmentationDescriptor.setSegmentationDuration(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("segmentationEventId", targetDepth)) {
                    context.nextToken();
                    scte35SegmentationDescriptor.setSegmentationEventId(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("segmentationTypeId", targetDepth)) {
                    context.nextToken();
                    scte35SegmentationDescriptor.setSegmentationTypeId(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("segmentationUpid", targetDepth)) {
                    context.nextToken();
                    scte35SegmentationDescriptor.setSegmentationUpid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("segmentationUpidType", targetDepth)) {
                    context.nextToken();
                    scte35SegmentationDescriptor.setSegmentationUpidType(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("segmentsExpected", targetDepth)) {
                    context.nextToken();
                    scte35SegmentationDescriptor.setSegmentsExpected(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("subSegmentNum", targetDepth)) {
                    context.nextToken();
                    scte35SegmentationDescriptor.setSubSegmentNum(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("subSegmentsExpected", targetDepth)) {
                    context.nextToken();
                    scte35SegmentationDescriptor.setSubSegmentsExpected(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return scte35SegmentationDescriptor;
    }

    private static Scte35SegmentationDescriptorJsonUnmarshaller instance;

    public static Scte35SegmentationDescriptorJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Scte35SegmentationDescriptorJsonUnmarshaller();
        return instance;
    }
}
