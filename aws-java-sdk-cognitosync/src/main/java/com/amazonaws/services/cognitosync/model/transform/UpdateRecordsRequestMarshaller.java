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
package com.amazonaws.services.cognitosync.model.transform;

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
import com.amazonaws.services.cognitosync.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Update Records Request Marshaller
 */
public class UpdateRecordsRequestMarshaller implements Marshaller<Request<UpdateRecordsRequest>, UpdateRecordsRequest> {

    private static final String RESOURCE_PATH_TEMPLATE;
    private static final Map<String, String> STATIC_QUERY_PARAMS;
    private static final Map<String, String> DYNAMIC_QUERY_PARAMS;
    static {
        String path = "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}";
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

    public Request<UpdateRecordsRequest> marshall(UpdateRecordsRequest updateRecordsRequest) {
        if (updateRecordsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateRecordsRequest> request = new DefaultRequest<UpdateRecordsRequest>(updateRecordsRequest, "AmazonCognitoSync");
        String target = "AWSCognitoSyncService.UpdateRecords";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        if (updateRecordsRequest.getClientContext() != null)
          request.addHeader("x-amz-Client-Context", StringUtils.fromString(updateRecordsRequest.getClientContext()));
        
        String uriResourcePath = RESOURCE_PATH_TEMPLATE;

        if (DYNAMIC_QUERY_PARAMS.containsKey("IdentityPoolId")) {
            String name = DYNAMIC_QUERY_PARAMS.get("IdentityPoolId");
            String value = (updateRecordsRequest.getIdentityPoolId() == null) ? null : StringUtils.fromString(updateRecordsRequest.getIdentityPoolId());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{IdentityPoolId}", (updateRecordsRequest.getIdentityPoolId() == null) ? "" : StringUtils.fromString(updateRecordsRequest.getIdentityPoolId())); 
        }
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("IdentityId")) {
            String name = DYNAMIC_QUERY_PARAMS.get("IdentityId");
            String value = (updateRecordsRequest.getIdentityId() == null) ? null : StringUtils.fromString(updateRecordsRequest.getIdentityId());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{IdentityId}", (updateRecordsRequest.getIdentityId() == null) ? "" : StringUtils.fromString(updateRecordsRequest.getIdentityId())); 
        }
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("DatasetName")) {
            String name = DYNAMIC_QUERY_PARAMS.get("DatasetName");
            String value = (updateRecordsRequest.getDatasetName() == null) ? null : StringUtils.fromString(updateRecordsRequest.getDatasetName());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{DatasetName}", (updateRecordsRequest.getDatasetName() == null) ? "" : StringUtils.fromString(updateRecordsRequest.getDatasetName())); 
        }

        request.setResourcePath(uriResourcePath.replaceAll("//", "/"));

        for (Map.Entry<String, String> entry : STATIC_QUERY_PARAMS.entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          jsonWriter.object();
          
            if (updateRecordsRequest.getDeviceId() != null) {
                jsonWriter.key("DeviceId").value(updateRecordsRequest.getDeviceId());
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<RecordPatch> recordPatchesList = (com.amazonaws.internal.ListWithAutoConstructFlag<RecordPatch>)(updateRecordsRequest.getRecordPatches());
            if (recordPatchesList != null && !(recordPatchesList.isAutoConstruct() && recordPatchesList.isEmpty())) {

                jsonWriter.key("RecordPatches");
                jsonWriter.array();

                for (RecordPatch recordPatchesListValue : recordPatchesList) {
                    if (recordPatchesListValue != null) {
                        jsonWriter.object();
                        if (recordPatchesListValue.getOp() != null) {
                            jsonWriter.key("Op").value(recordPatchesListValue.getOp());
                        }
                        if (recordPatchesListValue.getKey() != null) {
                            jsonWriter.key("Key").value(recordPatchesListValue.getKey());
                        }
                        if (recordPatchesListValue.getValue() != null) {
                            jsonWriter.key("Value").value(recordPatchesListValue.getValue());
                        }
                        if (recordPatchesListValue.getSyncCount() != null) {
                            jsonWriter.key("SyncCount").value(recordPatchesListValue.getSyncCount());
                        }
                        if (recordPatchesListValue.getDeviceLastModifiedDate() != null) {
                            jsonWriter.key("DeviceLastModifiedDate").value(recordPatchesListValue.getDeviceLastModifiedDate());
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endArray();
            }
            if (updateRecordsRequest.getSyncSessionToken() != null) {
                jsonWriter.key("SyncSessionToken").value(updateRecordsRequest.getSyncSessionToken());
            }

          jsonWriter.endObject();

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
