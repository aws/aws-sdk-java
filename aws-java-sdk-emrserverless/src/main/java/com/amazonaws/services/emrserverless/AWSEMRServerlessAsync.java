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

import com.amazonaws.services.emrserverless.model.*;

/**
 * Interface for accessing EMR Serverless asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.emrserverless.AbstractAWSEMRServerlessAsync} instead.
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
public interface AWSEMRServerlessAsync extends AWSEMRServerless {

    /**
     * <p>
     * Cancels a job run.
     * </p>
     * 
     * @param cancelJobRunRequest
     * @return A Java Future containing the result of the CancelJobRun operation returned by the service.
     * @sample AWSEMRServerlessAsync.CancelJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/CancelJobRun" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelJobRunResult> cancelJobRunAsync(CancelJobRunRequest cancelJobRunRequest);

    /**
     * <p>
     * Cancels a job run.
     * </p>
     * 
     * @param cancelJobRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelJobRun operation returned by the service.
     * @sample AWSEMRServerlessAsyncHandler.CancelJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/CancelJobRun" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelJobRunResult> cancelJobRunAsync(CancelJobRunRequest cancelJobRunRequest,
            com.amazonaws.handlers.AsyncHandler<CancelJobRunRequest, CancelJobRunResult> asyncHandler);

    /**
     * <p>
     * Creates an application.
     * </p>
     * 
     * @param createApplicationRequest
     * @return A Java Future containing the result of the CreateApplication operation returned by the service.
     * @sample AWSEMRServerlessAsync.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/CreateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest createApplicationRequest);

    /**
     * <p>
     * Creates an application.
     * </p>
     * 
     * @param createApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateApplication operation returned by the service.
     * @sample AWSEMRServerlessAsyncHandler.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/CreateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest createApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler);

    /**
     * <p>
     * Deletes an application. An application has to be in a stopped or created state in order to be deleted.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @return A Java Future containing the result of the DeleteApplication operation returned by the service.
     * @sample AWSEMRServerlessAsync.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/DeleteApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest deleteApplicationRequest);

    /**
     * <p>
     * Deletes an application. An application has to be in a stopped or created state in order to be deleted.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApplication operation returned by the service.
     * @sample AWSEMRServerlessAsyncHandler.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/DeleteApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest deleteApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApplicationRequest, DeleteApplicationResult> asyncHandler);

    /**
     * <p>
     * Displays detailed information about a specified application.
     * </p>
     * 
     * @param getApplicationRequest
     * @return A Java Future containing the result of the GetApplication operation returned by the service.
     * @sample AWSEMRServerlessAsync.GetApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/GetApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(GetApplicationRequest getApplicationRequest);

    /**
     * <p>
     * Displays detailed information about a specified application.
     * </p>
     * 
     * @param getApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApplication operation returned by the service.
     * @sample AWSEMRServerlessAsyncHandler.GetApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/GetApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(GetApplicationRequest getApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<GetApplicationRequest, GetApplicationResult> asyncHandler);

    /**
     * <p>
     * Returns a URL to access the job run dashboard.
     * </p>
     * 
     * @param getDashboardForJobRunRequest
     * @return A Java Future containing the result of the GetDashboardForJobRun operation returned by the service.
     * @sample AWSEMRServerlessAsync.GetDashboardForJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/GetDashboardForJobRun"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDashboardForJobRunResult> getDashboardForJobRunAsync(GetDashboardForJobRunRequest getDashboardForJobRunRequest);

    /**
     * <p>
     * Returns a URL to access the job run dashboard.
     * </p>
     * 
     * @param getDashboardForJobRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDashboardForJobRun operation returned by the service.
     * @sample AWSEMRServerlessAsyncHandler.GetDashboardForJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/GetDashboardForJobRun"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDashboardForJobRunResult> getDashboardForJobRunAsync(GetDashboardForJobRunRequest getDashboardForJobRunRequest,
            com.amazonaws.handlers.AsyncHandler<GetDashboardForJobRunRequest, GetDashboardForJobRunResult> asyncHandler);

    /**
     * <p>
     * Displays detailed information about a job run.
     * </p>
     * 
     * @param getJobRunRequest
     * @return A Java Future containing the result of the GetJobRun operation returned by the service.
     * @sample AWSEMRServerlessAsync.GetJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/GetJobRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetJobRunResult> getJobRunAsync(GetJobRunRequest getJobRunRequest);

    /**
     * <p>
     * Displays detailed information about a job run.
     * </p>
     * 
     * @param getJobRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetJobRun operation returned by the service.
     * @sample AWSEMRServerlessAsyncHandler.GetJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/GetJobRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetJobRunResult> getJobRunAsync(GetJobRunRequest getJobRunRequest,
            com.amazonaws.handlers.AsyncHandler<GetJobRunRequest, GetJobRunResult> asyncHandler);

    /**
     * <p>
     * Lists applications based on a set of parameters.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return A Java Future containing the result of the ListApplications operation returned by the service.
     * @sample AWSEMRServerlessAsync.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/ListApplications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest listApplicationsRequest);

    /**
     * <p>
     * Lists applications based on a set of parameters.
     * </p>
     * 
     * @param listApplicationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApplications operation returned by the service.
     * @sample AWSEMRServerlessAsyncHandler.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/ListApplications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest listApplicationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler);

    /**
     * <p>
     * Lists job runs based on a set of parameters.
     * </p>
     * 
     * @param listJobRunsRequest
     * @return A Java Future containing the result of the ListJobRuns operation returned by the service.
     * @sample AWSEMRServerlessAsync.ListJobRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/ListJobRuns" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListJobRunsResult> listJobRunsAsync(ListJobRunsRequest listJobRunsRequest);

    /**
     * <p>
     * Lists job runs based on a set of parameters.
     * </p>
     * 
     * @param listJobRunsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListJobRuns operation returned by the service.
     * @sample AWSEMRServerlessAsyncHandler.ListJobRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/ListJobRuns" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListJobRunsResult> listJobRunsAsync(ListJobRunsRequest listJobRunsRequest,
            com.amazonaws.handlers.AsyncHandler<ListJobRunsRequest, ListJobRunsResult> asyncHandler);

    /**
     * <p>
     * Lists the tags assigned to the resources.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSEMRServerlessAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags assigned to the resources.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSEMRServerlessAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Starts a specified application and initializes initial capacity if configured.
     * </p>
     * 
     * @param startApplicationRequest
     * @return A Java Future containing the result of the StartApplication operation returned by the service.
     * @sample AWSEMRServerlessAsync.StartApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/StartApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartApplicationResult> startApplicationAsync(StartApplicationRequest startApplicationRequest);

    /**
     * <p>
     * Starts a specified application and initializes initial capacity if configured.
     * </p>
     * 
     * @param startApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartApplication operation returned by the service.
     * @sample AWSEMRServerlessAsyncHandler.StartApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/StartApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartApplicationResult> startApplicationAsync(StartApplicationRequest startApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<StartApplicationRequest, StartApplicationResult> asyncHandler);

    /**
     * <p>
     * Starts a job run.
     * </p>
     * 
     * @param startJobRunRequest
     * @return A Java Future containing the result of the StartJobRun operation returned by the service.
     * @sample AWSEMRServerlessAsync.StartJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/StartJobRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartJobRunResult> startJobRunAsync(StartJobRunRequest startJobRunRequest);

    /**
     * <p>
     * Starts a job run.
     * </p>
     * 
     * @param startJobRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartJobRun operation returned by the service.
     * @sample AWSEMRServerlessAsyncHandler.StartJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/StartJobRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartJobRunResult> startJobRunAsync(StartJobRunRequest startJobRunRequest,
            com.amazonaws.handlers.AsyncHandler<StartJobRunRequest, StartJobRunResult> asyncHandler);

    /**
     * <p>
     * Stops a specified application and releases initial capacity if configured. All scheduled and running jobs must be
     * completed or cancelled before stopping an application.
     * </p>
     * 
     * @param stopApplicationRequest
     * @return A Java Future containing the result of the StopApplication operation returned by the service.
     * @sample AWSEMRServerlessAsync.StopApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/StopApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopApplicationResult> stopApplicationAsync(StopApplicationRequest stopApplicationRequest);

    /**
     * <p>
     * Stops a specified application and releases initial capacity if configured. All scheduled and running jobs must be
     * completed or cancelled before stopping an application.
     * </p>
     * 
     * @param stopApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopApplication operation returned by the service.
     * @sample AWSEMRServerlessAsyncHandler.StopApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/StopApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopApplicationResult> stopApplicationAsync(StopApplicationRequest stopApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<StopApplicationRequest, StopApplicationResult> asyncHandler);

    /**
     * <p>
     * Assigns tags to resources. A tag is a label that you assign to an AWS resource. Each tag consists of a key and an
     * optional value, both of which you define. Tags enable you to categorize your AWS resources by attributes such as
     * purpose, owner, or environment. When you have many resources of the same type, you can quickly identify a
     * specific resource based on the tags you've assigned to it.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSEMRServerlessAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Assigns tags to resources. A tag is a label that you assign to an AWS resource. Each tag consists of a key and an
     * optional value, both of which you define. Tags enable you to categorize your AWS resources by attributes such as
     * purpose, owner, or environment. When you have many resources of the same type, you can quickly identify a
     * specific resource based on the tags you've assigned to it.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSEMRServerlessAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes tags from resources.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSEMRServerlessAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags from resources.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSEMRServerlessAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates a specified application. An application has to be in a stopped or created state in order to be updated.
     * </p>
     * 
     * @param updateApplicationRequest
     * @return A Java Future containing the result of the UpdateApplication operation returned by the service.
     * @sample AWSEMRServerlessAsync.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/UpdateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest updateApplicationRequest);

    /**
     * <p>
     * Updates a specified application. An application has to be in a stopped or created state in order to be updated.
     * </p>
     * 
     * @param updateApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApplication operation returned by the service.
     * @sample AWSEMRServerlessAsyncHandler.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/UpdateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest updateApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler);

}
