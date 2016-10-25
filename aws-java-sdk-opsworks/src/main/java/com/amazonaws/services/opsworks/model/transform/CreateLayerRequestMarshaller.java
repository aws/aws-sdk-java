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
 * CreateLayerRequest Marshaller
 */
public class CreateLayerRequestMarshaller implements Marshaller<Request<CreateLayerRequest>, CreateLayerRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreateLayerRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateLayerRequest> marshall(CreateLayerRequest createLayerRequest) {

        if (createLayerRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateLayerRequest> request = new DefaultRequest<CreateLayerRequest>(createLayerRequest, "AWSOpsWorks");
        request.addHeader("X-Amz-Target", "OpsWorks_20130218.CreateLayer");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (createLayerRequest.getStackId() != null) {
                jsonGenerator.writeFieldName("StackId").writeValue(createLayerRequest.getStackId());
            }
            if (createLayerRequest.getType() != null) {
                jsonGenerator.writeFieldName("Type").writeValue(createLayerRequest.getType());
            }
            if (createLayerRequest.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(createLayerRequest.getName());
            }
            if (createLayerRequest.getShortname() != null) {
                jsonGenerator.writeFieldName("Shortname").writeValue(createLayerRequest.getShortname());
            }

            com.amazonaws.internal.SdkInternalMap<String, String> attributesMap = (com.amazonaws.internal.SdkInternalMap<String, String>) createLayerRequest
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
            if (createLayerRequest.getCustomInstanceProfileArn() != null) {
                jsonGenerator.writeFieldName("CustomInstanceProfileArn").writeValue(createLayerRequest.getCustomInstanceProfileArn());
            }
            if (createLayerRequest.getCustomJson() != null) {
                jsonGenerator.writeFieldName("CustomJson").writeValue(createLayerRequest.getCustomJson());
            }

            com.amazonaws.internal.SdkInternalList<String> customSecurityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) createLayerRequest
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

            com.amazonaws.internal.SdkInternalList<String> packagesList = (com.amazonaws.internal.SdkInternalList<String>) createLayerRequest.getPackages();
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

            com.amazonaws.internal.SdkInternalList<VolumeConfiguration> volumeConfigurationsList = (com.amazonaws.internal.SdkInternalList<VolumeConfiguration>) createLayerRequest
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
            if (createLayerRequest.getEnableAutoHealing() != null) {
                jsonGenerator.writeFieldName("EnableAutoHealing").writeValue(createLayerRequest.getEnableAutoHealing());
            }
            if (createLayerRequest.getAutoAssignElasticIps() != null) {
                jsonGenerator.writeFieldName("AutoAssignElasticIps").writeValue(createLayerRequest.getAutoAssignElasticIps());
            }
            if (createLayerRequest.getAutoAssignPublicIps() != null) {
                jsonGenerator.writeFieldName("AutoAssignPublicIps").writeValue(createLayerRequest.getAutoAssignPublicIps());
            }
            if (createLayerRequest.getCustomRecipes() != null) {
                jsonGenerator.writeFieldName("CustomRecipes");
                RecipesJsonMarshaller.getInstance().marshall(createLayerRequest.getCustomRecipes(), jsonGenerator);
            }
            if (createLayerRequest.getInstallUpdatesOnBoot() != null) {
                jsonGenerator.writeFieldName("InstallUpdatesOnBoot").writeValue(createLayerRequest.getInstallUpdatesOnBoot());
            }
            if (createLayerRequest.getUseEbsOptimizedInstances() != null) {
                jsonGenerator.writeFieldName("UseEbsOptimizedInstances").writeValue(createLayerRequest.getUseEbsOptimizedInstances());
            }
            if (createLayerRequest.getLifecycleEventConfiguration() != null) {
                jsonGenerator.writeFieldName("LifecycleEventConfiguration");
                LifecycleEventConfigurationJsonMarshaller.getInstance().marshall(createLayerRequest.getLifecycleEventConfiguration(), jsonGenerator);
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
