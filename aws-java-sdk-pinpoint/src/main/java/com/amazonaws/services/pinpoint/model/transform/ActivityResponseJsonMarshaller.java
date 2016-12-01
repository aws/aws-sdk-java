/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ActivityResponseMarshaller
 */
public class ActivityResponseJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ActivityResponse activityResponse, StructuredJsonGenerator jsonGenerator) {

        if (activityResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (activityResponse.getApplicationId() != null) {
                jsonGenerator.writeFieldName("ApplicationId").writeValue(activityResponse.getApplicationId());
            }
            if (activityResponse.getCampaignId() != null) {
                jsonGenerator.writeFieldName("CampaignId").writeValue(activityResponse.getCampaignId());
            }
            if (activityResponse.getEnd() != null) {
                jsonGenerator.writeFieldName("End").writeValue(activityResponse.getEnd());
            }
            if (activityResponse.getId() != null) {
                jsonGenerator.writeFieldName("Id").writeValue(activityResponse.getId());
            }
            if (activityResponse.getResult() != null) {
                jsonGenerator.writeFieldName("Result").writeValue(activityResponse.getResult());
            }
            if (activityResponse.getScheduledStart() != null) {
                jsonGenerator.writeFieldName("ScheduledStart").writeValue(activityResponse.getScheduledStart());
            }
            if (activityResponse.getStart() != null) {
                jsonGenerator.writeFieldName("Start").writeValue(activityResponse.getStart());
            }
            if (activityResponse.getState() != null) {
                jsonGenerator.writeFieldName("State").writeValue(activityResponse.getState());
            }
            if (activityResponse.getSuccessfulEndpointCount() != null) {
                jsonGenerator.writeFieldName("SuccessfulEndpointCount").writeValue(activityResponse.getSuccessfulEndpointCount());
            }
            if (activityResponse.getTotalEndpointCount() != null) {
                jsonGenerator.writeFieldName("TotalEndpointCount").writeValue(activityResponse.getTotalEndpointCount());
            }
            if (activityResponse.getTreatmentId() != null) {
                jsonGenerator.writeFieldName("TreatmentId").writeValue(activityResponse.getTreatmentId());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ActivityResponseJsonMarshaller instance;

    public static ActivityResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ActivityResponseJsonMarshaller();
        return instance;
    }

}
