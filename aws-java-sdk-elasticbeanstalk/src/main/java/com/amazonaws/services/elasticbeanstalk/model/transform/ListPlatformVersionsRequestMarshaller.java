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
package com.amazonaws.services.elasticbeanstalk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ListPlatformVersionsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPlatformVersionsRequestMarshaller implements Marshaller<Request<ListPlatformVersionsRequest>, ListPlatformVersionsRequest> {

    public Request<ListPlatformVersionsRequest> marshall(ListPlatformVersionsRequest listPlatformVersionsRequest) {

        if (listPlatformVersionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListPlatformVersionsRequest> request = new DefaultRequest<ListPlatformVersionsRequest>(listPlatformVersionsRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "ListPlatformVersions");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (!listPlatformVersionsRequest.getFilters().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<PlatformFilter>) listPlatformVersionsRequest.getFilters()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<PlatformFilter> filtersList = (com.amazonaws.internal.SdkInternalList<PlatformFilter>) listPlatformVersionsRequest
                    .getFilters();
            int filtersListIndex = 1;

            for (PlatformFilter filtersListValue : filtersList) {

                if (filtersListValue.getType() != null) {
                    request.addParameter("Filters.member." + filtersListIndex + ".Type", StringUtils.fromString(filtersListValue.getType()));
                }

                if (filtersListValue.getOperator() != null) {
                    request.addParameter("Filters.member." + filtersListIndex + ".Operator", StringUtils.fromString(filtersListValue.getOperator()));
                }

                if (!filtersListValue.getValues().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<String>) filtersListValue.getValues()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<String> valuesList = (com.amazonaws.internal.SdkInternalList<String>) filtersListValue.getValues();
                    int valuesListIndex = 1;

                    for (String valuesListValue : valuesList) {
                        if (valuesListValue != null) {
                            request.addParameter("Filters.member." + filtersListIndex + ".Values.member." + valuesListIndex,
                                    StringUtils.fromString(valuesListValue));
                        }
                        valuesListIndex++;
                    }
                }
                filtersListIndex++;
            }
        }

        if (listPlatformVersionsRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(listPlatformVersionsRequest.getMaxRecords()));
        }

        if (listPlatformVersionsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(listPlatformVersionsRequest.getNextToken()));
        }

        return request;
    }

}
