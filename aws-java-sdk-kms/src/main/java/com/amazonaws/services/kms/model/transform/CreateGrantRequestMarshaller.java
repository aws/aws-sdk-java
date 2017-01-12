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
package com.amazonaws.services.kms.model.transform;

import java.io.ByteArrayInputStream;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.kms.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * CreateGrantRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGrantRequestMarshaller implements Marshaller<Request<CreateGrantRequest>, CreateGrantRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public CreateGrantRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateGrantRequest> marshall(CreateGrantRequest createGrantRequest) {

        if (createGrantRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateGrantRequest> request = new DefaultRequest<CreateGrantRequest>(createGrantRequest, "AWSKMS");
        request.addHeader("X-Amz-Target", "TrentService.CreateGrant");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (createGrantRequest.getKeyId() != null) {
                jsonGenerator.writeFieldName("KeyId").writeValue(createGrantRequest.getKeyId());
            }
            if (createGrantRequest.getGranteePrincipal() != null) {
                jsonGenerator.writeFieldName("GranteePrincipal").writeValue(createGrantRequest.getGranteePrincipal());
            }
            if (createGrantRequest.getRetiringPrincipal() != null) {
                jsonGenerator.writeFieldName("RetiringPrincipal").writeValue(createGrantRequest.getRetiringPrincipal());
            }

            com.amazonaws.internal.SdkInternalList<String> operationsList = (com.amazonaws.internal.SdkInternalList<String>) createGrantRequest.getOperations();
            if (!operationsList.isEmpty() || !operationsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Operations");
                jsonGenerator.writeStartArray();
                for (String operationsListValue : operationsList) {
                    if (operationsListValue != null) {
                        jsonGenerator.writeValue(operationsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (createGrantRequest.getConstraints() != null) {
                jsonGenerator.writeFieldName("Constraints");
                GrantConstraintsJsonMarshaller.getInstance().marshall(createGrantRequest.getConstraints(), jsonGenerator);
            }

            com.amazonaws.internal.SdkInternalList<String> grantTokensList = (com.amazonaws.internal.SdkInternalList<String>) createGrantRequest
                    .getGrantTokens();
            if (!grantTokensList.isEmpty() || !grantTokensList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("GrantTokens");
                jsonGenerator.writeStartArray();
                for (String grantTokensListValue : grantTokensList) {
                    if (grantTokensListValue != null) {
                        jsonGenerator.writeValue(grantTokensListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (createGrantRequest.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(createGrantRequest.getName());
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
