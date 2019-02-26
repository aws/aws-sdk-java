/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.opensdk.protect.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.protocol.json.SdkJsonMarshallerFactory;
import com.amazonaws.opensdk.model.RawRequest;
import com.amazonaws.transform.Marshaller;

public class RawRequestMarshaller implements Marshaller<Request<RawRequest>, RawRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public RawRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    @Override
    public Request<RawRequest> marshall(RawRequest rawRequestRequest) {
        if (rawRequestRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<RawRequest> request = new DefaultRequest<>("MyService");

        request.setHttpMethod(rawRequestRequest.httpMethod());
        request.setResourcePath(rawRequestRequest.path());
        request.setContent(rawRequestRequest.payload());

        // Custom headers and query params are set later in the runtime
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }
}
