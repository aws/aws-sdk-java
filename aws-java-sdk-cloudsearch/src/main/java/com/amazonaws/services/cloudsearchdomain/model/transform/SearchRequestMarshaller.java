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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudsearchdomain.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * SearchRequest Marshaller
 */
public class SearchRequestMarshaller implements
        Marshaller<Request<SearchRequest>, SearchRequest> {

    private static final String DEFAULT_CONTENT_TYPE = "application/x-amz-json-1.1";

    public Request<SearchRequest> marshall(SearchRequest searchRequest) {

        if (searchRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<SearchRequest> request = new DefaultRequest<SearchRequest>(
                searchRequest, "AmazonCloudSearchDomain");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/2013-01-01/search?format=sdk&pretty=true";

        uriResourcePath = com.amazonaws.util.UriResourcePathUtils
                .addStaticQueryParamtersToRequest(request, uriResourcePath);

        request.setResourcePath(uriResourcePath);

        String cursor = (searchRequest.getCursor() == null) ? null
                : StringUtils.fromString(searchRequest.getCursor());
        if (cursor != null) {
            request.addParameter("cursor", cursor);
        }

        String expr = (searchRequest.getExpr() == null) ? null : StringUtils
                .fromString(searchRequest.getExpr());
        if (expr != null) {
            request.addParameter("expr", expr);
        }

        String facet = (searchRequest.getFacet() == null) ? null : StringUtils
                .fromString(searchRequest.getFacet());
        if (facet != null) {
            request.addParameter("facet", facet);
        }

        String filterQuery = (searchRequest.getFilterQuery() == null) ? null
                : StringUtils.fromString(searchRequest.getFilterQuery());
        if (filterQuery != null) {
            request.addParameter("fq", filterQuery);
        }

        String highlight = (searchRequest.getHighlight() == null) ? null
                : StringUtils.fromString(searchRequest.getHighlight());
        if (highlight != null) {
            request.addParameter("highlight", highlight);
        }

        String partial = (searchRequest.getPartial() == null) ? null
                : StringUtils.fromBoolean(searchRequest.getPartial());
        if (partial != null) {
            request.addParameter("partial", partial);
        }

        String query = (searchRequest.getQuery() == null) ? null : StringUtils
                .fromString(searchRequest.getQuery());
        if (query != null) {
            request.addParameter("q", query);
        }

        String queryOptions = (searchRequest.getQueryOptions() == null) ? null
                : StringUtils.fromString(searchRequest.getQueryOptions());
        if (queryOptions != null) {
            request.addParameter("q.options", queryOptions);
        }

        String queryParser = (searchRequest.getQueryParser() == null) ? null
                : StringUtils.fromString(searchRequest.getQueryParser());
        if (queryParser != null) {
            request.addParameter("q.parser", queryParser);
        }

        String returnValue = (searchRequest.getReturn() == null) ? null
                : StringUtils.fromString(searchRequest.getReturn());
        if (returnValue != null) {
            request.addParameter("return", returnValue);
        }

        String size = (searchRequest.getSize() == null) ? null : StringUtils
                .fromLong(searchRequest.getSize());
        if (size != null) {
            request.addParameter("size", size);
        }

        String sort = (searchRequest.getSort() == null) ? null : StringUtils
                .fromString(searchRequest.getSort());
        if (sort != null) {
            request.addParameter("sort", sort);
        }

        String start = (searchRequest.getStart() == null) ? null : StringUtils
                .fromLong(searchRequest.getStart());
        if (start != null) {
            request.addParameter("start", start);
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", DEFAULT_CONTENT_TYPE);
        }

        return request;
    }

}
