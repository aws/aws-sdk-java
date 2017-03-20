/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The available AWS access control policy actions for Amazon Pinpoint.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum PinpointActions implements Action {

    /** Represents any action executed on Amazon Pinpoint. */
    AllPinpointActions("pinpoint:*"),

    /** Action for the CreateCampaign operation. */
    CreateCampaign("pinpoint:CreateCampaign"),
    /** Action for the CreateImportJob operation. */
    CreateImportJob("pinpoint:CreateImportJob"),
    /** Action for the CreateSegment operation. */
    CreateSegment("pinpoint:CreateSegment"),
    /** Action for the DeleteApnsChannel operation. */
    DeleteApnsChannel("pinpoint:DeleteApnsChannel"),
    /** Action for the DeleteCampaign operation. */
    DeleteCampaign("pinpoint:DeleteCampaign"),
    /** Action for the DeleteEventStream operation. */
    DeleteEventStream("pinpoint:DeleteEventStream"),
    /** Action for the DeleteGcmChannel operation. */
    DeleteGcmChannel("pinpoint:DeleteGcmChannel"),
    /** Action for the DeleteSegment operation. */
    DeleteSegment("pinpoint:DeleteSegment"),
    /** Action for the GetApnsChannel operation. */
    GetApnsChannel("pinpoint:GetApnsChannel"),
    /** Action for the GetApplicationSettings operation. */
    GetApplicationSettings("pinpoint:GetApplicationSettings"),
    /** Action for the GetCampaign operation. */
    GetCampaign("pinpoint:GetCampaign"),
    /** Action for the GetCampaignActivities operation. */
    GetCampaignActivities("pinpoint:GetCampaignActivities"),
    /** Action for the GetCampaignVersion operation. */
    GetCampaignVersion("pinpoint:GetCampaignVersion"),
    /** Action for the GetCampaignVersions operation. */
    GetCampaignVersions("pinpoint:GetCampaignVersions"),
    /** Action for the GetCampaigns operation. */
    GetCampaigns("pinpoint:GetCampaigns"),
    /** Action for the GetEndpoint operation. */
    GetEndpoint("pinpoint:GetEndpoint"),
    /** Action for the GetEventStream operation. */
    GetEventStream("pinpoint:GetEventStream"),
    /** Action for the GetGcmChannel operation. */
    GetGcmChannel("pinpoint:GetGcmChannel"),
    /** Action for the GetImportJob operation. */
    GetImportJob("pinpoint:GetImportJob"),
    /** Action for the GetImportJobs operation. */
    GetImportJobs("pinpoint:GetImportJobs"),
    /** Action for the GetSegment operation. */
    GetSegment("pinpoint:GetSegment"),
    /** Action for the GetSegmentImportJobs operation. */
    GetSegmentImportJobs("pinpoint:GetSegmentImportJobs"),
    /** Action for the GetSegmentVersion operation. */
    GetSegmentVersion("pinpoint:GetSegmentVersion"),
    /** Action for the GetSegmentVersions operation. */
    GetSegmentVersions("pinpoint:GetSegmentVersions"),
    /** Action for the GetSegments operation. */
    GetSegments("pinpoint:GetSegments"),
    /** Action for the PutEventStream operation. */
    PutEventStream("pinpoint:PutEventStream"),
    /** Action for the UpdateApnsChannel operation. */
    UpdateApnsChannel("pinpoint:UpdateApnsChannel"),
    /** Action for the UpdateApplicationSettings operation. */
    UpdateApplicationSettings("pinpoint:UpdateApplicationSettings"),
    /** Action for the UpdateCampaign operation. */
    UpdateCampaign("pinpoint:UpdateCampaign"),
    /** Action for the UpdateEndpoint operation. */
    UpdateEndpoint("pinpoint:UpdateEndpoint"),
    /** Action for the UpdateEndpointsBatch operation. */
    UpdateEndpointsBatch("pinpoint:UpdateEndpointsBatch"),
    /** Action for the UpdateGcmChannel operation. */
    UpdateGcmChannel("pinpoint:UpdateGcmChannel"),
    /** Action for the UpdateSegment operation. */
    UpdateSegment("pinpoint:UpdateSegment"),

    ;

    private final String action;

    private PinpointActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
