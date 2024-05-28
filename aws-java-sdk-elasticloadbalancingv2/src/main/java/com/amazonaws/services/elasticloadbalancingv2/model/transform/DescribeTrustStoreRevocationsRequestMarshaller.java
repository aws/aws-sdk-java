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
package com.amazonaws.services.elasticloadbalancingv2.model.transform;

import java.util.List;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticloadbalancingv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeTrustStoreRevocationsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTrustStoreRevocationsRequestMarshaller implements
        Marshaller<Request<DescribeTrustStoreRevocationsRequest>, DescribeTrustStoreRevocationsRequest> {

    public Request<DescribeTrustStoreRevocationsRequest> marshall(DescribeTrustStoreRevocationsRequest describeTrustStoreRevocationsRequest) {

        if (describeTrustStoreRevocationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeTrustStoreRevocationsRequest> request = new DefaultRequest<DescribeTrustStoreRevocationsRequest>(describeTrustStoreRevocationsRequest,
                "AmazonElasticLoadBalancing");
        request.addParameter("Action", "DescribeTrustStoreRevocations");
        request.addParameter("Version", "2015-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeTrustStoreRevocationsRequest.getTrustStoreArn() != null) {
            request.addParameter("TrustStoreArn", StringUtils.fromString(describeTrustStoreRevocationsRequest.getTrustStoreArn()));
        }

        if (describeTrustStoreRevocationsRequest.getRevocationIds() != null) {
            java.util.List<Long> revocationIdsList = describeTrustStoreRevocationsRequest.getRevocationIds();
            if (revocationIdsList.isEmpty()) {
                request.addParameter("RevocationIds", "");
            } else {
                int revocationIdsListIndex = 1;

                for (Long revocationIdsListValue : revocationIdsList) {
                    if (revocationIdsListValue != null) {
                        request.addParameter("RevocationIds.member." + revocationIdsListIndex, StringUtils.fromLong(revocationIdsListValue));
                    }
                    revocationIdsListIndex++;
                }
            }
        }

        if (describeTrustStoreRevocationsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeTrustStoreRevocationsRequest.getMarker()));
        }

        if (describeTrustStoreRevocationsRequest.getPageSize() != null) {
            request.addParameter("PageSize", StringUtils.fromInteger(describeTrustStoreRevocationsRequest.getPageSize()));
        }

        return request;
    }

}
