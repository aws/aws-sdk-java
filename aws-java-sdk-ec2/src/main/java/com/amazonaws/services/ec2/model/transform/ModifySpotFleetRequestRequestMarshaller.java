/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ModifySpotFleetRequestRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifySpotFleetRequestRequestMarshaller implements Marshaller<Request<ModifySpotFleetRequestRequest>, ModifySpotFleetRequestRequest> {

    public Request<ModifySpotFleetRequestRequest> marshall(ModifySpotFleetRequestRequest modifySpotFleetRequestRequest) {

        if (modifySpotFleetRequestRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifySpotFleetRequestRequest> request = new DefaultRequest<ModifySpotFleetRequestRequest>(modifySpotFleetRequestRequest, "AmazonEC2");
        request.addParameter("Action", "ModifySpotFleetRequest");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifySpotFleetRequestRequest.getExcessCapacityTerminationPolicy() != null) {
            request.addParameter("ExcessCapacityTerminationPolicy", StringUtils.fromString(modifySpotFleetRequestRequest.getExcessCapacityTerminationPolicy()));
        }

        com.amazonaws.internal.SdkInternalList<LaunchTemplateConfig> modifySpotFleetRequestRequestLaunchTemplateConfigsList = (com.amazonaws.internal.SdkInternalList<LaunchTemplateConfig>) modifySpotFleetRequestRequest
                .getLaunchTemplateConfigs();
        if (!modifySpotFleetRequestRequestLaunchTemplateConfigsList.isEmpty() || !modifySpotFleetRequestRequestLaunchTemplateConfigsList.isAutoConstruct()) {
            int launchTemplateConfigsListIndex = 1;

            for (LaunchTemplateConfig modifySpotFleetRequestRequestLaunchTemplateConfigsListValue : modifySpotFleetRequestRequestLaunchTemplateConfigsList) {

                FleetLaunchTemplateSpecification launchTemplateSpecification = modifySpotFleetRequestRequestLaunchTemplateConfigsListValue
                        .getLaunchTemplateSpecification();
                if (launchTemplateSpecification != null) {

                    if (launchTemplateSpecification.getLaunchTemplateId() != null) {
                        request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".LaunchTemplateSpecification.LaunchTemplateId",
                                StringUtils.fromString(launchTemplateSpecification.getLaunchTemplateId()));
                    }

                    if (launchTemplateSpecification.getLaunchTemplateName() != null) {
                        request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".LaunchTemplateSpecification.LaunchTemplateName",
                                StringUtils.fromString(launchTemplateSpecification.getLaunchTemplateName()));
                    }

                    if (launchTemplateSpecification.getVersion() != null) {
                        request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".LaunchTemplateSpecification.Version",
                                StringUtils.fromString(launchTemplateSpecification.getVersion()));
                    }
                }

                com.amazonaws.internal.SdkInternalList<LaunchTemplateOverrides> launchTemplateConfigOverridesList = (com.amazonaws.internal.SdkInternalList<LaunchTemplateOverrides>) modifySpotFleetRequestRequestLaunchTemplateConfigsListValue
                        .getOverrides();
                if (!launchTemplateConfigOverridesList.isEmpty() || !launchTemplateConfigOverridesList.isAutoConstruct()) {
                    int overridesListIndex = 1;

                    for (LaunchTemplateOverrides launchTemplateConfigOverridesListValue : launchTemplateConfigOverridesList) {

                        if (launchTemplateConfigOverridesListValue.getInstanceType() != null) {
                            request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                    + ".InstanceType", StringUtils.fromString(launchTemplateConfigOverridesListValue.getInstanceType()));
                        }

                        if (launchTemplateConfigOverridesListValue.getSpotPrice() != null) {
                            request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex + ".SpotPrice",
                                    StringUtils.fromString(launchTemplateConfigOverridesListValue.getSpotPrice()));
                        }

                        if (launchTemplateConfigOverridesListValue.getSubnetId() != null) {
                            request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex + ".SubnetId",
                                    StringUtils.fromString(launchTemplateConfigOverridesListValue.getSubnetId()));
                        }

                        if (launchTemplateConfigOverridesListValue.getAvailabilityZone() != null) {
                            request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                    + ".AvailabilityZone", StringUtils.fromString(launchTemplateConfigOverridesListValue.getAvailabilityZone()));
                        }

                        if (launchTemplateConfigOverridesListValue.getWeightedCapacity() != null) {
                            request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex
                                    + ".WeightedCapacity", StringUtils.fromDouble(launchTemplateConfigOverridesListValue.getWeightedCapacity()));
                        }

                        if (launchTemplateConfigOverridesListValue.getPriority() != null) {
                            request.addParameter("LaunchTemplateConfig." + launchTemplateConfigsListIndex + ".Overrides." + overridesListIndex + ".Priority",
                                    StringUtils.fromDouble(launchTemplateConfigOverridesListValue.getPriority()));
                        }
                        overridesListIndex++;
                    }
                }
                launchTemplateConfigsListIndex++;
            }
        }

        if (modifySpotFleetRequestRequest.getSpotFleetRequestId() != null) {
            request.addParameter("SpotFleetRequestId", StringUtils.fromString(modifySpotFleetRequestRequest.getSpotFleetRequestId()));
        }

        if (modifySpotFleetRequestRequest.getTargetCapacity() != null) {
            request.addParameter("TargetCapacity", StringUtils.fromInteger(modifySpotFleetRequestRequest.getTargetCapacity()));
        }

        if (modifySpotFleetRequestRequest.getOnDemandTargetCapacity() != null) {
            request.addParameter("OnDemandTargetCapacity", StringUtils.fromInteger(modifySpotFleetRequestRequest.getOnDemandTargetCapacity()));
        }

        return request;
    }

}
