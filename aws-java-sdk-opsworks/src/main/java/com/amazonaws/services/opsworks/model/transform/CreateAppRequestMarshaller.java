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
 * CreateAppRequest Marshaller
 */
public class CreateAppRequestMarshaller implements
        Marshaller<Request<CreateAppRequest>, CreateAppRequest> {

    public Request<CreateAppRequest> marshall(CreateAppRequest createAppRequest) {

        if (createAppRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateAppRequest> request = new DefaultRequest<CreateAppRequest>(
                createAppRequest, "AWSOpsWorks");
        request.addHeader("X-Amz-Target", "OpsWorks_20130218.CreateApp");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (createAppRequest.getStackId() != null) {
                jsonWriter.key("StackId").value(createAppRequest.getStackId());
            }

            if (createAppRequest.getShortname() != null) {
                jsonWriter.key("Shortname").value(
                        createAppRequest.getShortname());
            }

            if (createAppRequest.getName() != null) {
                jsonWriter.key("Name").value(createAppRequest.getName());
            }

            if (createAppRequest.getDescription() != null) {
                jsonWriter.key("Description").value(
                        createAppRequest.getDescription());
            }

            com.amazonaws.internal.SdkInternalList<DataSource> dataSourcesList = (com.amazonaws.internal.SdkInternalList<DataSource>) createAppRequest
                    .getDataSources();
            if (!dataSourcesList.isEmpty()
                    || !dataSourcesList.isAutoConstruct()) {
                jsonWriter.key("DataSources");
                jsonWriter.array();
                for (DataSource dataSourcesListValue : dataSourcesList) {
                    if (dataSourcesListValue != null) {

                        DataSourceJsonMarshaller.getInstance().marshall(
                                dataSourcesListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (createAppRequest.getType() != null) {
                jsonWriter.key("Type").value(createAppRequest.getType());
            }

            if (createAppRequest.getAppSource() != null) {
                jsonWriter.key("AppSource");
                SourceJsonMarshaller.getInstance().marshall(
                        createAppRequest.getAppSource(), jsonWriter);
            }

            com.amazonaws.internal.SdkInternalList<String> domainsList = (com.amazonaws.internal.SdkInternalList<String>) createAppRequest
                    .getDomains();
            if (!domainsList.isEmpty() || !domainsList.isAutoConstruct()) {
                jsonWriter.key("Domains");
                jsonWriter.array();
                for (String domainsListValue : domainsList) {
                    if (domainsListValue != null) {
                        jsonWriter.value(domainsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            if (createAppRequest.getEnableSsl() != null) {
                jsonWriter.key("EnableSsl").value(
                        createAppRequest.getEnableSsl());
            }

            if (createAppRequest.getSslConfiguration() != null) {
                jsonWriter.key("SslConfiguration");
                SslConfigurationJsonMarshaller.getInstance().marshall(
                        createAppRequest.getSslConfiguration(), jsonWriter);
            }

            com.amazonaws.internal.SdkInternalMap<String, String> attributesMap = (com.amazonaws.internal.SdkInternalMap<String, String>) createAppRequest
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

            com.amazonaws.internal.SdkInternalList<EnvironmentVariable> environmentList = (com.amazonaws.internal.SdkInternalList<EnvironmentVariable>) createAppRequest
                    .getEnvironment();
            if (!environmentList.isEmpty()
                    || !environmentList.isAutoConstruct()) {
                jsonWriter.key("Environment");
                jsonWriter.array();
                for (EnvironmentVariable environmentListValue : environmentList) {
                    if (environmentListValue != null) {

                        EnvironmentVariableJsonMarshaller.getInstance()
                                .marshall(environmentListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
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
