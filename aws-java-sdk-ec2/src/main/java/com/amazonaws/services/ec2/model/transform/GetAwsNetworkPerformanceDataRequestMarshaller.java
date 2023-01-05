/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * GetAwsNetworkPerformanceDataRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAwsNetworkPerformanceDataRequestMarshaller implements
        Marshaller<Request<GetAwsNetworkPerformanceDataRequest>, GetAwsNetworkPerformanceDataRequest> {

    public Request<GetAwsNetworkPerformanceDataRequest> marshall(GetAwsNetworkPerformanceDataRequest getAwsNetworkPerformanceDataRequest) {

        if (getAwsNetworkPerformanceDataRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetAwsNetworkPerformanceDataRequest> request = new DefaultRequest<GetAwsNetworkPerformanceDataRequest>(getAwsNetworkPerformanceDataRequest,
                "AmazonEC2");
        request.addParameter("Action", "GetAwsNetworkPerformanceData");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<DataQuery> getAwsNetworkPerformanceDataRequestDataQueriesList = (com.amazonaws.internal.SdkInternalList<DataQuery>) getAwsNetworkPerformanceDataRequest
                .getDataQueries();
        if (!getAwsNetworkPerformanceDataRequestDataQueriesList.isEmpty() || !getAwsNetworkPerformanceDataRequestDataQueriesList.isAutoConstruct()) {
            int dataQueriesListIndex = 1;

            for (DataQuery getAwsNetworkPerformanceDataRequestDataQueriesListValue : getAwsNetworkPerformanceDataRequestDataQueriesList) {

                if (getAwsNetworkPerformanceDataRequestDataQueriesListValue.getId() != null) {
                    request.addParameter("DataQuery." + dataQueriesListIndex + ".Id",
                            StringUtils.fromString(getAwsNetworkPerformanceDataRequestDataQueriesListValue.getId()));
                }

                if (getAwsNetworkPerformanceDataRequestDataQueriesListValue.getSource() != null) {
                    request.addParameter("DataQuery." + dataQueriesListIndex + ".Source",
                            StringUtils.fromString(getAwsNetworkPerformanceDataRequestDataQueriesListValue.getSource()));
                }

                if (getAwsNetworkPerformanceDataRequestDataQueriesListValue.getDestination() != null) {
                    request.addParameter("DataQuery." + dataQueriesListIndex + ".Destination",
                            StringUtils.fromString(getAwsNetworkPerformanceDataRequestDataQueriesListValue.getDestination()));
                }

                if (getAwsNetworkPerformanceDataRequestDataQueriesListValue.getMetric() != null) {
                    request.addParameter("DataQuery." + dataQueriesListIndex + ".Metric",
                            StringUtils.fromString(getAwsNetworkPerformanceDataRequestDataQueriesListValue.getMetric()));
                }

                if (getAwsNetworkPerformanceDataRequestDataQueriesListValue.getStatistic() != null) {
                    request.addParameter("DataQuery." + dataQueriesListIndex + ".Statistic",
                            StringUtils.fromString(getAwsNetworkPerformanceDataRequestDataQueriesListValue.getStatistic()));
                }

                if (getAwsNetworkPerformanceDataRequestDataQueriesListValue.getPeriod() != null) {
                    request.addParameter("DataQuery." + dataQueriesListIndex + ".Period",
                            StringUtils.fromString(getAwsNetworkPerformanceDataRequestDataQueriesListValue.getPeriod()));
                }
                dataQueriesListIndex++;
            }
        }

        if (getAwsNetworkPerformanceDataRequest.getStartTime() != null) {
            request.addParameter("StartTime", StringUtils.fromDate(getAwsNetworkPerformanceDataRequest.getStartTime()));
        }

        if (getAwsNetworkPerformanceDataRequest.getEndTime() != null) {
            request.addParameter("EndTime", StringUtils.fromDate(getAwsNetworkPerformanceDataRequest.getEndTime()));
        }

        if (getAwsNetworkPerformanceDataRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(getAwsNetworkPerformanceDataRequest.getMaxResults()));
        }

        if (getAwsNetworkPerformanceDataRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(getAwsNetworkPerformanceDataRequest.getNextToken()));
        }

        return request;
    }

}
