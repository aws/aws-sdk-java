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
 * ValidateConfigurationSettingsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidateConfigurationSettingsRequestMarshaller implements
        Marshaller<Request<ValidateConfigurationSettingsRequest>, ValidateConfigurationSettingsRequest> {

    public Request<ValidateConfigurationSettingsRequest> marshall(ValidateConfigurationSettingsRequest validateConfigurationSettingsRequest) {

        if (validateConfigurationSettingsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ValidateConfigurationSettingsRequest> request = new DefaultRequest<ValidateConfigurationSettingsRequest>(validateConfigurationSettingsRequest,
                "AWSElasticBeanstalk");
        request.addParameter("Action", "ValidateConfigurationSettings");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (validateConfigurationSettingsRequest.getApplicationName() != null) {
            request.addParameter("ApplicationName", StringUtils.fromString(validateConfigurationSettingsRequest.getApplicationName()));
        }

        if (validateConfigurationSettingsRequest.getTemplateName() != null) {
            request.addParameter("TemplateName", StringUtils.fromString(validateConfigurationSettingsRequest.getTemplateName()));
        }

        if (validateConfigurationSettingsRequest.getEnvironmentName() != null) {
            request.addParameter("EnvironmentName", StringUtils.fromString(validateConfigurationSettingsRequest.getEnvironmentName()));
        }

        if (!validateConfigurationSettingsRequest.getOptionSettings().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<ConfigurationOptionSetting>) validateConfigurationSettingsRequest.getOptionSettings())
                        .isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<ConfigurationOptionSetting> optionSettingsList = (com.amazonaws.internal.SdkInternalList<ConfigurationOptionSetting>) validateConfigurationSettingsRequest
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

        return request;
    }

}
