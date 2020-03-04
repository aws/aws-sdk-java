/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

    /** Action for the CreateApp operation. */
    CreateApp("pinpoint:CreateApp"),
    /** Action for the CreateCampaign operation. */
    CreateCampaign("pinpoint:CreateCampaign"),
    /** Action for the CreateEmailTemplate operation. */
    CreateEmailTemplate("pinpoint:CreateEmailTemplate"),
    /** Action for the CreateExportJob operation. */
    CreateExportJob("pinpoint:CreateExportJob"),
    /** Action for the CreateImportJob operation. */
    CreateImportJob("pinpoint:CreateImportJob"),
    /** Action for the CreateJourney operation. */
    CreateJourney("pinpoint:CreateJourney"),
    /** Action for the CreatePushTemplate operation. */
    CreatePushTemplate("pinpoint:CreatePushTemplate"),
    /** Action for the CreateRecommenderConfiguration operation. */
    CreateRecommenderConfiguration("pinpoint:CreateRecommenderConfiguration"),
    /** Action for the CreateSegment operation. */
    CreateSegment("pinpoint:CreateSegment"),
    /** Action for the CreateSmsTemplate operation. */
    CreateSmsTemplate("pinpoint:CreateSmsTemplate"),
    /** Action for the CreateVoiceTemplate operation. */
    CreateVoiceTemplate("pinpoint:CreateVoiceTemplate"),
    /** Action for the DeleteAdmChannel operation. */
    DeleteAdmChannel("pinpoint:DeleteAdmChannel"),
    /** Action for the DeleteApnsChannel operation. */
    DeleteApnsChannel("pinpoint:DeleteApnsChannel"),
    /** Action for the DeleteApnsSandboxChannel operation. */
    DeleteApnsSandboxChannel("pinpoint:DeleteApnsSandboxChannel"),
    /** Action for the DeleteApnsVoipChannel operation. */
    DeleteApnsVoipChannel("pinpoint:DeleteApnsVoipChannel"),
    /** Action for the DeleteApnsVoipSandboxChannel operation. */
    DeleteApnsVoipSandboxChannel("pinpoint:DeleteApnsVoipSandboxChannel"),
    /** Action for the DeleteApp operation. */
    DeleteApp("pinpoint:DeleteApp"),
    /** Action for the DeleteBaiduChannel operation. */
    DeleteBaiduChannel("pinpoint:DeleteBaiduChannel"),
    /** Action for the DeleteCampaign operation. */
    DeleteCampaign("pinpoint:DeleteCampaign"),
    /** Action for the DeleteEmailChannel operation. */
    DeleteEmailChannel("pinpoint:DeleteEmailChannel"),
    /** Action for the DeleteEmailTemplate operation. */
    DeleteEmailTemplate("pinpoint:DeleteEmailTemplate"),
    /** Action for the DeleteEndpoint operation. */
    DeleteEndpoint("pinpoint:DeleteEndpoint"),
    /** Action for the DeleteEventStream operation. */
    DeleteEventStream("pinpoint:DeleteEventStream"),
    /** Action for the DeleteGcmChannel operation. */
    DeleteGcmChannel("pinpoint:DeleteGcmChannel"),
    /** Action for the DeleteJourney operation. */
    DeleteJourney("pinpoint:DeleteJourney"),
    /** Action for the DeletePushTemplate operation. */
    DeletePushTemplate("pinpoint:DeletePushTemplate"),
    /** Action for the DeleteRecommenderConfiguration operation. */
    DeleteRecommenderConfiguration("pinpoint:DeleteRecommenderConfiguration"),
    /** Action for the DeleteSegment operation. */
    DeleteSegment("pinpoint:DeleteSegment"),
    /** Action for the DeleteSmsChannel operation. */
    DeleteSmsChannel("pinpoint:DeleteSmsChannel"),
    /** Action for the DeleteSmsTemplate operation. */
    DeleteSmsTemplate("pinpoint:DeleteSmsTemplate"),
    /** Action for the DeleteUserEndpoints operation. */
    DeleteUserEndpoints("pinpoint:DeleteUserEndpoints"),
    /** Action for the DeleteVoiceChannel operation. */
    DeleteVoiceChannel("pinpoint:DeleteVoiceChannel"),
    /** Action for the DeleteVoiceTemplate operation. */
    DeleteVoiceTemplate("pinpoint:DeleteVoiceTemplate"),
    /** Action for the GetAdmChannel operation. */
    GetAdmChannel("pinpoint:GetAdmChannel"),
    /** Action for the GetApnsChannel operation. */
    GetApnsChannel("pinpoint:GetApnsChannel"),
    /** Action for the GetApnsSandboxChannel operation. */
    GetApnsSandboxChannel("pinpoint:GetApnsSandboxChannel"),
    /** Action for the GetApnsVoipChannel operation. */
    GetApnsVoipChannel("pinpoint:GetApnsVoipChannel"),
    /** Action for the GetApnsVoipSandboxChannel operation. */
    GetApnsVoipSandboxChannel("pinpoint:GetApnsVoipSandboxChannel"),
    /** Action for the GetApp operation. */
    GetApp("pinpoint:GetApp"),
    /** Action for the GetApplicationDateRangeKpi operation. */
    GetApplicationDateRangeKpi("pinpoint:GetApplicationDateRangeKpi"),
    /** Action for the GetApplicationSettings operation. */
    GetApplicationSettings("pinpoint:GetApplicationSettings"),
    /** Action for the GetApps operation. */
    GetApps("pinpoint:GetApps"),
    /** Action for the GetBaiduChannel operation. */
    GetBaiduChannel("pinpoint:GetBaiduChannel"),
    /** Action for the GetCampaign operation. */
    GetCampaign("pinpoint:GetCampaign"),
    /** Action for the GetCampaignActivities operation. */
    GetCampaignActivities("pinpoint:GetCampaignActivities"),
    /** Action for the GetCampaignDateRangeKpi operation. */
    GetCampaignDateRangeKpi("pinpoint:GetCampaignDateRangeKpi"),
    /** Action for the GetCampaignVersion operation. */
    GetCampaignVersion("pinpoint:GetCampaignVersion"),
    /** Action for the GetCampaignVersions operation. */
    GetCampaignVersions("pinpoint:GetCampaignVersions"),
    /** Action for the GetCampaigns operation. */
    GetCampaigns("pinpoint:GetCampaigns"),
    /** Action for the GetChannels operation. */
    GetChannels("pinpoint:GetChannels"),
    /** Action for the GetEmailChannel operation. */
    GetEmailChannel("pinpoint:GetEmailChannel"),
    /** Action for the GetEmailTemplate operation. */
    GetEmailTemplate("pinpoint:GetEmailTemplate"),
    /** Action for the GetEndpoint operation. */
    GetEndpoint("pinpoint:GetEndpoint"),
    /** Action for the GetEventStream operation. */
    GetEventStream("pinpoint:GetEventStream"),
    /** Action for the GetExportJob operation. */
    GetExportJob("pinpoint:GetExportJob"),
    /** Action for the GetExportJobs operation. */
    GetExportJobs("pinpoint:GetExportJobs"),
    /** Action for the GetGcmChannel operation. */
    GetGcmChannel("pinpoint:GetGcmChannel"),
    /** Action for the GetImportJob operation. */
    GetImportJob("pinpoint:GetImportJob"),
    /** Action for the GetImportJobs operation. */
    GetImportJobs("pinpoint:GetImportJobs"),
    /** Action for the GetJourney operation. */
    GetJourney("pinpoint:GetJourney"),
    /** Action for the GetJourneyDateRangeKpi operation. */
    GetJourneyDateRangeKpi("pinpoint:GetJourneyDateRangeKpi"),
    /** Action for the GetJourneyExecutionActivityMetrics operation. */
    GetJourneyExecutionActivityMetrics("pinpoint:GetJourneyExecutionActivityMetrics"),
    /** Action for the GetJourneyExecutionMetrics operation. */
    GetJourneyExecutionMetrics("pinpoint:GetJourneyExecutionMetrics"),
    /** Action for the GetPushTemplate operation. */
    GetPushTemplate("pinpoint:GetPushTemplate"),
    /** Action for the GetRecommenderConfiguration operation. */
    GetRecommenderConfiguration("pinpoint:GetRecommenderConfiguration"),
    /** Action for the GetRecommenderConfigurations operation. */
    GetRecommenderConfigurations("pinpoint:GetRecommenderConfigurations"),
    /** Action for the GetSegment operation. */
    GetSegment("pinpoint:GetSegment"),
    /** Action for the GetSegmentExportJobs operation. */
    GetSegmentExportJobs("pinpoint:GetSegmentExportJobs"),
    /** Action for the GetSegmentImportJobs operation. */
    GetSegmentImportJobs("pinpoint:GetSegmentImportJobs"),
    /** Action for the GetSegmentVersion operation. */
    GetSegmentVersion("pinpoint:GetSegmentVersion"),
    /** Action for the GetSegmentVersions operation. */
    GetSegmentVersions("pinpoint:GetSegmentVersions"),
    /** Action for the GetSegments operation. */
    GetSegments("pinpoint:GetSegments"),
    /** Action for the GetSmsChannel operation. */
    GetSmsChannel("pinpoint:GetSmsChannel"),
    /** Action for the GetSmsTemplate operation. */
    GetSmsTemplate("pinpoint:GetSmsTemplate"),
    /** Action for the GetUserEndpoints operation. */
    GetUserEndpoints("pinpoint:GetUserEndpoints"),
    /** Action for the GetVoiceChannel operation. */
    GetVoiceChannel("pinpoint:GetVoiceChannel"),
    /** Action for the GetVoiceTemplate operation. */
    GetVoiceTemplate("pinpoint:GetVoiceTemplate"),
    /** Action for the ListJourneys operation. */
    ListJourneys("pinpoint:ListJourneys"),
    /** Action for the ListTagsForResource operation. */
    ListTagsForResource("pinpoint:ListTagsForResource"),
    /** Action for the ListTemplateVersions operation. */
    ListTemplateVersions("pinpoint:ListTemplateVersions"),
    /** Action for the ListTemplates operation. */
    ListTemplates("pinpoint:ListTemplates"),
    /** Action for the PhoneNumberValidate operation. */
    PhoneNumberValidate("pinpoint:PhoneNumberValidate"),
    /** Action for the PutEventStream operation. */
    PutEventStream("pinpoint:PutEventStream"),
    /** Action for the PutEvents operation. */
    PutEvents("pinpoint:PutEvents"),
    /** Action for the RemoveAttributes operation. */
    RemoveAttributes("pinpoint:RemoveAttributes"),
    /** Action for the SendMessages operation. */
    SendMessages("pinpoint:SendMessages"),
    /** Action for the SendUsersMessages operation. */
    SendUsersMessages("pinpoint:SendUsersMessages"),
    /** Action for the TagResource operation. */
    TagResource("pinpoint:TagResource"),
    /** Action for the UntagResource operation. */
    UntagResource("pinpoint:UntagResource"),
    /** Action for the UpdateAdmChannel operation. */
    UpdateAdmChannel("pinpoint:UpdateAdmChannel"),
    /** Action for the UpdateApnsChannel operation. */
    UpdateApnsChannel("pinpoint:UpdateApnsChannel"),
    /** Action for the UpdateApnsSandboxChannel operation. */
    UpdateApnsSandboxChannel("pinpoint:UpdateApnsSandboxChannel"),
    /** Action for the UpdateApnsVoipChannel operation. */
    UpdateApnsVoipChannel("pinpoint:UpdateApnsVoipChannel"),
    /** Action for the UpdateApnsVoipSandboxChannel operation. */
    UpdateApnsVoipSandboxChannel("pinpoint:UpdateApnsVoipSandboxChannel"),
    /** Action for the UpdateApplicationSettings operation. */
    UpdateApplicationSettings("pinpoint:UpdateApplicationSettings"),
    /** Action for the UpdateBaiduChannel operation. */
    UpdateBaiduChannel("pinpoint:UpdateBaiduChannel"),
    /** Action for the UpdateCampaign operation. */
    UpdateCampaign("pinpoint:UpdateCampaign"),
    /** Action for the UpdateEmailChannel operation. */
    UpdateEmailChannel("pinpoint:UpdateEmailChannel"),
    /** Action for the UpdateEmailTemplate operation. */
    UpdateEmailTemplate("pinpoint:UpdateEmailTemplate"),
    /** Action for the UpdateEndpoint operation. */
    UpdateEndpoint("pinpoint:UpdateEndpoint"),
    /** Action for the UpdateEndpointsBatch operation. */
    UpdateEndpointsBatch("pinpoint:UpdateEndpointsBatch"),
    /** Action for the UpdateGcmChannel operation. */
    UpdateGcmChannel("pinpoint:UpdateGcmChannel"),
    /** Action for the UpdateJourney operation. */
    UpdateJourney("pinpoint:UpdateJourney"),
    /** Action for the UpdateJourneyState operation. */
    UpdateJourneyState("pinpoint:UpdateJourneyState"),
    /** Action for the UpdatePushTemplate operation. */
    UpdatePushTemplate("pinpoint:UpdatePushTemplate"),
    /** Action for the UpdateRecommenderConfiguration operation. */
    UpdateRecommenderConfiguration("pinpoint:UpdateRecommenderConfiguration"),
    /** Action for the UpdateSegment operation. */
    UpdateSegment("pinpoint:UpdateSegment"),
    /** Action for the UpdateSmsChannel operation. */
    UpdateSmsChannel("pinpoint:UpdateSmsChannel"),
    /** Action for the UpdateSmsTemplate operation. */
    UpdateSmsTemplate("pinpoint:UpdateSmsTemplate"),
    /** Action for the UpdateTemplateActiveVersion operation. */
    UpdateTemplateActiveVersion("pinpoint:UpdateTemplateActiveVersion"),
    /** Action for the UpdateVoiceChannel operation. */
    UpdateVoiceChannel("pinpoint:UpdateVoiceChannel"),
    /** Action for the UpdateVoiceTemplate operation. */
    UpdateVoiceTemplate("pinpoint:UpdateVoiceTemplate"),

    ;

    private final String action;

    private PinpointActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
