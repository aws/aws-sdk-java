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
        
        String uriResourcePath = "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}"; 
        uriResourcePath = uriResourcePath.replace("{IdentityPoolId}", (updateRecordsRequest.getIdentityPoolId() == null) ? "" : StringUtils.fromString(updateRecordsRequest.getIdentityPoolId())); 
        uriResourcePath = uriResourcePath.replace("{IdentityId}", (updateRecordsRequest.getIdentityId() == null) ? "" : StringUtils.fromString(updateRecordsRequest.getIdentityId())); 
        uriResourcePath = uriResourcePath.replace("{DatasetName}", (updateRecordsRequest.getDatasetName() == null) ? "" : StringUtils.fromString(updateRecordsRequest.getDatasetName())); 

        uriResourcePath = uriResourcePath.replaceAll("//", "/");

        if (uriResourcePath.contains("?")) {
            String queryString = uriResourcePath.substring(uriResourcePath.indexOf("?") + 1);
            uriResourcePath    = uriResourcePath.substring(0, uriResourcePath.indexOf("?"));

            for (String s : queryString.split("[;&]")) {
                String[] nameValuePair = s.split("=");
                if (nameValuePair.length == 2) {
                    if(!(nameValuePair[1].isEmpty()))
                        request.addParameter(nameValuePair[0], nameValuePair[1]);
                }
            }
        }
        request.setResourcePath(uriResourcePath);
        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          jsonWriter.object();

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
