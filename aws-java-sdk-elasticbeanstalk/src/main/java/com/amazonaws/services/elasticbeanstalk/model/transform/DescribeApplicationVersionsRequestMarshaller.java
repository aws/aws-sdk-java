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
 * DescribeApplicationVersionsRequest Marshaller
 */

public class DescribeApplicationVersionsRequestMarshaller implements
        Marshaller<Request<DescribeApplicationVersionsRequest>, DescribeApplicationVersionsRequest> {

    public Request<DescribeApplicationVersionsRequest> marshall(DescribeApplicationVersionsRequest describeApplicationVersionsRequest) {

        if (describeApplicationVersionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeApplicationVersionsRequest> request = new DefaultRequest<DescribeApplicationVersionsRequest>(describeApplicationVersionsRequest,
                "AWSElasticBeanstalk");
        request.addParameter("Action", "DescribeApplicationVersions");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeApplicationVersionsRequest.getApplicationName() != null) {
            request.addParameter("ApplicationName", StringUtils.fromString(describeApplicationVersionsRequest.getApplicationName()));
        }

        com.amazonaws.internal.SdkInternalList<String> versionLabelsList = (com.amazonaws.internal.SdkInternalList<String>) describeApplicationVersionsRequest
                .getVersionLabels();
        if (!versionLabelsList.isEmpty() || !versionLabelsList.isAutoConstruct()) {
            int versionLabelsListIndex = 1;

            for (String versionLabelsListValue : versionLabelsList) {
                if (versionLabelsListValue != null) {
                    request.addParameter("VersionLabels.member." + versionLabelsListIndex, StringUtils.fromString(versionLabelsListValue));
                }
                versionLabelsListIndex++;
            }
        }

        if (describeApplicationVersionsRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeApplicationVersionsRequest.getMaxRecords()));
        }

        if (describeApplicationVersionsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeApplicationVersionsRequest.getNextToken()));
        }

        return request;
    }

}
