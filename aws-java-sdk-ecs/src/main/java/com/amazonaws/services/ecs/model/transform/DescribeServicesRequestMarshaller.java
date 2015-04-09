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
package com.amazonaws.services.ecs.model.transform;

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
import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Describe Services Request Marshaller
 */
public class DescribeServicesRequestMarshaller implements Marshaller<Request<DescribeServicesRequest>, DescribeServicesRequest> {

    public Request<DescribeServicesRequest> marshall(DescribeServicesRequest describeServicesRequest) {
        if (describeServicesRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeServicesRequest> request = new DefaultRequest<DescribeServicesRequest>(describeServicesRequest, "AmazonECS");
        String target = "AmazonEC2ContainerServiceV20141113.DescribeServices";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        request.setResourcePath("");
        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          jsonWriter.object();
          
            if (describeServicesRequest.getCluster() != null) {
                jsonWriter.key("cluster").value(describeServicesRequest.getCluster());
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<String> servicesList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(describeServicesRequest.getServices());
            if (servicesList != null && !(servicesList.isAutoConstruct() && servicesList.isEmpty())) {

                jsonWriter.key("services");
                jsonWriter.array();

                for (String servicesListValue : servicesList) {
                    if (servicesListValue != null) {
                        jsonWriter.value(servicesListValue);
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
