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
 * AppMarshaller
 */
public class AppJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(App app, JSONWriter jsonWriter) {
        if (app == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (app.getAppId() != null) {
                jsonWriter.key("AppId").value(app.getAppId());
            }

            if (app.getStackId() != null) {
                jsonWriter.key("StackId").value(app.getStackId());
            }

            if (app.getShortname() != null) {
                jsonWriter.key("Shortname").value(app.getShortname());
            }

            if (app.getName() != null) {
                jsonWriter.key("Name").value(app.getName());
            }

            if (app.getDescription() != null) {
                jsonWriter.key("Description").value(app.getDescription());
            }

            com.amazonaws.internal.SdkInternalList<DataSource> dataSourcesList = (com.amazonaws.internal.SdkInternalList<DataSource>) app
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

            if (app.getType() != null) {
                jsonWriter.key("Type").value(app.getType());
            }

            if (app.getAppSource() != null) {
                jsonWriter.key("AppSource");
                SourceJsonMarshaller.getInstance().marshall(app.getAppSource(),
                        jsonWriter);
            }

            com.amazonaws.internal.SdkInternalList<String> domainsList = (com.amazonaws.internal.SdkInternalList<String>) app
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

            if (app.getEnableSsl() != null) {
                jsonWriter.key("EnableSsl").value(app.getEnableSsl());
            }

            if (app.getSslConfiguration() != null) {
                jsonWriter.key("SslConfiguration");
                SslConfigurationJsonMarshaller.getInstance().marshall(
                        app.getSslConfiguration(), jsonWriter);
            }

            com.amazonaws.internal.SdkInternalMap<String, String> attributesMap = (com.amazonaws.internal.SdkInternalMap<String, String>) app
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

            if (app.getCreatedAt() != null) {
                jsonWriter.key("CreatedAt").value(app.getCreatedAt());
            }

            com.amazonaws.internal.SdkInternalList<EnvironmentVariable> environmentList = (com.amazonaws.internal.SdkInternalList<EnvironmentVariable>) app
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
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AppJsonMarshaller instance;

    public static AppJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AppJsonMarshaller();
        return instance;
    }

}
