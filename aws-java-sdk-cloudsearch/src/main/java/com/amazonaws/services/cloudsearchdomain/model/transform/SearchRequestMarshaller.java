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
 * Search Request Marshaller
 */
public class SearchRequestMarshaller implements Marshaller<Request<SearchRequest>, SearchRequest> {

    private static final String RESOURCE_PATH_TEMPLATE;
    private static final Map<String, String> STATIC_QUERY_PARAMS;
    private static final Map<String, String> DYNAMIC_QUERY_PARAMS;
    static {
        String path = "/2013-01-01/search?format=sdk&pretty=true&cursor={Cursor}&expr={Expr}&facet={Facet}&fq={FilterQuery}&highlight={Highlight}&partial={Partial}&q={Query}&q.options={QueryOptions}&q.parser={QueryParser}&return={Return}&size={Size}&sort={Sort}&start={Start}";
        Map<String, String> staticMap = new HashMap<String, String>();
        Map<String, String> dynamicMap = new HashMap<String, String>();

        int index = path.indexOf("?");
        if (index != -1) {
            String queryString = path.substring(index + 1);
            path = path.substring(0, index);

            for (String s : queryString.split("[;&]")) {
                index = s.indexOf("=");
                if (index != -1) {
                    String name = s.substring(0, index);
                    String value = s.substring(index + 1);

                    if (value.startsWith("{") && value.endsWith("}")) {
                        dynamicMap.put(value.substring(1, value.length() - 1), name);
                    } else {
                        staticMap.put(name, value);
                    }
                }
            }
        }

        RESOURCE_PATH_TEMPLATE = path;
        STATIC_QUERY_PARAMS = Collections.unmodifiableMap(staticMap);
        DYNAMIC_QUERY_PARAMS = Collections.unmodifiableMap(dynamicMap);
    }

    public Request<SearchRequest> marshall(SearchRequest searchRequest) {
        if (searchRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<SearchRequest> request = new DefaultRequest<SearchRequest>(searchRequest, "AmazonCloudSearchDomain");
        String target = "AmazonCloudSearch2013.Search";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.GET);
        String uriResourcePath = RESOURCE_PATH_TEMPLATE;

        if (DYNAMIC_QUERY_PARAMS.containsKey("Cursor")) {
            String name = DYNAMIC_QUERY_PARAMS.get("Cursor");
            String value = (searchRequest.getCursor() == null) ? null : StringUtils.fromString(searchRequest.getCursor());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{Cursor}", (searchRequest.getCursor() == null) ? "" : StringUtils.fromString(searchRequest.getCursor())); 
        }
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("Expr")) {
            String name = DYNAMIC_QUERY_PARAMS.get("Expr");
            String value = (searchRequest.getExpr() == null) ? null : StringUtils.fromString(searchRequest.getExpr());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{Expr}", (searchRequest.getExpr() == null) ? "" : StringUtils.fromString(searchRequest.getExpr())); 
        }
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("Facet")) {
            String name = DYNAMIC_QUERY_PARAMS.get("Facet");
            String value = (searchRequest.getFacet() == null) ? null : StringUtils.fromString(searchRequest.getFacet());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{Facet}", (searchRequest.getFacet() == null) ? "" : StringUtils.fromString(searchRequest.getFacet())); 
        }
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("FilterQuery")) {
            String name = DYNAMIC_QUERY_PARAMS.get("FilterQuery");
            String value = (searchRequest.getFilterQuery() == null) ? null : StringUtils.fromString(searchRequest.getFilterQuery());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{FilterQuery}", (searchRequest.getFilterQuery() == null) ? "" : StringUtils.fromString(searchRequest.getFilterQuery())); 
        }
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("Highlight")) {
            String name = DYNAMIC_QUERY_PARAMS.get("Highlight");
            String value = (searchRequest.getHighlight() == null) ? null : StringUtils.fromString(searchRequest.getHighlight());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{Highlight}", (searchRequest.getHighlight() == null) ? "" : StringUtils.fromString(searchRequest.getHighlight())); 
        }
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("Partial")) {
            String name = DYNAMIC_QUERY_PARAMS.get("Partial");
            String value = (searchRequest.isPartial() == null) ? null : StringUtils.fromBoolean(searchRequest.isPartial());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{Partial}", (searchRequest.isPartial() == null) ? "" : StringUtils.fromBoolean(searchRequest.isPartial())); 
        }
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("Query")) {
            String name = DYNAMIC_QUERY_PARAMS.get("Query");
            String value = (searchRequest.getQuery() == null) ? null : StringUtils.fromString(searchRequest.getQuery());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{Query}", (searchRequest.getQuery() == null) ? "" : StringUtils.fromString(searchRequest.getQuery())); 
        }
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("QueryOptions")) {
            String name = DYNAMIC_QUERY_PARAMS.get("QueryOptions");
            String value = (searchRequest.getQueryOptions() == null) ? null : StringUtils.fromString(searchRequest.getQueryOptions());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{QueryOptions}", (searchRequest.getQueryOptions() == null) ? "" : StringUtils.fromString(searchRequest.getQueryOptions())); 
        }
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("QueryParser")) {
            String name = DYNAMIC_QUERY_PARAMS.get("QueryParser");
            String value = (searchRequest.getQueryParser() == null) ? null : StringUtils.fromString(searchRequest.getQueryParser());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{QueryParser}", (searchRequest.getQueryParser() == null) ? "" : StringUtils.fromString(searchRequest.getQueryParser())); 
        }
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("Return")) {
            String name = DYNAMIC_QUERY_PARAMS.get("Return");
            String value = (searchRequest.getReturn() == null) ? null : StringUtils.fromString(searchRequest.getReturn());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{Return}", (searchRequest.getReturn() == null) ? "" : StringUtils.fromString(searchRequest.getReturn())); 
        }
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("Size")) {
            String name = DYNAMIC_QUERY_PARAMS.get("Size");
            String value = (searchRequest.getSize() == null) ? null : StringUtils.fromLong(searchRequest.getSize());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{Size}", (searchRequest.getSize() == null) ? "" : StringUtils.fromLong(searchRequest.getSize())); 
        }
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("Sort")) {
            String name = DYNAMIC_QUERY_PARAMS.get("Sort");
            String value = (searchRequest.getSort() == null) ? null : StringUtils.fromString(searchRequest.getSort());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{Sort}", (searchRequest.getSort() == null) ? "" : StringUtils.fromString(searchRequest.getSort())); 
        }
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("Start")) {
            String name = DYNAMIC_QUERY_PARAMS.get("Start");
            String value = (searchRequest.getStart() == null) ? null : StringUtils.fromLong(searchRequest.getStart());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{Start}", (searchRequest.getStart() == null) ? "" : StringUtils.fromLong(searchRequest.getStart())); 
        }

        request.setResourcePath(uriResourcePath.replaceAll("//", "/"));

        for (Map.Entry<String, String> entry : STATIC_QUERY_PARAMS.entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
