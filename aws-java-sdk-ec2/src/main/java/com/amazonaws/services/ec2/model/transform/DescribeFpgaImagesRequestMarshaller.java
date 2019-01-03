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
 * DescribeFpgaImagesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFpgaImagesRequestMarshaller implements Marshaller<Request<DescribeFpgaImagesRequest>, DescribeFpgaImagesRequest> {

    public Request<DescribeFpgaImagesRequest> marshall(DescribeFpgaImagesRequest describeFpgaImagesRequest) {

        if (describeFpgaImagesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeFpgaImagesRequest> request = new DefaultRequest<DescribeFpgaImagesRequest>(describeFpgaImagesRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeFpgaImages");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeFpgaImagesRequestFpgaImageIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeFpgaImagesRequest
                .getFpgaImageIds();
        if (!describeFpgaImagesRequestFpgaImageIdsList.isEmpty() || !describeFpgaImagesRequestFpgaImageIdsList.isAutoConstruct()) {
            int fpgaImageIdsListIndex = 1;

            for (String describeFpgaImagesRequestFpgaImageIdsListValue : describeFpgaImagesRequestFpgaImageIdsList) {
                if (describeFpgaImagesRequestFpgaImageIdsListValue != null) {
                    request.addParameter("FpgaImageId." + fpgaImageIdsListIndex, StringUtils.fromString(describeFpgaImagesRequestFpgaImageIdsListValue));
                }
                fpgaImageIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> describeFpgaImagesRequestOwnersList = (com.amazonaws.internal.SdkInternalList<String>) describeFpgaImagesRequest
                .getOwners();
        if (!describeFpgaImagesRequestOwnersList.isEmpty() || !describeFpgaImagesRequestOwnersList.isAutoConstruct()) {
            int ownersListIndex = 1;

            for (String describeFpgaImagesRequestOwnersListValue : describeFpgaImagesRequestOwnersList) {
                if (describeFpgaImagesRequestOwnersListValue != null) {
                    request.addParameter("Owner." + ownersListIndex, StringUtils.fromString(describeFpgaImagesRequestOwnersListValue));
                }
                ownersListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeFpgaImagesRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeFpgaImagesRequest
                .getFilters();
        if (!describeFpgaImagesRequestFiltersList.isEmpty() || !describeFpgaImagesRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeFpgaImagesRequestFiltersListValue : describeFpgaImagesRequestFiltersList) {

                if (describeFpgaImagesRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(describeFpgaImagesRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeFpgaImagesRequestFiltersListValue
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

        if (describeFpgaImagesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeFpgaImagesRequest.getNextToken()));
        }

        if (describeFpgaImagesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeFpgaImagesRequest.getMaxResults()));
        }

        return request;
    }

}
