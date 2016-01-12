/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.config.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.config.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * ConfigurationItemMarshaller
 */
public class ConfigurationItemJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(ConfigurationItem configurationItem,
            JSONWriter jsonWriter) {
        if (configurationItem == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (configurationItem.getVersion() != null) {
                jsonWriter.key("version").value(configurationItem.getVersion());
            }

            if (configurationItem.getAccountId() != null) {
                jsonWriter.key("accountId").value(
                        configurationItem.getAccountId());
            }

            if (configurationItem.getConfigurationItemCaptureTime() != null) {
                jsonWriter.key("configurationItemCaptureTime").value(
                        configurationItem.getConfigurationItemCaptureTime());
            }

            if (configurationItem.getConfigurationItemStatus() != null) {
                jsonWriter.key("configurationItemStatus").value(
                        configurationItem.getConfigurationItemStatus());
            }

            if (configurationItem.getConfigurationStateId() != null) {
                jsonWriter.key("configurationStateId").value(
                        configurationItem.getConfigurationStateId());
            }

            if (configurationItem.getConfigurationItemMD5Hash() != null) {
                jsonWriter.key("configurationItemMD5Hash").value(
                        configurationItem.getConfigurationItemMD5Hash());
            }

            if (configurationItem.getArn() != null) {
                jsonWriter.key("arn").value(configurationItem.getArn());
            }

            if (configurationItem.getResourceType() != null) {
                jsonWriter.key("resourceType").value(
                        configurationItem.getResourceType());
            }

            if (configurationItem.getResourceId() != null) {
                jsonWriter.key("resourceId").value(
                        configurationItem.getResourceId());
            }

            if (configurationItem.getResourceName() != null) {
                jsonWriter.key("resourceName").value(
                        configurationItem.getResourceName());
            }

            if (configurationItem.getAwsRegion() != null) {
                jsonWriter.key("awsRegion").value(
                        configurationItem.getAwsRegion());
            }

            if (configurationItem.getAvailabilityZone() != null) {
                jsonWriter.key("availabilityZone").value(
                        configurationItem.getAvailabilityZone());
            }

            if (configurationItem.getResourceCreationTime() != null) {
                jsonWriter.key("resourceCreationTime").value(
                        configurationItem.getResourceCreationTime());
            }

            java.util.Map<String, String> tagsMap = configurationItem.getTags();
            if (tagsMap != null) {
                jsonWriter.key("tags");
                jsonWriter.object();

                for (Map.Entry<String, String> tagsMapValue : tagsMap
                        .entrySet()) {
                    if (tagsMapValue.getValue() != null) {
                        jsonWriter.key(tagsMapValue.getKey());

                        jsonWriter.value(tagsMapValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }

            com.amazonaws.internal.SdkInternalList<String> relatedEventsList = (com.amazonaws.internal.SdkInternalList<String>) configurationItem
                    .getRelatedEvents();
            if (!relatedEventsList.isEmpty()
                    || !relatedEventsList.isAutoConstruct()) {
                jsonWriter.key("relatedEvents");
                jsonWriter.array();
                for (String relatedEventsListValue : relatedEventsList) {
                    if (relatedEventsListValue != null) {
                        jsonWriter.value(relatedEventsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<Relationship> relationshipsList = (com.amazonaws.internal.SdkInternalList<Relationship>) configurationItem
                    .getRelationships();
            if (!relationshipsList.isEmpty()
                    || !relationshipsList.isAutoConstruct()) {
                jsonWriter.key("relationships");
                jsonWriter.array();
                for (Relationship relationshipsListValue : relationshipsList) {
                    if (relationshipsListValue != null) {

                        RelationshipJsonMarshaller.getInstance().marshall(
                                relationshipsListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (configurationItem.getConfiguration() != null) {
                jsonWriter.key("configuration").value(
                        configurationItem.getConfiguration());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ConfigurationItemJsonMarshaller instance;

    public static ConfigurationItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConfigurationItemJsonMarshaller();
        return instance;
    }

}
