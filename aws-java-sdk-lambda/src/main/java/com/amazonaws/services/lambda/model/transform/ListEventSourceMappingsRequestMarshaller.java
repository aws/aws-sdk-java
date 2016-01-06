/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model.transform;

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
import com.amazonaws.services.lambda.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * List Event Source Mappings Request Marshaller
 */
public class ListEventSourceMappingsRequestMarshaller implements Marshaller<Request<ListEventSourceMappingsRequest>, ListEventSourceMappingsRequest> {

    private static final String RESOURCE_PATH_TEMPLATE;
    private static final Map<String, String> STATIC_QUERY_PARAMS;
    private static final Map<String, String> DYNAMIC_QUERY_PARAMS;
    static {
        String path = "/2015-03-31/event-source-mappings/?Marker={Marker}&MaxItems={MaxItems}&FunctionName={FunctionName}&EventSourceArn={EventSourceArn}";
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

    public Request<ListEventSourceMappingsRequest> marshall(ListEventSourceMappingsRequest listEventSourceMappingsRequest) {
        if (listEventSourceMappingsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListEventSourceMappingsRequest> request = new DefaultRequest<ListEventSourceMappingsRequest>(listEventSourceMappingsRequest, "AWSLambda");
        String target = "AWSLambda.ListEventSourceMappings";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.GET);
        String uriResourcePath = RESOURCE_PATH_TEMPLATE;

        if (DYNAMIC_QUERY_PARAMS.containsKey("EventSourceArn")) {
            String name = DYNAMIC_QUERY_PARAMS.get("EventSourceArn");

            String value = (listEventSourceMappingsRequest.getEventSourceArn() == null) ? null : StringUtils.fromString(listEventSourceMappingsRequest.getEventSourceArn());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
            
        } else {
            uriResourcePath = uriResourcePath.replace("{EventSourceArn}", (listEventSourceMappingsRequest.getEventSourceArn() == null) ? "" : StringUtils.fromString(listEventSourceMappingsRequest.getEventSourceArn())); 
        } 
        if (DYNAMIC_QUERY_PARAMS.containsKey("FunctionName")) {
            String name = DYNAMIC_QUERY_PARAMS.get("FunctionName");

            String value = (listEventSourceMappingsRequest.getFunctionName() == null) ? null : StringUtils.fromString(listEventSourceMappingsRequest.getFunctionName());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
            
        } else {
            uriResourcePath = uriResourcePath.replace("{FunctionName}", (listEventSourceMappingsRequest.getFunctionName() == null) ? "" : StringUtils.fromString(listEventSourceMappingsRequest.getFunctionName())); 
        } 
        if (DYNAMIC_QUERY_PARAMS.containsKey("Marker")) {
            String name = DYNAMIC_QUERY_PARAMS.get("Marker");

            String value = (listEventSourceMappingsRequest.getMarker() == null) ? null : StringUtils.fromString(listEventSourceMappingsRequest.getMarker());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
            
        } else {
            uriResourcePath = uriResourcePath.replace("{Marker}", (listEventSourceMappingsRequest.getMarker() == null) ? "" : StringUtils.fromString(listEventSourceMappingsRequest.getMarker())); 
        } 
        if (DYNAMIC_QUERY_PARAMS.containsKey("MaxItems")) {
            String name = DYNAMIC_QUERY_PARAMS.get("MaxItems");

            String value = (listEventSourceMappingsRequest.getMaxItems() == null) ? null : StringUtils.fromInteger(listEventSourceMappingsRequest.getMaxItems());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
            
        } else {
            uriResourcePath = uriResourcePath.replace("{MaxItems}", (listEventSourceMappingsRequest.getMaxItems() == null) ? "" : StringUtils.fromInteger(listEventSourceMappingsRequest.getMaxItems())); 
        } 

        request.setResourcePath(uriResourcePath.replaceAll("//", "/"));

        for (Map.Entry<String, String> entry : STATIC_QUERY_PARAMS.entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
