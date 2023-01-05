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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.mainframemodernization.model.*;

/**
 * Interface for accessing AWSMainframeModernization.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.mainframemodernization.AbstractAWSMainframeModernization} instead.
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
public interface AWSMainframeModernization {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "m2";

    /**
     * <p>
     * Cancels the running of a specific batch job execution.
     * </p>
     * 
     * @param cancelBatchJobExecutionRequest
     * @return Result of the CancelBatchJobExecution operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws ConflictException
     *         The parameters provided in the request conflict with existing resources.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.CancelBatchJobExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/CancelBatchJobExecution" target="_top">AWS API
     *      Documentation</a>
     */
    CancelBatchJobExecutionResult cancelBatchJobExecution(CancelBatchJobExecutionRequest cancelBatchJobExecutionRequest);

    /**
     * <p>
     * Creates a new application with given parameters. Requires an existing runtime environment and application
     * definition file.
     * </p>
     * 
     * @param createApplicationRequest
     * @return Result of the CreateApplication operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws ServiceQuotaExceededException
     *         One or more quotas for Amazon Web Services Mainframe Modernization exceeds the limit.
     * @throws ConflictException
     *         The parameters provided in the request conflict with existing resources.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @sample AWSMainframeModernization.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/CreateApplication" target="_top">AWS API
     *      Documentation</a>
     */
    CreateApplicationResult createApplication(CreateApplicationRequest createApplicationRequest);

    /**
     * <p>
     * Starts a data set import task for a specific application.
     * </p>
     * 
     * @param createDataSetImportTaskRequest
     * @return Result of the CreateDataSetImportTask operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws ServiceQuotaExceededException
     *         One or more quotas for Amazon Web Services Mainframe Modernization exceeds the limit.
     * @throws ConflictException
     *         The parameters provided in the request conflict with existing resources.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.CreateDataSetImportTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/CreateDataSetImportTask" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDataSetImportTaskResult createDataSetImportTask(CreateDataSetImportTaskRequest createDataSetImportTaskRequest);

    /**
     * <p>
     * Creates and starts a deployment to deploy an application into a runtime environment.
     * </p>
     * 
     * @param createDeploymentRequest
     * @return Result of the CreateDeployment operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws ServiceQuotaExceededException
     *         One or more quotas for Amazon Web Services Mainframe Modernization exceeds the limit.
     * @throws ConflictException
     *         The parameters provided in the request conflict with existing resources.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.CreateDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/CreateDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDeploymentResult createDeployment(CreateDeploymentRequest createDeploymentRequest);

    /**
     * <p>
     * Creates a runtime environment for a given runtime engine.
     * </p>
     * 
     * @param createEnvironmentRequest
     * @return Result of the CreateEnvironment operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws ServiceQuotaExceededException
     *         One or more quotas for Amazon Web Services Mainframe Modernization exceeds the limit.
     * @throws ConflictException
     *         The parameters provided in the request conflict with existing resources.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @sample AWSMainframeModernization.CreateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/CreateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    CreateEnvironmentResult createEnvironment(CreateEnvironmentRequest createEnvironmentRequest);

    /**
     * <p>
     * Deletes a specific application. You cannot delete a running application.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @return Result of the DeleteApplication operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws ConflictException
     *         The parameters provided in the request conflict with existing resources.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @sample AWSMainframeModernization.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/DeleteApplication" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteApplicationResult deleteApplication(DeleteApplicationRequest deleteApplicationRequest);

    /**
     * <p>
     * Deletes a specific application from the specific runtime environment where it was previously deployed. You cannot
     * delete a runtime environment using DeleteEnvironment if any application has ever been deployed to it. This API
     * removes the association of the application with the runtime environment so you can delete the environment
     * smoothly.
     * </p>
     * 
     * @param deleteApplicationFromEnvironmentRequest
     * @return Result of the DeleteApplicationFromEnvironment operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws ConflictException
     *         The parameters provided in the request conflict with existing resources.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.DeleteApplicationFromEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/DeleteApplicationFromEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteApplicationFromEnvironmentResult deleteApplicationFromEnvironment(DeleteApplicationFromEnvironmentRequest deleteApplicationFromEnvironmentRequest);

    /**
     * <p>
     * Deletes a specific runtime environment. The environment cannot contain deployed applications. If it does, you
     * must delete those applications before you delete the environment.
     * </p>
     * 
     * @param deleteEnvironmentRequest
     * @return Result of the DeleteEnvironment operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws ConflictException
     *         The parameters provided in the request conflict with existing resources.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @sample AWSMainframeModernization.DeleteEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/DeleteEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteEnvironmentResult deleteEnvironment(DeleteEnvironmentRequest deleteEnvironmentRequest);

    /**
     * <p>
     * Describes the details of a specific application.
     * </p>
     * 
     * @param getApplicationRequest
     * @return Result of the GetApplication operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.GetApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/GetApplication" target="_top">AWS API
     *      Documentation</a>
     */
    GetApplicationResult getApplication(GetApplicationRequest getApplicationRequest);

    /**
     * <p>
     * Returns details about a specific version of a specific application.
     * </p>
     * 
     * @param getApplicationVersionRequest
     * @return Result of the GetApplicationVersion operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.GetApplicationVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/GetApplicationVersion" target="_top">AWS API
     *      Documentation</a>
     */
    GetApplicationVersionResult getApplicationVersion(GetApplicationVersionRequest getApplicationVersionRequest);

    /**
     * <p>
     * Gets the details of a specific batch job execution for a specific application.
     * </p>
     * 
     * @param getBatchJobExecutionRequest
     * @return Result of the GetBatchJobExecution operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.GetBatchJobExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/GetBatchJobExecution" target="_top">AWS API
     *      Documentation</a>
     */
    GetBatchJobExecutionResult getBatchJobExecution(GetBatchJobExecutionRequest getBatchJobExecutionRequest);

    /**
     * <p>
     * Gets the details of a specific data set.
     * </p>
     * 
     * @param getDataSetDetailsRequest
     * @return Result of the GetDataSetDetails operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.GetDataSetDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/GetDataSetDetails" target="_top">AWS API
     *      Documentation</a>
     */
    GetDataSetDetailsResult getDataSetDetails(GetDataSetDetailsRequest getDataSetDetailsRequest);

    /**
     * <p>
     * Gets the status of a data set import task initiated with the <a>CreateDataSetImportTask</a> operation.
     * </p>
     * 
     * @param getDataSetImportTaskRequest
     * @return Result of the GetDataSetImportTask operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.GetDataSetImportTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/GetDataSetImportTask" target="_top">AWS API
     *      Documentation</a>
     */
    GetDataSetImportTaskResult getDataSetImportTask(GetDataSetImportTaskRequest getDataSetImportTaskRequest);

    /**
     * <p>
     * Gets details of a specific deployment with a given deployment identifier.
     * </p>
     * 
     * @param getDeploymentRequest
     * @return Result of the GetDeployment operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.GetDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/GetDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    GetDeploymentResult getDeployment(GetDeploymentRequest getDeploymentRequest);

    /**
     * <p>
     * Describes a specific runtime environment.
     * </p>
     * 
     * @param getEnvironmentRequest
     * @return Result of the GetEnvironment operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.GetEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/GetEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    GetEnvironmentResult getEnvironment(GetEnvironmentRequest getEnvironmentRequest);

    /**
     * <p>
     * Returns a list of the application versions for a specific application.
     * </p>
     * 
     * @param listApplicationVersionsRequest
     * @return Result of the ListApplicationVersions operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.ListApplicationVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListApplicationVersions" target="_top">AWS API
     *      Documentation</a>
     */
    ListApplicationVersionsResult listApplicationVersions(ListApplicationVersionsRequest listApplicationVersionsRequest);

    /**
     * <p>
     * Lists the applications associated with a specific Amazon Web Services account. You can provide the unique
     * identifier of a specific runtime environment in a query parameter to see all applications associated with that
     * environment.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return Result of the ListApplications operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @sample AWSMainframeModernization.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListApplications" target="_top">AWS API
     *      Documentation</a>
     */
    ListApplicationsResult listApplications(ListApplicationsRequest listApplicationsRequest);

    /**
     * <p>
     * Lists all the available batch job definitions based on the batch job resources uploaded during the application
     * creation. You can use the batch job definitions in the list to start a batch job.
     * </p>
     * 
     * @param listBatchJobDefinitionsRequest
     * @return Result of the ListBatchJobDefinitions operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.ListBatchJobDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListBatchJobDefinitions" target="_top">AWS API
     *      Documentation</a>
     */
    ListBatchJobDefinitionsResult listBatchJobDefinitions(ListBatchJobDefinitionsRequest listBatchJobDefinitionsRequest);

    /**
     * <p>
     * Lists historical, current, and scheduled batch job executions for a specific application.
     * </p>
     * 
     * @param listBatchJobExecutionsRequest
     * @return Result of the ListBatchJobExecutions operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.ListBatchJobExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListBatchJobExecutions" target="_top">AWS API
     *      Documentation</a>
     */
    ListBatchJobExecutionsResult listBatchJobExecutions(ListBatchJobExecutionsRequest listBatchJobExecutionsRequest);

    /**
     * <p>
     * Lists the data set imports for the specified application.
     * </p>
     * 
     * @param listDataSetImportHistoryRequest
     * @return Result of the ListDataSetImportHistory operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.ListDataSetImportHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListDataSetImportHistory" target="_top">AWS
     *      API Documentation</a>
     */
    ListDataSetImportHistoryResult listDataSetImportHistory(ListDataSetImportHistoryRequest listDataSetImportHistoryRequest);

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
     * @return Result of the ListDataSets operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.ListDataSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListDataSets" target="_top">AWS API
     *      Documentation</a>
     */
    ListDataSetsResult listDataSets(ListDataSetsRequest listDataSetsRequest);

    /**
     * <p>
     * Returns a list of all deployments of a specific application. A deployment is a combination of a specific
     * application and a specific version of that application. Each deployment is mapped to a particular application
     * version.
     * </p>
     * 
     * @param listDeploymentsRequest
     * @return Result of the ListDeployments operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.ListDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListDeployments" target="_top">AWS API
     *      Documentation</a>
     */
    ListDeploymentsResult listDeployments(ListDeploymentsRequest listDeploymentsRequest);

    /**
     * <p>
     * Lists the available engine versions.
     * </p>
     * 
     * @param listEngineVersionsRequest
     * @return Result of the ListEngineVersions operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @sample AWSMainframeModernization.ListEngineVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListEngineVersions" target="_top">AWS API
     *      Documentation</a>
     */
    ListEngineVersionsResult listEngineVersions(ListEngineVersionsRequest listEngineVersionsRequest);

    /**
     * <p>
     * Lists the runtime environments.
     * </p>
     * 
     * @param listEnvironmentsRequest
     * @return Result of the ListEnvironments operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @sample AWSMainframeModernization.ListEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListEnvironments" target="_top">AWS API
     *      Documentation</a>
     */
    ListEnvironmentsResult listEnvironments(ListEnvironmentsRequest listEnvironmentsRequest);

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Starts an application that is currently stopped.
     * </p>
     * 
     * @param startApplicationRequest
     * @return Result of the StartApplication operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws ConflictException
     *         The parameters provided in the request conflict with existing resources.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.StartApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/StartApplication" target="_top">AWS API
     *      Documentation</a>
     */
    StartApplicationResult startApplication(StartApplicationRequest startApplicationRequest);

    /**
     * <p>
     * Starts a batch job and returns the unique identifier of this execution of the batch job. The associated
     * application must be running in order to start the batch job.
     * </p>
     * 
     * @param startBatchJobRequest
     * @return Result of the StartBatchJob operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws ConflictException
     *         The parameters provided in the request conflict with existing resources.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.StartBatchJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/StartBatchJob" target="_top">AWS API
     *      Documentation</a>
     */
    StartBatchJobResult startBatchJob(StartBatchJobRequest startBatchJobRequest);

    /**
     * <p>
     * Stops a running application.
     * </p>
     * 
     * @param stopApplicationRequest
     * @return Result of the StopApplication operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws ConflictException
     *         The parameters provided in the request conflict with existing resources.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.StopApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/StopApplication" target="_top">AWS API
     *      Documentation</a>
     */
    StopApplicationResult stopApplication(StopApplicationRequest stopApplicationRequest);

    /**
     * <p>
     * Adds one or more tags to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws ServiceQuotaExceededException
     *         One or more quotas for Amazon Web Services Mainframe Modernization exceeds the limit.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates an application and creates a new version.
     * </p>
     * 
     * @param updateApplicationRequest
     * @return Result of the UpdateApplication operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws ConflictException
     *         The parameters provided in the request conflict with existing resources.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/UpdateApplication" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateApplicationResult updateApplication(UpdateApplicationRequest updateApplicationRequest);

    /**
     * <p>
     * Updates the configuration details for a specific runtime environment.
     * </p>
     * 
     * @param updateEnvironmentRequest
     * @return Result of the UpdateEnvironment operation returned by the service.
     * @throws ValidationException
     *         One or more parameters provided in the request is not valid.
     * @throws ServiceQuotaExceededException
     *         One or more quotas for Amazon Web Services Mainframe Modernization exceeds the limit.
     * @throws ConflictException
     *         The parameters provided in the request conflict with existing resources.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws AccessDeniedException
     *         The account or role doesn't have the right permissions to make the request.
     * @throws ThrottlingException
     *         The number of requests made exceeds the limit.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSMainframeModernization.UpdateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/UpdateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateEnvironmentResult updateEnvironment(UpdateEnvironmentRequest updateEnvironmentRequest);

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
