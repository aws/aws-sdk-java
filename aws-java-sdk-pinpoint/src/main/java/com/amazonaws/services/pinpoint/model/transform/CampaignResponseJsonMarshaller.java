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
 * CampaignResponseMarshaller
 */
public class CampaignResponseJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(CampaignResponse campaignResponse, StructuredJsonGenerator jsonGenerator) {

        if (campaignResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            java.util.List<TreatmentResource> additionalTreatmentsList = campaignResponse.getAdditionalTreatments();
            if (additionalTreatmentsList != null) {
                jsonGenerator.writeFieldName("AdditionalTreatments");
                jsonGenerator.writeStartArray();
                for (TreatmentResource additionalTreatmentsListValue : additionalTreatmentsList) {
                    if (additionalTreatmentsListValue != null) {

                        TreatmentResourceJsonMarshaller.getInstance().marshall(additionalTreatmentsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (campaignResponse.getApplicationId() != null) {
                jsonGenerator.writeFieldName("ApplicationId").writeValue(campaignResponse.getApplicationId());
            }
            if (campaignResponse.getCreationDate() != null) {
                jsonGenerator.writeFieldName("CreationDate").writeValue(campaignResponse.getCreationDate());
            }
            if (campaignResponse.getDefaultState() != null) {
                jsonGenerator.writeFieldName("DefaultState");
                CampaignStateJsonMarshaller.getInstance().marshall(campaignResponse.getDefaultState(), jsonGenerator);
            }
            if (campaignResponse.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(campaignResponse.getDescription());
            }
            if (campaignResponse.getHoldoutPercent() != null) {
                jsonGenerator.writeFieldName("HoldoutPercent").writeValue(campaignResponse.getHoldoutPercent());
            }
            if (campaignResponse.getId() != null) {
                jsonGenerator.writeFieldName("Id").writeValue(campaignResponse.getId());
            }
            if (campaignResponse.getIsPaused() != null) {
                jsonGenerator.writeFieldName("IsPaused").writeValue(campaignResponse.getIsPaused());
            }
            if (campaignResponse.getLastModifiedDate() != null) {
                jsonGenerator.writeFieldName("LastModifiedDate").writeValue(campaignResponse.getLastModifiedDate());
            }
            if (campaignResponse.getLimits() != null) {
                jsonGenerator.writeFieldName("Limits");
                CampaignLimitsJsonMarshaller.getInstance().marshall(campaignResponse.getLimits(), jsonGenerator);
            }
            if (campaignResponse.getMessageConfiguration() != null) {
                jsonGenerator.writeFieldName("MessageConfiguration");
                MessageConfigurationJsonMarshaller.getInstance().marshall(campaignResponse.getMessageConfiguration(), jsonGenerator);
            }
            if (campaignResponse.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(campaignResponse.getName());
            }
            if (campaignResponse.getSchedule() != null) {
                jsonGenerator.writeFieldName("Schedule");
                ScheduleJsonMarshaller.getInstance().marshall(campaignResponse.getSchedule(), jsonGenerator);
            }
            if (campaignResponse.getSegmentId() != null) {
                jsonGenerator.writeFieldName("SegmentId").writeValue(campaignResponse.getSegmentId());
            }
            if (campaignResponse.getSegmentVersion() != null) {
                jsonGenerator.writeFieldName("SegmentVersion").writeValue(campaignResponse.getSegmentVersion());
            }
            if (campaignResponse.getState() != null) {
                jsonGenerator.writeFieldName("State");
                CampaignStateJsonMarshaller.getInstance().marshall(campaignResponse.getState(), jsonGenerator);
            }
            if (campaignResponse.getTreatmentDescription() != null) {
                jsonGenerator.writeFieldName("TreatmentDescription").writeValue(campaignResponse.getTreatmentDescription());
            }
            if (campaignResponse.getTreatmentName() != null) {
                jsonGenerator.writeFieldName("TreatmentName").writeValue(campaignResponse.getTreatmentName());
            }
            if (campaignResponse.getVersion() != null) {
                jsonGenerator.writeFieldName("Version").writeValue(campaignResponse.getVersion());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static CampaignResponseJsonMarshaller instance;

    public static CampaignResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CampaignResponseJsonMarshaller();
        return instance;
    }

}
