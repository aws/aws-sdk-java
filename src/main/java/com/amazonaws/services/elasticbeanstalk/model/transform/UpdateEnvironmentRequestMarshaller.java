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
 * Update Environment Request Marshaller
 */
public class UpdateEnvironmentRequestMarshaller implements Marshaller<Request<UpdateEnvironmentRequest>, UpdateEnvironmentRequest> {

    public Request<UpdateEnvironmentRequest> marshall(UpdateEnvironmentRequest updateEnvironmentRequest) {
        Request<UpdateEnvironmentRequest> request = new DefaultRequest<UpdateEnvironmentRequest>(updateEnvironmentRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "UpdateEnvironment");
        request.addParameter("Version", "2010-12-01");
        if (updateEnvironmentRequest != null) {
            if (updateEnvironmentRequest.getEnvironmentId() != null) {
                request.addParameter("EnvironmentId", StringUtils.fromString(updateEnvironmentRequest.getEnvironmentId()));
            }
        }
        if (updateEnvironmentRequest != null) {
            if (updateEnvironmentRequest.getEnvironmentName() != null) {
                request.addParameter("EnvironmentName", StringUtils.fromString(updateEnvironmentRequest.getEnvironmentName()));
            }
        }
        if (updateEnvironmentRequest != null) {
            if (updateEnvironmentRequest.getVersionLabel() != null) {
                request.addParameter("VersionLabel", StringUtils.fromString(updateEnvironmentRequest.getVersionLabel()));
            }
        }
        if (updateEnvironmentRequest != null) {
            if (updateEnvironmentRequest.getTemplateName() != null) {
                request.addParameter("TemplateName", StringUtils.fromString(updateEnvironmentRequest.getTemplateName()));
            }
        }
        if (updateEnvironmentRequest != null) {
            if (updateEnvironmentRequest.getDescription() != null) {
                request.addParameter("Description", StringUtils.fromString(updateEnvironmentRequest.getDescription()));
            }
        }

        if (updateEnvironmentRequest != null) {
            java.util.List<ConfigurationOptionSetting> optionSettingsList = updateEnvironmentRequest.getOptionSettings();
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

        if (updateEnvironmentRequest != null) {
            java.util.List<OptionSpecification> optionsToRemoveList = updateEnvironmentRequest.getOptionsToRemove();
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
