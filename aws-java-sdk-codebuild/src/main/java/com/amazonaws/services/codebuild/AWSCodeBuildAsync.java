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
package com.amazonaws.services.codebuild;

import javax.annotation.Generated;

import com.amazonaws.services.codebuild.model.*;

/**
 * Interface for accessing AWS CodeBuild asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.codebuild.AbstractAWSCodeBuildAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS CodeBuild</fullname>
 * <p>
 * AWS CodeBuild is a fully managed build service in the cloud. AWS CodeBuild compiles your source code, runs unit
 * tests, and produces artifacts that are ready to deploy. AWS CodeBuild eliminates the need to provision, manage, and
 * scale your own build servers. It provides prepackaged build environments for the most popular programming languages
 * and build tools, such as Apache Maven, Gradle, and more. You can also fully customize build environments in AWS
 * CodeBuild to use your own build tools. AWS CodeBuild scales automatically to meet peak build requests. You pay only
 * for the build time you consume. For more information about AWS CodeBuild, see the <i> <a
 * href="https://docs.aws.amazon.com/codebuild/latest/userguide/welcome.html">AWS CodeBuild User Guide</a>.</i>
 * </p>
 * <p>
 * AWS CodeBuild supports these operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>BatchDeleteBuilds</code>: Deletes one or more builds.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>BatchGetBuilds</code>: Gets information about one or more builds.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>BatchGetProjects</code>: Gets information about one or more build projects. A <i>build project</i> defines how
 * AWS CodeBuild runs a build. This includes information such as where to get the source code to build, the build
 * environment to use, the build commands to run, and where to store the build output. A <i>build environment</i> is a
 * representation of operating system, programming language runtime, and tools that AWS CodeBuild uses to run a build.
 * You can add tags to build projects to help manage your resources and costs.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>BatchGetReportGroups</code>: Returns an array of report groups.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>BatchGetReports</code>: Returns an array of reports.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CreateProject</code>: Creates a build project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CreateReportGroup</code>: Creates a report group. A report group contains a collection of reports.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CreateWebhook</code>: For an existing AWS CodeBuild build project that has its source code stored in a GitHub
 * or Bitbucket repository, enables AWS CodeBuild to start rebuilding the source code every time a code change is pushed
 * to the repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteProject</code>: Deletes a build project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteReport</code>: Deletes a report.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteReportGroup</code>: Deletes a report group.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteResourcePolicy</code>: Deletes a resource policy that is identified by its resource ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteSourceCredentials</code>: Deletes a set of GitHub, GitHub Enterprise, or Bitbucket source credentials.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteWebhook</code>: For an existing AWS CodeBuild build project that has its source code stored in a GitHub
 * or Bitbucket repository, stops AWS CodeBuild from rebuilding the source code every time a code change is pushed to
 * the repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribeTestCases</code>: Returns a list of details about test cases for a report.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>GetResourcePolicy</code>: Gets a resource policy that is identified by its resource ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ImportSourceCredentials</code>: Imports the source repository credentials for an AWS CodeBuild project that has
 * its source code stored in a GitHub, GitHub Enterprise, or Bitbucket repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>InvalidateProjectCache</code>: Resets the cache for a project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListBuilds</code>: Gets a list of build IDs, with each build ID representing a single build.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListBuildsForProject</code>: Gets a list of build IDs for the specified build project, with each build ID
 * representing a single build.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListCuratedEnvironmentImages</code>: Gets information about Docker images that are managed by AWS CodeBuild.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListProjects</code>: Gets a list of build project names, with each build project name representing a single
 * build project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListReportGroups</code>: Gets a list ARNs for the report groups in the current AWS account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListReports</code>: Gets a list ARNs for the reports in the current AWS account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListReportsForReportGroup</code>: Returns a list of ARNs for the reports that belong to a
 * <code>ReportGroup</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListSharedProjects</code>: Gets a list of ARNs associated with projects shared with the current AWS account or
 * user.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListSharedReportGroups</code>: Gets a list of ARNs associated with report groups shared with the current AWS
 * account or user
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListSourceCredentials</code>: Returns a list of <code>SourceCredentialsInfo</code> objects. Each
 * <code>SourceCredentialsInfo</code> object includes the authentication type, token ARN, and type of source provider
 * for one set of credentials.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>PutResourcePolicy</code>: Stores a resource policy for the ARN of a <code>Project</code> or
 * <code>ReportGroup</code> object.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>StartBuild</code>: Starts running a build.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>StopBuild</code>: Attempts to stop running a build.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateProject</code>: Changes the settings of an existing build project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateReportGroup</code>: Changes a report group.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateWebhook</code>: Changes the settings of an existing webhook.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSCodeBuildAsync extends AWSCodeBuild {

    /**
     * <p>
     * Deletes one or more builds.
     * </p>
     * 
     * @param batchDeleteBuildsRequest
     * @return A Java Future containing the result of the BatchDeleteBuilds operation returned by the service.
     * @sample AWSCodeBuildAsync.BatchDeleteBuilds
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/BatchDeleteBuilds" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteBuildsResult> batchDeleteBuildsAsync(BatchDeleteBuildsRequest batchDeleteBuildsRequest);

    /**
     * <p>
     * Deletes one or more builds.
     * </p>
     * 
     * @param batchDeleteBuildsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDeleteBuilds operation returned by the service.
     * @sample AWSCodeBuildAsyncHandler.BatchDeleteBuilds
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/BatchDeleteBuilds" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteBuildsResult> batchDeleteBuildsAsync(BatchDeleteBuildsRequest batchDeleteBuildsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDeleteBuildsRequest, BatchDeleteBuildsResult> asyncHandler);

    /**
     * <p>
     * Gets information about one or more builds.
     * </p>
     * 
     * @param batchGetBuildsRequest
     * @return A Java Future containing the result of the BatchGetBuilds operation returned by the service.
     * @sample AWSCodeBuildAsync.BatchGetBuilds
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/BatchGetBuilds" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetBuildsResult> batchGetBuildsAsync(BatchGetBuildsRequest batchGetBuildsRequest);

    /**
     * <p>
     * Gets information about one or more builds.
     * </p>
     * 
     * @param batchGetBuildsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetBuilds operation returned by the service.
     * @sample AWSCodeBuildAsyncHandler.BatchGetBuilds
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/BatchGetBuilds" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetBuildsResult> batchGetBuildsAsync(BatchGetBuildsRequest batchGetBuildsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetBuildsRequest, BatchGetBuildsResult> asyncHandler);

    /**
     * <p>
     * Gets information about one or more build projects.
     * </p>
     * 
     * @param batchGetProjectsRequest
     * @return A Java Future containing the result of the BatchGetProjects operation returned by the service.
     * @sample AWSCodeBuildAsync.BatchGetProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/BatchGetProjects" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetProjectsResult> batchGetProjectsAsync(BatchGetProjectsRequest batchGetProjectsRequest);

    /**
     * <p>
     * Gets information about one or more build projects.
     * </p>
     * 
     * @param batchGetProjectsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetProjects operation returned by the service.
     * @sample AWSCodeBuildAsyncHandler.BatchGetProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/BatchGetProjects" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetProjectsResult> batchGetProjectsAsync(BatchGetProjectsRequest batchGetProjectsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetProjectsRequest, BatchGetProjectsResult> asyncHandler);

    /**
     * <p>
     * Returns an array of report groups.
     * </p>
     * 
     * @param batchGetReportGroupsRequest
     * @return A Java Future containing the result of the BatchGetReportGroups operation returned by the service.
     * @sample AWSCodeBuildAsync.BatchGetReportGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/BatchGetReportGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetReportGroupsResult> batchGetReportGroupsAsync(BatchGetReportGroupsRequest batchGetReportGroupsRequest);

    /**
     * <p>
     * Returns an array of report groups.
     * </p>
     * 
     * @param batchGetReportGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetReportGroups operation returned by the service.
     * @sample AWSCodeBuildAsyncHandler.BatchGetReportGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/BatchGetReportGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetReportGroupsResult> batchGetReportGroupsAsync(BatchGetReportGroupsRequest batchGetReportGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetReportGroupsRequest, BatchGetReportGroupsResult> asyncHandler);

    /**
     * <p>
     * Returns an array of reports.
     * </p>
     * 
     * @param batchGetReportsRequest
     * @return A Java Future containing the result of the BatchGetReports operation returned by the service.
     * @sample AWSCodeBuildAsync.BatchGetReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/BatchGetReports" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetReportsResult> batchGetReportsAsync(BatchGetReportsRequest batchGetReportsRequest);

    /**
     * <p>
     * Returns an array of reports.
     * </p>
     * 
     * @param batchGetReportsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetReports operation returned by the service.
     * @sample AWSCodeBuildAsyncHandler.BatchGetReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/BatchGetReports" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetReportsResult> batchGetReportsAsync(BatchGetReportsRequest batchGetReportsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetReportsRequest, BatchGetReportsResult> asyncHandler);

    /**
     * <p>
     * Creates a build project.
     * </p>
     * 
     * @param createProjectRequest
     * @return A Java Future containing the result of the CreateProject operation returned by the service.
     * @sample AWSCodeBuildAsync.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/CreateProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest createProjectRequest);

    /**
     * <p>
     * Creates a build project.
     * </p>
     * 
     * @param createProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProject operation returned by the service.
     * @sample AWSCodeBuildAsyncHandler.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/CreateProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest createProjectRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProjectRequest, CreateProjectResult> asyncHandler);

    /**
     * <p>
     * Creates a report group. A report group contains a collection of reports.
     * </p>
     * 
     * @param createReportGroupRequest
     * @return A Java Future containing the result of the CreateReportGroup operation returned by the service.
     * @sample AWSCodeBuildAsync.CreateReportGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/CreateReportGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateReportGroupResult> createReportGroupAsync(CreateReportGroupRequest createReportGroupRequest);

    /**
     * <p>
     * Creates a report group. A report group contains a collection of reports.
     * </p>
     * 
     * @param createReportGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateReportGroup operation returned by the service.
     * @sample AWSCodeBuildAsyncHandler.CreateReportGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/CreateReportGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateReportGroupResult> createReportGroupAsync(CreateReportGroupRequest createReportGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateReportGroupRequest, CreateReportGroupResult> asyncHandler);

    /**
     * <p>
     * For an existing AWS CodeBuild build project that has its source code stored in a GitHub or Bitbucket repository,
     * enables AWS CodeBuild to start rebuilding the source code every time a code change is pushed to the repository.
     * </p>
     * <important>
     * <p>
     * If you enable webhooks for an AWS CodeBuild project, and the project is used as a build step in AWS CodePipeline,
     * then two identical builds are created for each commit. One build is triggered through webhooks, and one through
     * AWS CodePipeline. Because billing is on a per-build basis, you are billed for both builds. Therefore, if you are
     * using AWS CodePipeline, we recommend that you disable webhooks in AWS CodeBuild. In the AWS CodeBuild console,
     * clear the Webhook box. For more information, see step 5 in <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/change-project.html#change-project-console">Change a
     * Build Project's Settings</a>.
     * </p>
     * </important>
     * 
     * @param createWebhookRequest
     * @return A Java Future containing the result of the CreateWebhook operation returned by the service.
     * @sample AWSCodeBuildAsync.CreateWebhook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/CreateWebhook" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWebhookResult> createWebhookAsync(CreateWebhookRequest createWebhookRequest);

    /**
     * <p>
     * For an existing AWS CodeBuild build project that has its source code stored in a GitHub or Bitbucket repository,
     * enables AWS CodeBuild to start rebuilding the source code every time a code change is pushed to the repository.
     * </p>
     * <important>
     * <p>
     * If you enable webhooks for an AWS CodeBuild project, and the project is used as a build step in AWS CodePipeline,
     * then two identical builds are created for each commit. One build is triggered through webhooks, and one through
     * AWS CodePipeline. Because billing is on a per-build basis, you are billed for both builds. Therefore, if you are
     * using AWS CodePipeline, we recommend that you disable webhooks in AWS CodeBuild. In the AWS CodeBuild console,
     * clear the Webhook box. For more information, see step 5 in <a
     * href="https://docs.aws.amazon.com/codebuild/latest/userguide/change-project.html#change-project-console">Change a
     * Build Project's Settings</a>.
     * </p>
     * </important>
     * 
     * @param createWebhookRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWebhook operation returned by the service.
     * @sample AWSCodeBuildAsyncHandler.CreateWebhook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/CreateWebhook" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWebhookResult> createWebhookAsync(CreateWebhookRequest createWebhookRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWebhookRequest, CreateWebhookResult> asyncHandler);

    /**
     * <p>
     * Deletes a build project. When you delete a project, its builds are not deleted.
     * </p>
     * 
     * @param deleteProjectRequest
     * @return A Java Future containing the result of the DeleteProject operation returned by the service.
     * @sample AWSCodeBuildAsync.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/DeleteProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest deleteProjectRequest);

    /**
     * <p>
     * Deletes a build project. When you delete a project, its builds are not deleted.
     * </p>
     * 
     * @param deleteProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProject operation returned by the service.
     * @sample AWSCodeBuildAsyncHandler.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/DeleteProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest deleteProjectRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProjectRequest, DeleteProjectResult> asyncHandler);

    /**
     * <p>
     * Deletes a report.
     * </p>
     * 
     * @param deleteReportRequest
     * @return A Java Future containing the result of the DeleteReport operation returned by the service.
     * @sample AWSCodeBuildAsync.DeleteReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/DeleteReport" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteReportResult> deleteReportAsync(DeleteReportRequest deleteReportRequest);

    /**
     * <p>
     * Deletes a report.
     * </p>
     * 
     * @param deleteReportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteReport operation returned by the service.
     * @sample AWSCodeBuildAsyncHandler.DeleteReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/DeleteReport" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteReportResult> deleteReportAsync(DeleteReportRequest deleteReportRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteReportRequest, DeleteReportResult> asyncHandler);

    /**
     * <p>
     * <code>DeleteReportGroup</code>: Deletes a report group. Before you delete a report group, you must delete its
     * reports. Use <a
     * href="https://docs.aws.amazon.com/codebuild/latest/APIReference/API_ListReportsForReportGroup.html"
     * >ListReportsForReportGroup</a> to get the reports in a report group. Use <a
     * href="https://docs.aws.amazon.com/codebuild/latest/APIReference/API_DeleteReport.html">DeleteReport</a> to delete
     * the reports. If you call <code>DeleteReportGroup</code> for a report group that contains one or more reports, an
     * exception is thrown.
     * </p>
     * 
     * @param deleteReportGroupRequest
     * @return A Java Future containing the result of the DeleteReportGroup operation returned by the service.
     * @sample AWSCodeBuildAsync.DeleteReportGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/DeleteReportGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteReportGroupResult> deleteReportGroupAsync(DeleteReportGroupRequest deleteReportGroupRequest);

    /**
     * <p>
     * <code>DeleteReportGroup</code>: Deletes a report group. Before you delete a report group, you must delete its
     * reports. Use <a
     * href="https://docs.aws.amazon.com/codebuild/latest/APIReference/API_ListReportsForReportGroup.html"
     * >ListReportsForReportGroup</a> to get the reports in a report group. Use <a
     * href="https://docs.aws.amazon.com/codebuild/latest/APIReference/API_DeleteReport.html">DeleteReport</a> to delete
     * the reports. If you call <code>DeleteReportGroup</code> for a report group that contains one or more reports, an
     * exception is thrown.
     * </p>
     * 
     * @param deleteReportGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteReportGroup operation returned by the service.
     * @sample AWSCodeBuildAsyncHandler.DeleteReportGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/DeleteReportGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteReportGroupResult> deleteReportGroupAsync(DeleteReportGroupRequest deleteReportGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteReportGroupRequest, DeleteReportGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes a resource policy that is identified by its resource ARN.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return A Java Future containing the result of the DeleteResourcePolicy operation returned by the service.
     * @sample AWSCodeBuildAsync.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/DeleteResourcePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest deleteResourcePolicyRequest);

    /**
     * <p>
     * Deletes a resource policy that is identified by its resource ARN.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteResourcePolicy operation returned by the service.
     * @sample AWSCodeBuildAsyncHandler.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/DeleteResourcePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest deleteResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteResourcePolicyRequest, DeleteResourcePolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes a set of GitHub, GitHub Enterprise, or Bitbucket source credentials.
     * </p>
     * 
     * @param deleteSourceCredentialsRequest
     * @return A Java Future containing the result of the DeleteSourceCredentials operation returned by the service.
     * @sample AWSCodeBuildAsync.DeleteSourceCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/DeleteSourceCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSourceCredentialsResult> deleteSourceCredentialsAsync(DeleteSourceCredentialsRequest deleteSourceCredentialsRequest);

    /**
     * <p>
     * Deletes a set of GitHub, GitHub Enterprise, or Bitbucket source credentials.
     * </p>
     * 
     * @param deleteSourceCredentialsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSourceCredentials operation returned by the service.
     * @sample AWSCodeBuildAsyncHandler.DeleteSourceCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/DeleteSourceCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSourceCredentialsResult> deleteSourceCredentialsAsync(DeleteSourceCredentialsRequest deleteSourceCredentialsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSourceCredentialsRequest, DeleteSourceCredentialsResult> asyncHandler);

    /**
     * <p>
     * For an existing AWS CodeBuild build project that has its source code stored in a GitHub or Bitbucket repository,
     * stops AWS CodeBuild from rebuilding the source code every time a code change is pushed to the repository.
     * </p>
     * 
     * @param deleteWebhookRequest
     * @return A Java Future containing the result of the DeleteWebhook operation returned by the service.
     * @sample AWSCodeBuildAsync.DeleteWebhook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/DeleteWebhook" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWebhookResult> deleteWebhookAsync(DeleteWebhookRequest deleteWebhookRequest);

    /**
     * <p>
     * For an existing AWS CodeBuild build project that has its source code stored in a GitHub or Bitbucket repository,
     * stops AWS CodeBuild from rebuilding the source code every time a code change is pushed to the repository.
     * </p>
     * 
     * @param deleteWebhookRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWebhook operation returned by the service.
     * @sample AWSCodeBuildAsyncHandler.DeleteWebhook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/DeleteWebhook" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWebhookResult> deleteWebhookAsync(DeleteWebhookRequest deleteWebhookRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWebhookRequest, DeleteWebhookResult> asyncHandler);

    /**
     * <p>
     * Returns a list of details about test cases for a report.
     * </p>
     * 
     * @param describeTestCasesRequest
     * @return A Java Future containing the result of the DescribeTestCases operation returned by the service.
     * @sample AWSCodeBuildAsync.DescribeTestCases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/DescribeTestCases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTestCasesResult> describeTestCasesAsync(DescribeTestCasesRequest describeTestCasesRequest);

    /**
     * <p>
     * Returns a list of details about test cases for a report.
     * </p>
     * 
     * @param describeTestCasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTestCases operation returned by the service.
     * @sample AWSCodeBuildAsyncHandler.DescribeTestCases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/DescribeTestCases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTestCasesResult> describeTestCasesAsync(DescribeTestCasesRequest describeTestCasesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTestCasesRequest, DescribeTestCasesResult> asyncHandler);

    /**
     * <p>
     * Gets a resource policy that is identified by its resource ARN.
     * </p>
     * 
     * @param getResourcePolicyRequest
     * @return A Java Future containing the result of the GetResourcePolicy operation returned by the service.
     * @sample AWSCodeBuildAsync.GetResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/GetResourcePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetResourcePolicyResult> getResourcePolicyAsync(GetResourcePolicyRequest getResourcePolicyRequest);

    /**
     * <p>
     * Gets a resource policy that is identified by its resource ARN.
     * </p>
     * 
     * @param getResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResourcePolicy operation returned by the service.
     * @sample AWSCodeBuildAsyncHandler.GetResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/GetResourcePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetResourcePolicyResult> getResourcePolicyAsync(GetResourcePolicyRequest getResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourcePolicyRequest, GetResourcePolicyResult> asyncHandler);

    /**
     * <p>
     * Imports the source repository credentials for an AWS CodeBuild project that has its source code stored in a
     * GitHub, GitHub Enterprise, or Bitbucket repository.
     * </p>
     * 
     * @param importSourceCredentialsRequest
     * @return A Java Future containing the result of the ImportSourceCredentials operation returned by the service.
     * @sample AWSCodeBuildAsync.ImportSourceCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ImportSourceCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ImportSourceCredentialsResult> importSourceCredentialsAsync(ImportSourceCredentialsRequest importSourceCredentialsRequest);

    /**
     * <p>
     * Imports the source repository credentials for an AWS CodeBuild project that has its source code stored in a
     * GitHub, GitHub Enterprise, or Bitbucket repository.
     * </p>
     * 
     * @param importSourceCredentialsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportSourceCredentials operation returned by the service.
     * @sample AWSCodeBuildAsyncHandler.ImportSourceCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ImportSourceCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ImportSourceCredentialsResult> importSourceCredentialsAsync(ImportSourceCredentialsRequest importSourceCredentialsRequest,
            com.amazonaws.handlers.AsyncHandler<ImportSourceCredentialsRequest, ImportSourceCredentialsResult> asyncHandler);

    /**
     * <p>
     * Resets the cache for a project.
     * </p>
     * 
     * @param invalidateProjectCacheRequest
     * @return A Java Future containing the result of the InvalidateProjectCache operation returned by the service.
     * @sample AWSCodeBuildAsync.InvalidateProjectCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/InvalidateProjectCache"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<InvalidateProjectCacheResult> invalidateProjectCacheAsync(InvalidateProjectCacheRequest invalidateProjectCacheRequest);

    /**
     * <p>
     * Resets the cache for a project.
     * </p>
     * 
     * @param invalidateProjectCacheRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the InvalidateProjectCache operation returned by the service.
     * @sample AWSCodeBuildAsyncHandler.InvalidateProjectCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/InvalidateProjectCache"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<InvalidateProjectCacheResult> invalidateProjectCacheAsync(InvalidateProjectCacheRequest invalidateProjectCacheRequest,
            com.amazonaws.handlers.AsyncHandler<InvalidateProjectCacheRequest, InvalidateProjectCacheResult> asyncHandler);

    /**
     * <p>
     * Gets a list of build IDs, with each build ID representing a single build.
     * </p>
     * 
     * @param listBuildsRequest
     * @return A Java Future containing the result of the ListBuilds operation returned by the service.
     * @sample AWSCodeBuildAsync.ListBuilds
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListBuilds" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBuildsResult> listBuildsAsync(ListBuildsRequest listBuildsRequest);

    /**
     * <p>
     * Gets a list of build IDs, with each build ID representing a single build.
     * </p>
     * 
     * @param listBuildsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBuilds operation returned by the service.
     * @sample AWSCodeBuildAsyncHandler.ListBuilds
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListBuilds" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBuildsResult> listBuildsAsync(ListBuildsRequest listBuildsRequest,
            com.amazonaws.handlers.AsyncHandler<ListBuildsRequest, ListBuildsResult> asyncHandler);

    /**
     * <p>
     * Gets a list of build IDs for the specified build project, with each build ID representing a single build.
     * </p>
     * 
     * @param listBuildsForProjectRequest
     * @return A Java Future containing the result of the ListBuildsForProject operation returned by the service.
     * @sample AWSCodeBuildAsync.ListBuildsForProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListBuildsForProject" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListBuildsForProjectResult> listBuildsForProjectAsync(ListBuildsForProjectRequest listBuildsForProjectRequest);

    /**
     * <p>
     * Gets a list of build IDs for the specified build project, with each build ID representing a single build.
     * </p>
     * 
     * @param listBuildsForProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBuildsForProject operation returned by the service.
     * @sample AWSCodeBuildAsyncHandler.ListBuildsForProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListBuildsForProject" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListBuildsForProjectResult> listBuildsForProjectAsync(ListBuildsForProjectRequest listBuildsForProjectRequest,
            com.amazonaws.handlers.AsyncHandler<ListBuildsForProjectRequest, ListBuildsForProjectResult> asyncHandler);

    /**
     * <p>
     * Gets information about Docker images that are managed by AWS CodeBuild.
     * </p>
     * 
     * @param listCuratedEnvironmentImagesRequest
     * @return A Java Future containing the result of the ListCuratedEnvironmentImages operation returned by the
     *         service.
     * @sample AWSCodeBuildAsync.ListCuratedEnvironmentImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListCuratedEnvironmentImages"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCuratedEnvironmentImagesResult> listCuratedEnvironmentImagesAsync(
            ListCuratedEnvironmentImagesRequest listCuratedEnvironmentImagesRequest);

    /**
     * <p>
     * Gets information about Docker images that are managed by AWS CodeBuild.
     * </p>
     * 
     * @param listCuratedEnvironmentImagesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCuratedEnvironmentImages operation returned by the
     *         service.
     * @sample AWSCodeBuildAsyncHandler.ListCuratedEnvironmentImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListCuratedEnvironmentImages"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCuratedEnvironmentImagesResult> listCuratedEnvironmentImagesAsync(
            ListCuratedEnvironmentImagesRequest listCuratedEnvironmentImagesRequest,
            com.amazonaws.handlers.AsyncHandler<ListCuratedEnvironmentImagesRequest, ListCuratedEnvironmentImagesResult> asyncHandler);

    /**
     * <p>
     * Gets a list of build project names, with each build project name representing a single build project.
     * </p>
     * 
     * @param listProjectsRequest
     * @return A Java Future containing the result of the ListProjects operation returned by the service.
     * @sample AWSCodeBuildAsync.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListProjects" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest listProjectsRequest);

    /**
     * <p>
     * Gets a list of build project names, with each build project name representing a single build project.
     * </p>
     * 
     * @param listProjectsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProjects operation returned by the service.
     * @sample AWSCodeBuildAsyncHandler.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListProjects" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest listProjectsRequest,
            com.amazonaws.handlers.AsyncHandler<ListProjectsRequest, ListProjectsResult> asyncHandler);

    /**
     * <p>
     * Gets a list ARNs for the report groups in the current AWS account.
     * </p>
     * 
     * @param listReportGroupsRequest
     * @return A Java Future containing the result of the ListReportGroups operation returned by the service.
     * @sample AWSCodeBuildAsync.ListReportGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListReportGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListReportGroupsResult> listReportGroupsAsync(ListReportGroupsRequest listReportGroupsRequest);

    /**
     * <p>
     * Gets a list ARNs for the report groups in the current AWS account.
     * </p>
     * 
     * @param listReportGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListReportGroups operation returned by the service.
     * @sample AWSCodeBuildAsyncHandler.ListReportGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListReportGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListReportGroupsResult> listReportGroupsAsync(ListReportGroupsRequest listReportGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListReportGroupsRequest, ListReportGroupsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of ARNs for the reports in the current AWS account.
     * </p>
     * 
     * @param listReportsRequest
     * @return A Java Future containing the result of the ListReports operation returned by the service.
     * @sample AWSCodeBuildAsync.ListReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListReports" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListReportsResult> listReportsAsync(ListReportsRequest listReportsRequest);

    /**
     * <p>
     * Returns a list of ARNs for the reports in the current AWS account.
     * </p>
     * 
     * @param listReportsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListReports operation returned by the service.
     * @sample AWSCodeBuildAsyncHandler.ListReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListReports" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListReportsResult> listReportsAsync(ListReportsRequest listReportsRequest,
            com.amazonaws.handlers.AsyncHandler<ListReportsRequest, ListReportsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of ARNs for the reports that belong to a <code>ReportGroup</code>.
     * </p>
     * 
     * @param listReportsForReportGroupRequest
     * @return A Java Future containing the result of the ListReportsForReportGroup operation returned by the service.
     * @sample AWSCodeBuildAsync.ListReportsForReportGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListReportsForReportGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListReportsForReportGroupResult> listReportsForReportGroupAsync(
            ListReportsForReportGroupRequest listReportsForReportGroupRequest);

    /**
     * <p>
     * Returns a list of ARNs for the reports that belong to a <code>ReportGroup</code>.
     * </p>
     * 
     * @param listReportsForReportGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListReportsForReportGroup operation returned by the service.
     * @sample AWSCodeBuildAsyncHandler.ListReportsForReportGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListReportsForReportGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListReportsForReportGroupResult> listReportsForReportGroupAsync(
            ListReportsForReportGroupRequest listReportsForReportGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ListReportsForReportGroupRequest, ListReportsForReportGroupResult> asyncHandler);

    /**
     * <p>
     * Gets a list of projects that are shared with other AWS accounts or users.
     * </p>
     * 
     * @param listSharedProjectsRequest
     * @return A Java Future containing the result of the ListSharedProjects operation returned by the service.
     * @sample AWSCodeBuildAsync.ListSharedProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListSharedProjects" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSharedProjectsResult> listSharedProjectsAsync(ListSharedProjectsRequest listSharedProjectsRequest);

    /**
     * <p>
     * Gets a list of projects that are shared with other AWS accounts or users.
     * </p>
     * 
     * @param listSharedProjectsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSharedProjects operation returned by the service.
     * @sample AWSCodeBuildAsyncHandler.ListSharedProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListSharedProjects" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSharedProjectsResult> listSharedProjectsAsync(ListSharedProjectsRequest listSharedProjectsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSharedProjectsRequest, ListSharedProjectsResult> asyncHandler);

    /**
     * <p>
     * Gets a list of report groups that are shared with other AWS accounts or users.
     * </p>
     * 
     * @param listSharedReportGroupsRequest
     * @return A Java Future containing the result of the ListSharedReportGroups operation returned by the service.
     * @sample AWSCodeBuildAsync.ListSharedReportGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListSharedReportGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSharedReportGroupsResult> listSharedReportGroupsAsync(ListSharedReportGroupsRequest listSharedReportGroupsRequest);

    /**
     * <p>
     * Gets a list of report groups that are shared with other AWS accounts or users.
     * </p>
     * 
     * @param listSharedReportGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSharedReportGroups operation returned by the service.
     * @sample AWSCodeBuildAsyncHandler.ListSharedReportGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListSharedReportGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSharedReportGroupsResult> listSharedReportGroupsAsync(ListSharedReportGroupsRequest listSharedReportGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSharedReportGroupsRequest, ListSharedReportGroupsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of <code>SourceCredentialsInfo</code> objects.
     * </p>
     * 
     * @param listSourceCredentialsRequest
     * @return A Java Future containing the result of the ListSourceCredentials operation returned by the service.
     * @sample AWSCodeBuildAsync.ListSourceCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListSourceCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSourceCredentialsResult> listSourceCredentialsAsync(ListSourceCredentialsRequest listSourceCredentialsRequest);

    /**
     * <p>
     * Returns a list of <code>SourceCredentialsInfo</code> objects.
     * </p>
     * 
     * @param listSourceCredentialsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSourceCredentials operation returned by the service.
     * @sample AWSCodeBuildAsyncHandler.ListSourceCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListSourceCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSourceCredentialsResult> listSourceCredentialsAsync(ListSourceCredentialsRequest listSourceCredentialsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSourceCredentialsRequest, ListSourceCredentialsResult> asyncHandler);

    /**
     * <p>
     * Stores a resource policy for the ARN of a <code>Project</code> or <code>ReportGroup</code> object.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @return A Java Future containing the result of the PutResourcePolicy operation returned by the service.
     * @sample AWSCodeBuildAsync.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/PutResourcePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest putResourcePolicyRequest);

    /**
     * <p>
     * Stores a resource policy for the ARN of a <code>Project</code> or <code>ReportGroup</code> object.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutResourcePolicy operation returned by the service.
     * @sample AWSCodeBuildAsyncHandler.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/PutResourcePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest putResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutResourcePolicyRequest, PutResourcePolicyResult> asyncHandler);

    /**
     * <p>
     * Starts running a build.
     * </p>
     * 
     * @param startBuildRequest
     * @return A Java Future containing the result of the StartBuild operation returned by the service.
     * @sample AWSCodeBuildAsync.StartBuild
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/StartBuild" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartBuildResult> startBuildAsync(StartBuildRequest startBuildRequest);

    /**
     * <p>
     * Starts running a build.
     * </p>
     * 
     * @param startBuildRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartBuild operation returned by the service.
     * @sample AWSCodeBuildAsyncHandler.StartBuild
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/StartBuild" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartBuildResult> startBuildAsync(StartBuildRequest startBuildRequest,
            com.amazonaws.handlers.AsyncHandler<StartBuildRequest, StartBuildResult> asyncHandler);

    /**
     * <p>
     * Attempts to stop running a build.
     * </p>
     * 
     * @param stopBuildRequest
     * @return A Java Future containing the result of the StopBuild operation returned by the service.
     * @sample AWSCodeBuildAsync.StopBuild
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/StopBuild" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopBuildResult> stopBuildAsync(StopBuildRequest stopBuildRequest);

    /**
     * <p>
     * Attempts to stop running a build.
     * </p>
     * 
     * @param stopBuildRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopBuild operation returned by the service.
     * @sample AWSCodeBuildAsyncHandler.StopBuild
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/StopBuild" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopBuildResult> stopBuildAsync(StopBuildRequest stopBuildRequest,
            com.amazonaws.handlers.AsyncHandler<StopBuildRequest, StopBuildResult> asyncHandler);

    /**
     * <p>
     * Changes the settings of a build project.
     * </p>
     * 
     * @param updateProjectRequest
     * @return A Java Future containing the result of the UpdateProject operation returned by the service.
     * @sample AWSCodeBuildAsync.UpdateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/UpdateProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateProjectResult> updateProjectAsync(UpdateProjectRequest updateProjectRequest);

    /**
     * <p>
     * Changes the settings of a build project.
     * </p>
     * 
     * @param updateProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateProject operation returned by the service.
     * @sample AWSCodeBuildAsyncHandler.UpdateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/UpdateProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateProjectResult> updateProjectAsync(UpdateProjectRequest updateProjectRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateProjectRequest, UpdateProjectResult> asyncHandler);

    /**
     * <p>
     * Updates a report group.
     * </p>
     * 
     * @param updateReportGroupRequest
     * @return A Java Future containing the result of the UpdateReportGroup operation returned by the service.
     * @sample AWSCodeBuildAsync.UpdateReportGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/UpdateReportGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateReportGroupResult> updateReportGroupAsync(UpdateReportGroupRequest updateReportGroupRequest);

    /**
     * <p>
     * Updates a report group.
     * </p>
     * 
     * @param updateReportGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateReportGroup operation returned by the service.
     * @sample AWSCodeBuildAsyncHandler.UpdateReportGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/UpdateReportGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateReportGroupResult> updateReportGroupAsync(UpdateReportGroupRequest updateReportGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateReportGroupRequest, UpdateReportGroupResult> asyncHandler);

    /**
     * <p>
     * Updates the webhook associated with an AWS CodeBuild build project.
     * </p>
     * <note>
     * <p>
     * If you use Bitbucket for your repository, <code>rotateSecret</code> is ignored.
     * </p>
     * </note>
     * 
     * @param updateWebhookRequest
     * @return A Java Future containing the result of the UpdateWebhook operation returned by the service.
     * @sample AWSCodeBuildAsync.UpdateWebhook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/UpdateWebhook" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateWebhookResult> updateWebhookAsync(UpdateWebhookRequest updateWebhookRequest);

    /**
     * <p>
     * Updates the webhook associated with an AWS CodeBuild build project.
     * </p>
     * <note>
     * <p>
     * If you use Bitbucket for your repository, <code>rotateSecret</code> is ignored.
     * </p>
     * </note>
     * 
     * @param updateWebhookRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateWebhook operation returned by the service.
     * @sample AWSCodeBuildAsyncHandler.UpdateWebhook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/UpdateWebhook" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateWebhookResult> updateWebhookAsync(UpdateWebhookRequest updateWebhookRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateWebhookRequest, UpdateWebhookResult> asyncHandler);

}
