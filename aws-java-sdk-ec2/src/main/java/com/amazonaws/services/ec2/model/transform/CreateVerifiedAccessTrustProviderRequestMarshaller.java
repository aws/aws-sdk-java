/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * CreateVerifiedAccessTrustProviderRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVerifiedAccessTrustProviderRequestMarshaller implements
        Marshaller<Request<CreateVerifiedAccessTrustProviderRequest>, CreateVerifiedAccessTrustProviderRequest> {

    public Request<CreateVerifiedAccessTrustProviderRequest> marshall(CreateVerifiedAccessTrustProviderRequest createVerifiedAccessTrustProviderRequest) {

        if (createVerifiedAccessTrustProviderRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateVerifiedAccessTrustProviderRequest> request = new DefaultRequest<CreateVerifiedAccessTrustProviderRequest>(
                createVerifiedAccessTrustProviderRequest, "AmazonEC2");
        request.addParameter("Action", "CreateVerifiedAccessTrustProvider");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createVerifiedAccessTrustProviderRequest.getTrustProviderType() != null) {
            request.addParameter("TrustProviderType", StringUtils.fromString(createVerifiedAccessTrustProviderRequest.getTrustProviderType()));
        }

        if (createVerifiedAccessTrustProviderRequest.getUserTrustProviderType() != null) {
            request.addParameter("UserTrustProviderType", StringUtils.fromString(createVerifiedAccessTrustProviderRequest.getUserTrustProviderType()));
        }

        if (createVerifiedAccessTrustProviderRequest.getDeviceTrustProviderType() != null) {
            request.addParameter("DeviceTrustProviderType", StringUtils.fromString(createVerifiedAccessTrustProviderRequest.getDeviceTrustProviderType()));
        }

        CreateVerifiedAccessTrustProviderOidcOptions oidcOptions = createVerifiedAccessTrustProviderRequest.getOidcOptions();
        if (oidcOptions != null) {

            if (oidcOptions.getIssuer() != null) {
                request.addParameter("OidcOptions.Issuer", StringUtils.fromString(oidcOptions.getIssuer()));
            }

            if (oidcOptions.getAuthorizationEndpoint() != null) {
                request.addParameter("OidcOptions.AuthorizationEndpoint", StringUtils.fromString(oidcOptions.getAuthorizationEndpoint()));
            }

            if (oidcOptions.getTokenEndpoint() != null) {
                request.addParameter("OidcOptions.TokenEndpoint", StringUtils.fromString(oidcOptions.getTokenEndpoint()));
            }

            if (oidcOptions.getUserInfoEndpoint() != null) {
                request.addParameter("OidcOptions.UserInfoEndpoint", StringUtils.fromString(oidcOptions.getUserInfoEndpoint()));
            }

            if (oidcOptions.getClientId() != null) {
                request.addParameter("OidcOptions.ClientId", StringUtils.fromString(oidcOptions.getClientId()));
            }

            if (oidcOptions.getClientSecret() != null) {
                request.addParameter("OidcOptions.ClientSecret", StringUtils.fromString(oidcOptions.getClientSecret()));
            }

            if (oidcOptions.getScope() != null) {
                request.addParameter("OidcOptions.Scope", StringUtils.fromString(oidcOptions.getScope()));
            }
        }

        CreateVerifiedAccessTrustProviderDeviceOptions deviceOptions = createVerifiedAccessTrustProviderRequest.getDeviceOptions();
        if (deviceOptions != null) {

            if (deviceOptions.getTenantId() != null) {
                request.addParameter("DeviceOptions.TenantId", StringUtils.fromString(deviceOptions.getTenantId()));
            }
        }

        if (createVerifiedAccessTrustProviderRequest.getPolicyReferenceName() != null) {
            request.addParameter("PolicyReferenceName", StringUtils.fromString(createVerifiedAccessTrustProviderRequest.getPolicyReferenceName()));
        }

        if (createVerifiedAccessTrustProviderRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createVerifiedAccessTrustProviderRequest.getDescription()));
        }

        com.amazonaws.internal.SdkInternalList<TagSpecification> createVerifiedAccessTrustProviderRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) createVerifiedAccessTrustProviderRequest
                .getTagSpecifications();
        if (!createVerifiedAccessTrustProviderRequestTagSpecificationsList.isEmpty()
                || !createVerifiedAccessTrustProviderRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification createVerifiedAccessTrustProviderRequestTagSpecificationsListValue : createVerifiedAccessTrustProviderRequestTagSpecificationsList) {

                if (createVerifiedAccessTrustProviderRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(createVerifiedAccessTrustProviderRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createVerifiedAccessTrustProviderRequestTagSpecificationsListValue
                        .getTags();
                if (!tagSpecificationTagsList.isEmpty() || !tagSpecificationTagsList.isAutoConstruct()) {
                    int tagsListIndex = 1;

                    for (Tag tagSpecificationTagsListValue : tagSpecificationTagsList) {

                        if (tagSpecificationTagsListValue.getKey() != null) {
                            request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".Tag." + tagsListIndex + ".Key",
                                    StringUtils.fromString(tagSpecificationTagsListValue.getKey()));
                        }

                        if (tagSpecificationTagsListValue.getValue() != null) {
                            request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".Tag." + tagsListIndex + ".Value",
                                    StringUtils.fromString(tagSpecificationTagsListValue.getValue()));
                        }
                        tagsListIndex++;
                    }
                }
                tagSpecificationsListIndex++;
            }
        }

        request.addParameter("ClientToken", IdempotentUtils.resolveString(createVerifiedAccessTrustProviderRequest.getClientToken()));

        return request;
    }

}
