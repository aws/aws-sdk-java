/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.auth.policy.actions;

import com.amazonaws.auth.policy.Action;

/**
 * The available AWS access control policy actions for Amazon Elastic MapReduce.
 */
public enum ElasticMapReduceActions implements Action {
    /** Represents any action executed on Amazon Elastic MapReduce. */
    AllElasticMapReduceActions("ElasticMapReduce:*"),

    /** Action for the AddInstanceGroups operation. */
    AddInstanceGroups("ElasticMapReduce:AddInstanceGroups"),

    /** Action for the AddJobFlowSteps operation. */
    AddJobFlowSteps("ElasticMapReduce:AddJobFlowSteps"),

    /** Action for the DescribeJobFlows operation. */
    DescribeJobFlows("ElasticMapReduce:DescribeJobFlows"),

    /** Action for the ModifyInstanceGroups operation. */
    ModifyInstanceGroups("ElasticMapReduce:ModifyInstanceGroups"),

    /** Action for the RunJobFlow operation. */
    RunJobFlow("ElasticMapReduce:RunJobFlow"),

    /** Action for the SetTerminationProtection operation. */
    SetTerminationProtection("ElasticMapReduce:SetTerminationProtection"),

    /** Action for the TerminateJobFlows operation. */
    TerminateJobFlows("ElasticMapReduce:TerminateJobFlows");

    private final String action;

    private ElasticMapReduceActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
