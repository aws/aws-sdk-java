/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticbeanstalk.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Describe Application Versions Request Marshaller
 */
public class DescribeApplicationVersionsRequestMarshaller implements Marshaller<Request<DescribeApplicationVersionsRequest>, DescribeApplicationVersionsRequest> {

    public Request<DescribeApplicationVersionsRequest> marshall(DescribeApplicationVersionsRequest describeApplicationVersionsRequest) {
        Request<DescribeApplicationVersionsRequest> request = new DefaultRequest<DescribeApplicationVersionsRequest>(describeApplicationVersionsRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "DescribeApplicationVersions");
        request.addParameter("Version", "2010-12-01");
        if (describeApplicationVersionsRequest != null) {
            if (describeApplicationVersionsRequest.getApplicationName() != null) {
                request.addParameter("ApplicationName", StringUtils.fromString(describeApplicationVersionsRequest.getApplicationName()));
            }
        }
        if (describeApplicationVersionsRequest != null) {
            java.util.List<String> versionLabelsList = describeApplicationVersionsRequest.getVersionLabels();
            int versionLabelsListIndex = 1;

            for (String versionLabelsListValue : versionLabelsList) {
                if (versionLabelsListValue != null) {
                    request.addParameter("VersionLabels.member." + versionLabelsListIndex, StringUtils.fromString(versionLabelsListValue));
                }
                versionLabelsListIndex++;
            }
        }


        return request;
    }
}
