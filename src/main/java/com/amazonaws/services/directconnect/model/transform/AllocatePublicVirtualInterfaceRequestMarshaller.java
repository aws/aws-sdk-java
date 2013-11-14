/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directconnect.model.transform;


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
import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Allocate Public Virtual Interface Request Marshaller
 */
public class AllocatePublicVirtualInterfaceRequestMarshaller implements Marshaller<Request<AllocatePublicVirtualInterfaceRequest>, AllocatePublicVirtualInterfaceRequest> {

    

    public Request<AllocatePublicVirtualInterfaceRequest> marshall(AllocatePublicVirtualInterfaceRequest allocatePublicVirtualInterfaceRequest) {
    if (allocatePublicVirtualInterfaceRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<AllocatePublicVirtualInterfaceRequest> request = new DefaultRequest<AllocatePublicVirtualInterfaceRequest>(allocatePublicVirtualInterfaceRequest, "AmazonDirectConnect");
        String target = "OvertureService.AllocatePublicVirtualInterface";
        request.addHeader("X-Amz-Target", target);
        request.addHeader("Content-Type", "application/x-amz-json-1.1");

        
        request.setHttpMethod(HttpMethodName.POST);


        String uriResourcePath = ""; 

        uriResourcePath = uriResourcePath.replaceAll("//", "/");

        if (uriResourcePath.contains("?")) {
            String queryString = uriResourcePath.substring(uriResourcePath.indexOf("?") + 1);
            uriResourcePath    = uriResourcePath.substring(0, uriResourcePath.indexOf("?"));

            for (String s : queryString.split("[;&]")) {
                String[] nameValuePair = s.split("=");
                if (nameValuePair.length == 2) {
                    request.addParameter(nameValuePair[0], nameValuePair[1]);
                } else {
                    request.addParameter(s, null);
                }
            }
        }

        request.setResourcePath(uriResourcePath);


        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          
            
          jsonWriter.object();
          
            if (allocatePublicVirtualInterfaceRequest.getConnectionId() != null) {
                jsonWriter.key("connectionId").value(allocatePublicVirtualInterfaceRequest.getConnectionId());
            }
            if (allocatePublicVirtualInterfaceRequest.getOwnerAccount() != null) {
                jsonWriter.key("ownerAccount").value(allocatePublicVirtualInterfaceRequest.getOwnerAccount());
            }
            NewPublicVirtualInterfaceAllocation newPublicVirtualInterfaceAllocation = allocatePublicVirtualInterfaceRequest.getNewPublicVirtualInterfaceAllocation();
            if (newPublicVirtualInterfaceAllocation != null) {

                jsonWriter.key("newPublicVirtualInterfaceAllocation");
                jsonWriter.object();

                if (newPublicVirtualInterfaceAllocation.getVirtualInterfaceName() != null) {
                    jsonWriter.key("virtualInterfaceName").value(newPublicVirtualInterfaceAllocation.getVirtualInterfaceName());
                }
                if (newPublicVirtualInterfaceAllocation.getVlan() != null) {
                    jsonWriter.key("vlan").value(newPublicVirtualInterfaceAllocation.getVlan());
                }
                if (newPublicVirtualInterfaceAllocation.getAsn() != null) {
                    jsonWriter.key("asn").value(newPublicVirtualInterfaceAllocation.getAsn());
                }
                if (newPublicVirtualInterfaceAllocation.getAuthKey() != null) {
                    jsonWriter.key("authKey").value(newPublicVirtualInterfaceAllocation.getAuthKey());
                }
                if (newPublicVirtualInterfaceAllocation.getAmazonAddress() != null) {
                    jsonWriter.key("amazonAddress").value(newPublicVirtualInterfaceAllocation.getAmazonAddress());
                }
                if (newPublicVirtualInterfaceAllocation.getCustomerAddress() != null) {
                    jsonWriter.key("customerAddress").value(newPublicVirtualInterfaceAllocation.getCustomerAddress());
                }

                com.amazonaws.internal.ListWithAutoConstructFlag<RouteFilterPrefix> routeFilterPrefixesList = (com.amazonaws.internal.ListWithAutoConstructFlag<RouteFilterPrefix>)(newPublicVirtualInterfaceAllocation.getRouteFilterPrefixes());
                if (routeFilterPrefixesList != null && !(routeFilterPrefixesList.isAutoConstruct() && routeFilterPrefixesList.isEmpty())) {

                    jsonWriter.key("routeFilterPrefixes");
                    jsonWriter.array();

                    for (RouteFilterPrefix routeFilterPrefixesListValue : routeFilterPrefixesList) {
                        if (routeFilterPrefixesListValue != null) {
                            jsonWriter.object();
                            if (routeFilterPrefixesListValue.getCidr() != null) {
                                jsonWriter.key("cidr").value(routeFilterPrefixesListValue.getCidr());
                            }
                            jsonWriter.endObject();
                        }
                    }
                    jsonWriter.endArray();
                }
                jsonWriter.endObject();
            }

          jsonWriter.endObject();
          

          String snippet = stringWriter.toString();
          byte[] content = snippet.getBytes("UTF-8");
          request.setContent(new StringInputStream(snippet));
          request.addHeader("Content-Length", Integer.toString(content.length));
        } catch(Throwable t) {
          throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        

        return request;
    }
}
