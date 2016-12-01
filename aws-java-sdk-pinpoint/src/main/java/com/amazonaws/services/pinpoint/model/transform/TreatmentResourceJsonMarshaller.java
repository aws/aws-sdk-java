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
 * TreatmentResourceMarshaller
 */
public class TreatmentResourceJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(TreatmentResource treatmentResource, StructuredJsonGenerator jsonGenerator) {

        if (treatmentResource == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (treatmentResource.getId() != null) {
                jsonGenerator.writeFieldName("Id").writeValue(treatmentResource.getId());
            }
            if (treatmentResource.getMessageConfiguration() != null) {
                jsonGenerator.writeFieldName("MessageConfiguration");
                MessageConfigurationJsonMarshaller.getInstance().marshall(treatmentResource.getMessageConfiguration(), jsonGenerator);
            }
            if (treatmentResource.getSchedule() != null) {
                jsonGenerator.writeFieldName("Schedule");
                ScheduleJsonMarshaller.getInstance().marshall(treatmentResource.getSchedule(), jsonGenerator);
            }
            if (treatmentResource.getSizePercent() != null) {
                jsonGenerator.writeFieldName("SizePercent").writeValue(treatmentResource.getSizePercent());
            }
            if (treatmentResource.getState() != null) {
                jsonGenerator.writeFieldName("State");
                CampaignStateJsonMarshaller.getInstance().marshall(treatmentResource.getState(), jsonGenerator);
            }
            if (treatmentResource.getTreatmentDescription() != null) {
                jsonGenerator.writeFieldName("TreatmentDescription").writeValue(treatmentResource.getTreatmentDescription());
            }
            if (treatmentResource.getTreatmentName() != null) {
                jsonGenerator.writeFieldName("TreatmentName").writeValue(treatmentResource.getTreatmentName());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static TreatmentResourceJsonMarshaller instance;

    public static TreatmentResourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TreatmentResourceJsonMarshaller();
        return instance;
    }

}
