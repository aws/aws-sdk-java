/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.emrserverless;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.emrserverless.model.*;

/**
 * Interface for accessing EMR Serverless.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.emrserverless.AbstractAWSEMRServerless} instead.
 * </p>
 * <p>
 * <p>
 * Amazon EMR Serverless is a new deployment option for Amazon EMR. EMR Serverless provides a serverless runtime
 * environment that simplifies running analytics applications using the latest open source frameworks such as Apache
 * Spark and Apache Hive. With EMR Serverless, you don’t have to configure, optimize, secure, or operate clusters to run
 * applications with these frameworks.
 * </p>
 * <p>
 * The API reference to Amazon EMR Serverless is <code>emr-serverless</code>. The <code>emr-serverless</code> prefix is
 * used in the following scenarios:
 * </p>
 * <ul>
 * <li>
 * <p>
 * It is the prefix in the CLI commands for Amazon EMR Serverless. For example,
 * <code>aws emr-serverless start-job-run</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * It is the prefix before IAM policy actions for Amazon EMR Serverless. For example,
 * <code>"Action": ["emr-serverless:StartJobRun"]</code>. For more information, see <a href=
 * "https://docs.aws.amazon.com/emr/latest/EMR-Serverless-UserGuide/security_iam_service-with-iam.html#security_iam_service-with-iam-id-based-policies-actions"
 * >Policy actions for Amazon EMR Serverless</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * It is the prefix used in Amazon EMR Serverless service endpoints. For example,
 * <code>emr-serverless.us-east-2.amazonaws.com</code>.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSEMRServerless {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "emr-serverless";

    /**
     * <p>
     * Cancels a job run.
     * </p>
     * 
     * @param cancelJobRunRequest
     * @return Result of the CancelJobRun operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @sample AWSEMRServerless.CancelJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/CancelJobRun" target="_top">AWS
     *      API Documentation</a>
     */
    CancelJobRunResult cancelJobRun(CancelJobRunRequest cancelJobRunRequest);

    /**
     * <p>
     * Creates an application.
     * </p>
     * 
     * @param createApplicationRequest
     * @return Result of the CreateApplication operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @sample AWSEMRServerless.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/CreateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    CreateApplicationResult createApplication(CreateApplicationRequest createApplicationRequest);

    /**
     * <p>
     * Deletes an application. An application has to be in a stopped or created state in order to be deleted.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @return Result of the DeleteApplication operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @sample AWSEMRServerless.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/DeleteApplication"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteApplicationResult deleteApplication(DeleteApplicationRequest deleteApplicationRequest);

    /**
     * <p>
     * Displays detailed information about a specified application.
     * </p>
     * 
     * @param getApplicationRequest
     * @return Result of the GetApplication operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @sample AWSEMRServerless.GetApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/GetApplication" target="_top">AWS
     *      API Documentation</a>
     */
    GetApplicationResult getApplication(GetApplicationRequest getApplicationRequest);

    /**
     * <p>
     * Returns a URL to access the job run dashboard.
     * </p>
     * 
     * @param getDashboardForJobRunRequest
     * @return Result of the GetDashboardForJobRun operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @sample AWSEMRServerless.GetDashboardForJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/GetDashboardForJobRun"
     *      target="_top">AWS API Documentation</a>
     */
    GetDashboardForJobRunResult getDashboardForJobRun(GetDashboardForJobRunRequest getDashboardForJobRunRequest);

    /**
     * <p>
     * Displays detailed information about a job run.
     * </p>
     * 
     * @param getJobRunRequest
     * @return Result of the GetJobRun operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @sample AWSEMRServerless.GetJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/GetJobRun" target="_top">AWS API
     *      Documentation</a>
     */
    GetJobRunResult getJobRun(GetJobRunRequest getJobRunRequest);

    /**
     * <p>
     * Lists applications based on a set of parameters.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return Result of the ListApplications operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @sample AWSEMRServerless.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/ListApplications"
     *      target="_top">AWS API Documentation</a>
     */
    ListApplicationsResult listApplications(ListApplicationsRequest listApplicationsRequest);

    /**
     * <p>
     * Lists job runs based on a set of parameters.
     * </p>
     * 
     * @param listJobRunsRequest
     * @return Result of the ListJobRuns operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @sample AWSEMRServerless.ListJobRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/ListJobRuns" target="_top">AWS API
     *      Documentation</a>
     */
    ListJobRunsResult listJobRuns(ListJobRunsRequest listJobRunsRequest);

    /**
     * <p>
     * Lists the tags assigned to the resources.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @sample AWSEMRServerless.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Starts a specified application and initializes initial capacity if configured.
     * </p>
     * 
     * @param startApplicationRequest
     * @return Result of the StartApplication operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ServiceQuotaExceededException
     *         The maximum number of resources per account has been reached.
     * @sample AWSEMRServerless.StartApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/StartApplication"
     *      target="_top">AWS API Documentation</a>
     */
    StartApplicationResult startApplication(StartApplicationRequest startApplicationRequest);

    /**
     * <p>
     * Starts a job run.
     * </p>
     * 
     * @param startJobRunRequest
     * @return Result of the StartJobRun operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @sample AWSEMRServerless.StartJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/StartJobRun" target="_top">AWS API
     *      Documentation</a>
     */
    StartJobRunResult startJobRun(StartJobRunRequest startJobRunRequest);

    /**
     * <p>
     * Stops a specified application and releases initial capacity if configured. All scheduled and running jobs must be
     * completed or cancelled before stopping an application.
     * </p>
     * 
     * @param stopApplicationRequest
     * @return Result of the StopApplication operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @sample AWSEMRServerless.StopApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/StopApplication" target="_top">AWS
     *      API Documentation</a>
     */
    StopApplicationResult stopApplication(StopApplicationRequest stopApplicationRequest);

    /**
     * <p>
     * Assigns tags to resources. A tag is a label that you assign to an AWS resource. Each tag consists of a key and an
     * optional value, both of which you define. Tags enable you to categorize your AWS resources by attributes such as
     * purpose, owner, or environment. When you have many resources of the same type, you can quickly identify a
     * specific resource based on the tags you've assigned to it.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @sample AWSEMRServerless.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes tags from resources.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @sample AWSEMRServerless.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates a specified application. An application has to be in a stopped or created state in order to be updated.
     * </p>
     * 
     * @param updateApplicationRequest
     * @return Result of the UpdateApplication operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @sample AWSEMRServerless.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/UpdateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateApplicationResult updateApplication(UpdateApplicationRequest updateApplicationRequest);

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
