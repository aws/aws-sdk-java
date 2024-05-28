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
 * RemoveTrustStoreRevocationsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveTrustStoreRevocationsRequestMarshaller implements
        Marshaller<Request<RemoveTrustStoreRevocationsRequest>, RemoveTrustStoreRevocationsRequest> {

    public Request<RemoveTrustStoreRevocationsRequest> marshall(RemoveTrustStoreRevocationsRequest removeTrustStoreRevocationsRequest) {

        if (removeTrustStoreRevocationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RemoveTrustStoreRevocationsRequest> request = new DefaultRequest<RemoveTrustStoreRevocationsRequest>(removeTrustStoreRevocationsRequest,
                "AmazonElasticLoadBalancing");
        request.addParameter("Action", "RemoveTrustStoreRevocations");
        request.addParameter("Version", "2015-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (removeTrustStoreRevocationsRequest.getTrustStoreArn() != null) {
            request.addParameter("TrustStoreArn", StringUtils.fromString(removeTrustStoreRevocationsRequest.getTrustStoreArn()));
        }

        if (removeTrustStoreRevocationsRequest.getRevocationIds() != null) {
            java.util.List<Long> revocationIdsList = removeTrustStoreRevocationsRequest.getRevocationIds();
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

        return request;
    }

}
