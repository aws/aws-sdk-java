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
package com.amazonaws.services.rds.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ModifyOptionGroupRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyOptionGroupRequestMarshaller implements Marshaller<Request<ModifyOptionGroupRequest>, ModifyOptionGroupRequest> {

    public Request<ModifyOptionGroupRequest> marshall(ModifyOptionGroupRequest modifyOptionGroupRequest) {

        if (modifyOptionGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyOptionGroupRequest> request = new DefaultRequest<ModifyOptionGroupRequest>(modifyOptionGroupRequest, "AmazonRDS");
        request.addParameter("Action", "ModifyOptionGroup");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyOptionGroupRequest.getOptionGroupName() != null) {
            request.addParameter("OptionGroupName", StringUtils.fromString(modifyOptionGroupRequest.getOptionGroupName()));
        }

        if (!modifyOptionGroupRequest.getOptionsToInclude().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<OptionConfiguration>) modifyOptionGroupRequest.getOptionsToInclude()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<OptionConfiguration> optionsToIncludeList = (com.amazonaws.internal.SdkInternalList<OptionConfiguration>) modifyOptionGroupRequest
                    .getOptionsToInclude();
            int optionsToIncludeListIndex = 1;

            for (OptionConfiguration optionsToIncludeListValue : optionsToIncludeList) {

                if (optionsToIncludeListValue.getOptionName() != null) {
                    request.addParameter("OptionsToInclude.OptionConfiguration." + optionsToIncludeListIndex + ".OptionName",
                            StringUtils.fromString(optionsToIncludeListValue.getOptionName()));
                }

                if (optionsToIncludeListValue.getPort() != null) {
                    request.addParameter("OptionsToInclude.OptionConfiguration." + optionsToIncludeListIndex + ".Port",
                            StringUtils.fromInteger(optionsToIncludeListValue.getPort()));
                }

                if (optionsToIncludeListValue.getOptionVersion() != null) {
                    request.addParameter("OptionsToInclude.OptionConfiguration." + optionsToIncludeListIndex + ".OptionVersion",
                            StringUtils.fromString(optionsToIncludeListValue.getOptionVersion()));
                }

                if (!optionsToIncludeListValue.getDBSecurityGroupMemberships().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<String>) optionsToIncludeListValue.getDBSecurityGroupMemberships()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<String> dBSecurityGroupMembershipsList = (com.amazonaws.internal.SdkInternalList<String>) optionsToIncludeListValue
                            .getDBSecurityGroupMemberships();
                    int dBSecurityGroupMembershipsListIndex = 1;

                    for (String dBSecurityGroupMembershipsListValue : dBSecurityGroupMembershipsList) {
                        if (dBSecurityGroupMembershipsListValue != null) {
                            request.addParameter("OptionsToInclude.OptionConfiguration." + optionsToIncludeListIndex
                                    + ".DBSecurityGroupMemberships.DBSecurityGroupName." + dBSecurityGroupMembershipsListIndex,
                                    StringUtils.fromString(dBSecurityGroupMembershipsListValue));
                        }
                        dBSecurityGroupMembershipsListIndex++;
                    }
                }

                if (!optionsToIncludeListValue.getVpcSecurityGroupMemberships().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<String>) optionsToIncludeListValue.getVpcSecurityGroupMemberships()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupMembershipsList = (com.amazonaws.internal.SdkInternalList<String>) optionsToIncludeListValue
                            .getVpcSecurityGroupMemberships();
                    int vpcSecurityGroupMembershipsListIndex = 1;

                    for (String vpcSecurityGroupMembershipsListValue : vpcSecurityGroupMembershipsList) {
                        if (vpcSecurityGroupMembershipsListValue != null) {
                            request.addParameter("OptionsToInclude.OptionConfiguration." + optionsToIncludeListIndex
                                    + ".VpcSecurityGroupMemberships.VpcSecurityGroupId." + vpcSecurityGroupMembershipsListIndex,
                                    StringUtils.fromString(vpcSecurityGroupMembershipsListValue));
                        }
                        vpcSecurityGroupMembershipsListIndex++;
                    }
                }

                if (!optionsToIncludeListValue.getOptionSettings().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<OptionSetting>) optionsToIncludeListValue.getOptionSettings()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<OptionSetting> optionSettingsList = (com.amazonaws.internal.SdkInternalList<OptionSetting>) optionsToIncludeListValue
                            .getOptionSettings();
                    int optionSettingsListIndex = 1;

                    for (OptionSetting optionSettingsListValue : optionSettingsList) {

                        if (optionSettingsListValue.getName() != null) {
                            request.addParameter("OptionsToInclude.OptionConfiguration." + optionsToIncludeListIndex + ".OptionSettings.OptionSetting."
                                    + optionSettingsListIndex + ".Name", StringUtils.fromString(optionSettingsListValue.getName()));
                        }

                        if (optionSettingsListValue.getValue() != null) {
                            request.addParameter("OptionsToInclude.OptionConfiguration." + optionsToIncludeListIndex + ".OptionSettings.OptionSetting."
                                    + optionSettingsListIndex + ".Value", StringUtils.fromString(optionSettingsListValue.getValue()));
                        }

                        if (optionSettingsListValue.getDefaultValue() != null) {
                            request.addParameter("OptionsToInclude.OptionConfiguration." + optionsToIncludeListIndex + ".OptionSettings.OptionSetting."
                                    + optionSettingsListIndex + ".DefaultValue", StringUtils.fromString(optionSettingsListValue.getDefaultValue()));
                        }

                        if (optionSettingsListValue.getDescription() != null) {
                            request.addParameter("OptionsToInclude.OptionConfiguration." + optionsToIncludeListIndex + ".OptionSettings.OptionSetting."
                                    + optionSettingsListIndex + ".Description", StringUtils.fromString(optionSettingsListValue.getDescription()));
                        }

                        if (optionSettingsListValue.getApplyType() != null) {
                            request.addParameter("OptionsToInclude.OptionConfiguration." + optionsToIncludeListIndex + ".OptionSettings.OptionSetting."
                                    + optionSettingsListIndex + ".ApplyType", StringUtils.fromString(optionSettingsListValue.getApplyType()));
                        }

                        if (optionSettingsListValue.getDataType() != null) {
                            request.addParameter("OptionsToInclude.OptionConfiguration." + optionsToIncludeListIndex + ".OptionSettings.OptionSetting."
                                    + optionSettingsListIndex + ".DataType", StringUtils.fromString(optionSettingsListValue.getDataType()));
                        }

                        if (optionSettingsListValue.getAllowedValues() != null) {
                            request.addParameter("OptionsToInclude.OptionConfiguration." + optionsToIncludeListIndex + ".OptionSettings.OptionSetting."
                                    + optionSettingsListIndex + ".AllowedValues", StringUtils.fromString(optionSettingsListValue.getAllowedValues()));
                        }

                        if (optionSettingsListValue.getIsModifiable() != null) {
                            request.addParameter("OptionsToInclude.OptionConfiguration." + optionsToIncludeListIndex + ".OptionSettings.OptionSetting."
                                    + optionSettingsListIndex + ".IsModifiable", StringUtils.fromBoolean(optionSettingsListValue.getIsModifiable()));
                        }

                        if (optionSettingsListValue.getIsCollection() != null) {
                            request.addParameter("OptionsToInclude.OptionConfiguration." + optionsToIncludeListIndex + ".OptionSettings.OptionSetting."
                                    + optionSettingsListIndex + ".IsCollection", StringUtils.fromBoolean(optionSettingsListValue.getIsCollection()));
                        }
                        optionSettingsListIndex++;
                    }
                }
                optionsToIncludeListIndex++;
            }
        }

        if (!modifyOptionGroupRequest.getOptionsToRemove().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) modifyOptionGroupRequest.getOptionsToRemove()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> optionsToRemoveList = (com.amazonaws.internal.SdkInternalList<String>) modifyOptionGroupRequest
                    .getOptionsToRemove();
            int optionsToRemoveListIndex = 1;

            for (String optionsToRemoveListValue : optionsToRemoveList) {
                if (optionsToRemoveListValue != null) {
                    request.addParameter("OptionsToRemove.member." + optionsToRemoveListIndex, StringUtils.fromString(optionsToRemoveListValue));
                }
                optionsToRemoveListIndex++;
            }
        }

        if (modifyOptionGroupRequest.getApplyImmediately() != null) {
            request.addParameter("ApplyImmediately", StringUtils.fromBoolean(modifyOptionGroupRequest.getApplyImmediately()));
        }

        return request;
    }

}
