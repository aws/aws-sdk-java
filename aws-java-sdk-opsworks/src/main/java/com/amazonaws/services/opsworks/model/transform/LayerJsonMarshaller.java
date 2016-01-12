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

package com.amazonaws.services.opsworks.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * LayerMarshaller
 */
public class LayerJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Layer layer, JSONWriter jsonWriter) {
        if (layer == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (layer.getStackId() != null) {
                jsonWriter.key("StackId").value(layer.getStackId());
            }

            if (layer.getLayerId() != null) {
                jsonWriter.key("LayerId").value(layer.getLayerId());
            }

            if (layer.getType() != null) {
                jsonWriter.key("Type").value(layer.getType());
            }

            if (layer.getName() != null) {
                jsonWriter.key("Name").value(layer.getName());
            }

            if (layer.getShortname() != null) {
                jsonWriter.key("Shortname").value(layer.getShortname());
            }

            com.amazonaws.internal.SdkInternalMap<String, String> attributesMap = (com.amazonaws.internal.SdkInternalMap<String, String>) layer
                    .getAttributes();
            if (!attributesMap.isEmpty() || !attributesMap.isAutoConstruct()) {
                jsonWriter.key("Attributes");
                jsonWriter.object();

                for (Map.Entry<String, String> attributesMapValue : attributesMap
                        .entrySet()) {
                    if (attributesMapValue.getValue() != null) {
                        jsonWriter.key(attributesMapValue.getKey());

                        jsonWriter.value(attributesMapValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }

            if (layer.getCustomInstanceProfileArn() != null) {
                jsonWriter.key("CustomInstanceProfileArn").value(
                        layer.getCustomInstanceProfileArn());
            }

            if (layer.getCustomJson() != null) {
                jsonWriter.key("CustomJson").value(layer.getCustomJson());
            }

            com.amazonaws.internal.SdkInternalList<String> customSecurityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) layer
                    .getCustomSecurityGroupIds();
            if (!customSecurityGroupIdsList.isEmpty()
                    || !customSecurityGroupIdsList.isAutoConstruct()) {
                jsonWriter.key("CustomSecurityGroupIds");
                jsonWriter.array();
                for (String customSecurityGroupIdsListValue : customSecurityGroupIdsList) {
                    if (customSecurityGroupIdsListValue != null) {
                        jsonWriter.value(customSecurityGroupIdsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<String> defaultSecurityGroupNamesList = (com.amazonaws.internal.SdkInternalList<String>) layer
                    .getDefaultSecurityGroupNames();
            if (!defaultSecurityGroupNamesList.isEmpty()
                    || !defaultSecurityGroupNamesList.isAutoConstruct()) {
                jsonWriter.key("DefaultSecurityGroupNames");
                jsonWriter.array();
                for (String defaultSecurityGroupNamesListValue : defaultSecurityGroupNamesList) {
                    if (defaultSecurityGroupNamesListValue != null) {
                        jsonWriter.value(defaultSecurityGroupNamesListValue);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<String> packagesList = (com.amazonaws.internal.SdkInternalList<String>) layer
                    .getPackages();
            if (!packagesList.isEmpty() || !packagesList.isAutoConstruct()) {
                jsonWriter.key("Packages");
                jsonWriter.array();
                for (String packagesListValue : packagesList) {
                    if (packagesListValue != null) {
                        jsonWriter.value(packagesListValue);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<VolumeConfiguration> volumeConfigurationsList = (com.amazonaws.internal.SdkInternalList<VolumeConfiguration>) layer
                    .getVolumeConfigurations();
            if (!volumeConfigurationsList.isEmpty()
                    || !volumeConfigurationsList.isAutoConstruct()) {
                jsonWriter.key("VolumeConfigurations");
                jsonWriter.array();
                for (VolumeConfiguration volumeConfigurationsListValue : volumeConfigurationsList) {
                    if (volumeConfigurationsListValue != null) {

                        VolumeConfigurationJsonMarshaller.getInstance()
                                .marshall(volumeConfigurationsListValue,
                                        jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (layer.getEnableAutoHealing() != null) {
                jsonWriter.key("EnableAutoHealing").value(
                        layer.getEnableAutoHealing());
            }

            if (layer.getAutoAssignElasticIps() != null) {
                jsonWriter.key("AutoAssignElasticIps").value(
                        layer.getAutoAssignElasticIps());
            }

            if (layer.getAutoAssignPublicIps() != null) {
                jsonWriter.key("AutoAssignPublicIps").value(
                        layer.getAutoAssignPublicIps());
            }

            if (layer.getDefaultRecipes() != null) {
                jsonWriter.key("DefaultRecipes");
                RecipesJsonMarshaller.getInstance().marshall(
                        layer.getDefaultRecipes(), jsonWriter);
            }

            if (layer.getCustomRecipes() != null) {
                jsonWriter.key("CustomRecipes");
                RecipesJsonMarshaller.getInstance().marshall(
                        layer.getCustomRecipes(), jsonWriter);
            }

            if (layer.getCreatedAt() != null) {
                jsonWriter.key("CreatedAt").value(layer.getCreatedAt());
            }

            if (layer.getInstallUpdatesOnBoot() != null) {
                jsonWriter.key("InstallUpdatesOnBoot").value(
                        layer.getInstallUpdatesOnBoot());
            }

            if (layer.getUseEbsOptimizedInstances() != null) {
                jsonWriter.key("UseEbsOptimizedInstances").value(
                        layer.getUseEbsOptimizedInstances());
            }

            if (layer.getLifecycleEventConfiguration() != null) {
                jsonWriter.key("LifecycleEventConfiguration");
                LifecycleEventConfigurationJsonMarshaller.getInstance()
                        .marshall(layer.getLifecycleEventConfiguration(),
                                jsonWriter);
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static LayerJsonMarshaller instance;

    public static LayerJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LayerJsonMarshaller();
        return instance;
    }

}
