/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model.transform;

import java.util.Map;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CreateIntegrationRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIntegrationRequestMarshaller implements Marshaller<Request<CreateIntegrationRequest>, CreateIntegrationRequest> {

    public Request<CreateIntegrationRequest> marshall(CreateIntegrationRequest createIntegrationRequest) {

        if (createIntegrationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateIntegrationRequest> request = new DefaultRequest<CreateIntegrationRequest>(createIntegrationRequest, "AmazonRDS");
        request.addParameter("Action", "CreateIntegration");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (createIntegrationRequest.getSourceArn() != null) {
            request.addParameter("SourceArn", StringUtils.fromString(createIntegrationRequest.getSourceArn()));
        }

        if (createIntegrationRequest.getTargetArn() != null) {
            request.addParameter("TargetArn", StringUtils.fromString(createIntegrationRequest.getTargetArn()));
        }

        if (createIntegrationRequest.getIntegrationName() != null) {
            request.addParameter("IntegrationName", StringUtils.fromString(createIntegrationRequest.getIntegrationName()));
        }

        if (createIntegrationRequest.getKMSKeyId() != null) {
            request.addParameter("KMSKeyId", StringUtils.fromString(createIntegrationRequest.getKMSKeyId()));
        }

        java.util.Map<String, String> additionalEncryptionContext = createIntegrationRequest.getAdditionalEncryptionContext();
        int additionalEncryptionContextListIndex = 1;
        for (Map.Entry<String, String> entry : additionalEncryptionContext.entrySet()) {
            if (entry != null && entry.getKey() != null) {
                request.addParameter("AdditionalEncryptionContext.entry." + additionalEncryptionContextListIndex + ".key",
                        StringUtils.fromString(entry.getKey()));
            }
            if (entry != null && entry.getValue() != null) {
                request.addParameter("AdditionalEncryptionContext.entry." + additionalEncryptionContextListIndex + ".value",
                        StringUtils.fromString(entry.getValue()));
            }
            additionalEncryptionContextListIndex++;
        }

        if (!createIntegrationRequest.getTags().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Tag>) createIntegrationRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createIntegrationRequest.getTags();
            int tagsListIndex = 1;

            for (Tag tagsListValue : tagsList) {
                if (tagsListValue != null) {

                    if (tagsListValue.getKey() != null) {
                        request.addParameter("Tags.Tag." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                    }

                    if (tagsListValue.getValue() != null) {
                        request.addParameter("Tags.Tag." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                    }
                }
                tagsListIndex++;
            }
        }

        if (createIntegrationRequest.getDataFilter() != null) {
            request.addParameter("DataFilter", StringUtils.fromString(createIntegrationRequest.getDataFilter()));
        }

        if (createIntegrationRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createIntegrationRequest.getDescription()));
        }

        return request;
    }

}
