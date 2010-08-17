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
package com.amazonaws.services.autoscaling.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Describe Launch Configurations Request Marshaller
 */
public class DescribeLaunchConfigurationsRequestMarshaller implements Marshaller<Request<DescribeLaunchConfigurationsRequest>, DescribeLaunchConfigurationsRequest> {

    public Request<DescribeLaunchConfigurationsRequest> marshall(DescribeLaunchConfigurationsRequest describeLaunchConfigurationsRequest) {
        Request<DescribeLaunchConfigurationsRequest> request = new DefaultRequest<DescribeLaunchConfigurationsRequest>(describeLaunchConfigurationsRequest, "AmazonAutoScaling");
        request.addParameter("Action", "DescribeLaunchConfigurations");
        request.addParameter("Version", "2009-05-15");
        if (describeLaunchConfigurationsRequest != null) {
            java.util.List<String> launchConfigurationNamesList = describeLaunchConfigurationsRequest.getLaunchConfigurationNames();
            int launchConfigurationNamesListIndex = 1;
            for (String launchConfigurationNamesListValue : launchConfigurationNamesList) {
                if (launchConfigurationNamesListValue != null) {
                    request.addParameter("LaunchConfigurationNames.member." + launchConfigurationNamesListIndex, StringUtils.fromString(launchConfigurationNamesListValue));
                }
                launchConfigurationNamesListIndex++;
            }
        }
        if (describeLaunchConfigurationsRequest != null) {
            if (describeLaunchConfigurationsRequest.getNextToken() != null) {
                request.addParameter("NextToken", StringUtils.fromString(describeLaunchConfigurationsRequest.getNextToken()));
            }
        }
        if (describeLaunchConfigurationsRequest != null) {
            if (describeLaunchConfigurationsRequest.getMaxRecords() != null) {
                request.addParameter("MaxRecords", StringUtils.fromInteger(describeLaunchConfigurationsRequest.getMaxRecords()));
            }
        }


        return request;
    }
}
