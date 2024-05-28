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
 * ModifyVerifiedAccessTrustProviderRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyVerifiedAccessTrustProviderRequestMarshaller implements
        Marshaller<Request<ModifyVerifiedAccessTrustProviderRequest>, ModifyVerifiedAccessTrustProviderRequest> {

    public Request<ModifyVerifiedAccessTrustProviderRequest> marshall(ModifyVerifiedAccessTrustProviderRequest modifyVerifiedAccessTrustProviderRequest) {

        if (modifyVerifiedAccessTrustProviderRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyVerifiedAccessTrustProviderRequest> request = new DefaultRequest<ModifyVerifiedAccessTrustProviderRequest>(
                modifyVerifiedAccessTrustProviderRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyVerifiedAccessTrustProvider");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyVerifiedAccessTrustProviderRequest.getVerifiedAccessTrustProviderId() != null) {
            request.addParameter("VerifiedAccessTrustProviderId",
                    StringUtils.fromString(modifyVerifiedAccessTrustProviderRequest.getVerifiedAccessTrustProviderId()));
        }

        ModifyVerifiedAccessTrustProviderOidcOptions oidcOptions = modifyVerifiedAccessTrustProviderRequest.getOidcOptions();
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

        ModifyVerifiedAccessTrustProviderDeviceOptions deviceOptions = modifyVerifiedAccessTrustProviderRequest.getDeviceOptions();
        if (deviceOptions != null) {

            if (deviceOptions.getPublicSigningKeyUrl() != null) {
                request.addParameter("DeviceOptions.PublicSigningKeyUrl", StringUtils.fromString(deviceOptions.getPublicSigningKeyUrl()));
            }
        }

        if (modifyVerifiedAccessTrustProviderRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(modifyVerifiedAccessTrustProviderRequest.getDescription()));
        }

        request.addParameter("ClientToken", IdempotentUtils.resolveString(modifyVerifiedAccessTrustProviderRequest.getClientToken()));

        VerifiedAccessSseSpecificationRequest sseSpecification = modifyVerifiedAccessTrustProviderRequest.getSseSpecification();
        if (sseSpecification != null) {

            if (sseSpecification.getCustomerManagedKeyEnabled() != null) {
                request.addParameter("SseSpecification.CustomerManagedKeyEnabled", StringUtils.fromBoolean(sseSpecification.getCustomerManagedKeyEnabled()));
            }

            if (sseSpecification.getKmsKeyArn() != null) {
                request.addParameter("SseSpecification.KmsKeyArn", StringUtils.fromString(sseSpecification.getKmsKeyArn()));
            }
        }

        return request;
    }

}
