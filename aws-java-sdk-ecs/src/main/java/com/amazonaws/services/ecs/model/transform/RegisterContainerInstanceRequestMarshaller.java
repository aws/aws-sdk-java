/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecs.model.transform;

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
import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Register Container Instance Request Marshaller
 */
public class RegisterContainerInstanceRequestMarshaller implements Marshaller<Request<RegisterContainerInstanceRequest>, RegisterContainerInstanceRequest> {

    public Request<RegisterContainerInstanceRequest> marshall(RegisterContainerInstanceRequest registerContainerInstanceRequest) {
        if (registerContainerInstanceRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<RegisterContainerInstanceRequest> request = new DefaultRequest<RegisterContainerInstanceRequest>(registerContainerInstanceRequest, "AmazonECS");
        String target = "AmazonEC2ContainerServiceV20141113.RegisterContainerInstance";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        request.setResourcePath("");
        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          jsonWriter.object();
          
            if (registerContainerInstanceRequest.getCluster() != null) {
                jsonWriter.key("cluster").value(registerContainerInstanceRequest.getCluster());
            }
            if (registerContainerInstanceRequest.getInstanceIdentityDocument() != null) {
                jsonWriter.key("instanceIdentityDocument").value(registerContainerInstanceRequest.getInstanceIdentityDocument());
            }
            if (registerContainerInstanceRequest.getInstanceIdentityDocumentSignature() != null) {
                jsonWriter.key("instanceIdentityDocumentSignature").value(registerContainerInstanceRequest.getInstanceIdentityDocumentSignature());
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<Resource> totalResourcesList = (com.amazonaws.internal.ListWithAutoConstructFlag<Resource>)(registerContainerInstanceRequest.getTotalResources());
            if (totalResourcesList != null && !(totalResourcesList.isAutoConstruct() && totalResourcesList.isEmpty())) {

                jsonWriter.key("totalResources");
                jsonWriter.array();

                for (Resource totalResourcesListValue : totalResourcesList) {
                    if (totalResourcesListValue != null) {
                        jsonWriter.object();
                        if (totalResourcesListValue.getName() != null) {
                            jsonWriter.key("name").value(totalResourcesListValue.getName());
                        }
                        if (totalResourcesListValue.getType() != null) {
                            jsonWriter.key("type").value(totalResourcesListValue.getType());
                        }
                        if (totalResourcesListValue.getDoubleValue() != null) {
                            jsonWriter.key("doubleValue").value(totalResourcesListValue.getDoubleValue());
                        }
                        if (totalResourcesListValue.getLongValue() != null) {
                            jsonWriter.key("longValue").value(totalResourcesListValue.getLongValue());
                        }
                        if (totalResourcesListValue.getIntegerValue() != null) {
                            jsonWriter.key("integerValue").value(totalResourcesListValue.getIntegerValue());
                        }

                        com.amazonaws.internal.ListWithAutoConstructFlag<String> stringSetValueList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(totalResourcesListValue.getStringSetValue());
                        if (stringSetValueList != null && !(stringSetValueList.isAutoConstruct() && stringSetValueList.isEmpty())) {

                            jsonWriter.key("stringSetValue");
                            jsonWriter.array();

                            for (String stringSetValueListValue : stringSetValueList) {
                                if (stringSetValueListValue != null) {
                                    jsonWriter.value(stringSetValueListValue);
                                }
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endArray();
            }
            VersionInfo versionInfo = registerContainerInstanceRequest.getVersionInfo();
            if (versionInfo != null) {

                jsonWriter.key("versionInfo");
                jsonWriter.object();

                if (versionInfo.getAgentVersion() != null) {
                    jsonWriter.key("agentVersion").value(versionInfo.getAgentVersion());
                }
                if (versionInfo.getAgentHash() != null) {
                    jsonWriter.key("agentHash").value(versionInfo.getAgentHash());
                }
                if (versionInfo.getDockerVersion() != null) {
                    jsonWriter.key("dockerVersion").value(versionInfo.getDockerVersion());
                }
                jsonWriter.endObject();
            }
            if (registerContainerInstanceRequest.getContainerInstanceArn() != null) {
                jsonWriter.key("containerInstanceArn").value(registerContainerInstanceRequest.getContainerInstanceArn());
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<Attribute> attributesList = (com.amazonaws.internal.ListWithAutoConstructFlag<Attribute>)(registerContainerInstanceRequest.getAttributes());
            if (attributesList != null && !(attributesList.isAutoConstruct() && attributesList.isEmpty())) {

                jsonWriter.key("attributes");
                jsonWriter.array();

                for (Attribute attributesListValue : attributesList) {
                    if (attributesListValue != null) {
                        jsonWriter.object();
                        if (attributesListValue.getName() != null) {
                            jsonWriter.key("name").value(attributesListValue.getName());
                        }
                        if (attributesListValue.getValue() != null) {
                            jsonWriter.key("value").value(attributesListValue.getValue());
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
