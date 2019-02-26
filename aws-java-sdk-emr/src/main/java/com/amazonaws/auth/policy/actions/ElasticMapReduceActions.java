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
 * The available AWS access control policy actions for Amazon EMR.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ElasticMapReduceActions implements Action {

    /** Represents any action executed on Amazon EMR. */
    AllElasticMapReduceActions("elasticmapreduce:*"),

    /** Action for the AddInstanceFleet operation. */
    AddInstanceFleet("elasticmapreduce:AddInstanceFleet"),
    /** Action for the AddInstanceGroups operation. */
    AddInstanceGroups("elasticmapreduce:AddInstanceGroups"),
    /** Action for the AddJobFlowSteps operation. */
    AddJobFlowSteps("elasticmapreduce:AddJobFlowSteps"),
    /** Action for the AddTags operation. */
    AddTags("elasticmapreduce:AddTags"),
    /** Action for the CancelSteps operation. */
    CancelSteps("elasticmapreduce:CancelSteps"),
    /** Action for the CreateSecurityConfiguration operation. */
    CreateSecurityConfiguration("elasticmapreduce:CreateSecurityConfiguration"),
    /** Action for the DeleteSecurityConfiguration operation. */
    DeleteSecurityConfiguration("elasticmapreduce:DeleteSecurityConfiguration"),
    /** Action for the DescribeCluster operation. */
    DescribeCluster("elasticmapreduce:DescribeCluster"),
    /** Action for the DescribeJobFlows operation. */
    DescribeJobFlows("elasticmapreduce:DescribeJobFlows"),
    /** Action for the DescribeSecurityConfiguration operation. */
    DescribeSecurityConfiguration("elasticmapreduce:DescribeSecurityConfiguration"),
    /** Action for the DescribeStep operation. */
    DescribeStep("elasticmapreduce:DescribeStep"),
    /** Action for the ListBootstrapActions operation. */
    ListBootstrapActions("elasticmapreduce:ListBootstrapActions"),
    /** Action for the ListClusters operation. */
    ListClusters("elasticmapreduce:ListClusters"),
    /** Action for the ListInstanceFleets operation. */
    ListInstanceFleets("elasticmapreduce:ListInstanceFleets"),
    /** Action for the ListInstanceGroups operation. */
    ListInstanceGroups("elasticmapreduce:ListInstanceGroups"),
    /** Action for the ListInstances operation. */
    ListInstances("elasticmapreduce:ListInstances"),
    /** Action for the ListSecurityConfigurations operation. */
    ListSecurityConfigurations("elasticmapreduce:ListSecurityConfigurations"),
    /** Action for the ListSteps operation. */
    ListSteps("elasticmapreduce:ListSteps"),
    /** Action for the ModifyInstanceFleet operation. */
    ModifyInstanceFleet("elasticmapreduce:ModifyInstanceFleet"),
    /** Action for the ModifyInstanceGroups operation. */
    ModifyInstanceGroups("elasticmapreduce:ModifyInstanceGroups"),
    /** Action for the PutAutoScalingPolicy operation. */
    PutAutoScalingPolicy("elasticmapreduce:PutAutoScalingPolicy"),
    /** Action for the RemoveAutoScalingPolicy operation. */
    RemoveAutoScalingPolicy("elasticmapreduce:RemoveAutoScalingPolicy"),
    /** Action for the RemoveTags operation. */
    RemoveTags("elasticmapreduce:RemoveTags"),
    /** Action for the RunJobFlow operation. */
    RunJobFlow("elasticmapreduce:RunJobFlow"),
    /** Action for the SetTerminationProtection operation. */
    SetTerminationProtection("elasticmapreduce:SetTerminationProtection"),
    /** Action for the SetVisibleToAllUsers operation. */
    SetVisibleToAllUsers("elasticmapreduce:SetVisibleToAllUsers"),
    /** Action for the TerminateJobFlows operation. */
    TerminateJobFlows("elasticmapreduce:TerminateJobFlows"),

    ;

    private final String action;

    private ElasticMapReduceActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
