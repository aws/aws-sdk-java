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
package com.amazonaws.services.snowball.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.snowball.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * JobMetadataMarshaller
 */
public class JobMetadataJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(JobMetadata jobMetadata, StructuredJsonGenerator jsonGenerator) {

        if (jobMetadata == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (jobMetadata.getJobId() != null) {
                jsonGenerator.writeFieldName("JobId").writeValue(jobMetadata.getJobId());
            }
            if (jobMetadata.getJobState() != null) {
                jsonGenerator.writeFieldName("JobState").writeValue(jobMetadata.getJobState());
            }
            if (jobMetadata.getJobType() != null) {
                jsonGenerator.writeFieldName("JobType").writeValue(jobMetadata.getJobType());
            }
            if (jobMetadata.getSnowballType() != null) {
                jsonGenerator.writeFieldName("SnowballType").writeValue(jobMetadata.getSnowballType());
            }
            if (jobMetadata.getCreationDate() != null) {
                jsonGenerator.writeFieldName("CreationDate").writeValue(jobMetadata.getCreationDate());
            }
            if (jobMetadata.getResources() != null) {
                jsonGenerator.writeFieldName("Resources");
                JobResourceJsonMarshaller.getInstance().marshall(jobMetadata.getResources(), jsonGenerator);
            }
            if (jobMetadata.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(jobMetadata.getDescription());
            }
            if (jobMetadata.getKmsKeyARN() != null) {
                jsonGenerator.writeFieldName("KmsKeyARN").writeValue(jobMetadata.getKmsKeyARN());
            }
            if (jobMetadata.getRoleARN() != null) {
                jsonGenerator.writeFieldName("RoleARN").writeValue(jobMetadata.getRoleARN());
            }
            if (jobMetadata.getAddressId() != null) {
                jsonGenerator.writeFieldName("AddressId").writeValue(jobMetadata.getAddressId());
            }
            if (jobMetadata.getShippingDetails() != null) {
                jsonGenerator.writeFieldName("ShippingDetails");
                ShippingDetailsJsonMarshaller.getInstance().marshall(jobMetadata.getShippingDetails(), jsonGenerator);
            }
            if (jobMetadata.getSnowballCapacityPreference() != null) {
                jsonGenerator.writeFieldName("SnowballCapacityPreference").writeValue(jobMetadata.getSnowballCapacityPreference());
            }
            if (jobMetadata.getNotification() != null) {
                jsonGenerator.writeFieldName("Notification");
                NotificationJsonMarshaller.getInstance().marshall(jobMetadata.getNotification(), jsonGenerator);
            }
            if (jobMetadata.getDataTransferProgress() != null) {
                jsonGenerator.writeFieldName("DataTransferProgress");
                DataTransferJsonMarshaller.getInstance().marshall(jobMetadata.getDataTransferProgress(), jsonGenerator);
            }
            if (jobMetadata.getJobLogInfo() != null) {
                jsonGenerator.writeFieldName("JobLogInfo");
                JobLogsJsonMarshaller.getInstance().marshall(jobMetadata.getJobLogInfo(), jsonGenerator);
            }
            if (jobMetadata.getClusterId() != null) {
                jsonGenerator.writeFieldName("ClusterId").writeValue(jobMetadata.getClusterId());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static JobMetadataJsonMarshaller instance;

    public static JobMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobMetadataJsonMarshaller();
        return instance;
    }

}
