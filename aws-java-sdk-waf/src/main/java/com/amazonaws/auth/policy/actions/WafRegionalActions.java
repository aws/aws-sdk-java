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
package com.amazonaws.auth.policy.actions;

import javax.annotation.Generated;

import com.amazonaws.auth.policy.Action;

/**
 * The available AWS access control policy actions for WAF Regional.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum WafRegionalActions implements Action {

    /** Represents any action executed on WAF Regional. */
    AllWafRegionalActions("waf-regional:*"),

    /** Action for the AssociateWebACL operation. */
    AssociateWebACL("waf-regional:AssociateWebACL"),
    /** Action for the CreateByteMatchSet operation. */
    CreateByteMatchSet("waf-regional:CreateByteMatchSet"),
    /** Action for the CreateGeoMatchSet operation. */
    CreateGeoMatchSet("waf-regional:CreateGeoMatchSet"),
    /** Action for the CreateIPSet operation. */
    CreateIPSet("waf-regional:CreateIPSet"),
    /** Action for the CreateRateBasedRule operation. */
    CreateRateBasedRule("waf-regional:CreateRateBasedRule"),
    /** Action for the CreateRegexMatchSet operation. */
    CreateRegexMatchSet("waf-regional:CreateRegexMatchSet"),
    /** Action for the CreateRegexPatternSet operation. */
    CreateRegexPatternSet("waf-regional:CreateRegexPatternSet"),
    /** Action for the CreateRule operation. */
    CreateRule("waf-regional:CreateRule"),
    /** Action for the CreateRuleGroup operation. */
    CreateRuleGroup("waf-regional:CreateRuleGroup"),
    /** Action for the CreateSizeConstraintSet operation. */
    CreateSizeConstraintSet("waf-regional:CreateSizeConstraintSet"),
    /** Action for the CreateSqlInjectionMatchSet operation. */
    CreateSqlInjectionMatchSet("waf-regional:CreateSqlInjectionMatchSet"),
    /** Action for the CreateWebACL operation. */
    CreateWebACL("waf-regional:CreateWebACL"),
    /** Action for the CreateXssMatchSet operation. */
    CreateXssMatchSet("waf-regional:CreateXssMatchSet"),
    /** Action for the DeleteByteMatchSet operation. */
    DeleteByteMatchSet("waf-regional:DeleteByteMatchSet"),
    /** Action for the DeleteGeoMatchSet operation. */
    DeleteGeoMatchSet("waf-regional:DeleteGeoMatchSet"),
    /** Action for the DeleteIPSet operation. */
    DeleteIPSet("waf-regional:DeleteIPSet"),
    /** Action for the DeleteLoggingConfiguration operation. */
    DeleteLoggingConfiguration("waf-regional:DeleteLoggingConfiguration"),
    /** Action for the DeletePermissionPolicy operation. */
    DeletePermissionPolicy("waf-regional:DeletePermissionPolicy"),
    /** Action for the DeleteRateBasedRule operation. */
    DeleteRateBasedRule("waf-regional:DeleteRateBasedRule"),
    /** Action for the DeleteRegexMatchSet operation. */
    DeleteRegexMatchSet("waf-regional:DeleteRegexMatchSet"),
    /** Action for the DeleteRegexPatternSet operation. */
    DeleteRegexPatternSet("waf-regional:DeleteRegexPatternSet"),
    /** Action for the DeleteRule operation. */
    DeleteRule("waf-regional:DeleteRule"),
    /** Action for the DeleteRuleGroup operation. */
    DeleteRuleGroup("waf-regional:DeleteRuleGroup"),
    /** Action for the DeleteSizeConstraintSet operation. */
    DeleteSizeConstraintSet("waf-regional:DeleteSizeConstraintSet"),
    /** Action for the DeleteSqlInjectionMatchSet operation. */
    DeleteSqlInjectionMatchSet("waf-regional:DeleteSqlInjectionMatchSet"),
    /** Action for the DeleteWebACL operation. */
    DeleteWebACL("waf-regional:DeleteWebACL"),
    /** Action for the DeleteXssMatchSet operation. */
    DeleteXssMatchSet("waf-regional:DeleteXssMatchSet"),
    /** Action for the DisassociateWebACL operation. */
    DisassociateWebACL("waf-regional:DisassociateWebACL"),
    /** Action for the GetByteMatchSet operation. */
    GetByteMatchSet("waf-regional:GetByteMatchSet"),
    /** Action for the GetChangeToken operation. */
    GetChangeToken("waf-regional:GetChangeToken"),
    /** Action for the GetChangeTokenStatus operation. */
    GetChangeTokenStatus("waf-regional:GetChangeTokenStatus"),
    /** Action for the GetGeoMatchSet operation. */
    GetGeoMatchSet("waf-regional:GetGeoMatchSet"),
    /** Action for the GetIPSet operation. */
    GetIPSet("waf-regional:GetIPSet"),
    /** Action for the GetLoggingConfiguration operation. */
    GetLoggingConfiguration("waf-regional:GetLoggingConfiguration"),
    /** Action for the GetPermissionPolicy operation. */
    GetPermissionPolicy("waf-regional:GetPermissionPolicy"),
    /** Action for the GetRateBasedRule operation. */
    GetRateBasedRule("waf-regional:GetRateBasedRule"),
    /** Action for the GetRateBasedRuleManagedKeys operation. */
    GetRateBasedRuleManagedKeys("waf-regional:GetRateBasedRuleManagedKeys"),
    /** Action for the GetRegexMatchSet operation. */
    GetRegexMatchSet("waf-regional:GetRegexMatchSet"),
    /** Action for the GetRegexPatternSet operation. */
    GetRegexPatternSet("waf-regional:GetRegexPatternSet"),
    /** Action for the GetRule operation. */
    GetRule("waf-regional:GetRule"),
    /** Action for the GetRuleGroup operation. */
    GetRuleGroup("waf-regional:GetRuleGroup"),
    /** Action for the GetSampledRequests operation. */
    GetSampledRequests("waf-regional:GetSampledRequests"),
    /** Action for the GetSizeConstraintSet operation. */
    GetSizeConstraintSet("waf-regional:GetSizeConstraintSet"),
    /** Action for the GetSqlInjectionMatchSet operation. */
    GetSqlInjectionMatchSet("waf-regional:GetSqlInjectionMatchSet"),
    /** Action for the GetWebACL operation. */
    GetWebACL("waf-regional:GetWebACL"),
    /** Action for the GetWebACLForResource operation. */
    GetWebACLForResource("waf-regional:GetWebACLForResource"),
    /** Action for the GetXssMatchSet operation. */
    GetXssMatchSet("waf-regional:GetXssMatchSet"),
    /** Action for the ListActivatedRulesInRuleGroup operation. */
    ListActivatedRulesInRuleGroup("waf-regional:ListActivatedRulesInRuleGroup"),
    /** Action for the ListByteMatchSets operation. */
    ListByteMatchSets("waf-regional:ListByteMatchSets"),
    /** Action for the ListGeoMatchSets operation. */
    ListGeoMatchSets("waf-regional:ListGeoMatchSets"),
    /** Action for the ListIPSets operation. */
    ListIPSets("waf-regional:ListIPSets"),
    /** Action for the ListLoggingConfigurations operation. */
    ListLoggingConfigurations("waf-regional:ListLoggingConfigurations"),
    /** Action for the ListRateBasedRules operation. */
    ListRateBasedRules("waf-regional:ListRateBasedRules"),
    /** Action for the ListRegexMatchSets operation. */
    ListRegexMatchSets("waf-regional:ListRegexMatchSets"),
    /** Action for the ListRegexPatternSets operation. */
    ListRegexPatternSets("waf-regional:ListRegexPatternSets"),
    /** Action for the ListResourcesForWebACL operation. */
    ListResourcesForWebACL("waf-regional:ListResourcesForWebACL"),
    /** Action for the ListRuleGroups operation. */
    ListRuleGroups("waf-regional:ListRuleGroups"),
    /** Action for the ListRules operation. */
    ListRules("waf-regional:ListRules"),
    /** Action for the ListSizeConstraintSets operation. */
    ListSizeConstraintSets("waf-regional:ListSizeConstraintSets"),
    /** Action for the ListSqlInjectionMatchSets operation. */
    ListSqlInjectionMatchSets("waf-regional:ListSqlInjectionMatchSets"),
    /** Action for the ListSubscribedRuleGroups operation. */
    ListSubscribedRuleGroups("waf-regional:ListSubscribedRuleGroups"),
    /** Action for the ListWebACLs operation. */
    ListWebACLs("waf-regional:ListWebACLs"),
    /** Action for the ListXssMatchSets operation. */
    ListXssMatchSets("waf-regional:ListXssMatchSets"),
    /** Action for the PutLoggingConfiguration operation. */
    PutLoggingConfiguration("waf-regional:PutLoggingConfiguration"),
    /** Action for the PutPermissionPolicy operation. */
    PutPermissionPolicy("waf-regional:PutPermissionPolicy"),
    /** Action for the UpdateByteMatchSet operation. */
    UpdateByteMatchSet("waf-regional:UpdateByteMatchSet"),
    /** Action for the UpdateGeoMatchSet operation. */
    UpdateGeoMatchSet("waf-regional:UpdateGeoMatchSet"),
    /** Action for the UpdateIPSet operation. */
    UpdateIPSet("waf-regional:UpdateIPSet"),
    /** Action for the UpdateRateBasedRule operation. */
    UpdateRateBasedRule("waf-regional:UpdateRateBasedRule"),
    /** Action for the UpdateRegexMatchSet operation. */
    UpdateRegexMatchSet("waf-regional:UpdateRegexMatchSet"),
    /** Action for the UpdateRegexPatternSet operation. */
    UpdateRegexPatternSet("waf-regional:UpdateRegexPatternSet"),
    /** Action for the UpdateRule operation. */
    UpdateRule("waf-regional:UpdateRule"),
    /** Action for the UpdateRuleGroup operation. */
    UpdateRuleGroup("waf-regional:UpdateRuleGroup"),
    /** Action for the UpdateSizeConstraintSet operation. */
    UpdateSizeConstraintSet("waf-regional:UpdateSizeConstraintSet"),
    /** Action for the UpdateSqlInjectionMatchSet operation. */
    UpdateSqlInjectionMatchSet("waf-regional:UpdateSqlInjectionMatchSet"),
    /** Action for the UpdateWebACL operation. */
    UpdateWebACL("waf-regional:UpdateWebACL"),
    /** Action for the UpdateXssMatchSet operation. */
    UpdateXssMatchSet("waf-regional:UpdateXssMatchSet"),

    ;

    private final String action;

    private WafRegionalActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
