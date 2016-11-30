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
 * ClusterMetadataMarshaller
 */
public class ClusterMetadataJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ClusterMetadata clusterMetadata, StructuredJsonGenerator jsonGenerator) {

        if (clusterMetadata == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (clusterMetadata.getClusterId() != null) {
                jsonGenerator.writeFieldName("ClusterId").writeValue(clusterMetadata.getClusterId());
            }
            if (clusterMetadata.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(clusterMetadata.getDescription());
            }
            if (clusterMetadata.getKmsKeyARN() != null) {
                jsonGenerator.writeFieldName("KmsKeyARN").writeValue(clusterMetadata.getKmsKeyARN());
            }
            if (clusterMetadata.getRoleARN() != null) {
                jsonGenerator.writeFieldName("RoleARN").writeValue(clusterMetadata.getRoleARN());
            }
            if (clusterMetadata.getClusterState() != null) {
                jsonGenerator.writeFieldName("ClusterState").writeValue(clusterMetadata.getClusterState());
            }
            if (clusterMetadata.getJobType() != null) {
                jsonGenerator.writeFieldName("JobType").writeValue(clusterMetadata.getJobType());
            }
            if (clusterMetadata.getSnowballType() != null) {
                jsonGenerator.writeFieldName("SnowballType").writeValue(clusterMetadata.getSnowballType());
            }
            if (clusterMetadata.getCreationDate() != null) {
                jsonGenerator.writeFieldName("CreationDate").writeValue(clusterMetadata.getCreationDate());
            }
            if (clusterMetadata.getResources() != null) {
                jsonGenerator.writeFieldName("Resources");
                JobResourceJsonMarshaller.getInstance().marshall(clusterMetadata.getResources(), jsonGenerator);
            }
            if (clusterMetadata.getAddressId() != null) {
                jsonGenerator.writeFieldName("AddressId").writeValue(clusterMetadata.getAddressId());
            }
            if (clusterMetadata.getShippingOption() != null) {
                jsonGenerator.writeFieldName("ShippingOption").writeValue(clusterMetadata.getShippingOption());
            }
            if (clusterMetadata.getNotification() != null) {
                jsonGenerator.writeFieldName("Notification");
                NotificationJsonMarshaller.getInstance().marshall(clusterMetadata.getNotification(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ClusterMetadataJsonMarshaller instance;

    public static ClusterMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ClusterMetadataJsonMarshaller();
        return instance;
    }

}
