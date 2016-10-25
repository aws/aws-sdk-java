/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ListInstancesRequest Marshaller
 */
public class ListInstancesRequestMarshaller implements Marshaller<Request<ListInstancesRequest>, ListInstancesRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public ListInstancesRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ListInstancesRequest> marshall(ListInstancesRequest listInstancesRequest) {

        if (listInstancesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListInstancesRequest> request = new DefaultRequest<ListInstancesRequest>(listInstancesRequest, "AmazonElasticMapReduce");
        request.addHeader("X-Amz-Target", "ElasticMapReduce.ListInstances");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (listInstancesRequest.getClusterId() != null) {
                jsonGenerator.writeFieldName("ClusterId").writeValue(listInstancesRequest.getClusterId());
            }
            if (listInstancesRequest.getInstanceGroupId() != null) {
                jsonGenerator.writeFieldName("InstanceGroupId").writeValue(listInstancesRequest.getInstanceGroupId());
            }

            com.amazonaws.internal.SdkInternalList<String> instanceGroupTypesList = (com.amazonaws.internal.SdkInternalList<String>) listInstancesRequest
                    .getInstanceGroupTypes();
            if (!instanceGroupTypesList.isEmpty() || !instanceGroupTypesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("InstanceGroupTypes");
                jsonGenerator.writeStartArray();
                for (String instanceGroupTypesListValue : instanceGroupTypesList) {
                    if (instanceGroupTypesListValue != null) {
                        jsonGenerator.writeValue(instanceGroupTypesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<String> instanceStatesList = (com.amazonaws.internal.SdkInternalList<String>) listInstancesRequest
                    .getInstanceStates();
            if (!instanceStatesList.isEmpty() || !instanceStatesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("InstanceStates");
                jsonGenerator.writeStartArray();
                for (String instanceStatesListValue : instanceStatesList) {
                    if (instanceStatesListValue != null) {
                        jsonGenerator.writeValue(instanceStatesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (listInstancesRequest.getMarker() != null) {
                jsonGenerator.writeFieldName("Marker").writeValue(listInstancesRequest.getMarker());
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", protocolFactory.getContentType());
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
