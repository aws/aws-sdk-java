/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describe Prefix Lists Request Marshaller
 */
public class DescribePrefixListsRequestMarshaller implements Marshaller<Request<DescribePrefixListsRequest>, DescribePrefixListsRequest> {

    public Request<DescribePrefixListsRequest> marshall(DescribePrefixListsRequest describePrefixListsRequest) {

        if (describePrefixListsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribePrefixListsRequest> request = new DefaultRequest<DescribePrefixListsRequest>(describePrefixListsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribePrefixLists");
        request.addParameter("Version", "2015-04-15");

        java.util.List<String> prefixListIdsList = describePrefixListsRequest.getPrefixListIds();
        int prefixListIdsListIndex = 1;

        for (String prefixListIdsListValue : prefixListIdsList) {
            if (prefixListIdsListValue != null) {
                request.addParameter("PrefixListId." + prefixListIdsListIndex, StringUtils.fromString(prefixListIdsListValue));
            }

            prefixListIdsListIndex++;
        }

        java.util.List<Filter> filtersList = describePrefixListsRequest.getFilters();
        int filtersListIndex = 1;

        for (Filter filtersListValue : filtersList) {
            Filter filterMember = filtersListValue;
            if (filterMember != null) {
                if (filterMember.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(filterMember.getName()));
                }

                java.util.List<String> valuesList = filterMember.getValues();
                int valuesListIndex = 1;

                for (String valuesListValue : valuesList) {
                    if (valuesListValue != null) {
                        request.addParameter("Filter." + filtersListIndex + ".Value." + valuesListIndex, StringUtils.fromString(valuesListValue));
                    }

                    valuesListIndex++;
                }
            }

            filtersListIndex++;
        }
        if (describePrefixListsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describePrefixListsRequest.getMaxResults()));
        }
        if (describePrefixListsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describePrefixListsRequest.getNextToken()));
        }

        return request;
    }
}
