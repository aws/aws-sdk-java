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
 * Complete Multipart Upload Request Marshaller
 */
public class CompleteMultipartUploadRequestMarshaller implements Marshaller<Request<CompleteMultipartUploadRequest>, CompleteMultipartUploadRequest> {

    private static final String RESOURCE_PATH_TEMPLATE;
    private static final Map<String, String> STATIC_QUERY_PARAMS;
    private static final Map<String, String> DYNAMIC_QUERY_PARAMS;
    static {
        String path = "/{accountId}/vaults/{vaultName}/multipart-uploads/{uploadId}";
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

    public Request<CompleteMultipartUploadRequest> marshall(CompleteMultipartUploadRequest completeMultipartUploadRequest) {
        if (completeMultipartUploadRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<CompleteMultipartUploadRequest> request = new DefaultRequest<CompleteMultipartUploadRequest>(completeMultipartUploadRequest, "AmazonGlacier");
        String target = "Glacier.CompleteMultipartUpload";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        if (completeMultipartUploadRequest.getArchiveSize() != null)
          request.addHeader("x-amz-archive-size", StringUtils.fromString(completeMultipartUploadRequest.getArchiveSize()));
        
        if (completeMultipartUploadRequest.getChecksum() != null)
          request.addHeader("x-amz-sha256-tree-hash", StringUtils.fromString(completeMultipartUploadRequest.getChecksum()));
        
        String uriResourcePath = RESOURCE_PATH_TEMPLATE;

        if (DYNAMIC_QUERY_PARAMS.containsKey("accountId")) {
            String name = DYNAMIC_QUERY_PARAMS.get("accountId");

            String value = (completeMultipartUploadRequest.getAccountId() == null) ? null : StringUtils.fromString(completeMultipartUploadRequest.getAccountId());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
            
        } else {
            uriResourcePath = uriResourcePath.replace("{accountId}", (completeMultipartUploadRequest.getAccountId() == null) ? "" : StringUtils.fromString(completeMultipartUploadRequest.getAccountId())); 
        } 
        if (DYNAMIC_QUERY_PARAMS.containsKey("vaultName")) {
            String name = DYNAMIC_QUERY_PARAMS.get("vaultName");

            String value = (completeMultipartUploadRequest.getVaultName() == null) ? null : StringUtils.fromString(completeMultipartUploadRequest.getVaultName());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
            
        } else {
            uriResourcePath = uriResourcePath.replace("{vaultName}", (completeMultipartUploadRequest.getVaultName() == null) ? "" : StringUtils.fromString(completeMultipartUploadRequest.getVaultName())); 
        } 
        if (DYNAMIC_QUERY_PARAMS.containsKey("uploadId")) {
            String name = DYNAMIC_QUERY_PARAMS.get("uploadId");

            String value = (completeMultipartUploadRequest.getUploadId() == null) ? null : StringUtils.fromString(completeMultipartUploadRequest.getUploadId());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
            
        } else {
            uriResourcePath = uriResourcePath.replace("{uploadId}", (completeMultipartUploadRequest.getUploadId() == null) ? "" : StringUtils.fromString(completeMultipartUploadRequest.getUploadId())); 
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
