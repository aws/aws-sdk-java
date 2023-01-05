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
import com.amazonaws.util.IdempotentUtils;

/**
 * ModifyVerifiedAccessInstanceLoggingConfigurationRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyVerifiedAccessInstanceLoggingConfigurationRequestMarshaller implements
        Marshaller<Request<ModifyVerifiedAccessInstanceLoggingConfigurationRequest>, ModifyVerifiedAccessInstanceLoggingConfigurationRequest> {

    public Request<ModifyVerifiedAccessInstanceLoggingConfigurationRequest> marshall(
            ModifyVerifiedAccessInstanceLoggingConfigurationRequest modifyVerifiedAccessInstanceLoggingConfigurationRequest) {

        if (modifyVerifiedAccessInstanceLoggingConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyVerifiedAccessInstanceLoggingConfigurationRequest> request = new DefaultRequest<ModifyVerifiedAccessInstanceLoggingConfigurationRequest>(
                modifyVerifiedAccessInstanceLoggingConfigurationRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyVerifiedAccessInstanceLoggingConfiguration");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyVerifiedAccessInstanceLoggingConfigurationRequest.getVerifiedAccessInstanceId() != null) {
            request.addParameter("VerifiedAccessInstanceId",
                    StringUtils.fromString(modifyVerifiedAccessInstanceLoggingConfigurationRequest.getVerifiedAccessInstanceId()));
        }

        VerifiedAccessLogOptions accessLogs = modifyVerifiedAccessInstanceLoggingConfigurationRequest.getAccessLogs();
        if (accessLogs != null) {

            VerifiedAccessLogS3DestinationOptions s3 = accessLogs.getS3();
            if (s3 != null) {

                if (s3.getEnabled() != null) {
                    request.addParameter("AccessLogs.S3.Enabled", StringUtils.fromBoolean(s3.getEnabled()));
                }

                if (s3.getBucketName() != null) {
                    request.addParameter("AccessLogs.S3.BucketName", StringUtils.fromString(s3.getBucketName()));
                }

                if (s3.getPrefix() != null) {
                    request.addParameter("AccessLogs.S3.Prefix", StringUtils.fromString(s3.getPrefix()));
                }

                if (s3.getBucketOwner() != null) {
                    request.addParameter("AccessLogs.S3.BucketOwner", StringUtils.fromString(s3.getBucketOwner()));
                }
            }

            VerifiedAccessLogCloudWatchLogsDestinationOptions cloudWatchLogs = accessLogs.getCloudWatchLogs();
            if (cloudWatchLogs != null) {

                if (cloudWatchLogs.getEnabled() != null) {
                    request.addParameter("AccessLogs.CloudWatchLogs.Enabled", StringUtils.fromBoolean(cloudWatchLogs.getEnabled()));
                }

                if (cloudWatchLogs.getLogGroup() != null) {
                    request.addParameter("AccessLogs.CloudWatchLogs.LogGroup", StringUtils.fromString(cloudWatchLogs.getLogGroup()));
                }
            }

            VerifiedAccessLogKinesisDataFirehoseDestinationOptions kinesisDataFirehose = accessLogs.getKinesisDataFirehose();
            if (kinesisDataFirehose != null) {

                if (kinesisDataFirehose.getEnabled() != null) {
                    request.addParameter("AccessLogs.KinesisDataFirehose.Enabled", StringUtils.fromBoolean(kinesisDataFirehose.getEnabled()));
                }

                if (kinesisDataFirehose.getDeliveryStream() != null) {
                    request.addParameter("AccessLogs.KinesisDataFirehose.DeliveryStream", StringUtils.fromString(kinesisDataFirehose.getDeliveryStream()));
                }
            }
        }

        request.addParameter("ClientToken", IdempotentUtils.resolveString(modifyVerifiedAccessInstanceLoggingConfigurationRequest.getClientToken()));

        return request;
    }

}
