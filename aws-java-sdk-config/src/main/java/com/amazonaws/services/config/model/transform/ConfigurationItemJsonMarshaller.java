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
package com.amazonaws.services.config.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.config.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ConfigurationItemMarshaller
 */
public class ConfigurationItemJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ConfigurationItem configurationItem, StructuredJsonGenerator jsonGenerator) {

        if (configurationItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (configurationItem.getVersion() != null) {
                jsonGenerator.writeFieldName("version").writeValue(configurationItem.getVersion());
            }
            if (configurationItem.getAccountId() != null) {
                jsonGenerator.writeFieldName("accountId").writeValue(configurationItem.getAccountId());
            }
            if (configurationItem.getConfigurationItemCaptureTime() != null) {
                jsonGenerator.writeFieldName("configurationItemCaptureTime").writeValue(configurationItem.getConfigurationItemCaptureTime());
            }
            if (configurationItem.getConfigurationItemStatus() != null) {
                jsonGenerator.writeFieldName("configurationItemStatus").writeValue(configurationItem.getConfigurationItemStatus());
            }
            if (configurationItem.getConfigurationStateId() != null) {
                jsonGenerator.writeFieldName("configurationStateId").writeValue(configurationItem.getConfigurationStateId());
            }
            if (configurationItem.getConfigurationItemMD5Hash() != null) {
                jsonGenerator.writeFieldName("configurationItemMD5Hash").writeValue(configurationItem.getConfigurationItemMD5Hash());
            }
            if (configurationItem.getArn() != null) {
                jsonGenerator.writeFieldName("arn").writeValue(configurationItem.getArn());
            }
            if (configurationItem.getResourceType() != null) {
                jsonGenerator.writeFieldName("resourceType").writeValue(configurationItem.getResourceType());
            }
            if (configurationItem.getResourceId() != null) {
                jsonGenerator.writeFieldName("resourceId").writeValue(configurationItem.getResourceId());
            }
            if (configurationItem.getResourceName() != null) {
                jsonGenerator.writeFieldName("resourceName").writeValue(configurationItem.getResourceName());
            }
            if (configurationItem.getAwsRegion() != null) {
                jsonGenerator.writeFieldName("awsRegion").writeValue(configurationItem.getAwsRegion());
            }
            if (configurationItem.getAvailabilityZone() != null) {
                jsonGenerator.writeFieldName("availabilityZone").writeValue(configurationItem.getAvailabilityZone());
            }
            if (configurationItem.getResourceCreationTime() != null) {
                jsonGenerator.writeFieldName("resourceCreationTime").writeValue(configurationItem.getResourceCreationTime());
            }

            java.util.Map<String, String> tagsMap = configurationItem.getTags();
            if (tagsMap != null) {
                jsonGenerator.writeFieldName("tags");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> tagsMapValue : tagsMap.entrySet()) {
                    if (tagsMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(tagsMapValue.getKey());

                        jsonGenerator.writeValue(tagsMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            com.amazonaws.internal.SdkInternalList<String> relatedEventsList = (com.amazonaws.internal.SdkInternalList<String>) configurationItem
                    .getRelatedEvents();
            if (!relatedEventsList.isEmpty() || !relatedEventsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("relatedEvents");
                jsonGenerator.writeStartArray();
                for (String relatedEventsListValue : relatedEventsList) {
                    if (relatedEventsListValue != null) {
                        jsonGenerator.writeValue(relatedEventsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<Relationship> relationshipsList = (com.amazonaws.internal.SdkInternalList<Relationship>) configurationItem
                    .getRelationships();
            if (!relationshipsList.isEmpty() || !relationshipsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("relationships");
                jsonGenerator.writeStartArray();
                for (Relationship relationshipsListValue : relationshipsList) {
                    if (relationshipsListValue != null) {

                        RelationshipJsonMarshaller.getInstance().marshall(relationshipsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (configurationItem.getConfiguration() != null) {
                jsonGenerator.writeFieldName("configuration").writeValue(configurationItem.getConfiguration());
            }

            java.util.Map<String, String> supplementaryConfigurationMap = configurationItem.getSupplementaryConfiguration();
            if (supplementaryConfigurationMap != null) {
                jsonGenerator.writeFieldName("supplementaryConfiguration");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> supplementaryConfigurationMapValue : supplementaryConfigurationMap.entrySet()) {
                    if (supplementaryConfigurationMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(supplementaryConfigurationMapValue.getKey());

                        jsonGenerator.writeValue(supplementaryConfigurationMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ConfigurationItemJsonMarshaller instance;

    public static ConfigurationItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConfigurationItemJsonMarshaller();
        return instance;
    }

}
