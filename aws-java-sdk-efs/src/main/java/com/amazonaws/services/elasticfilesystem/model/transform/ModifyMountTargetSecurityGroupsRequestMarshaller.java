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
package com.amazonaws.services.elasticfilesystem.model.transform;

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
import com.amazonaws.services.elasticfilesystem.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Modify Mount Target Security Groups Request Marshaller
 */
public class ModifyMountTargetSecurityGroupsRequestMarshaller implements Marshaller<Request<ModifyMountTargetSecurityGroupsRequest>, ModifyMountTargetSecurityGroupsRequest> {

    private static final String RESOURCE_PATH_TEMPLATE;
    private static final Map<String, String> STATIC_QUERY_PARAMS;
    private static final Map<String, String> DYNAMIC_QUERY_PARAMS;
    static {
        String path = "/2015-02-01/mount-targets/{MountTargetId}/security-groups";
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

    public Request<ModifyMountTargetSecurityGroupsRequest> marshall(ModifyMountTargetSecurityGroupsRequest modifyMountTargetSecurityGroupsRequest) {
        if (modifyMountTargetSecurityGroupsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyMountTargetSecurityGroupsRequest> request = new DefaultRequest<ModifyMountTargetSecurityGroupsRequest>(modifyMountTargetSecurityGroupsRequest, "AmazonElasticFileSystem");
        String target = "MagnolioAPIService_v20150201.ModifyMountTargetSecurityGroups";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.PUT);
        String uriResourcePath = RESOURCE_PATH_TEMPLATE;

        if (DYNAMIC_QUERY_PARAMS.containsKey("MountTargetId")) {
            String name = DYNAMIC_QUERY_PARAMS.get("MountTargetId");

            String value = (modifyMountTargetSecurityGroupsRequest.getMountTargetId() == null) ? null : StringUtils.fromString(modifyMountTargetSecurityGroupsRequest.getMountTargetId());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
            
        } else {
            uriResourcePath = uriResourcePath.replace("{MountTargetId}", (modifyMountTargetSecurityGroupsRequest.getMountTargetId() == null) ? "" : StringUtils.fromString(modifyMountTargetSecurityGroupsRequest.getMountTargetId())); 
        } 

        request.setResourcePath(uriResourcePath.replaceAll("//", "/"));

        for (Map.Entry<String, String> entry : STATIC_QUERY_PARAMS.entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          jsonWriter.object();

            com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupsList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(modifyMountTargetSecurityGroupsRequest.getSecurityGroups());
            if (securityGroupsList != null && !(securityGroupsList.isAutoConstruct() && securityGroupsList.isEmpty())) {

                jsonWriter.key("SecurityGroups");
                jsonWriter.array();

                for (String securityGroupsListValue : securityGroupsList) {
                    if (securityGroupsListValue != null) {
                        jsonWriter.value(securityGroupsListValue);
                    }
                }
                jsonWriter.endArray();
            }

          jsonWriter.endObject();

          String snippet = stringWriter.toString();
          byte[] content = snippet.getBytes(UTF8);
          request.setContent(new StringInputStream(snippet));
          request.addHeader("Content-Length", Integer.toString(content.length));
          request.addHeader("Content-Type", "application/x-amz-json-1.1");
        } catch(Throwable t) {
          throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }
}
