/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * DescribeEnvironmentsRequest Marshaller
 */

public class DescribeEnvironmentsRequestMarshaller implements Marshaller<Request<DescribeEnvironmentsRequest>, DescribeEnvironmentsRequest> {

    public Request<DescribeEnvironmentsRequest> marshall(DescribeEnvironmentsRequest describeEnvironmentsRequest) {

        if (describeEnvironmentsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeEnvironmentsRequest> request = new DefaultRequest<DescribeEnvironmentsRequest>(describeEnvironmentsRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "DescribeEnvironments");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeEnvironmentsRequest.getApplicationName() != null) {
            request.addParameter("ApplicationName", StringUtils.fromString(describeEnvironmentsRequest.getApplicationName()));
        }

        if (describeEnvironmentsRequest.getVersionLabel() != null) {
            request.addParameter("VersionLabel", StringUtils.fromString(describeEnvironmentsRequest.getVersionLabel()));
        }

        com.amazonaws.internal.SdkInternalList<String> environmentIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeEnvironmentsRequest
                .getEnvironmentIds();
        if (!environmentIdsList.isEmpty() || !environmentIdsList.isAutoConstruct()) {
            int environmentIdsListIndex = 1;

            for (String environmentIdsListValue : environmentIdsList) {
                if (environmentIdsListValue != null) {
                    request.addParameter("EnvironmentIds.member." + environmentIdsListIndex, StringUtils.fromString(environmentIdsListValue));
                }
                environmentIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> environmentNamesList = (com.amazonaws.internal.SdkInternalList<String>) describeEnvironmentsRequest
                .getEnvironmentNames();
        if (!environmentNamesList.isEmpty() || !environmentNamesList.isAutoConstruct()) {
            int environmentNamesListIndex = 1;

            for (String environmentNamesListValue : environmentNamesList) {
                if (environmentNamesListValue != null) {
                    request.addParameter("EnvironmentNames.member." + environmentNamesListIndex, StringUtils.fromString(environmentNamesListValue));
                }
                environmentNamesListIndex++;
            }
        }

        if (describeEnvironmentsRequest.getIncludeDeleted() != null) {
            request.addParameter("IncludeDeleted", StringUtils.fromBoolean(describeEnvironmentsRequest.getIncludeDeleted()));
        }

        if (describeEnvironmentsRequest.getIncludedDeletedBackTo() != null) {
            request.addParameter("IncludedDeletedBackTo", StringUtils.fromDate(describeEnvironmentsRequest.getIncludedDeletedBackTo()));
        }

        return request;
    }

}
