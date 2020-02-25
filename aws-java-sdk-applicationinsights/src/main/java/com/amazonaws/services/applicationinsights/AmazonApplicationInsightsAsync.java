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
package com.amazonaws.services.applicationinsights;

import javax.annotation.Generated;

import com.amazonaws.services.applicationinsights.model.*;

/**
 * Interface for accessing Application Insights asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.applicationinsights.AbstractAmazonApplicationInsightsAsync} instead.
 * </p>
 * <p>
 * <fullname>Amazon CloudWatch Application Insights for .NET and SQL Server</fullname>
 * <p>
 * Amazon CloudWatch Application Insights for .NET and SQL Server is a service that helps you detect common problems
 * with your .NET and SQL Server-based applications. It enables you to pinpoint the source of issues in your
 * applications (built with technologies such as Microsoft IIS, .NET, and Microsoft SQL Server), by providing key
 * insights into detected problems.
 * </p>
 * <p>
 * After you onboard your application, CloudWatch Application Insights for .NET and SQL Server identifies, recommends,
 * and sets up metrics and logs. It continuously analyzes and correlates your metrics and logs for unusual behavior to
 * surface actionable problems with your application. For example, if your application is slow and unresponsive and
 * leading to HTTP 500 errors in your Application Load Balancer (ALB), Application Insights informs you that a memory
 * pressure problem with your SQL Server database is occurring. It bases this analysis on impactful metrics and log
 * errors.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonApplicationInsightsAsync extends AmazonApplicationInsights {

    /**
     * <p>
     * Adds an application that is created from a resource group.
     * </p>
     * 
     * @param createApplicationRequest
     * @return A Java Future containing the result of the CreateApplication operation returned by the service.
     * @sample AmazonApplicationInsightsAsync.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/CreateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest createApplicationRequest);

    /**
     * <p>
     * Adds an application that is created from a resource group.
     * </p>
     * 
     * @param createApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateApplication operation returned by the service.
     * @sample AmazonApplicationInsightsAsyncHandler.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/CreateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest createApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler);

    /**
     * <p>
     * Creates a custom component by grouping similar standalone instances to monitor.
     * </p>
     * 
     * @param createComponentRequest
     * @return A Java Future containing the result of the CreateComponent operation returned by the service.
     * @sample AmazonApplicationInsightsAsync.CreateComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/CreateComponent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateComponentResult> createComponentAsync(CreateComponentRequest createComponentRequest);

    /**
     * <p>
     * Creates a custom component by grouping similar standalone instances to monitor.
     * </p>
     * 
     * @param createComponentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateComponent operation returned by the service.
     * @sample AmazonApplicationInsightsAsyncHandler.CreateComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/CreateComponent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateComponentResult> createComponentAsync(CreateComponentRequest createComponentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateComponentRequest, CreateComponentResult> asyncHandler);

    /**
     * <p>
     * Adds an log pattern to a <code>LogPatternSet</code>.
     * </p>
     * 
     * @param createLogPatternRequest
     * @return A Java Future containing the result of the CreateLogPattern operation returned by the service.
     * @sample AmazonApplicationInsightsAsync.CreateLogPattern
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/CreateLogPattern"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLogPatternResult> createLogPatternAsync(CreateLogPatternRequest createLogPatternRequest);

    /**
     * <p>
     * Adds an log pattern to a <code>LogPatternSet</code>.
     * </p>
     * 
     * @param createLogPatternRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLogPattern operation returned by the service.
     * @sample AmazonApplicationInsightsAsyncHandler.CreateLogPattern
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/CreateLogPattern"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLogPatternResult> createLogPatternAsync(CreateLogPatternRequest createLogPatternRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLogPatternRequest, CreateLogPatternResult> asyncHandler);

    /**
     * <p>
     * Removes the specified application from monitoring. Does not delete the application.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @return A Java Future containing the result of the DeleteApplication operation returned by the service.
     * @sample AmazonApplicationInsightsAsync.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DeleteApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest deleteApplicationRequest);

    /**
     * <p>
     * Removes the specified application from monitoring. Does not delete the application.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApplication operation returned by the service.
     * @sample AmazonApplicationInsightsAsyncHandler.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DeleteApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest deleteApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApplicationRequest, DeleteApplicationResult> asyncHandler);

    /**
     * <p>
     * Ungroups a custom component. When you ungroup custom components, all applicable monitors that are set up for the
     * component are removed and the instances revert to their standalone status.
     * </p>
     * 
     * @param deleteComponentRequest
     * @return A Java Future containing the result of the DeleteComponent operation returned by the service.
     * @sample AmazonApplicationInsightsAsync.DeleteComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DeleteComponent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteComponentResult> deleteComponentAsync(DeleteComponentRequest deleteComponentRequest);

    /**
     * <p>
     * Ungroups a custom component. When you ungroup custom components, all applicable monitors that are set up for the
     * component are removed and the instances revert to their standalone status.
     * </p>
     * 
     * @param deleteComponentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteComponent operation returned by the service.
     * @sample AmazonApplicationInsightsAsyncHandler.DeleteComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DeleteComponent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteComponentResult> deleteComponentAsync(DeleteComponentRequest deleteComponentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteComponentRequest, DeleteComponentResult> asyncHandler);

    /**
     * <p>
     * Removes the specified log pattern from a <code>LogPatternSet</code>.
     * </p>
     * 
     * @param deleteLogPatternRequest
     * @return A Java Future containing the result of the DeleteLogPattern operation returned by the service.
     * @sample AmazonApplicationInsightsAsync.DeleteLogPattern
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DeleteLogPattern"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLogPatternResult> deleteLogPatternAsync(DeleteLogPatternRequest deleteLogPatternRequest);

    /**
     * <p>
     * Removes the specified log pattern from a <code>LogPatternSet</code>.
     * </p>
     * 
     * @param deleteLogPatternRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLogPattern operation returned by the service.
     * @sample AmazonApplicationInsightsAsyncHandler.DeleteLogPattern
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DeleteLogPattern"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLogPatternResult> deleteLogPatternAsync(DeleteLogPatternRequest deleteLogPatternRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLogPatternRequest, DeleteLogPatternResult> asyncHandler);

    /**
     * <p>
     * Describes the application.
     * </p>
     * 
     * @param describeApplicationRequest
     * @return A Java Future containing the result of the DescribeApplication operation returned by the service.
     * @sample AmazonApplicationInsightsAsync.DescribeApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeApplicationResult> describeApplicationAsync(DescribeApplicationRequest describeApplicationRequest);

    /**
     * <p>
     * Describes the application.
     * </p>
     * 
     * @param describeApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeApplication operation returned by the service.
     * @sample AmazonApplicationInsightsAsyncHandler.DescribeApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeApplicationResult> describeApplicationAsync(DescribeApplicationRequest describeApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeApplicationRequest, DescribeApplicationResult> asyncHandler);

    /**
     * <p>
     * Describes a component and lists the resources that are grouped together in a component.
     * </p>
     * 
     * @param describeComponentRequest
     * @return A Java Future containing the result of the DescribeComponent operation returned by the service.
     * @sample AmazonApplicationInsightsAsync.DescribeComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeComponent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeComponentResult> describeComponentAsync(DescribeComponentRequest describeComponentRequest);

    /**
     * <p>
     * Describes a component and lists the resources that are grouped together in a component.
     * </p>
     * 
     * @param describeComponentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeComponent operation returned by the service.
     * @sample AmazonApplicationInsightsAsyncHandler.DescribeComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeComponent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeComponentResult> describeComponentAsync(DescribeComponentRequest describeComponentRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeComponentRequest, DescribeComponentResult> asyncHandler);

    /**
     * <p>
     * Describes the monitoring configuration of the component.
     * </p>
     * 
     * @param describeComponentConfigurationRequest
     * @return A Java Future containing the result of the DescribeComponentConfiguration operation returned by the
     *         service.
     * @sample AmazonApplicationInsightsAsync.DescribeComponentConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeComponentConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeComponentConfigurationResult> describeComponentConfigurationAsync(
            DescribeComponentConfigurationRequest describeComponentConfigurationRequest);

    /**
     * <p>
     * Describes the monitoring configuration of the component.
     * </p>
     * 
     * @param describeComponentConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeComponentConfiguration operation returned by the
     *         service.
     * @sample AmazonApplicationInsightsAsyncHandler.DescribeComponentConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeComponentConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeComponentConfigurationResult> describeComponentConfigurationAsync(
            DescribeComponentConfigurationRequest describeComponentConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeComponentConfigurationRequest, DescribeComponentConfigurationResult> asyncHandler);

    /**
     * <p>
     * Describes the recommended monitoring configuration of the component.
     * </p>
     * 
     * @param describeComponentConfigurationRecommendationRequest
     * @return A Java Future containing the result of the DescribeComponentConfigurationRecommendation operation
     *         returned by the service.
     * @sample AmazonApplicationInsightsAsync.DescribeComponentConfigurationRecommendation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeComponentConfigurationRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeComponentConfigurationRecommendationResult> describeComponentConfigurationRecommendationAsync(
            DescribeComponentConfigurationRecommendationRequest describeComponentConfigurationRecommendationRequest);

    /**
     * <p>
     * Describes the recommended monitoring configuration of the component.
     * </p>
     * 
     * @param describeComponentConfigurationRecommendationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeComponentConfigurationRecommendation operation
     *         returned by the service.
     * @sample AmazonApplicationInsightsAsyncHandler.DescribeComponentConfigurationRecommendation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeComponentConfigurationRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeComponentConfigurationRecommendationResult> describeComponentConfigurationRecommendationAsync(
            DescribeComponentConfigurationRecommendationRequest describeComponentConfigurationRecommendationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeComponentConfigurationRecommendationRequest, DescribeComponentConfigurationRecommendationResult> asyncHandler);

    /**
     * <p>
     * Describe a specific log pattern from a <code>LogPatternSet</code>.
     * </p>
     * 
     * @param describeLogPatternRequest
     * @return A Java Future containing the result of the DescribeLogPattern operation returned by the service.
     * @sample AmazonApplicationInsightsAsync.DescribeLogPattern
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeLogPattern"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLogPatternResult> describeLogPatternAsync(DescribeLogPatternRequest describeLogPatternRequest);

    /**
     * <p>
     * Describe a specific log pattern from a <code>LogPatternSet</code>.
     * </p>
     * 
     * @param describeLogPatternRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLogPattern operation returned by the service.
     * @sample AmazonApplicationInsightsAsyncHandler.DescribeLogPattern
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeLogPattern"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLogPatternResult> describeLogPatternAsync(DescribeLogPatternRequest describeLogPatternRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLogPatternRequest, DescribeLogPatternResult> asyncHandler);

    /**
     * <p>
     * Describes an anomaly or error with the application.
     * </p>
     * 
     * @param describeObservationRequest
     * @return A Java Future containing the result of the DescribeObservation operation returned by the service.
     * @sample AmazonApplicationInsightsAsync.DescribeObservation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeObservation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeObservationResult> describeObservationAsync(DescribeObservationRequest describeObservationRequest);

    /**
     * <p>
     * Describes an anomaly or error with the application.
     * </p>
     * 
     * @param describeObservationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeObservation operation returned by the service.
     * @sample AmazonApplicationInsightsAsyncHandler.DescribeObservation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeObservation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeObservationResult> describeObservationAsync(DescribeObservationRequest describeObservationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeObservationRequest, DescribeObservationResult> asyncHandler);

    /**
     * <p>
     * Describes an application problem.
     * </p>
     * 
     * @param describeProblemRequest
     * @return A Java Future containing the result of the DescribeProblem operation returned by the service.
     * @sample AmazonApplicationInsightsAsync.DescribeProblem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeProblem"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProblemResult> describeProblemAsync(DescribeProblemRequest describeProblemRequest);

    /**
     * <p>
     * Describes an application problem.
     * </p>
     * 
     * @param describeProblemRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeProblem operation returned by the service.
     * @sample AmazonApplicationInsightsAsyncHandler.DescribeProblem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeProblem"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProblemResult> describeProblemAsync(DescribeProblemRequest describeProblemRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeProblemRequest, DescribeProblemResult> asyncHandler);

    /**
     * <p>
     * Describes the anomalies or errors associated with the problem.
     * </p>
     * 
     * @param describeProblemObservationsRequest
     * @return A Java Future containing the result of the DescribeProblemObservations operation returned by the service.
     * @sample AmazonApplicationInsightsAsync.DescribeProblemObservations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeProblemObservations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProblemObservationsResult> describeProblemObservationsAsync(
            DescribeProblemObservationsRequest describeProblemObservationsRequest);

    /**
     * <p>
     * Describes the anomalies or errors associated with the problem.
     * </p>
     * 
     * @param describeProblemObservationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeProblemObservations operation returned by the service.
     * @sample AmazonApplicationInsightsAsyncHandler.DescribeProblemObservations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeProblemObservations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProblemObservationsResult> describeProblemObservationsAsync(
            DescribeProblemObservationsRequest describeProblemObservationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeProblemObservationsRequest, DescribeProblemObservationsResult> asyncHandler);

    /**
     * <p>
     * Lists the IDs of the applications that you are monitoring.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return A Java Future containing the result of the ListApplications operation returned by the service.
     * @sample AmazonApplicationInsightsAsync.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/ListApplications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest listApplicationsRequest);

    /**
     * <p>
     * Lists the IDs of the applications that you are monitoring.
     * </p>
     * 
     * @param listApplicationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApplications operation returned by the service.
     * @sample AmazonApplicationInsightsAsyncHandler.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/ListApplications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest listApplicationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler);

    /**
     * <p>
     * Lists the auto-grouped, standalone, and custom components of the application.
     * </p>
     * 
     * @param listComponentsRequest
     * @return A Java Future containing the result of the ListComponents operation returned by the service.
     * @sample AmazonApplicationInsightsAsync.ListComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/ListComponents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListComponentsResult> listComponentsAsync(ListComponentsRequest listComponentsRequest);

    /**
     * <p>
     * Lists the auto-grouped, standalone, and custom components of the application.
     * </p>
     * 
     * @param listComponentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListComponents operation returned by the service.
     * @sample AmazonApplicationInsightsAsyncHandler.ListComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/ListComponents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListComponentsResult> listComponentsAsync(ListComponentsRequest listComponentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListComponentsRequest, ListComponentsResult> asyncHandler);

    /**
     * <p>
     * Lists the INFO, WARN, and ERROR events for periodic configuration updates performed by Application Insights.
     * Examples of events represented are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * INFO: creating a new alarm or updating an alarm threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * WARN: alarm not created due to insufficient data points used to predict thresholds.
     * </p>
     * </li>
     * <li>
     * <p>
     * ERROR: alarm not created due to permission errors or exceeding quotas.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listConfigurationHistoryRequest
     * @return A Java Future containing the result of the ListConfigurationHistory operation returned by the service.
     * @sample AmazonApplicationInsightsAsync.ListConfigurationHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/ListConfigurationHistory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListConfigurationHistoryResult> listConfigurationHistoryAsync(ListConfigurationHistoryRequest listConfigurationHistoryRequest);

    /**
     * <p>
     * Lists the INFO, WARN, and ERROR events for periodic configuration updates performed by Application Insights.
     * Examples of events represented are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * INFO: creating a new alarm or updating an alarm threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * WARN: alarm not created due to insufficient data points used to predict thresholds.
     * </p>
     * </li>
     * <li>
     * <p>
     * ERROR: alarm not created due to permission errors or exceeding quotas.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listConfigurationHistoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListConfigurationHistory operation returned by the service.
     * @sample AmazonApplicationInsightsAsyncHandler.ListConfigurationHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/ListConfigurationHistory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListConfigurationHistoryResult> listConfigurationHistoryAsync(ListConfigurationHistoryRequest listConfigurationHistoryRequest,
            com.amazonaws.handlers.AsyncHandler<ListConfigurationHistoryRequest, ListConfigurationHistoryResult> asyncHandler);

    /**
     * <p>
     * Lists the log pattern sets in the specific application.
     * </p>
     * 
     * @param listLogPatternSetsRequest
     * @return A Java Future containing the result of the ListLogPatternSets operation returned by the service.
     * @sample AmazonApplicationInsightsAsync.ListLogPatternSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/ListLogPatternSets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLogPatternSetsResult> listLogPatternSetsAsync(ListLogPatternSetsRequest listLogPatternSetsRequest);

    /**
     * <p>
     * Lists the log pattern sets in the specific application.
     * </p>
     * 
     * @param listLogPatternSetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLogPatternSets operation returned by the service.
     * @sample AmazonApplicationInsightsAsyncHandler.ListLogPatternSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/ListLogPatternSets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLogPatternSetsResult> listLogPatternSetsAsync(ListLogPatternSetsRequest listLogPatternSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListLogPatternSetsRequest, ListLogPatternSetsResult> asyncHandler);

    /**
     * <p>
     * Lists the log patterns in the specific log <code>LogPatternSet</code>.
     * </p>
     * 
     * @param listLogPatternsRequest
     * @return A Java Future containing the result of the ListLogPatterns operation returned by the service.
     * @sample AmazonApplicationInsightsAsync.ListLogPatterns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/ListLogPatterns"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLogPatternsResult> listLogPatternsAsync(ListLogPatternsRequest listLogPatternsRequest);

    /**
     * <p>
     * Lists the log patterns in the specific log <code>LogPatternSet</code>.
     * </p>
     * 
     * @param listLogPatternsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLogPatterns operation returned by the service.
     * @sample AmazonApplicationInsightsAsyncHandler.ListLogPatterns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/ListLogPatterns"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLogPatternsResult> listLogPatternsAsync(ListLogPatternsRequest listLogPatternsRequest,
            com.amazonaws.handlers.AsyncHandler<ListLogPatternsRequest, ListLogPatternsResult> asyncHandler);

    /**
     * <p>
     * Lists the problems with your application.
     * </p>
     * 
     * @param listProblemsRequest
     * @return A Java Future containing the result of the ListProblems operation returned by the service.
     * @sample AmazonApplicationInsightsAsync.ListProblems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/ListProblems"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProblemsResult> listProblemsAsync(ListProblemsRequest listProblemsRequest);

    /**
     * <p>
     * Lists the problems with your application.
     * </p>
     * 
     * @param listProblemsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProblems operation returned by the service.
     * @sample AmazonApplicationInsightsAsyncHandler.ListProblems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/ListProblems"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProblemsResult> listProblemsAsync(ListProblemsRequest listProblemsRequest,
            com.amazonaws.handlers.AsyncHandler<ListProblemsRequest, ListProblemsResult> asyncHandler);

    /**
     * <p>
     * Retrieve a list of the tags (keys and values) that are associated with a specified application. A <i>tag</i> is a
     * label that you optionally define and associate with an application. Each tag consists of a required <i>tag
     * key</i> and an optional associated <i>tag value</i>. A tag key is a general label that acts as a category for
     * more specific tag values. A tag value acts as a descriptor within a tag key.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonApplicationInsightsAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Retrieve a list of the tags (keys and values) that are associated with a specified application. A <i>tag</i> is a
     * label that you optionally define and associate with an application. Each tag consists of a required <i>tag
     * key</i> and an optional associated <i>tag value</i>. A tag key is a general label that acts as a category for
     * more specific tag values. A tag value acts as a descriptor within a tag key.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonApplicationInsightsAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Add one or more tags (keys and values) to a specified application. A <i>tag</i> is a label that you optionally
     * define and associate with an application. Tags can help you categorize and manage application in different ways,
     * such as by purpose, owner, environment, or other criteria.
     * </p>
     * <p>
     * Each tag consists of a required <i>tag key</i> and an associated <i>tag value</i>, both of which you define. A
     * tag key is a general label that acts as a category for more specific tag values. A tag value acts as a descriptor
     * within a tag key.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonApplicationInsightsAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Add one or more tags (keys and values) to a specified application. A <i>tag</i> is a label that you optionally
     * define and associate with an application. Tags can help you categorize and manage application in different ways,
     * such as by purpose, owner, environment, or other criteria.
     * </p>
     * <p>
     * Each tag consists of a required <i>tag key</i> and an associated <i>tag value</i>, both of which you define. A
     * tag key is a general label that acts as a category for more specific tag values. A tag value acts as a descriptor
     * within a tag key.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonApplicationInsightsAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Remove one or more tags (keys and values) from a specified application.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonApplicationInsightsAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Remove one or more tags (keys and values) from a specified application.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonApplicationInsightsAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the application.
     * </p>
     * 
     * @param updateApplicationRequest
     * @return A Java Future containing the result of the UpdateApplication operation returned by the service.
     * @sample AmazonApplicationInsightsAsync.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/UpdateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest updateApplicationRequest);

    /**
     * <p>
     * Updates the application.
     * </p>
     * 
     * @param updateApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApplication operation returned by the service.
     * @sample AmazonApplicationInsightsAsyncHandler.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/UpdateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest updateApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler);

    /**
     * <p>
     * Updates the custom component name and/or the list of resources that make up the component.
     * </p>
     * 
     * @param updateComponentRequest
     * @return A Java Future containing the result of the UpdateComponent operation returned by the service.
     * @sample AmazonApplicationInsightsAsync.UpdateComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/UpdateComponent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateComponentResult> updateComponentAsync(UpdateComponentRequest updateComponentRequest);

    /**
     * <p>
     * Updates the custom component name and/or the list of resources that make up the component.
     * </p>
     * 
     * @param updateComponentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateComponent operation returned by the service.
     * @sample AmazonApplicationInsightsAsyncHandler.UpdateComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/UpdateComponent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateComponentResult> updateComponentAsync(UpdateComponentRequest updateComponentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateComponentRequest, UpdateComponentResult> asyncHandler);

    /**
     * <p>
     * Updates the monitoring configurations for the component. The configuration input parameter is an escaped JSON of
     * the configuration and should match the schema of what is returned by
     * <code>DescribeComponentConfigurationRecommendation</code>.
     * </p>
     * 
     * @param updateComponentConfigurationRequest
     * @return A Java Future containing the result of the UpdateComponentConfiguration operation returned by the
     *         service.
     * @sample AmazonApplicationInsightsAsync.UpdateComponentConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/UpdateComponentConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateComponentConfigurationResult> updateComponentConfigurationAsync(
            UpdateComponentConfigurationRequest updateComponentConfigurationRequest);

    /**
     * <p>
     * Updates the monitoring configurations for the component. The configuration input parameter is an escaped JSON of
     * the configuration and should match the schema of what is returned by
     * <code>DescribeComponentConfigurationRecommendation</code>.
     * </p>
     * 
     * @param updateComponentConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateComponentConfiguration operation returned by the
     *         service.
     * @sample AmazonApplicationInsightsAsyncHandler.UpdateComponentConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/UpdateComponentConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateComponentConfigurationResult> updateComponentConfigurationAsync(
            UpdateComponentConfigurationRequest updateComponentConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateComponentConfigurationRequest, UpdateComponentConfigurationResult> asyncHandler);

    /**
     * <p>
     * Adds a log pattern to a <code>LogPatternSet</code>.
     * </p>
     * 
     * @param updateLogPatternRequest
     * @return A Java Future containing the result of the UpdateLogPattern operation returned by the service.
     * @sample AmazonApplicationInsightsAsync.UpdateLogPattern
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/UpdateLogPattern"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLogPatternResult> updateLogPatternAsync(UpdateLogPatternRequest updateLogPatternRequest);

    /**
     * <p>
     * Adds a log pattern to a <code>LogPatternSet</code>.
     * </p>
     * 
     * @param updateLogPatternRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateLogPattern operation returned by the service.
     * @sample AmazonApplicationInsightsAsyncHandler.UpdateLogPattern
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/UpdateLogPattern"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLogPatternResult> updateLogPatternAsync(UpdateLogPatternRequest updateLogPatternRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateLogPatternRequest, UpdateLogPatternResult> asyncHandler);

}
