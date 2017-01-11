/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glacier.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.glacier.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.protocol.json.*;

/**
 * ListJobsRequest Marshaller
 */
public class ListJobsRequestMarshaller implements Marshaller<Request<ListJobsRequest>, ListJobsRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public ListJobsRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ListJobsRequest> marshall(ListJobsRequest listJobsRequest) {

        if (listJobsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListJobsRequest> request = new DefaultRequest<ListJobsRequest>(listJobsRequest, "AmazonGlacier");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/{accountId}/vaults/{vaultName}/jobs";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "accountId",
                listJobsRequest.getAccountId() == null ? "-" : listJobsRequest.getAccountId());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "vaultName", listJobsRequest.getVaultName());
        request.setResourcePath(uriResourcePath);

        if (listJobsRequest.getLimit() != null) {
            request.addParameter("limit", StringUtils.fromString(listJobsRequest.getLimit()));
        }

        if (listJobsRequest.getMarker() != null) {
            request.addParameter("marker", StringUtils.fromString(listJobsRequest.getMarker()));
        }

        if (listJobsRequest.getStatuscode() != null) {
            request.addParameter("statuscode", StringUtils.fromString(listJobsRequest.getStatuscode()));
        }

        if (listJobsRequest.getCompleted() != null) {
            request.addParameter("completed", StringUtils.fromString(listJobsRequest.getCompleted()));
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
