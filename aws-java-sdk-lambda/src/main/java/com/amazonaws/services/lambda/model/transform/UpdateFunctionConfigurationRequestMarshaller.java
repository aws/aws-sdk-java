/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model.transform;

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
import com.amazonaws.services.lambda.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Update Function Configuration Request Marshaller
 */
public class UpdateFunctionConfigurationRequestMarshaller implements Marshaller<Request<UpdateFunctionConfigurationRequest>, UpdateFunctionConfigurationRequest> {

    private static final String RESOURCE_PATH_TEMPLATE;
    private static final Map<String, String> STATIC_QUERY_PARAMS;
    private static final Map<String, String> DYNAMIC_QUERY_PARAMS;
    static {
        String path = "/2015-03-31/functions/{FunctionName}/configuration";
        Map<String, String> staticMap = new HashMap<String, String>();
        Map<String, String> dynamicMap = new HashMap<String, String>();

        int index = path.indexOf("?");
        if (index != -1) {
            String queryString = path.substring(index + 1);
            path = path.substring(0, index);

            for (String s : queryString.split("[;&]")) {
                index = s.indexOf("=");
                if (index != -1) {
                    String name = s.substring(0, index);
                    String value = s.substring(index + 1);

                    if (value.startsWith("{") && value.endsWith("}")) {
                        dynamicMap.put(value.substring(1, value.length() - 1), name);
                    } else {
                        staticMap.put(name, value);
                    }
                }
            }
        }

        RESOURCE_PATH_TEMPLATE = path;
        STATIC_QUERY_PARAMS = Collections.unmodifiableMap(staticMap);
        DYNAMIC_QUERY_PARAMS = Collections.unmodifiableMap(dynamicMap);
    }

    public Request<UpdateFunctionConfigurationRequest> marshall(UpdateFunctionConfigurationRequest updateFunctionConfigurationRequest) {
        if (updateFunctionConfigurationRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateFunctionConfigurationRequest> request = new DefaultRequest<UpdateFunctionConfigurationRequest>(updateFunctionConfigurationRequest, "AWSLambda");
        String target = "AWSLambda.UpdateFunctionConfiguration";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.PUT);
        String uriResourcePath = RESOURCE_PATH_TEMPLATE;

        if (DYNAMIC_QUERY_PARAMS.containsKey("FunctionName")) {
            String name = DYNAMIC_QUERY_PARAMS.get("FunctionName");

            String value = (updateFunctionConfigurationRequest.getFunctionName() == null) ? null : StringUtils.fromString(updateFunctionConfigurationRequest.getFunctionName());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
            
        } else {
            uriResourcePath = uriResourcePath.replace("{FunctionName}", (updateFunctionConfigurationRequest.getFunctionName() == null) ? "" : StringUtils.fromString(updateFunctionConfigurationRequest.getFunctionName())); 
        } 

        request.setResourcePath(uriResourcePath.replaceAll("//", "/"));

        for (Map.Entry<String, String> entry : STATIC_QUERY_PARAMS.entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          jsonWriter.object();
          
            if (updateFunctionConfigurationRequest.getRole() != null) {
                jsonWriter.key("Role").value(updateFunctionConfigurationRequest.getRole());
            }
            if (updateFunctionConfigurationRequest.getHandler() != null) {
                jsonWriter.key("Handler").value(updateFunctionConfigurationRequest.getHandler());
            }
            if (updateFunctionConfigurationRequest.getDescription() != null) {
                jsonWriter.key("Description").value(updateFunctionConfigurationRequest.getDescription());
            }
            if (updateFunctionConfigurationRequest.getTimeout() != null) {
                jsonWriter.key("Timeout").value(updateFunctionConfigurationRequest.getTimeout());
            }
            if (updateFunctionConfigurationRequest.getMemorySize() != null) {
                jsonWriter.key("MemorySize").value(updateFunctionConfigurationRequest.getMemorySize());
            }
            VpcConfig vpcConfig = updateFunctionConfigurationRequest.getVpcConfig();
            if (vpcConfig != null) {

                jsonWriter.key("VpcConfig");
                jsonWriter.object();

                com.amazonaws.internal.ListWithAutoConstructFlag<String> subnetIdsList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(vpcConfig.getSubnetIds());
                if (subnetIdsList != null && !(subnetIdsList.isAutoConstruct() && subnetIdsList.isEmpty())) {

                    jsonWriter.key("SubnetIds");
                    jsonWriter.array();

                    for (String subnetIdsListValue : subnetIdsList) {
                        if (subnetIdsListValue != null) {
                            jsonWriter.value(subnetIdsListValue);
                        }
                    }
                    jsonWriter.endArray();
                }

                com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupIdsList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(vpcConfig.getSecurityGroupIds());
                if (securityGroupIdsList != null && !(securityGroupIdsList.isAutoConstruct() && securityGroupIdsList.isEmpty())) {

                    jsonWriter.key("SecurityGroupIds");
                    jsonWriter.array();

                    for (String securityGroupIdsListValue : securityGroupIdsList) {
                        if (securityGroupIdsListValue != null) {
                            jsonWriter.value(securityGroupIdsListValue);
                        }
                    }
                    jsonWriter.endArray();
                }
                jsonWriter.endObject();
            }
            if (updateFunctionConfigurationRequest.getRuntime() != null) {
                jsonWriter.key("Runtime").value(updateFunctionConfigurationRequest.getRuntime());
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
