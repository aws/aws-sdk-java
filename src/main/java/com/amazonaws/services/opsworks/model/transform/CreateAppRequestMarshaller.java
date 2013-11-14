/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

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
 * Create App Request Marshaller
 */
public class CreateAppRequestMarshaller implements Marshaller<Request<CreateAppRequest>, CreateAppRequest> {

    

    public Request<CreateAppRequest> marshall(CreateAppRequest createAppRequest) {
    if (createAppRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<CreateAppRequest> request = new DefaultRequest<CreateAppRequest>(createAppRequest, "AWSOpsWorks");
        String target = "OpsWorks_20130218.CreateApp";
        request.addHeader("X-Amz-Target", target);
        request.addHeader("Content-Type", "application/x-amz-json-1.1");

        
        request.setHttpMethod(HttpMethodName.POST);


        String uriResourcePath = ""; 

        uriResourcePath = uriResourcePath.replaceAll("//", "/");

        if (uriResourcePath.contains("?")) {
            String queryString = uriResourcePath.substring(uriResourcePath.indexOf("?") + 1);
            uriResourcePath    = uriResourcePath.substring(0, uriResourcePath.indexOf("?"));

            for (String s : queryString.split("[;&]")) {
                String[] nameValuePair = s.split("=");
                if (nameValuePair.length == 2) {
                    request.addParameter(nameValuePair[0], nameValuePair[1]);
                } else {
                    request.addParameter(s, null);
                }
            }
        }

        request.setResourcePath(uriResourcePath);


        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          
            
          jsonWriter.object();
          
            if (createAppRequest.getStackId() != null) {
                jsonWriter.key("StackId").value(createAppRequest.getStackId());
            }
            if (createAppRequest.getShortname() != null) {
                jsonWriter.key("Shortname").value(createAppRequest.getShortname());
            }
            if (createAppRequest.getName() != null) {
                jsonWriter.key("Name").value(createAppRequest.getName());
            }
            if (createAppRequest.getDescription() != null) {
                jsonWriter.key("Description").value(createAppRequest.getDescription());
            }
            if (createAppRequest.getType() != null) {
                jsonWriter.key("Type").value(createAppRequest.getType());
            }
            Source appSource = createAppRequest.getAppSource();
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

            com.amazonaws.internal.ListWithAutoConstructFlag<String> domainsList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(createAppRequest.getDomains());
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
            if (createAppRequest.isEnableSsl() != null) {
                jsonWriter.key("EnableSsl").value(createAppRequest.isEnableSsl());
            }
            SslConfiguration sslConfiguration = createAppRequest.getSslConfiguration();
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
            if (createAppRequest.getAttributes() != null) {
                jsonWriter.key("Attributes");
                jsonWriter.object();
                for (Map.Entry<String, String> attributesListValue : createAppRequest.getAttributes().entrySet()) {
                    if (attributesListValue.getValue() != null) {
                        jsonWriter.key(attributesListValue.getKey());

                        jsonWriter.value(attributesListValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }

          jsonWriter.endObject();
          

          String snippet = stringWriter.toString();
          byte[] content = snippet.getBytes("UTF-8");
          request.setContent(new StringInputStream(snippet));
          request.addHeader("Content-Length", Integer.toString(content.length));
        } catch(Throwable t) {
          throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        

        return request;
    }
}
