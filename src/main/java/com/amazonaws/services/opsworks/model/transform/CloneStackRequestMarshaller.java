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
 * Clone Stack Request Marshaller
 */
public class CloneStackRequestMarshaller implements Marshaller<Request<CloneStackRequest>, CloneStackRequest> {

    

    public Request<CloneStackRequest> marshall(CloneStackRequest cloneStackRequest) {
    if (cloneStackRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<CloneStackRequest> request = new DefaultRequest<CloneStackRequest>(cloneStackRequest, "AWSOpsWorks");
        String target = "OpsWorks_20130218.CloneStack";
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
          
            if (cloneStackRequest.getSourceStackId() != null) {
                jsonWriter.key("SourceStackId").value(cloneStackRequest.getSourceStackId());
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
            if (cloneStackRequest.getAttributes() != null) {
                jsonWriter.key("Attributes");
                jsonWriter.object();
                for (Map.Entry<String, String> attributesListValue : cloneStackRequest.getAttributes().entrySet()) {
                    if (attributesListValue.getValue() != null) {
                        jsonWriter.key(attributesListValue.getKey());

                        jsonWriter.value(attributesListValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }
            if (cloneStackRequest.getServiceRoleArn() != null) {
                jsonWriter.key("ServiceRoleArn").value(cloneStackRequest.getServiceRoleArn());
            }
            if (cloneStackRequest.getDefaultInstanceProfileArn() != null) {
                jsonWriter.key("DefaultInstanceProfileArn").value(cloneStackRequest.getDefaultInstanceProfileArn());
            }
            if (cloneStackRequest.getDefaultOs() != null) {
                jsonWriter.key("DefaultOs").value(cloneStackRequest.getDefaultOs());
            }
            if (cloneStackRequest.getHostnameTheme() != null) {
                jsonWriter.key("HostnameTheme").value(cloneStackRequest.getHostnameTheme());
            }
            if (cloneStackRequest.getDefaultAvailabilityZone() != null) {
                jsonWriter.key("DefaultAvailabilityZone").value(cloneStackRequest.getDefaultAvailabilityZone());
            }
            if (cloneStackRequest.getDefaultSubnetId() != null) {
                jsonWriter.key("DefaultSubnetId").value(cloneStackRequest.getDefaultSubnetId());
            }
            if (cloneStackRequest.getCustomJson() != null) {
                jsonWriter.key("CustomJson").value(cloneStackRequest.getCustomJson());
            }
            StackConfigurationManager configurationManager = cloneStackRequest.getConfigurationManager();
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
            if (cloneStackRequest.isUseCustomCookbooks() != null) {
                jsonWriter.key("UseCustomCookbooks").value(cloneStackRequest.isUseCustomCookbooks());
            }
            Source customCookbooksSource = cloneStackRequest.getCustomCookbooksSource();
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
            if (cloneStackRequest.getDefaultSshKeyName() != null) {
                jsonWriter.key("DefaultSshKeyName").value(cloneStackRequest.getDefaultSshKeyName());
            }
            if (cloneStackRequest.isClonePermissions() != null) {
                jsonWriter.key("ClonePermissions").value(cloneStackRequest.isClonePermissions());
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<String> cloneAppIdsList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(cloneStackRequest.getCloneAppIds());
            if (cloneAppIdsList != null && !(cloneAppIdsList.isAutoConstruct() && cloneAppIdsList.isEmpty())) {

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
                jsonWriter.key("DefaultRootDeviceType").value(cloneStackRequest.getDefaultRootDeviceType());
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
