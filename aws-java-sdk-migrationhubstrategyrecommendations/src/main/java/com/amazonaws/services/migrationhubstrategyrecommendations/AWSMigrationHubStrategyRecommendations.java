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
package com.amazonaws.services.migrationhubstrategyrecommendations;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.migrationhubstrategyrecommendations.model.*;

/**
 * Interface for accessing Migration Hub Strategy Recommendations.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.migrationhubstrategyrecommendations.AbstractAWSMigrationHubStrategyRecommendations}
 * instead.
 * </p>
 * <p>
 * <p>
 * <fullname>Migration Hub Strategy Recommendations</fullname>
 * </p>
 * 
 * <pre>
 * <code> &lt;p&gt;This API reference provides descriptions, syntax, and other details about each of the actions and data types for Migration Hub Strategy Recommendations (Strategy Recommendations). The topic for each action shows the API request parameters and the response. Alternatively, you can use one of the AWS SDKs to access an API that is tailored to the programming language or platform that you're using. For more information, see &lt;a href=&quot;http://aws.amazon.com/tools/#SDKs&quot;&gt;AWS SDKs&lt;/a&gt;.&lt;/p&gt; </code>
 * </pre>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSMigrationHubStrategyRecommendations {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "migrationhub-strategy";

    /**
     * <p>
     * Retrieves details about an application component.
     * </p>
     * 
     * @param getApplicationComponentDetailsRequest
     * @return Result of the GetApplicationComponentDetails operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified ID in the request is not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.GetApplicationComponentDetails
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetApplicationComponentDetails"
     *      target="_top">AWS API Documentation</a>
     */
    GetApplicationComponentDetailsResult getApplicationComponentDetails(GetApplicationComponentDetailsRequest getApplicationComponentDetailsRequest);

    /**
     * <p>
     * Retrieves a list of all the recommended strategies and tools for an application component running on a server.
     * </p>
     * 
     * @param getApplicationComponentStrategiesRequest
     * @return Result of the GetApplicationComponentStrategies operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified ID in the request is not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.GetApplicationComponentStrategies
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetApplicationComponentStrategies"
     *      target="_top">AWS API Documentation</a>
     */
    GetApplicationComponentStrategiesResult getApplicationComponentStrategies(GetApplicationComponentStrategiesRequest getApplicationComponentStrategiesRequest);

    /**
     * <p>
     * Retrieves the status of an on-going assessment.
     * </p>
     * 
     * @param getAssessmentRequest
     * @return Result of the GetAssessment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified ID in the request is not found.
     * @throws AccessDeniedException
     *         The AWS user account does not have permission to perform the action. Check the AWS Identity and Access
     *         Management (IAM) policy associated with this account.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.GetAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    GetAssessmentResult getAssessment(GetAssessmentRequest getAssessmentRequest);

    /**
     * <p>
     * Retrieves the details about a specific import task.
     * </p>
     * 
     * @param getImportFileTaskRequest
     * @return Result of the GetImportFileTask operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified ID in the request is not found.
     * @throws AccessDeniedException
     *         The AWS user account does not have permission to perform the action. Check the AWS Identity and Access
     *         Management (IAM) policy associated with this account.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The request body isn't valid.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.GetImportFileTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetImportFileTask"
     *      target="_top">AWS API Documentation</a>
     */
    GetImportFileTaskResult getImportFileTask(GetImportFileTaskRequest getImportFileTaskRequest);

    /**
     * <p>
     * Retrieve the latest ID of a specific assessment task.
     * </p>
     * 
     * @param getLatestAssessmentIdRequest
     * @return Result of the GetLatestAssessmentId operation returned by the service.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws AccessDeniedException
     *         The AWS user account does not have permission to perform the action. Check the AWS Identity and Access
     *         Management (IAM) policy associated with this account.
     * @throws ValidationException
     *         The request body isn't valid.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.GetLatestAssessmentId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetLatestAssessmentId"
     *      target="_top">AWS API Documentation</a>
     */
    GetLatestAssessmentIdResult getLatestAssessmentId(GetLatestAssessmentIdRequest getLatestAssessmentIdRequest);

    /**
     * <p>
     * Retrieves your migration and modernization preferences.
     * </p>
     * 
     * @param getPortfolioPreferencesRequest
     * @return Result of the GetPortfolioPreferences operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified ID in the request is not found.
     * @throws AccessDeniedException
     *         The AWS user account does not have permission to perform the action. Check the AWS Identity and Access
     *         Management (IAM) policy associated with this account.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.GetPortfolioPreferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetPortfolioPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    GetPortfolioPreferencesResult getPortfolioPreferences(GetPortfolioPreferencesRequest getPortfolioPreferencesRequest);

    /**
     * <p>
     * Retrieves overall summary including the number of servers to rehost and the overall number of anti-patterns.
     * </p>
     * 
     * @param getPortfolioSummaryRequest
     * @return Result of the GetPortfolioSummary operation returned by the service.
     * @throws AccessDeniedException
     *         The AWS user account does not have permission to perform the action. Check the AWS Identity and Access
     *         Management (IAM) policy associated with this account.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.GetPortfolioSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetPortfolioSummary"
     *      target="_top">AWS API Documentation</a>
     */
    GetPortfolioSummaryResult getPortfolioSummary(GetPortfolioSummaryRequest getPortfolioSummaryRequest);

    /**
     * <p>
     * Retrieves detailed information about the specified recommendation report.
     * </p>
     * 
     * @param getRecommendationReportDetailsRequest
     * @return Result of the GetRecommendationReportDetails operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified ID in the request is not found.
     * @throws AccessDeniedException
     *         The AWS user account does not have permission to perform the action. Check the AWS Identity and Access
     *         Management (IAM) policy associated with this account.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The request body isn't valid.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.GetRecommendationReportDetails
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetRecommendationReportDetails"
     *      target="_top">AWS API Documentation</a>
     */
    GetRecommendationReportDetailsResult getRecommendationReportDetails(GetRecommendationReportDetailsRequest getRecommendationReportDetailsRequest);

    /**
     * <p>
     * Retrieves detailed information about a specified server.
     * </p>
     * 
     * @param getServerDetailsRequest
     * @return Result of the GetServerDetails operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified ID in the request is not found.
     * @throws AccessDeniedException
     *         The AWS user account does not have permission to perform the action. Check the AWS Identity and Access
     *         Management (IAM) policy associated with this account.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The request body isn't valid.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.GetServerDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetServerDetails"
     *      target="_top">AWS API Documentation</a>
     */
    GetServerDetailsResult getServerDetails(GetServerDetailsRequest getServerDetailsRequest);

    /**
     * <p>
     * Retrieves recommended strategies and tools for the specified server.
     * </p>
     * 
     * @param getServerStrategiesRequest
     * @return Result of the GetServerStrategies operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified ID in the request is not found.
     * @throws AccessDeniedException
     *         The AWS user account does not have permission to perform the action. Check the AWS Identity and Access
     *         Management (IAM) policy associated with this account.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The request body isn't valid.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.GetServerStrategies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetServerStrategies"
     *      target="_top">AWS API Documentation</a>
     */
    GetServerStrategiesResult getServerStrategies(GetServerStrategiesRequest getServerStrategiesRequest);

    /**
     * <p>
     * Retrieves a list of all the application components (processes).
     * </p>
     * 
     * @param listApplicationComponentsRequest
     * @return Result of the ListApplicationComponents operation returned by the service.
     * @throws AccessDeniedException
     *         The AWS user account does not have permission to perform the action. Check the AWS Identity and Access
     *         Management (IAM) policy associated with this account.
     * @throws ServiceLinkedRoleLockClientException
     *         Exception to indicate that the service-linked role (SLR) is locked.
     * @throws ValidationException
     *         The request body isn't valid.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.ListApplicationComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/ListApplicationComponents"
     *      target="_top">AWS API Documentation</a>
     */
    ListApplicationComponentsResult listApplicationComponents(ListApplicationComponentsRequest listApplicationComponentsRequest);

    /**
     * <p>
     * Retrieves a list of all the installed collectors.
     * </p>
     * 
     * @param listCollectorsRequest
     * @return Result of the ListCollectors operation returned by the service.
     * @throws AccessDeniedException
     *         The AWS user account does not have permission to perform the action. Check the AWS Identity and Access
     *         Management (IAM) policy associated with this account.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The request body isn't valid.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.ListCollectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/ListCollectors"
     *      target="_top">AWS API Documentation</a>
     */
    ListCollectorsResult listCollectors(ListCollectorsRequest listCollectorsRequest);

    /**
     * <p>
     * Retrieves a list of all the imports performed.
     * </p>
     * 
     * @param listImportFileTaskRequest
     * @return Result of the ListImportFileTask operation returned by the service.
     * @throws AccessDeniedException
     *         The AWS user account does not have permission to perform the action. Check the AWS Identity and Access
     *         Management (IAM) policy associated with this account.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The request body isn't valid.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.ListImportFileTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/ListImportFileTask"
     *      target="_top">AWS API Documentation</a>
     */
    ListImportFileTaskResult listImportFileTask(ListImportFileTaskRequest listImportFileTaskRequest);

    /**
     * <p>
     * Returns a list of all the servers.
     * </p>
     * 
     * @param listServersRequest
     * @return Result of the ListServers operation returned by the service.
     * @throws AccessDeniedException
     *         The AWS user account does not have permission to perform the action. Check the AWS Identity and Access
     *         Management (IAM) policy associated with this account.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The request body isn't valid.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.ListServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/ListServers"
     *      target="_top">AWS API Documentation</a>
     */
    ListServersResult listServers(ListServersRequest listServersRequest);

    /**
     * <p>
     * Saves the specified migration and modernization preferences.
     * </p>
     * 
     * @param putPortfolioPreferencesRequest
     * @return Result of the PutPortfolioPreferences operation returned by the service.
     * @throws AccessDeniedException
     *         The AWS user account does not have permission to perform the action. Check the AWS Identity and Access
     *         Management (IAM) policy associated with this account.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The request body isn't valid.
     * @throws ConflictException
     *         Exception to indicate that there is an ongoing task when a new task is created. Return when once the
     *         existing tasks are complete.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.PutPortfolioPreferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/PutPortfolioPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    PutPortfolioPreferencesResult putPortfolioPreferences(PutPortfolioPreferencesRequest putPortfolioPreferencesRequest);

    /**
     * <p>
     * Starts the assessment of an on-premises environment.
     * </p>
     * 
     * @param startAssessmentRequest
     * @return Result of the StartAssessment operation returned by the service.
     * @throws AccessDeniedException
     *         The AWS user account does not have permission to perform the action. Check the AWS Identity and Access
     *         Management (IAM) policy associated with this account.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The AWS account has reached its quota of imports. Contact AWS Support to increase the quota for this
     *         account.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.StartAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/StartAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    StartAssessmentResult startAssessment(StartAssessmentRequest startAssessmentRequest);

    /**
     * <p>
     * Starts a file import.
     * </p>
     * 
     * @param startImportFileTaskRequest
     * @return Result of the StartImportFileTask operation returned by the service.
     * @throws AccessDeniedException
     *         The AWS user account does not have permission to perform the action. Check the AWS Identity and Access
     *         Management (IAM) policy associated with this account.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The AWS account has reached its quota of imports. Contact AWS Support to increase the quota for this
     *         account.
     * @throws ValidationException
     *         The request body isn't valid.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.StartImportFileTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/StartImportFileTask"
     *      target="_top">AWS API Documentation</a>
     */
    StartImportFileTaskResult startImportFileTask(StartImportFileTaskRequest startImportFileTaskRequest);

    /**
     * <p>
     * Starts generating a recommendation report.
     * </p>
     * 
     * @param startRecommendationReportGenerationRequest
     * @return Result of the StartRecommendationReportGeneration operation returned by the service.
     * @throws AccessDeniedException
     *         The AWS user account does not have permission to perform the action. Check the AWS Identity and Access
     *         Management (IAM) policy associated with this account.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The request body isn't valid.
     * @throws ConflictException
     *         Exception to indicate that there is an ongoing task when a new task is created. Return when once the
     *         existing tasks are complete.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.StartRecommendationReportGeneration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/StartRecommendationReportGeneration"
     *      target="_top">AWS API Documentation</a>
     */
    StartRecommendationReportGenerationResult startRecommendationReportGeneration(
            StartRecommendationReportGenerationRequest startRecommendationReportGenerationRequest);

    /**
     * <p>
     * Stops the assessment of an on-premises environment.
     * </p>
     * 
     * @param stopAssessmentRequest
     * @return Result of the StopAssessment operation returned by the service.
     * @throws AccessDeniedException
     *         The AWS user account does not have permission to perform the action. Check the AWS Identity and Access
     *         Management (IAM) policy associated with this account.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The request body isn't valid.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.StopAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/StopAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    StopAssessmentResult stopAssessment(StopAssessmentRequest stopAssessmentRequest);

    /**
     * <p>
     * Updates the configuration of an application component.
     * </p>
     * 
     * @param updateApplicationComponentConfigRequest
     * @return Result of the UpdateApplicationComponentConfig operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified ID in the request is not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The request body isn't valid.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.UpdateApplicationComponentConfig
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/UpdateApplicationComponentConfig"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateApplicationComponentConfigResult updateApplicationComponentConfig(UpdateApplicationComponentConfigRequest updateApplicationComponentConfigRequest);

    /**
     * <p>
     * Updates the configuration of the specified server.
     * </p>
     * 
     * @param updateServerConfigRequest
     * @return Result of the UpdateServerConfig operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified ID in the request is not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The request body isn't valid.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.UpdateServerConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/UpdateServerConfig"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateServerConfigResult updateServerConfig(UpdateServerConfigRequest updateServerConfigRequest);

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
