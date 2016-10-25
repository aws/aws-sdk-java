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

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * UpdateLayerRequest Marshaller
 */
public class UpdateLayerRequestMarshaller implements Marshaller<Request<UpdateLayerRequest>, UpdateLayerRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public UpdateLayerRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UpdateLayerRequest> marshall(UpdateLayerRequest updateLayerRequest) {

        if (updateLayerRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateLayerRequest> request = new DefaultRequest<UpdateLayerRequest>(updateLayerRequest, "AWSOpsWorks");
        request.addHeader("X-Amz-Target", "OpsWorks_20130218.UpdateLayer");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (updateLayerRequest.getLayerId() != null) {
                jsonGenerator.writeFieldName("LayerId").writeValue(updateLayerRequest.getLayerId());
            }
            if (updateLayerRequest.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(updateLayerRequest.getName());
            }
            if (updateLayerRequest.getShortname() != null) {
                jsonGenerator.writeFieldName("Shortname").writeValue(updateLayerRequest.getShortname());
            }

            com.amazonaws.internal.SdkInternalMap<String, String> attributesMap = (com.amazonaws.internal.SdkInternalMap<String, String>) updateLayerRequest
                    .getAttributes();
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
            if (updateLayerRequest.getCustomInstanceProfileArn() != null) {
                jsonGenerator.writeFieldName("CustomInstanceProfileArn").writeValue(updateLayerRequest.getCustomInstanceProfileArn());
            }
            if (updateLayerRequest.getCustomJson() != null) {
                jsonGenerator.writeFieldName("CustomJson").writeValue(updateLayerRequest.getCustomJson());
            }

            com.amazonaws.internal.SdkInternalList<String> customSecurityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) updateLayerRequest
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

            com.amazonaws.internal.SdkInternalList<String> packagesList = (com.amazonaws.internal.SdkInternalList<String>) updateLayerRequest.getPackages();
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

            com.amazonaws.internal.SdkInternalList<VolumeConfiguration> volumeConfigurationsList = (com.amazonaws.internal.SdkInternalList<VolumeConfiguration>) updateLayerRequest
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
            if (updateLayerRequest.getEnableAutoHealing() != null) {
                jsonGenerator.writeFieldName("EnableAutoHealing").writeValue(updateLayerRequest.getEnableAutoHealing());
            }
            if (updateLayerRequest.getAutoAssignElasticIps() != null) {
                jsonGenerator.writeFieldName("AutoAssignElasticIps").writeValue(updateLayerRequest.getAutoAssignElasticIps());
            }
            if (updateLayerRequest.getAutoAssignPublicIps() != null) {
                jsonGenerator.writeFieldName("AutoAssignPublicIps").writeValue(updateLayerRequest.getAutoAssignPublicIps());
            }
            if (updateLayerRequest.getCustomRecipes() != null) {
                jsonGenerator.writeFieldName("CustomRecipes");
                RecipesJsonMarshaller.getInstance().marshall(updateLayerRequest.getCustomRecipes(), jsonGenerator);
            }
            if (updateLayerRequest.getInstallUpdatesOnBoot() != null) {
                jsonGenerator.writeFieldName("InstallUpdatesOnBoot").writeValue(updateLayerRequest.getInstallUpdatesOnBoot());
            }
            if (updateLayerRequest.getUseEbsOptimizedInstances() != null) {
                jsonGenerator.writeFieldName("UseEbsOptimizedInstances").writeValue(updateLayerRequest.getUseEbsOptimizedInstances());
            }
            if (updateLayerRequest.getLifecycleEventConfiguration() != null) {
                jsonGenerator.writeFieldName("LifecycleEventConfiguration");
                LifecycleEventConfigurationJsonMarshaller.getInstance().marshall(updateLayerRequest.getLifecycleEventConfiguration(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", protocolFactory.getContentType());
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
