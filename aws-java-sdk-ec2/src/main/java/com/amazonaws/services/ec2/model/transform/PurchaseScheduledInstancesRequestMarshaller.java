/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Purchase Scheduled Instances Request Marshaller
 */
public class PurchaseScheduledInstancesRequestMarshaller implements Marshaller<Request<PurchaseScheduledInstancesRequest>, PurchaseScheduledInstancesRequest> {

    public Request<PurchaseScheduledInstancesRequest> marshall(PurchaseScheduledInstancesRequest purchaseScheduledInstancesRequest) {

        if (purchaseScheduledInstancesRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<PurchaseScheduledInstancesRequest> request = new DefaultRequest<PurchaseScheduledInstancesRequest>(purchaseScheduledInstancesRequest, "AmazonEC2");
        request.addParameter("Action", "PurchaseScheduledInstances");
        request.addParameter("Version", "2015-10-01");

        if (purchaseScheduledInstancesRequest.getClientToken() != null) {
            request.addParameter("ClientToken", StringUtils.fromString(purchaseScheduledInstancesRequest.getClientToken()));
        }

        java.util.List<PurchaseRequest> purchaseRequestsList = purchaseScheduledInstancesRequest.getPurchaseRequests();
        int purchaseRequestsListIndex = 1;

        for (PurchaseRequest purchaseRequestsListValue : purchaseRequestsList) {
            PurchaseRequest purchaseRequestMember = purchaseRequestsListValue;
            if (purchaseRequestMember != null) {
                if (purchaseRequestMember.getPurchaseToken() != null) {
                    request.addParameter("PurchaseRequest." + purchaseRequestsListIndex + ".PurchaseToken", StringUtils.fromString(purchaseRequestMember.getPurchaseToken()));
                }
                if (purchaseRequestMember.getInstanceCount() != null) {
                    request.addParameter("PurchaseRequest." + purchaseRequestsListIndex + ".InstanceCount", StringUtils.fromInteger(purchaseRequestMember.getInstanceCount()));
                }
            }

            purchaseRequestsListIndex++;
        }

        return request;
    }
}
