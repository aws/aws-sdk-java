/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ModifyReservedInstancesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyReservedInstancesRequestMarshaller implements Marshaller<Request<ModifyReservedInstancesRequest>, ModifyReservedInstancesRequest> {

    public Request<ModifyReservedInstancesRequest> marshall(ModifyReservedInstancesRequest modifyReservedInstancesRequest) {

        if (modifyReservedInstancesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyReservedInstancesRequest> request = new DefaultRequest<ModifyReservedInstancesRequest>(modifyReservedInstancesRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyReservedInstances");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> modifyReservedInstancesRequestReservedInstancesIdsList = (com.amazonaws.internal.SdkInternalList<String>) modifyReservedInstancesRequest
                .getReservedInstancesIds();
        if (!modifyReservedInstancesRequestReservedInstancesIdsList.isEmpty() || !modifyReservedInstancesRequestReservedInstancesIdsList.isAutoConstruct()) {
            int reservedInstancesIdsListIndex = 1;

            for (String modifyReservedInstancesRequestReservedInstancesIdsListValue : modifyReservedInstancesRequestReservedInstancesIdsList) {
                if (modifyReservedInstancesRequestReservedInstancesIdsListValue != null) {
                    request.addParameter("ReservedInstancesId." + reservedInstancesIdsListIndex,
                            StringUtils.fromString(modifyReservedInstancesRequestReservedInstancesIdsListValue));
                }
                reservedInstancesIdsListIndex++;
            }
        }

        if (modifyReservedInstancesRequest.getClientToken() != null) {
            request.addParameter("ClientToken", StringUtils.fromString(modifyReservedInstancesRequest.getClientToken()));
        }

        com.amazonaws.internal.SdkInternalList<ReservedInstancesConfiguration> modifyReservedInstancesRequestTargetConfigurationsList = (com.amazonaws.internal.SdkInternalList<ReservedInstancesConfiguration>) modifyReservedInstancesRequest
                .getTargetConfigurations();
        if (!modifyReservedInstancesRequestTargetConfigurationsList.isEmpty() || !modifyReservedInstancesRequestTargetConfigurationsList.isAutoConstruct()) {
            int targetConfigurationsListIndex = 1;

            for (ReservedInstancesConfiguration modifyReservedInstancesRequestTargetConfigurationsListValue : modifyReservedInstancesRequestTargetConfigurationsList) {

                if (modifyReservedInstancesRequestTargetConfigurationsListValue.getAvailabilityZone() != null) {
                    request.addParameter("ReservedInstancesConfigurationSetItemType." + targetConfigurationsListIndex + ".AvailabilityZone",
                            StringUtils.fromString(modifyReservedInstancesRequestTargetConfigurationsListValue.getAvailabilityZone()));
                }

                if (modifyReservedInstancesRequestTargetConfigurationsListValue.getInstanceCount() != null) {
                    request.addParameter("ReservedInstancesConfigurationSetItemType." + targetConfigurationsListIndex + ".InstanceCount",
                            StringUtils.fromInteger(modifyReservedInstancesRequestTargetConfigurationsListValue.getInstanceCount()));
                }

                if (modifyReservedInstancesRequestTargetConfigurationsListValue.getInstanceType() != null) {
                    request.addParameter("ReservedInstancesConfigurationSetItemType." + targetConfigurationsListIndex + ".InstanceType",
                            StringUtils.fromString(modifyReservedInstancesRequestTargetConfigurationsListValue.getInstanceType()));
                }

                if (modifyReservedInstancesRequestTargetConfigurationsListValue.getPlatform() != null) {
                    request.addParameter("ReservedInstancesConfigurationSetItemType." + targetConfigurationsListIndex + ".Platform",
                            StringUtils.fromString(modifyReservedInstancesRequestTargetConfigurationsListValue.getPlatform()));
                }

                if (modifyReservedInstancesRequestTargetConfigurationsListValue.getScope() != null) {
                    request.addParameter("ReservedInstancesConfigurationSetItemType." + targetConfigurationsListIndex + ".Scope",
                            StringUtils.fromString(modifyReservedInstancesRequestTargetConfigurationsListValue.getScope()));
                }
                targetConfigurationsListIndex++;
            }
        }

        return request;
    }

}
