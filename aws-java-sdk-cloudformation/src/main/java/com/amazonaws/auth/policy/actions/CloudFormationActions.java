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
 * The available AWS access control policy actions for AWS CloudFormation.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum CloudFormationActions implements Action {

    /** Represents any action executed on AWS CloudFormation. */
    AllCloudFormationActions("cloudformation:*"),

    /** Action for the CancelUpdateStack operation. */
    CancelUpdateStack("cloudformation:CancelUpdateStack"),
    /** Action for the ContinueUpdateRollback operation. */
    ContinueUpdateRollback("cloudformation:ContinueUpdateRollback"),
    /** Action for the CreateChangeSet operation. */
    CreateChangeSet("cloudformation:CreateChangeSet"),
    /** Action for the CreateStack operation. */
    CreateStack("cloudformation:CreateStack"),
    /** Action for the CreateStackInstances operation. */
    CreateStackInstances("cloudformation:CreateStackInstances"),
    /** Action for the CreateStackSet operation. */
    CreateStackSet("cloudformation:CreateStackSet"),
    /** Action for the DeleteChangeSet operation. */
    DeleteChangeSet("cloudformation:DeleteChangeSet"),
    /** Action for the DeleteStack operation. */
    DeleteStack("cloudformation:DeleteStack"),
    /** Action for the DeleteStackInstances operation. */
    DeleteStackInstances("cloudformation:DeleteStackInstances"),
    /** Action for the DeleteStackSet operation. */
    DeleteStackSet("cloudformation:DeleteStackSet"),
    /** Action for the DescribeAccountLimits operation. */
    DescribeAccountLimits("cloudformation:DescribeAccountLimits"),
    /** Action for the DescribeChangeSet operation. */
    DescribeChangeSet("cloudformation:DescribeChangeSet"),
    /** Action for the DescribeStackDriftDetectionStatus operation. */
    DescribeStackDriftDetectionStatus("cloudformation:DescribeStackDriftDetectionStatus"),
    /** Action for the DescribeStackEvents operation. */
    DescribeStackEvents("cloudformation:DescribeStackEvents"),
    /** Action for the DescribeStackInstance operation. */
    DescribeStackInstance("cloudformation:DescribeStackInstance"),
    /** Action for the DescribeStackResource operation. */
    DescribeStackResource("cloudformation:DescribeStackResource"),
    /** Action for the DescribeStackResourceDrifts operation. */
    DescribeStackResourceDrifts("cloudformation:DescribeStackResourceDrifts"),
    /** Action for the DescribeStackResources operation. */
    DescribeStackResources("cloudformation:DescribeStackResources"),
    /** Action for the DescribeStackSet operation. */
    DescribeStackSet("cloudformation:DescribeStackSet"),
    /** Action for the DescribeStackSetOperation operation. */
    DescribeStackSetOperation("cloudformation:DescribeStackSetOperation"),
    /** Action for the DescribeStacks operation. */
    DescribeStacks("cloudformation:DescribeStacks"),
    /** Action for the DetectStackDrift operation. */
    DetectStackDrift("cloudformation:DetectStackDrift"),
    /** Action for the DetectStackResourceDrift operation. */
    DetectStackResourceDrift("cloudformation:DetectStackResourceDrift"),
    /** Action for the EstimateTemplateCost operation. */
    EstimateTemplateCost("cloudformation:EstimateTemplateCost"),
    /** Action for the ExecuteChangeSet operation. */
    ExecuteChangeSet("cloudformation:ExecuteChangeSet"),
    /** Action for the GetStackPolicy operation. */
    GetStackPolicy("cloudformation:GetStackPolicy"),
    /** Action for the GetTemplate operation. */
    GetTemplate("cloudformation:GetTemplate"),
    /** Action for the GetTemplateSummary operation. */
    GetTemplateSummary("cloudformation:GetTemplateSummary"),
    /** Action for the ListChangeSets operation. */
    ListChangeSets("cloudformation:ListChangeSets"),
    /** Action for the ListExports operation. */
    ListExports("cloudformation:ListExports"),
    /** Action for the ListImports operation. */
    ListImports("cloudformation:ListImports"),
    /** Action for the ListStackInstances operation. */
    ListStackInstances("cloudformation:ListStackInstances"),
    /** Action for the ListStackResources operation. */
    ListStackResources("cloudformation:ListStackResources"),
    /** Action for the ListStackSetOperationResults operation. */
    ListStackSetOperationResults("cloudformation:ListStackSetOperationResults"),
    /** Action for the ListStackSetOperations operation. */
    ListStackSetOperations("cloudformation:ListStackSetOperations"),
    /** Action for the ListStackSets operation. */
    ListStackSets("cloudformation:ListStackSets"),
    /** Action for the ListStacks operation. */
    ListStacks("cloudformation:ListStacks"),
    /** Action for the SetStackPolicy operation. */
    SetStackPolicy("cloudformation:SetStackPolicy"),
    /** Action for the SignalResource operation. */
    SignalResource("cloudformation:SignalResource"),
    /** Action for the StopStackSetOperation operation. */
    StopStackSetOperation("cloudformation:StopStackSetOperation"),
    /** Action for the UpdateStack operation. */
    UpdateStack("cloudformation:UpdateStack"),
    /** Action for the UpdateStackInstances operation. */
    UpdateStackInstances("cloudformation:UpdateStackInstances"),
    /** Action for the UpdateStackSet operation. */
    UpdateStackSet("cloudformation:UpdateStackSet"),
    /** Action for the UpdateTerminationProtection operation. */
    UpdateTerminationProtection("cloudformation:UpdateTerminationProtection"),
    /** Action for the ValidateTemplate operation. */
    ValidateTemplate("cloudformation:ValidateTemplate"),

    ;

    private final String action;

    private CloudFormationActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
