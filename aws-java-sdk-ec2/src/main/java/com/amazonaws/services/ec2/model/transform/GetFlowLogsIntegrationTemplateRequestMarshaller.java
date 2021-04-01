/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * GetFlowLogsIntegrationTemplateRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFlowLogsIntegrationTemplateRequestMarshaller implements
        Marshaller<Request<GetFlowLogsIntegrationTemplateRequest>, GetFlowLogsIntegrationTemplateRequest> {

    public Request<GetFlowLogsIntegrationTemplateRequest> marshall(GetFlowLogsIntegrationTemplateRequest getFlowLogsIntegrationTemplateRequest) {

        if (getFlowLogsIntegrationTemplateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetFlowLogsIntegrationTemplateRequest> request = new DefaultRequest<GetFlowLogsIntegrationTemplateRequest>(
                getFlowLogsIntegrationTemplateRequest, "AmazonEC2");
        request.addParameter("Action", "GetFlowLogsIntegrationTemplate");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (getFlowLogsIntegrationTemplateRequest.getFlowLogId() != null) {
            request.addParameter("FlowLogId", StringUtils.fromString(getFlowLogsIntegrationTemplateRequest.getFlowLogId()));
        }

        if (getFlowLogsIntegrationTemplateRequest.getConfigDeliveryS3DestinationArn() != null) {
            request.addParameter("ConfigDeliveryS3DestinationArn",
                    StringUtils.fromString(getFlowLogsIntegrationTemplateRequest.getConfigDeliveryS3DestinationArn()));
        }

        IntegrateServices integrateServices = getFlowLogsIntegrationTemplateRequest.getIntegrateServices();
        if (integrateServices != null) {

            com.amazonaws.internal.SdkInternalList<AthenaIntegration> integrateServicesAthenaIntegrationsList = (com.amazonaws.internal.SdkInternalList<AthenaIntegration>) integrateServices
                    .getAthenaIntegrations();
            if (!integrateServicesAthenaIntegrationsList.isEmpty() || !integrateServicesAthenaIntegrationsList.isAutoConstruct()) {
                int athenaIntegrationsListIndex = 1;

                for (AthenaIntegration integrateServicesAthenaIntegrationsListValue : integrateServicesAthenaIntegrationsList) {

                    if (integrateServicesAthenaIntegrationsListValue.getIntegrationResultS3DestinationArn() != null) {
                        request.addParameter("IntegrateService.AthenaIntegration." + athenaIntegrationsListIndex + ".IntegrationResultS3DestinationArn",
                                StringUtils.fromString(integrateServicesAthenaIntegrationsListValue.getIntegrationResultS3DestinationArn()));
                    }

                    if (integrateServicesAthenaIntegrationsListValue.getPartitionLoadFrequency() != null) {
                        request.addParameter("IntegrateService.AthenaIntegration." + athenaIntegrationsListIndex + ".PartitionLoadFrequency",
                                StringUtils.fromString(integrateServicesAthenaIntegrationsListValue.getPartitionLoadFrequency()));
                    }

                    if (integrateServicesAthenaIntegrationsListValue.getPartitionStartDate() != null) {
                        request.addParameter("IntegrateService.AthenaIntegration." + athenaIntegrationsListIndex + ".PartitionStartDate",
                                StringUtils.fromDate(integrateServicesAthenaIntegrationsListValue.getPartitionStartDate()));
                    }

                    if (integrateServicesAthenaIntegrationsListValue.getPartitionEndDate() != null) {
                        request.addParameter("IntegrateService.AthenaIntegration." + athenaIntegrationsListIndex + ".PartitionEndDate",
                                StringUtils.fromDate(integrateServicesAthenaIntegrationsListValue.getPartitionEndDate()));
                    }
                    athenaIntegrationsListIndex++;
                }
            }
        }

        return request;
    }

}
