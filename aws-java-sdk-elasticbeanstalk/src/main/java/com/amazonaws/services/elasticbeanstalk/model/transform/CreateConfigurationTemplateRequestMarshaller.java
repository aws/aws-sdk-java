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
 * CreateConfigurationTemplateRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConfigurationTemplateRequestMarshaller implements
        Marshaller<Request<CreateConfigurationTemplateRequest>, CreateConfigurationTemplateRequest> {

    public Request<CreateConfigurationTemplateRequest> marshall(CreateConfigurationTemplateRequest createConfigurationTemplateRequest) {

        if (createConfigurationTemplateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateConfigurationTemplateRequest> request = new DefaultRequest<CreateConfigurationTemplateRequest>(createConfigurationTemplateRequest,
                "AWSElasticBeanstalk");
        request.addParameter("Action", "CreateConfigurationTemplate");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (createConfigurationTemplateRequest.getApplicationName() != null) {
            request.addParameter("ApplicationName", StringUtils.fromString(createConfigurationTemplateRequest.getApplicationName()));
        }

        if (createConfigurationTemplateRequest.getTemplateName() != null) {
            request.addParameter("TemplateName", StringUtils.fromString(createConfigurationTemplateRequest.getTemplateName()));
        }

        if (createConfigurationTemplateRequest.getSolutionStackName() != null) {
            request.addParameter("SolutionStackName", StringUtils.fromString(createConfigurationTemplateRequest.getSolutionStackName()));
        }

        if (createConfigurationTemplateRequest.getPlatformArn() != null) {
            request.addParameter("PlatformArn", StringUtils.fromString(createConfigurationTemplateRequest.getPlatformArn()));
        }

        {
            SourceConfiguration sourceConfiguration = createConfigurationTemplateRequest.getSourceConfiguration();
            if (sourceConfiguration != null) {

                if (sourceConfiguration.getApplicationName() != null) {
                    request.addParameter("SourceConfiguration.ApplicationName", StringUtils.fromString(sourceConfiguration.getApplicationName()));
                }

                if (sourceConfiguration.getTemplateName() != null) {
                    request.addParameter("SourceConfiguration.TemplateName", StringUtils.fromString(sourceConfiguration.getTemplateName()));
                }
            }
        }

        if (createConfigurationTemplateRequest.getEnvironmentId() != null) {
            request.addParameter("EnvironmentId", StringUtils.fromString(createConfigurationTemplateRequest.getEnvironmentId()));
        }

        if (createConfigurationTemplateRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createConfigurationTemplateRequest.getDescription()));
        }

        if (!createConfigurationTemplateRequest.getOptionSettings().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<ConfigurationOptionSetting>) createConfigurationTemplateRequest.getOptionSettings())
                        .isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<ConfigurationOptionSetting> optionSettingsList = (com.amazonaws.internal.SdkInternalList<ConfigurationOptionSetting>) createConfigurationTemplateRequest
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

        if (!createConfigurationTemplateRequest.getTags().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Tag>) createConfigurationTemplateRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createConfigurationTemplateRequest.getTags();
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
