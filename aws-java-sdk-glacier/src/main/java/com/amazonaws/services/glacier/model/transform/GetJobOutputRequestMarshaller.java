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
package com.amazonaws.services.glacier.model.transform;

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
import com.amazonaws.services.glacier.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Get Job Output Request Marshaller
 */
public class GetJobOutputRequestMarshaller implements Marshaller<Request<GetJobOutputRequest>, GetJobOutputRequest> {

    private static final String RESOURCE_PATH_TEMPLATE;
    private static final Map<String, String> STATIC_QUERY_PARAMS;
    private static final Map<String, String> DYNAMIC_QUERY_PARAMS;
    static {
        String path = "/{accountId}/vaults/{vaultName}/jobs/{jobId}/output";
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

    public Request<GetJobOutputRequest> marshall(GetJobOutputRequest getJobOutputRequest) {
        if (getJobOutputRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetJobOutputRequest> request = new DefaultRequest<GetJobOutputRequest>(getJobOutputRequest, "AmazonGlacier");
        String target = "Glacier.GetJobOutput";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.GET);
        if (getJobOutputRequest.getRange() != null)
          request.addHeader("Range", StringUtils.fromString(getJobOutputRequest.getRange()));
        
        String uriResourcePath = RESOURCE_PATH_TEMPLATE;

        if (DYNAMIC_QUERY_PARAMS.containsKey("accountId")) {
            String name = DYNAMIC_QUERY_PARAMS.get("accountId");

            String value = (getJobOutputRequest.getAccountId() == null) ? null : StringUtils.fromString(getJobOutputRequest.getAccountId());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
            
        } else {
            uriResourcePath = uriResourcePath.replace("{accountId}", (getJobOutputRequest.getAccountId() == null) ? "" : StringUtils.fromString(getJobOutputRequest.getAccountId())); 
        } 
        if (DYNAMIC_QUERY_PARAMS.containsKey("vaultName")) {
            String name = DYNAMIC_QUERY_PARAMS.get("vaultName");

            String value = (getJobOutputRequest.getVaultName() == null) ? null : StringUtils.fromString(getJobOutputRequest.getVaultName());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
            
        } else {
            uriResourcePath = uriResourcePath.replace("{vaultName}", (getJobOutputRequest.getVaultName() == null) ? "" : StringUtils.fromString(getJobOutputRequest.getVaultName())); 
        } 
        if (DYNAMIC_QUERY_PARAMS.containsKey("jobId")) {
            String name = DYNAMIC_QUERY_PARAMS.get("jobId");

            String value = (getJobOutputRequest.getJobId() == null) ? null : StringUtils.fromString(getJobOutputRequest.getJobId());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
            
        } else {
            uriResourcePath = uriResourcePath.replace("{jobId}", (getJobOutputRequest.getJobId() == null) ? "" : StringUtils.fromString(getJobOutputRequest.getJobId())); 
        } 

        request.setResourcePath(uriResourcePath.replaceAll("//", "/"));

        for (Map.Entry<String, String> entry : STATIC_QUERY_PARAMS.entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
