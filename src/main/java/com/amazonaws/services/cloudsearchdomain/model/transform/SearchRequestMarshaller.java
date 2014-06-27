/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

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
 * Search Request Marshaller
 */
public class SearchRequestMarshaller implements Marshaller<Request<SearchRequest>, SearchRequest> {

    public Request<SearchRequest> marshall(SearchRequest searchRequest) {
    if (searchRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<SearchRequest> request = new DefaultRequest<SearchRequest>(searchRequest, "AmazonCloudSearchDomain");
        String target = "AmazonCloudSearch2013.Search";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.GET);
        String uriResourcePath = "/2013-01-01/search?format=sdk&pretty=true&cursor={Cursor}&expr={Expr}&facet={Facet}&fq={FilterQuery}&highlight={Highlight}&partial={Partial}&q={Query}&q.options={QueryOptions}&q.parser={QueryParser}&return={Return}&size={Size}&sort={Sort}&start={Start}"; 
        uriResourcePath = uriResourcePath.replace("{Cursor}", (searchRequest.getCursor() == null) ? "" : StringUtils.fromString(searchRequest.getCursor())); 
        uriResourcePath = uriResourcePath.replace("{Expr}", (searchRequest.getExpr() == null) ? "" : StringUtils.fromString(searchRequest.getExpr())); 
        uriResourcePath = uriResourcePath.replace("{Facet}", (searchRequest.getFacet() == null) ? "" : StringUtils.fromString(searchRequest.getFacet())); 
        uriResourcePath = uriResourcePath.replace("{FilterQuery}", (searchRequest.getFilterQuery() == null) ? "" : StringUtils.fromString(searchRequest.getFilterQuery())); 
        uriResourcePath = uriResourcePath.replace("{Highlight}", (searchRequest.getHighlight() == null) ? "" : StringUtils.fromString(searchRequest.getHighlight())); 
        uriResourcePath = uriResourcePath.replace("{Partial}", (searchRequest.isPartial() == null) ? "" : StringUtils.fromBoolean(searchRequest.isPartial())); 
        uriResourcePath = uriResourcePath.replace("{Query}", (searchRequest.getQuery() == null) ? "" : StringUtils.fromString(searchRequest.getQuery())); 
        uriResourcePath = uriResourcePath.replace("{QueryOptions}", (searchRequest.getQueryOptions() == null) ? "" : StringUtils.fromString(searchRequest.getQueryOptions())); 
        uriResourcePath = uriResourcePath.replace("{QueryParser}", (searchRequest.getQueryParser() == null) ? "" : StringUtils.fromString(searchRequest.getQueryParser())); 
        uriResourcePath = uriResourcePath.replace("{Return}", (searchRequest.getReturn() == null) ? "" : StringUtils.fromString(searchRequest.getReturn())); 
        uriResourcePath = uriResourcePath.replace("{Size}", (searchRequest.getSize() == null) ? "" : StringUtils.fromLong(searchRequest.getSize())); 
        uriResourcePath = uriResourcePath.replace("{Sort}", (searchRequest.getSort() == null) ? "" : StringUtils.fromString(searchRequest.getSort())); 
        uriResourcePath = uriResourcePath.replace("{Start}", (searchRequest.getStart() == null) ? "" : StringUtils.fromLong(searchRequest.getStart())); 

        uriResourcePath = uriResourcePath.replaceAll("//", "/");

        if (uriResourcePath.contains("?")) {
            String queryString = uriResourcePath.substring(uriResourcePath.indexOf("?") + 1);
            uriResourcePath    = uriResourcePath.substring(0, uriResourcePath.indexOf("?"));

            for (String s : queryString.split("[;&]")) {
                String[] nameValuePair = s.split("=");
                if (nameValuePair.length == 2) {
                    if(!(nameValuePair[1].isEmpty()))
                        request.addParameter(nameValuePair[0], nameValuePair[1]);
                }
            }
        }
        request.setResourcePath(uriResourcePath);
        
        request.setContent(new ByteArrayInputStream(new byte[0]));

        return request;
    }
}
