/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;

import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.XMLWriter;

/**
 * List Traffic Policy Instances By Hosted Zone Request Marshaller
 */
public class ListTrafficPolicyInstancesByHostedZoneRequestMarshaller implements Marshaller<Request<ListTrafficPolicyInstancesByHostedZoneRequest>, ListTrafficPolicyInstancesByHostedZoneRequest> {

    private static final String RESOURCE_PATH_TEMPLATE;
    private static final Map<String, String> STATIC_QUERY_PARAMS;
    private static final Map<String, String> DYNAMIC_QUERY_PARAMS;
    static {
        String path = "/2013-04-01/trafficpolicyinstances/hostedzone?id={HostedZoneId}&trafficpolicyinstancename={TrafficPolicyInstanceNameMarker}&trafficpolicyinstancetype={TrafficPolicyInstanceTypeMarker}&maxitems={MaxItems}";
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

    public Request<ListTrafficPolicyInstancesByHostedZoneRequest> marshall(ListTrafficPolicyInstancesByHostedZoneRequest listTrafficPolicyInstancesByHostedZoneRequest) {

        if (listTrafficPolicyInstancesByHostedZoneRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListTrafficPolicyInstancesByHostedZoneRequest> request = new DefaultRequest<ListTrafficPolicyInstancesByHostedZoneRequest>(listTrafficPolicyInstancesByHostedZoneRequest, "AmazonRoute53");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = RESOURCE_PATH_TEMPLATE;
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("HostedZoneId")) {
            String name = DYNAMIC_QUERY_PARAMS.get("HostedZoneId");
            String value = (listTrafficPolicyInstancesByHostedZoneRequest.getHostedZoneId() == null) ? null : StringUtils.fromString(listTrafficPolicyInstancesByHostedZoneRequest.getHostedZoneId());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{HostedZoneId}", (listTrafficPolicyInstancesByHostedZoneRequest.getHostedZoneId() == null) ? "" : StringUtils.fromString(listTrafficPolicyInstancesByHostedZoneRequest.getHostedZoneId())); 
        }
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("TrafficPolicyInstanceNameMarker")) {
            String name = DYNAMIC_QUERY_PARAMS.get("TrafficPolicyInstanceNameMarker");
            String value = (listTrafficPolicyInstancesByHostedZoneRequest.getTrafficPolicyInstanceNameMarker() == null) ? null : StringUtils.fromString(listTrafficPolicyInstancesByHostedZoneRequest.getTrafficPolicyInstanceNameMarker());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{TrafficPolicyInstanceNameMarker}", (listTrafficPolicyInstancesByHostedZoneRequest.getTrafficPolicyInstanceNameMarker() == null) ? "" : StringUtils.fromString(listTrafficPolicyInstancesByHostedZoneRequest.getTrafficPolicyInstanceNameMarker())); 
        }
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("TrafficPolicyInstanceTypeMarker")) {
            String name = DYNAMIC_QUERY_PARAMS.get("TrafficPolicyInstanceTypeMarker");
            String value = (listTrafficPolicyInstancesByHostedZoneRequest.getTrafficPolicyInstanceTypeMarker() == null) ? null : StringUtils.fromString(listTrafficPolicyInstancesByHostedZoneRequest.getTrafficPolicyInstanceTypeMarker());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{TrafficPolicyInstanceTypeMarker}", (listTrafficPolicyInstancesByHostedZoneRequest.getTrafficPolicyInstanceTypeMarker() == null) ? "" : StringUtils.fromString(listTrafficPolicyInstancesByHostedZoneRequest.getTrafficPolicyInstanceTypeMarker())); 
        }
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("MaxItems")) {
            String name = DYNAMIC_QUERY_PARAMS.get("MaxItems");
            String value = (listTrafficPolicyInstancesByHostedZoneRequest.getMaxItems() == null) ? null : StringUtils.fromString(listTrafficPolicyInstancesByHostedZoneRequest.getMaxItems());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{MaxItems}", (listTrafficPolicyInstancesByHostedZoneRequest.getMaxItems() == null) ? "" : StringUtils.fromString(listTrafficPolicyInstancesByHostedZoneRequest.getMaxItems())); 
        }

        request.setResourcePath(uriResourcePath.replaceAll("//", "/"));

        for (Map.Entry<String, String> entry : STATIC_QUERY_PARAMS.entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

        return request;
    }
}
