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
package com.amazonaws.services.rds.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Modify Option Group Request Marshaller
 */
public class ModifyOptionGroupRequestMarshaller implements Marshaller<Request<ModifyOptionGroupRequest>, ModifyOptionGroupRequest> {

    public Request<ModifyOptionGroupRequest> marshall(ModifyOptionGroupRequest modifyOptionGroupRequest) {

        if (modifyOptionGroupRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<ModifyOptionGroupRequest> request = new DefaultRequest<ModifyOptionGroupRequest>(modifyOptionGroupRequest, "AmazonRDS");
        request.addParameter("Action", "ModifyOptionGroup");
        request.addParameter("Version", "2012-04-23");

        if (modifyOptionGroupRequest.getOptionGroupName() != null) {
            request.addParameter("OptionGroupName", StringUtils.fromString(modifyOptionGroupRequest.getOptionGroupName()));
        }

        java.util.List<OptionConfiguration> optionsToIncludeList = modifyOptionGroupRequest.getOptionsToInclude();
        int optionsToIncludeListIndex = 1;

        for (OptionConfiguration optionsToIncludeListValue : optionsToIncludeList) {
            OptionConfiguration optionConfigurationMember = optionsToIncludeListValue;
            if (optionConfigurationMember != null) {
                if (optionConfigurationMember.getOptionName() != null) {
                    request.addParameter("OptionsToInclude.OptionConfiguration." + optionsToIncludeListIndex + ".OptionName", StringUtils.fromString(optionConfigurationMember.getOptionName()));
                }
                if (optionConfigurationMember.getPort() != null) {
                    request.addParameter("OptionsToInclude.OptionConfiguration." + optionsToIncludeListIndex + ".Port", StringUtils.fromInteger(optionConfigurationMember.getPort()));
                }

                java.util.List<String> dBSecurityGroupMembershipsList = optionConfigurationMember.getDBSecurityGroupMemberships();
                int dBSecurityGroupMembershipsListIndex = 1;

                for (String dBSecurityGroupMembershipsListValue : dBSecurityGroupMembershipsList) {
                    if (dBSecurityGroupMembershipsListValue != null) {
                        request.addParameter("OptionsToInclude.OptionConfiguration." + optionsToIncludeListIndex + ".DBSecurityGroupMemberships.DBSecurityGroupName." + dBSecurityGroupMembershipsListIndex, StringUtils.fromString(dBSecurityGroupMembershipsListValue));
                    }

                    dBSecurityGroupMembershipsListIndex++;
                }
            }

            optionsToIncludeListIndex++;
        }

        java.util.List<String> optionsToRemoveList = modifyOptionGroupRequest.getOptionsToRemove();
        int optionsToRemoveListIndex = 1;

        for (String optionsToRemoveListValue : optionsToRemoveList) {
            if (optionsToRemoveListValue != null) {
                request.addParameter("OptionsToRemove.member." + optionsToRemoveListIndex, StringUtils.fromString(optionsToRemoveListValue));
            }

            optionsToRemoveListIndex++;
        }
        if (modifyOptionGroupRequest.isApplyImmediately() != null) {
            request.addParameter("ApplyImmediately", StringUtils.fromBoolean(modifyOptionGroupRequest.isApplyImmediately()));
        }


        return request;
    }
}
