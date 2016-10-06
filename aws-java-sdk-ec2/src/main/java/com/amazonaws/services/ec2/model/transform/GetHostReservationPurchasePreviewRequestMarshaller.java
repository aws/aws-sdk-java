/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * GetHostReservationPurchasePreviewRequest Marshaller
 */

public class GetHostReservationPurchasePreviewRequestMarshaller implements
        Marshaller<Request<GetHostReservationPurchasePreviewRequest>, GetHostReservationPurchasePreviewRequest> {

    public Request<GetHostReservationPurchasePreviewRequest> marshall(GetHostReservationPurchasePreviewRequest getHostReservationPurchasePreviewRequest) {

        if (getHostReservationPurchasePreviewRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetHostReservationPurchasePreviewRequest> request = new DefaultRequest<GetHostReservationPurchasePreviewRequest>(
                getHostReservationPurchasePreviewRequest, "AmazonEC2");
        request.addParameter("Action", "GetHostReservationPurchasePreview");
        request.addParameter("Version", "2016-09-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (getHostReservationPurchasePreviewRequest.getOfferingId() != null) {
            request.addParameter("OfferingId", StringUtils.fromString(getHostReservationPurchasePreviewRequest.getOfferingId()));
        }

        com.amazonaws.internal.SdkInternalList<String> getHostReservationPurchasePreviewRequestHostIdSetList = (com.amazonaws.internal.SdkInternalList<String>) getHostReservationPurchasePreviewRequest
                .getHostIdSet();
        if (!getHostReservationPurchasePreviewRequestHostIdSetList.isEmpty() || !getHostReservationPurchasePreviewRequestHostIdSetList.isAutoConstruct()) {
            int hostIdSetListIndex = 1;

            for (String getHostReservationPurchasePreviewRequestHostIdSetListValue : getHostReservationPurchasePreviewRequestHostIdSetList) {
                if (getHostReservationPurchasePreviewRequestHostIdSetListValue != null) {
                    request.addParameter("HostIdSet." + hostIdSetListIndex, StringUtils.fromString(getHostReservationPurchasePreviewRequestHostIdSetListValue));
                }
                hostIdSetListIndex++;
            }
        }

        return request;
    }

}
