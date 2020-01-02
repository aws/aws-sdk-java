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
package com.amazonaws.services.redshift.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeNodeConfigurationOptionsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNodeConfigurationOptionsRequestMarshaller implements
        Marshaller<Request<DescribeNodeConfigurationOptionsRequest>, DescribeNodeConfigurationOptionsRequest> {

    public Request<DescribeNodeConfigurationOptionsRequest> marshall(DescribeNodeConfigurationOptionsRequest describeNodeConfigurationOptionsRequest) {

        if (describeNodeConfigurationOptionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeNodeConfigurationOptionsRequest> request = new DefaultRequest<DescribeNodeConfigurationOptionsRequest>(
                describeNodeConfigurationOptionsRequest, "AmazonRedshift");
        request.addParameter("Action", "DescribeNodeConfigurationOptions");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeNodeConfigurationOptionsRequest.getActionType() != null) {
            request.addParameter("ActionType", StringUtils.fromString(describeNodeConfigurationOptionsRequest.getActionType()));
        }

        if (describeNodeConfigurationOptionsRequest.getClusterIdentifier() != null) {
            request.addParameter("ClusterIdentifier", StringUtils.fromString(describeNodeConfigurationOptionsRequest.getClusterIdentifier()));
        }

        if (describeNodeConfigurationOptionsRequest.getSnapshotIdentifier() != null) {
            request.addParameter("SnapshotIdentifier", StringUtils.fromString(describeNodeConfigurationOptionsRequest.getSnapshotIdentifier()));
        }

        if (describeNodeConfigurationOptionsRequest.getOwnerAccount() != null) {
            request.addParameter("OwnerAccount", StringUtils.fromString(describeNodeConfigurationOptionsRequest.getOwnerAccount()));
        }

        if (!describeNodeConfigurationOptionsRequest.getFilters().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<NodeConfigurationOptionsFilter>) describeNodeConfigurationOptionsRequest.getFilters())
                        .isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<NodeConfigurationOptionsFilter> filtersList = (com.amazonaws.internal.SdkInternalList<NodeConfigurationOptionsFilter>) describeNodeConfigurationOptionsRequest
                    .getFilters();
            int filtersListIndex = 1;

            for (NodeConfigurationOptionsFilter filtersListValue : filtersList) {

                if (filtersListValue.getName() != null) {
                    request.addParameter("Filter.NodeConfigurationOptionsFilter." + filtersListIndex + ".Name",
                            StringUtils.fromString(filtersListValue.getName()));
                }

                if (filtersListValue.getOperator() != null) {
                    request.addParameter("Filter.NodeConfigurationOptionsFilter." + filtersListIndex + ".Operator",
                            StringUtils.fromString(filtersListValue.getOperator()));
                }

                if (!filtersListValue.getValues().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<String>) filtersListValue.getValues()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<String> valuesList = (com.amazonaws.internal.SdkInternalList<String>) filtersListValue.getValues();
                    int valuesListIndex = 1;

                    for (String valuesListValue : valuesList) {
                        if (valuesListValue != null) {
                            request.addParameter("Filter.NodeConfigurationOptionsFilter." + filtersListIndex + ".Value.item." + valuesListIndex,
                                    StringUtils.fromString(valuesListValue));
                        }
                        valuesListIndex++;
                    }
                }
                filtersListIndex++;
            }
        }

        if (describeNodeConfigurationOptionsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeNodeConfigurationOptionsRequest.getMarker()));
        }

        if (describeNodeConfigurationOptionsRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeNodeConfigurationOptionsRequest.getMaxRecords()));
        }

        return request;
    }

}
