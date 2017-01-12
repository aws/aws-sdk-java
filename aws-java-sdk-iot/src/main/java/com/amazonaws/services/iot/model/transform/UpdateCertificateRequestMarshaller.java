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
package com.amazonaws.services.iot.model.transform;

import java.io.ByteArrayInputStream;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.util.StringUtils;

import com.amazonaws.protocol.json.*;

/**
 * UpdateCertificateRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCertificateRequestMarshaller implements Marshaller<Request<UpdateCertificateRequest>, UpdateCertificateRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public UpdateCertificateRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UpdateCertificateRequest> marshall(UpdateCertificateRequest updateCertificateRequest) {

        if (updateCertificateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateCertificateRequest> request = new DefaultRequest<UpdateCertificateRequest>(updateCertificateRequest, "AWSIot");

        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/certificates/{certificateId}";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "certificateId",
                updateCertificateRequest.getCertificateId());
        request.setResourcePath(uriResourcePath);

        if (updateCertificateRequest.getNewStatus() != null) {
            request.addParameter("newStatus", StringUtils.fromString(updateCertificateRequest.getNewStatus()));
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
