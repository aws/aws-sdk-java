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
 * DescribeTrustStoresRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTrustStoresRequestMarshaller implements Marshaller<Request<DescribeTrustStoresRequest>, DescribeTrustStoresRequest> {

    public Request<DescribeTrustStoresRequest> marshall(DescribeTrustStoresRequest describeTrustStoresRequest) {

        if (describeTrustStoresRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeTrustStoresRequest> request = new DefaultRequest<DescribeTrustStoresRequest>(describeTrustStoresRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "DescribeTrustStores");
        request.addParameter("Version", "2015-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeTrustStoresRequest.getTrustStoreArns() != null) {
            java.util.List<String> trustStoreArnsList = describeTrustStoresRequest.getTrustStoreArns();
            if (trustStoreArnsList.isEmpty()) {
                request.addParameter("TrustStoreArns", "");
            } else {
                int trustStoreArnsListIndex = 1;

                for (String trustStoreArnsListValue : trustStoreArnsList) {
                    if (trustStoreArnsListValue != null) {
                        request.addParameter("TrustStoreArns.member." + trustStoreArnsListIndex, StringUtils.fromString(trustStoreArnsListValue));
                    }
                    trustStoreArnsListIndex++;
                }
            }
        }

        if (describeTrustStoresRequest.getNames() != null) {
            java.util.List<String> namesList = describeTrustStoresRequest.getNames();
            if (namesList.isEmpty()) {
                request.addParameter("Names", "");
            } else {
                int namesListIndex = 1;

                for (String namesListValue : namesList) {
                    if (namesListValue != null) {
                        request.addParameter("Names.member." + namesListIndex, StringUtils.fromString(namesListValue));
                    }
                    namesListIndex++;
                }
            }
        }

        if (describeTrustStoresRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeTrustStoresRequest.getMarker()));
        }

        if (describeTrustStoresRequest.getPageSize() != null) {
            request.addParameter("PageSize", StringUtils.fromInteger(describeTrustStoresRequest.getPageSize()));
        }

        return request;
    }

}
