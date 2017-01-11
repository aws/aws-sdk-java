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
package com.amazonaws.services.elasticfilesystem.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticfilesystem.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.protocol.json.*;

/**
 * DescribeTagsRequest Marshaller
 */
public class DescribeTagsRequestMarshaller implements Marshaller<Request<DescribeTagsRequest>, DescribeTagsRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public DescribeTagsRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DescribeTagsRequest> marshall(DescribeTagsRequest describeTagsRequest) {

        if (describeTagsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeTagsRequest> request = new DefaultRequest<DescribeTagsRequest>(describeTagsRequest, "AmazonElasticFileSystem");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/2015-02-01/tags/{FileSystemId}/";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "FileSystemId", describeTagsRequest.getFileSystemId());
        request.setResourcePath(uriResourcePath);

        if (describeTagsRequest.getMaxItems() != null) {
            request.addParameter("MaxItems", StringUtils.fromInteger(describeTagsRequest.getMaxItems()));
        }

        if (describeTagsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeTagsRequest.getMarker()));
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
