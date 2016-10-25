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
package com.amazonaws.services.cloudsearchdomain.model.transform;

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
import com.amazonaws.services.cloudsearchdomain.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.SdkHttpUtils;
import com.amazonaws.protocol.json.*;

/**
 * SuggestRequest Marshaller
 */
public class SuggestRequestMarshaller implements Marshaller<Request<SuggestRequest>, SuggestRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public SuggestRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<SuggestRequest> marshall(SuggestRequest suggestRequest) {

        if (suggestRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SuggestRequest> request = new DefaultRequest<SuggestRequest>(suggestRequest, "AmazonCloudSearchDomain");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/2013-01-01/suggest?format=sdk&pretty=true";

        uriResourcePath = com.amazonaws.util.UriResourcePathUtils.addStaticQueryParamtersToRequest(request, uriResourcePath);

        request.setResourcePath(uriResourcePath);

        if (suggestRequest.getQuery() != null) {
            request.addParameter("q", StringUtils.fromString(suggestRequest.getQuery()));
        }

        if (suggestRequest.getSuggester() != null) {
            request.addParameter("suggester", StringUtils.fromString(suggestRequest.getSuggester()));
        }

        if (suggestRequest.getSize() != null) {
            request.addParameter("size", StringUtils.fromLong(suggestRequest.getSize()));
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
