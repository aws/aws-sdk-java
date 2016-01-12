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
 * ListRecordsRequest Marshaller
 */
public class ListRecordsRequestMarshaller implements
        Marshaller<Request<ListRecordsRequest>, ListRecordsRequest> {

    private static final String DEFAULT_CONTENT_TYPE = "application/x-amz-json-1.1";

    public Request<ListRecordsRequest> marshall(
            ListRecordsRequest listRecordsRequest) {

        if (listRecordsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ListRecordsRequest> request = new DefaultRequest<ListRecordsRequest>(
                listRecordsRequest, "AmazonCognitoSync");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}/records";

        uriResourcePath = uriResourcePath.replace(
                "{IdentityPoolId}",
                (listRecordsRequest.getIdentityPoolId() == null) ? ""
                        : StringUtils.fromString(listRecordsRequest
                                .getIdentityPoolId()));
        uriResourcePath = uriResourcePath.replace(
                "{IdentityId}",
                (listRecordsRequest.getIdentityId() == null) ? "" : StringUtils
                        .fromString(listRecordsRequest.getIdentityId()));
        uriResourcePath = uriResourcePath.replace(
                "{DatasetName}",
                (listRecordsRequest.getDatasetName() == null) ? ""
                        : StringUtils.fromString(listRecordsRequest
                                .getDatasetName()));
        request.setResourcePath(uriResourcePath);

        String lastSyncCount = (listRecordsRequest.getLastSyncCount() == null) ? null
                : StringUtils.fromLong(listRecordsRequest.getLastSyncCount());
        if (lastSyncCount != null) {
            request.addParameter("lastSyncCount", lastSyncCount);
        }

        String nextToken = (listRecordsRequest.getNextToken() == null) ? null
                : StringUtils.fromString(listRecordsRequest.getNextToken());
        if (nextToken != null) {
            request.addParameter("nextToken", nextToken);
        }

        String maxResults = (listRecordsRequest.getMaxResults() == null) ? null
                : StringUtils.fromInteger(listRecordsRequest.getMaxResults());
        if (maxResults != null) {
            request.addParameter("maxResults", maxResults);
        }

        String syncSessionToken = (listRecordsRequest.getSyncSessionToken() == null) ? null
                : StringUtils.fromString(listRecordsRequest
                        .getSyncSessionToken());
        if (syncSessionToken != null) {
            request.addParameter("syncSessionToken", syncSessionToken);
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", DEFAULT_CONTENT_TYPE);
        }

        return request;
    }

}
