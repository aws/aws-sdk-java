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
 * The available AWS access control policy actions for Organizations.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum OrganizationsActions implements Action {

    /** Represents any action executed on Organizations. */
    AllOrganizationsActions("organizations:*"),

    /** Action for the AcceptHandshake operation. */
    AcceptHandshake("organizations:AcceptHandshake"),
    /** Action for the AttachPolicy operation. */
    AttachPolicy("organizations:AttachPolicy"),
    /** Action for the CancelHandshake operation. */
    CancelHandshake("organizations:CancelHandshake"),
    /** Action for the CreateAccount operation. */
    CreateAccount("organizations:CreateAccount"),
    /** Action for the CreateGovCloudAccount operation. */
    CreateGovCloudAccount("organizations:CreateGovCloudAccount"),
    /** Action for the CreateOrganization operation. */
    CreateOrganization("organizations:CreateOrganization"),
    /** Action for the CreateOrganizationalUnit operation. */
    CreateOrganizationalUnit("organizations:CreateOrganizationalUnit"),
    /** Action for the CreatePolicy operation. */
    CreatePolicy("organizations:CreatePolicy"),
    /** Action for the DeclineHandshake operation. */
    DeclineHandshake("organizations:DeclineHandshake"),
    /** Action for the DeleteOrganization operation. */
    DeleteOrganization("organizations:DeleteOrganization"),
    /** Action for the DeleteOrganizationalUnit operation. */
    DeleteOrganizationalUnit("organizations:DeleteOrganizationalUnit"),
    /** Action for the DeletePolicy operation. */
    DeletePolicy("organizations:DeletePolicy"),
    /** Action for the DescribeAccount operation. */
    DescribeAccount("organizations:DescribeAccount"),
    /** Action for the DescribeCreateAccountStatus operation. */
    DescribeCreateAccountStatus("organizations:DescribeCreateAccountStatus"),
    /** Action for the DescribeHandshake operation. */
    DescribeHandshake("organizations:DescribeHandshake"),
    /** Action for the DescribeOrganization operation. */
    DescribeOrganization("organizations:DescribeOrganization"),
    /** Action for the DescribeOrganizationalUnit operation. */
    DescribeOrganizationalUnit("organizations:DescribeOrganizationalUnit"),
    /** Action for the DescribePolicy operation. */
    DescribePolicy("organizations:DescribePolicy"),
    /** Action for the DetachPolicy operation. */
    DetachPolicy("organizations:DetachPolicy"),
    /** Action for the DisableAWSServiceAccess operation. */
    DisableAWSServiceAccess("organizations:DisableAWSServiceAccess"),
    /** Action for the DisablePolicyType operation. */
    DisablePolicyType("organizations:DisablePolicyType"),
    /** Action for the EnableAWSServiceAccess operation. */
    EnableAWSServiceAccess("organizations:EnableAWSServiceAccess"),
    /** Action for the EnableAllFeatures operation. */
    EnableAllFeatures("organizations:EnableAllFeatures"),
    /** Action for the EnablePolicyType operation. */
    EnablePolicyType("organizations:EnablePolicyType"),
    /** Action for the InviteAccountToOrganization operation. */
    InviteAccountToOrganization("organizations:InviteAccountToOrganization"),
    /** Action for the LeaveOrganization operation. */
    LeaveOrganization("organizations:LeaveOrganization"),
    /** Action for the ListAWSServiceAccessForOrganization operation. */
    ListAWSServiceAccessForOrganization("organizations:ListAWSServiceAccessForOrganization"),
    /** Action for the ListAccounts operation. */
    ListAccounts("organizations:ListAccounts"),
    /** Action for the ListAccountsForParent operation. */
    ListAccountsForParent("organizations:ListAccountsForParent"),
    /** Action for the ListChildren operation. */
    ListChildren("organizations:ListChildren"),
    /** Action for the ListCreateAccountStatus operation. */
    ListCreateAccountStatus("organizations:ListCreateAccountStatus"),
    /** Action for the ListHandshakesForAccount operation. */
    ListHandshakesForAccount("organizations:ListHandshakesForAccount"),
    /** Action for the ListHandshakesForOrganization operation. */
    ListHandshakesForOrganization("organizations:ListHandshakesForOrganization"),
    /** Action for the ListOrganizationalUnitsForParent operation. */
    ListOrganizationalUnitsForParent("organizations:ListOrganizationalUnitsForParent"),
    /** Action for the ListParents operation. */
    ListParents("organizations:ListParents"),
    /** Action for the ListPolicies operation. */
    ListPolicies("organizations:ListPolicies"),
    /** Action for the ListPoliciesForTarget operation. */
    ListPoliciesForTarget("organizations:ListPoliciesForTarget"),
    /** Action for the ListRoots operation. */
    ListRoots("organizations:ListRoots"),
    /** Action for the ListTargetsForPolicy operation. */
    ListTargetsForPolicy("organizations:ListTargetsForPolicy"),
    /** Action for the MoveAccount operation. */
    MoveAccount("organizations:MoveAccount"),
    /** Action for the RemoveAccountFromOrganization operation. */
    RemoveAccountFromOrganization("organizations:RemoveAccountFromOrganization"),
    /** Action for the UpdateOrganizationalUnit operation. */
    UpdateOrganizationalUnit("organizations:UpdateOrganizationalUnit"),
    /** Action for the UpdatePolicy operation. */
    UpdatePolicy("organizations:UpdatePolicy"),

    ;

    private final String action;

    private OrganizationsActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
