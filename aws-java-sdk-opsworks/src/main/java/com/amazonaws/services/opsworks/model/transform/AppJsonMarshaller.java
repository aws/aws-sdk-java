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
 * AppMarshaller
 */
public class AppJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(App app, StructuredJsonGenerator jsonGenerator) {

        if (app == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (app.getAppId() != null) {
                jsonGenerator.writeFieldName("AppId").writeValue(app.getAppId());
            }
            if (app.getStackId() != null) {
                jsonGenerator.writeFieldName("StackId").writeValue(app.getStackId());
            }
            if (app.getShortname() != null) {
                jsonGenerator.writeFieldName("Shortname").writeValue(app.getShortname());
            }
            if (app.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(app.getName());
            }
            if (app.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(app.getDescription());
            }

            com.amazonaws.internal.SdkInternalList<DataSource> dataSourcesList = (com.amazonaws.internal.SdkInternalList<DataSource>) app.getDataSources();
            if (!dataSourcesList.isEmpty() || !dataSourcesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("DataSources");
                jsonGenerator.writeStartArray();
                for (DataSource dataSourcesListValue : dataSourcesList) {
                    if (dataSourcesListValue != null) {

                        DataSourceJsonMarshaller.getInstance().marshall(dataSourcesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (app.getType() != null) {
                jsonGenerator.writeFieldName("Type").writeValue(app.getType());
            }
            if (app.getAppSource() != null) {
                jsonGenerator.writeFieldName("AppSource");
                SourceJsonMarshaller.getInstance().marshall(app.getAppSource(), jsonGenerator);
            }

            com.amazonaws.internal.SdkInternalList<String> domainsList = (com.amazonaws.internal.SdkInternalList<String>) app.getDomains();
            if (!domainsList.isEmpty() || !domainsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Domains");
                jsonGenerator.writeStartArray();
                for (String domainsListValue : domainsList) {
                    if (domainsListValue != null) {
                        jsonGenerator.writeValue(domainsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (app.getEnableSsl() != null) {
                jsonGenerator.writeFieldName("EnableSsl").writeValue(app.getEnableSsl());
            }
            if (app.getSslConfiguration() != null) {
                jsonGenerator.writeFieldName("SslConfiguration");
                SslConfigurationJsonMarshaller.getInstance().marshall(app.getSslConfiguration(), jsonGenerator);
            }

            com.amazonaws.internal.SdkInternalMap<String, String> attributesMap = (com.amazonaws.internal.SdkInternalMap<String, String>) app.getAttributes();
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
            if (app.getCreatedAt() != null) {
                jsonGenerator.writeFieldName("CreatedAt").writeValue(app.getCreatedAt());
            }

            com.amazonaws.internal.SdkInternalList<EnvironmentVariable> environmentList = (com.amazonaws.internal.SdkInternalList<EnvironmentVariable>) app
                    .getEnvironment();
            if (!environmentList.isEmpty() || !environmentList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Environment");
                jsonGenerator.writeStartArray();
                for (EnvironmentVariable environmentListValue : environmentList) {
                    if (environmentListValue != null) {

                        EnvironmentVariableJsonMarshaller.getInstance().marshall(environmentListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AppJsonMarshaller instance;

    public static AppJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AppJsonMarshaller();
        return instance;
    }

}
