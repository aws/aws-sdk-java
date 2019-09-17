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
package com.amazonaws.services.elasticbeanstalk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CreatePlatformVersionRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePlatformVersionRequestMarshaller implements Marshaller<Request<CreatePlatformVersionRequest>, CreatePlatformVersionRequest> {

    public Request<CreatePlatformVersionRequest> marshall(CreatePlatformVersionRequest createPlatformVersionRequest) {

        if (createPlatformVersionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreatePlatformVersionRequest> request = new DefaultRequest<CreatePlatformVersionRequest>(createPlatformVersionRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "CreatePlatformVersion");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (createPlatformVersionRequest.getPlatformName() != null) {
            request.addParameter("PlatformName", StringUtils.fromString(createPlatformVersionRequest.getPlatformName()));
        }

        if (createPlatformVersionRequest.getPlatformVersion() != null) {
            request.addParameter("PlatformVersion", StringUtils.fromString(createPlatformVersionRequest.getPlatformVersion()));
        }

        {
            S3Location platformDefinitionBundle = createPlatformVersionRequest.getPlatformDefinitionBundle();
            if (platformDefinitionBundle != null) {

                if (platformDefinitionBundle.getS3Bucket() != null) {
                    request.addParameter("PlatformDefinitionBundle.S3Bucket", StringUtils.fromString(platformDefinitionBundle.getS3Bucket()));
                }

                if (platformDefinitionBundle.getS3Key() != null) {
                    request.addParameter("PlatformDefinitionBundle.S3Key", StringUtils.fromString(platformDefinitionBundle.getS3Key()));
                }
            }
        }

        if (createPlatformVersionRequest.getEnvironmentName() != null) {
            request.addParameter("EnvironmentName", StringUtils.fromString(createPlatformVersionRequest.getEnvironmentName()));
        }

        if (!createPlatformVersionRequest.getOptionSettings().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<ConfigurationOptionSetting>) createPlatformVersionRequest.getOptionSettings()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<ConfigurationOptionSetting> optionSettingsList = (com.amazonaws.internal.SdkInternalList<ConfigurationOptionSetting>) createPlatformVersionRequest
                    .getOptionSettings();
            int optionSettingsListIndex = 1;

            for (ConfigurationOptionSetting optionSettingsListValue : optionSettingsList) {

                if (optionSettingsListValue.getResourceName() != null) {
                    request.addParameter("OptionSettings.member." + optionSettingsListIndex + ".ResourceName",
                            StringUtils.fromString(optionSettingsListValue.getResourceName()));
                }

                if (optionSettingsListValue.getNamespace() != null) {
                    request.addParameter("OptionSettings.member." + optionSettingsListIndex + ".Namespace",
                            StringUtils.fromString(optionSettingsListValue.getNamespace()));
                }

                if (optionSettingsListValue.getOptionName() != null) {
                    request.addParameter("OptionSettings.member." + optionSettingsListIndex + ".OptionName",
                            StringUtils.fromString(optionSettingsListValue.getOptionName()));
                }

                if (optionSettingsListValue.getValue() != null) {
                    request.addParameter("OptionSettings.member." + optionSettingsListIndex + ".Value",
                            StringUtils.fromString(optionSettingsListValue.getValue()));
                }
                optionSettingsListIndex++;
            }
        }

        if (!createPlatformVersionRequest.getTags().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Tag>) createPlatformVersionRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createPlatformVersionRequest.getTags();
            int tagsListIndex = 1;

            for (Tag tagsListValue : tagsList) {

                if (tagsListValue.getKey() != null) {
                    request.addParameter("Tags.member." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                }

                if (tagsListValue.getValue() != null) {
                    request.addParameter("Tags.member." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                }
                tagsListIndex++;
            }
        }

        return request;
    }

}
