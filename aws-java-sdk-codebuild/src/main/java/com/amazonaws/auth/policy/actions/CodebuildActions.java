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
 * The available AWS access control policy actions for AWS CodeBuild.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum CodebuildActions implements Action {

    /** Represents any action executed on AWS CodeBuild. */
    AllCodebuildActions("codebuild:*"),

    /** Action for the BatchDeleteBuilds operation. */
    BatchDeleteBuilds("codebuild:BatchDeleteBuilds"),
    /** Action for the BatchGetBuilds operation. */
    BatchGetBuilds("codebuild:BatchGetBuilds"),
    /** Action for the BatchGetProjects operation. */
    BatchGetProjects("codebuild:BatchGetProjects"),
    /** Action for the BatchGetReportGroups operation. */
    BatchGetReportGroups("codebuild:BatchGetReportGroups"),
    /** Action for the BatchGetReports operation. */
    BatchGetReports("codebuild:BatchGetReports"),
    /** Action for the CreateProject operation. */
    CreateProject("codebuild:CreateProject"),
    /** Action for the CreateReportGroup operation. */
    CreateReportGroup("codebuild:CreateReportGroup"),
    /** Action for the CreateWebhook operation. */
    CreateWebhook("codebuild:CreateWebhook"),
    /** Action for the DeleteProject operation. */
    DeleteProject("codebuild:DeleteProject"),
    /** Action for the DeleteReport operation. */
    DeleteReport("codebuild:DeleteReport"),
    /** Action for the DeleteReportGroup operation. */
    DeleteReportGroup("codebuild:DeleteReportGroup"),
    /** Action for the DeleteResourcePolicy operation. */
    DeleteResourcePolicy("codebuild:DeleteResourcePolicy"),
    /** Action for the DeleteSourceCredentials operation. */
    DeleteSourceCredentials("codebuild:DeleteSourceCredentials"),
    /** Action for the DeleteWebhook operation. */
    DeleteWebhook("codebuild:DeleteWebhook"),
    /** Action for the DescribeTestCases operation. */
    DescribeTestCases("codebuild:DescribeTestCases"),
    /** Action for the GetResourcePolicy operation. */
    GetResourcePolicy("codebuild:GetResourcePolicy"),
    /** Action for the ImportSourceCredentials operation. */
    ImportSourceCredentials("codebuild:ImportSourceCredentials"),
    /** Action for the InvalidateProjectCache operation. */
    InvalidateProjectCache("codebuild:InvalidateProjectCache"),
    /** Action for the ListBuilds operation. */
    ListBuilds("codebuild:ListBuilds"),
    /** Action for the ListBuildsForProject operation. */
    ListBuildsForProject("codebuild:ListBuildsForProject"),
    /** Action for the ListCuratedEnvironmentImages operation. */
    ListCuratedEnvironmentImages("codebuild:ListCuratedEnvironmentImages"),
    /** Action for the ListProjects operation. */
    ListProjects("codebuild:ListProjects"),
    /** Action for the ListReportGroups operation. */
    ListReportGroups("codebuild:ListReportGroups"),
    /** Action for the ListReports operation. */
    ListReports("codebuild:ListReports"),
    /** Action for the ListReportsForReportGroup operation. */
    ListReportsForReportGroup("codebuild:ListReportsForReportGroup"),
    /** Action for the ListSharedProjects operation. */
    ListSharedProjects("codebuild:ListSharedProjects"),
    /** Action for the ListSharedReportGroups operation. */
    ListSharedReportGroups("codebuild:ListSharedReportGroups"),
    /** Action for the ListSourceCredentials operation. */
    ListSourceCredentials("codebuild:ListSourceCredentials"),
    /** Action for the PutResourcePolicy operation. */
    PutResourcePolicy("codebuild:PutResourcePolicy"),
    /** Action for the StartBuild operation. */
    StartBuild("codebuild:StartBuild"),
    /** Action for the StopBuild operation. */
    StopBuild("codebuild:StopBuild"),
    /** Action for the UpdateProject operation. */
    UpdateProject("codebuild:UpdateProject"),
    /** Action for the UpdateReportGroup operation. */
    UpdateReportGroup("codebuild:UpdateReportGroup"),
    /** Action for the UpdateWebhook operation. */
    UpdateWebhook("codebuild:UpdateWebhook"),

    ;

    private final String action;

    private CodebuildActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
