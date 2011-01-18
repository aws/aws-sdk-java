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
 * Create Environment Request Marshaller
 */
public class CreateEnvironmentRequestMarshaller implements Marshaller<Request<CreateEnvironmentRequest>, CreateEnvironmentRequest> {

    public Request<CreateEnvironmentRequest> marshall(CreateEnvironmentRequest createEnvironmentRequest) {
        Request<CreateEnvironmentRequest> request = new DefaultRequest<CreateEnvironmentRequest>(createEnvironmentRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "CreateEnvironment");
        request.addParameter("Version", "2010-12-01");
        if (createEnvironmentRequest != null) {
            if (createEnvironmentRequest.getApplicationName() != null) {
                request.addParameter("ApplicationName", StringUtils.fromString(createEnvironmentRequest.getApplicationName()));
            }
        }
        if (createEnvironmentRequest != null) {
            if (createEnvironmentRequest.getVersionLabel() != null) {
                request.addParameter("VersionLabel", StringUtils.fromString(createEnvironmentRequest.getVersionLabel()));
            }
        }
        if (createEnvironmentRequest != null) {
            if (createEnvironmentRequest.getEnvironmentName() != null) {
                request.addParameter("EnvironmentName", StringUtils.fromString(createEnvironmentRequest.getEnvironmentName()));
            }
        }
        if (createEnvironmentRequest != null) {
            if (createEnvironmentRequest.getTemplateName() != null) {
                request.addParameter("TemplateName", StringUtils.fromString(createEnvironmentRequest.getTemplateName()));
            }
        }
        if (createEnvironmentRequest != null) {
            if (createEnvironmentRequest.getSolutionStackName() != null) {
                request.addParameter("SolutionStackName", StringUtils.fromString(createEnvironmentRequest.getSolutionStackName()));
            }
        }
        if (createEnvironmentRequest != null) {
            if (createEnvironmentRequest.getCNAMEPrefix() != null) {
                request.addParameter("CNAMEPrefix", StringUtils.fromString(createEnvironmentRequest.getCNAMEPrefix()));
            }
        }
        if (createEnvironmentRequest != null) {
            if (createEnvironmentRequest.getDescription() != null) {
                request.addParameter("Description", StringUtils.fromString(createEnvironmentRequest.getDescription()));
            }
        }

        if (createEnvironmentRequest != null) {
            java.util.List<ConfigurationOptionSetting> optionSettingsList = createEnvironmentRequest.getOptionSettings();
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

        if (createEnvironmentRequest != null) {
            java.util.List<OptionSpecification> optionsToRemoveList = createEnvironmentRequest.getOptionsToRemove();
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
