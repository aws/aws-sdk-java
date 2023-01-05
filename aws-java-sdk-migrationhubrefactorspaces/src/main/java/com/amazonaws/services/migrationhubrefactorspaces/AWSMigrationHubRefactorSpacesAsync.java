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
package com.amazonaws.services.migrationhubrefactorspaces;

import javax.annotation.Generated;

import com.amazonaws.services.migrationhubrefactorspaces.model.*;

/**
 * Interface for accessing AWS Migration Hub Refactor Spaces asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.migrationhubrefactorspaces.AbstractAWSMigrationHubRefactorSpacesAsync} instead.
 * </p>
 * <p>
 * <p>
 * <fullname>Amazon Web Services Migration Hub Refactor Spaces</fullname>
 * <p>
 * This API reference provides descriptions, syntax, and other details about each of the actions and data types for
 * Amazon Web Services Migration Hub Refactor Spaces (Refactor Spaces). The topic for each action shows the API request
 * parameters and the response. Alternatively, you can use one of the Amazon Web Services SDKs to access an API that is
 * tailored to the programming language or platform that you're using. For more information, see <a
 * href="https://aws.amazon.com/tools/#SDKs">Amazon Web Services SDKs</a>.
 * </p>
 * <p>
 * To share Refactor Spaces environments with other Amazon Web Services accounts or with Organizations and their OUs,
 * use Resource Access Manager's <code>CreateResourceShare</code> API. See <a
 * href="https://docs.aws.amazon.com/ram/latest/APIReference/API_CreateResourceShare.html">CreateResourceShare</a> in
 * the <i>Amazon Web Services RAM API Reference</i>.
 * </p>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSMigrationHubRefactorSpacesAsync extends AWSMigrationHubRefactorSpaces {

    /**
     * <p>
     * Creates an Amazon Web Services Migration Hub Refactor Spaces application. The account that owns the environment
     * also owns the applications created inside the environment, regardless of the account that creates the
     * application. Refactor Spaces provisions an Amazon API Gateway, API Gateway VPC link, and Network Load Balancer
     * for the application proxy inside your account.
     * </p>
     * 
     * @param createApplicationRequest
     * @return A Java Future containing the result of the CreateApplication operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsync.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/CreateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest createApplicationRequest);

    /**
     * <p>
     * Creates an Amazon Web Services Migration Hub Refactor Spaces application. The account that owns the environment
     * also owns the applications created inside the environment, regardless of the account that creates the
     * application. Refactor Spaces provisions an Amazon API Gateway, API Gateway VPC link, and Network Load Balancer
     * for the application proxy inside your account.
     * </p>
     * 
     * @param createApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateApplication operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsyncHandler.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/CreateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest createApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon Web Services Migration Hub Refactor Spaces environment. The caller owns the environment
     * resource, and all Refactor Spaces applications, services, and routes created within the environment. They are
     * referred to as the <i>environment owner</i>. The environment owner has cross-account visibility and control of
     * Refactor Spaces resources that are added to the environment by other accounts that the environment is shared
     * with. When creating an environment, Refactor Spaces provisions a transit gateway in your account.
     * </p>
     * 
     * @param createEnvironmentRequest
     * @return A Java Future containing the result of the CreateEnvironment operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsync.CreateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/CreateEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEnvironmentResult> createEnvironmentAsync(CreateEnvironmentRequest createEnvironmentRequest);

    /**
     * <p>
     * Creates an Amazon Web Services Migration Hub Refactor Spaces environment. The caller owns the environment
     * resource, and all Refactor Spaces applications, services, and routes created within the environment. They are
     * referred to as the <i>environment owner</i>. The environment owner has cross-account visibility and control of
     * Refactor Spaces resources that are added to the environment by other accounts that the environment is shared
     * with. When creating an environment, Refactor Spaces provisions a transit gateway in your account.
     * </p>
     * 
     * @param createEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEnvironment operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsyncHandler.CreateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/CreateEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEnvironmentResult> createEnvironmentAsync(CreateEnvironmentRequest createEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEnvironmentRequest, CreateEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon Web Services Migration Hub Refactor Spaces route. The account owner of the service resource is
     * always the environment owner, regardless of which account creates the route. Routes target a service in the
     * application. If an application does not have any routes, then the first route must be created as a
     * <code>DEFAULT</code> <code>RouteType</code>.
     * </p>
     * <p>
     * When created, the default route defaults to an active state so state is not a required input. However, like all
     * other state values the state of the default route can be updated after creation, but only when all other routes
     * are also inactive. Conversely, no route can be active without the default route also being active.
     * </p>
     * <p>
     * When you create a route, Refactor Spaces configures the Amazon API Gateway to send traffic to the target service
     * as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the service has a URL endpoint, and the endpoint resolves to a private IP address, Refactor Spaces routes
     * traffic using the API Gateway VPC link.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the service has a URL endpoint, and the endpoint resolves to a public IP address, Refactor Spaces routes
     * traffic over the public internet.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the service has an Lambda function endpoint, then Refactor Spaces configures the Lambda function's resource
     * policy to allow the application's API Gateway to invoke the function.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A one-time health check is performed on the service when either the route is updated from inactive to active, or
     * when it is created with an active state. If the health check fails, the route transitions the route state to
     * <code>FAILED</code>, an error code of <code>SERVICE_ENDPOINT_HEALTH_CHECK_FAILURE</code> is provided, and no
     * traffic is sent to the service.
     * </p>
     * <p>
     * For Lambda functions, the Lambda function state is checked. If the function is not active, the function
     * configuration is updated so that Lambda resources are provisioned. If the Lambda state is <code>Failed</code>,
     * then the route creation fails. For more information, see the <a href=
     * "https://docs.aws.amazon.com/lambda/latest/dg/API_GetFunctionConfiguration.html#SSS-GetFunctionConfiguration-response-State"
     * >GetFunctionConfiguration's State response parameter</a> in the <i>Lambda Developer Guide</i>.
     * </p>
     * <p>
     * For Lambda endpoints, a check is performed to determine that a Lambda function with the specified ARN exists. If
     * it does not exist, the health check fails. For public URLs, a connection is opened to the public endpoint. If the
     * URL is not reachable, the health check fails.
     * </p>
     * <p>
     * Refactor Spaces automatically resolves the public Domain Name System (DNS) names that are set in
     * <a>CreateServiceRequest$UrlEndpoint</a> when you create a service. The DNS names resolve when the DNS
     * time-to-live (TTL) expires, or every 60 seconds for TTLs less than 60 seconds. This periodic DNS resolution
     * ensures that the route configuration remains up-to-date.
     * </p>
     * <p>
     * For private URLS, a target group is created on the Elastic Load Balancing and the target group health check is
     * run. The <code>HealthCheckProtocol</code>, <code>HealthCheckPort</code>, and <code>HealthCheckPath</code> are the
     * same protocol, port, and path specified in the URL or health URL, if used. All other settings use the default
     * values, as described in <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/application/target-group-health-checks.html">Health
     * checks for your target groups</a>. The health check is considered successful if at least one target within the
     * target group transitions to a healthy state.
     * </p>
     * <p>
     * Services can have HTTP or HTTPS URL endpoints. For HTTPS URLs, publicly-signed certificates are supported.
     * Private Certificate Authorities (CAs) are permitted only if the CA's domain is also publicly resolvable.
     * </p>
     * 
     * @param createRouteRequest
     * @return A Java Future containing the result of the CreateRoute operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsync.CreateRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/CreateRoute"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRouteResult> createRouteAsync(CreateRouteRequest createRouteRequest);

    /**
     * <p>
     * Creates an Amazon Web Services Migration Hub Refactor Spaces route. The account owner of the service resource is
     * always the environment owner, regardless of which account creates the route. Routes target a service in the
     * application. If an application does not have any routes, then the first route must be created as a
     * <code>DEFAULT</code> <code>RouteType</code>.
     * </p>
     * <p>
     * When created, the default route defaults to an active state so state is not a required input. However, like all
     * other state values the state of the default route can be updated after creation, but only when all other routes
     * are also inactive. Conversely, no route can be active without the default route also being active.
     * </p>
     * <p>
     * When you create a route, Refactor Spaces configures the Amazon API Gateway to send traffic to the target service
     * as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the service has a URL endpoint, and the endpoint resolves to a private IP address, Refactor Spaces routes
     * traffic using the API Gateway VPC link.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the service has a URL endpoint, and the endpoint resolves to a public IP address, Refactor Spaces routes
     * traffic over the public internet.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the service has an Lambda function endpoint, then Refactor Spaces configures the Lambda function's resource
     * policy to allow the application's API Gateway to invoke the function.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A one-time health check is performed on the service when either the route is updated from inactive to active, or
     * when it is created with an active state. If the health check fails, the route transitions the route state to
     * <code>FAILED</code>, an error code of <code>SERVICE_ENDPOINT_HEALTH_CHECK_FAILURE</code> is provided, and no
     * traffic is sent to the service.
     * </p>
     * <p>
     * For Lambda functions, the Lambda function state is checked. If the function is not active, the function
     * configuration is updated so that Lambda resources are provisioned. If the Lambda state is <code>Failed</code>,
     * then the route creation fails. For more information, see the <a href=
     * "https://docs.aws.amazon.com/lambda/latest/dg/API_GetFunctionConfiguration.html#SSS-GetFunctionConfiguration-response-State"
     * >GetFunctionConfiguration's State response parameter</a> in the <i>Lambda Developer Guide</i>.
     * </p>
     * <p>
     * For Lambda endpoints, a check is performed to determine that a Lambda function with the specified ARN exists. If
     * it does not exist, the health check fails. For public URLs, a connection is opened to the public endpoint. If the
     * URL is not reachable, the health check fails.
     * </p>
     * <p>
     * Refactor Spaces automatically resolves the public Domain Name System (DNS) names that are set in
     * <a>CreateServiceRequest$UrlEndpoint</a> when you create a service. The DNS names resolve when the DNS
     * time-to-live (TTL) expires, or every 60 seconds for TTLs less than 60 seconds. This periodic DNS resolution
     * ensures that the route configuration remains up-to-date.
     * </p>
     * <p>
     * For private URLS, a target group is created on the Elastic Load Balancing and the target group health check is
     * run. The <code>HealthCheckProtocol</code>, <code>HealthCheckPort</code>, and <code>HealthCheckPath</code> are the
     * same protocol, port, and path specified in the URL or health URL, if used. All other settings use the default
     * values, as described in <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/application/target-group-health-checks.html">Health
     * checks for your target groups</a>. The health check is considered successful if at least one target within the
     * target group transitions to a healthy state.
     * </p>
     * <p>
     * Services can have HTTP or HTTPS URL endpoints. For HTTPS URLs, publicly-signed certificates are supported.
     * Private Certificate Authorities (CAs) are permitted only if the CA's domain is also publicly resolvable.
     * </p>
     * 
     * @param createRouteRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRoute operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsyncHandler.CreateRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/CreateRoute"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRouteResult> createRouteAsync(CreateRouteRequest createRouteRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRouteRequest, CreateRouteResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon Web Services Migration Hub Refactor Spaces service. The account owner of the service is always
     * the environment owner, regardless of which account in the environment creates the service. Services have either a
     * URL endpoint in a virtual private cloud (VPC), or a Lambda function endpoint.
     * </p>
     * <important>
     * <p>
     * If an Amazon Web Services resource is launched in a service VPC, and you want it to be accessible to all of an
     * environment’s services with VPCs and routes, apply the <code>RefactorSpacesSecurityGroup</code> to the resource.
     * Alternatively, to add more cross-account constraints, apply your own security group.
     * </p>
     * </important>
     * 
     * @param createServiceRequest
     * @return A Java Future containing the result of the CreateService operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsync.CreateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/CreateService"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateServiceResult> createServiceAsync(CreateServiceRequest createServiceRequest);

    /**
     * <p>
     * Creates an Amazon Web Services Migration Hub Refactor Spaces service. The account owner of the service is always
     * the environment owner, regardless of which account in the environment creates the service. Services have either a
     * URL endpoint in a virtual private cloud (VPC), or a Lambda function endpoint.
     * </p>
     * <important>
     * <p>
     * If an Amazon Web Services resource is launched in a service VPC, and you want it to be accessible to all of an
     * environment’s services with VPCs and routes, apply the <code>RefactorSpacesSecurityGroup</code> to the resource.
     * Alternatively, to add more cross-account constraints, apply your own security group.
     * </p>
     * </important>
     * 
     * @param createServiceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateService operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsyncHandler.CreateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/CreateService"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateServiceResult> createServiceAsync(CreateServiceRequest createServiceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateServiceRequest, CreateServiceResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon Web Services Migration Hub Refactor Spaces application. Before you can delete an application,
     * you must first delete any services or routes within the application.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @return A Java Future containing the result of the DeleteApplication operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsync.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/DeleteApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest deleteApplicationRequest);

    /**
     * <p>
     * Deletes an Amazon Web Services Migration Hub Refactor Spaces application. Before you can delete an application,
     * you must first delete any services or routes within the application.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApplication operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsyncHandler.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/DeleteApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest deleteApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApplicationRequest, DeleteApplicationResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon Web Services Migration Hub Refactor Spaces environment. Before you can delete an environment,
     * you must first delete any applications and services within the environment.
     * </p>
     * 
     * @param deleteEnvironmentRequest
     * @return A Java Future containing the result of the DeleteEnvironment operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsync.DeleteEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/DeleteEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEnvironmentResult> deleteEnvironmentAsync(DeleteEnvironmentRequest deleteEnvironmentRequest);

    /**
     * <p>
     * Deletes an Amazon Web Services Migration Hub Refactor Spaces environment. Before you can delete an environment,
     * you must first delete any applications and services within the environment.
     * </p>
     * 
     * @param deleteEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEnvironment operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsyncHandler.DeleteEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/DeleteEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEnvironmentResult> deleteEnvironmentAsync(DeleteEnvironmentRequest deleteEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEnvironmentRequest, DeleteEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Deletes the resource policy set for the environment.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return A Java Future containing the result of the DeleteResourcePolicy operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsync.DeleteResourcePolicy
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/DeleteResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest deleteResourcePolicyRequest);

    /**
     * <p>
     * Deletes the resource policy set for the environment.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteResourcePolicy operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsyncHandler.DeleteResourcePolicy
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/DeleteResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest deleteResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteResourcePolicyRequest, DeleteResourcePolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon Web Services Migration Hub Refactor Spaces route.
     * </p>
     * 
     * @param deleteRouteRequest
     * @return A Java Future containing the result of the DeleteRoute operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsync.DeleteRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/DeleteRoute"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRouteResult> deleteRouteAsync(DeleteRouteRequest deleteRouteRequest);

    /**
     * <p>
     * Deletes an Amazon Web Services Migration Hub Refactor Spaces route.
     * </p>
     * 
     * @param deleteRouteRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRoute operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsyncHandler.DeleteRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/DeleteRoute"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRouteResult> deleteRouteAsync(DeleteRouteRequest deleteRouteRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRouteRequest, DeleteRouteResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon Web Services Migration Hub Refactor Spaces service.
     * </p>
     * 
     * @param deleteServiceRequest
     * @return A Java Future containing the result of the DeleteService operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsync.DeleteService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/DeleteService"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteServiceResult> deleteServiceAsync(DeleteServiceRequest deleteServiceRequest);

    /**
     * <p>
     * Deletes an Amazon Web Services Migration Hub Refactor Spaces service.
     * </p>
     * 
     * @param deleteServiceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteService operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsyncHandler.DeleteService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/DeleteService"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteServiceResult> deleteServiceAsync(DeleteServiceRequest deleteServiceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteServiceRequest, DeleteServiceResult> asyncHandler);

    /**
     * <p>
     * Gets an Amazon Web Services Migration Hub Refactor Spaces application.
     * </p>
     * 
     * @param getApplicationRequest
     * @return A Java Future containing the result of the GetApplication operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsync.GetApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/GetApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(GetApplicationRequest getApplicationRequest);

    /**
     * <p>
     * Gets an Amazon Web Services Migration Hub Refactor Spaces application.
     * </p>
     * 
     * @param getApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApplication operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsyncHandler.GetApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/GetApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(GetApplicationRequest getApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<GetApplicationRequest, GetApplicationResult> asyncHandler);

    /**
     * <p>
     * Gets an Amazon Web Services Migration Hub Refactor Spaces environment.
     * </p>
     * 
     * @param getEnvironmentRequest
     * @return A Java Future containing the result of the GetEnvironment operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsync.GetEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/GetEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEnvironmentResult> getEnvironmentAsync(GetEnvironmentRequest getEnvironmentRequest);

    /**
     * <p>
     * Gets an Amazon Web Services Migration Hub Refactor Spaces environment.
     * </p>
     * 
     * @param getEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEnvironment operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsyncHandler.GetEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/GetEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEnvironmentResult> getEnvironmentAsync(GetEnvironmentRequest getEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<GetEnvironmentRequest, GetEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Gets the resource-based permission policy that is set for the given environment.
     * </p>
     * 
     * @param getResourcePolicyRequest
     * @return A Java Future containing the result of the GetResourcePolicy operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsync.GetResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/GetResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourcePolicyResult> getResourcePolicyAsync(GetResourcePolicyRequest getResourcePolicyRequest);

    /**
     * <p>
     * Gets the resource-based permission policy that is set for the given environment.
     * </p>
     * 
     * @param getResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResourcePolicy operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsyncHandler.GetResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/GetResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourcePolicyResult> getResourcePolicyAsync(GetResourcePolicyRequest getResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourcePolicyRequest, GetResourcePolicyResult> asyncHandler);

    /**
     * <p>
     * Gets an Amazon Web Services Migration Hub Refactor Spaces route.
     * </p>
     * 
     * @param getRouteRequest
     * @return A Java Future containing the result of the GetRoute operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsync.GetRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/GetRoute"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRouteResult> getRouteAsync(GetRouteRequest getRouteRequest);

    /**
     * <p>
     * Gets an Amazon Web Services Migration Hub Refactor Spaces route.
     * </p>
     * 
     * @param getRouteRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRoute operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsyncHandler.GetRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/GetRoute"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRouteResult> getRouteAsync(GetRouteRequest getRouteRequest,
            com.amazonaws.handlers.AsyncHandler<GetRouteRequest, GetRouteResult> asyncHandler);

    /**
     * <p>
     * Gets an Amazon Web Services Migration Hub Refactor Spaces service.
     * </p>
     * 
     * @param getServiceRequest
     * @return A Java Future containing the result of the GetService operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsync.GetService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/GetService"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetServiceResult> getServiceAsync(GetServiceRequest getServiceRequest);

    /**
     * <p>
     * Gets an Amazon Web Services Migration Hub Refactor Spaces service.
     * </p>
     * 
     * @param getServiceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetService operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsyncHandler.GetService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/GetService"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetServiceResult> getServiceAsync(GetServiceRequest getServiceRequest,
            com.amazonaws.handlers.AsyncHandler<GetServiceRequest, GetServiceResult> asyncHandler);

    /**
     * <p>
     * Lists all the Amazon Web Services Migration Hub Refactor Spaces applications within an environment.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return A Java Future containing the result of the ListApplications operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsync.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/ListApplications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest listApplicationsRequest);

    /**
     * <p>
     * Lists all the Amazon Web Services Migration Hub Refactor Spaces applications within an environment.
     * </p>
     * 
     * @param listApplicationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApplications operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsyncHandler.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/ListApplications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest listApplicationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler);

    /**
     * <p>
     * Lists all Amazon Web Services Migration Hub Refactor Spaces service virtual private clouds (VPCs) that are part
     * of the environment.
     * </p>
     * 
     * @param listEnvironmentVpcsRequest
     * @return A Java Future containing the result of the ListEnvironmentVpcs operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsync.ListEnvironmentVpcs
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/ListEnvironmentVpcs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEnvironmentVpcsResult> listEnvironmentVpcsAsync(ListEnvironmentVpcsRequest listEnvironmentVpcsRequest);

    /**
     * <p>
     * Lists all Amazon Web Services Migration Hub Refactor Spaces service virtual private clouds (VPCs) that are part
     * of the environment.
     * </p>
     * 
     * @param listEnvironmentVpcsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEnvironmentVpcs operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsyncHandler.ListEnvironmentVpcs
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/ListEnvironmentVpcs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEnvironmentVpcsResult> listEnvironmentVpcsAsync(ListEnvironmentVpcsRequest listEnvironmentVpcsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEnvironmentVpcsRequest, ListEnvironmentVpcsResult> asyncHandler);

    /**
     * <p>
     * Lists Amazon Web Services Migration Hub Refactor Spaces environments owned by a caller account or shared with the
     * caller account.
     * </p>
     * 
     * @param listEnvironmentsRequest
     * @return A Java Future containing the result of the ListEnvironments operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsync.ListEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/ListEnvironments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEnvironmentsResult> listEnvironmentsAsync(ListEnvironmentsRequest listEnvironmentsRequest);

    /**
     * <p>
     * Lists Amazon Web Services Migration Hub Refactor Spaces environments owned by a caller account or shared with the
     * caller account.
     * </p>
     * 
     * @param listEnvironmentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEnvironments operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsyncHandler.ListEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/ListEnvironments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEnvironmentsResult> listEnvironmentsAsync(ListEnvironmentsRequest listEnvironmentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEnvironmentsRequest, ListEnvironmentsResult> asyncHandler);

    /**
     * <p>
     * Lists all the Amazon Web Services Migration Hub Refactor Spaces routes within an application.
     * </p>
     * 
     * @param listRoutesRequest
     * @return A Java Future containing the result of the ListRoutes operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsync.ListRoutes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/ListRoutes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRoutesResult> listRoutesAsync(ListRoutesRequest listRoutesRequest);

    /**
     * <p>
     * Lists all the Amazon Web Services Migration Hub Refactor Spaces routes within an application.
     * </p>
     * 
     * @param listRoutesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRoutes operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsyncHandler.ListRoutes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/ListRoutes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRoutesResult> listRoutesAsync(ListRoutesRequest listRoutesRequest,
            com.amazonaws.handlers.AsyncHandler<ListRoutesRequest, ListRoutesResult> asyncHandler);

    /**
     * <p>
     * Lists all the Amazon Web Services Migration Hub Refactor Spaces services within an application.
     * </p>
     * 
     * @param listServicesRequest
     * @return A Java Future containing the result of the ListServices operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsync.ListServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/ListServices"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServicesResult> listServicesAsync(ListServicesRequest listServicesRequest);

    /**
     * <p>
     * Lists all the Amazon Web Services Migration Hub Refactor Spaces services within an application.
     * </p>
     * 
     * @param listServicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListServices operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsyncHandler.ListServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/ListServices"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServicesResult> listServicesAsync(ListServicesRequest listServicesRequest,
            com.amazonaws.handlers.AsyncHandler<ListServicesRequest, ListServicesResult> asyncHandler);

    /**
     * <p>
     * Lists the tags of a resource. The caller account must be the same as the resource’s <code>OwnerAccountId</code>.
     * Listing tags in other accounts is not supported.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsync.ListTagsForResource
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags of a resource. The caller account must be the same as the resource’s <code>OwnerAccountId</code>.
     * Listing tags in other accounts is not supported.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsyncHandler.ListTagsForResource
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Attaches a resource-based permission policy to the Amazon Web Services Migration Hub Refactor Spaces environment.
     * The policy must contain the same actions and condition statements as the
     * <code>arn:aws:ram::aws:permission/AWSRAMDefaultPermissionRefactorSpacesEnvironment</code> permission in Resource
     * Access Manager. The policy must not contain new lines or blank lines.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @return A Java Future containing the result of the PutResourcePolicy operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsync.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/PutResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest putResourcePolicyRequest);

    /**
     * <p>
     * Attaches a resource-based permission policy to the Amazon Web Services Migration Hub Refactor Spaces environment.
     * The policy must contain the same actions and condition statements as the
     * <code>arn:aws:ram::aws:permission/AWSRAMDefaultPermissionRefactorSpacesEnvironment</code> permission in Resource
     * Access Manager. The policy must not contain new lines or blank lines.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutResourcePolicy operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsyncHandler.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/PutResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest putResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutResourcePolicyRequest, PutResourcePolicyResult> asyncHandler);

    /**
     * <p>
     * Removes the tags of a given resource. Tags are metadata which can be used to manage a resource. To tag a
     * resource, the caller account must be the same as the resource’s <code>OwnerAccountId</code>. Tagging resources in
     * other accounts is not supported.
     * </p>
     * <note>
     * <p>
     * Amazon Web Services Migration Hub Refactor Spaces does not propagate tags to orchestrated resources, such as an
     * environment’s transit gateway.
     * </p>
     * </note>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes the tags of a given resource. Tags are metadata which can be used to manage a resource. To tag a
     * resource, the caller account must be the same as the resource’s <code>OwnerAccountId</code>. Tagging resources in
     * other accounts is not supported.
     * </p>
     * <note>
     * <p>
     * Amazon Web Services Migration Hub Refactor Spaces does not propagate tags to orchestrated resources, such as an
     * environment’s transit gateway.
     * </p>
     * </note>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource. To
     * untag a resource, the caller account must be the same as the resource’s <code>OwnerAccountId</code>. Untagging
     * resources across accounts is not supported.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource. To
     * untag a resource, the caller account must be the same as the resource’s <code>OwnerAccountId</code>. Untagging
     * resources across accounts is not supported.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates an Amazon Web Services Migration Hub Refactor Spaces route.
     * </p>
     * 
     * @param updateRouteRequest
     * @return A Java Future containing the result of the UpdateRoute operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsync.UpdateRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/UpdateRoute"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRouteResult> updateRouteAsync(UpdateRouteRequest updateRouteRequest);

    /**
     * <p>
     * Updates an Amazon Web Services Migration Hub Refactor Spaces route.
     * </p>
     * 
     * @param updateRouteRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRoute operation returned by the service.
     * @sample AWSMigrationHubRefactorSpacesAsyncHandler.UpdateRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/UpdateRoute"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRouteResult> updateRouteAsync(UpdateRouteRequest updateRouteRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRouteRequest, UpdateRouteResult> asyncHandler);

}
