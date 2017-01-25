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
 * and build tools, such as Apach Maven, Gradle, and more. You can also fully customize build environments in AWS
 * CodeBuild to use your own build tools. AWS CodeBuild scales automatically to meet peak build requests, and you pay
 * only for the build time you consume. For more information about AWS CodeBuild, see the <i>AWS CodeBuild User
 * Guide</i>.
 * </p>
 * <p>
 * AWS CodeBuild supports these operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>BatchGetProjects</code>: Gets information about one or more build projects. A <i>build project</i> defines how
 * AWS CodeBuild will run a build. This includes information such as where to get the source code to build, the build
 * environment to use, the build commands to run, and where to store the build output. A <i>build environment</i>
 * represents a combination of operating system, programming language runtime, and tools that AWS CodeBuild will use to
 * run a build. Also, you can add tags to build projects to help manage your resources and costs.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CreateProject</code>: Creates a build project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteProject</code>: Deletes a build project.
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
 * <code>UpdateProject</code>: Changes the settings of an existing build project.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>BatchGetBuilds</code>: Gets information about one or more builds.
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
 * <code>ListCuratedEnvironmentImages</code>: Gets information about Docker images that are managed by AWS CodeBuild.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSCodeBuildAsync extends AWSCodeBuild {

    /**
     * <p>
     * Gets information about builds.
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
     * Gets information about builds.
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
     * Gets information about build projects.
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
     * Gets information about build projects.
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
     * Deletes a build project.
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
     * Deletes a build project.
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

}
