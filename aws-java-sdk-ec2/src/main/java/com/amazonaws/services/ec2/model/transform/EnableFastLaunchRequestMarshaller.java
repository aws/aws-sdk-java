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
 * EnableFastLaunchRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableFastLaunchRequestMarshaller implements Marshaller<Request<EnableFastLaunchRequest>, EnableFastLaunchRequest> {

    public Request<EnableFastLaunchRequest> marshall(EnableFastLaunchRequest enableFastLaunchRequest) {

        if (enableFastLaunchRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<EnableFastLaunchRequest> request = new DefaultRequest<EnableFastLaunchRequest>(enableFastLaunchRequest, "AmazonEC2");
        request.addParameter("Action", "EnableFastLaunch");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (enableFastLaunchRequest.getImageId() != null) {
            request.addParameter("ImageId", StringUtils.fromString(enableFastLaunchRequest.getImageId()));
        }

        if (enableFastLaunchRequest.getResourceType() != null) {
            request.addParameter("ResourceType", StringUtils.fromString(enableFastLaunchRequest.getResourceType()));
        }

        FastLaunchSnapshotConfigurationRequest snapshotConfiguration = enableFastLaunchRequest.getSnapshotConfiguration();
        if (snapshotConfiguration != null) {

            if (snapshotConfiguration.getTargetResourceCount() != null) {
                request.addParameter("SnapshotConfiguration.TargetResourceCount", StringUtils.fromInteger(snapshotConfiguration.getTargetResourceCount()));
            }
        }

        FastLaunchLaunchTemplateSpecificationRequest launchTemplate = enableFastLaunchRequest.getLaunchTemplate();
        if (launchTemplate != null) {

            if (launchTemplate.getLaunchTemplateId() != null) {
                request.addParameter("LaunchTemplate.LaunchTemplateId", StringUtils.fromString(launchTemplate.getLaunchTemplateId()));
            }

            if (launchTemplate.getLaunchTemplateName() != null) {
                request.addParameter("LaunchTemplate.LaunchTemplateName", StringUtils.fromString(launchTemplate.getLaunchTemplateName()));
            }

            if (launchTemplate.getVersion() != null) {
                request.addParameter("LaunchTemplate.Version", StringUtils.fromString(launchTemplate.getVersion()));
            }
        }

        if (enableFastLaunchRequest.getMaxParallelLaunches() != null) {
            request.addParameter("MaxParallelLaunches", StringUtils.fromInteger(enableFastLaunchRequest.getMaxParallelLaunches()));
        }

        return request;
    }

}
