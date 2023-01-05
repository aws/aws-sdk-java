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

import com.amazonaws.services.migrationhubstrategyrecommendations.model.*;

/**
 * Interface for accessing Migration Hub Strategy Recommendations asynchronously. Each asynchronous method will return a
 * Java Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be
 * used to receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.migrationhubstrategyrecommendations.AbstractAWSMigrationHubStrategyRecommendationsAsync}
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
public interface AWSMigrationHubStrategyRecommendationsAsync extends AWSMigrationHubStrategyRecommendations {

    /**
     * <p>
     * Retrieves details about an application component.
     * </p>
     * 
     * @param getApplicationComponentDetailsRequest
     * @return A Java Future containing the result of the GetApplicationComponentDetails operation returned by the
     *         service.
     * @sample AWSMigrationHubStrategyRecommendationsAsync.GetApplicationComponentDetails
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetApplicationComponentDetails"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationComponentDetailsResult> getApplicationComponentDetailsAsync(
            GetApplicationComponentDetailsRequest getApplicationComponentDetailsRequest);

    /**
     * <p>
     * Retrieves details about an application component.
     * </p>
     * 
     * @param getApplicationComponentDetailsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApplicationComponentDetails operation returned by the
     *         service.
     * @sample AWSMigrationHubStrategyRecommendationsAsyncHandler.GetApplicationComponentDetails
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetApplicationComponentDetails"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationComponentDetailsResult> getApplicationComponentDetailsAsync(
            GetApplicationComponentDetailsRequest getApplicationComponentDetailsRequest,
            com.amazonaws.handlers.AsyncHandler<GetApplicationComponentDetailsRequest, GetApplicationComponentDetailsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of all the recommended strategies and tools for an application component running on a server.
     * </p>
     * 
     * @param getApplicationComponentStrategiesRequest
     * @return A Java Future containing the result of the GetApplicationComponentStrategies operation returned by the
     *         service.
     * @sample AWSMigrationHubStrategyRecommendationsAsync.GetApplicationComponentStrategies
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetApplicationComponentStrategies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationComponentStrategiesResult> getApplicationComponentStrategiesAsync(
            GetApplicationComponentStrategiesRequest getApplicationComponentStrategiesRequest);

    /**
     * <p>
     * Retrieves a list of all the recommended strategies and tools for an application component running on a server.
     * </p>
     * 
     * @param getApplicationComponentStrategiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApplicationComponentStrategies operation returned by the
     *         service.
     * @sample AWSMigrationHubStrategyRecommendationsAsyncHandler.GetApplicationComponentStrategies
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetApplicationComponentStrategies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationComponentStrategiesResult> getApplicationComponentStrategiesAsync(
            GetApplicationComponentStrategiesRequest getApplicationComponentStrategiesRequest,
            com.amazonaws.handlers.AsyncHandler<GetApplicationComponentStrategiesRequest, GetApplicationComponentStrategiesResult> asyncHandler);

    /**
     * <p>
     * Retrieves the status of an on-going assessment.
     * </p>
     * 
     * @param getAssessmentRequest
     * @return A Java Future containing the result of the GetAssessment operation returned by the service.
     * @sample AWSMigrationHubStrategyRecommendationsAsync.GetAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAssessmentResult> getAssessmentAsync(GetAssessmentRequest getAssessmentRequest);

    /**
     * <p>
     * Retrieves the status of an on-going assessment.
     * </p>
     * 
     * @param getAssessmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAssessment operation returned by the service.
     * @sample AWSMigrationHubStrategyRecommendationsAsyncHandler.GetAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAssessmentResult> getAssessmentAsync(GetAssessmentRequest getAssessmentRequest,
            com.amazonaws.handlers.AsyncHandler<GetAssessmentRequest, GetAssessmentResult> asyncHandler);

    /**
     * <p>
     * Retrieves the details about a specific import task.
     * </p>
     * 
     * @param getImportFileTaskRequest
     * @return A Java Future containing the result of the GetImportFileTask operation returned by the service.
     * @sample AWSMigrationHubStrategyRecommendationsAsync.GetImportFileTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetImportFileTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetImportFileTaskResult> getImportFileTaskAsync(GetImportFileTaskRequest getImportFileTaskRequest);

    /**
     * <p>
     * Retrieves the details about a specific import task.
     * </p>
     * 
     * @param getImportFileTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetImportFileTask operation returned by the service.
     * @sample AWSMigrationHubStrategyRecommendationsAsyncHandler.GetImportFileTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetImportFileTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetImportFileTaskResult> getImportFileTaskAsync(GetImportFileTaskRequest getImportFileTaskRequest,
            com.amazonaws.handlers.AsyncHandler<GetImportFileTaskRequest, GetImportFileTaskResult> asyncHandler);

    /**
     * <p>
     * Retrieve the latest ID of a specific assessment task.
     * </p>
     * 
     * @param getLatestAssessmentIdRequest
     * @return A Java Future containing the result of the GetLatestAssessmentId operation returned by the service.
     * @sample AWSMigrationHubStrategyRecommendationsAsync.GetLatestAssessmentId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetLatestAssessmentId"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLatestAssessmentIdResult> getLatestAssessmentIdAsync(GetLatestAssessmentIdRequest getLatestAssessmentIdRequest);

    /**
     * <p>
     * Retrieve the latest ID of a specific assessment task.
     * </p>
     * 
     * @param getLatestAssessmentIdRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLatestAssessmentId operation returned by the service.
     * @sample AWSMigrationHubStrategyRecommendationsAsyncHandler.GetLatestAssessmentId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetLatestAssessmentId"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLatestAssessmentIdResult> getLatestAssessmentIdAsync(GetLatestAssessmentIdRequest getLatestAssessmentIdRequest,
            com.amazonaws.handlers.AsyncHandler<GetLatestAssessmentIdRequest, GetLatestAssessmentIdResult> asyncHandler);

    /**
     * <p>
     * Retrieves your migration and modernization preferences.
     * </p>
     * 
     * @param getPortfolioPreferencesRequest
     * @return A Java Future containing the result of the GetPortfolioPreferences operation returned by the service.
     * @sample AWSMigrationHubStrategyRecommendationsAsync.GetPortfolioPreferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetPortfolioPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPortfolioPreferencesResult> getPortfolioPreferencesAsync(GetPortfolioPreferencesRequest getPortfolioPreferencesRequest);

    /**
     * <p>
     * Retrieves your migration and modernization preferences.
     * </p>
     * 
     * @param getPortfolioPreferencesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPortfolioPreferences operation returned by the service.
     * @sample AWSMigrationHubStrategyRecommendationsAsyncHandler.GetPortfolioPreferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetPortfolioPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPortfolioPreferencesResult> getPortfolioPreferencesAsync(GetPortfolioPreferencesRequest getPortfolioPreferencesRequest,
            com.amazonaws.handlers.AsyncHandler<GetPortfolioPreferencesRequest, GetPortfolioPreferencesResult> asyncHandler);

    /**
     * <p>
     * Retrieves overall summary including the number of servers to rehost and the overall number of anti-patterns.
     * </p>
     * 
     * @param getPortfolioSummaryRequest
     * @return A Java Future containing the result of the GetPortfolioSummary operation returned by the service.
     * @sample AWSMigrationHubStrategyRecommendationsAsync.GetPortfolioSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetPortfolioSummary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPortfolioSummaryResult> getPortfolioSummaryAsync(GetPortfolioSummaryRequest getPortfolioSummaryRequest);

    /**
     * <p>
     * Retrieves overall summary including the number of servers to rehost and the overall number of anti-patterns.
     * </p>
     * 
     * @param getPortfolioSummaryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPortfolioSummary operation returned by the service.
     * @sample AWSMigrationHubStrategyRecommendationsAsyncHandler.GetPortfolioSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetPortfolioSummary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPortfolioSummaryResult> getPortfolioSummaryAsync(GetPortfolioSummaryRequest getPortfolioSummaryRequest,
            com.amazonaws.handlers.AsyncHandler<GetPortfolioSummaryRequest, GetPortfolioSummaryResult> asyncHandler);

    /**
     * <p>
     * Retrieves detailed information about the specified recommendation report.
     * </p>
     * 
     * @param getRecommendationReportDetailsRequest
     * @return A Java Future containing the result of the GetRecommendationReportDetails operation returned by the
     *         service.
     * @sample AWSMigrationHubStrategyRecommendationsAsync.GetRecommendationReportDetails
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetRecommendationReportDetails"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRecommendationReportDetailsResult> getRecommendationReportDetailsAsync(
            GetRecommendationReportDetailsRequest getRecommendationReportDetailsRequest);

    /**
     * <p>
     * Retrieves detailed information about the specified recommendation report.
     * </p>
     * 
     * @param getRecommendationReportDetailsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRecommendationReportDetails operation returned by the
     *         service.
     * @sample AWSMigrationHubStrategyRecommendationsAsyncHandler.GetRecommendationReportDetails
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetRecommendationReportDetails"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRecommendationReportDetailsResult> getRecommendationReportDetailsAsync(
            GetRecommendationReportDetailsRequest getRecommendationReportDetailsRequest,
            com.amazonaws.handlers.AsyncHandler<GetRecommendationReportDetailsRequest, GetRecommendationReportDetailsResult> asyncHandler);

    /**
     * <p>
     * Retrieves detailed information about a specified server.
     * </p>
     * 
     * @param getServerDetailsRequest
     * @return A Java Future containing the result of the GetServerDetails operation returned by the service.
     * @sample AWSMigrationHubStrategyRecommendationsAsync.GetServerDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetServerDetails"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetServerDetailsResult> getServerDetailsAsync(GetServerDetailsRequest getServerDetailsRequest);

    /**
     * <p>
     * Retrieves detailed information about a specified server.
     * </p>
     * 
     * @param getServerDetailsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetServerDetails operation returned by the service.
     * @sample AWSMigrationHubStrategyRecommendationsAsyncHandler.GetServerDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetServerDetails"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetServerDetailsResult> getServerDetailsAsync(GetServerDetailsRequest getServerDetailsRequest,
            com.amazonaws.handlers.AsyncHandler<GetServerDetailsRequest, GetServerDetailsResult> asyncHandler);

    /**
     * <p>
     * Retrieves recommended strategies and tools for the specified server.
     * </p>
     * 
     * @param getServerStrategiesRequest
     * @return A Java Future containing the result of the GetServerStrategies operation returned by the service.
     * @sample AWSMigrationHubStrategyRecommendationsAsync.GetServerStrategies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetServerStrategies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetServerStrategiesResult> getServerStrategiesAsync(GetServerStrategiesRequest getServerStrategiesRequest);

    /**
     * <p>
     * Retrieves recommended strategies and tools for the specified server.
     * </p>
     * 
     * @param getServerStrategiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetServerStrategies operation returned by the service.
     * @sample AWSMigrationHubStrategyRecommendationsAsyncHandler.GetServerStrategies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetServerStrategies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetServerStrategiesResult> getServerStrategiesAsync(GetServerStrategiesRequest getServerStrategiesRequest,
            com.amazonaws.handlers.AsyncHandler<GetServerStrategiesRequest, GetServerStrategiesResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of all the application components (processes).
     * </p>
     * 
     * @param listApplicationComponentsRequest
     * @return A Java Future containing the result of the ListApplicationComponents operation returned by the service.
     * @sample AWSMigrationHubStrategyRecommendationsAsync.ListApplicationComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/ListApplicationComponents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationComponentsResult> listApplicationComponentsAsync(
            ListApplicationComponentsRequest listApplicationComponentsRequest);

    /**
     * <p>
     * Retrieves a list of all the application components (processes).
     * </p>
     * 
     * @param listApplicationComponentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApplicationComponents operation returned by the service.
     * @sample AWSMigrationHubStrategyRecommendationsAsyncHandler.ListApplicationComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/ListApplicationComponents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationComponentsResult> listApplicationComponentsAsync(
            ListApplicationComponentsRequest listApplicationComponentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListApplicationComponentsRequest, ListApplicationComponentsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of all the installed collectors.
     * </p>
     * 
     * @param listCollectorsRequest
     * @return A Java Future containing the result of the ListCollectors operation returned by the service.
     * @sample AWSMigrationHubStrategyRecommendationsAsync.ListCollectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/ListCollectors"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCollectorsResult> listCollectorsAsync(ListCollectorsRequest listCollectorsRequest);

    /**
     * <p>
     * Retrieves a list of all the installed collectors.
     * </p>
     * 
     * @param listCollectorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCollectors operation returned by the service.
     * @sample AWSMigrationHubStrategyRecommendationsAsyncHandler.ListCollectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/ListCollectors"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCollectorsResult> listCollectorsAsync(ListCollectorsRequest listCollectorsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCollectorsRequest, ListCollectorsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of all the imports performed.
     * </p>
     * 
     * @param listImportFileTaskRequest
     * @return A Java Future containing the result of the ListImportFileTask operation returned by the service.
     * @sample AWSMigrationHubStrategyRecommendationsAsync.ListImportFileTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/ListImportFileTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListImportFileTaskResult> listImportFileTaskAsync(ListImportFileTaskRequest listImportFileTaskRequest);

    /**
     * <p>
     * Retrieves a list of all the imports performed.
     * </p>
     * 
     * @param listImportFileTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListImportFileTask operation returned by the service.
     * @sample AWSMigrationHubStrategyRecommendationsAsyncHandler.ListImportFileTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/ListImportFileTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListImportFileTaskResult> listImportFileTaskAsync(ListImportFileTaskRequest listImportFileTaskRequest,
            com.amazonaws.handlers.AsyncHandler<ListImportFileTaskRequest, ListImportFileTaskResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all the servers.
     * </p>
     * 
     * @param listServersRequest
     * @return A Java Future containing the result of the ListServers operation returned by the service.
     * @sample AWSMigrationHubStrategyRecommendationsAsync.ListServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/ListServers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServersResult> listServersAsync(ListServersRequest listServersRequest);

    /**
     * <p>
     * Returns a list of all the servers.
     * </p>
     * 
     * @param listServersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListServers operation returned by the service.
     * @sample AWSMigrationHubStrategyRecommendationsAsyncHandler.ListServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/ListServers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServersResult> listServersAsync(ListServersRequest listServersRequest,
            com.amazonaws.handlers.AsyncHandler<ListServersRequest, ListServersResult> asyncHandler);

    /**
     * <p>
     * Saves the specified migration and modernization preferences.
     * </p>
     * 
     * @param putPortfolioPreferencesRequest
     * @return A Java Future containing the result of the PutPortfolioPreferences operation returned by the service.
     * @sample AWSMigrationHubStrategyRecommendationsAsync.PutPortfolioPreferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/PutPortfolioPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutPortfolioPreferencesResult> putPortfolioPreferencesAsync(PutPortfolioPreferencesRequest putPortfolioPreferencesRequest);

    /**
     * <p>
     * Saves the specified migration and modernization preferences.
     * </p>
     * 
     * @param putPortfolioPreferencesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutPortfolioPreferences operation returned by the service.
     * @sample AWSMigrationHubStrategyRecommendationsAsyncHandler.PutPortfolioPreferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/PutPortfolioPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutPortfolioPreferencesResult> putPortfolioPreferencesAsync(PutPortfolioPreferencesRequest putPortfolioPreferencesRequest,
            com.amazonaws.handlers.AsyncHandler<PutPortfolioPreferencesRequest, PutPortfolioPreferencesResult> asyncHandler);

    /**
     * <p>
     * Starts the assessment of an on-premises environment.
     * </p>
     * 
     * @param startAssessmentRequest
     * @return A Java Future containing the result of the StartAssessment operation returned by the service.
     * @sample AWSMigrationHubStrategyRecommendationsAsync.StartAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/StartAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartAssessmentResult> startAssessmentAsync(StartAssessmentRequest startAssessmentRequest);

    /**
     * <p>
     * Starts the assessment of an on-premises environment.
     * </p>
     * 
     * @param startAssessmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartAssessment operation returned by the service.
     * @sample AWSMigrationHubStrategyRecommendationsAsyncHandler.StartAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/StartAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartAssessmentResult> startAssessmentAsync(StartAssessmentRequest startAssessmentRequest,
            com.amazonaws.handlers.AsyncHandler<StartAssessmentRequest, StartAssessmentResult> asyncHandler);

    /**
     * <p>
     * Starts a file import.
     * </p>
     * 
     * @param startImportFileTaskRequest
     * @return A Java Future containing the result of the StartImportFileTask operation returned by the service.
     * @sample AWSMigrationHubStrategyRecommendationsAsync.StartImportFileTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/StartImportFileTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartImportFileTaskResult> startImportFileTaskAsync(StartImportFileTaskRequest startImportFileTaskRequest);

    /**
     * <p>
     * Starts a file import.
     * </p>
     * 
     * @param startImportFileTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartImportFileTask operation returned by the service.
     * @sample AWSMigrationHubStrategyRecommendationsAsyncHandler.StartImportFileTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/StartImportFileTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartImportFileTaskResult> startImportFileTaskAsync(StartImportFileTaskRequest startImportFileTaskRequest,
            com.amazonaws.handlers.AsyncHandler<StartImportFileTaskRequest, StartImportFileTaskResult> asyncHandler);

    /**
     * <p>
     * Starts generating a recommendation report.
     * </p>
     * 
     * @param startRecommendationReportGenerationRequest
     * @return A Java Future containing the result of the StartRecommendationReportGeneration operation returned by the
     *         service.
     * @sample AWSMigrationHubStrategyRecommendationsAsync.StartRecommendationReportGeneration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/StartRecommendationReportGeneration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartRecommendationReportGenerationResult> startRecommendationReportGenerationAsync(
            StartRecommendationReportGenerationRequest startRecommendationReportGenerationRequest);

    /**
     * <p>
     * Starts generating a recommendation report.
     * </p>
     * 
     * @param startRecommendationReportGenerationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartRecommendationReportGeneration operation returned by the
     *         service.
     * @sample AWSMigrationHubStrategyRecommendationsAsyncHandler.StartRecommendationReportGeneration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/StartRecommendationReportGeneration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartRecommendationReportGenerationResult> startRecommendationReportGenerationAsync(
            StartRecommendationReportGenerationRequest startRecommendationReportGenerationRequest,
            com.amazonaws.handlers.AsyncHandler<StartRecommendationReportGenerationRequest, StartRecommendationReportGenerationResult> asyncHandler);

    /**
     * <p>
     * Stops the assessment of an on-premises environment.
     * </p>
     * 
     * @param stopAssessmentRequest
     * @return A Java Future containing the result of the StopAssessment operation returned by the service.
     * @sample AWSMigrationHubStrategyRecommendationsAsync.StopAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/StopAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopAssessmentResult> stopAssessmentAsync(StopAssessmentRequest stopAssessmentRequest);

    /**
     * <p>
     * Stops the assessment of an on-premises environment.
     * </p>
     * 
     * @param stopAssessmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopAssessment operation returned by the service.
     * @sample AWSMigrationHubStrategyRecommendationsAsyncHandler.StopAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/StopAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopAssessmentResult> stopAssessmentAsync(StopAssessmentRequest stopAssessmentRequest,
            com.amazonaws.handlers.AsyncHandler<StopAssessmentRequest, StopAssessmentResult> asyncHandler);

    /**
     * <p>
     * Updates the configuration of an application component.
     * </p>
     * 
     * @param updateApplicationComponentConfigRequest
     * @return A Java Future containing the result of the UpdateApplicationComponentConfig operation returned by the
     *         service.
     * @sample AWSMigrationHubStrategyRecommendationsAsync.UpdateApplicationComponentConfig
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/UpdateApplicationComponentConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApplicationComponentConfigResult> updateApplicationComponentConfigAsync(
            UpdateApplicationComponentConfigRequest updateApplicationComponentConfigRequest);

    /**
     * <p>
     * Updates the configuration of an application component.
     * </p>
     * 
     * @param updateApplicationComponentConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApplicationComponentConfig operation returned by the
     *         service.
     * @sample AWSMigrationHubStrategyRecommendationsAsyncHandler.UpdateApplicationComponentConfig
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/UpdateApplicationComponentConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApplicationComponentConfigResult> updateApplicationComponentConfigAsync(
            UpdateApplicationComponentConfigRequest updateApplicationComponentConfigRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApplicationComponentConfigRequest, UpdateApplicationComponentConfigResult> asyncHandler);

    /**
     * <p>
     * Updates the configuration of the specified server.
     * </p>
     * 
     * @param updateServerConfigRequest
     * @return A Java Future containing the result of the UpdateServerConfig operation returned by the service.
     * @sample AWSMigrationHubStrategyRecommendationsAsync.UpdateServerConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/UpdateServerConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateServerConfigResult> updateServerConfigAsync(UpdateServerConfigRequest updateServerConfigRequest);

    /**
     * <p>
     * Updates the configuration of the specified server.
     * </p>
     * 
     * @param updateServerConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateServerConfig operation returned by the service.
     * @sample AWSMigrationHubStrategyRecommendationsAsyncHandler.UpdateServerConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/UpdateServerConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateServerConfigResult> updateServerConfigAsync(UpdateServerConfigRequest updateServerConfigRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateServerConfigRequest, UpdateServerConfigResult> asyncHandler);

}
