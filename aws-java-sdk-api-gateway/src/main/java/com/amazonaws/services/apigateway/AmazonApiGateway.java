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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.apigateway.model.*;

/**
 * Interface for accessing Amazon API Gateway.
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
public interface AmazonApiGateway {

    /**
     * Overrides the default endpoint for this client
     * ("https://apigateway.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "apigateway.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://apigateway.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see: <a
     * href=
     * "http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912"
     * > http://developer.amazonwebservices.com/connect/entry.jspa?externalID=
     * 3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when
     * the client is created and before any service requests are made. Changing
     * it afterwards creates inevitable race conditions for any service requests
     * in transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "apigateway.us-east-1.amazonaws.com") or a full
     *        URL, including the protocol (ex:
     *        "https://apigateway.us-east-1.amazonaws.com") of the region
     *        specific AWS endpoint this client will communicate with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonApiGateway#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See
     *        {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *        accessing a given region. Must not be null and must be a region
     *        where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class,
     *      com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     */
    void setRegion(Region region);

    /**
     * @param createApiKeyRequest
     * @return Result of the CreateApiKey operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @sample AmazonApiGateway.CreateApiKey
     */
    CreateApiKeyResult createApiKey(CreateApiKeyRequest createApiKeyRequest);

    /**
     * <p>
     * Creates a new <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param createBasePathMappingRequest
     *        Requests Amazon API Gateway to create a new <a>BasePathMapping</a>
     *        resource.
     * @return Result of the CreateBasePathMapping operation returned by the
     *         service.
     * @throws UnauthorizedException
     * @throws ConflictException
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.CreateBasePathMapping
     */
    CreateBasePathMappingResult createBasePathMapping(
            CreateBasePathMappingRequest createBasePathMappingRequest);

    /**
     * <p>
     * Creates a <a>Deployment</a> resource, which makes a specified
     * <a>RestApi</a> callable over the internet.
     * </p>
     * 
     * @param createDeploymentRequest
     *        Requests Amazon API Gateway to create a <a>Deployment</a>
     *        resource.
     * @return Result of the CreateDeployment operation returned by the service.
     * @throws UnauthorizedException
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @throws ServiceUnavailableException
     * @sample AmazonApiGateway.CreateDeployment
     */
    CreateDeploymentResult createDeployment(
            CreateDeploymentRequest createDeploymentRequest);

    /**
     * <p>
     * Creates a new domain name.
     * </p>
     * 
     * @param createDomainNameRequest
     *        A request to create a new domain name.
     * @return Result of the CreateDomainName operation returned by the service.
     * @throws UnauthorizedException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.CreateDomainName
     */
    CreateDomainNameResult createDomainName(
            CreateDomainNameRequest createDomainNameRequest);

    /**
     * <p>
     * Adds a new <a>Model</a> resource to an existing <a>RestApi</a> resource.
     * </p>
     * 
     * @param createModelRequest
     *        Request to add a new <a>Model</a> to an existing <a>RestApi</a>
     *        resource.
     * @return Result of the CreateModel operation returned by the service.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.CreateModel
     */
    CreateModelResult createModel(CreateModelRequest createModelRequest);

    /**
     * <p>
     * Creates a <a>Resource</a> resource.
     * </p>
     * 
     * @param createResourceRequest
     *        Requests Amazon API Gateway to create a <a>Resource</a> resource.
     * @return Result of the CreateResource operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.CreateResource
     */
    CreateResourceResult createResource(
            CreateResourceRequest createResourceRequest);

    /**
     * <p>
     * Creates a new <a>RestApi</a> resource.
     * </p>
     * 
     * @param createRestApiRequest
     *        Request to add a new <a>RestApi</a> resource to your collection.
     * @return Result of the CreateRestApi operation returned by the service.
     * @throws UnauthorizedException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.CreateRestApi
     */
    CreateRestApiResult createRestApi(CreateRestApiRequest createRestApiRequest);

    /**
     * <p>
     * Creates a <a>Stage</a> resource.
     * </p>
     * 
     * @param createStageRequest
     *        Requests Amazon API Gateway to create a <a>Stage</a> resource.
     * @return Result of the CreateStage operation returned by the service.
     * @throws UnauthorizedException
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.CreateStage
     */
    CreateStageResult createStage(CreateStageRequest createStageRequest);

    /**
     * <p>
     * Deletes the <a>ApiKey</a> resource.
     * </p>
     * 
     * @param deleteApiKeyRequest
     *        A request to delete the <a>ApiKey</a> resource.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.DeleteApiKey
     */
    void deleteApiKey(DeleteApiKeyRequest deleteApiKeyRequest);

    /**
     * <p>
     * Deletes the <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param deleteBasePathMappingRequest
     *        A request to delete the <a>BasePathMapping</a> resource.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.DeleteBasePathMapping
     */
    void deleteBasePathMapping(
            DeleteBasePathMappingRequest deleteBasePathMappingRequest);

    /**
     * @param deleteClientCertificateRequest
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws NotFoundException
     * @sample AmazonApiGateway.DeleteClientCertificate
     */
    void deleteClientCertificate(
            DeleteClientCertificateRequest deleteClientCertificateRequest);

    /**
     * <p>
     * Deletes a <a>Deployment</a> resource. Deleting a deployment will only
     * succeed if there are no <a>Stage</a> resources associated with it.
     * </p>
     * 
     * @param deleteDeploymentRequest
     *        Requests Amazon API Gateway to delete a <a>Deployment</a>
     *        resource.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.DeleteDeployment
     */
    void deleteDeployment(DeleteDeploymentRequest deleteDeploymentRequest);

    /**
     * <p>
     * Deletes the <a>DomainName</a> resource.
     * </p>
     * 
     * @param deleteDomainNameRequest
     *        A request to delete the <a>DomainName</a> resource.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.DeleteDomainName
     */
    void deleteDomainName(DeleteDomainNameRequest deleteDomainNameRequest);

    /**
     * <p>
     * Represents a delete integration.
     * </p>
     * 
     * @param deleteIntegrationRequest
     *        Represents a delete integration request.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.DeleteIntegration
     */
    void deleteIntegration(DeleteIntegrationRequest deleteIntegrationRequest);

    /**
     * <p>
     * Represents a delete integration response.
     * </p>
     * 
     * @param deleteIntegrationResponseRequest
     *        Represents a delete integration response request.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.DeleteIntegrationResponse
     */
    void deleteIntegrationResponse(
            DeleteIntegrationResponseRequest deleteIntegrationResponseRequest);

    /**
     * <p>
     * Deletes an existing <a>Method</a> resource.
     * </p>
     * 
     * @param deleteMethodRequest
     *        Request to delete an existing <a>Method</a> resource.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.DeleteMethod
     */
    void deleteMethod(DeleteMethodRequest deleteMethodRequest);

    /**
     * <p>
     * Deletes an existing <a>MethodResponse</a> resource.
     * </p>
     * 
     * @param deleteMethodResponseRequest
     *        A request to delete an existing <a>MethodResponse</a> resource.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.DeleteMethodResponse
     */
    void deleteMethodResponse(
            DeleteMethodResponseRequest deleteMethodResponseRequest);

    /**
     * <p>
     * Deletes a model.
     * </p>
     * 
     * @param deleteModelRequest
     *        Request to delete an existing model in an existing <a>RestApi</a>
     *        resource.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws ConflictException
     * @sample AmazonApiGateway.DeleteModel
     */
    void deleteModel(DeleteModelRequest deleteModelRequest);

    /**
     * <p>
     * Deletes a <a>Resource</a> resource.
     * </p>
     * 
     * @param deleteResourceRequest
     *        Request to delete a <a>Resource</a>.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.DeleteResource
     */
    void deleteResource(DeleteResourceRequest deleteResourceRequest);

    /**
     * <p>
     * Deletes the specified API.
     * </p>
     * 
     * @param deleteRestApiRequest
     *        Request to delete the specified API from your collection.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.DeleteRestApi
     */
    void deleteRestApi(DeleteRestApiRequest deleteRestApiRequest);

    /**
     * <p>
     * Deletes a <a>Stage</a> resource.
     * </p>
     * 
     * @param deleteStageRequest
     *        Requests Amazon API Gateway to delete a <a>Stage</a> resource.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.DeleteStage
     */
    void deleteStage(DeleteStageRequest deleteStageRequest);

    /**
     * <p>
     * Flushes a stage's cache.
     * </p>
     * 
     * @param flushStageCacheRequest
     *        Requests Amazon API Gateway to flush a stage's cache.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.FlushStageCache
     */
    void flushStageCache(FlushStageCacheRequest flushStageCacheRequest);

    /**
     * @param generateClientCertificateRequest
     * @return Result of the GenerateClientCertificate operation returned by the
     *         service.
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @sample AmazonApiGateway.GenerateClientCertificate
     */
    GenerateClientCertificateResult generateClientCertificate(
            GenerateClientCertificateRequest generateClientCertificateRequest);

    /**
     * <p>
     * Gets information about the current <a>Account</a> resource.
     * </p>
     * 
     * @param getAccountRequest
     *        Requests Amazon API Gateway to get information about the current
     *        <a>Account</a> resource.
     * @return Result of the GetAccount operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetAccount
     */
    GetAccountResult getAccount(GetAccountRequest getAccountRequest);

    /**
     * <p>
     * Gets information about the current <a>ApiKey</a> resource.
     * </p>
     * 
     * @param getApiKeyRequest
     *        A request to get information about the current <a>ApiKey</a>
     *        resource.
     * @return Result of the GetApiKey operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetApiKey
     */
    GetApiKeyResult getApiKey(GetApiKeyRequest getApiKeyRequest);

    /**
     * <p>
     * Gets information about the current <a>ApiKeys</a> resource.
     * </p>
     * 
     * @param getApiKeysRequest
     *        A request to get information about the current <a>ApiKeys</a>
     *        resource.
     * @return Result of the GetApiKeys operation returned by the service.
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetApiKeys
     */
    GetApiKeysResult getApiKeys(GetApiKeysRequest getApiKeysRequest);

    /**
     * <p>
     * Describe a <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param getBasePathMappingRequest
     *        Request to describe a <a>BasePathMapping</a> resource.
     * @return Result of the GetBasePathMapping operation returned by the
     *         service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetBasePathMapping
     */
    GetBasePathMappingResult getBasePathMapping(
            GetBasePathMappingRequest getBasePathMappingRequest);

    /**
     * <p>
     * Represents a collection of <a>BasePathMapping</a> resources.
     * </p>
     * 
     * @param getBasePathMappingsRequest
     *        A request to get information about a collection of
     *        <a>BasePathMapping</a> resources.
     * @return Result of the GetBasePathMappings operation returned by the
     *         service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetBasePathMappings
     */
    GetBasePathMappingsResult getBasePathMappings(
            GetBasePathMappingsRequest getBasePathMappingsRequest);

    /**
     * @param getClientCertificateRequest
     * @return Result of the GetClientCertificate operation returned by the
     *         service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetClientCertificate
     */
    GetClientCertificateResult getClientCertificate(
            GetClientCertificateRequest getClientCertificateRequest);

    /**
     * @param getClientCertificatesRequest
     * @return Result of the GetClientCertificates operation returned by the
     *         service.
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetClientCertificates
     */
    GetClientCertificatesResult getClientCertificates(
            GetClientCertificatesRequest getClientCertificatesRequest);

    /**
     * <p>
     * Gets information about a <a>Deployment</a> resource.
     * </p>
     * 
     * @param getDeploymentRequest
     *        Requests Amazon API Gateway to get information about a
     *        <a>Deployment</a> resource.
     * @return Result of the GetDeployment operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws ServiceUnavailableException
     * @sample AmazonApiGateway.GetDeployment
     */
    GetDeploymentResult getDeployment(GetDeploymentRequest getDeploymentRequest);

    /**
     * <p>
     * Gets information about a <a>Deployments</a> collection.
     * </p>
     * 
     * @param getDeploymentsRequest
     *        Requests Amazon API Gateway to get information about a
     *        <a>Deployments</a> collection.
     * @return Result of the GetDeployments operation returned by the service.
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws ServiceUnavailableException
     * @sample AmazonApiGateway.GetDeployments
     */
    GetDeploymentsResult getDeployments(
            GetDeploymentsRequest getDeploymentsRequest);

    /**
     * <p>
     * Represents a domain name that is contained in a simpler, more intuitive
     * URL that can be called.
     * </p>
     * 
     * @param getDomainNameRequest
     *        Request to get the name of a <a>DomainName</a> resource.
     * @return Result of the GetDomainName operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetDomainName
     */
    GetDomainNameResult getDomainName(GetDomainNameRequest getDomainNameRequest);

    /**
     * <p>
     * Represents a collection of <a>DomainName</a> resources.
     * </p>
     * 
     * @param getDomainNamesRequest
     *        Request to describe a collection of <a>DomainName</a> resources.
     * @return Result of the GetDomainNames operation returned by the service.
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetDomainNames
     */
    GetDomainNamesResult getDomainNames(
            GetDomainNamesRequest getDomainNamesRequest);

    /**
     * <p>
     * Represents a get integration.
     * </p>
     * 
     * @param getIntegrationRequest
     *        Represents a get integration request.
     * @return Result of the GetIntegration operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetIntegration
     */
    GetIntegrationResult getIntegration(
            GetIntegrationRequest getIntegrationRequest);

    /**
     * <p>
     * Represents a get integration response.
     * </p>
     * 
     * @param getIntegrationResponseRequest
     *        Represents a get integration response request.
     * @return Result of the GetIntegrationResponse operation returned by the
     *         service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetIntegrationResponse
     */
    GetIntegrationResponseResult getIntegrationResponse(
            GetIntegrationResponseRequest getIntegrationResponseRequest);

    /**
     * <p>
     * Describe an existing <a>Method</a> resource.
     * </p>
     * 
     * @param getMethodRequest
     *        Request to describe an existing <a>Method</a> resource.
     * @return Result of the GetMethod operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetMethod
     */
    GetMethodResult getMethod(GetMethodRequest getMethodRequest);

    /**
     * <p>
     * Describes a <a>MethodResponse</a> resource.
     * </p>
     * 
     * @param getMethodResponseRequest
     *        Request to describe a <a>MethodResponse</a> resource.
     * @return Result of the GetMethodResponse operation returned by the
     *         service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetMethodResponse
     */
    GetMethodResponseResult getMethodResponse(
            GetMethodResponseRequest getMethodResponseRequest);

    /**
     * <p>
     * Describes an existing model defined for a <a>RestApi</a> resource.
     * </p>
     * 
     * @param getModelRequest
     *        Request to list information about a model in an existing
     *        <a>RestApi</a> resource.
     * @return Result of the GetModel operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetModel
     */
    GetModelResult getModel(GetModelRequest getModelRequest);

    /**
     * <p>
     * Generates a sample mapping template that can be used to transform a
     * payload into the structure of a model.
     * </p>
     * 
     * @param getModelTemplateRequest
     *        Request to generate a sample mapping template used to transform
     *        the payload.
     * @return Result of the GetModelTemplate operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetModelTemplate
     */
    GetModelTemplateResult getModelTemplate(
            GetModelTemplateRequest getModelTemplateRequest);

    /**
     * <p>
     * Describes existing <a>Models</a> defined for a <a>RestApi</a> resource.
     * </p>
     * 
     * @param getModelsRequest
     *        Request to list existing <a>Models</a> defined for a
     *        <a>RestApi</a> resource.
     * @return Result of the GetModels operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetModels
     */
    GetModelsResult getModels(GetModelsRequest getModelsRequest);

    /**
     * <p>
     * Lists information about a resource.
     * </p>
     * 
     * @param getResourceRequest
     *        Request to list information about a resource.
     * @return Result of the GetResource operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetResource
     */
    GetResourceResult getResource(GetResourceRequest getResourceRequest);

    /**
     * <p>
     * Lists information about a collection of <a>Resource</a> resources.
     * </p>
     * 
     * @param getResourcesRequest
     *        Request to list information about a collection of resources.
     * @return Result of the GetResources operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetResources
     */
    GetResourcesResult getResources(GetResourcesRequest getResourcesRequest);

    /**
     * <p>
     * Lists the <a>RestApi</a> resource in the collection.
     * </p>
     * 
     * @param getRestApiRequest
     *        Request to list an existing <a>RestApi</a> defined for your
     *        collection.
     * @return Result of the GetRestApi operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetRestApi
     */
    GetRestApiResult getRestApi(GetRestApiRequest getRestApiRequest);

    /**
     * <p>
     * Lists the <a>RestApis</a> resources for your collection.
     * </p>
     * 
     * @param getRestApisRequest
     *        Request to list existing <a>RestApis</a> defined for your
     *        collection.
     * @return Result of the GetRestApis operation returned by the service.
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetRestApis
     */
    GetRestApisResult getRestApis(GetRestApisRequest getRestApisRequest);

    /**
     * @param getSdkRequest
     * @return Result of the GetSdk operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetSdk
     */
    GetSdkResult getSdk(GetSdkRequest getSdkRequest);

    /**
     * <p>
     * Gets information about a <a>Stage</a> resource.
     * </p>
     * 
     * @param getStageRequest
     *        Requests Amazon API Gateway to get information about a
     *        <a>Stage</a> resource.
     * @return Result of the GetStage operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetStage
     */
    GetStageResult getStage(GetStageRequest getStageRequest);

    /**
     * <p>
     * Gets information about one or more <a>Stage</a> resources.
     * </p>
     * 
     * @param getStagesRequest
     *        Requests Amazon API Gateway to get information about one or more
     *        <a>Stage</a> resources.
     * @return Result of the GetStages operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.GetStages
     */
    GetStagesResult getStages(GetStagesRequest getStagesRequest);

    /**
     * <p>
     * Represents a put integration.
     * </p>
     * 
     * @param putIntegrationRequest
     *        Represents a put integration request.
     * @return Result of the PutIntegration operation returned by the service.
     * @throws UnauthorizedException
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.PutIntegration
     */
    PutIntegrationResult putIntegration(
            PutIntegrationRequest putIntegrationRequest);

    /**
     * <p>
     * Represents a put integration.
     * </p>
     * 
     * @param putIntegrationResponseRequest
     *        Represents a put integration response request.
     * @return Result of the PutIntegrationResponse operation returned by the
     *         service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.PutIntegrationResponse
     */
    PutIntegrationResponseResult putIntegrationResponse(
            PutIntegrationResponseRequest putIntegrationResponseRequest);

    /**
     * <p>
     * Add a method to an existing <a>Resource</a> resource.
     * </p>
     * 
     * @param putMethodRequest
     *        Request to add a method to an existing <a>Resource</a> resource.
     * @return Result of the PutMethod operation returned by the service.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.PutMethod
     */
    PutMethodResult putMethod(PutMethodRequest putMethodRequest);

    /**
     * <p>
     * Adds a <a>MethodResponse</a> to an existing <a>Method</a> resource.
     * </p>
     * 
     * @param putMethodResponseRequest
     *        Request to add a <a>MethodResponse</a> to an existing
     *        <a>Method</a> resource.
     * @return Result of the PutMethodResponse operation returned by the
     *         service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.PutMethodResponse
     */
    PutMethodResponseResult putMethodResponse(
            PutMethodResponseRequest putMethodResponseRequest);

    /**
     * @param testInvokeMethodRequest
     * @return Result of the TestInvokeMethod operation returned by the service.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.TestInvokeMethod
     */
    TestInvokeMethodResult testInvokeMethod(
            TestInvokeMethodRequest testInvokeMethodRequest);

    /**
     * <p>
     * Changes information about the current <a>Account</a> resource.
     * </p>
     * 
     * @param updateAccountRequest
     *        Requests Amazon API Gateway to change information about the
     *        current <a>Account</a> resource.
     * @return Result of the UpdateAccount operation returned by the service.
     * @throws UnauthorizedException
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.UpdateAccount
     */
    UpdateAccountResult updateAccount(UpdateAccountRequest updateAccountRequest);

    /**
     * <p>
     * Changes information about an <a>ApiKey</a> resource.
     * </p>
     * 
     * @param updateApiKeyRequest
     *        A request to change information about an <a>ApiKey</a> resource.
     * @return Result of the UpdateApiKey operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.UpdateApiKey
     */
    UpdateApiKeyResult updateApiKey(UpdateApiKeyRequest updateApiKeyRequest);

    /**
     * <p>
     * Changes information about the <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param updateBasePathMappingRequest
     *        A request to change information about the <a>BasePathMapping</a>
     *        resource.
     * @return Result of the UpdateBasePathMapping operation returned by the
     *         service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.UpdateBasePathMapping
     */
    UpdateBasePathMappingResult updateBasePathMapping(
            UpdateBasePathMappingRequest updateBasePathMappingRequest);

    /**
     * @param updateClientCertificateRequest
     * @return Result of the UpdateClientCertificate operation returned by the
     *         service.
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws NotFoundException
     * @sample AmazonApiGateway.UpdateClientCertificate
     */
    UpdateClientCertificateResult updateClientCertificate(
            UpdateClientCertificateRequest updateClientCertificateRequest);

    /**
     * <p>
     * Changes information about a <a>Deployment</a> resource.
     * </p>
     * 
     * @param updateDeploymentRequest
     *        Requests Amazon API Gateway to change information about a
     *        <a>Deployment</a> resource.
     * @return Result of the UpdateDeployment operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws ServiceUnavailableException
     * @sample AmazonApiGateway.UpdateDeployment
     */
    UpdateDeploymentResult updateDeployment(
            UpdateDeploymentRequest updateDeploymentRequest);

    /**
     * <p>
     * Changes information about the <a>DomainName</a> resource.
     * </p>
     * 
     * @param updateDomainNameRequest
     *        A request to change information about the <a>DomainName</a>
     *        resource.
     * @return Result of the UpdateDomainName operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.UpdateDomainName
     */
    UpdateDomainNameResult updateDomainName(
            UpdateDomainNameRequest updateDomainNameRequest);

    /**
     * <p>
     * Represents an update integration.
     * </p>
     * 
     * @param updateIntegrationRequest
     *        Represents an update integration request.
     * @return Result of the UpdateIntegration operation returned by the
     *         service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.UpdateIntegration
     */
    UpdateIntegrationResult updateIntegration(
            UpdateIntegrationRequest updateIntegrationRequest);

    /**
     * <p>
     * Represents an update integration response.
     * </p>
     * 
     * @param updateIntegrationResponseRequest
     *        Represents an update integration response request.
     * @return Result of the UpdateIntegrationResponse operation returned by the
     *         service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.UpdateIntegrationResponse
     */
    UpdateIntegrationResponseResult updateIntegrationResponse(
            UpdateIntegrationResponseRequest updateIntegrationResponseRequest);

    /**
     * <p>
     * Updates an existing <a>Method</a> resource.
     * </p>
     * 
     * @param updateMethodRequest
     *        Request to update an existing <a>Method</a> resource.
     * @return Result of the UpdateMethod operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.UpdateMethod
     */
    UpdateMethodResult updateMethod(UpdateMethodRequest updateMethodRequest);

    /**
     * <p>
     * Updates an existing <a>MethodResponse</a> resource.
     * </p>
     * 
     * @param updateMethodResponseRequest
     *        A request to update an existing <a>MethodResponse</a> resource.
     * @return Result of the UpdateMethodResponse operation returned by the
     *         service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.UpdateMethodResponse
     */
    UpdateMethodResponseResult updateMethodResponse(
            UpdateMethodResponseRequest updateMethodResponseRequest);

    /**
     * <p>
     * Changes information about a model.
     * </p>
     * 
     * @param updateModelRequest
     *        Request to update an existing model in an existing <a>RestApi</a>
     *        resource.
     * @return Result of the UpdateModel operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.UpdateModel
     */
    UpdateModelResult updateModel(UpdateModelRequest updateModelRequest);

    /**
     * <p>
     * Changes information about a <a>Resource</a> resource.
     * </p>
     * 
     * @param updateResourceRequest
     *        Request to change information about a <a>Resource</a> resource.
     * @return Result of the UpdateResource operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.UpdateResource
     */
    UpdateResourceResult updateResource(
            UpdateResourceRequest updateResourceRequest);

    /**
     * <p>
     * Changes information about the specified API.
     * </p>
     * 
     * @param updateRestApiRequest
     *        Request to update an existing <a>RestApi</a> resource in your
     *        collection.
     * @return Result of the UpdateRestApi operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.UpdateRestApi
     */
    UpdateRestApiResult updateRestApi(UpdateRestApiRequest updateRestApiRequest);

    /**
     * <p>
     * Changes information about a <a>Stage</a> resource.
     * </p>
     * 
     * @param updateStageRequest
     *        Requests Amazon API Gateway to change information about a
     *        <a>Stage</a> resource.
     * @return Result of the UpdateStage operation returned by the service.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @sample AmazonApiGateway.UpdateStage
     */
    UpdateStageResult updateStage(UpdateStageRequest updateStageRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request,
     * typically used for debugging issues where a service isn't acting as
     * expected. This data isn't considered part of the result data returned by
     * an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
