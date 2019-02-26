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
package com.amazonaws.services.codebuild;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.codebuild.model.*;

/**
 * Interface for accessing AWS CodeBuild.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.codebuild.AbstractAWSCodeBuild} instead.
 * </p>
 * <p>
 * <fullname>AWS CodeBuild</fullname>
 * <p>
 * AWS CodeBuild is a fully managed build service in the cloud. AWS CodeBuild compiles your source code, runs unit
 * tests, and produces artifacts that are ready to deploy. AWS CodeBuild eliminates the need to provision, manage, and
 * scale your own build servers. It provides prepackaged build environments for the most popular programming languages
 * and build tools, such as Apache Maven, Gradle, and more. You can also fully customize build environments in AWS
 * CodeBuild to use your own build tools. AWS CodeBuild scales automatically to meet peak build requests. You pay only
 * for the build time you consume. For more information about AWS CodeBuild, see the <i>AWS CodeBuild User Guide</i>.
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
 * <code>BatchGetProjects</code>: Gets information about one or more build projects. A <i>build project</i> defines how
 * AWS CodeBuild runs a build. This includes information such as where to get the source code to build, the build
 * environment to use, the build commands to run, and where to store the build output. A <i>build environment</i> is a
 * representation of operating system, programming language runtime, and tools that AWS CodeBuild uses to run a build.
 * You can add tags to build projects to help manage your resources and costs.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CreateProject</code>: Creates a build project.
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
 * <code>UpdateWebhook</code>: Changes the settings of an existing webhook.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteProject</code>: Deletes a build project.
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
 * <li>
 * <p>
 * <code>DeleteSourceCredentials</code>: Deletes a set of GitHub, GitHub Enterprise, or Bitbucket source credentials.
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
 * <code>ListSourceCredentials</code>: Returns a list of <code>SourceCredentialsInfo</code> objects. Each
 * <code>SourceCredentialsInfo</code> object includes the authentication type, token ARN, and type of source provider
 * for one set of credentials.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSCodeBuild {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "codebuild";

    /**
     * Overrides the default endpoint for this client ("codebuild.us-east-1.amazonaws.com"). Callers can use this method
     * to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "codebuild.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "codebuild.us-east-1.amazonaws.com"). If the protocol is not specified here, the default protocol
     * from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "codebuild.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "codebuild.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate
     *        with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSCodeBuild#setEndpoint(String)}, sets the regional endpoint for this client's service
     * calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * Deletes one or more builds.
     * </p>
     * 
     * @param batchDeleteBuildsRequest
     * @return Result of the BatchDeleteBuilds operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @sample AWSCodeBuild.BatchDeleteBuilds
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/BatchDeleteBuilds" target="_top">AWS
     *      API Documentation</a>
     */
    BatchDeleteBuildsResult batchDeleteBuilds(BatchDeleteBuildsRequest batchDeleteBuildsRequest);

    /**
     * <p>
     * Gets information about builds.
     * </p>
     * 
     * @param batchGetBuildsRequest
     * @return Result of the BatchGetBuilds operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @sample AWSCodeBuild.BatchGetBuilds
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/BatchGetBuilds" target="_top">AWS API
     *      Documentation</a>
     */
    BatchGetBuildsResult batchGetBuilds(BatchGetBuildsRequest batchGetBuildsRequest);

    /**
     * <p>
     * Gets information about build projects.
     * </p>
     * 
     * @param batchGetProjectsRequest
     * @return Result of the BatchGetProjects operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @sample AWSCodeBuild.BatchGetProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/BatchGetProjects" target="_top">AWS API
     *      Documentation</a>
     */
    BatchGetProjectsResult batchGetProjects(BatchGetProjectsRequest batchGetProjectsRequest);

    /**
     * <p>
     * Creates a build project.
     * </p>
     * 
     * @param createProjectRequest
     * @return Result of the CreateProject operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @throws ResourceAlreadyExistsException
     *         The specified AWS resource cannot be created, because an AWS resource with the same settings already
     *         exists.
     * @throws AccountLimitExceededException
     *         An AWS service limit was exceeded for the calling AWS account.
     * @sample AWSCodeBuild.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/CreateProject" target="_top">AWS API
     *      Documentation</a>
     */
    CreateProjectResult createProject(CreateProjectRequest createProjectRequest);

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
     * @return Result of the CreateWebhook operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @throws OAuthProviderException
     *         There was a problem with the underlying OAuth provider.
     * @throws ResourceAlreadyExistsException
     *         The specified AWS resource cannot be created, because an AWS resource with the same settings already
     *         exists.
     * @throws ResourceNotFoundException
     *         The specified AWS resource cannot be found.
     * @sample AWSCodeBuild.CreateWebhook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/CreateWebhook" target="_top">AWS API
     *      Documentation</a>
     */
    CreateWebhookResult createWebhook(CreateWebhookRequest createWebhookRequest);

    /**
     * <p>
     * Deletes a build project.
     * </p>
     * 
     * @param deleteProjectRequest
     * @return Result of the DeleteProject operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @sample AWSCodeBuild.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/DeleteProject" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteProjectResult deleteProject(DeleteProjectRequest deleteProjectRequest);

    /**
     * <p>
     * Deletes a set of GitHub, GitHub Enterprise, or Bitbucket source credentials.
     * </p>
     * 
     * @param deleteSourceCredentialsRequest
     * @return Result of the DeleteSourceCredentials operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @throws ResourceNotFoundException
     *         The specified AWS resource cannot be found.
     * @sample AWSCodeBuild.DeleteSourceCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/DeleteSourceCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSourceCredentialsResult deleteSourceCredentials(DeleteSourceCredentialsRequest deleteSourceCredentialsRequest);

    /**
     * <p>
     * For an existing AWS CodeBuild build project that has its source code stored in a GitHub or Bitbucket repository,
     * stops AWS CodeBuild from rebuilding the source code every time a code change is pushed to the repository.
     * </p>
     * 
     * @param deleteWebhookRequest
     * @return Result of the DeleteWebhook operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @throws ResourceNotFoundException
     *         The specified AWS resource cannot be found.
     * @throws OAuthProviderException
     *         There was a problem with the underlying OAuth provider.
     * @sample AWSCodeBuild.DeleteWebhook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/DeleteWebhook" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteWebhookResult deleteWebhook(DeleteWebhookRequest deleteWebhookRequest);

    /**
     * <p>
     * Imports the source repository credentials for an AWS CodeBuild project that has its source code stored in a
     * GitHub, GitHub Enterprise, or Bitbucket repository.
     * </p>
     * 
     * @param importSourceCredentialsRequest
     * @return Result of the ImportSourceCredentials operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @throws AccountLimitExceededException
     *         An AWS service limit was exceeded for the calling AWS account.
     * @sample AWSCodeBuild.ImportSourceCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ImportSourceCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    ImportSourceCredentialsResult importSourceCredentials(ImportSourceCredentialsRequest importSourceCredentialsRequest);

    /**
     * <p>
     * Resets the cache for a project.
     * </p>
     * 
     * @param invalidateProjectCacheRequest
     * @return Result of the InvalidateProjectCache operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @throws ResourceNotFoundException
     *         The specified AWS resource cannot be found.
     * @sample AWSCodeBuild.InvalidateProjectCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/InvalidateProjectCache"
     *      target="_top">AWS API Documentation</a>
     */
    InvalidateProjectCacheResult invalidateProjectCache(InvalidateProjectCacheRequest invalidateProjectCacheRequest);

    /**
     * <p>
     * Gets a list of build IDs, with each build ID representing a single build.
     * </p>
     * 
     * @param listBuildsRequest
     * @return Result of the ListBuilds operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @sample AWSCodeBuild.ListBuilds
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListBuilds" target="_top">AWS API
     *      Documentation</a>
     */
    ListBuildsResult listBuilds(ListBuildsRequest listBuildsRequest);

    /**
     * <p>
     * Gets a list of build IDs for the specified build project, with each build ID representing a single build.
     * </p>
     * 
     * @param listBuildsForProjectRequest
     * @return Result of the ListBuildsForProject operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @throws ResourceNotFoundException
     *         The specified AWS resource cannot be found.
     * @sample AWSCodeBuild.ListBuildsForProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListBuildsForProject" target="_top">AWS
     *      API Documentation</a>
     */
    ListBuildsForProjectResult listBuildsForProject(ListBuildsForProjectRequest listBuildsForProjectRequest);

    /**
     * <p>
     * Gets information about Docker images that are managed by AWS CodeBuild.
     * </p>
     * 
     * @param listCuratedEnvironmentImagesRequest
     * @return Result of the ListCuratedEnvironmentImages operation returned by the service.
     * @sample AWSCodeBuild.ListCuratedEnvironmentImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListCuratedEnvironmentImages"
     *      target="_top">AWS API Documentation</a>
     */
    ListCuratedEnvironmentImagesResult listCuratedEnvironmentImages(ListCuratedEnvironmentImagesRequest listCuratedEnvironmentImagesRequest);

    /**
     * <p>
     * Gets a list of build project names, with each build project name representing a single build project.
     * </p>
     * 
     * @param listProjectsRequest
     * @return Result of the ListProjects operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @sample AWSCodeBuild.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListProjects" target="_top">AWS API
     *      Documentation</a>
     */
    ListProjectsResult listProjects(ListProjectsRequest listProjectsRequest);

    /**
     * <p>
     * Returns a list of <code>SourceCredentialsInfo</code> objects.
     * </p>
     * 
     * @param listSourceCredentialsRequest
     * @return Result of the ListSourceCredentials operation returned by the service.
     * @sample AWSCodeBuild.ListSourceCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListSourceCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    ListSourceCredentialsResult listSourceCredentials(ListSourceCredentialsRequest listSourceCredentialsRequest);

    /**
     * <p>
     * Starts running a build.
     * </p>
     * 
     * @param startBuildRequest
     * @return Result of the StartBuild operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @throws ResourceNotFoundException
     *         The specified AWS resource cannot be found.
     * @throws AccountLimitExceededException
     *         An AWS service limit was exceeded for the calling AWS account.
     * @sample AWSCodeBuild.StartBuild
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/StartBuild" target="_top">AWS API
     *      Documentation</a>
     */
    StartBuildResult startBuild(StartBuildRequest startBuildRequest);

    /**
     * <p>
     * Attempts to stop running a build.
     * </p>
     * 
     * @param stopBuildRequest
     * @return Result of the StopBuild operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @throws ResourceNotFoundException
     *         The specified AWS resource cannot be found.
     * @sample AWSCodeBuild.StopBuild
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/StopBuild" target="_top">AWS API
     *      Documentation</a>
     */
    StopBuildResult stopBuild(StopBuildRequest stopBuildRequest);

    /**
     * <p>
     * Changes the settings of a build project.
     * </p>
     * 
     * @param updateProjectRequest
     * @return Result of the UpdateProject operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @throws ResourceNotFoundException
     *         The specified AWS resource cannot be found.
     * @sample AWSCodeBuild.UpdateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/UpdateProject" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateProjectResult updateProject(UpdateProjectRequest updateProjectRequest);

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
     * @return Result of the UpdateWebhook operation returned by the service.
     * @throws InvalidInputException
     *         The input value that was provided is not valid.
     * @throws ResourceNotFoundException
     *         The specified AWS resource cannot be found.
     * @throws OAuthProviderException
     *         There was a problem with the underlying OAuth provider.
     * @sample AWSCodeBuild.UpdateWebhook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/UpdateWebhook" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateWebhookResult updateWebhook(UpdateWebhookRequest updateWebhookRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
