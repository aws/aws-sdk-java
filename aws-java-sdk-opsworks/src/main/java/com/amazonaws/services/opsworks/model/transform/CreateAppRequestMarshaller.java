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
 * CreateAppRequest Marshaller
 */
public class CreateAppRequestMarshaller implements Marshaller<Request<CreateAppRequest>, CreateAppRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreateAppRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateAppRequest> marshall(CreateAppRequest createAppRequest) {

        if (createAppRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateAppRequest> request = new DefaultRequest<CreateAppRequest>(createAppRequest, "AWSOpsWorks");
        request.addHeader("X-Amz-Target", "OpsWorks_20130218.CreateApp");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (createAppRequest.getStackId() != null) {
                jsonGenerator.writeFieldName("StackId").writeValue(createAppRequest.getStackId());
            }
            if (createAppRequest.getShortname() != null) {
                jsonGenerator.writeFieldName("Shortname").writeValue(createAppRequest.getShortname());
            }
            if (createAppRequest.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(createAppRequest.getName());
            }
            if (createAppRequest.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(createAppRequest.getDescription());
            }

            com.amazonaws.internal.SdkInternalList<DataSource> dataSourcesList = (com.amazonaws.internal.SdkInternalList<DataSource>) createAppRequest
                    .getDataSources();
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
            if (createAppRequest.getType() != null) {
                jsonGenerator.writeFieldName("Type").writeValue(createAppRequest.getType());
            }
            if (createAppRequest.getAppSource() != null) {
                jsonGenerator.writeFieldName("AppSource");
                SourceJsonMarshaller.getInstance().marshall(createAppRequest.getAppSource(), jsonGenerator);
            }

            com.amazonaws.internal.SdkInternalList<String> domainsList = (com.amazonaws.internal.SdkInternalList<String>) createAppRequest.getDomains();
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
            if (createAppRequest.getEnableSsl() != null) {
                jsonGenerator.writeFieldName("EnableSsl").writeValue(createAppRequest.getEnableSsl());
            }
            if (createAppRequest.getSslConfiguration() != null) {
                jsonGenerator.writeFieldName("SslConfiguration");
                SslConfigurationJsonMarshaller.getInstance().marshall(createAppRequest.getSslConfiguration(), jsonGenerator);
            }

            com.amazonaws.internal.SdkInternalMap<String, String> attributesMap = (com.amazonaws.internal.SdkInternalMap<String, String>) createAppRequest
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

            com.amazonaws.internal.SdkInternalList<EnvironmentVariable> environmentList = (com.amazonaws.internal.SdkInternalList<EnvironmentVariable>) createAppRequest
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
