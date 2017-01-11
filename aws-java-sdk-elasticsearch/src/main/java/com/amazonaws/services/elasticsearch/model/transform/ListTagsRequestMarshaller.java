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
package com.amazonaws.services.elasticsearch.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticsearch.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.protocol.json.*;

/**
 * ListTagsRequest Marshaller
 */
public class ListTagsRequestMarshaller implements Marshaller<Request<ListTagsRequest>, ListTagsRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public ListTagsRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ListTagsRequest> marshall(ListTagsRequest listTagsRequest) {

        if (listTagsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListTagsRequest> request = new DefaultRequest<ListTagsRequest>(listTagsRequest, "AWSElasticsearch");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/2015-01-01/tags/";

        request.setResourcePath(uriResourcePath);

        if (listTagsRequest.getARN() != null) {
            request.addParameter("arn", StringUtils.fromString(listTagsRequest.getARN()));
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
