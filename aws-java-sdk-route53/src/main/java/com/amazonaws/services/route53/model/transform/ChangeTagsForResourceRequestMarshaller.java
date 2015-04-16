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
 * Change Tags For Resource Request Marshaller
 */
public class ChangeTagsForResourceRequestMarshaller implements Marshaller<Request<ChangeTagsForResourceRequest>, ChangeTagsForResourceRequest> {

    private static final String RESOURCE_PATH_TEMPLATE;
    private static final Map<String, String> STATIC_QUERY_PARAMS;
    private static final Map<String, String> DYNAMIC_QUERY_PARAMS;
    static {
        String path = "/2013-04-01/tags/{ResourceType}/{ResourceId}";
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

    public Request<ChangeTagsForResourceRequest> marshall(ChangeTagsForResourceRequest changeTagsForResourceRequest) {

        if (changeTagsForResourceRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<ChangeTagsForResourceRequest> request = new DefaultRequest<ChangeTagsForResourceRequest>(changeTagsForResourceRequest, "AmazonRoute53");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = RESOURCE_PATH_TEMPLATE;
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("ResourceType")) {
            String name = DYNAMIC_QUERY_PARAMS.get("ResourceType");
            String value = (changeTagsForResourceRequest.getResourceType() == null) ? null : StringUtils.fromString(changeTagsForResourceRequest.getResourceType());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{ResourceType}", (changeTagsForResourceRequest.getResourceType() == null) ? "" : StringUtils.fromString(changeTagsForResourceRequest.getResourceType())); 
        }
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("ResourceId")) {
            String name = DYNAMIC_QUERY_PARAMS.get("ResourceId");
            String value = (changeTagsForResourceRequest.getResourceId() == null) ? null : StringUtils.fromString(changeTagsForResourceRequest.getResourceId());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{ResourceId}", (changeTagsForResourceRequest.getResourceId() == null) ? "" : StringUtils.fromString(changeTagsForResourceRequest.getResourceId())); 
        }

        request.setResourcePath(uriResourcePath.replaceAll("//", "/"));

        for (Map.Entry<String, String> entry : STATIC_QUERY_PARAMS.entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "https://route53.amazonaws.com/doc/2013-04-01/");

            xmlWriter.startElement("ChangeTagsForResourceRequest");
            
        if (changeTagsForResourceRequest != null) {
            java.util.List<Tag> ChangeTagsForResourceRequestaddTagsList = changeTagsForResourceRequest.getAddTags();
            if (ChangeTagsForResourceRequestaddTagsList != null && ChangeTagsForResourceRequestaddTagsList.size() > 0) {
                int ChangeTagsForResourceRequestaddTagsListIndex = 1;
                xmlWriter.startElement("AddTags");
                for (Tag ChangeTagsForResourceRequestaddTagsListValue : ChangeTagsForResourceRequestaddTagsList) {

                xmlWriter.startElement("Tag");
                    if (ChangeTagsForResourceRequestaddTagsListValue.getKey() != null) {
                        xmlWriter.startElement("Key").value(ChangeTagsForResourceRequestaddTagsListValue.getKey()).endElement();
                    }
                    if (ChangeTagsForResourceRequestaddTagsListValue.getValue() != null) {
                        xmlWriter.startElement("Value").value(ChangeTagsForResourceRequestaddTagsListValue.getValue()).endElement();
                    }
                xmlWriter.endElement();

                    ChangeTagsForResourceRequestaddTagsListIndex++;
                }
                xmlWriter.endElement();
            }
        }

        if (changeTagsForResourceRequest != null) {
            java.util.List<String> ChangeTagsForResourceRequestremoveTagKeysList = changeTagsForResourceRequest.getRemoveTagKeys();
            if (ChangeTagsForResourceRequestremoveTagKeysList != null && ChangeTagsForResourceRequestremoveTagKeysList.size() > 0) {
                int ChangeTagsForResourceRequestremoveTagKeysListIndex = 1;
                xmlWriter.startElement("RemoveTagKeys");
                for (String ChangeTagsForResourceRequestremoveTagKeysListValue : ChangeTagsForResourceRequestremoveTagKeysList) {

                xmlWriter.startElement("Key");
                    xmlWriter.value(ChangeTagsForResourceRequestremoveTagKeysListValue);
                xmlWriter.endElement();

                    ChangeTagsForResourceRequestremoveTagKeysListIndex++;
                }
                xmlWriter.endElement();
            }
        }

            xmlWriter.endElement();

            try {
                request.setContent(new StringInputStream(stringWriter.getBuffer().toString()));
                request.addHeader("Content-Length", Integer.toString(stringWriter.getBuffer().toString().getBytes(UTF8).length));
                request.addHeader("Content-Type", "application/xml");
            } catch (UnsupportedEncodingException e) {
                throw new AmazonClientException("Unable to marshall request to XML", e);
            }

        return request;
    }
}
