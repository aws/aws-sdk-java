/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.snowball.model.transform;

import java.io.ByteArrayInputStream;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.snowball.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * CreateJobRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateJobRequestMarshaller implements Marshaller<Request<CreateJobRequest>, CreateJobRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public CreateJobRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateJobRequest> marshall(CreateJobRequest createJobRequest) {

        if (createJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateJobRequest> request = new DefaultRequest<CreateJobRequest>(createJobRequest, "AmazonSnowball");
        request.addHeader("X-Amz-Target", "AWSIESnowballJobManagementService.CreateJob");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (createJobRequest.getJobType() != null) {
                jsonGenerator.writeFieldName("JobType").writeValue(createJobRequest.getJobType());
            }
            if (createJobRequest.getResources() != null) {
                jsonGenerator.writeFieldName("Resources");
                JobResourceJsonMarshaller.getInstance().marshall(createJobRequest.getResources(), jsonGenerator);
            }
            if (createJobRequest.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(createJobRequest.getDescription());
            }
            if (createJobRequest.getAddressId() != null) {
                jsonGenerator.writeFieldName("AddressId").writeValue(createJobRequest.getAddressId());
            }
            if (createJobRequest.getKmsKeyARN() != null) {
                jsonGenerator.writeFieldName("KmsKeyARN").writeValue(createJobRequest.getKmsKeyARN());
            }
            if (createJobRequest.getRoleARN() != null) {
                jsonGenerator.writeFieldName("RoleARN").writeValue(createJobRequest.getRoleARN());
            }
            if (createJobRequest.getSnowballCapacityPreference() != null) {
                jsonGenerator.writeFieldName("SnowballCapacityPreference").writeValue(createJobRequest.getSnowballCapacityPreference());
            }
            if (createJobRequest.getShippingOption() != null) {
                jsonGenerator.writeFieldName("ShippingOption").writeValue(createJobRequest.getShippingOption());
            }
            if (createJobRequest.getNotification() != null) {
                jsonGenerator.writeFieldName("Notification");
                NotificationJsonMarshaller.getInstance().marshall(createJobRequest.getNotification(), jsonGenerator);
            }
            if (createJobRequest.getClusterId() != null) {
                jsonGenerator.writeFieldName("ClusterId").writeValue(createJobRequest.getClusterId());
            }
            if (createJobRequest.getSnowballType() != null) {
                jsonGenerator.writeFieldName("SnowballType").writeValue(createJobRequest.getSnowballType());
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
