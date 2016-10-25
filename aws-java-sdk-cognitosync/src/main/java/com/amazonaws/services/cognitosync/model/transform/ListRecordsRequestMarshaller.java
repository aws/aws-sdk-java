/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
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

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitosync.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.SdkHttpUtils;
import com.amazonaws.protocol.json.*;

/**
 * ListRecordsRequest Marshaller
 */
public class ListRecordsRequestMarshaller implements Marshaller<Request<ListRecordsRequest>, ListRecordsRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public ListRecordsRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ListRecordsRequest> marshall(ListRecordsRequest listRecordsRequest) {

        if (listRecordsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListRecordsRequest> request = new DefaultRequest<ListRecordsRequest>(listRecordsRequest, "AmazonCognitoSync");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/identitypools/{IdentityPoolId}/identities/{IdentityId}/datasets/{DatasetName}/records";

        uriResourcePath = uriResourcePath
                .replace(
                        "{IdentityPoolId}",
                        (listRecordsRequest.getIdentityPoolId() != null) ? SdkHttpUtils.urlEncode(
                                StringUtils.fromString(listRecordsRequest.getIdentityPoolId()), false) : "");
        uriResourcePath = uriResourcePath.replace("{IdentityId}",
                (listRecordsRequest.getIdentityId() != null) ? SdkHttpUtils.urlEncode(StringUtils.fromString(listRecordsRequest.getIdentityId()), false) : "");
        uriResourcePath = uriResourcePath
                .replace(
                        "{DatasetName}",
                        (listRecordsRequest.getDatasetName() != null) ? SdkHttpUtils.urlEncode(StringUtils.fromString(listRecordsRequest.getDatasetName()),
                                false) : "");
        request.setResourcePath(uriResourcePath);

        if (listRecordsRequest.getLastSyncCount() != null) {
            request.addParameter("lastSyncCount", StringUtils.fromLong(listRecordsRequest.getLastSyncCount()));
        }

        if (listRecordsRequest.getNextToken() != null) {
            request.addParameter("nextToken", StringUtils.fromString(listRecordsRequest.getNextToken()));
        }

        if (listRecordsRequest.getMaxResults() != null) {
            request.addParameter("maxResults", StringUtils.fromInteger(listRecordsRequest.getMaxResults()));
        }

        if (listRecordsRequest.getSyncSessionToken() != null) {
            request.addParameter("syncSessionToken", StringUtils.fromString(listRecordsRequest.getSyncSessionToken()));
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
