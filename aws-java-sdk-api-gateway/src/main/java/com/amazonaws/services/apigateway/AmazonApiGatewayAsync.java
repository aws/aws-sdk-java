/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.apigateway;

import com.amazonaws.services.apigateway.model.*;

/**
 * Interface for accessing Amazon API Gateway asynchronously. Each asynchronous
 * method will return a Java Future object representing the asynchronous
 * operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon API Gateway</fullname>
 * <p>
 * Amazon API Gateway helps developers deliver robust, secure and scalable
 * mobile and web application backends. Amazon API Gateway allows developers to
 * securely connect mobile and web applications to APIs that run on AWS Lambda,
 * Amazon EC2, or other publicly addressable web services that are hosted
 * outside of AWS.
 * </p>
 */
public interface AmazonApiGatewayAsync extends AmazonApiGateway {

    /**
     * @param createApiKeyRequest
     * @return A Java Future containing the result of the CreateApiKey operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsync.CreateApiKey
     */
    java.util.concurrent.Future<CreateApiKeyResult> createApiKeyAsync(
            CreateApiKeyRequest createApiKeyRequest);

    /**
     * @param createApiKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateApiKey operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.CreateApiKey
     */
    java.util.concurrent.Future<CreateApiKeyResult> createApiKeyAsync(
            CreateApiKeyRequest createApiKeyRequest,
            com.amazonaws.handlers.AsyncHandler<CreateApiKeyRequest, CreateApiKeyResult> asyncHandler);

    /**
     * <p>
     * Creates a new <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param createBasePathMappingRequest
     *        Requests Amazon API Gateway to create a new <a>BasePathMapping</a>
     *        resource.
     * @return A Java Future containing the result of the CreateBasePathMapping
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsync.CreateBasePathMapping
     */
    java.util.concurrent.Future<CreateBasePathMappingResult> createBasePathMappingAsync(
            CreateBasePathMappingRequest createBasePathMappingRequest);

    /**
     * <p>
     * Creates a new <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param createBasePathMappingRequest
     *        Requests Amazon API Gateway to create a new <a>BasePathMapping</a>
     *        resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBasePathMapping
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.CreateBasePathMapping
     */
    java.util.concurrent.Future<CreateBasePathMappingResult> createBasePathMappingAsync(
            CreateBasePathMappingRequest createBasePathMappingRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBasePathMappingRequest, CreateBasePathMappingResult> asyncHandler);

    /**
     * <p>
     * Creates a <a>Deployment</a> resource, which makes a specified
     * <a>RestApi</a> callable over the internet.
     * </p>
     * 
     * @param createDeploymentRequest
     *        Requests Amazon API Gateway to create a <a>Deployment</a>
     *        resource.
     * @return A Java Future containing the result of the CreateDeployment
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsync.CreateDeployment
     */
    java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(
            CreateDeploymentRequest createDeploymentRequest);

    /**
     * <p>
     * Creates a <a>Deployment</a> resource, which makes a specified
     * <a>RestApi</a> callable over the internet.
     * </p>
     * 
     * @param createDeploymentRequest
     *        Requests Amazon API Gateway to create a <a>Deployment</a>
     *        resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDeployment
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.CreateDeployment
     */
    java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(
            CreateDeploymentRequest createDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDeploymentRequest, CreateDeploymentResult> asyncHandler);

    /**
     * <p>
     * Creates a new domain name.
     * </p>
     * 
     * @param createDomainNameRequest
     *        A request to create a new domain name.
     * @return A Java Future containing the result of the CreateDomainName
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsync.CreateDomainName
     */
    java.util.concurrent.Future<CreateDomainNameResult> createDomainNameAsync(
            CreateDomainNameRequest createDomainNameRequest);

    /**
     * <p>
     * Creates a new domain name.
     * </p>
     * 
     * @param createDomainNameRequest
     *        A request to create a new domain name.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDomainName
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.CreateDomainName
     */
    java.util.concurrent.Future<CreateDomainNameResult> createDomainNameAsync(
            CreateDomainNameRequest createDomainNameRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDomainNameRequest, CreateDomainNameResult> asyncHandler);

    /**
     * <p>
     * Adds a new <a>Model</a> resource to an existing <a>RestApi</a> resource.
     * </p>
     * 
     * @param createModelRequest
     *        Request to add a new <a>Model</a> to an existing <a>RestApi</a>
     *        resource.
     * @return A Java Future containing the result of the CreateModel operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsync.CreateModel
     */
    java.util.concurrent.Future<CreateModelResult> createModelAsync(
            CreateModelRequest createModelRequest);

    /**
     * <p>
     * Adds a new <a>Model</a> resource to an existing <a>RestApi</a> resource.
     * </p>
     * 
     * @param createModelRequest
     *        Request to add a new <a>Model</a> to an existing <a>RestApi</a>
     *        resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateModel operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.CreateModel
     */
    java.util.concurrent.Future<CreateModelResult> createModelAsync(
            CreateModelRequest createModelRequest,
            com.amazonaws.handlers.AsyncHandler<CreateModelRequest, CreateModelResult> asyncHandler);

    /**
     * <p>
     * Creates a <a>Resource</a> resource.
     * </p>
     * 
     * @param createResourceRequest
     *        Requests Amazon API Gateway to create a <a>Resource</a> resource.
     * @return A Java Future containing the result of the CreateResource
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsync.CreateResource
     */
    java.util.concurrent.Future<CreateResourceResult> createResourceAsync(
            CreateResourceRequest createResourceRequest);

    /**
     * <p>
     * Creates a <a>Resource</a> resource.
     * </p>
     * 
     * @param createResourceRequest
     *        Requests Amazon API Gateway to create a <a>Resource</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateResource
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.CreateResource
     */
    java.util.concurrent.Future<CreateResourceResult> createResourceAsync(
            CreateResourceRequest createResourceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateResourceRequest, CreateResourceResult> asyncHandler);

    /**
     * <p>
     * Creates a new <a>RestApi</a> resource.
     * </p>
     * 
     * @param createRestApiRequest
     *        Request to add a new <a>RestApi</a> resource to your collection.
     * @return A Java Future containing the result of the CreateRestApi
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsync.CreateRestApi
     */
    java.util.concurrent.Future<CreateRestApiResult> createRestApiAsync(
            CreateRestApiRequest createRestApiRequest);

    /**
     * <p>
     * Creates a new <a>RestApi</a> resource.
     * </p>
     * 
     * @param createRestApiRequest
     *        Request to add a new <a>RestApi</a> resource to your collection.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRestApi
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.CreateRestApi
     */
    java.util.concurrent.Future<CreateRestApiResult> createRestApiAsync(
            CreateRestApiRequest createRestApiRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRestApiRequest, CreateRestApiResult> asyncHandler);

    /**
     * <p>
     * Creates a <a>Stage</a> resource.
     * </p>
     * 
     * @param createStageRequest
     *        Requests Amazon API Gateway to create a <a>Stage</a> resource.
     * @return A Java Future containing the result of the CreateStage operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsync.CreateStage
     */
    java.util.concurrent.Future<CreateStageResult> createStageAsync(
            CreateStageRequest createStageRequest);

    /**
     * <p>
     * Creates a <a>Stage</a> resource.
     * </p>
     * 
     * @param createStageRequest
     *        Requests Amazon API Gateway to create a <a>Stage</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateStage operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.CreateStage
     */
    java.util.concurrent.Future<CreateStageResult> createStageAsync(
            CreateStageRequest createStageRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStageRequest, CreateStageResult> asyncHandler);

    /**
     * <p>
     * Deletes the <a>ApiKey</a> resource.
     * </p>
     * 
     * @param deleteApiKeyRequest
     *        A request to delete the <a>ApiKey</a> resource.
     * @sample AmazonApiGatewayAsync.DeleteApiKey
     */
    java.util.concurrent.Future<Void> deleteApiKeyAsync(
            DeleteApiKeyRequest deleteApiKeyRequest);

    /**
     * <p>
     * Deletes the <a>ApiKey</a> resource.
     * </p>
     * 
     * @param deleteApiKeyRequest
     *        A request to delete the <a>ApiKey</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonApiGatewayAsyncHandler.DeleteApiKey
     */
    java.util.concurrent.Future<Void> deleteApiKeyAsync(
            DeleteApiKeyRequest deleteApiKeyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApiKeyRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes the <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param deleteBasePathMappingRequest
     *        A request to delete the <a>BasePathMapping</a> resource.
     * @sample AmazonApiGatewayAsync.DeleteBasePathMapping
     */
    java.util.concurrent.Future<Void> deleteBasePathMappingAsync(
            DeleteBasePathMappingRequest deleteBasePathMappingRequest);

    /**
     * <p>
     * Deletes the <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param deleteBasePathMappingRequest
     *        A request to delete the <a>BasePathMapping</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonApiGatewayAsyncHandler.DeleteBasePathMapping
     */
    java.util.concurrent.Future<Void> deleteBasePathMappingAsync(
            DeleteBasePathMappingRequest deleteBasePathMappingRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBasePathMappingRequest, Void> asyncHandler);

    /**
     * @param deleteClientCertificateRequest
     * @sample AmazonApiGatewayAsync.DeleteClientCertificate
     */
    java.util.concurrent.Future<Void> deleteClientCertificateAsync(
            DeleteClientCertificateRequest deleteClientCertificateRequest);

    /**
     * @param deleteClientCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonApiGatewayAsyncHandler.DeleteClientCertificate
     */
    java.util.concurrent.Future<Void> deleteClientCertificateAsync(
            DeleteClientCertificateRequest deleteClientCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteClientCertificateRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes a <a>Deployment</a> resource. Deleting a deployment will only
     * succeed if there are no <a>Stage</a> resources associated with it.
     * </p>
     * 
     * @param deleteDeploymentRequest
     *        Requests Amazon API Gateway to delete a <a>Deployment</a>
     *        resource.
     * @sample AmazonApiGatewayAsync.DeleteDeployment
     */
    java.util.concurrent.Future<Void> deleteDeploymentAsync(
            DeleteDeploymentRequest deleteDeploymentRequest);

    /**
     * <p>
     * Deletes a <a>Deployment</a> resource. Deleting a deployment will only
     * succeed if there are no <a>Stage</a> resources associated with it.
     * </p>
     * 
     * @param deleteDeploymentRequest
     *        Requests Amazon API Gateway to delete a <a>Deployment</a>
     *        resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonApiGatewayAsyncHandler.DeleteDeployment
     */
    java.util.concurrent.Future<Void> deleteDeploymentAsync(
            DeleteDeploymentRequest deleteDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDeploymentRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes the <a>DomainName</a> resource.
     * </p>
     * 
     * @param deleteDomainNameRequest
     *        A request to delete the <a>DomainName</a> resource.
     * @sample AmazonApiGatewayAsync.DeleteDomainName
     */
    java.util.concurrent.Future<Void> deleteDomainNameAsync(
            DeleteDomainNameRequest deleteDomainNameRequest);

    /**
     * <p>
     * Deletes the <a>DomainName</a> resource.
     * </p>
     * 
     * @param deleteDomainNameRequest
     *        A request to delete the <a>DomainName</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonApiGatewayAsyncHandler.DeleteDomainName
     */
    java.util.concurrent.Future<Void> deleteDomainNameAsync(
            DeleteDomainNameRequest deleteDomainNameRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDomainNameRequest, Void> asyncHandler);

    /**
     * <p>
     * Represents a delete integration.
     * </p>
     * 
     * @param deleteIntegrationRequest
     *        Represents a delete integration request.
     * @sample AmazonApiGatewayAsync.DeleteIntegration
     */
    java.util.concurrent.Future<Void> deleteIntegrationAsync(
            DeleteIntegrationRequest deleteIntegrationRequest);

    /**
     * <p>
     * Represents a delete integration.
     * </p>
     * 
     * @param deleteIntegrationRequest
     *        Represents a delete integration request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonApiGatewayAsyncHandler.DeleteIntegration
     */
    java.util.concurrent.Future<Void> deleteIntegrationAsync(
            DeleteIntegrationRequest deleteIntegrationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIntegrationRequest, Void> asyncHandler);

    /**
     * <p>
     * Represents a delete integration response.
     * </p>
     * 
     * @param deleteIntegrationResponseRequest
     *        Represents a delete integration response request.
     * @sample AmazonApiGatewayAsync.DeleteIntegrationResponse
     */
    java.util.concurrent.Future<Void> deleteIntegrationResponseAsync(
            DeleteIntegrationResponseRequest deleteIntegrationResponseRequest);

    /**
     * <p>
     * Represents a delete integration response.
     * </p>
     * 
     * @param deleteIntegrationResponseRequest
     *        Represents a delete integration response request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonApiGatewayAsyncHandler.DeleteIntegrationResponse
     */
    java.util.concurrent.Future<Void> deleteIntegrationResponseAsync(
            DeleteIntegrationResponseRequest deleteIntegrationResponseRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIntegrationResponseRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes an existing <a>Method</a> resource.
     * </p>
     * 
     * @param deleteMethodRequest
     *        Request to delete an existing <a>Method</a> resource.
     * @sample AmazonApiGatewayAsync.DeleteMethod
     */
    java.util.concurrent.Future<Void> deleteMethodAsync(
            DeleteMethodRequest deleteMethodRequest);

    /**
     * <p>
     * Deletes an existing <a>Method</a> resource.
     * </p>
     * 
     * @param deleteMethodRequest
     *        Request to delete an existing <a>Method</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonApiGatewayAsyncHandler.DeleteMethod
     */
    java.util.concurrent.Future<Void> deleteMethodAsync(
            DeleteMethodRequest deleteMethodRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMethodRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes an existing <a>MethodResponse</a> resource.
     * </p>
     * 
     * @param deleteMethodResponseRequest
     *        A request to delete an existing <a>MethodResponse</a> resource.
     * @sample AmazonApiGatewayAsync.DeleteMethodResponse
     */
    java.util.concurrent.Future<Void> deleteMethodResponseAsync(
            DeleteMethodResponseRequest deleteMethodResponseRequest);

    /**
     * <p>
     * Deletes an existing <a>MethodResponse</a> resource.
     * </p>
     * 
     * @param deleteMethodResponseRequest
     *        A request to delete an existing <a>MethodResponse</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonApiGatewayAsyncHandler.DeleteMethodResponse
     */
    java.util.concurrent.Future<Void> deleteMethodResponseAsync(
            DeleteMethodResponseRequest deleteMethodResponseRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMethodResponseRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes a model.
     * </p>
     * 
     * @param deleteModelRequest
     *        Request to delete an existing model in an existing <a>RestApi</a>
     *        resource.
     * @sample AmazonApiGatewayAsync.DeleteModel
     */
    java.util.concurrent.Future<Void> deleteModelAsync(
            DeleteModelRequest deleteModelRequest);

    /**
     * <p>
     * Deletes a model.
     * </p>
     * 
     * @param deleteModelRequest
     *        Request to delete an existing model in an existing <a>RestApi</a>
     *        resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonApiGatewayAsyncHandler.DeleteModel
     */
    java.util.concurrent.Future<Void> deleteModelAsync(
            DeleteModelRequest deleteModelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteModelRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes a <a>Resource</a> resource.
     * </p>
     * 
     * @param deleteResourceRequest
     *        Request to delete a <a>Resource</a>.
     * @sample AmazonApiGatewayAsync.DeleteResource
     */
    java.util.concurrent.Future<Void> deleteResourceAsync(
            DeleteResourceRequest deleteResourceRequest);

    /**
     * <p>
     * Deletes a <a>Resource</a> resource.
     * </p>
     * 
     * @param deleteResourceRequest
     *        Request to delete a <a>Resource</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonApiGatewayAsyncHandler.DeleteResource
     */
    java.util.concurrent.Future<Void> deleteResourceAsync(
            DeleteResourceRequest deleteResourceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteResourceRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes the specified API.
     * </p>
     * 
     * @param deleteRestApiRequest
     *        Request to delete the specified API from your collection.
     * @sample AmazonApiGatewayAsync.DeleteRestApi
     */
    java.util.concurrent.Future<Void> deleteRestApiAsync(
            DeleteRestApiRequest deleteRestApiRequest);

    /**
     * <p>
     * Deletes the specified API.
     * </p>
     * 
     * @param deleteRestApiRequest
     *        Request to delete the specified API from your collection.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonApiGatewayAsyncHandler.DeleteRestApi
     */
    java.util.concurrent.Future<Void> deleteRestApiAsync(
            DeleteRestApiRequest deleteRestApiRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRestApiRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes a <a>Stage</a> resource.
     * </p>
     * 
     * @param deleteStageRequest
     *        Requests Amazon API Gateway to delete a <a>Stage</a> resource.
     * @sample AmazonApiGatewayAsync.DeleteStage
     */
    java.util.concurrent.Future<Void> deleteStageAsync(
            DeleteStageRequest deleteStageRequest);

    /**
     * <p>
     * Deletes a <a>Stage</a> resource.
     * </p>
     * 
     * @param deleteStageRequest
     *        Requests Amazon API Gateway to delete a <a>Stage</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonApiGatewayAsyncHandler.DeleteStage
     */
    java.util.concurrent.Future<Void> deleteStageAsync(
            DeleteStageRequest deleteStageRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteStageRequest, Void> asyncHandler);

    /**
     * <p>
     * Flushes a stage's cache.
     * </p>
     * 
     * @param flushStageCacheRequest
     *        Requests Amazon API Gateway to flush a stage's cache.
     * @sample AmazonApiGatewayAsync.FlushStageCache
     */
    java.util.concurrent.Future<Void> flushStageCacheAsync(
            FlushStageCacheRequest flushStageCacheRequest);

    /**
     * <p>
     * Flushes a stage's cache.
     * </p>
     * 
     * @param flushStageCacheRequest
     *        Requests Amazon API Gateway to flush a stage's cache.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonApiGatewayAsyncHandler.FlushStageCache
     */
    java.util.concurrent.Future<Void> flushStageCacheAsync(
            FlushStageCacheRequest flushStageCacheRequest,
            com.amazonaws.handlers.AsyncHandler<FlushStageCacheRequest, Void> asyncHandler);

    /**
     * @param generateClientCertificateRequest
     * @return A Java Future containing the result of the
     *         GenerateClientCertificate operation returned by the service.
     * @sample AmazonApiGatewayAsync.GenerateClientCertificate
     */
    java.util.concurrent.Future<GenerateClientCertificateResult> generateClientCertificateAsync(
            GenerateClientCertificateRequest generateClientCertificateRequest);

    /**
     * @param generateClientCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         GenerateClientCertificate operation returned by the service.
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
     *        Requests Amazon API Gateway to get information about the current
     *        <a>Account</a> resource.
     * @return A Java Future containing the result of the GetAccount operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsync.GetAccount
     */
    java.util.concurrent.Future<GetAccountResult> getAccountAsync(
            GetAccountRequest getAccountRequest);

    /**
     * <p>
     * Gets information about the current <a>Account</a> resource.
     * </p>
     * 
     * @param getAccountRequest
     *        Requests Amazon API Gateway to get information about the current
     *        <a>Account</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccount operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetAccount
     */
    java.util.concurrent.Future<GetAccountResult> getAccountAsync(
            GetAccountRequest getAccountRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccountRequest, GetAccountResult> asyncHandler);

    /**
     * <p>
     * Gets information about the current <a>ApiKey</a> resource.
     * </p>
     * 
     * @param getApiKeyRequest
     *        A request to get information about the current <a>ApiKey</a>
     *        resource.
     * @return A Java Future containing the result of the GetApiKey operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsync.GetApiKey
     */
    java.util.concurrent.Future<GetApiKeyResult> getApiKeyAsync(
            GetApiKeyRequest getApiKeyRequest);

    /**
     * <p>
     * Gets information about the current <a>ApiKey</a> resource.
     * </p>
     * 
     * @param getApiKeyRequest
     *        A request to get information about the current <a>ApiKey</a>
     *        resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApiKey operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetApiKey
     */
    java.util.concurrent.Future<GetApiKeyResult> getApiKeyAsync(
            GetApiKeyRequest getApiKeyRequest,
            com.amazonaws.handlers.AsyncHandler<GetApiKeyRequest, GetApiKeyResult> asyncHandler);

    /**
     * <p>
     * Gets information about the current <a>ApiKeys</a> resource.
     * </p>
     * 
     * @param getApiKeysRequest
     *        A request to get information about the current <a>ApiKeys</a>
     *        resource.
     * @return A Java Future containing the result of the GetApiKeys operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsync.GetApiKeys
     */
    java.util.concurrent.Future<GetApiKeysResult> getApiKeysAsync(
            GetApiKeysRequest getApiKeysRequest);

    /**
     * <p>
     * Gets information about the current <a>ApiKeys</a> resource.
     * </p>
     * 
     * @param getApiKeysRequest
     *        A request to get information about the current <a>ApiKeys</a>
     *        resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApiKeys operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetApiKeys
     */
    java.util.concurrent.Future<GetApiKeysResult> getApiKeysAsync(
            GetApiKeysRequest getApiKeysRequest,
            com.amazonaws.handlers.AsyncHandler<GetApiKeysRequest, GetApiKeysResult> asyncHandler);

    /**
     * <p>
     * Describe a <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param getBasePathMappingRequest
     *        Request to describe a <a>BasePathMapping</a> resource.
     * @return A Java Future containing the result of the GetBasePathMapping
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetBasePathMapping
     */
    java.util.concurrent.Future<GetBasePathMappingResult> getBasePathMappingAsync(
            GetBasePathMappingRequest getBasePathMappingRequest);

    /**
     * <p>
     * Describe a <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param getBasePathMappingRequest
     *        Request to describe a <a>BasePathMapping</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBasePathMapping
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetBasePathMapping
     */
    java.util.concurrent.Future<GetBasePathMappingResult> getBasePathMappingAsync(
            GetBasePathMappingRequest getBasePathMappingRequest,
            com.amazonaws.handlers.AsyncHandler<GetBasePathMappingRequest, GetBasePathMappingResult> asyncHandler);

    /**
     * <p>
     * Represents a collection of <a>BasePathMapping</a> resources.
     * </p>
     * 
     * @param getBasePathMappingsRequest
     *        A request to get information about a collection of
     *        <a>BasePathMapping</a> resources.
     * @return A Java Future containing the result of the GetBasePathMappings
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetBasePathMappings
     */
    java.util.concurrent.Future<GetBasePathMappingsResult> getBasePathMappingsAsync(
            GetBasePathMappingsRequest getBasePathMappingsRequest);

    /**
     * <p>
     * Represents a collection of <a>BasePathMapping</a> resources.
     * </p>
     * 
     * @param getBasePathMappingsRequest
     *        A request to get information about a collection of
     *        <a>BasePathMapping</a> resources.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBasePathMappings
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetBasePathMappings
     */
    java.util.concurrent.Future<GetBasePathMappingsResult> getBasePathMappingsAsync(
            GetBasePathMappingsRequest getBasePathMappingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetBasePathMappingsRequest, GetBasePathMappingsResult> asyncHandler);

    /**
     * @param getClientCertificateRequest
     * @return A Java Future containing the result of the GetClientCertificate
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetClientCertificate
     */
    java.util.concurrent.Future<GetClientCertificateResult> getClientCertificateAsync(
            GetClientCertificateRequest getClientCertificateRequest);

    /**
     * @param getClientCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetClientCertificate
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetClientCertificate
     */
    java.util.concurrent.Future<GetClientCertificateResult> getClientCertificateAsync(
            GetClientCertificateRequest getClientCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<GetClientCertificateRequest, GetClientCertificateResult> asyncHandler);

    /**
     * @param getClientCertificatesRequest
     * @return A Java Future containing the result of the GetClientCertificates
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetClientCertificates
     */
    java.util.concurrent.Future<GetClientCertificatesResult> getClientCertificatesAsync(
            GetClientCertificatesRequest getClientCertificatesRequest);

    /**
     * @param getClientCertificatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetClientCertificates
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetClientCertificates
     */
    java.util.concurrent.Future<GetClientCertificatesResult> getClientCertificatesAsync(
            GetClientCertificatesRequest getClientCertificatesRequest,
            com.amazonaws.handlers.AsyncHandler<GetClientCertificatesRequest, GetClientCertificatesResult> asyncHandler);

    /**
     * <p>
     * Gets information about a <a>Deployment</a> resource.
     * </p>
     * 
     * @param getDeploymentRequest
     *        Requests Amazon API Gateway to get information about a
     *        <a>Deployment</a> resource.
     * @return A Java Future containing the result of the GetDeployment
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetDeployment
     */
    java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(
            GetDeploymentRequest getDeploymentRequest);

    /**
     * <p>
     * Gets information about a <a>Deployment</a> resource.
     * </p>
     * 
     * @param getDeploymentRequest
     *        Requests Amazon API Gateway to get information about a
     *        <a>Deployment</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDeployment
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetDeployment
     */
    java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(
            GetDeploymentRequest getDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeploymentRequest, GetDeploymentResult> asyncHandler);

    /**
     * <p>
     * Gets information about a <a>Deployments</a> collection.
     * </p>
     * 
     * @param getDeploymentsRequest
     *        Requests Amazon API Gateway to get information about a
     *        <a>Deployments</a> collection.
     * @return A Java Future containing the result of the GetDeployments
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetDeployments
     */
    java.util.concurrent.Future<GetDeploymentsResult> getDeploymentsAsync(
            GetDeploymentsRequest getDeploymentsRequest);

    /**
     * <p>
     * Gets information about a <a>Deployments</a> collection.
     * </p>
     * 
     * @param getDeploymentsRequest
     *        Requests Amazon API Gateway to get information about a
     *        <a>Deployments</a> collection.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDeployments
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetDeployments
     */
    java.util.concurrent.Future<GetDeploymentsResult> getDeploymentsAsync(
            GetDeploymentsRequest getDeploymentsRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeploymentsRequest, GetDeploymentsResult> asyncHandler);

    /**
     * <p>
     * Represents a domain name that is contained in a simpler, more intuitive
     * URL that can be called.
     * </p>
     * 
     * @param getDomainNameRequest
     *        Request to get the name of a <a>DomainName</a> resource.
     * @return A Java Future containing the result of the GetDomainName
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetDomainName
     */
    java.util.concurrent.Future<GetDomainNameResult> getDomainNameAsync(
            GetDomainNameRequest getDomainNameRequest);

    /**
     * <p>
     * Represents a domain name that is contained in a simpler, more intuitive
     * URL that can be called.
     * </p>
     * 
     * @param getDomainNameRequest
     *        Request to get the name of a <a>DomainName</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDomainName
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetDomainName
     */
    java.util.concurrent.Future<GetDomainNameResult> getDomainNameAsync(
            GetDomainNameRequest getDomainNameRequest,
            com.amazonaws.handlers.AsyncHandler<GetDomainNameRequest, GetDomainNameResult> asyncHandler);

    /**
     * <p>
     * Represents a collection of <a>DomainName</a> resources.
     * </p>
     * 
     * @param getDomainNamesRequest
     *        Request to describe a collection of <a>DomainName</a> resources.
     * @return A Java Future containing the result of the GetDomainNames
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetDomainNames
     */
    java.util.concurrent.Future<GetDomainNamesResult> getDomainNamesAsync(
            GetDomainNamesRequest getDomainNamesRequest);

    /**
     * <p>
     * Represents a collection of <a>DomainName</a> resources.
     * </p>
     * 
     * @param getDomainNamesRequest
     *        Request to describe a collection of <a>DomainName</a> resources.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDomainNames
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetDomainNames
     */
    java.util.concurrent.Future<GetDomainNamesResult> getDomainNamesAsync(
            GetDomainNamesRequest getDomainNamesRequest,
            com.amazonaws.handlers.AsyncHandler<GetDomainNamesRequest, GetDomainNamesResult> asyncHandler);

    /**
     * <p>
     * Represents a get integration.
     * </p>
     * 
     * @param getIntegrationRequest
     *        Represents a get integration request.
     * @return A Java Future containing the result of the GetIntegration
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetIntegration
     */
    java.util.concurrent.Future<GetIntegrationResult> getIntegrationAsync(
            GetIntegrationRequest getIntegrationRequest);

    /**
     * <p>
     * Represents a get integration.
     * </p>
     * 
     * @param getIntegrationRequest
     *        Represents a get integration request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIntegration
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetIntegration
     */
    java.util.concurrent.Future<GetIntegrationResult> getIntegrationAsync(
            GetIntegrationRequest getIntegrationRequest,
            com.amazonaws.handlers.AsyncHandler<GetIntegrationRequest, GetIntegrationResult> asyncHandler);

    /**
     * <p>
     * Represents a get integration response.
     * </p>
     * 
     * @param getIntegrationResponseRequest
     *        Represents a get integration response request.
     * @return A Java Future containing the result of the GetIntegrationResponse
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetIntegrationResponse
     */
    java.util.concurrent.Future<GetIntegrationResponseResult> getIntegrationResponseAsync(
            GetIntegrationResponseRequest getIntegrationResponseRequest);

    /**
     * <p>
     * Represents a get integration response.
     * </p>
     * 
     * @param getIntegrationResponseRequest
     *        Represents a get integration response request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIntegrationResponse
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetIntegrationResponse
     */
    java.util.concurrent.Future<GetIntegrationResponseResult> getIntegrationResponseAsync(
            GetIntegrationResponseRequest getIntegrationResponseRequest,
            com.amazonaws.handlers.AsyncHandler<GetIntegrationResponseRequest, GetIntegrationResponseResult> asyncHandler);

    /**
     * <p>
     * Describe an existing <a>Method</a> resource.
     * </p>
     * 
     * @param getMethodRequest
     *        Request to describe an existing <a>Method</a> resource.
     * @return A Java Future containing the result of the GetMethod operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsync.GetMethod
     */
    java.util.concurrent.Future<GetMethodResult> getMethodAsync(
            GetMethodRequest getMethodRequest);

    /**
     * <p>
     * Describe an existing <a>Method</a> resource.
     * </p>
     * 
     * @param getMethodRequest
     *        Request to describe an existing <a>Method</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMethod operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetMethod
     */
    java.util.concurrent.Future<GetMethodResult> getMethodAsync(
            GetMethodRequest getMethodRequest,
            com.amazonaws.handlers.AsyncHandler<GetMethodRequest, GetMethodResult> asyncHandler);

    /**
     * <p>
     * Describes a <a>MethodResponse</a> resource.
     * </p>
     * 
     * @param getMethodResponseRequest
     *        Request to describe a <a>MethodResponse</a> resource.
     * @return A Java Future containing the result of the GetMethodResponse
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetMethodResponse
     */
    java.util.concurrent.Future<GetMethodResponseResult> getMethodResponseAsync(
            GetMethodResponseRequest getMethodResponseRequest);

    /**
     * <p>
     * Describes a <a>MethodResponse</a> resource.
     * </p>
     * 
     * @param getMethodResponseRequest
     *        Request to describe a <a>MethodResponse</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMethodResponse
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetMethodResponse
     */
    java.util.concurrent.Future<GetMethodResponseResult> getMethodResponseAsync(
            GetMethodResponseRequest getMethodResponseRequest,
            com.amazonaws.handlers.AsyncHandler<GetMethodResponseRequest, GetMethodResponseResult> asyncHandler);

    /**
     * <p>
     * Describes an existing model defined for a <a>RestApi</a> resource.
     * </p>
     * 
     * @param getModelRequest
     *        Request to list information about a model in an existing
     *        <a>RestApi</a> resource.
     * @return A Java Future containing the result of the GetModel operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsync.GetModel
     */
    java.util.concurrent.Future<GetModelResult> getModelAsync(
            GetModelRequest getModelRequest);

    /**
     * <p>
     * Describes an existing model defined for a <a>RestApi</a> resource.
     * </p>
     * 
     * @param getModelRequest
     *        Request to list information about a model in an existing
     *        <a>RestApi</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetModel operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetModel
     */
    java.util.concurrent.Future<GetModelResult> getModelAsync(
            GetModelRequest getModelRequest,
            com.amazonaws.handlers.AsyncHandler<GetModelRequest, GetModelResult> asyncHandler);

    /**
     * <p>
     * Generates a sample mapping template that can be used to transform a
     * payload into the structure of a model.
     * </p>
     * 
     * @param getModelTemplateRequest
     *        Request to generate a sample mapping template used to transform
     *        the payload.
     * @return A Java Future containing the result of the GetModelTemplate
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsync.GetModelTemplate
     */
    java.util.concurrent.Future<GetModelTemplateResult> getModelTemplateAsync(
            GetModelTemplateRequest getModelTemplateRequest);

    /**
     * <p>
     * Generates a sample mapping template that can be used to transform a
     * payload into the structure of a model.
     * </p>
     * 
     * @param getModelTemplateRequest
     *        Request to generate a sample mapping template used to transform
     *        the payload.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetModelTemplate
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetModelTemplate
     */
    java.util.concurrent.Future<GetModelTemplateResult> getModelTemplateAsync(
            GetModelTemplateRequest getModelTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<GetModelTemplateRequest, GetModelTemplateResult> asyncHandler);

    /**
     * <p>
     * Describes existing <a>Models</a> defined for a <a>RestApi</a> resource.
     * </p>
     * 
     * @param getModelsRequest
     *        Request to list existing <a>Models</a> defined for a
     *        <a>RestApi</a> resource.
     * @return A Java Future containing the result of the GetModels operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsync.GetModels
     */
    java.util.concurrent.Future<GetModelsResult> getModelsAsync(
            GetModelsRequest getModelsRequest);

    /**
     * <p>
     * Describes existing <a>Models</a> defined for a <a>RestApi</a> resource.
     * </p>
     * 
     * @param getModelsRequest
     *        Request to list existing <a>Models</a> defined for a
     *        <a>RestApi</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetModels operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetModels
     */
    java.util.concurrent.Future<GetModelsResult> getModelsAsync(
            GetModelsRequest getModelsRequest,
            com.amazonaws.handlers.AsyncHandler<GetModelsRequest, GetModelsResult> asyncHandler);

    /**
     * <p>
     * Lists information about a resource.
     * </p>
     * 
     * @param getResourceRequest
     *        Request to list information about a resource.
     * @return A Java Future containing the result of the GetResource operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsync.GetResource
     */
    java.util.concurrent.Future<GetResourceResult> getResourceAsync(
            GetResourceRequest getResourceRequest);

    /**
     * <p>
     * Lists information about a resource.
     * </p>
     * 
     * @param getResourceRequest
     *        Request to list information about a resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResource operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetResource
     */
    java.util.concurrent.Future<GetResourceResult> getResourceAsync(
            GetResourceRequest getResourceRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourceRequest, GetResourceResult> asyncHandler);

    /**
     * <p>
     * Lists information about a collection of <a>Resource</a> resources.
     * </p>
     * 
     * @param getResourcesRequest
     *        Request to list information about a collection of resources.
     * @return A Java Future containing the result of the GetResources operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsync.GetResources
     */
    java.util.concurrent.Future<GetResourcesResult> getResourcesAsync(
            GetResourcesRequest getResourcesRequest);

    /**
     * <p>
     * Lists information about a collection of <a>Resource</a> resources.
     * </p>
     * 
     * @param getResourcesRequest
     *        Request to list information about a collection of resources.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResources operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetResources
     */
    java.util.concurrent.Future<GetResourcesResult> getResourcesAsync(
            GetResourcesRequest getResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourcesRequest, GetResourcesResult> asyncHandler);

    /**
     * <p>
     * Lists the <a>RestApi</a> resource in the collection.
     * </p>
     * 
     * @param getRestApiRequest
     *        Request to list an existing <a>RestApi</a> defined for your
     *        collection.
     * @return A Java Future containing the result of the GetRestApi operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsync.GetRestApi
     */
    java.util.concurrent.Future<GetRestApiResult> getRestApiAsync(
            GetRestApiRequest getRestApiRequest);

    /**
     * <p>
     * Lists the <a>RestApi</a> resource in the collection.
     * </p>
     * 
     * @param getRestApiRequest
     *        Request to list an existing <a>RestApi</a> defined for your
     *        collection.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRestApi operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetRestApi
     */
    java.util.concurrent.Future<GetRestApiResult> getRestApiAsync(
            GetRestApiRequest getRestApiRequest,
            com.amazonaws.handlers.AsyncHandler<GetRestApiRequest, GetRestApiResult> asyncHandler);

    /**
     * <p>
     * Lists the <a>RestApis</a> resources for your collection.
     * </p>
     * 
     * @param getRestApisRequest
     *        Request to list existing <a>RestApis</a> defined for your
     *        collection.
     * @return A Java Future containing the result of the GetRestApis operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsync.GetRestApis
     */
    java.util.concurrent.Future<GetRestApisResult> getRestApisAsync(
            GetRestApisRequest getRestApisRequest);

    /**
     * <p>
     * Lists the <a>RestApis</a> resources for your collection.
     * </p>
     * 
     * @param getRestApisRequest
     *        Request to list existing <a>RestApis</a> defined for your
     *        collection.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRestApis operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetRestApis
     */
    java.util.concurrent.Future<GetRestApisResult> getRestApisAsync(
            GetRestApisRequest getRestApisRequest,
            com.amazonaws.handlers.AsyncHandler<GetRestApisRequest, GetRestApisResult> asyncHandler);

    /**
     * @param getSdkRequest
     * @return A Java Future containing the result of the GetSdk operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsync.GetSdk
     */
    java.util.concurrent.Future<GetSdkResult> getSdkAsync(
            GetSdkRequest getSdkRequest);

    /**
     * @param getSdkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSdk operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetSdk
     */
    java.util.concurrent.Future<GetSdkResult> getSdkAsync(
            GetSdkRequest getSdkRequest,
            com.amazonaws.handlers.AsyncHandler<GetSdkRequest, GetSdkResult> asyncHandler);

    /**
     * <p>
     * Gets information about a <a>Stage</a> resource.
     * </p>
     * 
     * @param getStageRequest
     *        Requests Amazon API Gateway to get information about a
     *        <a>Stage</a> resource.
     * @return A Java Future containing the result of the GetStage operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsync.GetStage
     */
    java.util.concurrent.Future<GetStageResult> getStageAsync(
            GetStageRequest getStageRequest);

    /**
     * <p>
     * Gets information about a <a>Stage</a> resource.
     * </p>
     * 
     * @param getStageRequest
     *        Requests Amazon API Gateway to get information about a
     *        <a>Stage</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStage operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetStage
     */
    java.util.concurrent.Future<GetStageResult> getStageAsync(
            GetStageRequest getStageRequest,
            com.amazonaws.handlers.AsyncHandler<GetStageRequest, GetStageResult> asyncHandler);

    /**
     * <p>
     * Gets information about one or more <a>Stage</a> resources.
     * </p>
     * 
     * @param getStagesRequest
     *        Requests Amazon API Gateway to get information about one or more
     *        <a>Stage</a> resources.
     * @return A Java Future containing the result of the GetStages operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsync.GetStages
     */
    java.util.concurrent.Future<GetStagesResult> getStagesAsync(
            GetStagesRequest getStagesRequest);

    /**
     * <p>
     * Gets information about one or more <a>Stage</a> resources.
     * </p>
     * 
     * @param getStagesRequest
     *        Requests Amazon API Gateway to get information about one or more
     *        <a>Stage</a> resources.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStages operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.GetStages
     */
    java.util.concurrent.Future<GetStagesResult> getStagesAsync(
            GetStagesRequest getStagesRequest,
            com.amazonaws.handlers.AsyncHandler<GetStagesRequest, GetStagesResult> asyncHandler);

    /**
     * <p>
     * Represents a put integration.
     * </p>
     * 
     * @param putIntegrationRequest
     *        Represents a put integration request.
     * @return A Java Future containing the result of the PutIntegration
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsync.PutIntegration
     */
    java.util.concurrent.Future<PutIntegrationResult> putIntegrationAsync(
            PutIntegrationRequest putIntegrationRequest);

    /**
     * <p>
     * Represents a put integration.
     * </p>
     * 
     * @param putIntegrationRequest
     *        Represents a put integration request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutIntegration
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.PutIntegration
     */
    java.util.concurrent.Future<PutIntegrationResult> putIntegrationAsync(
            PutIntegrationRequest putIntegrationRequest,
            com.amazonaws.handlers.AsyncHandler<PutIntegrationRequest, PutIntegrationResult> asyncHandler);

    /**
     * <p>
     * Represents a put integration.
     * </p>
     * 
     * @param putIntegrationResponseRequest
     *        Represents a put integration response request.
     * @return A Java Future containing the result of the PutIntegrationResponse
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsync.PutIntegrationResponse
     */
    java.util.concurrent.Future<PutIntegrationResponseResult> putIntegrationResponseAsync(
            PutIntegrationResponseRequest putIntegrationResponseRequest);

    /**
     * <p>
     * Represents a put integration.
     * </p>
     * 
     * @param putIntegrationResponseRequest
     *        Represents a put integration response request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutIntegrationResponse
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.PutIntegrationResponse
     */
    java.util.concurrent.Future<PutIntegrationResponseResult> putIntegrationResponseAsync(
            PutIntegrationResponseRequest putIntegrationResponseRequest,
            com.amazonaws.handlers.AsyncHandler<PutIntegrationResponseRequest, PutIntegrationResponseResult> asyncHandler);

    /**
     * <p>
     * Add a method to an existing <a>Resource</a> resource.
     * </p>
     * 
     * @param putMethodRequest
     *        Request to add a method to an existing <a>Resource</a> resource.
     * @return A Java Future containing the result of the PutMethod operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsync.PutMethod
     */
    java.util.concurrent.Future<PutMethodResult> putMethodAsync(
            PutMethodRequest putMethodRequest);

    /**
     * <p>
     * Add a method to an existing <a>Resource</a> resource.
     * </p>
     * 
     * @param putMethodRequest
     *        Request to add a method to an existing <a>Resource</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutMethod operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.PutMethod
     */
    java.util.concurrent.Future<PutMethodResult> putMethodAsync(
            PutMethodRequest putMethodRequest,
            com.amazonaws.handlers.AsyncHandler<PutMethodRequest, PutMethodResult> asyncHandler);

    /**
     * <p>
     * Adds a <a>MethodResponse</a> to an existing <a>Method</a> resource.
     * </p>
     * 
     * @param putMethodResponseRequest
     *        Request to add a <a>MethodResponse</a> to an existing
     *        <a>Method</a> resource.
     * @return A Java Future containing the result of the PutMethodResponse
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsync.PutMethodResponse
     */
    java.util.concurrent.Future<PutMethodResponseResult> putMethodResponseAsync(
            PutMethodResponseRequest putMethodResponseRequest);

    /**
     * <p>
     * Adds a <a>MethodResponse</a> to an existing <a>Method</a> resource.
     * </p>
     * 
     * @param putMethodResponseRequest
     *        Request to add a <a>MethodResponse</a> to an existing
     *        <a>Method</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutMethodResponse
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.PutMethodResponse
     */
    java.util.concurrent.Future<PutMethodResponseResult> putMethodResponseAsync(
            PutMethodResponseRequest putMethodResponseRequest,
            com.amazonaws.handlers.AsyncHandler<PutMethodResponseRequest, PutMethodResponseResult> asyncHandler);

    /**
     * @param testInvokeMethodRequest
     * @return A Java Future containing the result of the TestInvokeMethod
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsync.TestInvokeMethod
     */
    java.util.concurrent.Future<TestInvokeMethodResult> testInvokeMethodAsync(
            TestInvokeMethodRequest testInvokeMethodRequest);

    /**
     * @param testInvokeMethodRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TestInvokeMethod
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.TestInvokeMethod
     */
    java.util.concurrent.Future<TestInvokeMethodResult> testInvokeMethodAsync(
            TestInvokeMethodRequest testInvokeMethodRequest,
            com.amazonaws.handlers.AsyncHandler<TestInvokeMethodRequest, TestInvokeMethodResult> asyncHandler);

    /**
     * <p>
     * Changes information about the current <a>Account</a> resource.
     * </p>
     * 
     * @param updateAccountRequest
     *        Requests Amazon API Gateway to change information about the
     *        current <a>Account</a> resource.
     * @return A Java Future containing the result of the UpdateAccount
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsync.UpdateAccount
     */
    java.util.concurrent.Future<UpdateAccountResult> updateAccountAsync(
            UpdateAccountRequest updateAccountRequest);

    /**
     * <p>
     * Changes information about the current <a>Account</a> resource.
     * </p>
     * 
     * @param updateAccountRequest
     *        Requests Amazon API Gateway to change information about the
     *        current <a>Account</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAccount
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.UpdateAccount
     */
    java.util.concurrent.Future<UpdateAccountResult> updateAccountAsync(
            UpdateAccountRequest updateAccountRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAccountRequest, UpdateAccountResult> asyncHandler);

    /**
     * <p>
     * Changes information about an <a>ApiKey</a> resource.
     * </p>
     * 
     * @param updateApiKeyRequest
     *        A request to change information about an <a>ApiKey</a> resource.
     * @return A Java Future containing the result of the UpdateApiKey operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsync.UpdateApiKey
     */
    java.util.concurrent.Future<UpdateApiKeyResult> updateApiKeyAsync(
            UpdateApiKeyRequest updateApiKeyRequest);

    /**
     * <p>
     * Changes information about an <a>ApiKey</a> resource.
     * </p>
     * 
     * @param updateApiKeyRequest
     *        A request to change information about an <a>ApiKey</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApiKey operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.UpdateApiKey
     */
    java.util.concurrent.Future<UpdateApiKeyResult> updateApiKeyAsync(
            UpdateApiKeyRequest updateApiKeyRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApiKeyRequest, UpdateApiKeyResult> asyncHandler);

    /**
     * <p>
     * Changes information about the <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param updateBasePathMappingRequest
     *        A request to change information about the <a>BasePathMapping</a>
     *        resource.
     * @return A Java Future containing the result of the UpdateBasePathMapping
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsync.UpdateBasePathMapping
     */
    java.util.concurrent.Future<UpdateBasePathMappingResult> updateBasePathMappingAsync(
            UpdateBasePathMappingRequest updateBasePathMappingRequest);

    /**
     * <p>
     * Changes information about the <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param updateBasePathMappingRequest
     *        A request to change information about the <a>BasePathMapping</a>
     *        resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateBasePathMapping
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.UpdateBasePathMapping
     */
    java.util.concurrent.Future<UpdateBasePathMappingResult> updateBasePathMappingAsync(
            UpdateBasePathMappingRequest updateBasePathMappingRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateBasePathMappingRequest, UpdateBasePathMappingResult> asyncHandler);

    /**
     * @param updateClientCertificateRequest
     * @return A Java Future containing the result of the
     *         UpdateClientCertificate operation returned by the service.
     * @sample AmazonApiGatewayAsync.UpdateClientCertificate
     */
    java.util.concurrent.Future<UpdateClientCertificateResult> updateClientCertificateAsync(
            UpdateClientCertificateRequest updateClientCertificateRequest);

    /**
     * @param updateClientCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         UpdateClientCertificate operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.UpdateClientCertificate
     */
    java.util.concurrent.Future<UpdateClientCertificateResult> updateClientCertificateAsync(
            UpdateClientCertificateRequest updateClientCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateClientCertificateRequest, UpdateClientCertificateResult> asyncHandler);

    /**
     * <p>
     * Changes information about a <a>Deployment</a> resource.
     * </p>
     * 
     * @param updateDeploymentRequest
     *        Requests Amazon API Gateway to change information about a
     *        <a>Deployment</a> resource.
     * @return A Java Future containing the result of the UpdateDeployment
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsync.UpdateDeployment
     */
    java.util.concurrent.Future<UpdateDeploymentResult> updateDeploymentAsync(
            UpdateDeploymentRequest updateDeploymentRequest);

    /**
     * <p>
     * Changes information about a <a>Deployment</a> resource.
     * </p>
     * 
     * @param updateDeploymentRequest
     *        Requests Amazon API Gateway to change information about a
     *        <a>Deployment</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDeployment
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.UpdateDeployment
     */
    java.util.concurrent.Future<UpdateDeploymentResult> updateDeploymentAsync(
            UpdateDeploymentRequest updateDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDeploymentRequest, UpdateDeploymentResult> asyncHandler);

    /**
     * <p>
     * Changes information about the <a>DomainName</a> resource.
     * </p>
     * 
     * @param updateDomainNameRequest
     *        A request to change information about the <a>DomainName</a>
     *        resource.
     * @return A Java Future containing the result of the UpdateDomainName
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsync.UpdateDomainName
     */
    java.util.concurrent.Future<UpdateDomainNameResult> updateDomainNameAsync(
            UpdateDomainNameRequest updateDomainNameRequest);

    /**
     * <p>
     * Changes information about the <a>DomainName</a> resource.
     * </p>
     * 
     * @param updateDomainNameRequest
     *        A request to change information about the <a>DomainName</a>
     *        resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDomainName
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.UpdateDomainName
     */
    java.util.concurrent.Future<UpdateDomainNameResult> updateDomainNameAsync(
            UpdateDomainNameRequest updateDomainNameRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDomainNameRequest, UpdateDomainNameResult> asyncHandler);

    /**
     * <p>
     * Represents an update integration.
     * </p>
     * 
     * @param updateIntegrationRequest
     *        Represents an update integration request.
     * @return A Java Future containing the result of the UpdateIntegration
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsync.UpdateIntegration
     */
    java.util.concurrent.Future<UpdateIntegrationResult> updateIntegrationAsync(
            UpdateIntegrationRequest updateIntegrationRequest);

    /**
     * <p>
     * Represents an update integration.
     * </p>
     * 
     * @param updateIntegrationRequest
     *        Represents an update integration request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateIntegration
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.UpdateIntegration
     */
    java.util.concurrent.Future<UpdateIntegrationResult> updateIntegrationAsync(
            UpdateIntegrationRequest updateIntegrationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateIntegrationRequest, UpdateIntegrationResult> asyncHandler);

    /**
     * <p>
     * Represents an update integration response.
     * </p>
     * 
     * @param updateIntegrationResponseRequest
     *        Represents an update integration response request.
     * @return A Java Future containing the result of the
     *         UpdateIntegrationResponse operation returned by the service.
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
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         UpdateIntegrationResponse operation returned by the service.
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
     * @return A Java Future containing the result of the UpdateMethod operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsync.UpdateMethod
     */
    java.util.concurrent.Future<UpdateMethodResult> updateMethodAsync(
            UpdateMethodRequest updateMethodRequest);

    /**
     * <p>
     * Updates an existing <a>Method</a> resource.
     * </p>
     * 
     * @param updateMethodRequest
     *        Request to update an existing <a>Method</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMethod operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.UpdateMethod
     */
    java.util.concurrent.Future<UpdateMethodResult> updateMethodAsync(
            UpdateMethodRequest updateMethodRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMethodRequest, UpdateMethodResult> asyncHandler);

    /**
     * <p>
     * Updates an existing <a>MethodResponse</a> resource.
     * </p>
     * 
     * @param updateMethodResponseRequest
     *        A request to update an existing <a>MethodResponse</a> resource.
     * @return A Java Future containing the result of the UpdateMethodResponse
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsync.UpdateMethodResponse
     */
    java.util.concurrent.Future<UpdateMethodResponseResult> updateMethodResponseAsync(
            UpdateMethodResponseRequest updateMethodResponseRequest);

    /**
     * <p>
     * Updates an existing <a>MethodResponse</a> resource.
     * </p>
     * 
     * @param updateMethodResponseRequest
     *        A request to update an existing <a>MethodResponse</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMethodResponse
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.UpdateMethodResponse
     */
    java.util.concurrent.Future<UpdateMethodResponseResult> updateMethodResponseAsync(
            UpdateMethodResponseRequest updateMethodResponseRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMethodResponseRequest, UpdateMethodResponseResult> asyncHandler);

    /**
     * <p>
     * Changes information about a model.
     * </p>
     * 
     * @param updateModelRequest
     *        Request to update an existing model in an existing <a>RestApi</a>
     *        resource.
     * @return A Java Future containing the result of the UpdateModel operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsync.UpdateModel
     */
    java.util.concurrent.Future<UpdateModelResult> updateModelAsync(
            UpdateModelRequest updateModelRequest);

    /**
     * <p>
     * Changes information about a model.
     * </p>
     * 
     * @param updateModelRequest
     *        Request to update an existing model in an existing <a>RestApi</a>
     *        resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateModel operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.UpdateModel
     */
    java.util.concurrent.Future<UpdateModelResult> updateModelAsync(
            UpdateModelRequest updateModelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateModelRequest, UpdateModelResult> asyncHandler);

    /**
     * <p>
     * Changes information about a <a>Resource</a> resource.
     * </p>
     * 
     * @param updateResourceRequest
     *        Request to change information about a <a>Resource</a> resource.
     * @return A Java Future containing the result of the UpdateResource
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsync.UpdateResource
     */
    java.util.concurrent.Future<UpdateResourceResult> updateResourceAsync(
            UpdateResourceRequest updateResourceRequest);

    /**
     * <p>
     * Changes information about a <a>Resource</a> resource.
     * </p>
     * 
     * @param updateResourceRequest
     *        Request to change information about a <a>Resource</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateResource
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.UpdateResource
     */
    java.util.concurrent.Future<UpdateResourceResult> updateResourceAsync(
            UpdateResourceRequest updateResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateResourceRequest, UpdateResourceResult> asyncHandler);

    /**
     * <p>
     * Changes information about the specified API.
     * </p>
     * 
     * @param updateRestApiRequest
     *        Request to update an existing <a>RestApi</a> resource in your
     *        collection.
     * @return A Java Future containing the result of the UpdateRestApi
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsync.UpdateRestApi
     */
    java.util.concurrent.Future<UpdateRestApiResult> updateRestApiAsync(
            UpdateRestApiRequest updateRestApiRequest);

    /**
     * <p>
     * Changes information about the specified API.
     * </p>
     * 
     * @param updateRestApiRequest
     *        Request to update an existing <a>RestApi</a> resource in your
     *        collection.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRestApi
     *         operation returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.UpdateRestApi
     */
    java.util.concurrent.Future<UpdateRestApiResult> updateRestApiAsync(
            UpdateRestApiRequest updateRestApiRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRestApiRequest, UpdateRestApiResult> asyncHandler);

    /**
     * <p>
     * Changes information about a <a>Stage</a> resource.
     * </p>
     * 
     * @param updateStageRequest
     *        Requests Amazon API Gateway to change information about a
     *        <a>Stage</a> resource.
     * @return A Java Future containing the result of the UpdateStage operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsync.UpdateStage
     */
    java.util.concurrent.Future<UpdateStageResult> updateStageAsync(
            UpdateStageRequest updateStageRequest);

    /**
     * <p>
     * Changes information about a <a>Stage</a> resource.
     * </p>
     * 
     * @param updateStageRequest
     *        Requests Amazon API Gateway to change information about a
     *        <a>Stage</a> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateStage operation
     *         returned by the service.
     * @sample AmazonApiGatewayAsyncHandler.UpdateStage
     */
    java.util.concurrent.Future<UpdateStageResult> updateStageAsync(
            UpdateStageRequest updateStageRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateStageRequest, UpdateStageResult> asyncHandler);

}
