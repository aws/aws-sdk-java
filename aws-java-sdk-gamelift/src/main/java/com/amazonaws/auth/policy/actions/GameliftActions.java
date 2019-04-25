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
 * The available AWS access control policy actions for Amazon GameLift.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum GameliftActions implements Action {

    /** Represents any action executed on Amazon GameLift. */
    AllGameliftActions("gamelift:*"),

    /** Action for the AcceptMatch operation. */
    AcceptMatch("gamelift:AcceptMatch"),
    /** Action for the CreateAlias operation. */
    CreateAlias("gamelift:CreateAlias"),
    /** Action for the CreateBuild operation. */
    CreateBuild("gamelift:CreateBuild"),
    /** Action for the CreateFleet operation. */
    CreateFleet("gamelift:CreateFleet"),
    /** Action for the CreateGameSession operation. */
    CreateGameSession("gamelift:CreateGameSession"),
    /** Action for the CreateGameSessionQueue operation. */
    CreateGameSessionQueue("gamelift:CreateGameSessionQueue"),
    /** Action for the CreateMatchmakingConfiguration operation. */
    CreateMatchmakingConfiguration("gamelift:CreateMatchmakingConfiguration"),
    /** Action for the CreateMatchmakingRuleSet operation. */
    CreateMatchmakingRuleSet("gamelift:CreateMatchmakingRuleSet"),
    /** Action for the CreatePlayerSession operation. */
    CreatePlayerSession("gamelift:CreatePlayerSession"),
    /** Action for the CreatePlayerSessions operation. */
    CreatePlayerSessions("gamelift:CreatePlayerSessions"),
    /** Action for the CreateScript operation. */
    CreateScript("gamelift:CreateScript"),
    /** Action for the CreateVpcPeeringAuthorization operation. */
    CreateVpcPeeringAuthorization("gamelift:CreateVpcPeeringAuthorization"),
    /** Action for the CreateVpcPeeringConnection operation. */
    CreateVpcPeeringConnection("gamelift:CreateVpcPeeringConnection"),
    /** Action for the DeleteAlias operation. */
    DeleteAlias("gamelift:DeleteAlias"),
    /** Action for the DeleteBuild operation. */
    DeleteBuild("gamelift:DeleteBuild"),
    /** Action for the DeleteFleet operation. */
    DeleteFleet("gamelift:DeleteFleet"),
    /** Action for the DeleteGameSessionQueue operation. */
    DeleteGameSessionQueue("gamelift:DeleteGameSessionQueue"),
    /** Action for the DeleteMatchmakingConfiguration operation. */
    DeleteMatchmakingConfiguration("gamelift:DeleteMatchmakingConfiguration"),
    /** Action for the DeleteMatchmakingRuleSet operation. */
    DeleteMatchmakingRuleSet("gamelift:DeleteMatchmakingRuleSet"),
    /** Action for the DeleteScalingPolicy operation. */
    DeleteScalingPolicy("gamelift:DeleteScalingPolicy"),
    /** Action for the DeleteScript operation. */
    DeleteScript("gamelift:DeleteScript"),
    /** Action for the DeleteVpcPeeringAuthorization operation. */
    DeleteVpcPeeringAuthorization("gamelift:DeleteVpcPeeringAuthorization"),
    /** Action for the DeleteVpcPeeringConnection operation. */
    DeleteVpcPeeringConnection("gamelift:DeleteVpcPeeringConnection"),
    /** Action for the DescribeAlias operation. */
    DescribeAlias("gamelift:DescribeAlias"),
    /** Action for the DescribeBuild operation. */
    DescribeBuild("gamelift:DescribeBuild"),
    /** Action for the DescribeEC2InstanceLimits operation. */
    DescribeEC2InstanceLimits("gamelift:DescribeEC2InstanceLimits"),
    /** Action for the DescribeFleetAttributes operation. */
    DescribeFleetAttributes("gamelift:DescribeFleetAttributes"),
    /** Action for the DescribeFleetCapacity operation. */
    DescribeFleetCapacity("gamelift:DescribeFleetCapacity"),
    /** Action for the DescribeFleetEvents operation. */
    DescribeFleetEvents("gamelift:DescribeFleetEvents"),
    /** Action for the DescribeFleetPortSettings operation. */
    DescribeFleetPortSettings("gamelift:DescribeFleetPortSettings"),
    /** Action for the DescribeFleetUtilization operation. */
    DescribeFleetUtilization("gamelift:DescribeFleetUtilization"),
    /** Action for the DescribeGameSessionDetails operation. */
    DescribeGameSessionDetails("gamelift:DescribeGameSessionDetails"),
    /** Action for the DescribeGameSessionPlacement operation. */
    DescribeGameSessionPlacement("gamelift:DescribeGameSessionPlacement"),
    /** Action for the DescribeGameSessionQueues operation. */
    DescribeGameSessionQueues("gamelift:DescribeGameSessionQueues"),
    /** Action for the DescribeGameSessions operation. */
    DescribeGameSessions("gamelift:DescribeGameSessions"),
    /** Action for the DescribeInstances operation. */
    DescribeInstances("gamelift:DescribeInstances"),
    /** Action for the DescribeMatchmaking operation. */
    DescribeMatchmaking("gamelift:DescribeMatchmaking"),
    /** Action for the DescribeMatchmakingConfigurations operation. */
    DescribeMatchmakingConfigurations("gamelift:DescribeMatchmakingConfigurations"),
    /** Action for the DescribeMatchmakingRuleSets operation. */
    DescribeMatchmakingRuleSets("gamelift:DescribeMatchmakingRuleSets"),
    /** Action for the DescribePlayerSessions operation. */
    DescribePlayerSessions("gamelift:DescribePlayerSessions"),
    /** Action for the DescribeRuntimeConfiguration operation. */
    DescribeRuntimeConfiguration("gamelift:DescribeRuntimeConfiguration"),
    /** Action for the DescribeScalingPolicies operation. */
    DescribeScalingPolicies("gamelift:DescribeScalingPolicies"),
    /** Action for the DescribeScript operation. */
    DescribeScript("gamelift:DescribeScript"),
    /** Action for the DescribeVpcPeeringAuthorizations operation. */
    DescribeVpcPeeringAuthorizations("gamelift:DescribeVpcPeeringAuthorizations"),
    /** Action for the DescribeVpcPeeringConnections operation. */
    DescribeVpcPeeringConnections("gamelift:DescribeVpcPeeringConnections"),
    /** Action for the GetGameSessionLogUrl operation. */
    GetGameSessionLogUrl("gamelift:GetGameSessionLogUrl"),
    /** Action for the GetInstanceAccess operation. */
    GetInstanceAccess("gamelift:GetInstanceAccess"),
    /** Action for the ListAliases operation. */
    ListAliases("gamelift:ListAliases"),
    /** Action for the ListBuilds operation. */
    ListBuilds("gamelift:ListBuilds"),
    /** Action for the ListFleets operation. */
    ListFleets("gamelift:ListFleets"),
    /** Action for the ListScripts operation. */
    ListScripts("gamelift:ListScripts"),
    /** Action for the PutScalingPolicy operation. */
    PutScalingPolicy("gamelift:PutScalingPolicy"),
    /** Action for the RequestUploadCredentials operation. */
    RequestUploadCredentials("gamelift:RequestUploadCredentials"),
    /** Action for the ResolveAlias operation. */
    ResolveAlias("gamelift:ResolveAlias"),
    /** Action for the SearchGameSessions operation. */
    SearchGameSessions("gamelift:SearchGameSessions"),
    /** Action for the StartFleetActions operation. */
    StartFleetActions("gamelift:StartFleetActions"),
    /** Action for the StartGameSessionPlacement operation. */
    StartGameSessionPlacement("gamelift:StartGameSessionPlacement"),
    /** Action for the StartMatchBackfill operation. */
    StartMatchBackfill("gamelift:StartMatchBackfill"),
    /** Action for the StartMatchmaking operation. */
    StartMatchmaking("gamelift:StartMatchmaking"),
    /** Action for the StopFleetActions operation. */
    StopFleetActions("gamelift:StopFleetActions"),
    /** Action for the StopGameSessionPlacement operation. */
    StopGameSessionPlacement("gamelift:StopGameSessionPlacement"),
    /** Action for the StopMatchmaking operation. */
    StopMatchmaking("gamelift:StopMatchmaking"),
    /** Action for the UpdateAlias operation. */
    UpdateAlias("gamelift:UpdateAlias"),
    /** Action for the UpdateBuild operation. */
    UpdateBuild("gamelift:UpdateBuild"),
    /** Action for the UpdateFleetAttributes operation. */
    UpdateFleetAttributes("gamelift:UpdateFleetAttributes"),
    /** Action for the UpdateFleetCapacity operation. */
    UpdateFleetCapacity("gamelift:UpdateFleetCapacity"),
    /** Action for the UpdateFleetPortSettings operation. */
    UpdateFleetPortSettings("gamelift:UpdateFleetPortSettings"),
    /** Action for the UpdateGameSession operation. */
    UpdateGameSession("gamelift:UpdateGameSession"),
    /** Action for the UpdateGameSessionQueue operation. */
    UpdateGameSessionQueue("gamelift:UpdateGameSessionQueue"),
    /** Action for the UpdateMatchmakingConfiguration operation. */
    UpdateMatchmakingConfiguration("gamelift:UpdateMatchmakingConfiguration"),
    /** Action for the UpdateRuntimeConfiguration operation. */
    UpdateRuntimeConfiguration("gamelift:UpdateRuntimeConfiguration"),
    /** Action for the UpdateScript operation. */
    UpdateScript("gamelift:UpdateScript"),
    /** Action for the ValidateMatchmakingRuleSet operation. */
    ValidateMatchmakingRuleSet("gamelift:ValidateMatchmakingRuleSet"),

    ;

    private final String action;

    private GameliftActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
