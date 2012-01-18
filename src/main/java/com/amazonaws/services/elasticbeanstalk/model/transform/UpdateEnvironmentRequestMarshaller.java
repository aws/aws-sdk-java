/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Update Environment Request Marshaller
 */
public class UpdateEnvironmentRequestMarshaller implements Marshaller<Request<UpdateEnvironmentRequest>, UpdateEnvironmentRequest> {

    public Request<UpdateEnvironmentRequest> marshall(UpdateEnvironmentRequest updateEnvironmentRequest) {

        if (updateEnvironmentRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<UpdateEnvironmentRequest> request = new DefaultRequest<UpdateEnvironmentRequest>(updateEnvironmentRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "UpdateEnvironment");
        request.addParameter("Version", "2010-12-01");

        if (updateEnvironmentRequest.getEnvironmentId() != null) {
            request.addParameter("EnvironmentId", StringUtils.fromString(updateEnvironmentRequest.getEnvironmentId()));
        }
        if (updateEnvironmentRequest.getEnvironmentName() != null) {
            request.addParameter("EnvironmentName", StringUtils.fromString(updateEnvironmentRequest.getEnvironmentName()));
        }
        if (updateEnvironmentRequest.getVersionLabel() != null) {
            request.addParameter("VersionLabel", StringUtils.fromString(updateEnvironmentRequest.getVersionLabel()));
        }
        if (updateEnvironmentRequest.getTemplateName() != null) {
            request.addParameter("TemplateName", StringUtils.fromString(updateEnvironmentRequest.getTemplateName()));
        }
        if (updateEnvironmentRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(updateEnvironmentRequest.getDescription()));
        }

        java.util.List<ConfigurationOptionSetting> optionSettingsList = updateEnvironmentRequest.getOptionSettings();
        int optionSettingsListIndex = 1;

        for (ConfigurationOptionSetting optionSettingsListValue : optionSettingsList) {
            ConfigurationOptionSetting configurationOptionSettingMember = optionSettingsListValue;
            if (configurationOptionSettingMember != null) {
                if (configurationOptionSettingMember.getNamespace() != null) {
                    request.addParameter("OptionSettings.member." + optionSettingsListIndex + ".Namespace", StringUtils.fromString(configurationOptionSettingMember.getNamespace()));
                }
                if (configurationOptionSettingMember.getOptionName() != null) {
                    request.addParameter("OptionSettings.member." + optionSettingsListIndex + ".OptionName", StringUtils.fromString(configurationOptionSettingMember.getOptionName()));
                }
                if (configurationOptionSettingMember.getValue() != null) {
                    request.addParameter("OptionSettings.member." + optionSettingsListIndex + ".Value", StringUtils.fromString(configurationOptionSettingMember.getValue()));
                }
            }

            optionSettingsListIndex++;
        }

        java.util.List<OptionSpecification> optionsToRemoveList = updateEnvironmentRequest.getOptionsToRemove();
        int optionsToRemoveListIndex = 1;

        for (OptionSpecification optionsToRemoveListValue : optionsToRemoveList) {
            OptionSpecification optionSpecificationMember = optionsToRemoveListValue;
            if (optionSpecificationMember != null) {
                if (optionSpecificationMember.getNamespace() != null) {
                    request.addParameter("OptionsToRemove.member." + optionsToRemoveListIndex + ".Namespace", StringUtils.fromString(optionSpecificationMember.getNamespace()));
                }
                if (optionSpecificationMember.getOptionName() != null) {
                    request.addParameter("OptionsToRemove.member." + optionsToRemoveListIndex + ".OptionName", StringUtils.fromString(optionSpecificationMember.getOptionName()));
                }
            }

            optionsToRemoveListIndex++;
        }


        return request;
    }
}
