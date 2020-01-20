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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.applicationinsights.model.*;

/**
 * Interface for accessing Application Insights.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.applicationinsights.AbstractAmazonApplicationInsights} instead.
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
public interface AmazonApplicationInsights {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "applicationinsights";

    /**
     * <p>
     * Adds an application that is created from a resource group.
     * </p>
     * 
     * @param createApplicationRequest
     * @return Result of the CreateApplication operation returned by the service.
     * @throws ResourceInUseException
     *         The resource is already created or in use.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws TagsAlreadyExistException
     *         Tags are already registered for the specified application ARN.
     * @sample AmazonApplicationInsights.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/CreateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    CreateApplicationResult createApplication(CreateApplicationRequest createApplicationRequest);

    /**
     * <p>
     * Creates a custom component by grouping similar standalone instances to monitor.
     * </p>
     * 
     * @param createComponentRequest
     * @return Result of the CreateComponent operation returned by the service.
     * @throws ResourceInUseException
     *         The resource is already created or in use.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.CreateComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/CreateComponent"
     *      target="_top">AWS API Documentation</a>
     */
    CreateComponentResult createComponent(CreateComponentRequest createComponentRequest);

    /**
     * <p>
     * Adds an log pattern to a <code>LogPatternSet</code>.
     * </p>
     * 
     * @param createLogPatternRequest
     * @return Result of the CreateLogPattern operation returned by the service.
     * @throws ResourceInUseException
     *         The resource is already created or in use.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.CreateLogPattern
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/CreateLogPattern"
     *      target="_top">AWS API Documentation</a>
     */
    CreateLogPatternResult createLogPattern(CreateLogPatternRequest createLogPatternRequest);

    /**
     * <p>
     * Removes the specified application from monitoring. Does not delete the application.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @return Result of the DeleteApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws BadRequestException
     *         The request is not understood by the server.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DeleteApplication"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteApplicationResult deleteApplication(DeleteApplicationRequest deleteApplicationRequest);

    /**
     * <p>
     * Ungroups a custom component. When you ungroup custom components, all applicable monitors that are set up for the
     * component are removed and the instances revert to their standalone status.
     * </p>
     * 
     * @param deleteComponentRequest
     * @return Result of the DeleteComponent operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.DeleteComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DeleteComponent"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteComponentResult deleteComponent(DeleteComponentRequest deleteComponentRequest);

    /**
     * <p>
     * Removes the specified log pattern from a <code>LogPatternSet</code>.
     * </p>
     * 
     * @param deleteLogPatternRequest
     * @return Result of the DeleteLogPattern operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws BadRequestException
     *         The request is not understood by the server.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.DeleteLogPattern
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DeleteLogPattern"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteLogPatternResult deleteLogPattern(DeleteLogPatternRequest deleteLogPatternRequest);

    /**
     * <p>
     * Describes the application.
     * </p>
     * 
     * @param describeApplicationRequest
     * @return Result of the DescribeApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.DescribeApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeApplication"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeApplicationResult describeApplication(DescribeApplicationRequest describeApplicationRequest);

    /**
     * <p>
     * Describes a component and lists the resources that are grouped together in a component.
     * </p>
     * 
     * @param describeComponentRequest
     * @return Result of the DescribeComponent operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.DescribeComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeComponent"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeComponentResult describeComponent(DescribeComponentRequest describeComponentRequest);

    /**
     * <p>
     * Describes the monitoring configuration of the component.
     * </p>
     * 
     * @param describeComponentConfigurationRequest
     * @return Result of the DescribeComponentConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.DescribeComponentConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeComponentConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeComponentConfigurationResult describeComponentConfiguration(DescribeComponentConfigurationRequest describeComponentConfigurationRequest);

    /**
     * <p>
     * Describes the recommended monitoring configuration of the component.
     * </p>
     * 
     * @param describeComponentConfigurationRecommendationRequest
     * @return Result of the DescribeComponentConfigurationRecommendation operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.DescribeComponentConfigurationRecommendation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeComponentConfigurationRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeComponentConfigurationRecommendationResult describeComponentConfigurationRecommendation(
            DescribeComponentConfigurationRecommendationRequest describeComponentConfigurationRecommendationRequest);

    /**
     * <p>
     * Describe a specific log pattern from a <code>LogPatternSet</code>.
     * </p>
     * 
     * @param describeLogPatternRequest
     * @return Result of the DescribeLogPattern operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.DescribeLogPattern
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeLogPattern"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeLogPatternResult describeLogPattern(DescribeLogPatternRequest describeLogPatternRequest);

    /**
     * <p>
     * Describes an anomaly or error with the application.
     * </p>
     * 
     * @param describeObservationRequest
     * @return Result of the DescribeObservation operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @sample AmazonApplicationInsights.DescribeObservation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeObservation"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeObservationResult describeObservation(DescribeObservationRequest describeObservationRequest);

    /**
     * <p>
     * Describes an application problem.
     * </p>
     * 
     * @param describeProblemRequest
     * @return Result of the DescribeProblem operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @sample AmazonApplicationInsights.DescribeProblem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeProblem"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeProblemResult describeProblem(DescribeProblemRequest describeProblemRequest);

    /**
     * <p>
     * Describes the anomalies or errors associated with the problem.
     * </p>
     * 
     * @param describeProblemObservationsRequest
     * @return Result of the DescribeProblemObservations operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @sample AmazonApplicationInsights.DescribeProblemObservations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeProblemObservations"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeProblemObservationsResult describeProblemObservations(DescribeProblemObservationsRequest describeProblemObservationsRequest);

    /**
     * <p>
     * Lists the IDs of the applications that you are monitoring.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return Result of the ListApplications operation returned by the service.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/ListApplications"
     *      target="_top">AWS API Documentation</a>
     */
    ListApplicationsResult listApplications(ListApplicationsRequest listApplicationsRequest);

    /**
     * <p>
     * Lists the auto-grouped, standalone, and custom components of the application.
     * </p>
     * 
     * @param listComponentsRequest
     * @return Result of the ListComponents operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.ListComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/ListComponents"
     *      target="_top">AWS API Documentation</a>
     */
    ListComponentsResult listComponents(ListComponentsRequest listComponentsRequest);

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
     * @return Result of the ListConfigurationHistory operation returned by the service.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.ListConfigurationHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/ListConfigurationHistory"
     *      target="_top">AWS API Documentation</a>
     */
    ListConfigurationHistoryResult listConfigurationHistory(ListConfigurationHistoryRequest listConfigurationHistoryRequest);

    /**
     * <p>
     * Lists the log pattern sets in the specific application.
     * </p>
     * 
     * @param listLogPatternSetsRequest
     * @return Result of the ListLogPatternSets operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.ListLogPatternSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/ListLogPatternSets"
     *      target="_top">AWS API Documentation</a>
     */
    ListLogPatternSetsResult listLogPatternSets(ListLogPatternSetsRequest listLogPatternSetsRequest);

    /**
     * <p>
     * Lists the log patterns in the specific log <code>LogPatternSet</code>.
     * </p>
     * 
     * @param listLogPatternsRequest
     * @return Result of the ListLogPatterns operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.ListLogPatterns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/ListLogPatterns"
     *      target="_top">AWS API Documentation</a>
     */
    ListLogPatternsResult listLogPatterns(ListLogPatternsRequest listLogPatternsRequest);

    /**
     * <p>
     * Lists the problems with your application.
     * </p>
     * 
     * @param listProblemsRequest
     * @return Result of the ListProblems operation returned by the service.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.ListProblems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/ListProblems"
     *      target="_top">AWS API Documentation</a>
     */
    ListProblemsResult listProblems(ListProblemsRequest listProblemsRequest);

    /**
     * <p>
     * Retrieve a list of the tags (keys and values) that are associated with a specified application. A <i>tag</i> is a
     * label that you optionally define and associate with an application. Each tag consists of a required <i>tag
     * key</i> and an optional associated <i>tag value</i>. A tag key is a general label that acts as a category for
     * more specific tag values. A tag value acts as a descriptor within a tag key.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @sample AmazonApplicationInsights.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

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
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws TooManyTagsException
     *         The number of the provided tags is beyond the limit, or the number of total tags you are trying to attach
     *         to the specified resource exceeds the limit.
     * @throws ValidationException
     *         The parameter is not valid.
     * @sample AmazonApplicationInsights.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Remove one or more tags (keys and values) from a specified application.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @sample AmazonApplicationInsights.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the application.
     * </p>
     * 
     * @param updateApplicationRequest
     * @return Result of the UpdateApplication operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @sample AmazonApplicationInsights.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/UpdateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateApplicationResult updateApplication(UpdateApplicationRequest updateApplicationRequest);

    /**
     * <p>
     * Updates the custom component name and/or the list of resources that make up the component.
     * </p>
     * 
     * @param updateComponentRequest
     * @return Result of the UpdateComponent operation returned by the service.
     * @throws ResourceInUseException
     *         The resource is already created or in use.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.UpdateComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/UpdateComponent"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateComponentResult updateComponent(UpdateComponentRequest updateComponentRequest);

    /**
     * <p>
     * Updates the monitoring configurations for the component. The configuration input parameter is an escaped JSON of
     * the configuration and should match the schema of what is returned by
     * <code>DescribeComponentConfigurationRecommendation</code>.
     * </p>
     * 
     * @param updateComponentConfigurationRequest
     * @return Result of the UpdateComponentConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.UpdateComponentConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/UpdateComponentConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateComponentConfigurationResult updateComponentConfiguration(UpdateComponentConfigurationRequest updateComponentConfigurationRequest);

    /**
     * <p>
     * Adds a log pattern to a <code>LogPatternSet</code>.
     * </p>
     * 
     * @param updateLogPatternRequest
     * @return Result of the UpdateLogPattern operation returned by the service.
     * @throws ResourceInUseException
     *         The resource is already created or in use.
     * @throws ResourceNotFoundException
     *         The resource does not exist in the customer account.
     * @throws ValidationException
     *         The parameter is not valid.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonApplicationInsights.UpdateLogPattern
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/UpdateLogPattern"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateLogPatternResult updateLogPattern(UpdateLogPatternRequest updateLogPatternRequest);

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
