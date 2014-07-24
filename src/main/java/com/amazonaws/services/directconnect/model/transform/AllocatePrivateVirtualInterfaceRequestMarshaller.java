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
package com.amazonaws.services.directconnect.model.transform;

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
import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Allocate Private Virtual Interface Request Marshaller
 */
public class AllocatePrivateVirtualInterfaceRequestMarshaller implements Marshaller<Request<AllocatePrivateVirtualInterfaceRequest>, AllocatePrivateVirtualInterfaceRequest> {

    public Request<AllocatePrivateVirtualInterfaceRequest> marshall(AllocatePrivateVirtualInterfaceRequest allocatePrivateVirtualInterfaceRequest) {
        if (allocatePrivateVirtualInterfaceRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<AllocatePrivateVirtualInterfaceRequest> request = new DefaultRequest<AllocatePrivateVirtualInterfaceRequest>(allocatePrivateVirtualInterfaceRequest, "AmazonDirectConnect");
        String target = "OvertureService.AllocatePrivateVirtualInterface";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        request.setResourcePath("");
        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          jsonWriter.object();
          
            if (allocatePrivateVirtualInterfaceRequest.getConnectionId() != null) {
                jsonWriter.key("connectionId").value(allocatePrivateVirtualInterfaceRequest.getConnectionId());
            }
            if (allocatePrivateVirtualInterfaceRequest.getOwnerAccount() != null) {
                jsonWriter.key("ownerAccount").value(allocatePrivateVirtualInterfaceRequest.getOwnerAccount());
            }
            NewPrivateVirtualInterfaceAllocation newPrivateVirtualInterfaceAllocation = allocatePrivateVirtualInterfaceRequest.getNewPrivateVirtualInterfaceAllocation();
            if (newPrivateVirtualInterfaceAllocation != null) {

                jsonWriter.key("newPrivateVirtualInterfaceAllocation");
                jsonWriter.object();

                if (newPrivateVirtualInterfaceAllocation.getVirtualInterfaceName() != null) {
                    jsonWriter.key("virtualInterfaceName").value(newPrivateVirtualInterfaceAllocation.getVirtualInterfaceName());
                }
                if (newPrivateVirtualInterfaceAllocation.getVlan() != null) {
                    jsonWriter.key("vlan").value(newPrivateVirtualInterfaceAllocation.getVlan());
                }
                if (newPrivateVirtualInterfaceAllocation.getAsn() != null) {
                    jsonWriter.key("asn").value(newPrivateVirtualInterfaceAllocation.getAsn());
                }
                if (newPrivateVirtualInterfaceAllocation.getAuthKey() != null) {
                    jsonWriter.key("authKey").value(newPrivateVirtualInterfaceAllocation.getAuthKey());
                }
                if (newPrivateVirtualInterfaceAllocation.getAmazonAddress() != null) {
                    jsonWriter.key("amazonAddress").value(newPrivateVirtualInterfaceAllocation.getAmazonAddress());
                }
                if (newPrivateVirtualInterfaceAllocation.getCustomerAddress() != null) {
                    jsonWriter.key("customerAddress").value(newPrivateVirtualInterfaceAllocation.getCustomerAddress());
                }
                jsonWriter.endObject();
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
