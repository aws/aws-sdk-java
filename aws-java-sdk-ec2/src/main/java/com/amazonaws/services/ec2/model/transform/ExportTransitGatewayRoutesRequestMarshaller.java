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
 * ExportTransitGatewayRoutesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportTransitGatewayRoutesRequestMarshaller implements Marshaller<Request<ExportTransitGatewayRoutesRequest>, ExportTransitGatewayRoutesRequest> {

    public Request<ExportTransitGatewayRoutesRequest> marshall(ExportTransitGatewayRoutesRequest exportTransitGatewayRoutesRequest) {

        if (exportTransitGatewayRoutesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ExportTransitGatewayRoutesRequest> request = new DefaultRequest<ExportTransitGatewayRoutesRequest>(exportTransitGatewayRoutesRequest,
                "AmazonEC2");
        request.addParameter("Action", "ExportTransitGatewayRoutes");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (exportTransitGatewayRoutesRequest.getTransitGatewayRouteTableId() != null) {
            request.addParameter("TransitGatewayRouteTableId", StringUtils.fromString(exportTransitGatewayRoutesRequest.getTransitGatewayRouteTableId()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> exportTransitGatewayRoutesRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) exportTransitGatewayRoutesRequest
                .getFilters();
        if (!exportTransitGatewayRoutesRequestFiltersList.isEmpty() || !exportTransitGatewayRoutesRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter exportTransitGatewayRoutesRequestFiltersListValue : exportTransitGatewayRoutesRequestFiltersList) {

                if (exportTransitGatewayRoutesRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(exportTransitGatewayRoutesRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) exportTransitGatewayRoutesRequestFiltersListValue
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

        if (exportTransitGatewayRoutesRequest.getS3Bucket() != null) {
            request.addParameter("S3Bucket", StringUtils.fromString(exportTransitGatewayRoutesRequest.getS3Bucket()));
        }

        return request;
    }

}
