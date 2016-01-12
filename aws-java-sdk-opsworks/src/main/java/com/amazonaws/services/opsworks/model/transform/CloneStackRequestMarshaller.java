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
 * CloneStackRequest Marshaller
 */
public class CloneStackRequestMarshaller implements
        Marshaller<Request<CloneStackRequest>, CloneStackRequest> {

    public Request<CloneStackRequest> marshall(
            CloneStackRequest cloneStackRequest) {

        if (cloneStackRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CloneStackRequest> request = new DefaultRequest<CloneStackRequest>(
                cloneStackRequest, "AWSOpsWorks");
        request.addHeader("X-Amz-Target", "OpsWorks_20130218.CloneStack");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (cloneStackRequest.getSourceStackId() != null) {
                jsonWriter.key("SourceStackId").value(
                        cloneStackRequest.getSourceStackId());
            }

            if (cloneStackRequest.getName() != null) {
                jsonWriter.key("Name").value(cloneStackRequest.getName());
            }

            if (cloneStackRequest.getRegion() != null) {
                jsonWriter.key("Region").value(cloneStackRequest.getRegion());
            }

            if (cloneStackRequest.getVpcId() != null) {
                jsonWriter.key("VpcId").value(cloneStackRequest.getVpcId());
            }

            com.amazonaws.internal.SdkInternalMap<String, String> attributesMap = (com.amazonaws.internal.SdkInternalMap<String, String>) cloneStackRequest
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

            if (cloneStackRequest.getServiceRoleArn() != null) {
                jsonWriter.key("ServiceRoleArn").value(
                        cloneStackRequest.getServiceRoleArn());
            }

            if (cloneStackRequest.getDefaultInstanceProfileArn() != null) {
                jsonWriter.key("DefaultInstanceProfileArn").value(
                        cloneStackRequest.getDefaultInstanceProfileArn());
            }

            if (cloneStackRequest.getDefaultOs() != null) {
                jsonWriter.key("DefaultOs").value(
                        cloneStackRequest.getDefaultOs());
            }

            if (cloneStackRequest.getHostnameTheme() != null) {
                jsonWriter.key("HostnameTheme").value(
                        cloneStackRequest.getHostnameTheme());
            }

            if (cloneStackRequest.getDefaultAvailabilityZone() != null) {
                jsonWriter.key("DefaultAvailabilityZone").value(
                        cloneStackRequest.getDefaultAvailabilityZone());
            }

            if (cloneStackRequest.getDefaultSubnetId() != null) {
                jsonWriter.key("DefaultSubnetId").value(
                        cloneStackRequest.getDefaultSubnetId());
            }

            if (cloneStackRequest.getCustomJson() != null) {
                jsonWriter.key("CustomJson").value(
                        cloneStackRequest.getCustomJson());
            }

            if (cloneStackRequest.getConfigurationManager() != null) {
                jsonWriter.key("ConfigurationManager");
                StackConfigurationManagerJsonMarshaller.getInstance()
                        .marshall(cloneStackRequest.getConfigurationManager(),
                                jsonWriter);
            }

            if (cloneStackRequest.getChefConfiguration() != null) {
                jsonWriter.key("ChefConfiguration");
                ChefConfigurationJsonMarshaller.getInstance().marshall(
                        cloneStackRequest.getChefConfiguration(), jsonWriter);
            }

            if (cloneStackRequest.getUseCustomCookbooks() != null) {
                jsonWriter.key("UseCustomCookbooks").value(
                        cloneStackRequest.getUseCustomCookbooks());
            }

            if (cloneStackRequest.getUseOpsworksSecurityGroups() != null) {
                jsonWriter.key("UseOpsworksSecurityGroups").value(
                        cloneStackRequest.getUseOpsworksSecurityGroups());
            }

            if (cloneStackRequest.getCustomCookbooksSource() != null) {
                jsonWriter.key("CustomCookbooksSource");
                SourceJsonMarshaller.getInstance().marshall(
                        cloneStackRequest.getCustomCookbooksSource(),
                        jsonWriter);
            }

            if (cloneStackRequest.getDefaultSshKeyName() != null) {
                jsonWriter.key("DefaultSshKeyName").value(
                        cloneStackRequest.getDefaultSshKeyName());
            }

            if (cloneStackRequest.getClonePermissions() != null) {
                jsonWriter.key("ClonePermissions").value(
                        cloneStackRequest.getClonePermissions());
            }

            com.amazonaws.internal.SdkInternalList<String> cloneAppIdsList = (com.amazonaws.internal.SdkInternalList<String>) cloneStackRequest
                    .getCloneAppIds();
            if (!cloneAppIdsList.isEmpty()
                    || !cloneAppIdsList.isAutoConstruct()) {
                jsonWriter.key("CloneAppIds");
                jsonWriter.array();
                for (String cloneAppIdsListValue : cloneAppIdsList) {
                    if (cloneAppIdsListValue != null) {
                        jsonWriter.value(cloneAppIdsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            if (cloneStackRequest.getDefaultRootDeviceType() != null) {
                jsonWriter.key("DefaultRootDeviceType").value(
                        cloneStackRequest.getDefaultRootDeviceType());
            }

            if (cloneStackRequest.getAgentVersion() != null) {
                jsonWriter.key("AgentVersion").value(
                        cloneStackRequest.getAgentVersion());
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
