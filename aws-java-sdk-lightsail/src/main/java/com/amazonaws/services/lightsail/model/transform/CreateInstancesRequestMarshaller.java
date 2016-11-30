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
package com.amazonaws.services.lightsail.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * CreateInstancesRequest Marshaller
 */
public class CreateInstancesRequestMarshaller implements Marshaller<Request<CreateInstancesRequest>, CreateInstancesRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreateInstancesRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateInstancesRequest> marshall(CreateInstancesRequest createInstancesRequest) {

        if (createInstancesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateInstancesRequest> request = new DefaultRequest<CreateInstancesRequest>(createInstancesRequest, "AmazonLightsail");
        request.addHeader("X-Amz-Target", "Lightsail_20161128.CreateInstances");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            java.util.List<String> instanceNamesList = createInstancesRequest.getInstanceNames();
            if (instanceNamesList != null) {
                jsonGenerator.writeFieldName("instanceNames");
                jsonGenerator.writeStartArray();
                for (String instanceNamesListValue : instanceNamesList) {
                    if (instanceNamesListValue != null) {
                        jsonGenerator.writeValue(instanceNamesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (createInstancesRequest.getAvailabilityZone() != null) {
                jsonGenerator.writeFieldName("availabilityZone").writeValue(createInstancesRequest.getAvailabilityZone());
            }
            if (createInstancesRequest.getCustomImageName() != null) {
                jsonGenerator.writeFieldName("customImageName").writeValue(createInstancesRequest.getCustomImageName());
            }
            if (createInstancesRequest.getBlueprintId() != null) {
                jsonGenerator.writeFieldName("blueprintId").writeValue(createInstancesRequest.getBlueprintId());
            }
            if (createInstancesRequest.getBundleId() != null) {
                jsonGenerator.writeFieldName("bundleId").writeValue(createInstancesRequest.getBundleId());
            }
            if (createInstancesRequest.getUserData() != null) {
                jsonGenerator.writeFieldName("userData").writeValue(createInstancesRequest.getUserData());
            }
            if (createInstancesRequest.getKeyPairName() != null) {
                jsonGenerator.writeFieldName("keyPairName").writeValue(createInstancesRequest.getKeyPairName());
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
