/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Add Instance Groups Request Marshaller
 */
public class AddInstanceGroupsRequestMarshaller implements Marshaller<Request<AddInstanceGroupsRequest>, AddInstanceGroupsRequest> {

    public Request<AddInstanceGroupsRequest> marshall(AddInstanceGroupsRequest addInstanceGroupsRequest) {

        if (addInstanceGroupsRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<AddInstanceGroupsRequest> request = new DefaultRequest<AddInstanceGroupsRequest>(addInstanceGroupsRequest, "AmazonElasticMapReduce");
        request.addParameter("Action", "AddInstanceGroups");
        request.addParameter("Version", "2009-03-31");


        java.util.List<InstanceGroupConfig> instanceGroupsList = addInstanceGroupsRequest.getInstanceGroups();
        int instanceGroupsListIndex = 1;

        for (InstanceGroupConfig instanceGroupsListValue : instanceGroupsList) {
            InstanceGroupConfig instanceGroupConfigMember = instanceGroupsListValue;
            if (instanceGroupConfigMember != null) {
                if (instanceGroupConfigMember.getName() != null) {
                    request.addParameter("InstanceGroups.member." + instanceGroupsListIndex + ".Name", StringUtils.fromString(instanceGroupConfigMember.getName()));
                }
                if (instanceGroupConfigMember.getMarket() != null) {
                    request.addParameter("InstanceGroups.member." + instanceGroupsListIndex + ".Market", StringUtils.fromString(instanceGroupConfigMember.getMarket()));
                }
                if (instanceGroupConfigMember.getInstanceRole() != null) {
                    request.addParameter("InstanceGroups.member." + instanceGroupsListIndex + ".InstanceRole", StringUtils.fromString(instanceGroupConfigMember.getInstanceRole()));
                }
                if (instanceGroupConfigMember.getBidPrice() != null) {
                    request.addParameter("InstanceGroups.member." + instanceGroupsListIndex + ".BidPrice", StringUtils.fromString(instanceGroupConfigMember.getBidPrice()));
                }
                if (instanceGroupConfigMember.getInstanceType() != null) {
                    request.addParameter("InstanceGroups.member." + instanceGroupsListIndex + ".InstanceType", StringUtils.fromString(instanceGroupConfigMember.getInstanceType()));
                }
                if (instanceGroupConfigMember.getInstanceCount() != null) {
                    request.addParameter("InstanceGroups.member." + instanceGroupsListIndex + ".InstanceCount", StringUtils.fromInteger(instanceGroupConfigMember.getInstanceCount()));
                }
            }

            instanceGroupsListIndex++;
        }
        if (addInstanceGroupsRequest.getJobFlowId() != null) {
            request.addParameter("JobFlowId", StringUtils.fromString(addInstanceGroupsRequest.getJobFlowId()));
        }


        return request;
    }
}
