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
package com.amazonaws.services.directory.model.transform;

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
import com.amazonaws.services.directory.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Connect Directory Request Marshaller
 */
public class ConnectDirectoryRequestMarshaller implements Marshaller<Request<ConnectDirectoryRequest>, ConnectDirectoryRequest> {

    public Request<ConnectDirectoryRequest> marshall(ConnectDirectoryRequest connectDirectoryRequest) {
        if (connectDirectoryRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<ConnectDirectoryRequest> request = new DefaultRequest<ConnectDirectoryRequest>(connectDirectoryRequest, "AWSDirectoryService");
        String target = "DirectoryService_20150416.ConnectDirectory";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        request.setResourcePath("");
        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          jsonWriter.object();
          
            if (connectDirectoryRequest.getName() != null) {
                jsonWriter.key("Name").value(connectDirectoryRequest.getName());
            }
            if (connectDirectoryRequest.getShortName() != null) {
                jsonWriter.key("ShortName").value(connectDirectoryRequest.getShortName());
            }
            if (connectDirectoryRequest.getPassword() != null) {
                jsonWriter.key("Password").value(connectDirectoryRequest.getPassword());
            }
            if (connectDirectoryRequest.getDescription() != null) {
                jsonWriter.key("Description").value(connectDirectoryRequest.getDescription());
            }
            if (connectDirectoryRequest.getSize() != null) {
                jsonWriter.key("Size").value(connectDirectoryRequest.getSize());
            }
            DirectoryConnectSettings connectSettings = connectDirectoryRequest.getConnectSettings();
            if (connectSettings != null) {

                jsonWriter.key("ConnectSettings");
                jsonWriter.object();

                if (connectSettings.getVpcId() != null) {
                    jsonWriter.key("VpcId").value(connectSettings.getVpcId());
                }

                com.amazonaws.internal.ListWithAutoConstructFlag<String> subnetIdsList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(connectSettings.getSubnetIds());
                if (subnetIdsList != null && !(subnetIdsList.isAutoConstruct() && subnetIdsList.isEmpty())) {

                    jsonWriter.key("SubnetIds");
                    jsonWriter.array();

                    for (String subnetIdsListValue : subnetIdsList) {
                        if (subnetIdsListValue != null) {
                            jsonWriter.value(subnetIdsListValue);
                        }
                    }
                    jsonWriter.endArray();
                }

                com.amazonaws.internal.ListWithAutoConstructFlag<String> customerDnsIpsList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(connectSettings.getCustomerDnsIps());
                if (customerDnsIpsList != null && !(customerDnsIpsList.isAutoConstruct() && customerDnsIpsList.isEmpty())) {

                    jsonWriter.key("CustomerDnsIps");
                    jsonWriter.array();

                    for (String customerDnsIpsListValue : customerDnsIpsList) {
                        if (customerDnsIpsListValue != null) {
                            jsonWriter.value(customerDnsIpsListValue);
                        }
                    }
                    jsonWriter.endArray();
                }
                if (connectSettings.getCustomerUserName() != null) {
                    jsonWriter.key("CustomerUserName").value(connectSettings.getCustomerUserName());
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
