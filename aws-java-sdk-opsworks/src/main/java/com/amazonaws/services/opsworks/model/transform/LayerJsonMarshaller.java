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
package com.amazonaws.services.opsworks.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * LayerMarshaller
 */
public class LayerJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Layer layer, StructuredJsonGenerator jsonGenerator) {

        if (layer == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (layer.getStackId() != null) {
                jsonGenerator.writeFieldName("StackId").writeValue(layer.getStackId());
            }
            if (layer.getLayerId() != null) {
                jsonGenerator.writeFieldName("LayerId").writeValue(layer.getLayerId());
            }
            if (layer.getType() != null) {
                jsonGenerator.writeFieldName("Type").writeValue(layer.getType());
            }
            if (layer.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(layer.getName());
            }
            if (layer.getShortname() != null) {
                jsonGenerator.writeFieldName("Shortname").writeValue(layer.getShortname());
            }

            com.amazonaws.internal.SdkInternalMap<String, String> attributesMap = (com.amazonaws.internal.SdkInternalMap<String, String>) layer.getAttributes();
            if (!attributesMap.isEmpty() || !attributesMap.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Attributes");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> attributesMapValue : attributesMap.entrySet()) {
                    if (attributesMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(attributesMapValue.getKey());

                        jsonGenerator.writeValue(attributesMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (layer.getCustomInstanceProfileArn() != null) {
                jsonGenerator.writeFieldName("CustomInstanceProfileArn").writeValue(layer.getCustomInstanceProfileArn());
            }
            if (layer.getCustomJson() != null) {
                jsonGenerator.writeFieldName("CustomJson").writeValue(layer.getCustomJson());
            }

            com.amazonaws.internal.SdkInternalList<String> customSecurityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) layer
                    .getCustomSecurityGroupIds();
            if (!customSecurityGroupIdsList.isEmpty() || !customSecurityGroupIdsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("CustomSecurityGroupIds");
                jsonGenerator.writeStartArray();
                for (String customSecurityGroupIdsListValue : customSecurityGroupIdsList) {
                    if (customSecurityGroupIdsListValue != null) {
                        jsonGenerator.writeValue(customSecurityGroupIdsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<String> defaultSecurityGroupNamesList = (com.amazonaws.internal.SdkInternalList<String>) layer
                    .getDefaultSecurityGroupNames();
            if (!defaultSecurityGroupNamesList.isEmpty() || !defaultSecurityGroupNamesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("DefaultSecurityGroupNames");
                jsonGenerator.writeStartArray();
                for (String defaultSecurityGroupNamesListValue : defaultSecurityGroupNamesList) {
                    if (defaultSecurityGroupNamesListValue != null) {
                        jsonGenerator.writeValue(defaultSecurityGroupNamesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<String> packagesList = (com.amazonaws.internal.SdkInternalList<String>) layer.getPackages();
            if (!packagesList.isEmpty() || !packagesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Packages");
                jsonGenerator.writeStartArray();
                for (String packagesListValue : packagesList) {
                    if (packagesListValue != null) {
                        jsonGenerator.writeValue(packagesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<VolumeConfiguration> volumeConfigurationsList = (com.amazonaws.internal.SdkInternalList<VolumeConfiguration>) layer
                    .getVolumeConfigurations();
            if (!volumeConfigurationsList.isEmpty() || !volumeConfigurationsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("VolumeConfigurations");
                jsonGenerator.writeStartArray();
                for (VolumeConfiguration volumeConfigurationsListValue : volumeConfigurationsList) {
                    if (volumeConfigurationsListValue != null) {

                        VolumeConfigurationJsonMarshaller.getInstance().marshall(volumeConfigurationsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (layer.getEnableAutoHealing() != null) {
                jsonGenerator.writeFieldName("EnableAutoHealing").writeValue(layer.getEnableAutoHealing());
            }
            if (layer.getAutoAssignElasticIps() != null) {
                jsonGenerator.writeFieldName("AutoAssignElasticIps").writeValue(layer.getAutoAssignElasticIps());
            }
            if (layer.getAutoAssignPublicIps() != null) {
                jsonGenerator.writeFieldName("AutoAssignPublicIps").writeValue(layer.getAutoAssignPublicIps());
            }
            if (layer.getDefaultRecipes() != null) {
                jsonGenerator.writeFieldName("DefaultRecipes");
                RecipesJsonMarshaller.getInstance().marshall(layer.getDefaultRecipes(), jsonGenerator);
            }
            if (layer.getCustomRecipes() != null) {
                jsonGenerator.writeFieldName("CustomRecipes");
                RecipesJsonMarshaller.getInstance().marshall(layer.getCustomRecipes(), jsonGenerator);
            }
            if (layer.getCreatedAt() != null) {
                jsonGenerator.writeFieldName("CreatedAt").writeValue(layer.getCreatedAt());
            }
            if (layer.getInstallUpdatesOnBoot() != null) {
                jsonGenerator.writeFieldName("InstallUpdatesOnBoot").writeValue(layer.getInstallUpdatesOnBoot());
            }
            if (layer.getUseEbsOptimizedInstances() != null) {
                jsonGenerator.writeFieldName("UseEbsOptimizedInstances").writeValue(layer.getUseEbsOptimizedInstances());
            }
            if (layer.getLifecycleEventConfiguration() != null) {
                jsonGenerator.writeFieldName("LifecycleEventConfiguration");
                LifecycleEventConfigurationJsonMarshaller.getInstance().marshall(layer.getLifecycleEventConfiguration(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static LayerJsonMarshaller instance;

    public static LayerJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LayerJsonMarshaller();
        return instance;
    }

}
