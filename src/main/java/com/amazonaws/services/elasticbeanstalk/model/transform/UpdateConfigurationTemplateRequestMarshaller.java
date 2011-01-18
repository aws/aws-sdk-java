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
 * Update Configuration Template Request Marshaller
 */
public class UpdateConfigurationTemplateRequestMarshaller implements Marshaller<Request<UpdateConfigurationTemplateRequest>, UpdateConfigurationTemplateRequest> {

    public Request<UpdateConfigurationTemplateRequest> marshall(UpdateConfigurationTemplateRequest updateConfigurationTemplateRequest) {
        Request<UpdateConfigurationTemplateRequest> request = new DefaultRequest<UpdateConfigurationTemplateRequest>(updateConfigurationTemplateRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "UpdateConfigurationTemplate");
        request.addParameter("Version", "2010-12-01");
        if (updateConfigurationTemplateRequest != null) {
            if (updateConfigurationTemplateRequest.getApplicationName() != null) {
                request.addParameter("ApplicationName", StringUtils.fromString(updateConfigurationTemplateRequest.getApplicationName()));
            }
        }
        if (updateConfigurationTemplateRequest != null) {
            if (updateConfigurationTemplateRequest.getTemplateName() != null) {
                request.addParameter("TemplateName", StringUtils.fromString(updateConfigurationTemplateRequest.getTemplateName()));
            }
        }
        if (updateConfigurationTemplateRequest != null) {
            if (updateConfigurationTemplateRequest.getDescription() != null) {
                request.addParameter("Description", StringUtils.fromString(updateConfigurationTemplateRequest.getDescription()));
            }
        }

        if (updateConfigurationTemplateRequest != null) {
            java.util.List<ConfigurationOptionSetting> optionSettingsList = updateConfigurationTemplateRequest.getOptionSettings();
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

        if (updateConfigurationTemplateRequest != null) {
            java.util.List<OptionSpecification> optionsToRemoveList = updateConfigurationTemplateRequest.getOptionsToRemove();
            int optionsToRemoveListIndex = 1;
            for (OptionSpecification optionsToRemoveListValue : optionsToRemoveList) {
                if (optionsToRemoveListValue != null) {
                    if (optionsToRemoveListValue.getNamespace() != null) {
                        request.addParameter("OptionsToRemove.member." + optionsToRemoveListIndex + ".Namespace", StringUtils.fromString(optionsToRemoveListValue.getNamespace()));
                    }
                }
                if (optionsToRemoveListValue != null) {
                    if (optionsToRemoveListValue.getOptionName() != null) {
                        request.addParameter("OptionsToRemove.member." + optionsToRemoveListIndex + ".OptionName", StringUtils.fromString(optionsToRemoveListValue.getOptionName()));
                    }
                }

                optionsToRemoveListIndex++;
            }
        }


        return request;
    }
}
