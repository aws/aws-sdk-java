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
package com.amazonaws.services.redshift.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CreateRedshiftIdcApplicationRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRedshiftIdcApplicationRequestMarshaller implements
        Marshaller<Request<CreateRedshiftIdcApplicationRequest>, CreateRedshiftIdcApplicationRequest> {

    public Request<CreateRedshiftIdcApplicationRequest> marshall(CreateRedshiftIdcApplicationRequest createRedshiftIdcApplicationRequest) {

        if (createRedshiftIdcApplicationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateRedshiftIdcApplicationRequest> request = new DefaultRequest<CreateRedshiftIdcApplicationRequest>(createRedshiftIdcApplicationRequest,
                "AmazonRedshift");
        request.addParameter("Action", "CreateRedshiftIdcApplication");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (createRedshiftIdcApplicationRequest.getIdcInstanceArn() != null) {
            request.addParameter("IdcInstanceArn", StringUtils.fromString(createRedshiftIdcApplicationRequest.getIdcInstanceArn()));
        }

        if (createRedshiftIdcApplicationRequest.getRedshiftIdcApplicationName() != null) {
            request.addParameter("RedshiftIdcApplicationName", StringUtils.fromString(createRedshiftIdcApplicationRequest.getRedshiftIdcApplicationName()));
        }

        if (createRedshiftIdcApplicationRequest.getIdentityNamespace() != null) {
            request.addParameter("IdentityNamespace", StringUtils.fromString(createRedshiftIdcApplicationRequest.getIdentityNamespace()));
        }

        if (createRedshiftIdcApplicationRequest.getIdcDisplayName() != null) {
            request.addParameter("IdcDisplayName", StringUtils.fromString(createRedshiftIdcApplicationRequest.getIdcDisplayName()));
        }

        if (createRedshiftIdcApplicationRequest.getIamRoleArn() != null) {
            request.addParameter("IamRoleArn", StringUtils.fromString(createRedshiftIdcApplicationRequest.getIamRoleArn()));
        }

        if (!createRedshiftIdcApplicationRequest.getAuthorizedTokenIssuerList().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<AuthorizedTokenIssuer>) createRedshiftIdcApplicationRequest.getAuthorizedTokenIssuerList())
                        .isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<AuthorizedTokenIssuer> authorizedTokenIssuerListList = (com.amazonaws.internal.SdkInternalList<AuthorizedTokenIssuer>) createRedshiftIdcApplicationRequest
                    .getAuthorizedTokenIssuerList();
            int authorizedTokenIssuerListListIndex = 1;

            for (AuthorizedTokenIssuer authorizedTokenIssuerListListValue : authorizedTokenIssuerListList) {
                if (authorizedTokenIssuerListListValue != null) {

                    if (authorizedTokenIssuerListListValue.getTrustedTokenIssuerArn() != null) {
                        request.addParameter("AuthorizedTokenIssuerList.member." + authorizedTokenIssuerListListIndex + ".TrustedTokenIssuerArn",
                                StringUtils.fromString(authorizedTokenIssuerListListValue.getTrustedTokenIssuerArn()));
                    }

                    if (!authorizedTokenIssuerListListValue.getAuthorizedAudiencesList().isEmpty()
                            || !((com.amazonaws.internal.SdkInternalList<String>) authorizedTokenIssuerListListValue.getAuthorizedAudiencesList())
                                    .isAutoConstruct()) {
                        com.amazonaws.internal.SdkInternalList<String> authorizedAudiencesListList = (com.amazonaws.internal.SdkInternalList<String>) authorizedTokenIssuerListListValue
                                .getAuthorizedAudiencesList();
                        int authorizedAudiencesListListIndex = 1;

                        for (String authorizedAudiencesListListValue : authorizedAudiencesListList) {
                            if (authorizedAudiencesListListValue != null) {
                                request.addParameter("AuthorizedTokenIssuerList.member." + authorizedTokenIssuerListListIndex
                                        + ".AuthorizedAudiencesList.member." + authorizedAudiencesListListIndex,
                                        StringUtils.fromString(authorizedAudiencesListListValue));
                            }
                            authorizedAudiencesListListIndex++;
                        }
                    }
                }
                authorizedTokenIssuerListListIndex++;
            }
        }

        if (!createRedshiftIdcApplicationRequest.getServiceIntegrations().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<ServiceIntegrationsUnion>) createRedshiftIdcApplicationRequest.getServiceIntegrations())
                        .isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<ServiceIntegrationsUnion> serviceIntegrationsList = (com.amazonaws.internal.SdkInternalList<ServiceIntegrationsUnion>) createRedshiftIdcApplicationRequest
                    .getServiceIntegrations();
            int serviceIntegrationsListIndex = 1;

            for (ServiceIntegrationsUnion serviceIntegrationsListValue : serviceIntegrationsList) {
                if (serviceIntegrationsListValue != null) {

                    if (!serviceIntegrationsListValue.getLakeFormation().isEmpty()
                            || !((com.amazonaws.internal.SdkInternalList<LakeFormationScopeUnion>) serviceIntegrationsListValue.getLakeFormation())
                                    .isAutoConstruct()) {
                        com.amazonaws.internal.SdkInternalList<LakeFormationScopeUnion> lakeFormationList = (com.amazonaws.internal.SdkInternalList<LakeFormationScopeUnion>) serviceIntegrationsListValue
                                .getLakeFormation();
                        int lakeFormationListIndex = 1;

                        for (LakeFormationScopeUnion lakeFormationListValue : lakeFormationList) {
                            if (lakeFormationListValue != null) {

                                {
                                    LakeFormationQuery lakeFormationQuery = lakeFormationListValue.getLakeFormationQuery();
                                    if (lakeFormationQuery != null) {

                                        if (lakeFormationQuery.getAuthorization() != null) {
                                            request.addParameter("ServiceIntegrations.member." + serviceIntegrationsListIndex + ".LakeFormation.member."
                                                    + lakeFormationListIndex + ".LakeFormationQuery.Authorization",
                                                    StringUtils.fromString(lakeFormationQuery.getAuthorization()));
                                        }
                                    }
                                }
                            }
                            lakeFormationListIndex++;
                        }
                    }
                }
                serviceIntegrationsListIndex++;
            }
        }

        return request;
    }

}
