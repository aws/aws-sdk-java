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
package com.amazonaws.services.ecr.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ecr.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * SetRepositoryPolicyRequest Marshaller
 */
public class SetRepositoryPolicyRequestMarshaller implements Marshaller<Request<SetRepositoryPolicyRequest>, SetRepositoryPolicyRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public SetRepositoryPolicyRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<SetRepositoryPolicyRequest> marshall(SetRepositoryPolicyRequest setRepositoryPolicyRequest) {

        if (setRepositoryPolicyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SetRepositoryPolicyRequest> request = new DefaultRequest<SetRepositoryPolicyRequest>(setRepositoryPolicyRequest, "AmazonECR");
        request.addHeader("X-Amz-Target", "AmazonEC2ContainerRegistry_V20150921.SetRepositoryPolicy");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (setRepositoryPolicyRequest.getRegistryId() != null) {
                jsonGenerator.writeFieldName("registryId").writeValue(setRepositoryPolicyRequest.getRegistryId());
            }
            if (setRepositoryPolicyRequest.getRepositoryName() != null) {
                jsonGenerator.writeFieldName("repositoryName").writeValue(setRepositoryPolicyRequest.getRepositoryName());
            }
            if (setRepositoryPolicyRequest.getPolicyText() != null) {
                jsonGenerator.writeFieldName("policyText").writeValue(setRepositoryPolicyRequest.getPolicyText());
            }
            if (setRepositoryPolicyRequest.getForce() != null) {
                jsonGenerator.writeFieldName("force").writeValue(setRepositoryPolicyRequest.getForce());
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
