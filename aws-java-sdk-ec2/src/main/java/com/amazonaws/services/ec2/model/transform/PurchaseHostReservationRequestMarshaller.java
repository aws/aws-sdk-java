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
 * PurchaseHostReservationRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PurchaseHostReservationRequestMarshaller implements Marshaller<Request<PurchaseHostReservationRequest>, PurchaseHostReservationRequest> {

    public Request<PurchaseHostReservationRequest> marshall(PurchaseHostReservationRequest purchaseHostReservationRequest) {

        if (purchaseHostReservationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<PurchaseHostReservationRequest> request = new DefaultRequest<PurchaseHostReservationRequest>(purchaseHostReservationRequest, "AmazonEC2");
        request.addParameter("Action", "PurchaseHostReservation");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (purchaseHostReservationRequest.getClientToken() != null) {
            request.addParameter("ClientToken", StringUtils.fromString(purchaseHostReservationRequest.getClientToken()));
        }

        if (purchaseHostReservationRequest.getCurrencyCode() != null) {
            request.addParameter("CurrencyCode", StringUtils.fromString(purchaseHostReservationRequest.getCurrencyCode()));
        }

        com.amazonaws.internal.SdkInternalList<String> purchaseHostReservationRequestHostIdSetList = (com.amazonaws.internal.SdkInternalList<String>) purchaseHostReservationRequest
                .getHostIdSet();
        if (!purchaseHostReservationRequestHostIdSetList.isEmpty() || !purchaseHostReservationRequestHostIdSetList.isAutoConstruct()) {
            int hostIdSetListIndex = 1;

            for (String purchaseHostReservationRequestHostIdSetListValue : purchaseHostReservationRequestHostIdSetList) {
                if (purchaseHostReservationRequestHostIdSetListValue != null) {
                    request.addParameter("HostIdSet." + hostIdSetListIndex, StringUtils.fromString(purchaseHostReservationRequestHostIdSetListValue));
                }
                hostIdSetListIndex++;
            }
        }

        if (purchaseHostReservationRequest.getLimitPrice() != null) {
            request.addParameter("LimitPrice", StringUtils.fromString(purchaseHostReservationRequest.getLimitPrice()));
        }

        if (purchaseHostReservationRequest.getOfferingId() != null) {
            request.addParameter("OfferingId", StringUtils.fromString(purchaseHostReservationRequest.getOfferingId()));
        }

        return request;
    }

}
