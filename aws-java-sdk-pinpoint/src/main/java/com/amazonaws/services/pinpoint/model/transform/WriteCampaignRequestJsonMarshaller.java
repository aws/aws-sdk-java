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
 * WriteCampaignRequestMarshaller
 */
public class WriteCampaignRequestJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(WriteCampaignRequest writeCampaignRequest, StructuredJsonGenerator jsonGenerator) {

        if (writeCampaignRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            java.util.List<WriteTreatmentResource> additionalTreatmentsList = writeCampaignRequest.getAdditionalTreatments();
            if (additionalTreatmentsList != null) {
                jsonGenerator.writeFieldName("AdditionalTreatments");
                jsonGenerator.writeStartArray();
                for (WriteTreatmentResource additionalTreatmentsListValue : additionalTreatmentsList) {
                    if (additionalTreatmentsListValue != null) {

                        WriteTreatmentResourceJsonMarshaller.getInstance().marshall(additionalTreatmentsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (writeCampaignRequest.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(writeCampaignRequest.getDescription());
            }
            if (writeCampaignRequest.getHoldoutPercent() != null) {
                jsonGenerator.writeFieldName("HoldoutPercent").writeValue(writeCampaignRequest.getHoldoutPercent());
            }
            if (writeCampaignRequest.getIsPaused() != null) {
                jsonGenerator.writeFieldName("IsPaused").writeValue(writeCampaignRequest.getIsPaused());
            }
            if (writeCampaignRequest.getLimits() != null) {
                jsonGenerator.writeFieldName("Limits");
                CampaignLimitsJsonMarshaller.getInstance().marshall(writeCampaignRequest.getLimits(), jsonGenerator);
            }
            if (writeCampaignRequest.getMessageConfiguration() != null) {
                jsonGenerator.writeFieldName("MessageConfiguration");
                MessageConfigurationJsonMarshaller.getInstance().marshall(writeCampaignRequest.getMessageConfiguration(), jsonGenerator);
            }
            if (writeCampaignRequest.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(writeCampaignRequest.getName());
            }
            if (writeCampaignRequest.getSchedule() != null) {
                jsonGenerator.writeFieldName("Schedule");
                ScheduleJsonMarshaller.getInstance().marshall(writeCampaignRequest.getSchedule(), jsonGenerator);
            }
            if (writeCampaignRequest.getSegmentId() != null) {
                jsonGenerator.writeFieldName("SegmentId").writeValue(writeCampaignRequest.getSegmentId());
            }
            if (writeCampaignRequest.getSegmentVersion() != null) {
                jsonGenerator.writeFieldName("SegmentVersion").writeValue(writeCampaignRequest.getSegmentVersion());
            }
            if (writeCampaignRequest.getTreatmentDescription() != null) {
                jsonGenerator.writeFieldName("TreatmentDescription").writeValue(writeCampaignRequest.getTreatmentDescription());
            }
            if (writeCampaignRequest.getTreatmentName() != null) {
                jsonGenerator.writeFieldName("TreatmentName").writeValue(writeCampaignRequest.getTreatmentName());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static WriteCampaignRequestJsonMarshaller instance;

    public static WriteCampaignRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WriteCampaignRequestJsonMarshaller();
        return instance;
    }

}
