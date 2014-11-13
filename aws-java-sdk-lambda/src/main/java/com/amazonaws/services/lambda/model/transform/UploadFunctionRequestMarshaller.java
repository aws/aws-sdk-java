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
 * Upload Function Request Marshaller
 */
public class UploadFunctionRequestMarshaller implements Marshaller<Request<UploadFunctionRequest>, UploadFunctionRequest> {

    private static final String RESOURCE_PATH_TEMPLATE;
    private static final Map<String, String> STATIC_QUERY_PARAMS;
    private static final Map<String, String> DYNAMIC_QUERY_PARAMS;
    static {
        String path = "/2014-11-13/functions/{FunctionName}?Description={Description}&Handler={Handler}&MemorySize={MemorySize}&Mode={Mode}&Role={Role}&Runtime={Runtime}&Timeout={Timeout}";
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

    public Request<UploadFunctionRequest> marshall(UploadFunctionRequest uploadFunctionRequest) {
        if (uploadFunctionRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<UploadFunctionRequest> request = new DefaultRequest<UploadFunctionRequest>(uploadFunctionRequest, "AWSLambda");
        String target = "AWSLambda.UploadFunction";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.PUT);
        String uriResourcePath = RESOURCE_PATH_TEMPLATE;

        if (DYNAMIC_QUERY_PARAMS.containsKey("FunctionName")) {
            String name = DYNAMIC_QUERY_PARAMS.get("FunctionName");
            String value = (uploadFunctionRequest.getFunctionName() == null) ? null : StringUtils.fromString(uploadFunctionRequest.getFunctionName());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{FunctionName}", (uploadFunctionRequest.getFunctionName() == null) ? "" : StringUtils.fromString(uploadFunctionRequest.getFunctionName())); 
        }
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("Runtime")) {
            String name = DYNAMIC_QUERY_PARAMS.get("Runtime");
            String value = (uploadFunctionRequest.getRuntime() == null) ? null : StringUtils.fromString(uploadFunctionRequest.getRuntime());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{Runtime}", (uploadFunctionRequest.getRuntime() == null) ? "" : StringUtils.fromString(uploadFunctionRequest.getRuntime())); 
        }
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("Role")) {
            String name = DYNAMIC_QUERY_PARAMS.get("Role");
            String value = (uploadFunctionRequest.getRole() == null) ? null : StringUtils.fromString(uploadFunctionRequest.getRole());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{Role}", (uploadFunctionRequest.getRole() == null) ? "" : StringUtils.fromString(uploadFunctionRequest.getRole())); 
        }
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("Handler")) {
            String name = DYNAMIC_QUERY_PARAMS.get("Handler");
            String value = (uploadFunctionRequest.getHandler() == null) ? null : StringUtils.fromString(uploadFunctionRequest.getHandler());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{Handler}", (uploadFunctionRequest.getHandler() == null) ? "" : StringUtils.fromString(uploadFunctionRequest.getHandler())); 
        }
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("Mode")) {
            String name = DYNAMIC_QUERY_PARAMS.get("Mode");
            String value = (uploadFunctionRequest.getMode() == null) ? null : StringUtils.fromString(uploadFunctionRequest.getMode());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{Mode}", (uploadFunctionRequest.getMode() == null) ? "" : StringUtils.fromString(uploadFunctionRequest.getMode())); 
        }
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("Description")) {
            String name = DYNAMIC_QUERY_PARAMS.get("Description");
            String value = (uploadFunctionRequest.getDescription() == null) ? null : StringUtils.fromString(uploadFunctionRequest.getDescription());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{Description}", (uploadFunctionRequest.getDescription() == null) ? "" : StringUtils.fromString(uploadFunctionRequest.getDescription())); 
        }
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("Timeout")) {
            String name = DYNAMIC_QUERY_PARAMS.get("Timeout");
            String value = (uploadFunctionRequest.getTimeout() == null) ? null : StringUtils.fromInteger(uploadFunctionRequest.getTimeout());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{Timeout}", (uploadFunctionRequest.getTimeout() == null) ? "" : StringUtils.fromInteger(uploadFunctionRequest.getTimeout())); 
        }
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("MemorySize")) {
            String name = DYNAMIC_QUERY_PARAMS.get("MemorySize");
            String value = (uploadFunctionRequest.getMemorySize() == null) ? null : StringUtils.fromInteger(uploadFunctionRequest.getMemorySize());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{MemorySize}", (uploadFunctionRequest.getMemorySize() == null) ? "" : StringUtils.fromInteger(uploadFunctionRequest.getMemorySize())); 
        }

        request.setResourcePath(uriResourcePath.replaceAll("//", "/"));

        for (Map.Entry<String, String> entry : STATIC_QUERY_PARAMS.entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

        request.setContent(uploadFunctionRequest.getFunctionZip());
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "binary/octet-stream");
        }

        return request;
    }
}
