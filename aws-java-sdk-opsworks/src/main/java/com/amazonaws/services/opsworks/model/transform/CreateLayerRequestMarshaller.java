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
 * CreateLayerRequest Marshaller
 */
public class CreateLayerRequestMarshaller implements
        Marshaller<Request<CreateLayerRequest>, CreateLayerRequest> {

    public Request<CreateLayerRequest> marshall(
            CreateLayerRequest createLayerRequest) {

        if (createLayerRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateLayerRequest> request = new DefaultRequest<CreateLayerRequest>(
                createLayerRequest, "AWSOpsWorks");
        request.addHeader("X-Amz-Target", "OpsWorks_20130218.CreateLayer");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (createLayerRequest.getStackId() != null) {
                jsonWriter.key("StackId")
                        .value(createLayerRequest.getStackId());
            }

            if (createLayerRequest.getType() != null) {
                jsonWriter.key("Type").value(createLayerRequest.getType());
            }

            if (createLayerRequest.getName() != null) {
                jsonWriter.key("Name").value(createLayerRequest.getName());
            }

            if (createLayerRequest.getShortname() != null) {
                jsonWriter.key("Shortname").value(
                        createLayerRequest.getShortname());
            }

            com.amazonaws.internal.SdkInternalMap<String, String> attributesMap = (com.amazonaws.internal.SdkInternalMap<String, String>) createLayerRequest
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

            if (createLayerRequest.getCustomInstanceProfileArn() != null) {
                jsonWriter.key("CustomInstanceProfileArn").value(
                        createLayerRequest.getCustomInstanceProfileArn());
            }

            if (createLayerRequest.getCustomJson() != null) {
                jsonWriter.key("CustomJson").value(
                        createLayerRequest.getCustomJson());
            }

            com.amazonaws.internal.SdkInternalList<String> customSecurityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) createLayerRequest
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

            com.amazonaws.internal.SdkInternalList<String> packagesList = (com.amazonaws.internal.SdkInternalList<String>) createLayerRequest
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

            com.amazonaws.internal.SdkInternalList<VolumeConfiguration> volumeConfigurationsList = (com.amazonaws.internal.SdkInternalList<VolumeConfiguration>) createLayerRequest
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

            if (createLayerRequest.getEnableAutoHealing() != null) {
                jsonWriter.key("EnableAutoHealing").value(
                        createLayerRequest.getEnableAutoHealing());
            }

            if (createLayerRequest.getAutoAssignElasticIps() != null) {
                jsonWriter.key("AutoAssignElasticIps").value(
                        createLayerRequest.getAutoAssignElasticIps());
            }

            if (createLayerRequest.getAutoAssignPublicIps() != null) {
                jsonWriter.key("AutoAssignPublicIps").value(
                        createLayerRequest.getAutoAssignPublicIps());
            }

            if (createLayerRequest.getCustomRecipes() != null) {
                jsonWriter.key("CustomRecipes");
                RecipesJsonMarshaller.getInstance().marshall(
                        createLayerRequest.getCustomRecipes(), jsonWriter);
            }

            if (createLayerRequest.getInstallUpdatesOnBoot() != null) {
                jsonWriter.key("InstallUpdatesOnBoot").value(
                        createLayerRequest.getInstallUpdatesOnBoot());
            }

            if (createLayerRequest.getUseEbsOptimizedInstances() != null) {
                jsonWriter.key("UseEbsOptimizedInstances").value(
                        createLayerRequest.getUseEbsOptimizedInstances());
            }

            if (createLayerRequest.getLifecycleEventConfiguration() != null) {
                jsonWriter.key("LifecycleEventConfiguration");
                LifecycleEventConfigurationJsonMarshaller
                        .getInstance()
                        .marshall(
                                createLayerRequest
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
