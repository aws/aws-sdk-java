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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.migrationhubrefactorspaces.model.*;

/**
 * Interface for accessing AWS Migration Hub Refactor Spaces.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.migrationhubrefactorspaces.AbstractAWSMigrationHubRefactorSpaces} instead.
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
public interface AWSMigrationHubRefactorSpaces {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "refactor-spaces";

    /**
     * <p>
     * Creates an Amazon Web Services Migration Hub Refactor Spaces application. The account that owns the environment
     * also owns the applications created inside the environment, regardless of the account that creates the
     * application. Refactor Spaces provisions an Amazon API Gateway, API Gateway VPC link, and Network Load Balancer
     * for the application proxy inside your account.
     * </p>
     * 
     * @param createApplicationRequest
     * @return Result of the CreateApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/CreateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    CreateApplicationResult createApplication(CreateApplicationRequest createApplicationRequest);

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
     * @return Result of the CreateEnvironment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.CreateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/CreateEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    CreateEnvironmentResult createEnvironment(CreateEnvironmentRequest createEnvironmentRequest);

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
     * @return Result of the CreateRoute operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.CreateRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/CreateRoute"
     *      target="_top">AWS API Documentation</a>
     */
    CreateRouteResult createRoute(CreateRouteRequest createRouteRequest);

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
     * @return Result of the CreateService operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.CreateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/CreateService"
     *      target="_top">AWS API Documentation</a>
     */
    CreateServiceResult createService(CreateServiceRequest createServiceRequest);

    /**
     * <p>
     * Deletes an Amazon Web Services Migration Hub Refactor Spaces application. Before you can delete an application,
     * you must first delete any services or routes within the application.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @return Result of the DeleteApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/DeleteApplication"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteApplicationResult deleteApplication(DeleteApplicationRequest deleteApplicationRequest);

    /**
     * <p>
     * Deletes an Amazon Web Services Migration Hub Refactor Spaces environment. Before you can delete an environment,
     * you must first delete any applications and services within the environment.
     * </p>
     * 
     * @param deleteEnvironmentRequest
     * @return Result of the DeleteEnvironment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.DeleteEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/DeleteEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteEnvironmentResult deleteEnvironment(DeleteEnvironmentRequest deleteEnvironmentRequest);

    /**
     * <p>
     * Deletes the resource policy set for the environment.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return Result of the DeleteResourcePolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.DeleteResourcePolicy
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/DeleteResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteResourcePolicyResult deleteResourcePolicy(DeleteResourcePolicyRequest deleteResourcePolicyRequest);

    /**
     * <p>
     * Deletes an Amazon Web Services Migration Hub Refactor Spaces route.
     * </p>
     * 
     * @param deleteRouteRequest
     * @return Result of the DeleteRoute operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.DeleteRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/DeleteRoute"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteRouteResult deleteRoute(DeleteRouteRequest deleteRouteRequest);

    /**
     * <p>
     * Deletes an Amazon Web Services Migration Hub Refactor Spaces service.
     * </p>
     * 
     * @param deleteServiceRequest
     * @return Result of the DeleteService operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.DeleteService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/DeleteService"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteServiceResult deleteService(DeleteServiceRequest deleteServiceRequest);

    /**
     * <p>
     * Gets an Amazon Web Services Migration Hub Refactor Spaces application.
     * </p>
     * 
     * @param getApplicationRequest
     * @return Result of the GetApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.GetApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/GetApplication"
     *      target="_top">AWS API Documentation</a>
     */
    GetApplicationResult getApplication(GetApplicationRequest getApplicationRequest);

    /**
     * <p>
     * Gets an Amazon Web Services Migration Hub Refactor Spaces environment.
     * </p>
     * 
     * @param getEnvironmentRequest
     * @return Result of the GetEnvironment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.GetEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/GetEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    GetEnvironmentResult getEnvironment(GetEnvironmentRequest getEnvironmentRequest);

    /**
     * <p>
     * Gets the resource-based permission policy that is set for the given environment.
     * </p>
     * 
     * @param getResourcePolicyRequest
     * @return Result of the GetResourcePolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.GetResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/GetResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    GetResourcePolicyResult getResourcePolicy(GetResourcePolicyRequest getResourcePolicyRequest);

    /**
     * <p>
     * Gets an Amazon Web Services Migration Hub Refactor Spaces route.
     * </p>
     * 
     * @param getRouteRequest
     * @return Result of the GetRoute operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.GetRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/GetRoute"
     *      target="_top">AWS API Documentation</a>
     */
    GetRouteResult getRoute(GetRouteRequest getRouteRequest);

    /**
     * <p>
     * Gets an Amazon Web Services Migration Hub Refactor Spaces service.
     * </p>
     * 
     * @param getServiceRequest
     * @return Result of the GetService operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.GetService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/GetService"
     *      target="_top">AWS API Documentation</a>
     */
    GetServiceResult getService(GetServiceRequest getServiceRequest);

    /**
     * <p>
     * Lists all the Amazon Web Services Migration Hub Refactor Spaces applications within an environment.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return Result of the ListApplications operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/ListApplications"
     *      target="_top">AWS API Documentation</a>
     */
    ListApplicationsResult listApplications(ListApplicationsRequest listApplicationsRequest);

    /**
     * <p>
     * Lists all Amazon Web Services Migration Hub Refactor Spaces service virtual private clouds (VPCs) that are part
     * of the environment.
     * </p>
     * 
     * @param listEnvironmentVpcsRequest
     * @return Result of the ListEnvironmentVpcs operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.ListEnvironmentVpcs
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/ListEnvironmentVpcs"
     *      target="_top">AWS API Documentation</a>
     */
    ListEnvironmentVpcsResult listEnvironmentVpcs(ListEnvironmentVpcsRequest listEnvironmentVpcsRequest);

    /**
     * <p>
     * Lists Amazon Web Services Migration Hub Refactor Spaces environments owned by a caller account or shared with the
     * caller account.
     * </p>
     * 
     * @param listEnvironmentsRequest
     * @return Result of the ListEnvironments operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.ListEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/ListEnvironments"
     *      target="_top">AWS API Documentation</a>
     */
    ListEnvironmentsResult listEnvironments(ListEnvironmentsRequest listEnvironmentsRequest);

    /**
     * <p>
     * Lists all the Amazon Web Services Migration Hub Refactor Spaces routes within an application.
     * </p>
     * 
     * @param listRoutesRequest
     * @return Result of the ListRoutes operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.ListRoutes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/ListRoutes"
     *      target="_top">AWS API Documentation</a>
     */
    ListRoutesResult listRoutes(ListRoutesRequest listRoutesRequest);

    /**
     * <p>
     * Lists all the Amazon Web Services Migration Hub Refactor Spaces services within an application.
     * </p>
     * 
     * @param listServicesRequest
     * @return Result of the ListServices operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.ListServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/ListServices"
     *      target="_top">AWS API Documentation</a>
     */
    ListServicesResult listServices(ListServicesRequest listServicesRequest);

    /**
     * <p>
     * Lists the tags of a resource. The caller account must be the same as the resource’s <code>OwnerAccountId</code>.
     * Listing tags in other accounts is not supported.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @sample AWSMigrationHubRefactorSpaces.ListTagsForResource
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Attaches a resource-based permission policy to the Amazon Web Services Migration Hub Refactor Spaces environment.
     * The policy must contain the same actions and condition statements as the
     * <code>arn:aws:ram::aws:permission/AWSRAMDefaultPermissionRefactorSpacesEnvironment</code> permission in Resource
     * Access Manager. The policy must not contain new lines or blank lines.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @return Result of the PutResourcePolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws InvalidResourcePolicyException
     *         The resource policy is not valid.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/PutResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    PutResourcePolicyResult putResourcePolicy(PutResourcePolicyRequest putResourcePolicyRequest);

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
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @sample AWSMigrationHubRefactorSpaces.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource. To
     * untag a resource, the caller account must be the same as the resource’s <code>OwnerAccountId</code>. Untagging
     * resources across accounts is not supported.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @sample AWSMigrationHubRefactorSpaces.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates an Amazon Web Services Migration Hub Refactor Spaces route.
     * </p>
     * 
     * @param updateRouteRequest
     * @return Result of the UpdateRoute operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.UpdateRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/UpdateRoute"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRouteResult updateRoute(UpdateRouteRequest updateRouteRequest);

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
