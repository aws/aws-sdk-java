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
 * Initiate Job Request Marshaller
 */
public class InitiateJobRequestMarshaller implements Marshaller<Request<InitiateJobRequest>, InitiateJobRequest> {

    private static final String RESOURCE_PATH_TEMPLATE;
    private static final Map<String, String> STATIC_QUERY_PARAMS;
    private static final Map<String, String> DYNAMIC_QUERY_PARAMS;
    static {
        String path = "/{accountId}/vaults/{vaultName}/jobs";
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

    public Request<InitiateJobRequest> marshall(InitiateJobRequest initiateJobRequest) {
        if (initiateJobRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<InitiateJobRequest> request = new DefaultRequest<InitiateJobRequest>(initiateJobRequest, "AmazonGlacier");
        String target = "Glacier.InitiateJob";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        String uriResourcePath = RESOURCE_PATH_TEMPLATE;

        if (DYNAMIC_QUERY_PARAMS.containsKey("accountId")) {
            String name = DYNAMIC_QUERY_PARAMS.get("accountId");

            String value = (initiateJobRequest.getAccountId() == null) ? null : StringUtils.fromString(initiateJobRequest.getAccountId());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
            
        } else {
            uriResourcePath = uriResourcePath.replace("{accountId}", (initiateJobRequest.getAccountId() == null) ? "" : StringUtils.fromString(initiateJobRequest.getAccountId())); 
        } 
        if (DYNAMIC_QUERY_PARAMS.containsKey("vaultName")) {
            String name = DYNAMIC_QUERY_PARAMS.get("vaultName");

            String value = (initiateJobRequest.getVaultName() == null) ? null : StringUtils.fromString(initiateJobRequest.getVaultName());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
            
        } else {
            uriResourcePath = uriResourcePath.replace("{vaultName}", (initiateJobRequest.getVaultName() == null) ? "" : StringUtils.fromString(initiateJobRequest.getVaultName())); 
        } 

        request.setResourcePath(uriResourcePath.replaceAll("//", "/"));

        for (Map.Entry<String, String> entry : STATIC_QUERY_PARAMS.entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

            JobParameters jobParameters = initiateJobRequest.getJobParameters();
            if (jobParameters != null) {

                jsonWriter.object();

                if (jobParameters.getFormat() != null) {
                    jsonWriter.key("Format").value(jobParameters.getFormat());
                }
                if (jobParameters.getType() != null) {
                    jsonWriter.key("Type").value(jobParameters.getType());
                }
                if (jobParameters.getArchiveId() != null) {
                    jsonWriter.key("ArchiveId").value(jobParameters.getArchiveId());
                }
                if (jobParameters.getDescription() != null) {
                    jsonWriter.key("Description").value(jobParameters.getDescription());
                }
                if (jobParameters.getSNSTopic() != null) {
                    jsonWriter.key("SNSTopic").value(jobParameters.getSNSTopic());
                }
                if (jobParameters.getRetrievalByteRange() != null) {
                    jsonWriter.key("RetrievalByteRange").value(jobParameters.getRetrievalByteRange());
                }
                InventoryRetrievalJobInput inventoryRetrievalParameters = jobParameters.getInventoryRetrievalParameters();
                if (inventoryRetrievalParameters != null) {

                    jsonWriter.key("InventoryRetrievalParameters");
                    jsonWriter.object();

                    if (inventoryRetrievalParameters.getStartDate() != null) {
                        jsonWriter.key("StartDate").value(inventoryRetrievalParameters.getStartDate());
                    }
                    if (inventoryRetrievalParameters.getEndDate() != null) {
                        jsonWriter.key("EndDate").value(inventoryRetrievalParameters.getEndDate());
                    }
                    if (inventoryRetrievalParameters.getLimit() != null) {
                        jsonWriter.key("Limit").value(inventoryRetrievalParameters.getLimit());
                    }
                    if (inventoryRetrievalParameters.getMarker() != null) {
                        jsonWriter.key("Marker").value(inventoryRetrievalParameters.getMarker());
                    }
                    jsonWriter.endObject();
                }
                jsonWriter.endObject();
            }

          String snippet = stringWriter.toString();
          byte[] content = snippet.getBytes(UTF8);
          request.setContent(new StringInputStream(snippet));
          request.addHeader("Content-Length", Integer.toString(content.length));
          request.addHeader("Content-Type", "application/x-amz-json-1.0");
        } catch(Throwable t) {
          throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }
}
