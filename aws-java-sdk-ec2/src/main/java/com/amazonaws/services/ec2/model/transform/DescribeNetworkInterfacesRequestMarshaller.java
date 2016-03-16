/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * DescribeNetworkInterfacesRequest Marshaller
 */

public class DescribeNetworkInterfacesRequestMarshaller
        implements
        Marshaller<Request<DescribeNetworkInterfacesRequest>, DescribeNetworkInterfacesRequest> {

    public Request<DescribeNetworkInterfacesRequest> marshall(
            DescribeNetworkInterfacesRequest describeNetworkInterfacesRequest) {

        if (describeNetworkInterfacesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DescribeNetworkInterfacesRequest> request = new DefaultRequest<DescribeNetworkInterfacesRequest>(
                describeNetworkInterfacesRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeNetworkInterfaces");
        request.addParameter("Version", "2015-10-01");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> networkInterfaceIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeNetworkInterfacesRequest
                .getNetworkInterfaceIds();
        if (!networkInterfaceIdsList.isEmpty()
                || !networkInterfaceIdsList.isAutoConstruct()) {
            int networkInterfaceIdsListIndex = 1;

            for (String networkInterfaceIdsListValue : networkInterfaceIdsList) {
                if (networkInterfaceIdsListValue != null) {
                    request.addParameter("NetworkInterfaceId."
                            + networkInterfaceIdsListIndex, StringUtils
                            .fromString(networkInterfaceIdsListValue));
                }
                networkInterfaceIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> filtersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeNetworkInterfacesRequest
                .getFilters();
        if (!filtersList.isEmpty() || !filtersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter filtersListValue : filtersList) {

                if (filtersListValue.getName() != null) {
                    request.addParameter(
                            "Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(filtersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> valuesList = (com.amazonaws.internal.SdkInternalList<String>) filtersListValue
                        .getValues();
                if (!valuesList.isEmpty() || !valuesList.isAutoConstruct()) {
                    int valuesListIndex = 1;

                    for (String valuesListValue : valuesList) {
                        if (valuesListValue != null) {
                            request.addParameter("Filter." + filtersListIndex
                                    + ".Value." + valuesListIndex,
                                    StringUtils.fromString(valuesListValue));
                        }
                        valuesListIndex++;
                    }
                }
                filtersListIndex++;
            }
        }

        return request;
    }

}
