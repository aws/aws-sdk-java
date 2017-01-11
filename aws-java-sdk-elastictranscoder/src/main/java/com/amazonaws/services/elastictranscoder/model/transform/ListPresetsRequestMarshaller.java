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
package com.amazonaws.services.elastictranscoder.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elastictranscoder.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.protocol.json.*;

/**
 * ListPresetsRequest Marshaller
 */
public class ListPresetsRequestMarshaller implements Marshaller<Request<ListPresetsRequest>, ListPresetsRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public ListPresetsRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ListPresetsRequest> marshall(ListPresetsRequest listPresetsRequest) {

        if (listPresetsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListPresetsRequest> request = new DefaultRequest<ListPresetsRequest>(listPresetsRequest, "AmazonElasticTranscoder");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/2012-09-25/presets";

        request.setResourcePath(uriResourcePath);

        if (listPresetsRequest.getAscending() != null) {
            request.addParameter("Ascending", StringUtils.fromString(listPresetsRequest.getAscending()));
        }

        if (listPresetsRequest.getPageToken() != null) {
            request.addParameter("PageToken", StringUtils.fromString(listPresetsRequest.getPageToken()));
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
