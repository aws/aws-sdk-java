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
 * Validate Configuration Settings Request Marshaller
 */
public class ValidateConfigurationSettingsRequestMarshaller implements Marshaller<Request<ValidateConfigurationSettingsRequest>, ValidateConfigurationSettingsRequest> {

    public Request<ValidateConfigurationSettingsRequest> marshall(ValidateConfigurationSettingsRequest validateConfigurationSettingsRequest) {
        Request<ValidateConfigurationSettingsRequest> request = new DefaultRequest<ValidateConfigurationSettingsRequest>(validateConfigurationSettingsRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "ValidateConfigurationSettings");
        request.addParameter("Version", "2010-12-01");
        if (validateConfigurationSettingsRequest != null) {
            if (validateConfigurationSettingsRequest.getApplicationName() != null) {
                request.addParameter("ApplicationName", StringUtils.fromString(validateConfigurationSettingsRequest.getApplicationName()));
            }
        }
        if (validateConfigurationSettingsRequest != null) {
            if (validateConfigurationSettingsRequest.getTemplateName() != null) {
                request.addParameter("TemplateName", StringUtils.fromString(validateConfigurationSettingsRequest.getTemplateName()));
            }
        }
        if (validateConfigurationSettingsRequest != null) {
            if (validateConfigurationSettingsRequest.getEnvironmentName() != null) {
                request.addParameter("EnvironmentName", StringUtils.fromString(validateConfigurationSettingsRequest.getEnvironmentName()));
            }
        }

        if (validateConfigurationSettingsRequest != null) {
            java.util.List<ConfigurationOptionSetting> optionSettingsList = validateConfigurationSettingsRequest.getOptionSettings();
            int optionSettingsListIndex = 1;
            for (ConfigurationOptionSetting optionSettingsListValue : optionSettingsList) {
                if (optionSettingsListValue != null) {
                    if (optionSettingsListValue.getNamespace() != null) {
                        request.addParameter("OptionSettings.member." + optionSettingsListIndex + ".Namespace", StringUtils.fromString(optionSettingsListValue.getNamespace()));
                    }
                }
                if (optionSettingsListValue != null) {
                    if (optionSettingsListValue.getOptionName() != null) {
                        request.addParameter("OptionSettings.member." + optionSettingsListIndex + ".OptionName", StringUtils.fromString(optionSettingsListValue.getOptionName()));
                    }
                }
                if (optionSettingsListValue != null) {
                    if (optionSettingsListValue.getValue() != null) {
                        request.addParameter("OptionSettings.member." + optionSettingsListIndex + ".Value", StringUtils.fromString(optionSettingsListValue.getValue()));
                    }
                }

                optionSettingsListIndex++;
            }
        }


        return request;
    }
}
