/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Describe Job Flows Request Marshaller
 */
public class DescribeJobFlowsRequestMarshaller implements Marshaller<Request<DescribeJobFlowsRequest>, DescribeJobFlowsRequest> {

    public Request<DescribeJobFlowsRequest> marshall(DescribeJobFlowsRequest describeJobFlowsRequest) {
        Request<DescribeJobFlowsRequest> request = new DefaultRequest<DescribeJobFlowsRequest>(describeJobFlowsRequest, "AmazonElasticMapReduce");
        request.addParameter("Action", "DescribeJobFlows");
        request.addParameter("Version", "2009-03-31");
        if (describeJobFlowsRequest != null) {
            if (describeJobFlowsRequest.getCreatedAfter() != null) {
                request.addParameter("CreatedAfter", StringUtils.fromDate(describeJobFlowsRequest.getCreatedAfter()));
            }
        }
        if (describeJobFlowsRequest != null) {
            if (describeJobFlowsRequest.getCreatedBefore() != null) {
                request.addParameter("CreatedBefore", StringUtils.fromDate(describeJobFlowsRequest.getCreatedBefore()));
            }
        }
        if (describeJobFlowsRequest != null) {
            java.util.List<String> jobFlowIdsList = describeJobFlowsRequest.getJobFlowIds();
            int jobFlowIdsListIndex = 1;
            for (String jobFlowIdsListValue : jobFlowIdsList) {
                if (jobFlowIdsListValue != null) {
                    request.addParameter("JobFlowIds.member." + jobFlowIdsListIndex, StringUtils.fromString(jobFlowIdsListValue));
                }
                jobFlowIdsListIndex++;
            }
        }
        if (describeJobFlowsRequest != null) {
            java.util.List<String> jobFlowStatesList = describeJobFlowsRequest.getJobFlowStates();
            int jobFlowStatesListIndex = 1;
            for (String jobFlowStatesListValue : jobFlowStatesList) {
                if (jobFlowStatesListValue != null) {
                    request.addParameter("JobFlowStates.member." + jobFlowStatesListIndex, StringUtils.fromString(jobFlowStatesListValue));
                }
                jobFlowStatesListIndex++;
            }
        }


        return request;
    }
}
