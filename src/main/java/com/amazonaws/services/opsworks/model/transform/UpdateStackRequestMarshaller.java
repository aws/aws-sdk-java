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
 * Update Stack Request Marshaller
 */
public class UpdateStackRequestMarshaller implements Marshaller<Request<UpdateStackRequest>, UpdateStackRequest> {

    

    public Request<UpdateStackRequest> marshall(UpdateStackRequest updateStackRequest) {
    if (updateStackRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<UpdateStackRequest> request = new DefaultRequest<UpdateStackRequest>(updateStackRequest, "AWSOpsWorks");
        String target = "OpsWorks_20130218.UpdateStack";
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
          
            if (updateStackRequest.getStackId() != null) {
                jsonWriter.key("StackId").value(updateStackRequest.getStackId());
            }
            if (updateStackRequest.getName() != null) {
                jsonWriter.key("Name").value(updateStackRequest.getName());
            }
            if (updateStackRequest.getAttributes() != null) {
                jsonWriter.key("Attributes");
                jsonWriter.object();
                for (Map.Entry<String, String> attributesListValue : updateStackRequest.getAttributes().entrySet()) {
                    if (attributesListValue.getValue() != null) {
                        jsonWriter.key(attributesListValue.getKey());

                        jsonWriter.value(attributesListValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }
            if (updateStackRequest.getServiceRoleArn() != null) {
                jsonWriter.key("ServiceRoleArn").value(updateStackRequest.getServiceRoleArn());
            }
            if (updateStackRequest.getDefaultInstanceProfileArn() != null) {
                jsonWriter.key("DefaultInstanceProfileArn").value(updateStackRequest.getDefaultInstanceProfileArn());
            }
            if (updateStackRequest.getDefaultOs() != null) {
                jsonWriter.key("DefaultOs").value(updateStackRequest.getDefaultOs());
            }
            if (updateStackRequest.getHostnameTheme() != null) {
                jsonWriter.key("HostnameTheme").value(updateStackRequest.getHostnameTheme());
            }
            if (updateStackRequest.getDefaultAvailabilityZone() != null) {
                jsonWriter.key("DefaultAvailabilityZone").value(updateStackRequest.getDefaultAvailabilityZone());
            }
            if (updateStackRequest.getDefaultSubnetId() != null) {
                jsonWriter.key("DefaultSubnetId").value(updateStackRequest.getDefaultSubnetId());
            }
            if (updateStackRequest.getCustomJson() != null) {
                jsonWriter.key("CustomJson").value(updateStackRequest.getCustomJson());
            }
            StackConfigurationManager configurationManager = updateStackRequest.getConfigurationManager();
            if (configurationManager != null) {

                jsonWriter.key("ConfigurationManager");
                jsonWriter.object();

                if (configurationManager.getName() != null) {
                    jsonWriter.key("Name").value(configurationManager.getName());
                }
                if (configurationManager.getVersion() != null) {
                    jsonWriter.key("Version").value(configurationManager.getVersion());
                }
                jsonWriter.endObject();
            }
            if (updateStackRequest.isUseCustomCookbooks() != null) {
                jsonWriter.key("UseCustomCookbooks").value(updateStackRequest.isUseCustomCookbooks());
            }
            Source customCookbooksSource = updateStackRequest.getCustomCookbooksSource();
            if (customCookbooksSource != null) {

                jsonWriter.key("CustomCookbooksSource");
                jsonWriter.object();

                if (customCookbooksSource.getType() != null) {
                    jsonWriter.key("Type").value(customCookbooksSource.getType());
                }
                if (customCookbooksSource.getUrl() != null) {
                    jsonWriter.key("Url").value(customCookbooksSource.getUrl());
                }
                if (customCookbooksSource.getUsername() != null) {
                    jsonWriter.key("Username").value(customCookbooksSource.getUsername());
                }
                if (customCookbooksSource.getPassword() != null) {
                    jsonWriter.key("Password").value(customCookbooksSource.getPassword());
                }
                if (customCookbooksSource.getSshKey() != null) {
                    jsonWriter.key("SshKey").value(customCookbooksSource.getSshKey());
                }
                if (customCookbooksSource.getRevision() != null) {
                    jsonWriter.key("Revision").value(customCookbooksSource.getRevision());
                }
                jsonWriter.endObject();
            }
            if (updateStackRequest.getDefaultSshKeyName() != null) {
                jsonWriter.key("DefaultSshKeyName").value(updateStackRequest.getDefaultSshKeyName());
            }
            if (updateStackRequest.getDefaultRootDeviceType() != null) {
                jsonWriter.key("DefaultRootDeviceType").value(updateStackRequest.getDefaultRootDeviceType());
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
