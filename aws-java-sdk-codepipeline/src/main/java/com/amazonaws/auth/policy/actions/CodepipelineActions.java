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
 * The available AWS access control policy actions for CodePipeline.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum CodepipelineActions implements Action {

    /** Represents any action executed on CodePipeline. */
    AllCodepipelineActions("codepipeline:*"),

    /** Action for the AcknowledgeJob operation. */
    AcknowledgeJob("codepipeline:AcknowledgeJob"),
    /** Action for the AcknowledgeThirdPartyJob operation. */
    AcknowledgeThirdPartyJob("codepipeline:AcknowledgeThirdPartyJob"),
    /** Action for the CreateCustomActionType operation. */
    CreateCustomActionType("codepipeline:CreateCustomActionType"),
    /** Action for the CreatePipeline operation. */
    CreatePipeline("codepipeline:CreatePipeline"),
    /** Action for the DeleteCustomActionType operation. */
    DeleteCustomActionType("codepipeline:DeleteCustomActionType"),
    /** Action for the DeletePipeline operation. */
    DeletePipeline("codepipeline:DeletePipeline"),
    /** Action for the DeleteWebhook operation. */
    DeleteWebhook("codepipeline:DeleteWebhook"),
    /** Action for the DeregisterWebhookWithThirdParty operation. */
    DeregisterWebhookWithThirdParty("codepipeline:DeregisterWebhookWithThirdParty"),
    /** Action for the DisableStageTransition operation. */
    DisableStageTransition("codepipeline:DisableStageTransition"),
    /** Action for the EnableStageTransition operation. */
    EnableStageTransition("codepipeline:EnableStageTransition"),
    /** Action for the GetJobDetails operation. */
    GetJobDetails("codepipeline:GetJobDetails"),
    /** Action for the GetPipeline operation. */
    GetPipeline("codepipeline:GetPipeline"),
    /** Action for the GetPipelineExecution operation. */
    GetPipelineExecution("codepipeline:GetPipelineExecution"),
    /** Action for the GetPipelineState operation. */
    GetPipelineState("codepipeline:GetPipelineState"),
    /** Action for the GetThirdPartyJobDetails operation. */
    GetThirdPartyJobDetails("codepipeline:GetThirdPartyJobDetails"),
    /** Action for the ListActionExecutions operation. */
    ListActionExecutions("codepipeline:ListActionExecutions"),
    /** Action for the ListActionTypes operation. */
    ListActionTypes("codepipeline:ListActionTypes"),
    /** Action for the ListPipelineExecutions operation. */
    ListPipelineExecutions("codepipeline:ListPipelineExecutions"),
    /** Action for the ListPipelines operation. */
    ListPipelines("codepipeline:ListPipelines"),
    /** Action for the ListWebhooks operation. */
    ListWebhooks("codepipeline:ListWebhooks"),
    /** Action for the PollForJobs operation. */
    PollForJobs("codepipeline:PollForJobs"),
    /** Action for the PollForThirdPartyJobs operation. */
    PollForThirdPartyJobs("codepipeline:PollForThirdPartyJobs"),
    /** Action for the PutActionRevision operation. */
    PutActionRevision("codepipeline:PutActionRevision"),
    /** Action for the PutApprovalResult operation. */
    PutApprovalResult("codepipeline:PutApprovalResult"),
    /** Action for the PutJobFailureResult operation. */
    PutJobFailureResult("codepipeline:PutJobFailureResult"),
    /** Action for the PutJobSuccessResult operation. */
    PutJobSuccessResult("codepipeline:PutJobSuccessResult"),
    /** Action for the PutThirdPartyJobFailureResult operation. */
    PutThirdPartyJobFailureResult("codepipeline:PutThirdPartyJobFailureResult"),
    /** Action for the PutThirdPartyJobSuccessResult operation. */
    PutThirdPartyJobSuccessResult("codepipeline:PutThirdPartyJobSuccessResult"),
    /** Action for the PutWebhook operation. */
    PutWebhook("codepipeline:PutWebhook"),
    /** Action for the RegisterWebhookWithThirdParty operation. */
    RegisterWebhookWithThirdParty("codepipeline:RegisterWebhookWithThirdParty"),
    /** Action for the RetryStageExecution operation. */
    RetryStageExecution("codepipeline:RetryStageExecution"),
    /** Action for the StartPipelineExecution operation. */
    StartPipelineExecution("codepipeline:StartPipelineExecution"),
    /** Action for the UpdatePipeline operation. */
    UpdatePipeline("codepipeline:UpdatePipeline"),

    ;

    private final String action;

    private CodepipelineActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
