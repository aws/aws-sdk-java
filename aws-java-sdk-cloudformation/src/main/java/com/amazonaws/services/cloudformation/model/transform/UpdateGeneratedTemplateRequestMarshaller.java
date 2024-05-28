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
 * UpdateGeneratedTemplateRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGeneratedTemplateRequestMarshaller implements Marshaller<Request<UpdateGeneratedTemplateRequest>, UpdateGeneratedTemplateRequest> {

    public Request<UpdateGeneratedTemplateRequest> marshall(UpdateGeneratedTemplateRequest updateGeneratedTemplateRequest) {

        if (updateGeneratedTemplateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateGeneratedTemplateRequest> request = new DefaultRequest<UpdateGeneratedTemplateRequest>(updateGeneratedTemplateRequest,
                "AmazonCloudFormation");
        request.addParameter("Action", "UpdateGeneratedTemplate");
        request.addParameter("Version", "2010-05-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (updateGeneratedTemplateRequest.getGeneratedTemplateName() != null) {
            request.addParameter("GeneratedTemplateName", StringUtils.fromString(updateGeneratedTemplateRequest.getGeneratedTemplateName()));
        }

        if (updateGeneratedTemplateRequest.getNewGeneratedTemplateName() != null) {
            request.addParameter("NewGeneratedTemplateName", StringUtils.fromString(updateGeneratedTemplateRequest.getNewGeneratedTemplateName()));
        }

        if (updateGeneratedTemplateRequest.getAddResources().isEmpty()
                && !((com.amazonaws.internal.SdkInternalList<ResourceDefinition>) updateGeneratedTemplateRequest.getAddResources()).isAutoConstruct()) {
            request.addParameter("AddResources", "");
        }
        if (!updateGeneratedTemplateRequest.getAddResources().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<ResourceDefinition>) updateGeneratedTemplateRequest.getAddResources()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<ResourceDefinition> addResourcesList = (com.amazonaws.internal.SdkInternalList<ResourceDefinition>) updateGeneratedTemplateRequest
                    .getAddResources();
            int addResourcesListIndex = 1;

            for (ResourceDefinition addResourcesListValue : addResourcesList) {
                if (addResourcesListValue != null) {

                    if (addResourcesListValue.getResourceType() != null) {
                        request.addParameter("AddResources.member." + addResourcesListIndex + ".ResourceType",
                                StringUtils.fromString(addResourcesListValue.getResourceType()));
                    }

                    if (addResourcesListValue.getLogicalResourceId() != null) {
                        request.addParameter("AddResources.member." + addResourcesListIndex + ".LogicalResourceId",
                                StringUtils.fromString(addResourcesListValue.getLogicalResourceId()));
                    }

                    java.util.Map<String, String> resourceIdentifier = addResourcesListValue.getResourceIdentifier();
                    if (resourceIdentifier != null) {
                        int resourceIdentifierListIndex = 1;
                        for (Map.Entry<String, String> entry : resourceIdentifier.entrySet()) {
                            if (entry != null && entry.getKey() != null) {
                                request.addParameter("AddResources.member." + addResourcesListIndex + ".ResourceIdentifier.entry."
                                        + resourceIdentifierListIndex + ".key", StringUtils.fromString(entry.getKey()));
                            }
                            if (entry != null && entry.getValue() != null) {
                                request.addParameter("AddResources.member." + addResourcesListIndex + ".ResourceIdentifier.entry."
                                        + resourceIdentifierListIndex + ".value", StringUtils.fromString(entry.getValue()));
                            }
                            resourceIdentifierListIndex++;
                        }
                    }

                }
                addResourcesListIndex++;
            }
        }

        if (updateGeneratedTemplateRequest.getRemoveResources().isEmpty()
                && !((com.amazonaws.internal.SdkInternalList<String>) updateGeneratedTemplateRequest.getRemoveResources()).isAutoConstruct()) {
            request.addParameter("RemoveResources", "");
        }
        if (!updateGeneratedTemplateRequest.getRemoveResources().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) updateGeneratedTemplateRequest.getRemoveResources()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> removeResourcesList = (com.amazonaws.internal.SdkInternalList<String>) updateGeneratedTemplateRequest
                    .getRemoveResources();
            int removeResourcesListIndex = 1;

            for (String removeResourcesListValue : removeResourcesList) {
                if (removeResourcesListValue != null) {
                    request.addParameter("RemoveResources.member." + removeResourcesListIndex, StringUtils.fromString(removeResourcesListValue));
                }
                removeResourcesListIndex++;
            }
        }

        if (updateGeneratedTemplateRequest.getRefreshAllResources() != null) {
            request.addParameter("RefreshAllResources", StringUtils.fromBoolean(updateGeneratedTemplateRequest.getRefreshAllResources()));
        }

        {
            TemplateConfiguration templateConfiguration = updateGeneratedTemplateRequest.getTemplateConfiguration();
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
