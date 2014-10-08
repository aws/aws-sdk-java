/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Update App Request Marshaller
 */
public class UpdateAppRequestMarshaller implements Marshaller<Request<UpdateAppRequest>, UpdateAppRequest> {

    public Request<UpdateAppRequest> marshall(UpdateAppRequest updateAppRequest) {
        if (updateAppRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateAppRequest> request = new DefaultRequest<UpdateAppRequest>(updateAppRequest, "AWSOpsWorks");
        String target = "OpsWorks_20130218.UpdateApp";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        request.setResourcePath("");
        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          jsonWriter.object();
          
            if (updateAppRequest.getAppId() != null) {
                jsonWriter.key("AppId").value(updateAppRequest.getAppId());
            }
            if (updateAppRequest.getName() != null) {
                jsonWriter.key("Name").value(updateAppRequest.getName());
            }
            if (updateAppRequest.getDescription() != null) {
                jsonWriter.key("Description").value(updateAppRequest.getDescription());
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<DataSource> dataSourcesList = (com.amazonaws.internal.ListWithAutoConstructFlag<DataSource>)(updateAppRequest.getDataSources());
            if (dataSourcesList != null && !(dataSourcesList.isAutoConstruct() && dataSourcesList.isEmpty())) {

                jsonWriter.key("DataSources");
                jsonWriter.array();

                for (DataSource dataSourcesListValue : dataSourcesList) {
                    if (dataSourcesListValue != null) {
                        jsonWriter.object();
                        if (dataSourcesListValue.getType() != null) {
                            jsonWriter.key("Type").value(dataSourcesListValue.getType());
                        }
                        if (dataSourcesListValue.getArn() != null) {
                            jsonWriter.key("Arn").value(dataSourcesListValue.getArn());
                        }
                        if (dataSourcesListValue.getDatabaseName() != null) {
                            jsonWriter.key("DatabaseName").value(dataSourcesListValue.getDatabaseName());
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endArray();
            }
            if (updateAppRequest.getType() != null) {
                jsonWriter.key("Type").value(updateAppRequest.getType());
            }
            Source appSource = updateAppRequest.getAppSource();
            if (appSource != null) {

                jsonWriter.key("AppSource");
                jsonWriter.object();

                if (appSource.getType() != null) {
                    jsonWriter.key("Type").value(appSource.getType());
                }
                if (appSource.getUrl() != null) {
                    jsonWriter.key("Url").value(appSource.getUrl());
                }
                if (appSource.getUsername() != null) {
                    jsonWriter.key("Username").value(appSource.getUsername());
                }
                if (appSource.getPassword() != null) {
                    jsonWriter.key("Password").value(appSource.getPassword());
                }
                if (appSource.getSshKey() != null) {
                    jsonWriter.key("SshKey").value(appSource.getSshKey());
                }
                if (appSource.getRevision() != null) {
                    jsonWriter.key("Revision").value(appSource.getRevision());
                }
                jsonWriter.endObject();
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<String> domainsList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(updateAppRequest.getDomains());
            if (domainsList != null && !(domainsList.isAutoConstruct() && domainsList.isEmpty())) {

                jsonWriter.key("Domains");
                jsonWriter.array();

                for (String domainsListValue : domainsList) {
                    if (domainsListValue != null) {
                        jsonWriter.value(domainsListValue);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateAppRequest.isEnableSsl() != null) {
                jsonWriter.key("EnableSsl").value(updateAppRequest.isEnableSsl());
            }
            SslConfiguration sslConfiguration = updateAppRequest.getSslConfiguration();
            if (sslConfiguration != null) {

                jsonWriter.key("SslConfiguration");
                jsonWriter.object();

                if (sslConfiguration.getCertificate() != null) {
                    jsonWriter.key("Certificate").value(sslConfiguration.getCertificate());
                }
                if (sslConfiguration.getPrivateKey() != null) {
                    jsonWriter.key("PrivateKey").value(sslConfiguration.getPrivateKey());
                }
                if (sslConfiguration.getChain() != null) {
                    jsonWriter.key("Chain").value(sslConfiguration.getChain());
                }
                jsonWriter.endObject();
            }
            if (updateAppRequest.getAttributes() != null) {
                jsonWriter.key("Attributes");
                jsonWriter.object();
                for (Map.Entry<String, String> attributesListValue : updateAppRequest.getAttributes().entrySet()) {
                    if (attributesListValue.getValue() != null) {
                        jsonWriter.key(attributesListValue.getKey());

                        jsonWriter.value(attributesListValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<EnvironmentVariable> environmentList = (com.amazonaws.internal.ListWithAutoConstructFlag<EnvironmentVariable>)(updateAppRequest.getEnvironment());
            if (environmentList != null && !(environmentList.isAutoConstruct() && environmentList.isEmpty())) {

                jsonWriter.key("Environment");
                jsonWriter.array();

                for (EnvironmentVariable environmentListValue : environmentList) {
                    if (environmentListValue != null) {
                        jsonWriter.object();
                        if (environmentListValue.getKey() != null) {
                            jsonWriter.key("Key").value(environmentListValue.getKey());
                        }
                        if (environmentListValue.getValue() != null) {
                            jsonWriter.key("Value").value(environmentListValue.getValue());
                        }
                        if (environmentListValue.isSecure() != null) {
                            jsonWriter.key("Secure").value(environmentListValue.isSecure());
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endArray();
            }

          jsonWriter.endObject();

          String snippet = stringWriter.toString();
          byte[] content = snippet.getBytes(UTF8);
          request.setContent(new StringInputStream(snippet));
          request.addHeader("Content-Length", Integer.toString(content.length));
          request.addHeader("Content-Type", "application/x-amz-json-1.1");
        } catch(Throwable t) {
          throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }
}
