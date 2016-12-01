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

import static com.amazonaws.util.StringUtils.UTF8;
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.SdkHttpUtils;
import com.amazonaws.protocol.json.*;

/**
 * UpdateCampaignRequest Marshaller
 */
public class UpdateCampaignRequestMarshaller implements Marshaller<Request<UpdateCampaignRequest>, UpdateCampaignRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public UpdateCampaignRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UpdateCampaignRequest> marshall(UpdateCampaignRequest updateCampaignRequest) {

        if (updateCampaignRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateCampaignRequest> request = new DefaultRequest<UpdateCampaignRequest>(updateCampaignRequest, "AmazonPinpoint");

        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/v1/apps/{application-id}/campaigns/{campaign-id}";

        uriResourcePath = uriResourcePath.replace(
                "{application-id}",
                (updateCampaignRequest.getApplicationId() != null) ? SdkHttpUtils.urlEncode(StringUtils.fromString(updateCampaignRequest.getApplicationId()),
                        false) : "");
        uriResourcePath = uriResourcePath.replace("{campaign-id}",
                (updateCampaignRequest.getCampaignId() != null) ? SdkHttpUtils.urlEncode(StringUtils.fromString(updateCampaignRequest.getCampaignId()), false)
                        : "");
        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            WriteCampaignRequest writeCampaignRequest = updateCampaignRequest.getWriteCampaignRequest();
            if (writeCampaignRequest != null) {
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
            }

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", protocolFactory.getContentType());
            }
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
