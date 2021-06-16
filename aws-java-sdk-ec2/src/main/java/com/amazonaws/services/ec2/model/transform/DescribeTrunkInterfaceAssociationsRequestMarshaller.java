/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DescribeTrunkInterfaceAssociationsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTrunkInterfaceAssociationsRequestMarshaller implements
        Marshaller<Request<DescribeTrunkInterfaceAssociationsRequest>, DescribeTrunkInterfaceAssociationsRequest> {

    public Request<DescribeTrunkInterfaceAssociationsRequest> marshall(DescribeTrunkInterfaceAssociationsRequest describeTrunkInterfaceAssociationsRequest) {

        if (describeTrunkInterfaceAssociationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeTrunkInterfaceAssociationsRequest> request = new DefaultRequest<DescribeTrunkInterfaceAssociationsRequest>(
                describeTrunkInterfaceAssociationsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeTrunkInterfaceAssociations");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeTrunkInterfaceAssociationsRequestAssociationIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeTrunkInterfaceAssociationsRequest
                .getAssociationIds();
        if (!describeTrunkInterfaceAssociationsRequestAssociationIdsList.isEmpty()
                || !describeTrunkInterfaceAssociationsRequestAssociationIdsList.isAutoConstruct()) {
            int associationIdsListIndex = 1;

            for (String describeTrunkInterfaceAssociationsRequestAssociationIdsListValue : describeTrunkInterfaceAssociationsRequestAssociationIdsList) {
                if (describeTrunkInterfaceAssociationsRequestAssociationIdsListValue != null) {
                    request.addParameter("AssociationId." + associationIdsListIndex,
                            StringUtils.fromString(describeTrunkInterfaceAssociationsRequestAssociationIdsListValue));
                }
                associationIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeTrunkInterfaceAssociationsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeTrunkInterfaceAssociationsRequest
                .getFilters();
        if (!describeTrunkInterfaceAssociationsRequestFiltersList.isEmpty() || !describeTrunkInterfaceAssociationsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeTrunkInterfaceAssociationsRequestFiltersListValue : describeTrunkInterfaceAssociationsRequestFiltersList) {

                if (describeTrunkInterfaceAssociationsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeTrunkInterfaceAssociationsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeTrunkInterfaceAssociationsRequestFiltersListValue
                        .getValues();
                if (!filterValuesList.isEmpty() || !filterValuesList.isAutoConstruct()) {
                    int valuesListIndex = 1;

                    for (String filterValuesListValue : filterValuesList) {
                        if (filterValuesListValue != null) {
                            request.addParameter("Filter." + filtersListIndex + ".Value." + valuesListIndex, StringUtils.fromString(filterValuesListValue));
                        }
                        valuesListIndex++;
                    }
                }
                filtersListIndex++;
            }
        }

        if (describeTrunkInterfaceAssociationsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeTrunkInterfaceAssociationsRequest.getNextToken()));
        }

        if (describeTrunkInterfaceAssociationsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeTrunkInterfaceAssociationsRequest.getMaxResults()));
        }

        return request;
    }

}
