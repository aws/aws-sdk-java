/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Modify Reserved Instances Request Marshaller
 */
public class ModifyReservedInstancesRequestMarshaller implements Marshaller<Request<ModifyReservedInstancesRequest>, ModifyReservedInstancesRequest> {

    public Request<ModifyReservedInstancesRequest> marshall(ModifyReservedInstancesRequest modifyReservedInstancesRequest) {

        if (modifyReservedInstancesRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<ModifyReservedInstancesRequest> request = new DefaultRequest<ModifyReservedInstancesRequest>(modifyReservedInstancesRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyReservedInstances");
        request.addParameter("Version", "2013-10-15");

        if (modifyReservedInstancesRequest.getClientToken() != null) {
            request.addParameter("ClientToken", StringUtils.fromString(modifyReservedInstancesRequest.getClientToken()));
        }

        java.util.List<String> reservedInstancesIdsList = modifyReservedInstancesRequest.getReservedInstancesIds();
        int reservedInstancesIdsListIndex = 1;

        for (String reservedInstancesIdsListValue : reservedInstancesIdsList) {
            if (reservedInstancesIdsListValue != null) {
                request.addParameter("ReservedInstancesId." + reservedInstancesIdsListIndex, StringUtils.fromString(reservedInstancesIdsListValue));
            }

            reservedInstancesIdsListIndex++;
        }

        java.util.List<ReservedInstancesConfiguration> targetConfigurationsList = modifyReservedInstancesRequest.getTargetConfigurations();
        int targetConfigurationsListIndex = 1;

        for (ReservedInstancesConfiguration targetConfigurationsListValue : targetConfigurationsList) {
            ReservedInstancesConfiguration reservedInstancesConfigurationMember = targetConfigurationsListValue;
            if (reservedInstancesConfigurationMember != null) {
                if (reservedInstancesConfigurationMember.getAvailabilityZone() != null) {
                    request.addParameter("ReservedInstancesConfigurationSetItemType." + targetConfigurationsListIndex + ".AvailabilityZone", StringUtils.fromString(reservedInstancesConfigurationMember.getAvailabilityZone()));
                }
                if (reservedInstancesConfigurationMember.getPlatform() != null) {
                    request.addParameter("ReservedInstancesConfigurationSetItemType." + targetConfigurationsListIndex + ".Platform", StringUtils.fromString(reservedInstancesConfigurationMember.getPlatform()));
                }
                if (reservedInstancesConfigurationMember.getInstanceCount() != null) {
                    request.addParameter("ReservedInstancesConfigurationSetItemType." + targetConfigurationsListIndex + ".InstanceCount", StringUtils.fromInteger(reservedInstancesConfigurationMember.getInstanceCount()));
                }
                if (reservedInstancesConfigurationMember.getInstanceType() != null) {
                    request.addParameter("ReservedInstancesConfigurationSetItemType." + targetConfigurationsListIndex + ".InstanceType", StringUtils.fromString(reservedInstancesConfigurationMember.getInstanceType()));
                }
            }

            targetConfigurationsListIndex++;
        }


        return request;
    }
}
