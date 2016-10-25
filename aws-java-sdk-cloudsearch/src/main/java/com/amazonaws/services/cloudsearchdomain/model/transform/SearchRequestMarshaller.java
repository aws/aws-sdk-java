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
 * SearchRequest Marshaller
 */
public class SearchRequestMarshaller implements Marshaller<Request<SearchRequest>, SearchRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public SearchRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<SearchRequest> marshall(SearchRequest searchRequest) {

        if (searchRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SearchRequest> request = new DefaultRequest<SearchRequest>(searchRequest, "AmazonCloudSearchDomain");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/2013-01-01/search?format=sdk&pretty=true";

        uriResourcePath = com.amazonaws.util.UriResourcePathUtils.addStaticQueryParamtersToRequest(request, uriResourcePath);

        request.setResourcePath(uriResourcePath);

        if (searchRequest.getCursor() != null) {
            request.addParameter("cursor", StringUtils.fromString(searchRequest.getCursor()));
        }

        if (searchRequest.getExpr() != null) {
            request.addParameter("expr", StringUtils.fromString(searchRequest.getExpr()));
        }

        if (searchRequest.getFacet() != null) {
            request.addParameter("facet", StringUtils.fromString(searchRequest.getFacet()));
        }

        if (searchRequest.getFilterQuery() != null) {
            request.addParameter("fq", StringUtils.fromString(searchRequest.getFilterQuery()));
        }

        if (searchRequest.getHighlight() != null) {
            request.addParameter("highlight", StringUtils.fromString(searchRequest.getHighlight()));
        }

        if (searchRequest.getPartial() != null) {
            request.addParameter("partial", StringUtils.fromBoolean(searchRequest.getPartial()));
        }

        if (searchRequest.getQuery() != null) {
            request.addParameter("q", StringUtils.fromString(searchRequest.getQuery()));
        }

        if (searchRequest.getQueryOptions() != null) {
            request.addParameter("q.options", StringUtils.fromString(searchRequest.getQueryOptions()));
        }

        if (searchRequest.getQueryParser() != null) {
            request.addParameter("q.parser", StringUtils.fromString(searchRequest.getQueryParser()));
        }

        if (searchRequest.getReturn() != null) {
            request.addParameter("return", StringUtils.fromString(searchRequest.getReturn()));
        }

        if (searchRequest.getSize() != null) {
            request.addParameter("size", StringUtils.fromLong(searchRequest.getSize()));
        }

        if (searchRequest.getSort() != null) {
            request.addParameter("sort", StringUtils.fromString(searchRequest.getSort()));
        }

        if (searchRequest.getStart() != null) {
            request.addParameter("start", StringUtils.fromLong(searchRequest.getStart()));
        }

        if (searchRequest.getStats() != null) {
            request.addParameter("stats", StringUtils.fromString(searchRequest.getStats()));
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
