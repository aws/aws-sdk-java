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

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudsearchdomain.model.SearchRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

import java.io.ByteArrayInputStream;

/**
 * Marshaller used to handle large search requests.
 */
public class LargeSearchRequestMarshaller implements Marshaller<Request<SearchRequest>, SearchRequest> {

    public Request<SearchRequest> marshall(SearchRequest searchRequest) {

        if (searchRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<SearchRequest> request = new DefaultRequest<SearchRequest>(searchRequest, "AmazonCloudSearchDomain");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2013-01-01/search";

        final StringBuilder requestContent = new StringBuilder();
        requestContent.append("format=sdk");
        requestContent.append("&pretty=true");

        if (!StringUtils.isNullOrEmpty(searchRequest.getCursor())) {
            requestContent.append("&cursor=").append(StringUtils.fromString(searchRequest.getCursor()));
        }

        if (!StringUtils.isNullOrEmpty(searchRequest.getExpr())) {
            requestContent.append("&expr=").append(StringUtils.fromString(searchRequest.getExpr()));
        }

        if (!StringUtils.isNullOrEmpty(searchRequest.getFacet())) {
            requestContent.append("&facet=").append(StringUtils.fromString(searchRequest.getFacet()));
        }

        if (!StringUtils.isNullOrEmpty(searchRequest.getFilterQuery())) {
            requestContent.append("&fq=").append(StringUtils.fromString(searchRequest.getFilterQuery()));
        }

        if (!StringUtils.isNullOrEmpty(searchRequest.getHighlight())) {
            requestContent.append("&highlight=").append(StringUtils.fromString(searchRequest.getHighlight()));
        }

        if (searchRequest.isPartial() != null) {
            requestContent.append("&partial=").append(StringUtils.fromBoolean(searchRequest.isPartial()));
        }

        if (!StringUtils.isNullOrEmpty(searchRequest.getQuery())) {
            requestContent.append("&q=").append(StringUtils.fromString(searchRequest.getQuery()));
        }

        if (!StringUtils.isNullOrEmpty(searchRequest.getQueryOptions())) {
            requestContent.append("&q.options=").append(StringUtils.fromString(searchRequest.getQueryOptions()));
        }

        if (!StringUtils.isNullOrEmpty(searchRequest.getQueryParser())) {
            requestContent.append("&q.parser=").append(StringUtils.fromString(searchRequest.getQueryParser()));
        }

        if (!StringUtils.isNullOrEmpty(searchRequest.getReturn())) {
            requestContent.append("&return=").append(StringUtils.fromString(searchRequest.getReturn()));
        }

        if (searchRequest.getSize() != null) {
            requestContent.append("&size=").append(StringUtils.fromLong(searchRequest.getSize()));
        }

        if (!StringUtils.isNullOrEmpty(searchRequest.getSort())) {
            requestContent.append("&sort=").append(StringUtils.fromString(searchRequest.getSort()));
        }

        if (searchRequest.getStart() != null) {
            requestContent.append("&start=").append(StringUtils.fromLong(searchRequest.getStart()));
        }

        if (!StringUtils.isNullOrEmpty(searchRequest.getStats())) {
            requestContent.append("&stats=").append(StringUtils.fromString(searchRequest.getStats()));
        }

        // Set the URI resource path.
        request.setResourcePath(uriResourcePath.replaceAll("//", "/"));

        // Get parameters to pass them as a POST content.
        request.setContent(new ByteArrayInputStream(requestContent.toString().getBytes()));

        return request;
    }

}
