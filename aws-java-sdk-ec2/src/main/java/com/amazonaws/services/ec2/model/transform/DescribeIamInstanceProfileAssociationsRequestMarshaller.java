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
 * DescribeIamInstanceProfileAssociationsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeIamInstanceProfileAssociationsRequestMarshaller implements
        Marshaller<Request<DescribeIamInstanceProfileAssociationsRequest>, DescribeIamInstanceProfileAssociationsRequest> {

    public Request<DescribeIamInstanceProfileAssociationsRequest> marshall(
            DescribeIamInstanceProfileAssociationsRequest describeIamInstanceProfileAssociationsRequest) {

        if (describeIamInstanceProfileAssociationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeIamInstanceProfileAssociationsRequest> request = new DefaultRequest<DescribeIamInstanceProfileAssociationsRequest>(
                describeIamInstanceProfileAssociationsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeIamInstanceProfileAssociations");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeIamInstanceProfileAssociationsRequestAssociationIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeIamInstanceProfileAssociationsRequest
                .getAssociationIds();
        if (!describeIamInstanceProfileAssociationsRequestAssociationIdsList.isEmpty()
                || !describeIamInstanceProfileAssociationsRequestAssociationIdsList.isAutoConstruct()) {
            int associationIdsListIndex = 1;

            for (String describeIamInstanceProfileAssociationsRequestAssociationIdsListValue : describeIamInstanceProfileAssociationsRequestAssociationIdsList) {
                if (describeIamInstanceProfileAssociationsRequestAssociationIdsListValue != null) {
                    request.addParameter("AssociationId." + associationIdsListIndex,
                            StringUtils.fromString(describeIamInstanceProfileAssociationsRequestAssociationIdsListValue));
                }
                associationIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeIamInstanceProfileAssociationsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeIamInstanceProfileAssociationsRequest
                .getFilters();
        if (!describeIamInstanceProfileAssociationsRequestFiltersList.isEmpty() || !describeIamInstanceProfileAssociationsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeIamInstanceProfileAssociationsRequestFiltersListValue : describeIamInstanceProfileAssociationsRequestFiltersList) {

                if (describeIamInstanceProfileAssociationsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeIamInstanceProfileAssociationsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeIamInstanceProfileAssociationsRequestFiltersListValue
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

        if (describeIamInstanceProfileAssociationsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeIamInstanceProfileAssociationsRequest.getMaxResults()));
        }

        if (describeIamInstanceProfileAssociationsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeIamInstanceProfileAssociationsRequest.getNextToken()));
        }

        return request;
    }

}
