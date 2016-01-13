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
 * UpdateStackRequest Marshaller
 */
public class UpdateStackRequestMarshaller implements
        Marshaller<Request<UpdateStackRequest>, UpdateStackRequest> {

    public Request<UpdateStackRequest> marshall(
            UpdateStackRequest updateStackRequest) {

        if (updateStackRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<UpdateStackRequest> request = new DefaultRequest<UpdateStackRequest>(
                updateStackRequest, "AWSOpsWorks");
        request.addHeader("X-Amz-Target", "OpsWorks_20130218.UpdateStack");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (updateStackRequest.getStackId() != null) {
                jsonWriter.key("StackId")
                        .value(updateStackRequest.getStackId());
            }

            if (updateStackRequest.getName() != null) {
                jsonWriter.key("Name").value(updateStackRequest.getName());
            }

            com.amazonaws.internal.SdkInternalMap<String, String> attributesMap = (com.amazonaws.internal.SdkInternalMap<String, String>) updateStackRequest
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

            if (updateStackRequest.getServiceRoleArn() != null) {
                jsonWriter.key("ServiceRoleArn").value(
                        updateStackRequest.getServiceRoleArn());
            }

            if (updateStackRequest.getDefaultInstanceProfileArn() != null) {
                jsonWriter.key("DefaultInstanceProfileArn").value(
                        updateStackRequest.getDefaultInstanceProfileArn());
            }

            if (updateStackRequest.getDefaultOs() != null) {
                jsonWriter.key("DefaultOs").value(
                        updateStackRequest.getDefaultOs());
            }

            if (updateStackRequest.getHostnameTheme() != null) {
                jsonWriter.key("HostnameTheme").value(
                        updateStackRequest.getHostnameTheme());
            }

            if (updateStackRequest.getDefaultAvailabilityZone() != null) {
                jsonWriter.key("DefaultAvailabilityZone").value(
                        updateStackRequest.getDefaultAvailabilityZone());
            }

            if (updateStackRequest.getDefaultSubnetId() != null) {
                jsonWriter.key("DefaultSubnetId").value(
                        updateStackRequest.getDefaultSubnetId());
            }

            if (updateStackRequest.getCustomJson() != null) {
                jsonWriter.key("CustomJson").value(
                        updateStackRequest.getCustomJson());
            }

            if (updateStackRequest.getConfigurationManager() != null) {
                jsonWriter.key("ConfigurationManager");
                StackConfigurationManagerJsonMarshaller.getInstance().marshall(
                        updateStackRequest.getConfigurationManager(),
                        jsonWriter);
            }

            if (updateStackRequest.getChefConfiguration() != null) {
                jsonWriter.key("ChefConfiguration");
                ChefConfigurationJsonMarshaller.getInstance().marshall(
                        updateStackRequest.getChefConfiguration(), jsonWriter);
            }

            if (updateStackRequest.getUseCustomCookbooks() != null) {
                jsonWriter.key("UseCustomCookbooks").value(
                        updateStackRequest.getUseCustomCookbooks());
            }

            if (updateStackRequest.getCustomCookbooksSource() != null) {
                jsonWriter.key("CustomCookbooksSource");
                SourceJsonMarshaller.getInstance().marshall(
                        updateStackRequest.getCustomCookbooksSource(),
                        jsonWriter);
            }

            if (updateStackRequest.getDefaultSshKeyName() != null) {
                jsonWriter.key("DefaultSshKeyName").value(
                        updateStackRequest.getDefaultSshKeyName());
            }

            if (updateStackRequest.getDefaultRootDeviceType() != null) {
                jsonWriter.key("DefaultRootDeviceType").value(
                        updateStackRequest.getDefaultRootDeviceType());
            }

            if (updateStackRequest.getUseOpsworksSecurityGroups() != null) {
                jsonWriter.key("UseOpsworksSecurityGroups").value(
                        updateStackRequest.getUseOpsworksSecurityGroups());
            }

            if (updateStackRequest.getAgentVersion() != null) {
                jsonWriter.key("AgentVersion").value(
                        updateStackRequest.getAgentVersion());
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
