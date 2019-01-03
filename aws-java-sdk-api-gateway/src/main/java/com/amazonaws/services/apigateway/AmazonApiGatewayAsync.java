/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.apigateway;

import javax.annotation.Generated;

import com.amazonaws.services.apigateway.model.*;

/**
 * Interface for accessing Amazon API Gateway asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.apigateway.AbstractAmazonApiGatewayAsync} instead.
 * </p>
 * <p>
 * <fullname>Amazon API Gateway</fullname>
 * <p>
 * Amazon API Gateway helps developers deliver robust, secure, and scalable mobile and web application back ends. API
 * Gateway allows developers to securely connect mobile and web applications to APIs that run on AWS Lambda, Amazon EC2,
 * or other publicly addressable web services that are hosted outside of AWS.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonApiGatewayAsync extends AmazonApiGateway {

    /**
     * <p>
     * Create an <a>ApiKey</a> resource.
     * </p>
     * <div class="seeAlso"><a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/create-api-key.html">AWS CLI</a></div>
     * 
     * @param createApiKeyRequest
     *        Request to create an <a>ApiKey</a> resource.
     * @return A Java Future containing the result of the CreateApiKey operation returned by the service.
     * @sample AmazonApiGatewayAsync.CreateApiKey
     */
    java.util.concurrent.Future<CreateApiKeyResult> createApiKeyAsync(CreateApiKeyRequest createApiKeyRequest);

    /**
     * <p>
     * Create an <a>ApiKey</a> resource.
     * </p>
     * <div class="seeAlso"><a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/create-api-key.html">AWS CLI</a></div>
     * 
     * @param createApiKeyRequest
     *        Request to create an <a>ApiKey</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateApiKey operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.CreateApiKey
     */
    java.util.concurrent.Future<CreateApiKeyResult> createApiKeyAsync(CreateApiKeyRequest createApiKeyRequest,
            com.amazonaws.handlers.AsyncHandler<CreateApiKeyRequest, CreateApiKeyResult> asyncHandler);

    /**
     * <p>
     * Adds a new <a>Authorizer</a> resource to an existing <a>RestApi</a> resource.
     * </p>
     * <div class="seeAlso"><a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/create-authorizer.html">AWS CLI</a></div>
     * 
     * @param createAuthorizerRequest
     *        Request to add a new <a>Authorizer</a> to an existing <a>RestApi</a> resource.
     * @return A Java Future containing the result of the CreateAuthorizer operation returned by the service.
     * @sample AmazonApiGatewayAsync.CreateAuthorizer
     */
    java.util.concurrent.Future<CreateAuthorizerResult> createAuthorizerAsync(CreateAuthorizerRequest createAuthorizerRequest);

    /**
     * <p>
     * Adds a new <a>Authorizer</a> resource to an existing <a>RestApi</a> resource.
     * </p>
     * <div class="seeAlso"><a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/create-authorizer.html">AWS CLI</a></div>
     * 
     * @param createAuthorizerRequest
     *        Request to add a new <a>Authorizer</a> to an existing <a>RestApi</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAuthorizer operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.CreateAuthorizer
     */
    java.util.concurrent.Future<CreateAuthorizerResult> createAuthorizerAsync(CreateAuthorizerRequest createAuthorizerRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAuthorizerRequest, CreateAuthorizerResult> asyncHandler);

    /**
     * <p>
     * Creates a new <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param createBasePathMappingRequest
     *        Requests API Gateway to create a new <a>BasePathMapping</a> resource.
     * @return A Java Future containing the result of the CreateBasePathMapping operation returned by the service.
     * @sample AmazonApiGatewayAsync.CreateBasePathMapping
     */
    java.util.concurrent.Future<CreateBasePathMappingResult> createBasePathMappingAsync(CreateBasePathMappingRequest createBasePathMappingRequest);

    /**
     * <p>
     * Creates a new <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param createBasePathMappingRequest
     *        Requests API Gateway to create a new <a>BasePathMapping</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBasePathMapping operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.CreateBasePathMapping
     */
    java.util.concurrent.Future<CreateBasePathMappingResult> createBasePathMappingAsync(CreateBasePathMappingRequest createBasePathMappingRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBasePathMappingRequest, CreateBasePathMappingResult> asyncHandler);

    /**
     * <p>
     * Creates a <a>Deployment</a> resource, which makes a specified <a>RestApi</a> callable over the internet.
     * </p>
     * 
     * @param createDeploymentRequest
     *        Requests API Gateway to create a <a>Deployment</a> resource.
     * @return A Java Future containing the result of the CreateDeployment operation returned by the service.
     * @sample AmazonApiGatewayAsync.CreateDeployment
     */
    java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest createDeploymentRequest);

    /**
     * <p>
     * Creates a <a>Deployment</a> resource, which makes a specified <a>RestApi</a> callable over the internet.
     * </p>
     * 
     * @param createDeploymentRequest
     *        Requests API Gateway to create a <a>Deployment</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDeployment operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.CreateDeployment
     */
    java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest createDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDeploymentRequest, CreateDeploymentResult> asyncHandler);

    /**
     * @param createDocumentationPartRequest
     *        Creates a new documentation part of a given API.
     * @return A Java Future containing the result of the CreateDocumentationPart operation returned by the service.
     * @sample AmazonApiGatewayAsync.CreateDocumentationPart
     */
    java.util.concurrent.Future<CreateDocumentationPartResult> createDocumentationPartAsync(CreateDocumentationPartRequest createDocumentationPartRequest);

    /**
     * @param createDocumentationPartRequest
     *        Creates a new documentation part of a given API.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDocumentationPart operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.CreateDocumentationPart
     */
    java.util.concurrent.Future<CreateDocumentationPartResult> createDocumentationPartAsync(CreateDocumentationPartRequest createDocumentationPartRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDocumentationPartRequest, CreateDocumentationPartResult> asyncHandler);

    /**
     * @param createDocumentationVersionRequest
     *        Creates a new documentation version of a given API.
     * @return A Java Future containing the result of the CreateDocumentationVersion operation returned by the service.
     * @sample AmazonApiGatewayAsync.CreateDocumentationVersion
     */
    java.util.concurrent.Future<CreateDocumentationVersionResult> createDocumentationVersionAsync(
            CreateDocumentationVersionRequest createDocumentationVersionRequest);

    /**
     * @param createDocumentationVersionRequest
     *        Creates a new documentation version of a given API.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDocumentationVersion operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.CreateDocumentationVersion
     */
    java.util.concurrent.Future<CreateDocumentationVersionResult> createDocumentationVersionAsync(
            CreateDocumentationVersionRequest createDocumentationVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDocumentationVersionRequest, CreateDocumentationVersionResult> asyncHandler);

    /**
     * <p>
     * Creates a new domain name.
     * </p>
     * 
     * @param createDomainNameRequest
     *        A request to create a new domain name.
     * @return A Java Future containing the result of the CreateDomainName operation returned by the service.
     * @sample AmazonApiGatewayAsync.CreateDomainName
     */
    java.util.concurrent.Future<CreateDomainNameResult> createDomainNameAsync(CreateDomainNameRequest createDomainNameRequest);

    /**
     * <p>
     * Creates a new domain name.
     * </p>
     * 
     * @param createDomainNameRequest
     *        A request to create a new domain name.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDomainName operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.CreateDomainName
     */
    java.util.concurrent.Future<CreateDomainNameResult> createDomainNameAsync(CreateDomainNameRequest createDomainNameRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDomainNameRequest, CreateDomainNameResult> asyncHandler);

    /**
     * <p>
     * Adds a new <a>Model</a> resource to an existing <a>RestApi</a> resource.
     * </p>
     * 
     * @param createModelRequest
     *        Request to add a new <a>Model</a> to an existing <a>RestApi</a> resource.
     * @return A Java Future containing the result of the CreateModel operation returned by the service.
     * @sample AmazonApiGatewayAsync.CreateModel
     */
    java.util.concurrent.Future<CreateModelResult> createModelAsync(CreateModelRequest createModelRequest);

    /**
     * <p>
     * Adds a new <a>Model</a> resource to an existing <a>RestApi</a> resource.
     * </p>
     * 
     * @param createModelRequest
     *        Request to add a new <a>Model</a> to an existing <a>RestApi</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateModel operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.CreateModel
     */
    java.util.concurrent.Future<CreateModelResult> createModelAsync(CreateModelRequest createModelRequest,
            com.amazonaws.handlers.AsyncHandler<CreateModelRequest, CreateModelResult> asyncHandler);

    /**
     * <p>
     * Creates a <a>ReqeustValidator</a> of a given <a>RestApi</a>.
     * </p>
     * 
     * @param createRequestValidatorRequest
     *        Creates a <a>RequestValidator</a> of a given <a>RestApi</a>.
     * @return A Java Future containing the result of the CreateRequestValidator operation returned by the service.
     * @sample AmazonApiGatewayAsync.CreateRequestValidator
     */
    java.util.concurrent.Future<CreateRequestValidatorResult> createRequestValidatorAsync(CreateRequestValidatorRequest createRequestValidatorRequest);

    /**
     * <p>
     * Creates a <a>ReqeustValidator</a> of a given <a>RestApi</a>.
     * </p>
     * 
     * @param createRequestValidatorRequest
     *        Creates a <a>RequestValidator</a> of a given <a>RestApi</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRequestValidator operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.CreateRequestValidator
     */
    java.util.concurrent.Future<CreateRequestValidatorResult> createRequestValidatorAsync(CreateRequestValidatorRequest createRequestValidatorRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRequestValidatorRequest, CreateRequestValidatorResult> asyncHandler);

    /**
     * <p>
     * Creates a <a>Resource</a> resource.
     * </p>
     * 
     * @param createResourceRequest
     *        Requests API Gateway to create a <a>Resource</a> resource.
     * @return A Java Future containing the result of the CreateResource operation returned by the service.
     * @sample AmazonApiGatewayAsync.CreateResource
     */
    java.util.concurrent.Future<CreateResourceResult> createResourceAsync(CreateResourceRequest createResourceRequest);

    /**
     * <p>
     * Creates a <a>Resource</a> resource.
     * </p>
     * 
     * @param createResourceRequest
     *        Requests API Gateway to create a <a>Resource</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateResource operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.CreateResource
     */
    java.util.concurrent.Future<CreateResourceResult> createResourceAsync(CreateResourceRequest createResourceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateResourceRequest, CreateResourceResult> asyncHandler);

    /**
     * <p>
     * Creates a new <a>RestApi</a> resource.
     * </p>
     * 
     * @param createRestApiRequest
     *        The POST Request to add a new <a>RestApi</a> resource to your collection.
     * @return A Java Future containing the result of the CreateRestApi operation returned by the service.
     * @sample AmazonApiGatewayAsync.CreateRestApi
     */
    java.util.concurrent.Future<CreateRestApiResult> createRestApiAsync(CreateRestApiRequest createRestApiRequest);

    /**
     * <p>
     * Creates a new <a>RestApi</a> resource.
     * </p>
     * 
     * @param createRestApiRequest
     *        The POST Request to add a new <a>RestApi</a> resource to your collection.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRestApi operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.CreateRestApi
     */
    java.util.concurrent.Future<CreateRestApiResult> createRestApiAsync(CreateRestApiRequest createRestApiRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRestApiRequest, CreateRestApiResult> asyncHandler);

    /**
     * <p>
     * Creates a new <a>Stage</a> resource that references a pre-existing <a>Deployment</a> for the API.
     * </p>
     * 
     * @param createStageRequest
     *        Requests API Gateway to create a <a>Stage</a> resource.
     * @return A Java Future containing the result of the CreateStage operation returned by the service.
     * @sample AmazonApiGatewayAsync.CreateStage
     */
    java.util.concurrent.Future<CreateStageResult> createStageAsync(CreateStageRequest createStageRequest);

    /**
     * <p>
     * Creates a new <a>Stage</a> resource that references a pre-existing <a>Deployment</a> for the API.
     * </p>
     * 
     * @param createStageRequest
     *        Requests API Gateway to create a <a>Stage</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateStage operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.CreateStage
     */
    java.util.concurrent.Future<CreateStageResult> createStageAsync(CreateStageRequest createStageRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStageRequest, CreateStageResult> asyncHandler);

    /**
     * <p>
     * Creates a usage plan with the throttle and quota limits, as well as the associated API stages, specified in the
     * payload.
     * </p>
     * 
     * @param createUsagePlanRequest
     *        The POST request to create a usage plan with the name, description, throttle limits and quota limits, as
     *        well as the associated API stages, specified in the payload.
     * @return A Java Future containing the result of the CreateUsagePlan operation returned by the service.
     * @sample AmazonApiGatewayAsync.CreateUsagePlan
     */
    java.util.concurrent.Future<CreateUsagePlanResult> createUsagePlanAsync(CreateUsagePlanRequest createUsagePlanRequest);

    /**
     * <p>
     * Creates a usage plan with the throttle and quota limits, as well as the associated API stages, specified in the
     * payload.
     * </p>
     * 
     * @param createUsagePlanRequest
     *        The POST request to create a usage plan with the name, description, throttle limits and quota limits, as
     *        well as the associated API stages, specified in the payload.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateUsagePlan operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.CreateUsagePlan
     */
    java.util.concurrent.Future<CreateUsagePlanResult> createUsagePlanAsync(CreateUsagePlanRequest createUsagePlanRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUsagePlanRequest, CreateUsagePlanResult> asyncHandler);

    /**
     * <p>
     * Creates a usage plan key for adding an existing API key to a usage plan.
     * </p>
     * 
     * @param createUsagePlanKeyRequest
     *        The POST request to create a usage plan key for adding an existing API key to a usage plan.
     * @return A Java Future containing the result of the CreateUsagePlanKey operation returned by the service.
     * @sample AmazonApiGatewayAsync.CreateUsagePlanKey
     */
    java.util.concurrent.Future<CreateUsagePlanKeyResult> createUsagePlanKeyAsync(CreateUsagePlanKeyRequest createUsagePlanKeyRequest);

    /**
     * <p>
     * Creates a usage plan key for adding an existing API key to a usage plan.
     * </p>
     * 
     * @param createUsagePlanKeyRequest
     *        The POST request to create a usage plan key for adding an existing API key to a usage plan.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateUsagePlanKey operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.CreateUsagePlanKey
     */
    java.util.concurrent.Future<CreateUsagePlanKeyResult> createUsagePlanKeyAsync(CreateUsagePlanKeyRequest createUsagePlanKeyRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUsagePlanKeyRequest, CreateUsagePlanKeyResult> asyncHandler);

    /**
     * <p>
     * Creates a VPC link, under the caller's account in a selected region, in an asynchronous operation that typically
     * takes 2-4 minutes to complete and become operational. The caller must have permissions to create and update VPC
     * Endpoint services.
     * </p>
     * 
     * @param createVpcLinkRequest
     *        Creates a VPC link, under the caller's account in a selected region, in an asynchronous operation that
     *        typically takes 2-4 minutes to complete and become operational. The caller must have permissions to create
     *        and update VPC Endpoint services.
     * @return A Java Future containing the result of the CreateVpcLink operation returned by the service.
     * @sample AmazonApiGatewayAsync.CreateVpcLink
     */
    java.util.concurrent.Future<CreateVpcLinkResult> createVpcLinkAsync(CreateVpcLinkRequest createVpcLinkRequest);

    /**
     * <p>
     * Creates a VPC link, under the caller's account in a selected region, in an asynchronous operation that typically
     * takes 2-4 minutes to complete and become operational. The caller must have permissions to create and update VPC
     * Endpoint services.
     * </p>
     * 
     * @param createVpcLinkRequest
     *        Creates a VPC link, under the caller's account in a selected region, in an asynchronous operation that
     *        typically takes 2-4 minutes to complete and become operational. The caller must have permissions to create
     *        and update VPC Endpoint services.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVpcLink operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.CreateVpcLink
     */
    java.util.concurrent.Future<CreateVpcLinkResult> createVpcLinkAsync(CreateVpcLinkRequest createVpcLinkRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVpcLinkRequest, CreateVpcLinkResult> asyncHandler);

    /**
     * <p>
     * Deletes the <a>ApiKey</a> resource.
     * </p>
     * 
     * @param deleteApiKeyRequest
     *        A request to delete the <a>ApiKey</a> resource.
     * @return A Java Future containing the result of the DeleteApiKey operation returned by the service.
     * @sample AmazonApiGatewayAsync.DeleteApiKey
     */
    java.util.concurrent.Future<DeleteApiKeyResult> deleteApiKeyAsync(DeleteApiKeyRequest deleteApiKeyRequest);

    /**
     * <p>
     * Deletes the <a>ApiKey</a> resource.
     * </p>
     * 
     * @param deleteApiKeyRequest
     *        A request to delete the <a>ApiKey</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApiKey operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.DeleteApiKey
     */
    java.util.concurrent.Future<DeleteApiKeyResult> deleteApiKeyAsync(DeleteApiKeyRequest deleteApiKeyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApiKeyRequest, DeleteApiKeyResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing <a>Authorizer</a> resource.
     * </p>
     * <div class="seeAlso"><a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/delete-authorizer.html">AWS CLI</a></div>
     * 
     * @param deleteAuthorizerRequest
     *        Request to delete an existing <a>Authorizer</a> resource.
     * @return A Java Future containing the result of the DeleteAuthorizer operation returned by the service.
     * @sample AmazonApiGatewayAsync.DeleteAuthorizer
     */
    java.util.concurrent.Future<DeleteAuthorizerResult> deleteAuthorizerAsync(DeleteAuthorizerRequest deleteAuthorizerRequest);

    /**
     * <p>
     * Deletes an existing <a>Authorizer</a> resource.
     * </p>
     * <div class="seeAlso"><a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/delete-authorizer.html">AWS CLI</a></div>
     * 
     * @param deleteAuthorizerRequest
     *        Request to delete an existing <a>Authorizer</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAuthorizer operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.DeleteAuthorizer
     */
    java.util.concurrent.Future<DeleteAuthorizerResult> deleteAuthorizerAsync(DeleteAuthorizerRequest deleteAuthorizerRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAuthorizerRequest, DeleteAuthorizerResult> asyncHandler);

    /**
     * <p>
     * Deletes the <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param deleteBasePathMappingRequest
     *        A request to delete the <a>BasePathMapping</a> resource.
     * @return A Java Future containing the result of the DeleteBasePathMapping operation returned by the service.
     * @sample AmazonApiGatewayAsync.DeleteBasePathMapping
     */
    java.util.concurrent.Future<DeleteBasePathMappingResult> deleteBasePathMappingAsync(DeleteBasePathMappingRequest deleteBasePathMappingRequest);

    /**
     * <p>
     * Deletes the <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param deleteBasePathMappingRequest
     *        A request to delete the <a>BasePathMapping</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBasePathMapping operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.DeleteBasePathMapping
     */
    java.util.concurrent.Future<DeleteBasePathMappingResult> deleteBasePathMappingAsync(DeleteBasePathMappingRequest deleteBasePathMappingRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBasePathMappingRequest, DeleteBasePathMappingResult> asyncHandler);

    /**
     * <p>
     * Deletes the <a>ClientCertificate</a> resource.
     * </p>
     * 
     * @param deleteClientCertificateRequest
     *        A request to delete the <a>ClientCertificate</a> resource.
     * @return A Java Future containing the result of the DeleteClientCertificate operation returned by the service.
     * @sample AmazonApiGatewayAsync.DeleteClientCertificate
     */
    java.util.concurrent.Future<DeleteClientCertificateResult> deleteClientCertificateAsync(DeleteClientCertificateRequest deleteClientCertificateRequest);

    /**
     * <p>
     * Deletes the <a>ClientCertificate</a> resource.
     * </p>
     * 
     * @param deleteClientCertificateRequest
     *        A request to delete the <a>ClientCertificate</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteClientCertificate operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.DeleteClientCertificate
     */
    java.util.concurrent.Future<DeleteClientCertificateResult> deleteClientCertificateAsync(DeleteClientCertificateRequest deleteClientCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteClientCertificateRequest, DeleteClientCertificateResult> asyncHandler);

    /**
     * <p>
     * Deletes a <a>Deployment</a> resource. Deleting a deployment will only succeed if there are no <a>Stage</a>
     * resources associated with it.
     * </p>
     * 
     * @param deleteDeploymentRequest
     *        Requests API Gateway to delete a <a>Deployment</a> resource.
     * @return A Java Future containing the result of the DeleteDeployment operation returned by the service.
     * @sample AmazonApiGatewayAsync.DeleteDeployment
     */
    java.util.concurrent.Future<DeleteDeploymentResult> deleteDeploymentAsync(DeleteDeploymentRequest deleteDeploymentRequest);

    /**
     * <p>
     * Deletes a <a>Deployment</a> resource. Deleting a deployment will only succeed if there are no <a>Stage</a>
     * resources associated with it.
     * </p>
     * 
     * @param deleteDeploymentRequest
     *        Requests API Gateway to delete a <a>Deployment</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDeployment operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.DeleteDeployment
     */
    java.util.concurrent.Future<DeleteDeploymentResult> deleteDeploymentAsync(DeleteDeploymentRequest deleteDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDeploymentRequest, DeleteDeploymentResult> asyncHandler);

    /**
     * @param deleteDocumentationPartRequest
     *        Deletes an existing documentation part of an API.
     * @return A Java Future containing the result of the DeleteDocumentationPart operation returned by the service.
     * @sample AmazonApiGatewayAsync.DeleteDocumentationPart
     */
    java.util.concurrent.Future<DeleteDocumentationPartResult> deleteDocumentationPartAsync(DeleteDocumentationPartRequest deleteDocumentationPartRequest);

    /**
     * @param deleteDocumentationPartRequest
     *        Deletes an existing documentation part of an API.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDocumentationPart operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.DeleteDocumentationPart
     */
    java.util.concurrent.Future<DeleteDocumentationPartResult> deleteDocumentationPartAsync(DeleteDocumentationPartRequest deleteDocumentationPartRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDocumentationPartRequest, DeleteDocumentationPartResult> asyncHandler);

    /**
     * @param deleteDocumentationVersionRequest
     *        Deletes an existing documentation version of an API.
     * @return A Java Future containing the result of the DeleteDocumentationVersion operation returned by the service.
     * @sample AmazonApiGatewayAsync.DeleteDocumentationVersion
     */
    java.util.concurrent.Future<DeleteDocumentationVersionResult> deleteDocumentationVersionAsync(
            DeleteDocumentationVersionRequest deleteDocumentationVersionRequest);

    /**
     * @param deleteDocumentationVersionRequest
     *        Deletes an existing documentation version of an API.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDocumentationVersion operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.DeleteDocumentationVersion
     */
    java.util.concurrent.Future<DeleteDocumentationVersionResult> deleteDocumentationVersionAsync(
            DeleteDocumentationVersionRequest deleteDocumentationVersionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDocumentationVersionRequest, DeleteDocumentationVersionResult> asyncHandler);

    /**
     * <p>
     * Deletes the <a>DomainName</a> resource.
     * </p>
     * 
     * @param deleteDomainNameRequest
     *        A request to delete the <a>DomainName</a> resource.
     * @return A Java Future containing the result of the DeleteDomainName operation returned by the service.
     * @sample AmazonApiGatewayAsync.DeleteDomainName
     */
    java.util.concurrent.Future<DeleteDomainNameResult> deleteDomainNameAsync(DeleteDomainNameRequest deleteDomainNameRequest);

    /**
     * <p>
     * Deletes the <a>DomainName</a> resource.
     * </p>
     * 
     * @param deleteDomainNameRequest
     *        A request to delete the <a>DomainName</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDomainName operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.DeleteDomainName
     */
    java.util.concurrent.Future<DeleteDomainNameResult> deleteDomainNameAsync(DeleteDomainNameRequest deleteDomainNameRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDomainNameRequest, DeleteDomainNameResult> asyncHandler);

    /**
     * <p>
     * Clears any customization of a <a>GatewayResponse</a> of a specified response type on the given <a>RestApi</a> and
     * resets it with the default settings.
     * </p>
     * 
     * @param deleteGatewayResponseRequest
     *        Clears any customization of a <a>GatewayResponse</a> of a specified response type on the given
     *        <a>RestApi</a> and resets it with the default settings.
     * @return A Java Future containing the result of the DeleteGatewayResponse operation returned by the service.
     * @sample AmazonApiGatewayAsync.DeleteGatewayResponse
     */
    java.util.concurrent.Future<DeleteGatewayResponseResult> deleteGatewayResponseAsync(DeleteGatewayResponseRequest deleteGatewayResponseRequest);

    /**
     * <p>
     * Clears any customization of a <a>GatewayResponse</a> of a specified response type on the given <a>RestApi</a> and
     * resets it with the default settings.
     * </p>
     * 
     * @param deleteGatewayResponseRequest
     *        Clears any customization of a <a>GatewayResponse</a> of a specified response type on the given
     *        <a>RestApi</a> and resets it with the default settings.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteGatewayResponse operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.DeleteGatewayResponse
     */
    java.util.concurrent.Future<DeleteGatewayResponseResult> deleteGatewayResponseAsync(DeleteGatewayResponseRequest deleteGatewayResponseRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGatewayResponseRequest, DeleteGatewayResponseResult> asyncHandler);

    /**
     * <p>
     * Represents a delete integration.
     * </p>
     * 
     * @param deleteIntegrationRequest
     *        Represents a delete integration request.
     * @return A Java Future containing the result of the DeleteIntegration operation returned by the service.
     * @sample AmazonApiGatewayAsync.DeleteIntegration
     */
    java.util.concurrent.Future<DeleteIntegrationResult> deleteIntegrationAsync(DeleteIntegrationRequest deleteIntegrationRequest);

    /**
     * <p>
     * Represents a delete integration.
     * </p>
     * 
     * @param deleteIntegrationRequest
     *        Represents a delete integration request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteIntegration operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.DeleteIntegration
     */
    java.util.concurrent.Future<DeleteIntegrationResult> deleteIntegrationAsync(DeleteIntegrationRequest deleteIntegrationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIntegrationRequest, DeleteIntegrationResult> asyncHandler);

    /**
     * <p>
     * Represents a delete integration response.
     * </p>
     * 
     * @param deleteIntegrationResponseRequest
     *        Represents a delete integration response request.
     * @return A Java Future containing the result of the DeleteIntegrationResponse operation returned by the service.
     * @sample AmazonApiGatewayAsync.DeleteIntegrationResponse
     */
    java.util.concurrent.Future<DeleteIntegrationResponseResult> deleteIntegrationResponseAsync(
            DeleteIntegrationResponseRequest deleteIntegrationResponseRequest);

    /**
     * <p>
     * Represents a delete integration response.
     * </p>
     * 
     * @param deleteIntegrationResponseRequest
     *        Represents a delete integration response request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteIntegrationResponse operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.DeleteIntegrationResponse
     */
    java.util.concurrent.Future<DeleteIntegrationResponseResult> deleteIntegrationResponseAsync(
            DeleteIntegrationResponseRequest deleteIntegrationResponseRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIntegrationResponseRequest, DeleteIntegrationResponseResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing <a>Method</a> resource.
     * </p>
     * 
     * @param deleteMethodRequest
     *        Request to delete an existing <a>Method</a> resource.
     * @return A Java Future containing the result of the DeleteMethod operation returned by the service.
     * @sample AmazonApiGatewayAsync.DeleteMethod
     */
    java.util.concurrent.Future<DeleteMethodResult> deleteMethodAsync(DeleteMethodRequest deleteMethodRequest);

    /**
     * <p>
     * Deletes an existing <a>Method</a> resource.
     * </p>
     * 
     * @param deleteMethodRequest
     *        Request to delete an existing <a>Method</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMethod operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.DeleteMethod
     */
    java.util.concurrent.Future<DeleteMethodResult> deleteMethodAsync(DeleteMethodRequest deleteMethodRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMethodRequest, DeleteMethodResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing <a>MethodResponse</a> resource.
     * </p>
     * 
     * @param deleteMethodResponseRequest
     *        A request to delete an existing <a>MethodResponse</a> resource.
     * @return A Java Future containing the result of the DeleteMethodResponse operation returned by the service.
     * @sample AmazonApiGatewayAsync.DeleteMethodResponse
     */
    java.util.concurrent.Future<DeleteMethodResponseResult> deleteMethodResponseAsync(DeleteMethodResponseRequest deleteMethodResponseRequest);

    /**
     * <p>
     * Deletes an existing <a>MethodResponse</a> resource.
     * </p>
     * 
     * @param deleteMethodResponseRequest
     *        A request to delete an existing <a>MethodResponse</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMethodResponse operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.DeleteMethodResponse
     */
    java.util.concurrent.Future<DeleteMethodResponseResult> deleteMethodResponseAsync(DeleteMethodResponseRequest deleteMethodResponseRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMethodResponseRequest, DeleteMethodResponseResult> asyncHandler);

    /**
     * <p>
     * Deletes a model.
     * </p>
     * 
     * @param deleteModelRequest
     *        Request to delete an existing model in an existing <a>RestApi</a> resource.
     * @return A Java Future containing the result of the DeleteModel operation returned by the service.
     * @sample AmazonApiGatewayAsync.DeleteModel
     */
    java.util.concurrent.Future<DeleteModelResult> deleteModelAsync(DeleteModelRequest deleteModelRequest);

    /**
     * <p>
     * Deletes a model.
     * </p>
     * 
     * @param deleteModelRequest
     *        Request to delete an existing model in an existing <a>RestApi</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteModel operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.DeleteModel
     */
    java.util.concurrent.Future<DeleteModelResult> deleteModelAsync(DeleteModelRequest deleteModelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteModelRequest, DeleteModelResult> asyncHandler);

    /**
     * <p>
     * Deletes a <a>RequestValidator</a> of a given <a>RestApi</a>.
     * </p>
     * 
     * @param deleteRequestValidatorRequest
     *        Deletes a specified <a>RequestValidator</a> of a given <a>RestApi</a>.
     * @return A Java Future containing the result of the DeleteRequestValidator operation returned by the service.
     * @sample AmazonApiGatewayAsync.DeleteRequestValidator
     */
    java.util.concurrent.Future<DeleteRequestValidatorResult> deleteRequestValidatorAsync(DeleteRequestValidatorRequest deleteRequestValidatorRequest);

    /**
     * <p>
     * Deletes a <a>RequestValidator</a> of a given <a>RestApi</a>.
     * </p>
     * 
     * @param deleteRequestValidatorRequest
     *        Deletes a specified <a>RequestValidator</a> of a given <a>RestApi</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRequestValidator operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.DeleteRequestValidator
     */
    java.util.concurrent.Future<DeleteRequestValidatorResult> deleteRequestValidatorAsync(DeleteRequestValidatorRequest deleteRequestValidatorRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRequestValidatorRequest, DeleteRequestValidatorResult> asyncHandler);

    /**
     * <p>
     * Deletes a <a>Resource</a> resource.
     * </p>
     * 
     * @param deleteResourceRequest
     *        Request to delete a <a>Resource</a>.
     * @return A Java Future containing the result of the DeleteResource operation returned by the service.
     * @sample AmazonApiGatewayAsync.DeleteResource
     */
    java.util.concurrent.Future<DeleteResourceResult> deleteResourceAsync(DeleteResourceRequest deleteResourceRequest);

    /**
     * <p>
     * Deletes a <a>Resource</a> resource.
     * </p>
     * 
     * @param deleteResourceRequest
     *        Request to delete a <a>Resource</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteResource operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.DeleteResource
     */
    java.util.concurrent.Future<DeleteResourceResult> deleteResourceAsync(DeleteResourceRequest deleteResourceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteResourceRequest, DeleteResourceResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified API.
     * </p>
     * 
     * @param deleteRestApiRequest
     *        Request to delete the specified API from your collection.
     * @return A Java Future containing the result of the DeleteRestApi operation returned by the service.
     * @sample AmazonApiGatewayAsync.DeleteRestApi
     */
    java.util.concurrent.Future<DeleteRestApiResult> deleteRestApiAsync(DeleteRestApiRequest deleteRestApiRequest);

    /**
     * <p>
     * Deletes the specified API.
     * </p>
     * 
     * @param deleteRestApiRequest
     *        Request to delete the specified API from your collection.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRestApi operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.DeleteRestApi
     */
    java.util.concurrent.Future<DeleteRestApiResult> deleteRestApiAsync(DeleteRestApiRequest deleteRestApiRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRestApiRequest, DeleteRestApiResult> asyncHandler);

    /**
     * <p>
     * Deletes a <a>Stage</a> resource.
     * </p>
     * 
     * @param deleteStageRequest
     *        Requests API Gateway to delete a <a>Stage</a> resource.
     * @return A Java Future containing the result of the DeleteStage operation returned by the service.
     * @sample AmazonApiGatewayAsync.DeleteStage
     */
    java.util.concurrent.Future<DeleteStageResult> deleteStageAsync(DeleteStageRequest deleteStageRequest);

    /**
     * <p>
     * Deletes a <a>Stage</a> resource.
     * </p>
     * 
     * @param deleteStageRequest
     *        Requests API Gateway to delete a <a>Stage</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteStage operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.DeleteStage
     */
    java.util.concurrent.Future<DeleteStageResult> deleteStageAsync(DeleteStageRequest deleteStageRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteStageRequest, DeleteStageResult> asyncHandler);

    /**
     * <p>
     * Deletes a usage plan of a given plan Id.
     * </p>
     * 
     * @param deleteUsagePlanRequest
     *        The DELETE request to delete a usage plan of a given plan Id.
     * @return A Java Future containing the result of the DeleteUsagePlan operation returned by the service.
     * @sample AmazonApiGatewayAsync.DeleteUsagePlan
     */
    java.util.concurrent.Future<DeleteUsagePlanResult> deleteUsagePlanAsync(DeleteUsagePlanRequest deleteUsagePlanRequest);

    /**
     * <p>
     * Deletes a usage plan of a given plan Id.
     * </p>
     * 
     * @param deleteUsagePlanRequest
     *        The DELETE request to delete a usage plan of a given plan Id.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteUsagePlan operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.DeleteUsagePlan
     */
    java.util.concurrent.Future<DeleteUsagePlanResult> deleteUsagePlanAsync(DeleteUsagePlanRequest deleteUsagePlanRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUsagePlanRequest, DeleteUsagePlanResult> asyncHandler);

    /**
     * <p>
     * Deletes a usage plan key and remove the underlying API key from the associated usage plan.
     * </p>
     * 
     * @param deleteUsagePlanKeyRequest
     *        The DELETE request to delete a usage plan key and remove the underlying API key from the associated usage
     *        plan.
     * @return A Java Future containing the result of the DeleteUsagePlanKey operation returned by the service.
     * @sample AmazonApiGatewayAsync.DeleteUsagePlanKey
     */
    java.util.concurrent.Future<DeleteUsagePlanKeyResult> deleteUsagePlanKeyAsync(DeleteUsagePlanKeyRequest deleteUsagePlanKeyRequest);

    /**
     * <p>
     * Deletes a usage plan key and remove the underlying API key from the associated usage plan.
     * </p>
     * 
     * @param deleteUsagePlanKeyRequest
     *        The DELETE request to delete a usage plan key and remove the underlying API key from the associated usage
     *        plan.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteUsagePlanKey operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.DeleteUsagePlanKey
     */
    java.util.concurrent.Future<DeleteUsagePlanKeyResult> deleteUsagePlanKeyAsync(DeleteUsagePlanKeyRequest deleteUsagePlanKeyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUsagePlanKeyRequest, DeleteUsagePlanKeyResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing <a>VpcLink</a> of a specified identifier.
     * </p>
     * 
     * @param deleteVpcLinkRequest
     *        Deletes an existing <a>VpcLink</a> of a specified identifier.
     * @return A Java Future containing the result of the DeleteVpcLink operation returned by the service.
     * @sample AmazonApiGatewayAsync.DeleteVpcLink
     */
    java.util.concurrent.Future<DeleteVpcLinkResult> deleteVpcLinkAsync(DeleteVpcLinkRequest deleteVpcLinkRequest);

    /**
     * <p>
     * Deletes an existing <a>VpcLink</a> of a specified identifier.
     * </p>
     * 
     * @param deleteVpcLinkRequest
     *        Deletes an existing <a>VpcLink</a> of a specified identifier.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVpcLink operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.DeleteVpcLink
     */
    java.util.concurrent.Future<DeleteVpcLinkResult> deleteVpcLinkAsync(DeleteVpcLinkRequest deleteVpcLinkRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVpcLinkRequest, DeleteVpcLinkResult> asyncHandler);

    /**
     * <p>
     * Flushes all authorizer cache entries on a stage.
     * </p>
     * 
     * @param flushStageAuthorizersCacheRequest
     *        Request to flush authorizer cache entries on a specified stage.
     * @return A Java Future containing the result of the FlushStageAuthorizersCache operation returned by the service.
     * @sample AmazonApiGatewayAsync.FlushStageAuthorizersCache
     */
    java.util.concurrent.Future<FlushStageAuthorizersCacheResult> flushStageAuthorizersCacheAsync(
            FlushStageAuthorizersCacheRequest flushStageAuthorizersCacheRequest);

    /**
     * <p>
     * Flushes all authorizer cache entries on a stage.
     * </p>
     * 
     * @param flushStageAuthorizersCacheRequest
     *        Request to flush authorizer cache entries on a specified stage.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the FlushStageAuthorizersCache operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.FlushStageAuthorizersCache
     */
    java.util.concurrent.Future<FlushStageAuthorizersCacheResult> flushStageAuthorizersCacheAsync(
            FlushStageAuthorizersCacheRequest flushStageAuthorizersCacheRequest,
            com.amazonaws.handlers.AsyncHandler<FlushStageAuthorizersCacheRequest, FlushStageAuthorizersCacheResult> asyncHandler);

    /**
     * <p>
     * Flushes a stage's cache.
     * </p>
     * 
     * @param flushStageCacheRequest
     *        Requests API Gateway to flush a stage's cache.
     * @return A Java Future containing the result of the FlushStageCache operation returned by the service.
     * @sample AmazonApiGatewayAsync.FlushStageCache
     */
    java.util.concurrent.Future<FlushStageCacheResult> flushStageCacheAsync(FlushStageCacheRequest flushStageCacheRequest);

    /**
     * <p>
     * Flushes a stage's cache.
     * </p>
     * 
     * @param flushStageCacheRequest
     *        Requests API Gateway to flush a stage's cache.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the FlushStageCache operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.FlushStageCache
     */
    java.util.concurrent.Future<FlushStageCacheResult> flushStageCacheAsync(FlushStageCacheRequest flushStageCacheRequest,
            com.amazonaws.handlers.AsyncHandler<FlushStageCacheRequest, FlushStageCacheResult> asyncHandler);

    /**
     * <p>
     * Generates a <a>ClientCertificate</a> resource.
     * </p>
     * 
     * @param generateClientCertificateRequest
     *        A request to generate a <a>ClientCertificate</a> resource.
     * @return A Java Future containing the result of the GenerateClientCertificate operation returned by the service.
     * @sample AmazonApiGatewayAsync.GenerateClientCertificate
     */
    java.util.concurrent.Future<GenerateClientCertificateResult> generateClientCertificateAsync(
            GenerateClientCertificateRequest generateClientCertificateRequest);

    /**
     * <p>
     * Generates a <a>ClientCertificate</a> resource.
     * </p>
     * 
     * @param generateClientCertificateRequest
     *        A request to generate a <a>ClientCertificate</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GenerateClientCertificate operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GenerateClientCertificate
     */
    java.util.concurrent.Future<GenerateClientCertificateResult> generateClientCertificateAsync(
            GenerateClientCertificateRequest generateClientCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<GenerateClientCertificateRequest, GenerateClientCertificateResult> asyncHandler);

    /**
     * <p>
     * Gets information about the current <a>Account</a> resource.
     * </p>
     * 
     * @param getAccountRequest
     *        Requests API Gateway to get information about the current <a>Account</a> resource.
     * @return A Java Future containing the result of the GetAccount operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetAccount
     */
    java.util.concurrent.Future<GetAccountResult> getAccountAsync(GetAccountRequest getAccountRequest);

    /**
     * <p>
     * Gets information about the current <a>Account</a> resource.
     * </p>
     * 
     * @param getAccountRequest
     *        Requests API Gateway to get information about the current <a>Account</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccount operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetAccount
     */
    java.util.concurrent.Future<GetAccountResult> getAccountAsync(GetAccountRequest getAccountRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccountRequest, GetAccountResult> asyncHandler);

    /**
     * <p>
     * Gets information about the current <a>ApiKey</a> resource.
     * </p>
     * 
     * @param getApiKeyRequest
     *        A request to get information about the current <a>ApiKey</a> resource.
     * @return A Java Future containing the result of the GetApiKey operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetApiKey
     */
    java.util.concurrent.Future<GetApiKeyResult> getApiKeyAsync(GetApiKeyRequest getApiKeyRequest);

    /**
     * <p>
     * Gets information about the current <a>ApiKey</a> resource.
     * </p>
     * 
     * @param getApiKeyRequest
     *        A request to get information about the current <a>ApiKey</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApiKey operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetApiKey
     */
    java.util.concurrent.Future<GetApiKeyResult> getApiKeyAsync(GetApiKeyRequest getApiKeyRequest,
            com.amazonaws.handlers.AsyncHandler<GetApiKeyRequest, GetApiKeyResult> asyncHandler);

    /**
     * <p>
     * Gets information about the current <a>ApiKeys</a> resource.
     * </p>
     * 
     * @param getApiKeysRequest
     *        A request to get information about the current <a>ApiKeys</a> resource.
     * @return A Java Future containing the result of the GetApiKeys operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetApiKeys
     */
    java.util.concurrent.Future<GetApiKeysResult> getApiKeysAsync(GetApiKeysRequest getApiKeysRequest);

    /**
     * <p>
     * Gets information about the current <a>ApiKeys</a> resource.
     * </p>
     * 
     * @param getApiKeysRequest
     *        A request to get information about the current <a>ApiKeys</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApiKeys operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetApiKeys
     */
    java.util.concurrent.Future<GetApiKeysResult> getApiKeysAsync(GetApiKeysRequest getApiKeysRequest,
            com.amazonaws.handlers.AsyncHandler<GetApiKeysRequest, GetApiKeysResult> asyncHandler);

    /**
     * <p>
     * Describe an existing <a>Authorizer</a> resource.
     * </p>
     * <div class="seeAlso"><a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-authorizer.html">AWS CLI</a></div>
     * 
     * @param getAuthorizerRequest
     *        Request to describe an existing <a>Authorizer</a> resource.
     * @return A Java Future containing the result of the GetAuthorizer operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetAuthorizer
     */
    java.util.concurrent.Future<GetAuthorizerResult> getAuthorizerAsync(GetAuthorizerRequest getAuthorizerRequest);

    /**
     * <p>
     * Describe an existing <a>Authorizer</a> resource.
     * </p>
     * <div class="seeAlso"><a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-authorizer.html">AWS CLI</a></div>
     * 
     * @param getAuthorizerRequest
     *        Request to describe an existing <a>Authorizer</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAuthorizer operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetAuthorizer
     */
    java.util.concurrent.Future<GetAuthorizerResult> getAuthorizerAsync(GetAuthorizerRequest getAuthorizerRequest,
            com.amazonaws.handlers.AsyncHandler<GetAuthorizerRequest, GetAuthorizerResult> asyncHandler);

    /**
     * <p>
     * Describe an existing <a>Authorizers</a> resource.
     * </p>
     * <div class="seeAlso"><a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-authorizers.html">AWS CLI</a></div>
     * 
     * @param getAuthorizersRequest
     *        Request to describe an existing <a>Authorizers</a> resource.
     * @return A Java Future containing the result of the GetAuthorizers operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetAuthorizers
     */
    java.util.concurrent.Future<GetAuthorizersResult> getAuthorizersAsync(GetAuthorizersRequest getAuthorizersRequest);

    /**
     * <p>
     * Describe an existing <a>Authorizers</a> resource.
     * </p>
     * <div class="seeAlso"><a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-authorizers.html">AWS CLI</a></div>
     * 
     * @param getAuthorizersRequest
     *        Request to describe an existing <a>Authorizers</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAuthorizers operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetAuthorizers
     */
    java.util.concurrent.Future<GetAuthorizersResult> getAuthorizersAsync(GetAuthorizersRequest getAuthorizersRequest,
            com.amazonaws.handlers.AsyncHandler<GetAuthorizersRequest, GetAuthorizersResult> asyncHandler);

    /**
     * <p>
     * Describe a <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param getBasePathMappingRequest
     *        Request to describe a <a>BasePathMapping</a> resource.
     * @return A Java Future containing the result of the GetBasePathMapping operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetBasePathMapping
     */
    java.util.concurrent.Future<GetBasePathMappingResult> getBasePathMappingAsync(GetBasePathMappingRequest getBasePathMappingRequest);

    /**
     * <p>
     * Describe a <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param getBasePathMappingRequest
     *        Request to describe a <a>BasePathMapping</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBasePathMapping operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetBasePathMapping
     */
    java.util.concurrent.Future<GetBasePathMappingResult> getBasePathMappingAsync(GetBasePathMappingRequest getBasePathMappingRequest,
            com.amazonaws.handlers.AsyncHandler<GetBasePathMappingRequest, GetBasePathMappingResult> asyncHandler);

    /**
     * <p>
     * Represents a collection of <a>BasePathMapping</a> resources.
     * </p>
     * 
     * @param getBasePathMappingsRequest
     *        A request to get information about a collection of <a>BasePathMapping</a> resources.
     * @return A Java Future containing the result of the GetBasePathMappings operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetBasePathMappings
     */
    java.util.concurrent.Future<GetBasePathMappingsResult> getBasePathMappingsAsync(GetBasePathMappingsRequest getBasePathMappingsRequest);

    /**
     * <p>
     * Represents a collection of <a>BasePathMapping</a> resources.
     * </p>
     * 
     * @param getBasePathMappingsRequest
     *        A request to get information about a collection of <a>BasePathMapping</a> resources.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBasePathMappings operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetBasePathMappings
     */
    java.util.concurrent.Future<GetBasePathMappingsResult> getBasePathMappingsAsync(GetBasePathMappingsRequest getBasePathMappingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetBasePathMappingsRequest, GetBasePathMappingsResult> asyncHandler);

    /**
     * <p>
     * Gets information about the current <a>ClientCertificate</a> resource.
     * </p>
     * 
     * @param getClientCertificateRequest
     *        A request to get information about the current <a>ClientCertificate</a> resource.
     * @return A Java Future containing the result of the GetClientCertificate operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetClientCertificate
     */
    java.util.concurrent.Future<GetClientCertificateResult> getClientCertificateAsync(GetClientCertificateRequest getClientCertificateRequest);

    /**
     * <p>
     * Gets information about the current <a>ClientCertificate</a> resource.
     * </p>
     * 
     * @param getClientCertificateRequest
     *        A request to get information about the current <a>ClientCertificate</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetClientCertificate operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetClientCertificate
     */
    java.util.concurrent.Future<GetClientCertificateResult> getClientCertificateAsync(GetClientCertificateRequest getClientCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<GetClientCertificateRequest, GetClientCertificateResult> asyncHandler);

    /**
     * <p>
     * Gets a collection of <a>ClientCertificate</a> resources.
     * </p>
     * 
     * @param getClientCertificatesRequest
     *        A request to get information about a collection of <a>ClientCertificate</a> resources.
     * @return A Java Future containing the result of the GetClientCertificates operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetClientCertificates
     */
    java.util.concurrent.Future<GetClientCertificatesResult> getClientCertificatesAsync(GetClientCertificatesRequest getClientCertificatesRequest);

    /**
     * <p>
     * Gets a collection of <a>ClientCertificate</a> resources.
     * </p>
     * 
     * @param getClientCertificatesRequest
     *        A request to get information about a collection of <a>ClientCertificate</a> resources.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetClientCertificates operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetClientCertificates
     */
    java.util.concurrent.Future<GetClientCertificatesResult> getClientCertificatesAsync(GetClientCertificatesRequest getClientCertificatesRequest,
            com.amazonaws.handlers.AsyncHandler<GetClientCertificatesRequest, GetClientCertificatesResult> asyncHandler);

    /**
     * <p>
     * Gets information about a <a>Deployment</a> resource.
     * </p>
     * 
     * @param getDeploymentRequest
     *        Requests API Gateway to get information about a <a>Deployment</a> resource.
     * @return A Java Future containing the result of the GetDeployment operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetDeployment
     */
    java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(GetDeploymentRequest getDeploymentRequest);

    /**
     * <p>
     * Gets information about a <a>Deployment</a> resource.
     * </p>
     * 
     * @param getDeploymentRequest
     *        Requests API Gateway to get information about a <a>Deployment</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDeployment operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetDeployment
     */
    java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(GetDeploymentRequest getDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeploymentRequest, GetDeploymentResult> asyncHandler);

    /**
     * <p>
     * Gets information about a <a>Deployments</a> collection.
     * </p>
     * 
     * @param getDeploymentsRequest
     *        Requests API Gateway to get information about a <a>Deployments</a> collection.
     * @return A Java Future containing the result of the GetDeployments operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetDeployments
     */
    java.util.concurrent.Future<GetDeploymentsResult> getDeploymentsAsync(GetDeploymentsRequest getDeploymentsRequest);

    /**
     * <p>
     * Gets information about a <a>Deployments</a> collection.
     * </p>
     * 
     * @param getDeploymentsRequest
     *        Requests API Gateway to get information about a <a>Deployments</a> collection.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDeployments operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetDeployments
     */
    java.util.concurrent.Future<GetDeploymentsResult> getDeploymentsAsync(GetDeploymentsRequest getDeploymentsRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeploymentsRequest, GetDeploymentsResult> asyncHandler);

    /**
     * @param getDocumentationPartRequest
     *        Gets a specified documentation part of a given API.
     * @return A Java Future containing the result of the GetDocumentationPart operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetDocumentationPart
     */
    java.util.concurrent.Future<GetDocumentationPartResult> getDocumentationPartAsync(GetDocumentationPartRequest getDocumentationPartRequest);

    /**
     * @param getDocumentationPartRequest
     *        Gets a specified documentation part of a given API.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDocumentationPart operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetDocumentationPart
     */
    java.util.concurrent.Future<GetDocumentationPartResult> getDocumentationPartAsync(GetDocumentationPartRequest getDocumentationPartRequest,
            com.amazonaws.handlers.AsyncHandler<GetDocumentationPartRequest, GetDocumentationPartResult> asyncHandler);

    /**
     * @param getDocumentationPartsRequest
     *        Gets the documentation parts of an API. The result may be filtered by the type, name, or path of API
     *        entities (targets).
     * @return A Java Future containing the result of the GetDocumentationParts operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetDocumentationParts
     */
    java.util.concurrent.Future<GetDocumentationPartsResult> getDocumentationPartsAsync(GetDocumentationPartsRequest getDocumentationPartsRequest);

    /**
     * @param getDocumentationPartsRequest
     *        Gets the documentation parts of an API. The result may be filtered by the type, name, or path of API
     *        entities (targets).
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDocumentationParts operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetDocumentationParts
     */
    java.util.concurrent.Future<GetDocumentationPartsResult> getDocumentationPartsAsync(GetDocumentationPartsRequest getDocumentationPartsRequest,
            com.amazonaws.handlers.AsyncHandler<GetDocumentationPartsRequest, GetDocumentationPartsResult> asyncHandler);

    /**
     * @param getDocumentationVersionRequest
     *        Gets a documentation snapshot of an API.
     * @return A Java Future containing the result of the GetDocumentationVersion operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetDocumentationVersion
     */
    java.util.concurrent.Future<GetDocumentationVersionResult> getDocumentationVersionAsync(GetDocumentationVersionRequest getDocumentationVersionRequest);

    /**
     * @param getDocumentationVersionRequest
     *        Gets a documentation snapshot of an API.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDocumentationVersion operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetDocumentationVersion
     */
    java.util.concurrent.Future<GetDocumentationVersionResult> getDocumentationVersionAsync(GetDocumentationVersionRequest getDocumentationVersionRequest,
            com.amazonaws.handlers.AsyncHandler<GetDocumentationVersionRequest, GetDocumentationVersionResult> asyncHandler);

    /**
     * @param getDocumentationVersionsRequest
     *        Gets the documentation versions of an API.
     * @return A Java Future containing the result of the GetDocumentationVersions operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetDocumentationVersions
     */
    java.util.concurrent.Future<GetDocumentationVersionsResult> getDocumentationVersionsAsync(GetDocumentationVersionsRequest getDocumentationVersionsRequest);

    /**
     * @param getDocumentationVersionsRequest
     *        Gets the documentation versions of an API.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDocumentationVersions operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetDocumentationVersions
     */
    java.util.concurrent.Future<GetDocumentationVersionsResult> getDocumentationVersionsAsync(GetDocumentationVersionsRequest getDocumentationVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<GetDocumentationVersionsRequest, GetDocumentationVersionsResult> asyncHandler);

    /**
     * <p>
     * Represents a domain name that is contained in a simpler, more intuitive URL that can be called.
     * </p>
     * 
     * @param getDomainNameRequest
     *        Request to get the name of a <a>DomainName</a> resource.
     * @return A Java Future containing the result of the GetDomainName operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetDomainName
     */
    java.util.concurrent.Future<GetDomainNameResult> getDomainNameAsync(GetDomainNameRequest getDomainNameRequest);

    /**
     * <p>
     * Represents a domain name that is contained in a simpler, more intuitive URL that can be called.
     * </p>
     * 
     * @param getDomainNameRequest
     *        Request to get the name of a <a>DomainName</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDomainName operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetDomainName
     */
    java.util.concurrent.Future<GetDomainNameResult> getDomainNameAsync(GetDomainNameRequest getDomainNameRequest,
            com.amazonaws.handlers.AsyncHandler<GetDomainNameRequest, GetDomainNameResult> asyncHandler);

    /**
     * <p>
     * Represents a collection of <a>DomainName</a> resources.
     * </p>
     * 
     * @param getDomainNamesRequest
     *        Request to describe a collection of <a>DomainName</a> resources.
     * @return A Java Future containing the result of the GetDomainNames operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetDomainNames
     */
    java.util.concurrent.Future<GetDomainNamesResult> getDomainNamesAsync(GetDomainNamesRequest getDomainNamesRequest);

    /**
     * <p>
     * Represents a collection of <a>DomainName</a> resources.
     * </p>
     * 
     * @param getDomainNamesRequest
     *        Request to describe a collection of <a>DomainName</a> resources.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDomainNames operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetDomainNames
     */
    java.util.concurrent.Future<GetDomainNamesResult> getDomainNamesAsync(GetDomainNamesRequest getDomainNamesRequest,
            com.amazonaws.handlers.AsyncHandler<GetDomainNamesRequest, GetDomainNamesResult> asyncHandler);

    /**
     * <p>
     * Exports a deployed version of a <a>RestApi</a> in a specified format.
     * </p>
     * 
     * @param getExportRequest
     *        Request a new export of a <a>RestApi</a> for a particular <a>Stage</a>.
     * @return A Java Future containing the result of the GetExport operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetExport
     */
    java.util.concurrent.Future<GetExportResult> getExportAsync(GetExportRequest getExportRequest);

    /**
     * <p>
     * Exports a deployed version of a <a>RestApi</a> in a specified format.
     * </p>
     * 
     * @param getExportRequest
     *        Request a new export of a <a>RestApi</a> for a particular <a>Stage</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetExport operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetExport
     */
    java.util.concurrent.Future<GetExportResult> getExportAsync(GetExportRequest getExportRequest,
            com.amazonaws.handlers.AsyncHandler<GetExportRequest, GetExportResult> asyncHandler);

    /**
     * <p>
     * Gets a <a>GatewayResponse</a> of a specified response type on the given <a>RestApi</a>.
     * </p>
     * 
     * @param getGatewayResponseRequest
     *        Gets a <a>GatewayResponse</a> of a specified response type on the given <a>RestApi</a>.
     * @return A Java Future containing the result of the GetGatewayResponse operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetGatewayResponse
     */
    java.util.concurrent.Future<GetGatewayResponseResult> getGatewayResponseAsync(GetGatewayResponseRequest getGatewayResponseRequest);

    /**
     * <p>
     * Gets a <a>GatewayResponse</a> of a specified response type on the given <a>RestApi</a>.
     * </p>
     * 
     * @param getGatewayResponseRequest
     *        Gets a <a>GatewayResponse</a> of a specified response type on the given <a>RestApi</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGatewayResponse operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetGatewayResponse
     */
    java.util.concurrent.Future<GetGatewayResponseResult> getGatewayResponseAsync(GetGatewayResponseRequest getGatewayResponseRequest,
            com.amazonaws.handlers.AsyncHandler<GetGatewayResponseRequest, GetGatewayResponseResult> asyncHandler);

    /**
     * <p>
     * Gets the <a>GatewayResponses</a> collection on the given <a>RestApi</a>. If an API developer has not added any
     * definitions for gateway responses, the result will be the API Gateway-generated default <a>GatewayResponses</a>
     * collection for the supported response types.
     * </p>
     * 
     * @param getGatewayResponsesRequest
     *        Gets the <a>GatewayResponses</a> collection on the given <a>RestApi</a>. If an API developer has not added
     *        any definitions for gateway responses, the result will be the API Gateway-generated default
     *        <a>GatewayResponses</a> collection for the supported response types.
     * @return A Java Future containing the result of the GetGatewayResponses operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetGatewayResponses
     */
    java.util.concurrent.Future<GetGatewayResponsesResult> getGatewayResponsesAsync(GetGatewayResponsesRequest getGatewayResponsesRequest);

    /**
     * <p>
     * Gets the <a>GatewayResponses</a> collection on the given <a>RestApi</a>. If an API developer has not added any
     * definitions for gateway responses, the result will be the API Gateway-generated default <a>GatewayResponses</a>
     * collection for the supported response types.
     * </p>
     * 
     * @param getGatewayResponsesRequest
     *        Gets the <a>GatewayResponses</a> collection on the given <a>RestApi</a>. If an API developer has not added
     *        any definitions for gateway responses, the result will be the API Gateway-generated default
     *        <a>GatewayResponses</a> collection for the supported response types.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGatewayResponses operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetGatewayResponses
     */
    java.util.concurrent.Future<GetGatewayResponsesResult> getGatewayResponsesAsync(GetGatewayResponsesRequest getGatewayResponsesRequest,
            com.amazonaws.handlers.AsyncHandler<GetGatewayResponsesRequest, GetGatewayResponsesResult> asyncHandler);

    /**
     * <p>
     * Get the integration settings.
     * </p>
     * 
     * @param getIntegrationRequest
     *        Represents a request to get the integration configuration.
     * @return A Java Future containing the result of the GetIntegration operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetIntegration
     */
    java.util.concurrent.Future<GetIntegrationResult> getIntegrationAsync(GetIntegrationRequest getIntegrationRequest);

    /**
     * <p>
     * Get the integration settings.
     * </p>
     * 
     * @param getIntegrationRequest
     *        Represents a request to get the integration configuration.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIntegration operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetIntegration
     */
    java.util.concurrent.Future<GetIntegrationResult> getIntegrationAsync(GetIntegrationRequest getIntegrationRequest,
            com.amazonaws.handlers.AsyncHandler<GetIntegrationRequest, GetIntegrationResult> asyncHandler);

    /**
     * <p>
     * Represents a get integration response.
     * </p>
     * 
     * @param getIntegrationResponseRequest
     *        Represents a get integration response request.
     * @return A Java Future containing the result of the GetIntegrationResponse operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetIntegrationResponse
     */
    java.util.concurrent.Future<GetIntegrationResponseResult> getIntegrationResponseAsync(GetIntegrationResponseRequest getIntegrationResponseRequest);

    /**
     * <p>
     * Represents a get integration response.
     * </p>
     * 
     * @param getIntegrationResponseRequest
     *        Represents a get integration response request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIntegrationResponse operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetIntegrationResponse
     */
    java.util.concurrent.Future<GetIntegrationResponseResult> getIntegrationResponseAsync(GetIntegrationResponseRequest getIntegrationResponseRequest,
            com.amazonaws.handlers.AsyncHandler<GetIntegrationResponseRequest, GetIntegrationResponseResult> asyncHandler);

    /**
     * <p>
     * Describe an existing <a>Method</a> resource.
     * </p>
     * 
     * @param getMethodRequest
     *        Request to describe an existing <a>Method</a> resource.
     * @return A Java Future containing the result of the GetMethod operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetMethod
     */
    java.util.concurrent.Future<GetMethodResult> getMethodAsync(GetMethodRequest getMethodRequest);

    /**
     * <p>
     * Describe an existing <a>Method</a> resource.
     * </p>
     * 
     * @param getMethodRequest
     *        Request to describe an existing <a>Method</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMethod operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetMethod
     */
    java.util.concurrent.Future<GetMethodResult> getMethodAsync(GetMethodRequest getMethodRequest,
            com.amazonaws.handlers.AsyncHandler<GetMethodRequest, GetMethodResult> asyncHandler);

    /**
     * <p>
     * Describes a <a>MethodResponse</a> resource.
     * </p>
     * 
     * @param getMethodResponseRequest
     *        Request to describe a <a>MethodResponse</a> resource.
     * @return A Java Future containing the result of the GetMethodResponse operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetMethodResponse
     */
    java.util.concurrent.Future<GetMethodResponseResult> getMethodResponseAsync(GetMethodResponseRequest getMethodResponseRequest);

    /**
     * <p>
     * Describes a <a>MethodResponse</a> resource.
     * </p>
     * 
     * @param getMethodResponseRequest
     *        Request to describe a <a>MethodResponse</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMethodResponse operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetMethodResponse
     */
    java.util.concurrent.Future<GetMethodResponseResult> getMethodResponseAsync(GetMethodResponseRequest getMethodResponseRequest,
            com.amazonaws.handlers.AsyncHandler<GetMethodResponseRequest, GetMethodResponseResult> asyncHandler);

    /**
     * <p>
     * Describes an existing model defined for a <a>RestApi</a> resource.
     * </p>
     * 
     * @param getModelRequest
     *        Request to list information about a model in an existing <a>RestApi</a> resource.
     * @return A Java Future containing the result of the GetModel operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetModel
     */
    java.util.concurrent.Future<GetModelResult> getModelAsync(GetModelRequest getModelRequest);

    /**
     * <p>
     * Describes an existing model defined for a <a>RestApi</a> resource.
     * </p>
     * 
     * @param getModelRequest
     *        Request to list information about a model in an existing <a>RestApi</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetModel operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetModel
     */
    java.util.concurrent.Future<GetModelResult> getModelAsync(GetModelRequest getModelRequest,
            com.amazonaws.handlers.AsyncHandler<GetModelRequest, GetModelResult> asyncHandler);

    /**
     * <p>
     * Generates a sample mapping template that can be used to transform a payload into the structure of a model.
     * </p>
     * 
     * @param getModelTemplateRequest
     *        Request to generate a sample mapping template used to transform the payload.
     * @return A Java Future containing the result of the GetModelTemplate operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetModelTemplate
     */
    java.util.concurrent.Future<GetModelTemplateResult> getModelTemplateAsync(GetModelTemplateRequest getModelTemplateRequest);

    /**
     * <p>
     * Generates a sample mapping template that can be used to transform a payload into the structure of a model.
     * </p>
     * 
     * @param getModelTemplateRequest
     *        Request to generate a sample mapping template used to transform the payload.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetModelTemplate operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetModelTemplate
     */
    java.util.concurrent.Future<GetModelTemplateResult> getModelTemplateAsync(GetModelTemplateRequest getModelTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<GetModelTemplateRequest, GetModelTemplateResult> asyncHandler);

    /**
     * <p>
     * Describes existing <a>Models</a> defined for a <a>RestApi</a> resource.
     * </p>
     * 
     * @param getModelsRequest
     *        Request to list existing <a>Models</a> defined for a <a>RestApi</a> resource.
     * @return A Java Future containing the result of the GetModels operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetModels
     */
    java.util.concurrent.Future<GetModelsResult> getModelsAsync(GetModelsRequest getModelsRequest);

    /**
     * <p>
     * Describes existing <a>Models</a> defined for a <a>RestApi</a> resource.
     * </p>
     * 
     * @param getModelsRequest
     *        Request to list existing <a>Models</a> defined for a <a>RestApi</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetModels operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetModels
     */
    java.util.concurrent.Future<GetModelsResult> getModelsAsync(GetModelsRequest getModelsRequest,
            com.amazonaws.handlers.AsyncHandler<GetModelsRequest, GetModelsResult> asyncHandler);

    /**
     * <p>
     * Gets a <a>RequestValidator</a> of a given <a>RestApi</a>.
     * </p>
     * 
     * @param getRequestValidatorRequest
     *        Gets a <a>RequestValidator</a> of a given <a>RestApi</a>.
     * @return A Java Future containing the result of the GetRequestValidator operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetRequestValidator
     */
    java.util.concurrent.Future<GetRequestValidatorResult> getRequestValidatorAsync(GetRequestValidatorRequest getRequestValidatorRequest);

    /**
     * <p>
     * Gets a <a>RequestValidator</a> of a given <a>RestApi</a>.
     * </p>
     * 
     * @param getRequestValidatorRequest
     *        Gets a <a>RequestValidator</a> of a given <a>RestApi</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRequestValidator operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetRequestValidator
     */
    java.util.concurrent.Future<GetRequestValidatorResult> getRequestValidatorAsync(GetRequestValidatorRequest getRequestValidatorRequest,
            com.amazonaws.handlers.AsyncHandler<GetRequestValidatorRequest, GetRequestValidatorResult> asyncHandler);

    /**
     * <p>
     * Gets the <a>RequestValidators</a> collection of a given <a>RestApi</a>.
     * </p>
     * 
     * @param getRequestValidatorsRequest
     *        Gets the <a>RequestValidators</a> collection of a given <a>RestApi</a>.
     * @return A Java Future containing the result of the GetRequestValidators operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetRequestValidators
     */
    java.util.concurrent.Future<GetRequestValidatorsResult> getRequestValidatorsAsync(GetRequestValidatorsRequest getRequestValidatorsRequest);

    /**
     * <p>
     * Gets the <a>RequestValidators</a> collection of a given <a>RestApi</a>.
     * </p>
     * 
     * @param getRequestValidatorsRequest
     *        Gets the <a>RequestValidators</a> collection of a given <a>RestApi</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRequestValidators operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetRequestValidators
     */
    java.util.concurrent.Future<GetRequestValidatorsResult> getRequestValidatorsAsync(GetRequestValidatorsRequest getRequestValidatorsRequest,
            com.amazonaws.handlers.AsyncHandler<GetRequestValidatorsRequest, GetRequestValidatorsResult> asyncHandler);

    /**
     * <p>
     * Lists information about a resource.
     * </p>
     * 
     * @param getResourceRequest
     *        Request to list information about a resource.
     * @return A Java Future containing the result of the GetResource operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetResource
     */
    java.util.concurrent.Future<GetResourceResult> getResourceAsync(GetResourceRequest getResourceRequest);

    /**
     * <p>
     * Lists information about a resource.
     * </p>
     * 
     * @param getResourceRequest
     *        Request to list information about a resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResource operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetResource
     */
    java.util.concurrent.Future<GetResourceResult> getResourceAsync(GetResourceRequest getResourceRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourceRequest, GetResourceResult> asyncHandler);

    /**
     * <p>
     * Lists information about a collection of <a>Resource</a> resources.
     * </p>
     * 
     * @param getResourcesRequest
     *        Request to list information about a collection of resources.
     * @return A Java Future containing the result of the GetResources operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetResources
     */
    java.util.concurrent.Future<GetResourcesResult> getResourcesAsync(GetResourcesRequest getResourcesRequest);

    /**
     * <p>
     * Lists information about a collection of <a>Resource</a> resources.
     * </p>
     * 
     * @param getResourcesRequest
     *        Request to list information about a collection of resources.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResources operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetResources
     */
    java.util.concurrent.Future<GetResourcesResult> getResourcesAsync(GetResourcesRequest getResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourcesRequest, GetResourcesResult> asyncHandler);

    /**
     * <p>
     * Lists the <a>RestApi</a> resource in the collection.
     * </p>
     * 
     * @param getRestApiRequest
     *        The GET request to list an existing <a>RestApi</a> defined for your collection.
     * @return A Java Future containing the result of the GetRestApi operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetRestApi
     */
    java.util.concurrent.Future<GetRestApiResult> getRestApiAsync(GetRestApiRequest getRestApiRequest);

    /**
     * <p>
     * Lists the <a>RestApi</a> resource in the collection.
     * </p>
     * 
     * @param getRestApiRequest
     *        The GET request to list an existing <a>RestApi</a> defined for your collection.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRestApi operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetRestApi
     */
    java.util.concurrent.Future<GetRestApiResult> getRestApiAsync(GetRestApiRequest getRestApiRequest,
            com.amazonaws.handlers.AsyncHandler<GetRestApiRequest, GetRestApiResult> asyncHandler);

    /**
     * <p>
     * Lists the <a>RestApis</a> resources for your collection.
     * </p>
     * 
     * @param getRestApisRequest
     *        The GET request to list existing <a>RestApis</a> defined for your collection.
     * @return A Java Future containing the result of the GetRestApis operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetRestApis
     */
    java.util.concurrent.Future<GetRestApisResult> getRestApisAsync(GetRestApisRequest getRestApisRequest);

    /**
     * <p>
     * Lists the <a>RestApis</a> resources for your collection.
     * </p>
     * 
     * @param getRestApisRequest
     *        The GET request to list existing <a>RestApis</a> defined for your collection.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRestApis operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetRestApis
     */
    java.util.concurrent.Future<GetRestApisResult> getRestApisAsync(GetRestApisRequest getRestApisRequest,
            com.amazonaws.handlers.AsyncHandler<GetRestApisRequest, GetRestApisResult> asyncHandler);

    /**
     * <p>
     * Generates a client SDK for a <a>RestApi</a> and <a>Stage</a>.
     * </p>
     * 
     * @param getSdkRequest
     *        Request a new generated client SDK for a <a>RestApi</a> and <a>Stage</a>.
     * @return A Java Future containing the result of the GetSdk operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetSdk
     */
    java.util.concurrent.Future<GetSdkResult> getSdkAsync(GetSdkRequest getSdkRequest);

    /**
     * <p>
     * Generates a client SDK for a <a>RestApi</a> and <a>Stage</a>.
     * </p>
     * 
     * @param getSdkRequest
     *        Request a new generated client SDK for a <a>RestApi</a> and <a>Stage</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSdk operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetSdk
     */
    java.util.concurrent.Future<GetSdkResult> getSdkAsync(GetSdkRequest getSdkRequest,
            com.amazonaws.handlers.AsyncHandler<GetSdkRequest, GetSdkResult> asyncHandler);

    /**
     * @param getSdkTypeRequest
     *        Get an <a>SdkType</a> instance.
     * @return A Java Future containing the result of the GetSdkType operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetSdkType
     */
    java.util.concurrent.Future<GetSdkTypeResult> getSdkTypeAsync(GetSdkTypeRequest getSdkTypeRequest);

    /**
     * @param getSdkTypeRequest
     *        Get an <a>SdkType</a> instance.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSdkType operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetSdkType
     */
    java.util.concurrent.Future<GetSdkTypeResult> getSdkTypeAsync(GetSdkTypeRequest getSdkTypeRequest,
            com.amazonaws.handlers.AsyncHandler<GetSdkTypeRequest, GetSdkTypeResult> asyncHandler);

    /**
     * @param getSdkTypesRequest
     *        Get the <a>SdkTypes</a> collection.
     * @return A Java Future containing the result of the GetSdkTypes operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetSdkTypes
     */
    java.util.concurrent.Future<GetSdkTypesResult> getSdkTypesAsync(GetSdkTypesRequest getSdkTypesRequest);

    /**
     * @param getSdkTypesRequest
     *        Get the <a>SdkTypes</a> collection.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSdkTypes operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetSdkTypes
     */
    java.util.concurrent.Future<GetSdkTypesResult> getSdkTypesAsync(GetSdkTypesRequest getSdkTypesRequest,
            com.amazonaws.handlers.AsyncHandler<GetSdkTypesRequest, GetSdkTypesResult> asyncHandler);

    /**
     * <p>
     * Gets information about a <a>Stage</a> resource.
     * </p>
     * 
     * @param getStageRequest
     *        Requests API Gateway to get information about a <a>Stage</a> resource.
     * @return A Java Future containing the result of the GetStage operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetStage
     */
    java.util.concurrent.Future<GetStageResult> getStageAsync(GetStageRequest getStageRequest);

    /**
     * <p>
     * Gets information about a <a>Stage</a> resource.
     * </p>
     * 
     * @param getStageRequest
     *        Requests API Gateway to get information about a <a>Stage</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStage operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetStage
     */
    java.util.concurrent.Future<GetStageResult> getStageAsync(GetStageRequest getStageRequest,
            com.amazonaws.handlers.AsyncHandler<GetStageRequest, GetStageResult> asyncHandler);

    /**
     * <p>
     * Gets information about one or more <a>Stage</a> resources.
     * </p>
     * 
     * @param getStagesRequest
     *        Requests API Gateway to get information about one or more <a>Stage</a> resources.
     * @return A Java Future containing the result of the GetStages operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetStages
     */
    java.util.concurrent.Future<GetStagesResult> getStagesAsync(GetStagesRequest getStagesRequest);

    /**
     * <p>
     * Gets information about one or more <a>Stage</a> resources.
     * </p>
     * 
     * @param getStagesRequest
     *        Requests API Gateway to get information about one or more <a>Stage</a> resources.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStages operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetStages
     */
    java.util.concurrent.Future<GetStagesResult> getStagesAsync(GetStagesRequest getStagesRequest,
            com.amazonaws.handlers.AsyncHandler<GetStagesRequest, GetStagesResult> asyncHandler);

    /**
     * <p>
     * Gets the <a>Tags</a> collection for a given resource.
     * </p>
     * 
     * @param getTagsRequest
     *        Gets the <a>Tags</a> collection for a given resource.
     * @return A Java Future containing the result of the GetTags operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetTags
     */
    java.util.concurrent.Future<GetTagsResult> getTagsAsync(GetTagsRequest getTagsRequest);

    /**
     * <p>
     * Gets the <a>Tags</a> collection for a given resource.
     * </p>
     * 
     * @param getTagsRequest
     *        Gets the <a>Tags</a> collection for a given resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTags operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetTags
     */
    java.util.concurrent.Future<GetTagsResult> getTagsAsync(GetTagsRequest getTagsRequest,
            com.amazonaws.handlers.AsyncHandler<GetTagsRequest, GetTagsResult> asyncHandler);

    /**
     * <p>
     * Gets the usage data of a usage plan in a specified time interval.
     * </p>
     * 
     * @param getUsageRequest
     *        The GET request to get the usage data of a usage plan in a specified time interval.
     * @return A Java Future containing the result of the GetUsage operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetUsage
     */
    java.util.concurrent.Future<GetUsageResult> getUsageAsync(GetUsageRequest getUsageRequest);

    /**
     * <p>
     * Gets the usage data of a usage plan in a specified time interval.
     * </p>
     * 
     * @param getUsageRequest
     *        The GET request to get the usage data of a usage plan in a specified time interval.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetUsage operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetUsage
     */
    java.util.concurrent.Future<GetUsageResult> getUsageAsync(GetUsageRequest getUsageRequest,
            com.amazonaws.handlers.AsyncHandler<GetUsageRequest, GetUsageResult> asyncHandler);

    /**
     * <p>
     * Gets a usage plan of a given plan identifier.
     * </p>
     * 
     * @param getUsagePlanRequest
     *        The GET request to get a usage plan of a given plan identifier.
     * @return A Java Future containing the result of the GetUsagePlan operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetUsagePlan
     */
    java.util.concurrent.Future<GetUsagePlanResult> getUsagePlanAsync(GetUsagePlanRequest getUsagePlanRequest);

    /**
     * <p>
     * Gets a usage plan of a given plan identifier.
     * </p>
     * 
     * @param getUsagePlanRequest
     *        The GET request to get a usage plan of a given plan identifier.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetUsagePlan operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetUsagePlan
     */
    java.util.concurrent.Future<GetUsagePlanResult> getUsagePlanAsync(GetUsagePlanRequest getUsagePlanRequest,
            com.amazonaws.handlers.AsyncHandler<GetUsagePlanRequest, GetUsagePlanResult> asyncHandler);

    /**
     * <p>
     * Gets a usage plan key of a given key identifier.
     * </p>
     * 
     * @param getUsagePlanKeyRequest
     *        The GET request to get a usage plan key of a given key identifier.
     * @return A Java Future containing the result of the GetUsagePlanKey operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetUsagePlanKey
     */
    java.util.concurrent.Future<GetUsagePlanKeyResult> getUsagePlanKeyAsync(GetUsagePlanKeyRequest getUsagePlanKeyRequest);

    /**
     * <p>
     * Gets a usage plan key of a given key identifier.
     * </p>
     * 
     * @param getUsagePlanKeyRequest
     *        The GET request to get a usage plan key of a given key identifier.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetUsagePlanKey operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetUsagePlanKey
     */
    java.util.concurrent.Future<GetUsagePlanKeyResult> getUsagePlanKeyAsync(GetUsagePlanKeyRequest getUsagePlanKeyRequest,
            com.amazonaws.handlers.AsyncHandler<GetUsagePlanKeyRequest, GetUsagePlanKeyResult> asyncHandler);

    /**
     * <p>
     * Gets all the usage plan keys representing the API keys added to a specified usage plan.
     * </p>
     * 
     * @param getUsagePlanKeysRequest
     *        The GET request to get all the usage plan keys representing the API keys added to a specified usage plan.
     * @return A Java Future containing the result of the GetUsagePlanKeys operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetUsagePlanKeys
     */
    java.util.concurrent.Future<GetUsagePlanKeysResult> getUsagePlanKeysAsync(GetUsagePlanKeysRequest getUsagePlanKeysRequest);

    /**
     * <p>
     * Gets all the usage plan keys representing the API keys added to a specified usage plan.
     * </p>
     * 
     * @param getUsagePlanKeysRequest
     *        The GET request to get all the usage plan keys representing the API keys added to a specified usage plan.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetUsagePlanKeys operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetUsagePlanKeys
     */
    java.util.concurrent.Future<GetUsagePlanKeysResult> getUsagePlanKeysAsync(GetUsagePlanKeysRequest getUsagePlanKeysRequest,
            com.amazonaws.handlers.AsyncHandler<GetUsagePlanKeysRequest, GetUsagePlanKeysResult> asyncHandler);

    /**
     * <p>
     * Gets all the usage plans of the caller's account.
     * </p>
     * 
     * @param getUsagePlansRequest
     *        The GET request to get all the usage plans of the caller's account.
     * @return A Java Future containing the result of the GetUsagePlans operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetUsagePlans
     */
    java.util.concurrent.Future<GetUsagePlansResult> getUsagePlansAsync(GetUsagePlansRequest getUsagePlansRequest);

    /**
     * <p>
     * Gets all the usage plans of the caller's account.
     * </p>
     * 
     * @param getUsagePlansRequest
     *        The GET request to get all the usage plans of the caller's account.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetUsagePlans operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetUsagePlans
     */
    java.util.concurrent.Future<GetUsagePlansResult> getUsagePlansAsync(GetUsagePlansRequest getUsagePlansRequest,
            com.amazonaws.handlers.AsyncHandler<GetUsagePlansRequest, GetUsagePlansResult> asyncHandler);

    /**
     * <p>
     * Gets a specified VPC link under the caller's account in a region.
     * </p>
     * 
     * @param getVpcLinkRequest
     *        Gets a specified VPC link under the caller's account in a region.
     * @return A Java Future containing the result of the GetVpcLink operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetVpcLink
     */
    java.util.concurrent.Future<GetVpcLinkResult> getVpcLinkAsync(GetVpcLinkRequest getVpcLinkRequest);

    /**
     * <p>
     * Gets a specified VPC link under the caller's account in a region.
     * </p>
     * 
     * @param getVpcLinkRequest
     *        Gets a specified VPC link under the caller's account in a region.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVpcLink operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetVpcLink
     */
    java.util.concurrent.Future<GetVpcLinkResult> getVpcLinkAsync(GetVpcLinkRequest getVpcLinkRequest,
            com.amazonaws.handlers.AsyncHandler<GetVpcLinkRequest, GetVpcLinkResult> asyncHandler);

    /**
     * <p>
     * Gets the <a>VpcLinks</a> collection under the caller's account in a selected region.
     * </p>
     * 
     * @param getVpcLinksRequest
     *        Gets the <a>VpcLinks</a> collection under the caller's account in a selected region.
     * @return A Java Future containing the result of the GetVpcLinks operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetVpcLinks
     */
    java.util.concurrent.Future<GetVpcLinksResult> getVpcLinksAsync(GetVpcLinksRequest getVpcLinksRequest);

    /**
     * <p>
     * Gets the <a>VpcLinks</a> collection under the caller's account in a selected region.
     * </p>
     * 
     * @param getVpcLinksRequest
     *        Gets the <a>VpcLinks</a> collection under the caller's account in a selected region.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVpcLinks operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetVpcLinks
     */
    java.util.concurrent.Future<GetVpcLinksResult> getVpcLinksAsync(GetVpcLinksRequest getVpcLinksRequest,
            com.amazonaws.handlers.AsyncHandler<GetVpcLinksRequest, GetVpcLinksResult> asyncHandler);

    /**
     * <p>
     * Import API keys from an external source, such as a CSV-formatted file.
     * </p>
     * 
     * @param importApiKeysRequest
     *        The POST request to import API keys from an external source, such as a CSV-formatted file.
     * @return A Java Future containing the result of the ImportApiKeys operation returned by the service.
     * @sample AmazonApiGatewayAsync.ImportApiKeys
     */
    java.util.concurrent.Future<ImportApiKeysResult> importApiKeysAsync(ImportApiKeysRequest importApiKeysRequest);

    /**
     * <p>
     * Import API keys from an external source, such as a CSV-formatted file.
     * </p>
     * 
     * @param importApiKeysRequest
     *        The POST request to import API keys from an external source, such as a CSV-formatted file.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportApiKeys operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.ImportApiKeys
     */
    java.util.concurrent.Future<ImportApiKeysResult> importApiKeysAsync(ImportApiKeysRequest importApiKeysRequest,
            com.amazonaws.handlers.AsyncHandler<ImportApiKeysRequest, ImportApiKeysResult> asyncHandler);

    /**
     * @param importDocumentationPartsRequest
     *        Import documentation parts from an external (e.g., OpenAPI) definition file.
     * @return A Java Future containing the result of the ImportDocumentationParts operation returned by the service.
     * @sample AmazonApiGatewayAsync.ImportDocumentationParts
     */
    java.util.concurrent.Future<ImportDocumentationPartsResult> importDocumentationPartsAsync(ImportDocumentationPartsRequest importDocumentationPartsRequest);

    /**
     * @param importDocumentationPartsRequest
     *        Import documentation parts from an external (e.g., OpenAPI) definition file.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportDocumentationParts operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.ImportDocumentationParts
     */
    java.util.concurrent.Future<ImportDocumentationPartsResult> importDocumentationPartsAsync(ImportDocumentationPartsRequest importDocumentationPartsRequest,
            com.amazonaws.handlers.AsyncHandler<ImportDocumentationPartsRequest, ImportDocumentationPartsResult> asyncHandler);

    /**
     * <p>
     * A feature of the API Gateway control service for creating a new API from an external API definition file.
     * </p>
     * 
     * @param importRestApiRequest
     *        A POST request to import an API to API Gateway using an input of an API definition file.
     * @return A Java Future containing the result of the ImportRestApi operation returned by the service.
     * @sample AmazonApiGatewayAsync.ImportRestApi
     */
    java.util.concurrent.Future<ImportRestApiResult> importRestApiAsync(ImportRestApiRequest importRestApiRequest);

    /**
     * <p>
     * A feature of the API Gateway control service for creating a new API from an external API definition file.
     * </p>
     * 
     * @param importRestApiRequest
     *        A POST request to import an API to API Gateway using an input of an API definition file.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportRestApi operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.ImportRestApi
     */
    java.util.concurrent.Future<ImportRestApiResult> importRestApiAsync(ImportRestApiRequest importRestApiRequest,
            com.amazonaws.handlers.AsyncHandler<ImportRestApiRequest, ImportRestApiResult> asyncHandler);

    /**
     * <p>
     * Creates a customization of a <a>GatewayResponse</a> of a specified response type and status code on the given
     * <a>RestApi</a>.
     * </p>
     * 
     * @param putGatewayResponseRequest
     *        Creates a customization of a <a>GatewayResponse</a> of a specified response type and status code on the
     *        given <a>RestApi</a>.
     * @return A Java Future containing the result of the PutGatewayResponse operation returned by the service.
     * @sample AmazonApiGatewayAsync.PutGatewayResponse
     */
    java.util.concurrent.Future<PutGatewayResponseResult> putGatewayResponseAsync(PutGatewayResponseRequest putGatewayResponseRequest);

    /**
     * <p>
     * Creates a customization of a <a>GatewayResponse</a> of a specified response type and status code on the given
     * <a>RestApi</a>.
     * </p>
     * 
     * @param putGatewayResponseRequest
     *        Creates a customization of a <a>GatewayResponse</a> of a specified response type and status code on the
     *        given <a>RestApi</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutGatewayResponse operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.PutGatewayResponse
     */
    java.util.concurrent.Future<PutGatewayResponseResult> putGatewayResponseAsync(PutGatewayResponseRequest putGatewayResponseRequest,
            com.amazonaws.handlers.AsyncHandler<PutGatewayResponseRequest, PutGatewayResponseResult> asyncHandler);

    /**
     * <p>
     * Sets up a method's integration.
     * </p>
     * 
     * @param putIntegrationRequest
     *        Sets up a method's integration.
     * @return A Java Future containing the result of the PutIntegration operation returned by the service.
     * @sample AmazonApiGatewayAsync.PutIntegration
     */
    java.util.concurrent.Future<PutIntegrationResult> putIntegrationAsync(PutIntegrationRequest putIntegrationRequest);

    /**
     * <p>
     * Sets up a method's integration.
     * </p>
     * 
     * @param putIntegrationRequest
     *        Sets up a method's integration.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutIntegration operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.PutIntegration
     */
    java.util.concurrent.Future<PutIntegrationResult> putIntegrationAsync(PutIntegrationRequest putIntegrationRequest,
            com.amazonaws.handlers.AsyncHandler<PutIntegrationRequest, PutIntegrationResult> asyncHandler);

    /**
     * <p>
     * Represents a put integration.
     * </p>
     * 
     * @param putIntegrationResponseRequest
     *        Represents a put integration response request.
     * @return A Java Future containing the result of the PutIntegrationResponse operation returned by the service.
     * @sample AmazonApiGatewayAsync.PutIntegrationResponse
     */
    java.util.concurrent.Future<PutIntegrationResponseResult> putIntegrationResponseAsync(PutIntegrationResponseRequest putIntegrationResponseRequest);

    /**
     * <p>
     * Represents a put integration.
     * </p>
     * 
     * @param putIntegrationResponseRequest
     *        Represents a put integration response request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutIntegrationResponse operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.PutIntegrationResponse
     */
    java.util.concurrent.Future<PutIntegrationResponseResult> putIntegrationResponseAsync(PutIntegrationResponseRequest putIntegrationResponseRequest,
            com.amazonaws.handlers.AsyncHandler<PutIntegrationResponseRequest, PutIntegrationResponseResult> asyncHandler);

    /**
     * <p>
     * Add a method to an existing <a>Resource</a> resource.
     * </p>
     * 
     * @param putMethodRequest
     *        Request to add a method to an existing <a>Resource</a> resource.
     * @return A Java Future containing the result of the PutMethod operation returned by the service.
     * @sample AmazonApiGatewayAsync.PutMethod
     */
    java.util.concurrent.Future<PutMethodResult> putMethodAsync(PutMethodRequest putMethodRequest);

    /**
     * <p>
     * Add a method to an existing <a>Resource</a> resource.
     * </p>
     * 
     * @param putMethodRequest
     *        Request to add a method to an existing <a>Resource</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutMethod operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.PutMethod
     */
    java.util.concurrent.Future<PutMethodResult> putMethodAsync(PutMethodRequest putMethodRequest,
            com.amazonaws.handlers.AsyncHandler<PutMethodRequest, PutMethodResult> asyncHandler);

    /**
     * <p>
     * Adds a <a>MethodResponse</a> to an existing <a>Method</a> resource.
     * </p>
     * 
     * @param putMethodResponseRequest
     *        Request to add a <a>MethodResponse</a> to an existing <a>Method</a> resource.
     * @return A Java Future containing the result of the PutMethodResponse operation returned by the service.
     * @sample AmazonApiGatewayAsync.PutMethodResponse
     */
    java.util.concurrent.Future<PutMethodResponseResult> putMethodResponseAsync(PutMethodResponseRequest putMethodResponseRequest);

    /**
     * <p>
     * Adds a <a>MethodResponse</a> to an existing <a>Method</a> resource.
     * </p>
     * 
     * @param putMethodResponseRequest
     *        Request to add a <a>MethodResponse</a> to an existing <a>Method</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutMethodResponse operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.PutMethodResponse
     */
    java.util.concurrent.Future<PutMethodResponseResult> putMethodResponseAsync(PutMethodResponseRequest putMethodResponseRequest,
            com.amazonaws.handlers.AsyncHandler<PutMethodResponseRequest, PutMethodResponseResult> asyncHandler);

    /**
     * <p>
     * A feature of the API Gateway control service for updating an existing API with an input of external API
     * definitions. The update can take the form of merging the supplied definition into the existing API or overwriting
     * the existing API.
     * </p>
     * 
     * @param putRestApiRequest
     *        A PUT request to update an existing API, with external API definitions specified as the request body.
     * @return A Java Future containing the result of the PutRestApi operation returned by the service.
     * @sample AmazonApiGatewayAsync.PutRestApi
     */
    java.util.concurrent.Future<PutRestApiResult> putRestApiAsync(PutRestApiRequest putRestApiRequest);

    /**
     * <p>
     * A feature of the API Gateway control service for updating an existing API with an input of external API
     * definitions. The update can take the form of merging the supplied definition into the existing API or overwriting
     * the existing API.
     * </p>
     * 
     * @param putRestApiRequest
     *        A PUT request to update an existing API, with external API definitions specified as the request body.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutRestApi operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.PutRestApi
     */
    java.util.concurrent.Future<PutRestApiResult> putRestApiAsync(PutRestApiRequest putRestApiRequest,
            com.amazonaws.handlers.AsyncHandler<PutRestApiRequest, PutRestApiResult> asyncHandler);

    /**
     * <p>
     * Adds or updates a tag on a given resource.
     * </p>
     * 
     * @param tagResourceRequest
     *        Adds or updates a tag on a given resource.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonApiGatewayAsync.TagResource
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds or updates a tag on a given resource.
     * </p>
     * 
     * @param tagResourceRequest
     *        Adds or updates a tag on a given resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.TagResource
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Simulate the execution of an <a>Authorizer</a> in your <a>RestApi</a> with headers, parameters, and an incoming
     * request body.
     * </p>
     * <div class="seeAlso"> <a
     * href="https://docs.aws.amazon.com/apigateway/latest/developerguide/use-custom-authorizer.html">Enable custom
     * authorizers</a> </div>
     * 
     * @param testInvokeAuthorizerRequest
     *        Make a request to simulate the execution of an <a>Authorizer</a>.
     * @return A Java Future containing the result of the TestInvokeAuthorizer operation returned by the service.
     * @sample AmazonApiGatewayAsync.TestInvokeAuthorizer
     */
    java.util.concurrent.Future<TestInvokeAuthorizerResult> testInvokeAuthorizerAsync(TestInvokeAuthorizerRequest testInvokeAuthorizerRequest);

    /**
     * <p>
     * Simulate the execution of an <a>Authorizer</a> in your <a>RestApi</a> with headers, parameters, and an incoming
     * request body.
     * </p>
     * <div class="seeAlso"> <a
     * href="https://docs.aws.amazon.com/apigateway/latest/developerguide/use-custom-authorizer.html">Enable custom
     * authorizers</a> </div>
     * 
     * @param testInvokeAuthorizerRequest
     *        Make a request to simulate the execution of an <a>Authorizer</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TestInvokeAuthorizer operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.TestInvokeAuthorizer
     */
    java.util.concurrent.Future<TestInvokeAuthorizerResult> testInvokeAuthorizerAsync(TestInvokeAuthorizerRequest testInvokeAuthorizerRequest,
            com.amazonaws.handlers.AsyncHandler<TestInvokeAuthorizerRequest, TestInvokeAuthorizerResult> asyncHandler);

    /**
     * <p>
     * Simulate the execution of a <a>Method</a> in your <a>RestApi</a> with headers, parameters, and an incoming
     * request body.
     * </p>
     * 
     * @param testInvokeMethodRequest
     *        Make a request to simulate the execution of a <a>Method</a>.
     * @return A Java Future containing the result of the TestInvokeMethod operation returned by the service.
     * @sample AmazonApiGatewayAsync.TestInvokeMethod
     */
    java.util.concurrent.Future<TestInvokeMethodResult> testInvokeMethodAsync(TestInvokeMethodRequest testInvokeMethodRequest);

    /**
     * <p>
     * Simulate the execution of a <a>Method</a> in your <a>RestApi</a> with headers, parameters, and an incoming
     * request body.
     * </p>
     * 
     * @param testInvokeMethodRequest
     *        Make a request to simulate the execution of a <a>Method</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TestInvokeMethod operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.TestInvokeMethod
     */
    java.util.concurrent.Future<TestInvokeMethodResult> testInvokeMethodAsync(TestInvokeMethodRequest testInvokeMethodRequest,
            com.amazonaws.handlers.AsyncHandler<TestInvokeMethodRequest, TestInvokeMethodResult> asyncHandler);

    /**
     * <p>
     * Removes a tag from a given resource.
     * </p>
     * 
     * @param untagResourceRequest
     *        Removes a tag from a given resource.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonApiGatewayAsync.UntagResource
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes a tag from a given resource.
     * </p>
     * 
     * @param untagResourceRequest
     *        Removes a tag from a given resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.UntagResource
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Changes information about the current <a>Account</a> resource.
     * </p>
     * 
     * @param updateAccountRequest
     *        Requests API Gateway to change information about the current <a>Account</a> resource.
     * @return A Java Future containing the result of the UpdateAccount operation returned by the service.
     * @sample AmazonApiGatewayAsync.UpdateAccount
     */
    java.util.concurrent.Future<UpdateAccountResult> updateAccountAsync(UpdateAccountRequest updateAccountRequest);

    /**
     * <p>
     * Changes information about the current <a>Account</a> resource.
     * </p>
     * 
     * @param updateAccountRequest
     *        Requests API Gateway to change information about the current <a>Account</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAccount operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.UpdateAccount
     */
    java.util.concurrent.Future<UpdateAccountResult> updateAccountAsync(UpdateAccountRequest updateAccountRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAccountRequest, UpdateAccountResult> asyncHandler);

    /**
     * <p>
     * Changes information about an <a>ApiKey</a> resource.
     * </p>
     * 
     * @param updateApiKeyRequest
     *        A request to change information about an <a>ApiKey</a> resource.
     * @return A Java Future containing the result of the UpdateApiKey operation returned by the service.
     * @sample AmazonApiGatewayAsync.UpdateApiKey
     */
    java.util.concurrent.Future<UpdateApiKeyResult> updateApiKeyAsync(UpdateApiKeyRequest updateApiKeyRequest);

    /**
     * <p>
     * Changes information about an <a>ApiKey</a> resource.
     * </p>
     * 
     * @param updateApiKeyRequest
     *        A request to change information about an <a>ApiKey</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApiKey operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.UpdateApiKey
     */
    java.util.concurrent.Future<UpdateApiKeyResult> updateApiKeyAsync(UpdateApiKeyRequest updateApiKeyRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApiKeyRequest, UpdateApiKeyResult> asyncHandler);

    /**
     * <p>
     * Updates an existing <a>Authorizer</a> resource.
     * </p>
     * <div class="seeAlso"><a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/update-authorizer.html">AWS CLI</a></div>
     * 
     * @param updateAuthorizerRequest
     *        Request to update an existing <a>Authorizer</a> resource.
     * @return A Java Future containing the result of the UpdateAuthorizer operation returned by the service.
     * @sample AmazonApiGatewayAsync.UpdateAuthorizer
     */
    java.util.concurrent.Future<UpdateAuthorizerResult> updateAuthorizerAsync(UpdateAuthorizerRequest updateAuthorizerRequest);

    /**
     * <p>
     * Updates an existing <a>Authorizer</a> resource.
     * </p>
     * <div class="seeAlso"><a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/update-authorizer.html">AWS CLI</a></div>
     * 
     * @param updateAuthorizerRequest
     *        Request to update an existing <a>Authorizer</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAuthorizer operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.UpdateAuthorizer
     */
    java.util.concurrent.Future<UpdateAuthorizerResult> updateAuthorizerAsync(UpdateAuthorizerRequest updateAuthorizerRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAuthorizerRequest, UpdateAuthorizerResult> asyncHandler);

    /**
     * <p>
     * Changes information about the <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param updateBasePathMappingRequest
     *        A request to change information about the <a>BasePathMapping</a> resource.
     * @return A Java Future containing the result of the UpdateBasePathMapping operation returned by the service.
     * @sample AmazonApiGatewayAsync.UpdateBasePathMapping
     */
    java.util.concurrent.Future<UpdateBasePathMappingResult> updateBasePathMappingAsync(UpdateBasePathMappingRequest updateBasePathMappingRequest);

    /**
     * <p>
     * Changes information about the <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param updateBasePathMappingRequest
     *        A request to change information about the <a>BasePathMapping</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateBasePathMapping operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.UpdateBasePathMapping
     */
    java.util.concurrent.Future<UpdateBasePathMappingResult> updateBasePathMappingAsync(UpdateBasePathMappingRequest updateBasePathMappingRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateBasePathMappingRequest, UpdateBasePathMappingResult> asyncHandler);

    /**
     * <p>
     * Changes information about an <a>ClientCertificate</a> resource.
     * </p>
     * 
     * @param updateClientCertificateRequest
     *        A request to change information about an <a>ClientCertificate</a> resource.
     * @return A Java Future containing the result of the UpdateClientCertificate operation returned by the service.
     * @sample AmazonApiGatewayAsync.UpdateClientCertificate
     */
    java.util.concurrent.Future<UpdateClientCertificateResult> updateClientCertificateAsync(UpdateClientCertificateRequest updateClientCertificateRequest);

    /**
     * <p>
     * Changes information about an <a>ClientCertificate</a> resource.
     * </p>
     * 
     * @param updateClientCertificateRequest
     *        A request to change information about an <a>ClientCertificate</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateClientCertificate operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.UpdateClientCertificate
     */
    java.util.concurrent.Future<UpdateClientCertificateResult> updateClientCertificateAsync(UpdateClientCertificateRequest updateClientCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateClientCertificateRequest, UpdateClientCertificateResult> asyncHandler);

    /**
     * <p>
     * Changes information about a <a>Deployment</a> resource.
     * </p>
     * 
     * @param updateDeploymentRequest
     *        Requests API Gateway to change information about a <a>Deployment</a> resource.
     * @return A Java Future containing the result of the UpdateDeployment operation returned by the service.
     * @sample AmazonApiGatewayAsync.UpdateDeployment
     */
    java.util.concurrent.Future<UpdateDeploymentResult> updateDeploymentAsync(UpdateDeploymentRequest updateDeploymentRequest);

    /**
     * <p>
     * Changes information about a <a>Deployment</a> resource.
     * </p>
     * 
     * @param updateDeploymentRequest
     *        Requests API Gateway to change information about a <a>Deployment</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDeployment operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.UpdateDeployment
     */
    java.util.concurrent.Future<UpdateDeploymentResult> updateDeploymentAsync(UpdateDeploymentRequest updateDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDeploymentRequest, UpdateDeploymentResult> asyncHandler);

    /**
     * @param updateDocumentationPartRequest
     *        Updates an existing documentation part of a given API.
     * @return A Java Future containing the result of the UpdateDocumentationPart operation returned by the service.
     * @sample AmazonApiGatewayAsync.UpdateDocumentationPart
     */
    java.util.concurrent.Future<UpdateDocumentationPartResult> updateDocumentationPartAsync(UpdateDocumentationPartRequest updateDocumentationPartRequest);

    /**
     * @param updateDocumentationPartRequest
     *        Updates an existing documentation part of a given API.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDocumentationPart operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.UpdateDocumentationPart
     */
    java.util.concurrent.Future<UpdateDocumentationPartResult> updateDocumentationPartAsync(UpdateDocumentationPartRequest updateDocumentationPartRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDocumentationPartRequest, UpdateDocumentationPartResult> asyncHandler);

    /**
     * @param updateDocumentationVersionRequest
     *        Updates an existing documentation version of an API.
     * @return A Java Future containing the result of the UpdateDocumentationVersion operation returned by the service.
     * @sample AmazonApiGatewayAsync.UpdateDocumentationVersion
     */
    java.util.concurrent.Future<UpdateDocumentationVersionResult> updateDocumentationVersionAsync(
            UpdateDocumentationVersionRequest updateDocumentationVersionRequest);

    /**
     * @param updateDocumentationVersionRequest
     *        Updates an existing documentation version of an API.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDocumentationVersion operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.UpdateDocumentationVersion
     */
    java.util.concurrent.Future<UpdateDocumentationVersionResult> updateDocumentationVersionAsync(
            UpdateDocumentationVersionRequest updateDocumentationVersionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDocumentationVersionRequest, UpdateDocumentationVersionResult> asyncHandler);

    /**
     * <p>
     * Changes information about the <a>DomainName</a> resource.
     * </p>
     * 
     * @param updateDomainNameRequest
     *        A request to change information about the <a>DomainName</a> resource.
     * @return A Java Future containing the result of the UpdateDomainName operation returned by the service.
     * @sample AmazonApiGatewayAsync.UpdateDomainName
     */
    java.util.concurrent.Future<UpdateDomainNameResult> updateDomainNameAsync(UpdateDomainNameRequest updateDomainNameRequest);

    /**
     * <p>
     * Changes information about the <a>DomainName</a> resource.
     * </p>
     * 
     * @param updateDomainNameRequest
     *        A request to change information about the <a>DomainName</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDomainName operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.UpdateDomainName
     */
    java.util.concurrent.Future<UpdateDomainNameResult> updateDomainNameAsync(UpdateDomainNameRequest updateDomainNameRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDomainNameRequest, UpdateDomainNameResult> asyncHandler);

    /**
     * <p>
     * Updates a <a>GatewayResponse</a> of a specified response type on the given <a>RestApi</a>.
     * </p>
     * 
     * @param updateGatewayResponseRequest
     *        Updates a <a>GatewayResponse</a> of a specified response type on the given <a>RestApi</a>.
     * @return A Java Future containing the result of the UpdateGatewayResponse operation returned by the service.
     * @sample AmazonApiGatewayAsync.UpdateGatewayResponse
     */
    java.util.concurrent.Future<UpdateGatewayResponseResult> updateGatewayResponseAsync(UpdateGatewayResponseRequest updateGatewayResponseRequest);

    /**
     * <p>
     * Updates a <a>GatewayResponse</a> of a specified response type on the given <a>RestApi</a>.
     * </p>
     * 
     * @param updateGatewayResponseRequest
     *        Updates a <a>GatewayResponse</a> of a specified response type on the given <a>RestApi</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGatewayResponse operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.UpdateGatewayResponse
     */
    java.util.concurrent.Future<UpdateGatewayResponseResult> updateGatewayResponseAsync(UpdateGatewayResponseRequest updateGatewayResponseRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGatewayResponseRequest, UpdateGatewayResponseResult> asyncHandler);

    /**
     * <p>
     * Represents an update integration.
     * </p>
     * 
     * @param updateIntegrationRequest
     *        Represents an update integration request.
     * @return A Java Future containing the result of the UpdateIntegration operation returned by the service.
     * @sample AmazonApiGatewayAsync.UpdateIntegration
     */
    java.util.concurrent.Future<UpdateIntegrationResult> updateIntegrationAsync(UpdateIntegrationRequest updateIntegrationRequest);

    /**
     * <p>
     * Represents an update integration.
     * </p>
     * 
     * @param updateIntegrationRequest
     *        Represents an update integration request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateIntegration operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.UpdateIntegration
     */
    java.util.concurrent.Future<UpdateIntegrationResult> updateIntegrationAsync(UpdateIntegrationRequest updateIntegrationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateIntegrationRequest, UpdateIntegrationResult> asyncHandler);

    /**
     * <p>
     * Represents an update integration response.
     * </p>
     * 
     * @param updateIntegrationResponseRequest
     *        Represents an update integration response request.
     * @return A Java Future containing the result of the UpdateIntegrationResponse operation returned by the service.
     * @sample AmazonApiGatewayAsync.UpdateIntegrationResponse
     */
    java.util.concurrent.Future<UpdateIntegrationResponseResult> updateIntegrationResponseAsync(
            UpdateIntegrationResponseRequest updateIntegrationResponseRequest);

    /**
     * <p>
     * Represents an update integration response.
     * </p>
     * 
     * @param updateIntegrationResponseRequest
     *        Represents an update integration response request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateIntegrationResponse operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.UpdateIntegrationResponse
     */
    java.util.concurrent.Future<UpdateIntegrationResponseResult> updateIntegrationResponseAsync(
            UpdateIntegrationResponseRequest updateIntegrationResponseRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateIntegrationResponseRequest, UpdateIntegrationResponseResult> asyncHandler);

    /**
     * <p>
     * Updates an existing <a>Method</a> resource.
     * </p>
     * 
     * @param updateMethodRequest
     *        Request to update an existing <a>Method</a> resource.
     * @return A Java Future containing the result of the UpdateMethod operation returned by the service.
     * @sample AmazonApiGatewayAsync.UpdateMethod
     */
    java.util.concurrent.Future<UpdateMethodResult> updateMethodAsync(UpdateMethodRequest updateMethodRequest);

    /**
     * <p>
     * Updates an existing <a>Method</a> resource.
     * </p>
     * 
     * @param updateMethodRequest
     *        Request to update an existing <a>Method</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMethod operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.UpdateMethod
     */
    java.util.concurrent.Future<UpdateMethodResult> updateMethodAsync(UpdateMethodRequest updateMethodRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMethodRequest, UpdateMethodResult> asyncHandler);

    /**
     * <p>
     * Updates an existing <a>MethodResponse</a> resource.
     * </p>
     * 
     * @param updateMethodResponseRequest
     *        A request to update an existing <a>MethodResponse</a> resource.
     * @return A Java Future containing the result of the UpdateMethodResponse operation returned by the service.
     * @sample AmazonApiGatewayAsync.UpdateMethodResponse
     */
    java.util.concurrent.Future<UpdateMethodResponseResult> updateMethodResponseAsync(UpdateMethodResponseRequest updateMethodResponseRequest);

    /**
     * <p>
     * Updates an existing <a>MethodResponse</a> resource.
     * </p>
     * 
     * @param updateMethodResponseRequest
     *        A request to update an existing <a>MethodResponse</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMethodResponse operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.UpdateMethodResponse
     */
    java.util.concurrent.Future<UpdateMethodResponseResult> updateMethodResponseAsync(UpdateMethodResponseRequest updateMethodResponseRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMethodResponseRequest, UpdateMethodResponseResult> asyncHandler);

    /**
     * <p>
     * Changes information about a model.
     * </p>
     * 
     * @param updateModelRequest
     *        Request to update an existing model in an existing <a>RestApi</a> resource.
     * @return A Java Future containing the result of the UpdateModel operation returned by the service.
     * @sample AmazonApiGatewayAsync.UpdateModel
     */
    java.util.concurrent.Future<UpdateModelResult> updateModelAsync(UpdateModelRequest updateModelRequest);

    /**
     * <p>
     * Changes information about a model.
     * </p>
     * 
     * @param updateModelRequest
     *        Request to update an existing model in an existing <a>RestApi</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateModel operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.UpdateModel
     */
    java.util.concurrent.Future<UpdateModelResult> updateModelAsync(UpdateModelRequest updateModelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateModelRequest, UpdateModelResult> asyncHandler);

    /**
     * <p>
     * Updates a <a>RequestValidator</a> of a given <a>RestApi</a>.
     * </p>
     * 
     * @param updateRequestValidatorRequest
     *        Updates a <a>RequestValidator</a> of a given <a>RestApi</a>.
     * @return A Java Future containing the result of the UpdateRequestValidator operation returned by the service.
     * @sample AmazonApiGatewayAsync.UpdateRequestValidator
     */
    java.util.concurrent.Future<UpdateRequestValidatorResult> updateRequestValidatorAsync(UpdateRequestValidatorRequest updateRequestValidatorRequest);

    /**
     * <p>
     * Updates a <a>RequestValidator</a> of a given <a>RestApi</a>.
     * </p>
     * 
     * @param updateRequestValidatorRequest
     *        Updates a <a>RequestValidator</a> of a given <a>RestApi</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRequestValidator operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.UpdateRequestValidator
     */
    java.util.concurrent.Future<UpdateRequestValidatorResult> updateRequestValidatorAsync(UpdateRequestValidatorRequest updateRequestValidatorRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRequestValidatorRequest, UpdateRequestValidatorResult> asyncHandler);

    /**
     * <p>
     * Changes information about a <a>Resource</a> resource.
     * </p>
     * 
     * @param updateResourceRequest
     *        Request to change information about a <a>Resource</a> resource.
     * @return A Java Future containing the result of the UpdateResource operation returned by the service.
     * @sample AmazonApiGatewayAsync.UpdateResource
     */
    java.util.concurrent.Future<UpdateResourceResult> updateResourceAsync(UpdateResourceRequest updateResourceRequest);

    /**
     * <p>
     * Changes information about a <a>Resource</a> resource.
     * </p>
     * 
     * @param updateResourceRequest
     *        Request to change information about a <a>Resource</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateResource operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.UpdateResource
     */
    java.util.concurrent.Future<UpdateResourceResult> updateResourceAsync(UpdateResourceRequest updateResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateResourceRequest, UpdateResourceResult> asyncHandler);

    /**
     * <p>
     * Changes information about the specified API.
     * </p>
     * 
     * @param updateRestApiRequest
     *        Request to update an existing <a>RestApi</a> resource in your collection.
     * @return A Java Future containing the result of the UpdateRestApi operation returned by the service.
     * @sample AmazonApiGatewayAsync.UpdateRestApi
     */
    java.util.concurrent.Future<UpdateRestApiResult> updateRestApiAsync(UpdateRestApiRequest updateRestApiRequest);

    /**
     * <p>
     * Changes information about the specified API.
     * </p>
     * 
     * @param updateRestApiRequest
     *        Request to update an existing <a>RestApi</a> resource in your collection.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRestApi operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.UpdateRestApi
     */
    java.util.concurrent.Future<UpdateRestApiResult> updateRestApiAsync(UpdateRestApiRequest updateRestApiRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRestApiRequest, UpdateRestApiResult> asyncHandler);

    /**
     * <p>
     * Changes information about a <a>Stage</a> resource.
     * </p>
     * 
     * @param updateStageRequest
     *        Requests API Gateway to change information about a <a>Stage</a> resource.
     * @return A Java Future containing the result of the UpdateStage operation returned by the service.
     * @sample AmazonApiGatewayAsync.UpdateStage
     */
    java.util.concurrent.Future<UpdateStageResult> updateStageAsync(UpdateStageRequest updateStageRequest);

    /**
     * <p>
     * Changes information about a <a>Stage</a> resource.
     * </p>
     * 
     * @param updateStageRequest
     *        Requests API Gateway to change information about a <a>Stage</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateStage operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.UpdateStage
     */
    java.util.concurrent.Future<UpdateStageResult> updateStageAsync(UpdateStageRequest updateStageRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateStageRequest, UpdateStageResult> asyncHandler);

    /**
     * <p>
     * Grants a temporary extension to the remaining quota of a usage plan associated with a specified API key.
     * </p>
     * 
     * @param updateUsageRequest
     *        The PATCH request to grant a temporary extension to the remaining quota of a usage plan associated with a
     *        specified API key.
     * @return A Java Future containing the result of the UpdateUsage operation returned by the service.
     * @sample AmazonApiGatewayAsync.UpdateUsage
     */
    java.util.concurrent.Future<UpdateUsageResult> updateUsageAsync(UpdateUsageRequest updateUsageRequest);

    /**
     * <p>
     * Grants a temporary extension to the remaining quota of a usage plan associated with a specified API key.
     * </p>
     * 
     * @param updateUsageRequest
     *        The PATCH request to grant a temporary extension to the remaining quota of a usage plan associated with a
     *        specified API key.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateUsage operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.UpdateUsage
     */
    java.util.concurrent.Future<UpdateUsageResult> updateUsageAsync(UpdateUsageRequest updateUsageRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateUsageRequest, UpdateUsageResult> asyncHandler);

    /**
     * <p>
     * Updates a usage plan of a given plan Id.
     * </p>
     * 
     * @param updateUsagePlanRequest
     *        The PATCH request to update a usage plan of a given plan Id.
     * @return A Java Future containing the result of the UpdateUsagePlan operation returned by the service.
     * @sample AmazonApiGatewayAsync.UpdateUsagePlan
     */
    java.util.concurrent.Future<UpdateUsagePlanResult> updateUsagePlanAsync(UpdateUsagePlanRequest updateUsagePlanRequest);

    /**
     * <p>
     * Updates a usage plan of a given plan Id.
     * </p>
     * 
     * @param updateUsagePlanRequest
     *        The PATCH request to update a usage plan of a given plan Id.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateUsagePlan operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.UpdateUsagePlan
     */
    java.util.concurrent.Future<UpdateUsagePlanResult> updateUsagePlanAsync(UpdateUsagePlanRequest updateUsagePlanRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateUsagePlanRequest, UpdateUsagePlanResult> asyncHandler);

    /**
     * <p>
     * Updates an existing <a>VpcLink</a> of a specified identifier.
     * </p>
     * 
     * @param updateVpcLinkRequest
     *        Updates an existing <a>VpcLink</a> of a specified identifier.
     * @return A Java Future containing the result of the UpdateVpcLink operation returned by the service.
     * @sample AmazonApiGatewayAsync.UpdateVpcLink
     */
    java.util.concurrent.Future<UpdateVpcLinkResult> updateVpcLinkAsync(UpdateVpcLinkRequest updateVpcLinkRequest);

    /**
     * <p>
     * Updates an existing <a>VpcLink</a> of a specified identifier.
     * </p>
     * 
     * @param updateVpcLinkRequest
     *        Updates an existing <a>VpcLink</a> of a specified identifier.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateVpcLink operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.UpdateVpcLink
     */
    java.util.concurrent.Future<UpdateVpcLinkResult> updateVpcLinkAsync(UpdateVpcLinkRequest updateVpcLinkRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateVpcLinkRequest, UpdateVpcLinkResult> asyncHandler);

}
