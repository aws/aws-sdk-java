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
package com.amazonaws.services.cloudformation.model.transform;

import java.util.Map;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CreateGeneratedTemplateRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGeneratedTemplateRequestMarshaller implements Marshaller<Request<CreateGeneratedTemplateRequest>, CreateGeneratedTemplateRequest> {

    public Request<CreateGeneratedTemplateRequest> marshall(CreateGeneratedTemplateRequest createGeneratedTemplateRequest) {

        if (createGeneratedTemplateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateGeneratedTemplateRequest> request = new DefaultRequest<CreateGeneratedTemplateRequest>(createGeneratedTemplateRequest,
                "AmazonCloudFormation");
        request.addParameter("Action", "CreateGeneratedTemplate");
        request.addParameter("Version", "2010-05-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createGeneratedTemplateRequest.getResources().isEmpty()
                && !((com.amazonaws.internal.SdkInternalList<ResourceDefinition>) createGeneratedTemplateRequest.getResources()).isAutoConstruct()) {
            request.addParameter("Resources", "");
        }
        if (!createGeneratedTemplateRequest.getResources().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<ResourceDefinition>) createGeneratedTemplateRequest.getResources()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<ResourceDefinition> resourcesList = (com.amazonaws.internal.SdkInternalList<ResourceDefinition>) createGeneratedTemplateRequest
                    .getResources();
            int resourcesListIndex = 1;

            for (ResourceDefinition resourcesListValue : resourcesList) {
                if (resourcesListValue != null) {

                    if (resourcesListValue.getResourceType() != null) {
                        request.addParameter("Resources.member." + resourcesListIndex + ".ResourceType",
                                StringUtils.fromString(resourcesListValue.getResourceType()));
                    }

                    if (resourcesListValue.getLogicalResourceId() != null) {
                        request.addParameter("Resources.member." + resourcesListIndex + ".LogicalResourceId",
                                StringUtils.fromString(resourcesListValue.getLogicalResourceId()));
                    }

                    java.util.Map<String, String> resourceIdentifier = resourcesListValue.getResourceIdentifier();
                    if (resourceIdentifier != null) {
                        int resourceIdentifierListIndex = 1;
                        for (Map.Entry<String, String> entry : resourceIdentifier.entrySet()) {
                            if (entry != null && entry.getKey() != null) {
                                request.addParameter("Resources.member." + resourcesListIndex + ".ResourceIdentifier.entry." + resourceIdentifierListIndex
                                        + ".key", StringUtils.fromString(entry.getKey()));
                            }
                            if (entry != null && entry.getValue() != null) {
                                request.addParameter("Resources.member." + resourcesListIndex + ".ResourceIdentifier.entry." + resourceIdentifierListIndex
                                        + ".value", StringUtils.fromString(entry.getValue()));
                            }
                            resourceIdentifierListIndex++;
                        }
                    }

                }
                resourcesListIndex++;
            }
        }

        if (createGeneratedTemplateRequest.getGeneratedTemplateName() != null) {
            request.addParameter("GeneratedTemplateName", StringUtils.fromString(createGeneratedTemplateRequest.getGeneratedTemplateName()));
        }

        if (createGeneratedTemplateRequest.getStackName() != null) {
            request.addParameter("StackName", StringUtils.fromString(createGeneratedTemplateRequest.getStackName()));
        }

        {
            TemplateConfiguration templateConfiguration = createGeneratedTemplateRequest.getTemplateConfiguration();
            if (templateConfiguration != null) {

                if (templateConfiguration.getDeletionPolicy() != null) {
                    request.addParameter("TemplateConfiguration.DeletionPolicy", StringUtils.fromString(templateConfiguration.getDeletionPolicy()));
                }

                if (templateConfiguration.getUpdateReplacePolicy() != null) {
                    request.addParameter("TemplateConfiguration.UpdateReplacePolicy", StringUtils.fromString(templateConfiguration.getUpdateReplacePolicy()));
                }
            }
        }

        return request;
    }

}
