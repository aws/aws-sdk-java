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
package com.amazonaws.services.apigatewayv2;

import javax.annotation.Generated;

import com.amazonaws.services.apigatewayv2.model.*;

/**
 * Interface for accessing AmazonApiGatewayV2 asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.apigatewayv2.AbstractAmazonApiGatewayV2Async} instead.
 * </p>
 * <p>
 * <p>
 * Amazon API Gateway V2
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonApiGatewayV2Async extends AmazonApiGatewayV2 {

    /**
     * <p>
     * Creates an Api resource.
     * </p>
     * 
     * @param createApiRequest
     * @return A Java Future containing the result of the CreateApi operation returned by the service.
     * @sample AmazonApiGatewayV2Async.CreateApi
     */
    java.util.concurrent.Future<CreateApiResult> createApiAsync(CreateApiRequest createApiRequest);

    /**
     * <p>
     * Creates an Api resource.
     * </p>
     * 
     * @param createApiRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateApi operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.CreateApi
     */
    java.util.concurrent.Future<CreateApiResult> createApiAsync(CreateApiRequest createApiRequest,
            com.amazonaws.handlers.AsyncHandler<CreateApiRequest, CreateApiResult> asyncHandler);

    /**
     * <p>
     * Creates an API mapping.
     * </p>
     * 
     * @param createApiMappingRequest
     * @return A Java Future containing the result of the CreateApiMapping operation returned by the service.
     * @sample AmazonApiGatewayV2Async.CreateApiMapping
     */
    java.util.concurrent.Future<CreateApiMappingResult> createApiMappingAsync(CreateApiMappingRequest createApiMappingRequest);

    /**
     * <p>
     * Creates an API mapping.
     * </p>
     * 
     * @param createApiMappingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateApiMapping operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.CreateApiMapping
     */
    java.util.concurrent.Future<CreateApiMappingResult> createApiMappingAsync(CreateApiMappingRequest createApiMappingRequest,
            com.amazonaws.handlers.AsyncHandler<CreateApiMappingRequest, CreateApiMappingResult> asyncHandler);

    /**
     * <p>
     * Creates an Authorizer for an API.
     * </p>
     * 
     * @param createAuthorizerRequest
     * @return A Java Future containing the result of the CreateAuthorizer operation returned by the service.
     * @sample AmazonApiGatewayV2Async.CreateAuthorizer
     */
    java.util.concurrent.Future<CreateAuthorizerResult> createAuthorizerAsync(CreateAuthorizerRequest createAuthorizerRequest);

    /**
     * <p>
     * Creates an Authorizer for an API.
     * </p>
     * 
     * @param createAuthorizerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAuthorizer operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.CreateAuthorizer
     */
    java.util.concurrent.Future<CreateAuthorizerResult> createAuthorizerAsync(CreateAuthorizerRequest createAuthorizerRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAuthorizerRequest, CreateAuthorizerResult> asyncHandler);

    /**
     * <p>
     * Creates a Deployment for an API.
     * </p>
     * 
     * @param createDeploymentRequest
     * @return A Java Future containing the result of the CreateDeployment operation returned by the service.
     * @sample AmazonApiGatewayV2Async.CreateDeployment
     */
    java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest createDeploymentRequest);

    /**
     * <p>
     * Creates a Deployment for an API.
     * </p>
     * 
     * @param createDeploymentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDeployment operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.CreateDeployment
     */
    java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest createDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDeploymentRequest, CreateDeploymentResult> asyncHandler);

    /**
     * <p>
     * Creates a domain name.
     * </p>
     * 
     * @param createDomainNameRequest
     * @return A Java Future containing the result of the CreateDomainName operation returned by the service.
     * @sample AmazonApiGatewayV2Async.CreateDomainName
     */
    java.util.concurrent.Future<CreateDomainNameResult> createDomainNameAsync(CreateDomainNameRequest createDomainNameRequest);

    /**
     * <p>
     * Creates a domain name.
     * </p>
     * 
     * @param createDomainNameRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDomainName operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.CreateDomainName
     */
    java.util.concurrent.Future<CreateDomainNameResult> createDomainNameAsync(CreateDomainNameRequest createDomainNameRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDomainNameRequest, CreateDomainNameResult> asyncHandler);

    /**
     * <p>
     * Creates an Integration.
     * </p>
     * 
     * @param createIntegrationRequest
     * @return A Java Future containing the result of the CreateIntegration operation returned by the service.
     * @sample AmazonApiGatewayV2Async.CreateIntegration
     */
    java.util.concurrent.Future<CreateIntegrationResult> createIntegrationAsync(CreateIntegrationRequest createIntegrationRequest);

    /**
     * <p>
     * Creates an Integration.
     * </p>
     * 
     * @param createIntegrationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateIntegration operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.CreateIntegration
     */
    java.util.concurrent.Future<CreateIntegrationResult> createIntegrationAsync(CreateIntegrationRequest createIntegrationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateIntegrationRequest, CreateIntegrationResult> asyncHandler);

    /**
     * <p>
     * Creates an IntegrationResponses.
     * </p>
     * 
     * @param createIntegrationResponseRequest
     * @return A Java Future containing the result of the CreateIntegrationResponse operation returned by the service.
     * @sample AmazonApiGatewayV2Async.CreateIntegrationResponse
     */
    java.util.concurrent.Future<CreateIntegrationResponseResult> createIntegrationResponseAsync(
            CreateIntegrationResponseRequest createIntegrationResponseRequest);

    /**
     * <p>
     * Creates an IntegrationResponses.
     * </p>
     * 
     * @param createIntegrationResponseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateIntegrationResponse operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.CreateIntegrationResponse
     */
    java.util.concurrent.Future<CreateIntegrationResponseResult> createIntegrationResponseAsync(
            CreateIntegrationResponseRequest createIntegrationResponseRequest,
            com.amazonaws.handlers.AsyncHandler<CreateIntegrationResponseRequest, CreateIntegrationResponseResult> asyncHandler);

    /**
     * <p>
     * Creates a Model for an API.
     * </p>
     * 
     * @param createModelRequest
     * @return A Java Future containing the result of the CreateModel operation returned by the service.
     * @sample AmazonApiGatewayV2Async.CreateModel
     */
    java.util.concurrent.Future<CreateModelResult> createModelAsync(CreateModelRequest createModelRequest);

    /**
     * <p>
     * Creates a Model for an API.
     * </p>
     * 
     * @param createModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateModel operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.CreateModel
     */
    java.util.concurrent.Future<CreateModelResult> createModelAsync(CreateModelRequest createModelRequest,
            com.amazonaws.handlers.AsyncHandler<CreateModelRequest, CreateModelResult> asyncHandler);

    /**
     * <p>
     * Creates a Route for an API.
     * </p>
     * 
     * @param createRouteRequest
     * @return A Java Future containing the result of the CreateRoute operation returned by the service.
     * @sample AmazonApiGatewayV2Async.CreateRoute
     */
    java.util.concurrent.Future<CreateRouteResult> createRouteAsync(CreateRouteRequest createRouteRequest);

    /**
     * <p>
     * Creates a Route for an API.
     * </p>
     * 
     * @param createRouteRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRoute operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.CreateRoute
     */
    java.util.concurrent.Future<CreateRouteResult> createRouteAsync(CreateRouteRequest createRouteRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRouteRequest, CreateRouteResult> asyncHandler);

    /**
     * <p>
     * Creates a RouteResponse for a Route.
     * </p>
     * 
     * @param createRouteResponseRequest
     * @return A Java Future containing the result of the CreateRouteResponse operation returned by the service.
     * @sample AmazonApiGatewayV2Async.CreateRouteResponse
     */
    java.util.concurrent.Future<CreateRouteResponseResult> createRouteResponseAsync(CreateRouteResponseRequest createRouteResponseRequest);

    /**
     * <p>
     * Creates a RouteResponse for a Route.
     * </p>
     * 
     * @param createRouteResponseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRouteResponse operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.CreateRouteResponse
     */
    java.util.concurrent.Future<CreateRouteResponseResult> createRouteResponseAsync(CreateRouteResponseRequest createRouteResponseRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRouteResponseRequest, CreateRouteResponseResult> asyncHandler);

    /**
     * <p>
     * Creates a Stage for an API.
     * </p>
     * 
     * @param createStageRequest
     * @return A Java Future containing the result of the CreateStage operation returned by the service.
     * @sample AmazonApiGatewayV2Async.CreateStage
     */
    java.util.concurrent.Future<CreateStageResult> createStageAsync(CreateStageRequest createStageRequest);

    /**
     * <p>
     * Creates a Stage for an API.
     * </p>
     * 
     * @param createStageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateStage operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.CreateStage
     */
    java.util.concurrent.Future<CreateStageResult> createStageAsync(CreateStageRequest createStageRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStageRequest, CreateStageResult> asyncHandler);

    /**
     * <p>
     * Deletes an Api resource.
     * </p>
     * 
     * @param deleteApiRequest
     * @return A Java Future containing the result of the DeleteApi operation returned by the service.
     * @sample AmazonApiGatewayV2Async.DeleteApi
     */
    java.util.concurrent.Future<DeleteApiResult> deleteApiAsync(DeleteApiRequest deleteApiRequest);

    /**
     * <p>
     * Deletes an Api resource.
     * </p>
     * 
     * @param deleteApiRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApi operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.DeleteApi
     */
    java.util.concurrent.Future<DeleteApiResult> deleteApiAsync(DeleteApiRequest deleteApiRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApiRequest, DeleteApiResult> asyncHandler);

    /**
     * <p>
     * Deletes an API mapping.
     * </p>
     * 
     * @param deleteApiMappingRequest
     * @return A Java Future containing the result of the DeleteApiMapping operation returned by the service.
     * @sample AmazonApiGatewayV2Async.DeleteApiMapping
     */
    java.util.concurrent.Future<DeleteApiMappingResult> deleteApiMappingAsync(DeleteApiMappingRequest deleteApiMappingRequest);

    /**
     * <p>
     * Deletes an API mapping.
     * </p>
     * 
     * @param deleteApiMappingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApiMapping operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.DeleteApiMapping
     */
    java.util.concurrent.Future<DeleteApiMappingResult> deleteApiMappingAsync(DeleteApiMappingRequest deleteApiMappingRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApiMappingRequest, DeleteApiMappingResult> asyncHandler);

    /**
     * <p>
     * Deletes an Authorizer.
     * </p>
     * 
     * @param deleteAuthorizerRequest
     * @return A Java Future containing the result of the DeleteAuthorizer operation returned by the service.
     * @sample AmazonApiGatewayV2Async.DeleteAuthorizer
     */
    java.util.concurrent.Future<DeleteAuthorizerResult> deleteAuthorizerAsync(DeleteAuthorizerRequest deleteAuthorizerRequest);

    /**
     * <p>
     * Deletes an Authorizer.
     * </p>
     * 
     * @param deleteAuthorizerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAuthorizer operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.DeleteAuthorizer
     */
    java.util.concurrent.Future<DeleteAuthorizerResult> deleteAuthorizerAsync(DeleteAuthorizerRequest deleteAuthorizerRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAuthorizerRequest, DeleteAuthorizerResult> asyncHandler);

    /**
     * <p>
     * Deletes a Deployment.
     * </p>
     * 
     * @param deleteDeploymentRequest
     * @return A Java Future containing the result of the DeleteDeployment operation returned by the service.
     * @sample AmazonApiGatewayV2Async.DeleteDeployment
     */
    java.util.concurrent.Future<DeleteDeploymentResult> deleteDeploymentAsync(DeleteDeploymentRequest deleteDeploymentRequest);

    /**
     * <p>
     * Deletes a Deployment.
     * </p>
     * 
     * @param deleteDeploymentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDeployment operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.DeleteDeployment
     */
    java.util.concurrent.Future<DeleteDeploymentResult> deleteDeploymentAsync(DeleteDeploymentRequest deleteDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDeploymentRequest, DeleteDeploymentResult> asyncHandler);

    /**
     * <p>
     * Deletes a domain name.
     * </p>
     * 
     * @param deleteDomainNameRequest
     * @return A Java Future containing the result of the DeleteDomainName operation returned by the service.
     * @sample AmazonApiGatewayV2Async.DeleteDomainName
     */
    java.util.concurrent.Future<DeleteDomainNameResult> deleteDomainNameAsync(DeleteDomainNameRequest deleteDomainNameRequest);

    /**
     * <p>
     * Deletes a domain name.
     * </p>
     * 
     * @param deleteDomainNameRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDomainName operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.DeleteDomainName
     */
    java.util.concurrent.Future<DeleteDomainNameResult> deleteDomainNameAsync(DeleteDomainNameRequest deleteDomainNameRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDomainNameRequest, DeleteDomainNameResult> asyncHandler);

    /**
     * <p>
     * Deletes an Integration.
     * </p>
     * 
     * @param deleteIntegrationRequest
     * @return A Java Future containing the result of the DeleteIntegration operation returned by the service.
     * @sample AmazonApiGatewayV2Async.DeleteIntegration
     */
    java.util.concurrent.Future<DeleteIntegrationResult> deleteIntegrationAsync(DeleteIntegrationRequest deleteIntegrationRequest);

    /**
     * <p>
     * Deletes an Integration.
     * </p>
     * 
     * @param deleteIntegrationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteIntegration operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.DeleteIntegration
     */
    java.util.concurrent.Future<DeleteIntegrationResult> deleteIntegrationAsync(DeleteIntegrationRequest deleteIntegrationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIntegrationRequest, DeleteIntegrationResult> asyncHandler);

    /**
     * <p>
     * Deletes an IntegrationResponses.
     * </p>
     * 
     * @param deleteIntegrationResponseRequest
     * @return A Java Future containing the result of the DeleteIntegrationResponse operation returned by the service.
     * @sample AmazonApiGatewayV2Async.DeleteIntegrationResponse
     */
    java.util.concurrent.Future<DeleteIntegrationResponseResult> deleteIntegrationResponseAsync(
            DeleteIntegrationResponseRequest deleteIntegrationResponseRequest);

    /**
     * <p>
     * Deletes an IntegrationResponses.
     * </p>
     * 
     * @param deleteIntegrationResponseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteIntegrationResponse operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.DeleteIntegrationResponse
     */
    java.util.concurrent.Future<DeleteIntegrationResponseResult> deleteIntegrationResponseAsync(
            DeleteIntegrationResponseRequest deleteIntegrationResponseRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIntegrationResponseRequest, DeleteIntegrationResponseResult> asyncHandler);

    /**
     * <p>
     * Deletes a Model.
     * </p>
     * 
     * @param deleteModelRequest
     * @return A Java Future containing the result of the DeleteModel operation returned by the service.
     * @sample AmazonApiGatewayV2Async.DeleteModel
     */
    java.util.concurrent.Future<DeleteModelResult> deleteModelAsync(DeleteModelRequest deleteModelRequest);

    /**
     * <p>
     * Deletes a Model.
     * </p>
     * 
     * @param deleteModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteModel operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.DeleteModel
     */
    java.util.concurrent.Future<DeleteModelResult> deleteModelAsync(DeleteModelRequest deleteModelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteModelRequest, DeleteModelResult> asyncHandler);

    /**
     * <p>
     * Deletes a Route.
     * </p>
     * 
     * @param deleteRouteRequest
     * @return A Java Future containing the result of the DeleteRoute operation returned by the service.
     * @sample AmazonApiGatewayV2Async.DeleteRoute
     */
    java.util.concurrent.Future<DeleteRouteResult> deleteRouteAsync(DeleteRouteRequest deleteRouteRequest);

    /**
     * <p>
     * Deletes a Route.
     * </p>
     * 
     * @param deleteRouteRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRoute operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.DeleteRoute
     */
    java.util.concurrent.Future<DeleteRouteResult> deleteRouteAsync(DeleteRouteRequest deleteRouteRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRouteRequest, DeleteRouteResult> asyncHandler);

    /**
     * <p>
     * Deletes a RouteResponse.
     * </p>
     * 
     * @param deleteRouteResponseRequest
     * @return A Java Future containing the result of the DeleteRouteResponse operation returned by the service.
     * @sample AmazonApiGatewayV2Async.DeleteRouteResponse
     */
    java.util.concurrent.Future<DeleteRouteResponseResult> deleteRouteResponseAsync(DeleteRouteResponseRequest deleteRouteResponseRequest);

    /**
     * <p>
     * Deletes a RouteResponse.
     * </p>
     * 
     * @param deleteRouteResponseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRouteResponse operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.DeleteRouteResponse
     */
    java.util.concurrent.Future<DeleteRouteResponseResult> deleteRouteResponseAsync(DeleteRouteResponseRequest deleteRouteResponseRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRouteResponseRequest, DeleteRouteResponseResult> asyncHandler);

    /**
     * <p>
     * Deletes a Stage.
     * </p>
     * 
     * @param deleteStageRequest
     * @return A Java Future containing the result of the DeleteStage operation returned by the service.
     * @sample AmazonApiGatewayV2Async.DeleteStage
     */
    java.util.concurrent.Future<DeleteStageResult> deleteStageAsync(DeleteStageRequest deleteStageRequest);

    /**
     * <p>
     * Deletes a Stage.
     * </p>
     * 
     * @param deleteStageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteStage operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.DeleteStage
     */
    java.util.concurrent.Future<DeleteStageResult> deleteStageAsync(DeleteStageRequest deleteStageRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteStageRequest, DeleteStageResult> asyncHandler);

    /**
     * <p>
     * Gets an Api resource.
     * </p>
     * 
     * @param getApiRequest
     * @return A Java Future containing the result of the GetApi operation returned by the service.
     * @sample AmazonApiGatewayV2Async.GetApi
     */
    java.util.concurrent.Future<GetApiResult> getApiAsync(GetApiRequest getApiRequest);

    /**
     * <p>
     * Gets an Api resource.
     * </p>
     * 
     * @param getApiRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApi operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.GetApi
     */
    java.util.concurrent.Future<GetApiResult> getApiAsync(GetApiRequest getApiRequest,
            com.amazonaws.handlers.AsyncHandler<GetApiRequest, GetApiResult> asyncHandler);

    /**
     * <p>
     * The API mapping.
     * </p>
     * 
     * @param getApiMappingRequest
     * @return A Java Future containing the result of the GetApiMapping operation returned by the service.
     * @sample AmazonApiGatewayV2Async.GetApiMapping
     */
    java.util.concurrent.Future<GetApiMappingResult> getApiMappingAsync(GetApiMappingRequest getApiMappingRequest);

    /**
     * <p>
     * The API mapping.
     * </p>
     * 
     * @param getApiMappingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApiMapping operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.GetApiMapping
     */
    java.util.concurrent.Future<GetApiMappingResult> getApiMappingAsync(GetApiMappingRequest getApiMappingRequest,
            com.amazonaws.handlers.AsyncHandler<GetApiMappingRequest, GetApiMappingResult> asyncHandler);

    /**
     * <p>
     * The API mappings.
     * </p>
     * 
     * @param getApiMappingsRequest
     * @return A Java Future containing the result of the GetApiMappings operation returned by the service.
     * @sample AmazonApiGatewayV2Async.GetApiMappings
     */
    java.util.concurrent.Future<GetApiMappingsResult> getApiMappingsAsync(GetApiMappingsRequest getApiMappingsRequest);

    /**
     * <p>
     * The API mappings.
     * </p>
     * 
     * @param getApiMappingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApiMappings operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.GetApiMappings
     */
    java.util.concurrent.Future<GetApiMappingsResult> getApiMappingsAsync(GetApiMappingsRequest getApiMappingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetApiMappingsRequest, GetApiMappingsResult> asyncHandler);

    /**
     * <p>
     * Gets a collection of Api resources.
     * </p>
     * 
     * @param getApisRequest
     * @return A Java Future containing the result of the GetApis operation returned by the service.
     * @sample AmazonApiGatewayV2Async.GetApis
     */
    java.util.concurrent.Future<GetApisResult> getApisAsync(GetApisRequest getApisRequest);

    /**
     * <p>
     * Gets a collection of Api resources.
     * </p>
     * 
     * @param getApisRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApis operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.GetApis
     */
    java.util.concurrent.Future<GetApisResult> getApisAsync(GetApisRequest getApisRequest,
            com.amazonaws.handlers.AsyncHandler<GetApisRequest, GetApisResult> asyncHandler);

    /**
     * <p>
     * Gets an Authorizer.
     * </p>
     * 
     * @param getAuthorizerRequest
     * @return A Java Future containing the result of the GetAuthorizer operation returned by the service.
     * @sample AmazonApiGatewayV2Async.GetAuthorizer
     */
    java.util.concurrent.Future<GetAuthorizerResult> getAuthorizerAsync(GetAuthorizerRequest getAuthorizerRequest);

    /**
     * <p>
     * Gets an Authorizer.
     * </p>
     * 
     * @param getAuthorizerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAuthorizer operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.GetAuthorizer
     */
    java.util.concurrent.Future<GetAuthorizerResult> getAuthorizerAsync(GetAuthorizerRequest getAuthorizerRequest,
            com.amazonaws.handlers.AsyncHandler<GetAuthorizerRequest, GetAuthorizerResult> asyncHandler);

    /**
     * <p>
     * Gets the Authorizers for an API.
     * </p>
     * 
     * @param getAuthorizersRequest
     * @return A Java Future containing the result of the GetAuthorizers operation returned by the service.
     * @sample AmazonApiGatewayV2Async.GetAuthorizers
     */
    java.util.concurrent.Future<GetAuthorizersResult> getAuthorizersAsync(GetAuthorizersRequest getAuthorizersRequest);

    /**
     * <p>
     * Gets the Authorizers for an API.
     * </p>
     * 
     * @param getAuthorizersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAuthorizers operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.GetAuthorizers
     */
    java.util.concurrent.Future<GetAuthorizersResult> getAuthorizersAsync(GetAuthorizersRequest getAuthorizersRequest,
            com.amazonaws.handlers.AsyncHandler<GetAuthorizersRequest, GetAuthorizersResult> asyncHandler);

    /**
     * <p>
     * Gets a Deployment.
     * </p>
     * 
     * @param getDeploymentRequest
     * @return A Java Future containing the result of the GetDeployment operation returned by the service.
     * @sample AmazonApiGatewayV2Async.GetDeployment
     */
    java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(GetDeploymentRequest getDeploymentRequest);

    /**
     * <p>
     * Gets a Deployment.
     * </p>
     * 
     * @param getDeploymentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDeployment operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.GetDeployment
     */
    java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(GetDeploymentRequest getDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeploymentRequest, GetDeploymentResult> asyncHandler);

    /**
     * <p>
     * Gets the Deployments for an API.
     * </p>
     * 
     * @param getDeploymentsRequest
     * @return A Java Future containing the result of the GetDeployments operation returned by the service.
     * @sample AmazonApiGatewayV2Async.GetDeployments
     */
    java.util.concurrent.Future<GetDeploymentsResult> getDeploymentsAsync(GetDeploymentsRequest getDeploymentsRequest);

    /**
     * <p>
     * Gets the Deployments for an API.
     * </p>
     * 
     * @param getDeploymentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDeployments operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.GetDeployments
     */
    java.util.concurrent.Future<GetDeploymentsResult> getDeploymentsAsync(GetDeploymentsRequest getDeploymentsRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeploymentsRequest, GetDeploymentsResult> asyncHandler);

    /**
     * <p>
     * Gets a domain name.
     * </p>
     * 
     * @param getDomainNameRequest
     * @return A Java Future containing the result of the GetDomainName operation returned by the service.
     * @sample AmazonApiGatewayV2Async.GetDomainName
     */
    java.util.concurrent.Future<GetDomainNameResult> getDomainNameAsync(GetDomainNameRequest getDomainNameRequest);

    /**
     * <p>
     * Gets a domain name.
     * </p>
     * 
     * @param getDomainNameRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDomainName operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.GetDomainName
     */
    java.util.concurrent.Future<GetDomainNameResult> getDomainNameAsync(GetDomainNameRequest getDomainNameRequest,
            com.amazonaws.handlers.AsyncHandler<GetDomainNameRequest, GetDomainNameResult> asyncHandler);

    /**
     * <p>
     * Gets the domain names for an AWS account.
     * </p>
     * 
     * @param getDomainNamesRequest
     * @return A Java Future containing the result of the GetDomainNames operation returned by the service.
     * @sample AmazonApiGatewayV2Async.GetDomainNames
     */
    java.util.concurrent.Future<GetDomainNamesResult> getDomainNamesAsync(GetDomainNamesRequest getDomainNamesRequest);

    /**
     * <p>
     * Gets the domain names for an AWS account.
     * </p>
     * 
     * @param getDomainNamesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDomainNames operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.GetDomainNames
     */
    java.util.concurrent.Future<GetDomainNamesResult> getDomainNamesAsync(GetDomainNamesRequest getDomainNamesRequest,
            com.amazonaws.handlers.AsyncHandler<GetDomainNamesRequest, GetDomainNamesResult> asyncHandler);

    /**
     * <p>
     * Gets an Integration.
     * </p>
     * 
     * @param getIntegrationRequest
     * @return A Java Future containing the result of the GetIntegration operation returned by the service.
     * @sample AmazonApiGatewayV2Async.GetIntegration
     */
    java.util.concurrent.Future<GetIntegrationResult> getIntegrationAsync(GetIntegrationRequest getIntegrationRequest);

    /**
     * <p>
     * Gets an Integration.
     * </p>
     * 
     * @param getIntegrationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIntegration operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.GetIntegration
     */
    java.util.concurrent.Future<GetIntegrationResult> getIntegrationAsync(GetIntegrationRequest getIntegrationRequest,
            com.amazonaws.handlers.AsyncHandler<GetIntegrationRequest, GetIntegrationResult> asyncHandler);

    /**
     * <p>
     * Gets an IntegrationResponses.
     * </p>
     * 
     * @param getIntegrationResponseRequest
     * @return A Java Future containing the result of the GetIntegrationResponse operation returned by the service.
     * @sample AmazonApiGatewayV2Async.GetIntegrationResponse
     */
    java.util.concurrent.Future<GetIntegrationResponseResult> getIntegrationResponseAsync(GetIntegrationResponseRequest getIntegrationResponseRequest);

    /**
     * <p>
     * Gets an IntegrationResponses.
     * </p>
     * 
     * @param getIntegrationResponseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIntegrationResponse operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.GetIntegrationResponse
     */
    java.util.concurrent.Future<GetIntegrationResponseResult> getIntegrationResponseAsync(GetIntegrationResponseRequest getIntegrationResponseRequest,
            com.amazonaws.handlers.AsyncHandler<GetIntegrationResponseRequest, GetIntegrationResponseResult> asyncHandler);

    /**
     * <p>
     * Gets the IntegrationResponses for an Integration.
     * </p>
     * 
     * @param getIntegrationResponsesRequest
     * @return A Java Future containing the result of the GetIntegrationResponses operation returned by the service.
     * @sample AmazonApiGatewayV2Async.GetIntegrationResponses
     */
    java.util.concurrent.Future<GetIntegrationResponsesResult> getIntegrationResponsesAsync(GetIntegrationResponsesRequest getIntegrationResponsesRequest);

    /**
     * <p>
     * Gets the IntegrationResponses for an Integration.
     * </p>
     * 
     * @param getIntegrationResponsesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIntegrationResponses operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.GetIntegrationResponses
     */
    java.util.concurrent.Future<GetIntegrationResponsesResult> getIntegrationResponsesAsync(GetIntegrationResponsesRequest getIntegrationResponsesRequest,
            com.amazonaws.handlers.AsyncHandler<GetIntegrationResponsesRequest, GetIntegrationResponsesResult> asyncHandler);

    /**
     * <p>
     * Gets the Integrations for an API.
     * </p>
     * 
     * @param getIntegrationsRequest
     * @return A Java Future containing the result of the GetIntegrations operation returned by the service.
     * @sample AmazonApiGatewayV2Async.GetIntegrations
     */
    java.util.concurrent.Future<GetIntegrationsResult> getIntegrationsAsync(GetIntegrationsRequest getIntegrationsRequest);

    /**
     * <p>
     * Gets the Integrations for an API.
     * </p>
     * 
     * @param getIntegrationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIntegrations operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.GetIntegrations
     */
    java.util.concurrent.Future<GetIntegrationsResult> getIntegrationsAsync(GetIntegrationsRequest getIntegrationsRequest,
            com.amazonaws.handlers.AsyncHandler<GetIntegrationsRequest, GetIntegrationsResult> asyncHandler);

    /**
     * <p>
     * Gets a Model.
     * </p>
     * 
     * @param getModelRequest
     * @return A Java Future containing the result of the GetModel operation returned by the service.
     * @sample AmazonApiGatewayV2Async.GetModel
     */
    java.util.concurrent.Future<GetModelResult> getModelAsync(GetModelRequest getModelRequest);

    /**
     * <p>
     * Gets a Model.
     * </p>
     * 
     * @param getModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetModel operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.GetModel
     */
    java.util.concurrent.Future<GetModelResult> getModelAsync(GetModelRequest getModelRequest,
            com.amazonaws.handlers.AsyncHandler<GetModelRequest, GetModelResult> asyncHandler);

    /**
     * <p>
     * Gets a model template.
     * </p>
     * 
     * @param getModelTemplateRequest
     * @return A Java Future containing the result of the GetModelTemplate operation returned by the service.
     * @sample AmazonApiGatewayV2Async.GetModelTemplate
     */
    java.util.concurrent.Future<GetModelTemplateResult> getModelTemplateAsync(GetModelTemplateRequest getModelTemplateRequest);

    /**
     * <p>
     * Gets a model template.
     * </p>
     * 
     * @param getModelTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetModelTemplate operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.GetModelTemplate
     */
    java.util.concurrent.Future<GetModelTemplateResult> getModelTemplateAsync(GetModelTemplateRequest getModelTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<GetModelTemplateRequest, GetModelTemplateResult> asyncHandler);

    /**
     * <p>
     * Gets the Models for an API.
     * </p>
     * 
     * @param getModelsRequest
     * @return A Java Future containing the result of the GetModels operation returned by the service.
     * @sample AmazonApiGatewayV2Async.GetModels
     */
    java.util.concurrent.Future<GetModelsResult> getModelsAsync(GetModelsRequest getModelsRequest);

    /**
     * <p>
     * Gets the Models for an API.
     * </p>
     * 
     * @param getModelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetModels operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.GetModels
     */
    java.util.concurrent.Future<GetModelsResult> getModelsAsync(GetModelsRequest getModelsRequest,
            com.amazonaws.handlers.AsyncHandler<GetModelsRequest, GetModelsResult> asyncHandler);

    /**
     * <p>
     * Gets a Route.
     * </p>
     * 
     * @param getRouteRequest
     * @return A Java Future containing the result of the GetRoute operation returned by the service.
     * @sample AmazonApiGatewayV2Async.GetRoute
     */
    java.util.concurrent.Future<GetRouteResult> getRouteAsync(GetRouteRequest getRouteRequest);

    /**
     * <p>
     * Gets a Route.
     * </p>
     * 
     * @param getRouteRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRoute operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.GetRoute
     */
    java.util.concurrent.Future<GetRouteResult> getRouteAsync(GetRouteRequest getRouteRequest,
            com.amazonaws.handlers.AsyncHandler<GetRouteRequest, GetRouteResult> asyncHandler);

    /**
     * <p>
     * Gets a RouteResponse.
     * </p>
     * 
     * @param getRouteResponseRequest
     * @return A Java Future containing the result of the GetRouteResponse operation returned by the service.
     * @sample AmazonApiGatewayV2Async.GetRouteResponse
     */
    java.util.concurrent.Future<GetRouteResponseResult> getRouteResponseAsync(GetRouteResponseRequest getRouteResponseRequest);

    /**
     * <p>
     * Gets a RouteResponse.
     * </p>
     * 
     * @param getRouteResponseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRouteResponse operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.GetRouteResponse
     */
    java.util.concurrent.Future<GetRouteResponseResult> getRouteResponseAsync(GetRouteResponseRequest getRouteResponseRequest,
            com.amazonaws.handlers.AsyncHandler<GetRouteResponseRequest, GetRouteResponseResult> asyncHandler);

    /**
     * <p>
     * Gets the RouteResponses for a Route.
     * </p>
     * 
     * @param getRouteResponsesRequest
     * @return A Java Future containing the result of the GetRouteResponses operation returned by the service.
     * @sample AmazonApiGatewayV2Async.GetRouteResponses
     */
    java.util.concurrent.Future<GetRouteResponsesResult> getRouteResponsesAsync(GetRouteResponsesRequest getRouteResponsesRequest);

    /**
     * <p>
     * Gets the RouteResponses for a Route.
     * </p>
     * 
     * @param getRouteResponsesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRouteResponses operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.GetRouteResponses
     */
    java.util.concurrent.Future<GetRouteResponsesResult> getRouteResponsesAsync(GetRouteResponsesRequest getRouteResponsesRequest,
            com.amazonaws.handlers.AsyncHandler<GetRouteResponsesRequest, GetRouteResponsesResult> asyncHandler);

    /**
     * <p>
     * Gets the Routes for an API.
     * </p>
     * 
     * @param getRoutesRequest
     * @return A Java Future containing the result of the GetRoutes operation returned by the service.
     * @sample AmazonApiGatewayV2Async.GetRoutes
     */
    java.util.concurrent.Future<GetRoutesResult> getRoutesAsync(GetRoutesRequest getRoutesRequest);

    /**
     * <p>
     * Gets the Routes for an API.
     * </p>
     * 
     * @param getRoutesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRoutes operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.GetRoutes
     */
    java.util.concurrent.Future<GetRoutesResult> getRoutesAsync(GetRoutesRequest getRoutesRequest,
            com.amazonaws.handlers.AsyncHandler<GetRoutesRequest, GetRoutesResult> asyncHandler);

    /**
     * <p>
     * Gets a Stage.
     * </p>
     * 
     * @param getStageRequest
     * @return A Java Future containing the result of the GetStage operation returned by the service.
     * @sample AmazonApiGatewayV2Async.GetStage
     */
    java.util.concurrent.Future<GetStageResult> getStageAsync(GetStageRequest getStageRequest);

    /**
     * <p>
     * Gets a Stage.
     * </p>
     * 
     * @param getStageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStage operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.GetStage
     */
    java.util.concurrent.Future<GetStageResult> getStageAsync(GetStageRequest getStageRequest,
            com.amazonaws.handlers.AsyncHandler<GetStageRequest, GetStageResult> asyncHandler);

    /**
     * <p>
     * Gets the Stages for an API.
     * </p>
     * 
     * @param getStagesRequest
     * @return A Java Future containing the result of the GetStages operation returned by the service.
     * @sample AmazonApiGatewayV2Async.GetStages
     */
    java.util.concurrent.Future<GetStagesResult> getStagesAsync(GetStagesRequest getStagesRequest);

    /**
     * <p>
     * Gets the Stages for an API.
     * </p>
     * 
     * @param getStagesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStages operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.GetStages
     */
    java.util.concurrent.Future<GetStagesResult> getStagesAsync(GetStagesRequest getStagesRequest,
            com.amazonaws.handlers.AsyncHandler<GetStagesRequest, GetStagesResult> asyncHandler);

    /**
     * <p>
     * Updates an Api resource.
     * </p>
     * 
     * @param updateApiRequest
     * @return A Java Future containing the result of the UpdateApi operation returned by the service.
     * @sample AmazonApiGatewayV2Async.UpdateApi
     */
    java.util.concurrent.Future<UpdateApiResult> updateApiAsync(UpdateApiRequest updateApiRequest);

    /**
     * <p>
     * Updates an Api resource.
     * </p>
     * 
     * @param updateApiRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApi operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.UpdateApi
     */
    java.util.concurrent.Future<UpdateApiResult> updateApiAsync(UpdateApiRequest updateApiRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApiRequest, UpdateApiResult> asyncHandler);

    /**
     * <p>
     * The API mapping.
     * </p>
     * 
     * @param updateApiMappingRequest
     * @return A Java Future containing the result of the UpdateApiMapping operation returned by the service.
     * @sample AmazonApiGatewayV2Async.UpdateApiMapping
     */
    java.util.concurrent.Future<UpdateApiMappingResult> updateApiMappingAsync(UpdateApiMappingRequest updateApiMappingRequest);

    /**
     * <p>
     * The API mapping.
     * </p>
     * 
     * @param updateApiMappingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApiMapping operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.UpdateApiMapping
     */
    java.util.concurrent.Future<UpdateApiMappingResult> updateApiMappingAsync(UpdateApiMappingRequest updateApiMappingRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApiMappingRequest, UpdateApiMappingResult> asyncHandler);

    /**
     * <p>
     * Updates an Authorizer.
     * </p>
     * 
     * @param updateAuthorizerRequest
     * @return A Java Future containing the result of the UpdateAuthorizer operation returned by the service.
     * @sample AmazonApiGatewayV2Async.UpdateAuthorizer
     */
    java.util.concurrent.Future<UpdateAuthorizerResult> updateAuthorizerAsync(UpdateAuthorizerRequest updateAuthorizerRequest);

    /**
     * <p>
     * Updates an Authorizer.
     * </p>
     * 
     * @param updateAuthorizerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAuthorizer operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.UpdateAuthorizer
     */
    java.util.concurrent.Future<UpdateAuthorizerResult> updateAuthorizerAsync(UpdateAuthorizerRequest updateAuthorizerRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAuthorizerRequest, UpdateAuthorizerResult> asyncHandler);

    /**
     * <p>
     * Updates a Deployment.
     * </p>
     * 
     * @param updateDeploymentRequest
     * @return A Java Future containing the result of the UpdateDeployment operation returned by the service.
     * @sample AmazonApiGatewayV2Async.UpdateDeployment
     */
    java.util.concurrent.Future<UpdateDeploymentResult> updateDeploymentAsync(UpdateDeploymentRequest updateDeploymentRequest);

    /**
     * <p>
     * Updates a Deployment.
     * </p>
     * 
     * @param updateDeploymentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDeployment operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.UpdateDeployment
     */
    java.util.concurrent.Future<UpdateDeploymentResult> updateDeploymentAsync(UpdateDeploymentRequest updateDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDeploymentRequest, UpdateDeploymentResult> asyncHandler);

    /**
     * <p>
     * Updates a domain name.
     * </p>
     * 
     * @param updateDomainNameRequest
     * @return A Java Future containing the result of the UpdateDomainName operation returned by the service.
     * @sample AmazonApiGatewayV2Async.UpdateDomainName
     */
    java.util.concurrent.Future<UpdateDomainNameResult> updateDomainNameAsync(UpdateDomainNameRequest updateDomainNameRequest);

    /**
     * <p>
     * Updates a domain name.
     * </p>
     * 
     * @param updateDomainNameRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDomainName operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.UpdateDomainName
     */
    java.util.concurrent.Future<UpdateDomainNameResult> updateDomainNameAsync(UpdateDomainNameRequest updateDomainNameRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDomainNameRequest, UpdateDomainNameResult> asyncHandler);

    /**
     * <p>
     * Updates an Integration.
     * </p>
     * 
     * @param updateIntegrationRequest
     * @return A Java Future containing the result of the UpdateIntegration operation returned by the service.
     * @sample AmazonApiGatewayV2Async.UpdateIntegration
     */
    java.util.concurrent.Future<UpdateIntegrationResult> updateIntegrationAsync(UpdateIntegrationRequest updateIntegrationRequest);

    /**
     * <p>
     * Updates an Integration.
     * </p>
     * 
     * @param updateIntegrationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateIntegration operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.UpdateIntegration
     */
    java.util.concurrent.Future<UpdateIntegrationResult> updateIntegrationAsync(UpdateIntegrationRequest updateIntegrationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateIntegrationRequest, UpdateIntegrationResult> asyncHandler);

    /**
     * <p>
     * Updates an IntegrationResponses.
     * </p>
     * 
     * @param updateIntegrationResponseRequest
     * @return A Java Future containing the result of the UpdateIntegrationResponse operation returned by the service.
     * @sample AmazonApiGatewayV2Async.UpdateIntegrationResponse
     */
    java.util.concurrent.Future<UpdateIntegrationResponseResult> updateIntegrationResponseAsync(
            UpdateIntegrationResponseRequest updateIntegrationResponseRequest);

    /**
     * <p>
     * Updates an IntegrationResponses.
     * </p>
     * 
     * @param updateIntegrationResponseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateIntegrationResponse operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.UpdateIntegrationResponse
     */
    java.util.concurrent.Future<UpdateIntegrationResponseResult> updateIntegrationResponseAsync(
            UpdateIntegrationResponseRequest updateIntegrationResponseRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateIntegrationResponseRequest, UpdateIntegrationResponseResult> asyncHandler);

    /**
     * <p>
     * Updates a Model.
     * </p>
     * 
     * @param updateModelRequest
     * @return A Java Future containing the result of the UpdateModel operation returned by the service.
     * @sample AmazonApiGatewayV2Async.UpdateModel
     */
    java.util.concurrent.Future<UpdateModelResult> updateModelAsync(UpdateModelRequest updateModelRequest);

    /**
     * <p>
     * Updates a Model.
     * </p>
     * 
     * @param updateModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateModel operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.UpdateModel
     */
    java.util.concurrent.Future<UpdateModelResult> updateModelAsync(UpdateModelRequest updateModelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateModelRequest, UpdateModelResult> asyncHandler);

    /**
     * <p>
     * Updates a Route.
     * </p>
     * 
     * @param updateRouteRequest
     * @return A Java Future containing the result of the UpdateRoute operation returned by the service.
     * @sample AmazonApiGatewayV2Async.UpdateRoute
     */
    java.util.concurrent.Future<UpdateRouteResult> updateRouteAsync(UpdateRouteRequest updateRouteRequest);

    /**
     * <p>
     * Updates a Route.
     * </p>
     * 
     * @param updateRouteRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRoute operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.UpdateRoute
     */
    java.util.concurrent.Future<UpdateRouteResult> updateRouteAsync(UpdateRouteRequest updateRouteRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRouteRequest, UpdateRouteResult> asyncHandler);

    /**
     * <p>
     * Updates a RouteResponse.
     * </p>
     * 
     * @param updateRouteResponseRequest
     * @return A Java Future containing the result of the UpdateRouteResponse operation returned by the service.
     * @sample AmazonApiGatewayV2Async.UpdateRouteResponse
     */
    java.util.concurrent.Future<UpdateRouteResponseResult> updateRouteResponseAsync(UpdateRouteResponseRequest updateRouteResponseRequest);

    /**
     * <p>
     * Updates a RouteResponse.
     * </p>
     * 
     * @param updateRouteResponseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRouteResponse operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.UpdateRouteResponse
     */
    java.util.concurrent.Future<UpdateRouteResponseResult> updateRouteResponseAsync(UpdateRouteResponseRequest updateRouteResponseRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRouteResponseRequest, UpdateRouteResponseResult> asyncHandler);

    /**
     * <p>
     * Updates a Stage.
     * </p>
     * 
     * @param updateStageRequest
     * @return A Java Future containing the result of the UpdateStage operation returned by the service.
     * @sample AmazonApiGatewayV2Async.UpdateStage
     */
    java.util.concurrent.Future<UpdateStageResult> updateStageAsync(UpdateStageRequest updateStageRequest);

    /**
     * <p>
     * Updates a Stage.
     * </p>
     * 
     * @param updateStageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateStage operation returned by the service.
     * @sample AmazonApiGatewayV2AsyncHandler.UpdateStage
     */
    java.util.concurrent.Future<UpdateStageResult> updateStageAsync(UpdateStageRequest updateStageRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateStageRequest, UpdateStageResult> asyncHandler);

}
