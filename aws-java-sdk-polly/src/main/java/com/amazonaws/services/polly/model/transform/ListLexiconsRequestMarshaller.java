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
package com.amazonaws.services.polly.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.polly.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.protocol.json.*;

/**
 * ListLexiconsRequest Marshaller
 */
public class ListLexiconsRequestMarshaller implements Marshaller<Request<ListLexiconsRequest>, ListLexiconsRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public ListLexiconsRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ListLexiconsRequest> marshall(ListLexiconsRequest listLexiconsRequest) {

        if (listLexiconsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListLexiconsRequest> request = new DefaultRequest<ListLexiconsRequest>(listLexiconsRequest, "AmazonPolly");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/v1/lexicons";

        request.setResourcePath(uriResourcePath);

        if (listLexiconsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(listLexiconsRequest.getNextToken()));
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
