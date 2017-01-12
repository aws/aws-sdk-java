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
package com.amazonaws.services.glacier.model.transform;

import java.io.ByteArrayInputStream;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.glacier.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * InitiateJobRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InitiateJobRequestMarshaller implements Marshaller<Request<InitiateJobRequest>, InitiateJobRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public InitiateJobRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<InitiateJobRequest> marshall(InitiateJobRequest initiateJobRequest) {

        if (initiateJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<InitiateJobRequest> request = new DefaultRequest<InitiateJobRequest>(initiateJobRequest, "AmazonGlacier");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/{accountId}/vaults/{vaultName}/jobs";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "accountId",
                initiateJobRequest.getAccountId() == null ? "-" : initiateJobRequest.getAccountId());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "vaultName", initiateJobRequest.getVaultName());
        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            JobParameters jobParameters = initiateJobRequest.getJobParameters();
            if (jobParameters != null) {
                jsonGenerator.writeStartObject();
                if (jobParameters.getFormat() != null) {
                    jsonGenerator.writeFieldName("Format").writeValue(jobParameters.getFormat());
                }
                if (jobParameters.getType() != null) {
                    jsonGenerator.writeFieldName("Type").writeValue(jobParameters.getType());
                }
                if (jobParameters.getArchiveId() != null) {
                    jsonGenerator.writeFieldName("ArchiveId").writeValue(jobParameters.getArchiveId());
                }
                if (jobParameters.getDescription() != null) {
                    jsonGenerator.writeFieldName("Description").writeValue(jobParameters.getDescription());
                }
                if (jobParameters.getSNSTopic() != null) {
                    jsonGenerator.writeFieldName("SNSTopic").writeValue(jobParameters.getSNSTopic());
                }
                if (jobParameters.getRetrievalByteRange() != null) {
                    jsonGenerator.writeFieldName("RetrievalByteRange").writeValue(jobParameters.getRetrievalByteRange());
                }
                if (jobParameters.getTier() != null) {
                    jsonGenerator.writeFieldName("Tier").writeValue(jobParameters.getTier());
                }
                if (jobParameters.getInventoryRetrievalParameters() != null) {
                    jsonGenerator.writeFieldName("InventoryRetrievalParameters");
                    InventoryRetrievalJobInputJsonMarshaller.getInstance().marshall(jobParameters.getInventoryRetrievalParameters(), jsonGenerator);
                }
                jsonGenerator.writeEndObject();
            }

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", protocolFactory.getContentType());
            }
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
