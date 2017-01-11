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
package com.amazonaws.services.cloudhsm.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudhsm.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.protocol.json.*;

/**
 * ModifyHsmRequest Marshaller
 */
public class ModifyHsmRequestMarshaller implements Marshaller<Request<ModifyHsmRequest>, ModifyHsmRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public ModifyHsmRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ModifyHsmRequest> marshall(ModifyHsmRequest modifyHsmRequest) {

        if (modifyHsmRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyHsmRequest> request = new DefaultRequest<ModifyHsmRequest>(modifyHsmRequest, "AWSCloudHSM");
        request.addHeader("X-Amz-Target", "CloudHsmFrontendService.ModifyHsm");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (modifyHsmRequest.getHsmArn() != null) {
                jsonGenerator.writeFieldName("HsmArn").writeValue(modifyHsmRequest.getHsmArn());
            }
            if (modifyHsmRequest.getSubnetId() != null) {
                jsonGenerator.writeFieldName("SubnetId").writeValue(modifyHsmRequest.getSubnetId());
            }
            if (modifyHsmRequest.getEniIp() != null) {
                jsonGenerator.writeFieldName("EniIp").writeValue(modifyHsmRequest.getEniIp());
            }
            if (modifyHsmRequest.getIamRoleArn() != null) {
                jsonGenerator.writeFieldName("IamRoleArn").writeValue(modifyHsmRequest.getIamRoleArn());
            }
            if (modifyHsmRequest.getExternalId() != null) {
                jsonGenerator.writeFieldName("ExternalId").writeValue(modifyHsmRequest.getExternalId());
            }
            if (modifyHsmRequest.getSyslogIp() != null) {
                jsonGenerator.writeFieldName("SyslogIp").writeValue(modifyHsmRequest.getSyslogIp());
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
