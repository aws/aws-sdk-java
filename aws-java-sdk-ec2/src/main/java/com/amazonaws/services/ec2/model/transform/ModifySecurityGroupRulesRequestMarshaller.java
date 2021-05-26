/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ModifySecurityGroupRulesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifySecurityGroupRulesRequestMarshaller implements Marshaller<Request<ModifySecurityGroupRulesRequest>, ModifySecurityGroupRulesRequest> {

    public Request<ModifySecurityGroupRulesRequest> marshall(ModifySecurityGroupRulesRequest modifySecurityGroupRulesRequest) {

        if (modifySecurityGroupRulesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifySecurityGroupRulesRequest> request = new DefaultRequest<ModifySecurityGroupRulesRequest>(modifySecurityGroupRulesRequest, "AmazonEC2");
        request.addParameter("Action", "ModifySecurityGroupRules");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifySecurityGroupRulesRequest.getGroupId() != null) {
            request.addParameter("GroupId", StringUtils.fromString(modifySecurityGroupRulesRequest.getGroupId()));
        }

        com.amazonaws.internal.SdkInternalList<SecurityGroupRuleUpdate> modifySecurityGroupRulesRequestSecurityGroupRulesList = (com.amazonaws.internal.SdkInternalList<SecurityGroupRuleUpdate>) modifySecurityGroupRulesRequest
                .getSecurityGroupRules();
        if (!modifySecurityGroupRulesRequestSecurityGroupRulesList.isEmpty() || !modifySecurityGroupRulesRequestSecurityGroupRulesList.isAutoConstruct()) {
            int securityGroupRulesListIndex = 1;

            for (SecurityGroupRuleUpdate modifySecurityGroupRulesRequestSecurityGroupRulesListValue : modifySecurityGroupRulesRequestSecurityGroupRulesList) {

                if (modifySecurityGroupRulesRequestSecurityGroupRulesListValue.getSecurityGroupRuleId() != null) {
                    request.addParameter("SecurityGroupRule." + securityGroupRulesListIndex + ".SecurityGroupRuleId",
                            StringUtils.fromString(modifySecurityGroupRulesRequestSecurityGroupRulesListValue.getSecurityGroupRuleId()));
                }

                SecurityGroupRuleRequest securityGroupRule = modifySecurityGroupRulesRequestSecurityGroupRulesListValue.getSecurityGroupRule();
                if (securityGroupRule != null) {

                    if (securityGroupRule.getIpProtocol() != null) {
                        request.addParameter("SecurityGroupRule." + securityGroupRulesListIndex + ".SecurityGroupRule.IpProtocol",
                                StringUtils.fromString(securityGroupRule.getIpProtocol()));
                    }

                    if (securityGroupRule.getFromPort() != null) {
                        request.addParameter("SecurityGroupRule." + securityGroupRulesListIndex + ".SecurityGroupRule.FromPort",
                                StringUtils.fromInteger(securityGroupRule.getFromPort()));
                    }

                    if (securityGroupRule.getToPort() != null) {
                        request.addParameter("SecurityGroupRule." + securityGroupRulesListIndex + ".SecurityGroupRule.ToPort",
                                StringUtils.fromInteger(securityGroupRule.getToPort()));
                    }

                    if (securityGroupRule.getCidrIpv4() != null) {
                        request.addParameter("SecurityGroupRule." + securityGroupRulesListIndex + ".SecurityGroupRule.CidrIpv4",
                                StringUtils.fromString(securityGroupRule.getCidrIpv4()));
                    }

                    if (securityGroupRule.getCidrIpv6() != null) {
                        request.addParameter("SecurityGroupRule." + securityGroupRulesListIndex + ".SecurityGroupRule.CidrIpv6",
                                StringUtils.fromString(securityGroupRule.getCidrIpv6()));
                    }

                    if (securityGroupRule.getPrefixListId() != null) {
                        request.addParameter("SecurityGroupRule." + securityGroupRulesListIndex + ".SecurityGroupRule.PrefixListId",
                                StringUtils.fromString(securityGroupRule.getPrefixListId()));
                    }

                    if (securityGroupRule.getReferencedGroupId() != null) {
                        request.addParameter("SecurityGroupRule." + securityGroupRulesListIndex + ".SecurityGroupRule.ReferencedGroupId",
                                StringUtils.fromString(securityGroupRule.getReferencedGroupId()));
                    }

                    if (securityGroupRule.getDescription() != null) {
                        request.addParameter("SecurityGroupRule." + securityGroupRulesListIndex + ".SecurityGroupRule.Description",
                                StringUtils.fromString(securityGroupRule.getDescription()));
                    }
                }
                securityGroupRulesListIndex++;
            }
        }

        return request;
    }

}
