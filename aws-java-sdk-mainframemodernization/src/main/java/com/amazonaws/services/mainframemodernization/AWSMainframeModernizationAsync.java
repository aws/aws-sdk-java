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
package com.amazonaws.services.mainframemodernization;

import javax.annotation.Generated;

import com.amazonaws.services.mainframemodernization.model.*;

/**
 * Interface for accessing AWSMainframeModernization asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.mainframemodernization.AbstractAWSMainframeModernizationAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Web Services Mainframe Modernization provides tools and resources to help you plan and implement migration and
 * modernization from mainframes to Amazon Web Services managed runtime environments. It provides tools for analyzing
 * existing mainframe applications, developing or updating mainframe applications using COBOL or PL/I, and implementing
 * an automated pipeline for continuous integration and continuous delivery (CI/CD) of the applications.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSMainframeModernizationAsync extends AWSMainframeModernization {

    /**
     * <p>
     * Cancels the running of a specific batch job execution.
     * </p>
     * 
     * @param cancelBatchJobExecutionRequest
     * @return A Java Future containing the result of the CancelBatchJobExecution operation returned by the service.
     * @sample AWSMainframeModernizationAsync.CancelBatchJobExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/CancelBatchJobExecution" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelBatchJobExecutionResult> cancelBatchJobExecutionAsync(CancelBatchJobExecutionRequest cancelBatchJobExecutionRequest);

    /**
     * <p>
     * Cancels the running of a specific batch job execution.
     * </p>
     * 
     * @param cancelBatchJobExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelBatchJobExecution operation returned by the service.
     * @sample AWSMainframeModernizationAsyncHandler.CancelBatchJobExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/CancelBatchJobExecution" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelBatchJobExecutionResult> cancelBatchJobExecutionAsync(CancelBatchJobExecutionRequest cancelBatchJobExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<CancelBatchJobExecutionRequest, CancelBatchJobExecutionResult> asyncHandler);

    /**
     * <p>
     * Creates a new application with given parameters. Requires an existing runtime environment and application
     * definition file.
     * </p>
     * 
     * @param createApplicationRequest
     * @return A Java Future containing the result of the CreateApplication operation returned by the service.
     * @sample AWSMainframeModernizationAsync.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/CreateApplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest createApplicationRequest);

    /**
     * <p>
     * Creates a new application with given parameters. Requires an existing runtime environment and application
     * definition file.
     * </p>
     * 
     * @param createApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateApplication operation returned by the service.
     * @sample AWSMainframeModernizationAsyncHandler.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/CreateApplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest createApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler);

    /**
     * <p>
     * Starts a data set import task for a specific application.
     * </p>
     * 
     * @param createDataSetImportTaskRequest
     * @return A Java Future containing the result of the CreateDataSetImportTask operation returned by the service.
     * @sample AWSMainframeModernizationAsync.CreateDataSetImportTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/CreateDataSetImportTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDataSetImportTaskResult> createDataSetImportTaskAsync(CreateDataSetImportTaskRequest createDataSetImportTaskRequest);

    /**
     * <p>
     * Starts a data set import task for a specific application.
     * </p>
     * 
     * @param createDataSetImportTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDataSetImportTask operation returned by the service.
     * @sample AWSMainframeModernizationAsyncHandler.CreateDataSetImportTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/CreateDataSetImportTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDataSetImportTaskResult> createDataSetImportTaskAsync(CreateDataSetImportTaskRequest createDataSetImportTaskRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDataSetImportTaskRequest, CreateDataSetImportTaskResult> asyncHandler);

    /**
     * <p>
     * Creates and starts a deployment to deploy an application into a runtime environment.
     * </p>
     * 
     * @param createDeploymentRequest
     * @return A Java Future containing the result of the CreateDeployment operation returned by the service.
     * @sample AWSMainframeModernizationAsync.CreateDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/CreateDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest createDeploymentRequest);

    /**
     * <p>
     * Creates and starts a deployment to deploy an application into a runtime environment.
     * </p>
     * 
     * @param createDeploymentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDeployment operation returned by the service.
     * @sample AWSMainframeModernizationAsyncHandler.CreateDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/CreateDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest createDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDeploymentRequest, CreateDeploymentResult> asyncHandler);

    /**
     * <p>
     * Creates a runtime environment for a given runtime engine.
     * </p>
     * 
     * @param createEnvironmentRequest
     * @return A Java Future containing the result of the CreateEnvironment operation returned by the service.
     * @sample AWSMainframeModernizationAsync.CreateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/CreateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateEnvironmentResult> createEnvironmentAsync(CreateEnvironmentRequest createEnvironmentRequest);

    /**
     * <p>
     * Creates a runtime environment for a given runtime engine.
     * </p>
     * 
     * @param createEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEnvironment operation returned by the service.
     * @sample AWSMainframeModernizationAsyncHandler.CreateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/CreateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateEnvironmentResult> createEnvironmentAsync(CreateEnvironmentRequest createEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEnvironmentRequest, CreateEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Deletes a specific application. You cannot delete a running application.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @return A Java Future containing the result of the DeleteApplication operation returned by the service.
     * @sample AWSMainframeModernizationAsync.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/DeleteApplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest deleteApplicationRequest);

    /**
     * <p>
     * Deletes a specific application. You cannot delete a running application.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApplication operation returned by the service.
     * @sample AWSMainframeModernizationAsyncHandler.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/DeleteApplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest deleteApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApplicationRequest, DeleteApplicationResult> asyncHandler);

    /**
     * <p>
     * Deletes a specific application from the specific runtime environment where it was previously deployed. You cannot
     * delete a runtime environment using DeleteEnvironment if any application has ever been deployed to it. This API
     * removes the association of the application with the runtime environment so you can delete the environment
     * smoothly.
     * </p>
     * 
     * @param deleteApplicationFromEnvironmentRequest
     * @return A Java Future containing the result of the DeleteApplicationFromEnvironment operation returned by the
     *         service.
     * @sample AWSMainframeModernizationAsync.DeleteApplicationFromEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/DeleteApplicationFromEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationFromEnvironmentResult> deleteApplicationFromEnvironmentAsync(
            DeleteApplicationFromEnvironmentRequest deleteApplicationFromEnvironmentRequest);

    /**
     * <p>
     * Deletes a specific application from the specific runtime environment where it was previously deployed. You cannot
     * delete a runtime environment using DeleteEnvironment if any application has ever been deployed to it. This API
     * removes the association of the application with the runtime environment so you can delete the environment
     * smoothly.
     * </p>
     * 
     * @param deleteApplicationFromEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApplicationFromEnvironment operation returned by the
     *         service.
     * @sample AWSMainframeModernizationAsyncHandler.DeleteApplicationFromEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/DeleteApplicationFromEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationFromEnvironmentResult> deleteApplicationFromEnvironmentAsync(
            DeleteApplicationFromEnvironmentRequest deleteApplicationFromEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApplicationFromEnvironmentRequest, DeleteApplicationFromEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Deletes a specific runtime environment. The environment cannot contain deployed applications. If it does, you
     * must delete those applications before you delete the environment.
     * </p>
     * 
     * @param deleteEnvironmentRequest
     * @return A Java Future containing the result of the DeleteEnvironment operation returned by the service.
     * @sample AWSMainframeModernizationAsync.DeleteEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/DeleteEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteEnvironmentResult> deleteEnvironmentAsync(DeleteEnvironmentRequest deleteEnvironmentRequest);

    /**
     * <p>
     * Deletes a specific runtime environment. The environment cannot contain deployed applications. If it does, you
     * must delete those applications before you delete the environment.
     * </p>
     * 
     * @param deleteEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEnvironment operation returned by the service.
     * @sample AWSMainframeModernizationAsyncHandler.DeleteEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/DeleteEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteEnvironmentResult> deleteEnvironmentAsync(DeleteEnvironmentRequest deleteEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEnvironmentRequest, DeleteEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Describes the details of a specific application.
     * </p>
     * 
     * @param getApplicationRequest
     * @return A Java Future containing the result of the GetApplication operation returned by the service.
     * @sample AWSMainframeModernizationAsync.GetApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/GetApplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(GetApplicationRequest getApplicationRequest);

    /**
     * <p>
     * Describes the details of a specific application.
     * </p>
     * 
     * @param getApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApplication operation returned by the service.
     * @sample AWSMainframeModernizationAsyncHandler.GetApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/GetApplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(GetApplicationRequest getApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<GetApplicationRequest, GetApplicationResult> asyncHandler);

    /**
     * <p>
     * Returns details about a specific version of a specific application.
     * </p>
     * 
     * @param getApplicationVersionRequest
     * @return A Java Future containing the result of the GetApplicationVersion operation returned by the service.
     * @sample AWSMainframeModernizationAsync.GetApplicationVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/GetApplicationVersion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationVersionResult> getApplicationVersionAsync(GetApplicationVersionRequest getApplicationVersionRequest);

    /**
     * <p>
     * Returns details about a specific version of a specific application.
     * </p>
     * 
     * @param getApplicationVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApplicationVersion operation returned by the service.
     * @sample AWSMainframeModernizationAsyncHandler.GetApplicationVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/GetApplicationVersion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationVersionResult> getApplicationVersionAsync(GetApplicationVersionRequest getApplicationVersionRequest,
            com.amazonaws.handlers.AsyncHandler<GetApplicationVersionRequest, GetApplicationVersionResult> asyncHandler);

    /**
     * <p>
     * Gets the details of a specific batch job execution for a specific application.
     * </p>
     * 
     * @param getBatchJobExecutionRequest
     * @return A Java Future containing the result of the GetBatchJobExecution operation returned by the service.
     * @sample AWSMainframeModernizationAsync.GetBatchJobExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/GetBatchJobExecution" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBatchJobExecutionResult> getBatchJobExecutionAsync(GetBatchJobExecutionRequest getBatchJobExecutionRequest);

    /**
     * <p>
     * Gets the details of a specific batch job execution for a specific application.
     * </p>
     * 
     * @param getBatchJobExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBatchJobExecution operation returned by the service.
     * @sample AWSMainframeModernizationAsyncHandler.GetBatchJobExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/GetBatchJobExecution" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBatchJobExecutionResult> getBatchJobExecutionAsync(GetBatchJobExecutionRequest getBatchJobExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<GetBatchJobExecutionRequest, GetBatchJobExecutionResult> asyncHandler);

    /**
     * <p>
     * Gets the details of a specific data set.
     * </p>
     * 
     * @param getDataSetDetailsRequest
     * @return A Java Future containing the result of the GetDataSetDetails operation returned by the service.
     * @sample AWSMainframeModernizationAsync.GetDataSetDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/GetDataSetDetails" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDataSetDetailsResult> getDataSetDetailsAsync(GetDataSetDetailsRequest getDataSetDetailsRequest);

    /**
     * <p>
     * Gets the details of a specific data set.
     * </p>
     * 
     * @param getDataSetDetailsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDataSetDetails operation returned by the service.
     * @sample AWSMainframeModernizationAsyncHandler.GetDataSetDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/GetDataSetDetails" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDataSetDetailsResult> getDataSetDetailsAsync(GetDataSetDetailsRequest getDataSetDetailsRequest,
            com.amazonaws.handlers.AsyncHandler<GetDataSetDetailsRequest, GetDataSetDetailsResult> asyncHandler);

    /**
     * <p>
     * Gets the status of a data set import task initiated with the <a>CreateDataSetImportTask</a> operation.
     * </p>
     * 
     * @param getDataSetImportTaskRequest
     * @return A Java Future containing the result of the GetDataSetImportTask operation returned by the service.
     * @sample AWSMainframeModernizationAsync.GetDataSetImportTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/GetDataSetImportTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDataSetImportTaskResult> getDataSetImportTaskAsync(GetDataSetImportTaskRequest getDataSetImportTaskRequest);

    /**
     * <p>
     * Gets the status of a data set import task initiated with the <a>CreateDataSetImportTask</a> operation.
     * </p>
     * 
     * @param getDataSetImportTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDataSetImportTask operation returned by the service.
     * @sample AWSMainframeModernizationAsyncHandler.GetDataSetImportTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/GetDataSetImportTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDataSetImportTaskResult> getDataSetImportTaskAsync(GetDataSetImportTaskRequest getDataSetImportTaskRequest,
            com.amazonaws.handlers.AsyncHandler<GetDataSetImportTaskRequest, GetDataSetImportTaskResult> asyncHandler);

    /**
     * <p>
     * Gets details of a specific deployment with a given deployment identifier.
     * </p>
     * 
     * @param getDeploymentRequest
     * @return A Java Future containing the result of the GetDeployment operation returned by the service.
     * @sample AWSMainframeModernizationAsync.GetDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/GetDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(GetDeploymentRequest getDeploymentRequest);

    /**
     * <p>
     * Gets details of a specific deployment with a given deployment identifier.
     * </p>
     * 
     * @param getDeploymentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDeployment operation returned by the service.
     * @sample AWSMainframeModernizationAsyncHandler.GetDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/GetDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(GetDeploymentRequest getDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeploymentRequest, GetDeploymentResult> asyncHandler);

    /**
     * <p>
     * Describes a specific runtime environment.
     * </p>
     * 
     * @param getEnvironmentRequest
     * @return A Java Future containing the result of the GetEnvironment operation returned by the service.
     * @sample AWSMainframeModernizationAsync.GetEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/GetEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEnvironmentResult> getEnvironmentAsync(GetEnvironmentRequest getEnvironmentRequest);

    /**
     * <p>
     * Describes a specific runtime environment.
     * </p>
     * 
     * @param getEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEnvironment operation returned by the service.
     * @sample AWSMainframeModernizationAsyncHandler.GetEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/GetEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEnvironmentResult> getEnvironmentAsync(GetEnvironmentRequest getEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<GetEnvironmentRequest, GetEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the application versions for a specific application.
     * </p>
     * 
     * @param listApplicationVersionsRequest
     * @return A Java Future containing the result of the ListApplicationVersions operation returned by the service.
     * @sample AWSMainframeModernizationAsync.ListApplicationVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListApplicationVersions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationVersionsResult> listApplicationVersionsAsync(ListApplicationVersionsRequest listApplicationVersionsRequest);

    /**
     * <p>
     * Returns a list of the application versions for a specific application.
     * </p>
     * 
     * @param listApplicationVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApplicationVersions operation returned by the service.
     * @sample AWSMainframeModernizationAsyncHandler.ListApplicationVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListApplicationVersions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationVersionsResult> listApplicationVersionsAsync(ListApplicationVersionsRequest listApplicationVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListApplicationVersionsRequest, ListApplicationVersionsResult> asyncHandler);

    /**
     * <p>
     * Lists the applications associated with a specific Amazon Web Services account. You can provide the unique
     * identifier of a specific runtime environment in a query parameter to see all applications associated with that
     * environment.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return A Java Future containing the result of the ListApplications operation returned by the service.
     * @sample AWSMainframeModernizationAsync.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListApplications" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest listApplicationsRequest);

    /**
     * <p>
     * Lists the applications associated with a specific Amazon Web Services account. You can provide the unique
     * identifier of a specific runtime environment in a query parameter to see all applications associated with that
     * environment.
     * </p>
     * 
     * @param listApplicationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApplications operation returned by the service.
     * @sample AWSMainframeModernizationAsyncHandler.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListApplications" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest listApplicationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler);

    /**
     * <p>
     * Lists all the available batch job definitions based on the batch job resources uploaded during the application
     * creation. You can use the batch job definitions in the list to start a batch job.
     * </p>
     * 
     * @param listBatchJobDefinitionsRequest
     * @return A Java Future containing the result of the ListBatchJobDefinitions operation returned by the service.
     * @sample AWSMainframeModernizationAsync.ListBatchJobDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListBatchJobDefinitions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBatchJobDefinitionsResult> listBatchJobDefinitionsAsync(ListBatchJobDefinitionsRequest listBatchJobDefinitionsRequest);

    /**
     * <p>
     * Lists all the available batch job definitions based on the batch job resources uploaded during the application
     * creation. You can use the batch job definitions in the list to start a batch job.
     * </p>
     * 
     * @param listBatchJobDefinitionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBatchJobDefinitions operation returned by the service.
     * @sample AWSMainframeModernizationAsyncHandler.ListBatchJobDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListBatchJobDefinitions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBatchJobDefinitionsResult> listBatchJobDefinitionsAsync(ListBatchJobDefinitionsRequest listBatchJobDefinitionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListBatchJobDefinitionsRequest, ListBatchJobDefinitionsResult> asyncHandler);

    /**
     * <p>
     * Lists historical, current, and scheduled batch job executions for a specific application.
     * </p>
     * 
     * @param listBatchJobExecutionsRequest
     * @return A Java Future containing the result of the ListBatchJobExecutions operation returned by the service.
     * @sample AWSMainframeModernizationAsync.ListBatchJobExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListBatchJobExecutions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBatchJobExecutionsResult> listBatchJobExecutionsAsync(ListBatchJobExecutionsRequest listBatchJobExecutionsRequest);

    /**
     * <p>
     * Lists historical, current, and scheduled batch job executions for a specific application.
     * </p>
     * 
     * @param listBatchJobExecutionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBatchJobExecutions operation returned by the service.
     * @sample AWSMainframeModernizationAsyncHandler.ListBatchJobExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListBatchJobExecutions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBatchJobExecutionsResult> listBatchJobExecutionsAsync(ListBatchJobExecutionsRequest listBatchJobExecutionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListBatchJobExecutionsRequest, ListBatchJobExecutionsResult> asyncHandler);

    /**
     * <p>
     * Lists the data set imports for the specified application.
     * </p>
     * 
     * @param listDataSetImportHistoryRequest
     * @return A Java Future containing the result of the ListDataSetImportHistory operation returned by the service.
     * @sample AWSMainframeModernizationAsync.ListDataSetImportHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListDataSetImportHistory" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDataSetImportHistoryResult> listDataSetImportHistoryAsync(ListDataSetImportHistoryRequest listDataSetImportHistoryRequest);

    /**
     * <p>
     * Lists the data set imports for the specified application.
     * </p>
     * 
     * @param listDataSetImportHistoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDataSetImportHistory operation returned by the service.
     * @sample AWSMainframeModernizationAsyncHandler.ListDataSetImportHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListDataSetImportHistory" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDataSetImportHistoryResult> listDataSetImportHistoryAsync(ListDataSetImportHistoryRequest listDataSetImportHistoryRequest,
            com.amazonaws.handlers.AsyncHandler<ListDataSetImportHistoryRequest, ListDataSetImportHistoryResult> asyncHandler);

    /**
     * <p>
     * Lists the data sets imported for a specific application. In Amazon Web Services Mainframe Modernization, data
     * sets are associated with applications deployed on runtime environments. This is known as importing data sets.
     * Currently, Amazon Web Services Mainframe Modernization can import data sets into catalogs using <a
     * href="https://docs.aws.amazon.com/m2/latest/APIReference/API_CreateDataSetImportTask.html"
     * >CreateDataSetImportTask</a>.
     * </p>
     * 
     * @param listDataSetsRequest
     * @return A Java Future containing the result of the ListDataSets operation returned by the service.
     * @sample AWSMainframeModernizationAsync.ListDataSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListDataSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDataSetsResult> listDataSetsAsync(ListDataSetsRequest listDataSetsRequest);

    /**
     * <p>
     * Lists the data sets imported for a specific application. In Amazon Web Services Mainframe Modernization, data
     * sets are associated with applications deployed on runtime environments. This is known as importing data sets.
     * Currently, Amazon Web Services Mainframe Modernization can import data sets into catalogs using <a
     * href="https://docs.aws.amazon.com/m2/latest/APIReference/API_CreateDataSetImportTask.html"
     * >CreateDataSetImportTask</a>.
     * </p>
     * 
     * @param listDataSetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDataSets operation returned by the service.
     * @sample AWSMainframeModernizationAsyncHandler.ListDataSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListDataSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDataSetsResult> listDataSetsAsync(ListDataSetsRequest listDataSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDataSetsRequest, ListDataSetsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all deployments of a specific application. A deployment is a combination of a specific
     * application and a specific version of that application. Each deployment is mapped to a particular application
     * version.
     * </p>
     * 
     * @param listDeploymentsRequest
     * @return A Java Future containing the result of the ListDeployments operation returned by the service.
     * @sample AWSMainframeModernizationAsync.ListDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListDeployments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(ListDeploymentsRequest listDeploymentsRequest);

    /**
     * <p>
     * Returns a list of all deployments of a specific application. A deployment is a combination of a specific
     * application and a specific version of that application. Each deployment is mapped to a particular application
     * version.
     * </p>
     * 
     * @param listDeploymentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDeployments operation returned by the service.
     * @sample AWSMainframeModernizationAsyncHandler.ListDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListDeployments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(ListDeploymentsRequest listDeploymentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDeploymentsRequest, ListDeploymentsResult> asyncHandler);

    /**
     * <p>
     * Lists the available engine versions.
     * </p>
     * 
     * @param listEngineVersionsRequest
     * @return A Java Future containing the result of the ListEngineVersions operation returned by the service.
     * @sample AWSMainframeModernizationAsync.ListEngineVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListEngineVersions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEngineVersionsResult> listEngineVersionsAsync(ListEngineVersionsRequest listEngineVersionsRequest);

    /**
     * <p>
     * Lists the available engine versions.
     * </p>
     * 
     * @param listEngineVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEngineVersions operation returned by the service.
     * @sample AWSMainframeModernizationAsyncHandler.ListEngineVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListEngineVersions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEngineVersionsResult> listEngineVersionsAsync(ListEngineVersionsRequest listEngineVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEngineVersionsRequest, ListEngineVersionsResult> asyncHandler);

    /**
     * <p>
     * Lists the runtime environments.
     * </p>
     * 
     * @param listEnvironmentsRequest
     * @return A Java Future containing the result of the ListEnvironments operation returned by the service.
     * @sample AWSMainframeModernizationAsync.ListEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListEnvironments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEnvironmentsResult> listEnvironmentsAsync(ListEnvironmentsRequest listEnvironmentsRequest);

    /**
     * <p>
     * Lists the runtime environments.
     * </p>
     * 
     * @param listEnvironmentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEnvironments operation returned by the service.
     * @sample AWSMainframeModernizationAsyncHandler.ListEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListEnvironments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEnvironmentsResult> listEnvironmentsAsync(ListEnvironmentsRequest listEnvironmentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEnvironmentsRequest, ListEnvironmentsResult> asyncHandler);

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSMainframeModernizationAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSMainframeModernizationAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Starts an application that is currently stopped.
     * </p>
     * 
     * @param startApplicationRequest
     * @return A Java Future containing the result of the StartApplication operation returned by the service.
     * @sample AWSMainframeModernizationAsync.StartApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/StartApplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartApplicationResult> startApplicationAsync(StartApplicationRequest startApplicationRequest);

    /**
     * <p>
     * Starts an application that is currently stopped.
     * </p>
     * 
     * @param startApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartApplication operation returned by the service.
     * @sample AWSMainframeModernizationAsyncHandler.StartApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/StartApplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartApplicationResult> startApplicationAsync(StartApplicationRequest startApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<StartApplicationRequest, StartApplicationResult> asyncHandler);

    /**
     * <p>
     * Starts a batch job and returns the unique identifier of this execution of the batch job. The associated
     * application must be running in order to start the batch job.
     * </p>
     * 
     * @param startBatchJobRequest
     * @return A Java Future containing the result of the StartBatchJob operation returned by the service.
     * @sample AWSMainframeModernizationAsync.StartBatchJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/StartBatchJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartBatchJobResult> startBatchJobAsync(StartBatchJobRequest startBatchJobRequest);

    /**
     * <p>
     * Starts a batch job and returns the unique identifier of this execution of the batch job. The associated
     * application must be running in order to start the batch job.
     * </p>
     * 
     * @param startBatchJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartBatchJob operation returned by the service.
     * @sample AWSMainframeModernizationAsyncHandler.StartBatchJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/StartBatchJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartBatchJobResult> startBatchJobAsync(StartBatchJobRequest startBatchJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartBatchJobRequest, StartBatchJobResult> asyncHandler);

    /**
     * <p>
     * Stops a running application.
     * </p>
     * 
     * @param stopApplicationRequest
     * @return A Java Future containing the result of the StopApplication operation returned by the service.
     * @sample AWSMainframeModernizationAsync.StopApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/StopApplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopApplicationResult> stopApplicationAsync(StopApplicationRequest stopApplicationRequest);

    /**
     * <p>
     * Stops a running application.
     * </p>
     * 
     * @param stopApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopApplication operation returned by the service.
     * @sample AWSMainframeModernizationAsyncHandler.StopApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/StopApplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopApplicationResult> stopApplicationAsync(StopApplicationRequest stopApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<StopApplicationRequest, StopApplicationResult> asyncHandler);

    /**
     * <p>
     * Adds one or more tags to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSMainframeModernizationAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds one or more tags to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSMainframeModernizationAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSMainframeModernizationAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSMainframeModernizationAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates an application and creates a new version.
     * </p>
     * 
     * @param updateApplicationRequest
     * @return A Java Future containing the result of the UpdateApplication operation returned by the service.
     * @sample AWSMainframeModernizationAsync.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/UpdateApplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest updateApplicationRequest);

    /**
     * <p>
     * Updates an application and creates a new version.
     * </p>
     * 
     * @param updateApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApplication operation returned by the service.
     * @sample AWSMainframeModernizationAsyncHandler.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/UpdateApplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest updateApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler);

    /**
     * <p>
     * Updates the configuration details for a specific runtime environment.
     * </p>
     * 
     * @param updateEnvironmentRequest
     * @return A Java Future containing the result of the UpdateEnvironment operation returned by the service.
     * @sample AWSMainframeModernizationAsync.UpdateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/UpdateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(UpdateEnvironmentRequest updateEnvironmentRequest);

    /**
     * <p>
     * Updates the configuration details for a specific runtime environment.
     * </p>
     * 
     * @param updateEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEnvironment operation returned by the service.
     * @sample AWSMainframeModernizationAsyncHandler.UpdateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/UpdateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(UpdateEnvironmentRequest updateEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEnvironmentRequest, UpdateEnvironmentResult> asyncHandler);

}
