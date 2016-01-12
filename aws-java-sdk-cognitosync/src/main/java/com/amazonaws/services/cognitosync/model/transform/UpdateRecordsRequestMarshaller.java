/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
 * UpdateRecordsRequest Marshaller
 */
public class UpdateRecordsRequestMarshaller implements
        Marshaller<Request<UpdateRecordsRequest>, UpdateRecordsRequest> {

    private static final String DEFAULT_CONTENT_TYPE = "application/x-amz-json-1.1";

    public Request<UpdateRecordsRequest> marshall(
            UpdateRecordsRequest updateRecordsRequest) {

        if (updateRecordsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<UpdateRecordsRequest> request = new DefaultRequest<UpdateRecordsRequest>(
                updateRecordsRequest, "AmazonCognitoSync");

        request.setHttpMethod(HttpMethodName.POST);

        if (updateRecordsRequest.getClientContext() != null) {
            request.addHeader("x-amz-Client-Context", StringUtils
                    .fromString(updateRecordsRequest.getClientContext()));
        }

        String uriResourcePath = "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}";

        uriResourcePath = uriResourcePath.replace(
                "{IdentityPoolId}",
                (updateRecordsRequest.getIdentityPoolId() == null) ? ""
                        : StringUtils.fromString(updateRecordsRequest
                                .getIdentityPoolId()));
        uriResourcePath = uriResourcePath.replace(
                "{IdentityId}",
                (updateRecordsRequest.getIdentityId() == null) ? ""
                        : StringUtils.fromString(updateRecordsRequest
                                .getIdentityId()));
        uriResourcePath = uriResourcePath.replace(
                "{DatasetName}",
                (updateRecordsRequest.getDatasetName() == null) ? ""
                        : StringUtils.fromString(updateRecordsRequest
                                .getDatasetName()));
        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (updateRecordsRequest.getDeviceId() != null) {
                jsonWriter.key("DeviceId").value(
                        updateRecordsRequest.getDeviceId());
            }

            com.amazonaws.internal.SdkInternalList<RecordPatch> recordPatchesList = (com.amazonaws.internal.SdkInternalList<RecordPatch>) updateRecordsRequest
                    .getRecordPatches();
            if (!recordPatchesList.isEmpty()
                    || !recordPatchesList.isAutoConstruct()) {
                jsonWriter.key("RecordPatches");
                jsonWriter.array();
                for (RecordPatch recordPatchesListValue : recordPatchesList) {
                    if (recordPatchesListValue != null) {

                        RecordPatchJsonMarshaller.getInstance().marshall(
                                recordPatchesListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (updateRecordsRequest.getSyncSessionToken() != null) {
                jsonWriter.key("SyncSessionToken").value(
                        updateRecordsRequest.getSyncSessionToken());
            }

            jsonWriter.endObject();

            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length",
                    Integer.toString(content.length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", DEFAULT_CONTENT_TYPE);
            }
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
