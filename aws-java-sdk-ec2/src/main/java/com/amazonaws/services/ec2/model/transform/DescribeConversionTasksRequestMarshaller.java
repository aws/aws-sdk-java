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
 * DescribeConversionTasksRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConversionTasksRequestMarshaller implements Marshaller<Request<DescribeConversionTasksRequest>, DescribeConversionTasksRequest> {

    public Request<DescribeConversionTasksRequest> marshall(DescribeConversionTasksRequest describeConversionTasksRequest) {

        if (describeConversionTasksRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeConversionTasksRequest> request = new DefaultRequest<DescribeConversionTasksRequest>(describeConversionTasksRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeConversionTasks");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeConversionTasksRequestConversionTaskIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeConversionTasksRequest
                .getConversionTaskIds();
        if (!describeConversionTasksRequestConversionTaskIdsList.isEmpty() || !describeConversionTasksRequestConversionTaskIdsList.isAutoConstruct()) {
            int conversionTaskIdsListIndex = 1;

            for (String describeConversionTasksRequestConversionTaskIdsListValue : describeConversionTasksRequestConversionTaskIdsList) {
                if (describeConversionTasksRequestConversionTaskIdsListValue != null) {
                    request.addParameter("ConversionTaskId." + conversionTaskIdsListIndex,
                            StringUtils.fromString(describeConversionTasksRequestConversionTaskIdsListValue));
                }
                conversionTaskIdsListIndex++;
            }
        }

        return request;
    }

}
