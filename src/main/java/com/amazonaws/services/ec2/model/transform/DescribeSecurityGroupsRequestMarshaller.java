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
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Describe Security Groups Request Marshaller
 */
public class DescribeSecurityGroupsRequestMarshaller implements Marshaller<Request<DescribeSecurityGroupsRequest>, DescribeSecurityGroupsRequest> {

    public Request<DescribeSecurityGroupsRequest> marshall(DescribeSecurityGroupsRequest describeSecurityGroupsRequest) {
        Request<DescribeSecurityGroupsRequest> request = new DefaultRequest<DescribeSecurityGroupsRequest>(describeSecurityGroupsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeSecurityGroups");
        request.addParameter("Version", "2010-06-15");
        if (describeSecurityGroupsRequest != null) {
            java.util.List<String> groupNamesList = describeSecurityGroupsRequest.getGroupNames();
            int groupNamesListIndex = 1;
            for (String groupNamesListValue : groupNamesList) {
                if (groupNamesListValue != null) {
                    request.addParameter("GroupName." + groupNamesListIndex, StringUtils.fromString(groupNamesListValue));
                }
                groupNamesListIndex++;
            }
        }


        return request;
    }
}
