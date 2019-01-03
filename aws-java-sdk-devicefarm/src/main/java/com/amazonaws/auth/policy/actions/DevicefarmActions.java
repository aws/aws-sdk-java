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
 * The available AWS access control policy actions for AWS Device Farm.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DevicefarmActions implements Action {

    /** Represents any action executed on AWS Device Farm. */
    AllDevicefarmActions("devicefarm:*"),

    /** Action for the CreateDevicePool operation. */
    CreateDevicePool("devicefarm:CreateDevicePool"),
    /** Action for the CreateInstanceProfile operation. */
    CreateInstanceProfile("devicefarm:CreateInstanceProfile"),
    /** Action for the CreateNetworkProfile operation. */
    CreateNetworkProfile("devicefarm:CreateNetworkProfile"),
    /** Action for the CreateProject operation. */
    CreateProject("devicefarm:CreateProject"),
    /** Action for the CreateRemoteAccessSession operation. */
    CreateRemoteAccessSession("devicefarm:CreateRemoteAccessSession"),
    /** Action for the CreateUpload operation. */
    CreateUpload("devicefarm:CreateUpload"),
    /** Action for the CreateVPCEConfiguration operation. */
    CreateVPCEConfiguration("devicefarm:CreateVPCEConfiguration"),
    /** Action for the DeleteDevicePool operation. */
    DeleteDevicePool("devicefarm:DeleteDevicePool"),
    /** Action for the DeleteInstanceProfile operation. */
    DeleteInstanceProfile("devicefarm:DeleteInstanceProfile"),
    /** Action for the DeleteNetworkProfile operation. */
    DeleteNetworkProfile("devicefarm:DeleteNetworkProfile"),
    /** Action for the DeleteProject operation. */
    DeleteProject("devicefarm:DeleteProject"),
    /** Action for the DeleteRemoteAccessSession operation. */
    DeleteRemoteAccessSession("devicefarm:DeleteRemoteAccessSession"),
    /** Action for the DeleteRun operation. */
    DeleteRun("devicefarm:DeleteRun"),
    /** Action for the DeleteUpload operation. */
    DeleteUpload("devicefarm:DeleteUpload"),
    /** Action for the DeleteVPCEConfiguration operation. */
    DeleteVPCEConfiguration("devicefarm:DeleteVPCEConfiguration"),
    /** Action for the GetAccountSettings operation. */
    GetAccountSettings("devicefarm:GetAccountSettings"),
    /** Action for the GetDevice operation. */
    GetDevice("devicefarm:GetDevice"),
    /** Action for the GetDeviceInstance operation. */
    GetDeviceInstance("devicefarm:GetDeviceInstance"),
    /** Action for the GetDevicePool operation. */
    GetDevicePool("devicefarm:GetDevicePool"),
    /** Action for the GetDevicePoolCompatibility operation. */
    GetDevicePoolCompatibility("devicefarm:GetDevicePoolCompatibility"),
    /** Action for the GetInstanceProfile operation. */
    GetInstanceProfile("devicefarm:GetInstanceProfile"),
    /** Action for the GetJob operation. */
    GetJob("devicefarm:GetJob"),
    /** Action for the GetNetworkProfile operation. */
    GetNetworkProfile("devicefarm:GetNetworkProfile"),
    /** Action for the GetOfferingStatus operation. */
    GetOfferingStatus("devicefarm:GetOfferingStatus"),
    /** Action for the GetProject operation. */
    GetProject("devicefarm:GetProject"),
    /** Action for the GetRemoteAccessSession operation. */
    GetRemoteAccessSession("devicefarm:GetRemoteAccessSession"),
    /** Action for the GetRun operation. */
    GetRun("devicefarm:GetRun"),
    /** Action for the GetSuite operation. */
    GetSuite("devicefarm:GetSuite"),
    /** Action for the GetTest operation. */
    GetTest("devicefarm:GetTest"),
    /** Action for the GetUpload operation. */
    GetUpload("devicefarm:GetUpload"),
    /** Action for the GetVPCEConfiguration operation. */
    GetVPCEConfiguration("devicefarm:GetVPCEConfiguration"),
    /** Action for the InstallToRemoteAccessSession operation. */
    InstallToRemoteAccessSession("devicefarm:InstallToRemoteAccessSession"),
    /** Action for the ListArtifacts operation. */
    ListArtifacts("devicefarm:ListArtifacts"),
    /** Action for the ListDeviceInstances operation. */
    ListDeviceInstances("devicefarm:ListDeviceInstances"),
    /** Action for the ListDevicePools operation. */
    ListDevicePools("devicefarm:ListDevicePools"),
    /** Action for the ListDevices operation. */
    ListDevices("devicefarm:ListDevices"),
    /** Action for the ListInstanceProfiles operation. */
    ListInstanceProfiles("devicefarm:ListInstanceProfiles"),
    /** Action for the ListJobs operation. */
    ListJobs("devicefarm:ListJobs"),
    /** Action for the ListNetworkProfiles operation. */
    ListNetworkProfiles("devicefarm:ListNetworkProfiles"),
    /** Action for the ListOfferingPromotions operation. */
    ListOfferingPromotions("devicefarm:ListOfferingPromotions"),
    /** Action for the ListOfferingTransactions operation. */
    ListOfferingTransactions("devicefarm:ListOfferingTransactions"),
    /** Action for the ListOfferings operation. */
    ListOfferings("devicefarm:ListOfferings"),
    /** Action for the ListProjects operation. */
    ListProjects("devicefarm:ListProjects"),
    /** Action for the ListRemoteAccessSessions operation. */
    ListRemoteAccessSessions("devicefarm:ListRemoteAccessSessions"),
    /** Action for the ListRuns operation. */
    ListRuns("devicefarm:ListRuns"),
    /** Action for the ListSamples operation. */
    ListSamples("devicefarm:ListSamples"),
    /** Action for the ListSuites operation. */
    ListSuites("devicefarm:ListSuites"),
    /** Action for the ListTests operation. */
    ListTests("devicefarm:ListTests"),
    /** Action for the ListUniqueProblems operation. */
    ListUniqueProblems("devicefarm:ListUniqueProblems"),
    /** Action for the ListUploads operation. */
    ListUploads("devicefarm:ListUploads"),
    /** Action for the ListVPCEConfigurations operation. */
    ListVPCEConfigurations("devicefarm:ListVPCEConfigurations"),
    /** Action for the PurchaseOffering operation. */
    PurchaseOffering("devicefarm:PurchaseOffering"),
    /** Action for the RenewOffering operation. */
    RenewOffering("devicefarm:RenewOffering"),
    /** Action for the ScheduleRun operation. */
    ScheduleRun("devicefarm:ScheduleRun"),
    /** Action for the StopJob operation. */
    StopJob("devicefarm:StopJob"),
    /** Action for the StopRemoteAccessSession operation. */
    StopRemoteAccessSession("devicefarm:StopRemoteAccessSession"),
    /** Action for the StopRun operation. */
    StopRun("devicefarm:StopRun"),
    /** Action for the UpdateDeviceInstance operation. */
    UpdateDeviceInstance("devicefarm:UpdateDeviceInstance"),
    /** Action for the UpdateDevicePool operation. */
    UpdateDevicePool("devicefarm:UpdateDevicePool"),
    /** Action for the UpdateInstanceProfile operation. */
    UpdateInstanceProfile("devicefarm:UpdateInstanceProfile"),
    /** Action for the UpdateNetworkProfile operation. */
    UpdateNetworkProfile("devicefarm:UpdateNetworkProfile"),
    /** Action for the UpdateProject operation. */
    UpdateProject("devicefarm:UpdateProject"),
    /** Action for the UpdateUpload operation. */
    UpdateUpload("devicefarm:UpdateUpload"),
    /** Action for the UpdateVPCEConfiguration operation. */
    UpdateVPCEConfiguration("devicefarm:UpdateVPCEConfiguration"),

    ;

    private final String action;

    private DevicefarmActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
