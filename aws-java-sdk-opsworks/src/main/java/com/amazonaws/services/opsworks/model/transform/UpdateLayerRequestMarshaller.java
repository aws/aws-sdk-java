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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * UpdateLayerRequest Marshaller
 */
public class UpdateLayerRequestMarshaller implements
        Marshaller<Request<UpdateLayerRequest>, UpdateLayerRequest> {

    public Request<UpdateLayerRequest> marshall(
            UpdateLayerRequest updateLayerRequest) {

        if (updateLayerRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<UpdateLayerRequest> request = new DefaultRequest<UpdateLayerRequest>(
                updateLayerRequest, "AWSOpsWorks");
        request.addHeader("X-Amz-Target", "OpsWorks_20130218.UpdateLayer");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (updateLayerRequest.getLayerId() != null) {
                jsonWriter.key("LayerId")
                        .value(updateLayerRequest.getLayerId());
            }

            if (updateLayerRequest.getName() != null) {
                jsonWriter.key("Name").value(updateLayerRequest.getName());
            }

            if (updateLayerRequest.getShortname() != null) {
                jsonWriter.key("Shortname").value(
                        updateLayerRequest.getShortname());
            }

            com.amazonaws.internal.SdkInternalMap<String, String> attributesMap = (com.amazonaws.internal.SdkInternalMap<String, String>) updateLayerRequest
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

            if (updateLayerRequest.getCustomInstanceProfileArn() != null) {
                jsonWriter.key("CustomInstanceProfileArn").value(
                        updateLayerRequest.getCustomInstanceProfileArn());
            }

            if (updateLayerRequest.getCustomJson() != null) {
                jsonWriter.key("CustomJson").value(
                        updateLayerRequest.getCustomJson());
            }

            com.amazonaws.internal.SdkInternalList<String> customSecurityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) updateLayerRequest
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

            com.amazonaws.internal.SdkInternalList<String> packagesList = (com.amazonaws.internal.SdkInternalList<String>) updateLayerRequest
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

            com.amazonaws.internal.SdkInternalList<VolumeConfiguration> volumeConfigurationsList = (com.amazonaws.internal.SdkInternalList<VolumeConfiguration>) updateLayerRequest
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

            if (updateLayerRequest.getEnableAutoHealing() != null) {
                jsonWriter.key("EnableAutoHealing").value(
                        updateLayerRequest.getEnableAutoHealing());
            }

            if (updateLayerRequest.getAutoAssignElasticIps() != null) {
                jsonWriter.key("AutoAssignElasticIps").value(
                        updateLayerRequest.getAutoAssignElasticIps());
            }

            if (updateLayerRequest.getAutoAssignPublicIps() != null) {
                jsonWriter.key("AutoAssignPublicIps").value(
                        updateLayerRequest.getAutoAssignPublicIps());
            }

            if (updateLayerRequest.getCustomRecipes() != null) {
                jsonWriter.key("CustomRecipes");
                RecipesJsonMarshaller.getInstance().marshall(
                        updateLayerRequest.getCustomRecipes(), jsonWriter);
            }

            if (updateLayerRequest.getInstallUpdatesOnBoot() != null) {
                jsonWriter.key("InstallUpdatesOnBoot").value(
                        updateLayerRequest.getInstallUpdatesOnBoot());
            }

            if (updateLayerRequest.getUseEbsOptimizedInstances() != null) {
                jsonWriter.key("UseEbsOptimizedInstances").value(
                        updateLayerRequest.getUseEbsOptimizedInstances());
            }

            if (updateLayerRequest.getLifecycleEventConfiguration() != null) {
                jsonWriter.key("LifecycleEventConfiguration");
                LifecycleEventConfigurationJsonMarshaller
                        .getInstance()
                        .marshall(
                                updateLayerRequest
                                        .getLifecycleEventConfiguration(),
                                jsonWriter);
            }

            jsonWriter.endObject();

            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length",
                    Integer.toString(content.length));
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
