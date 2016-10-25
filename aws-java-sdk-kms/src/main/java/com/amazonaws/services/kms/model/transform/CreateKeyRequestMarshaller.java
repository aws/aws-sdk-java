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
package com.amazonaws.services.kms.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.kms.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * CreateKeyRequest Marshaller
 */
public class CreateKeyRequestMarshaller implements Marshaller<Request<CreateKeyRequest>, CreateKeyRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreateKeyRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateKeyRequest> marshall(CreateKeyRequest createKeyRequest) {

        if (createKeyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateKeyRequest> request = new DefaultRequest<CreateKeyRequest>(createKeyRequest, "AWSKMS");
        request.addHeader("X-Amz-Target", "TrentService.CreateKey");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (createKeyRequest.getPolicy() != null) {
                jsonGenerator.writeFieldName("Policy").writeValue(createKeyRequest.getPolicy());
            }
            if (createKeyRequest.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(createKeyRequest.getDescription());
            }
            if (createKeyRequest.getKeyUsage() != null) {
                jsonGenerator.writeFieldName("KeyUsage").writeValue(createKeyRequest.getKeyUsage());
            }
            if (createKeyRequest.getOrigin() != null) {
                jsonGenerator.writeFieldName("Origin").writeValue(createKeyRequest.getOrigin());
            }
            if (createKeyRequest.getBypassPolicyLockoutSafetyCheck() != null) {
                jsonGenerator.writeFieldName("BypassPolicyLockoutSafetyCheck").writeValue(createKeyRequest.getBypassPolicyLockoutSafetyCheck());
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
