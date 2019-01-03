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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.apigateway.model.*;

/**
 * Interface for accessing Amazon API Gateway.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.apigateway.AbstractAmazonApiGateway} instead.
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
public interface AmazonApiGateway {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "apigateway";

    /**
     * Overrides the default endpoint for this client ("https://apigateway.us-east-1.amazonaws.com"). Callers can use
     * this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "apigateway.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://apigateway.us-east-1.amazonaws.com"). If the protocol is not specified here, the default
     * protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "apigateway.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://apigateway.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will
     *        communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonApiGateway#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * Create an <a>ApiKey</a> resource.
     * </p>
     * <div class="seeAlso"><a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/create-api-key.html">AWS CLI</a></div>
     * 
     * @param createApiKeyRequest
     *        Request to create an <a>ApiKey</a> resource.
     * @return Result of the CreateApiKey operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AmazonApiGateway.CreateApiKey
     */
    CreateApiKeyResult createApiKey(CreateApiKeyRequest createApiKeyRequest);

    /**
     * <p>
     * Adds a new <a>Authorizer</a> resource to an existing <a>RestApi</a> resource.
     * </p>
     * <div class="seeAlso"><a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/create-authorizer.html">AWS CLI</a></div>
     * 
     * @param createAuthorizerRequest
     *        Request to add a new <a>Authorizer</a> to an existing <a>RestApi</a> resource.
     * @return Result of the CreateAuthorizer operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.CreateAuthorizer
     */
    CreateAuthorizerResult createAuthorizer(CreateAuthorizerRequest createAuthorizerRequest);

    /**
     * <p>
     * Creates a new <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param createBasePathMappingRequest
     *        Requests API Gateway to create a new <a>BasePathMapping</a> resource.
     * @return Result of the CreateBasePathMapping operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.CreateBasePathMapping
     */
    CreateBasePathMappingResult createBasePathMapping(CreateBasePathMappingRequest createBasePathMappingRequest);

    /**
     * <p>
     * Creates a <a>Deployment</a> resource, which makes a specified <a>RestApi</a> callable over the internet.
     * </p>
     * 
     * @param createDeploymentRequest
     *        Requests API Gateway to create a <a>Deployment</a> resource.
     * @return Result of the CreateDeployment operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws ServiceUnavailableException
     *         The requested service is not available. For details see the accompanying error message. Retry after the
     *         specified time period.
     * @sample AmazonApiGateway.CreateDeployment
     */
    CreateDeploymentResult createDeployment(CreateDeploymentRequest createDeploymentRequest);

    /**
     * @param createDocumentationPartRequest
     *        Creates a new documentation part of a given API.
     * @return Result of the CreateDocumentationPart operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.CreateDocumentationPart
     */
    CreateDocumentationPartResult createDocumentationPart(CreateDocumentationPartRequest createDocumentationPartRequest);

    /**
     * @param createDocumentationVersionRequest
     *        Creates a new documentation version of a given API.
     * @return Result of the CreateDocumentationVersion operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.CreateDocumentationVersion
     */
    CreateDocumentationVersionResult createDocumentationVersion(CreateDocumentationVersionRequest createDocumentationVersionRequest);

    /**
     * <p>
     * Creates a new domain name.
     * </p>
     * 
     * @param createDomainNameRequest
     *        A request to create a new domain name.
     * @return Result of the CreateDomainName operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.CreateDomainName
     */
    CreateDomainNameResult createDomainName(CreateDomainNameRequest createDomainNameRequest);

    /**
     * <p>
     * Adds a new <a>Model</a> resource to an existing <a>RestApi</a> resource.
     * </p>
     * 
     * @param createModelRequest
     *        Request to add a new <a>Model</a> to an existing <a>RestApi</a> resource.
     * @return Result of the CreateModel operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.CreateModel
     */
    CreateModelResult createModel(CreateModelRequest createModelRequest);

    /**
     * <p>
     * Creates a <a>ReqeustValidator</a> of a given <a>RestApi</a>.
     * </p>
     * 
     * @param createRequestValidatorRequest
     *        Creates a <a>RequestValidator</a> of a given <a>RestApi</a>.
     * @return Result of the CreateRequestValidator operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.CreateRequestValidator
     */
    CreateRequestValidatorResult createRequestValidator(CreateRequestValidatorRequest createRequestValidatorRequest);

    /**
     * <p>
     * Creates a <a>Resource</a> resource.
     * </p>
     * 
     * @param createResourceRequest
     *        Requests API Gateway to create a <a>Resource</a> resource.
     * @return Result of the CreateResource operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.CreateResource
     */
    CreateResourceResult createResource(CreateResourceRequest createResourceRequest);

    /**
     * <p>
     * Creates a new <a>RestApi</a> resource.
     * </p>
     * 
     * @param createRestApiRequest
     *        The POST Request to add a new <a>RestApi</a> resource to your collection.
     * @return Result of the CreateRestApi operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.CreateRestApi
     */
    CreateRestApiResult createRestApi(CreateRestApiRequest createRestApiRequest);

    /**
     * <p>
     * Creates a new <a>Stage</a> resource that references a pre-existing <a>Deployment</a> for the API.
     * </p>
     * 
     * @param createStageRequest
     *        Requests API Gateway to create a <a>Stage</a> resource.
     * @return Result of the CreateStage operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.CreateStage
     */
    CreateStageResult createStage(CreateStageRequest createStageRequest);

    /**
     * <p>
     * Creates a usage plan with the throttle and quota limits, as well as the associated API stages, specified in the
     * payload.
     * </p>
     * 
     * @param createUsagePlanRequest
     *        The POST request to create a usage plan with the name, description, throttle limits and quota limits, as
     *        well as the associated API stages, specified in the payload.
     * @return Result of the CreateUsagePlan operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @sample AmazonApiGateway.CreateUsagePlan
     */
    CreateUsagePlanResult createUsagePlan(CreateUsagePlanRequest createUsagePlanRequest);

    /**
     * <p>
     * Creates a usage plan key for adding an existing API key to a usage plan.
     * </p>
     * 
     * @param createUsagePlanKeyRequest
     *        The POST request to create a usage plan key for adding an existing API key to a usage plan.
     * @return Result of the CreateUsagePlanKey operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.CreateUsagePlanKey
     */
    CreateUsagePlanKeyResult createUsagePlanKey(CreateUsagePlanKeyRequest createUsagePlanKeyRequest);

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
     * @return Result of the CreateVpcLink operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.CreateVpcLink
     */
    CreateVpcLinkResult createVpcLink(CreateVpcLinkRequest createVpcLinkRequest);

    /**
     * <p>
     * Deletes the <a>ApiKey</a> resource.
     * </p>
     * 
     * @param deleteApiKeyRequest
     *        A request to delete the <a>ApiKey</a> resource.
     * @return Result of the DeleteApiKey operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.DeleteApiKey
     */
    DeleteApiKeyResult deleteApiKey(DeleteApiKeyRequest deleteApiKeyRequest);

    /**
     * <p>
     * Deletes an existing <a>Authorizer</a> resource.
     * </p>
     * <div class="seeAlso"><a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/delete-authorizer.html">AWS CLI</a></div>
     * 
     * @param deleteAuthorizerRequest
     *        Request to delete an existing <a>Authorizer</a> resource.
     * @return Result of the DeleteAuthorizer operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AmazonApiGateway.DeleteAuthorizer
     */
    DeleteAuthorizerResult deleteAuthorizer(DeleteAuthorizerRequest deleteAuthorizerRequest);

    /**
     * <p>
     * Deletes the <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param deleteBasePathMappingRequest
     *        A request to delete the <a>BasePathMapping</a> resource.
     * @return Result of the DeleteBasePathMapping operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.DeleteBasePathMapping
     */
    DeleteBasePathMappingResult deleteBasePathMapping(DeleteBasePathMappingRequest deleteBasePathMappingRequest);

    /**
     * <p>
     * Deletes the <a>ClientCertificate</a> resource.
     * </p>
     * 
     * @param deleteClientCertificateRequest
     *        A request to delete the <a>ClientCertificate</a> resource.
     * @return Result of the DeleteClientCertificate operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @sample AmazonApiGateway.DeleteClientCertificate
     */
    DeleteClientCertificateResult deleteClientCertificate(DeleteClientCertificateRequest deleteClientCertificateRequest);

    /**
     * <p>
     * Deletes a <a>Deployment</a> resource. Deleting a deployment will only succeed if there are no <a>Stage</a>
     * resources associated with it.
     * </p>
     * 
     * @param deleteDeploymentRequest
     *        Requests API Gateway to delete a <a>Deployment</a> resource.
     * @return Result of the DeleteDeployment operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.DeleteDeployment
     */
    DeleteDeploymentResult deleteDeployment(DeleteDeploymentRequest deleteDeploymentRequest);

    /**
     * @param deleteDocumentationPartRequest
     *        Deletes an existing documentation part of an API.
     * @return Result of the DeleteDocumentationPart operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @sample AmazonApiGateway.DeleteDocumentationPart
     */
    DeleteDocumentationPartResult deleteDocumentationPart(DeleteDocumentationPartRequest deleteDocumentationPartRequest);

    /**
     * @param deleteDocumentationVersionRequest
     *        Deletes an existing documentation version of an API.
     * @return Result of the DeleteDocumentationVersion operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.DeleteDocumentationVersion
     */
    DeleteDocumentationVersionResult deleteDocumentationVersion(DeleteDocumentationVersionRequest deleteDocumentationVersionRequest);

    /**
     * <p>
     * Deletes the <a>DomainName</a> resource.
     * </p>
     * 
     * @param deleteDomainNameRequest
     *        A request to delete the <a>DomainName</a> resource.
     * @return Result of the DeleteDomainName operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.DeleteDomainName
     */
    DeleteDomainNameResult deleteDomainName(DeleteDomainNameRequest deleteDomainNameRequest);

    /**
     * <p>
     * Clears any customization of a <a>GatewayResponse</a> of a specified response type on the given <a>RestApi</a> and
     * resets it with the default settings.
     * </p>
     * 
     * @param deleteGatewayResponseRequest
     *        Clears any customization of a <a>GatewayResponse</a> of a specified response type on the given
     *        <a>RestApi</a> and resets it with the default settings.
     * @return Result of the DeleteGatewayResponse operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AmazonApiGateway.DeleteGatewayResponse
     */
    DeleteGatewayResponseResult deleteGatewayResponse(DeleteGatewayResponseRequest deleteGatewayResponseRequest);

    /**
     * <p>
     * Represents a delete integration.
     * </p>
     * 
     * @param deleteIntegrationRequest
     *        Represents a delete integration request.
     * @return Result of the DeleteIntegration operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AmazonApiGateway.DeleteIntegration
     */
    DeleteIntegrationResult deleteIntegration(DeleteIntegrationRequest deleteIntegrationRequest);

    /**
     * <p>
     * Represents a delete integration response.
     * </p>
     * 
     * @param deleteIntegrationResponseRequest
     *        Represents a delete integration response request.
     * @return Result of the DeleteIntegrationResponse operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AmazonApiGateway.DeleteIntegrationResponse
     */
    DeleteIntegrationResponseResult deleteIntegrationResponse(DeleteIntegrationResponseRequest deleteIntegrationResponseRequest);

    /**
     * <p>
     * Deletes an existing <a>Method</a> resource.
     * </p>
     * 
     * @param deleteMethodRequest
     *        Request to delete an existing <a>Method</a> resource.
     * @return Result of the DeleteMethod operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AmazonApiGateway.DeleteMethod
     */
    DeleteMethodResult deleteMethod(DeleteMethodRequest deleteMethodRequest);

    /**
     * <p>
     * Deletes an existing <a>MethodResponse</a> resource.
     * </p>
     * 
     * @param deleteMethodResponseRequest
     *        A request to delete an existing <a>MethodResponse</a> resource.
     * @return Result of the DeleteMethodResponse operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AmazonApiGateway.DeleteMethodResponse
     */
    DeleteMethodResponseResult deleteMethodResponse(DeleteMethodResponseRequest deleteMethodResponseRequest);

    /**
     * <p>
     * Deletes a model.
     * </p>
     * 
     * @param deleteModelRequest
     *        Request to delete an existing model in an existing <a>RestApi</a> resource.
     * @return Result of the DeleteModel operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AmazonApiGateway.DeleteModel
     */
    DeleteModelResult deleteModel(DeleteModelRequest deleteModelRequest);

    /**
     * <p>
     * Deletes a <a>RequestValidator</a> of a given <a>RestApi</a>.
     * </p>
     * 
     * @param deleteRequestValidatorRequest
     *        Deletes a specified <a>RequestValidator</a> of a given <a>RestApi</a>.
     * @return Result of the DeleteRequestValidator operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AmazonApiGateway.DeleteRequestValidator
     */
    DeleteRequestValidatorResult deleteRequestValidator(DeleteRequestValidatorRequest deleteRequestValidatorRequest);

    /**
     * <p>
     * Deletes a <a>Resource</a> resource.
     * </p>
     * 
     * @param deleteResourceRequest
     *        Request to delete a <a>Resource</a>.
     * @return Result of the DeleteResource operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.DeleteResource
     */
    DeleteResourceResult deleteResource(DeleteResourceRequest deleteResourceRequest);

    /**
     * <p>
     * Deletes the specified API.
     * </p>
     * 
     * @param deleteRestApiRequest
     *        Request to delete the specified API from your collection.
     * @return Result of the DeleteRestApi operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @sample AmazonApiGateway.DeleteRestApi
     */
    DeleteRestApiResult deleteRestApi(DeleteRestApiRequest deleteRestApiRequest);

    /**
     * <p>
     * Deletes a <a>Stage</a> resource.
     * </p>
     * 
     * @param deleteStageRequest
     *        Requests API Gateway to delete a <a>Stage</a> resource.
     * @return Result of the DeleteStage operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @sample AmazonApiGateway.DeleteStage
     */
    DeleteStageResult deleteStage(DeleteStageRequest deleteStageRequest);

    /**
     * <p>
     * Deletes a usage plan of a given plan Id.
     * </p>
     * 
     * @param deleteUsagePlanRequest
     *        The DELETE request to delete a usage plan of a given plan Id.
     * @return Result of the DeleteUsagePlan operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @sample AmazonApiGateway.DeleteUsagePlan
     */
    DeleteUsagePlanResult deleteUsagePlan(DeleteUsagePlanRequest deleteUsagePlanRequest);

    /**
     * <p>
     * Deletes a usage plan key and remove the underlying API key from the associated usage plan.
     * </p>
     * 
     * @param deleteUsagePlanKeyRequest
     *        The DELETE request to delete a usage plan key and remove the underlying API key from the associated usage
     *        plan.
     * @return Result of the DeleteUsagePlanKey operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.DeleteUsagePlanKey
     */
    DeleteUsagePlanKeyResult deleteUsagePlanKey(DeleteUsagePlanKeyRequest deleteUsagePlanKeyRequest);

    /**
     * <p>
     * Deletes an existing <a>VpcLink</a> of a specified identifier.
     * </p>
     * 
     * @param deleteVpcLinkRequest
     *        Deletes an existing <a>VpcLink</a> of a specified identifier.
     * @return Result of the DeleteVpcLink operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @sample AmazonApiGateway.DeleteVpcLink
     */
    DeleteVpcLinkResult deleteVpcLink(DeleteVpcLinkRequest deleteVpcLinkRequest);

    /**
     * <p>
     * Flushes all authorizer cache entries on a stage.
     * </p>
     * 
     * @param flushStageAuthorizersCacheRequest
     *        Request to flush authorizer cache entries on a specified stage.
     * @return Result of the FlushStageAuthorizersCache operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.FlushStageAuthorizersCache
     */
    FlushStageAuthorizersCacheResult flushStageAuthorizersCache(FlushStageAuthorizersCacheRequest flushStageAuthorizersCacheRequest);

    /**
     * <p>
     * Flushes a stage's cache.
     * </p>
     * 
     * @param flushStageCacheRequest
     *        Requests API Gateway to flush a stage's cache.
     * @return Result of the FlushStageCache operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.FlushStageCache
     */
    FlushStageCacheResult flushStageCache(FlushStageCacheRequest flushStageCacheRequest);

    /**
     * <p>
     * Generates a <a>ClientCertificate</a> resource.
     * </p>
     * 
     * @param generateClientCertificateRequest
     *        A request to generate a <a>ClientCertificate</a> resource.
     * @return Result of the GenerateClientCertificate operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GenerateClientCertificate
     */
    GenerateClientCertificateResult generateClientCertificate(GenerateClientCertificateRequest generateClientCertificateRequest);

    /**
     * <p>
     * Gets information about the current <a>Account</a> resource.
     * </p>
     * 
     * @param getAccountRequest
     *        Requests API Gateway to get information about the current <a>Account</a> resource.
     * @return Result of the GetAccount operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetAccount
     */
    GetAccountResult getAccount(GetAccountRequest getAccountRequest);

    /**
     * <p>
     * Gets information about the current <a>ApiKey</a> resource.
     * </p>
     * 
     * @param getApiKeyRequest
     *        A request to get information about the current <a>ApiKey</a> resource.
     * @return Result of the GetApiKey operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetApiKey
     */
    GetApiKeyResult getApiKey(GetApiKeyRequest getApiKeyRequest);

    /**
     * <p>
     * Gets information about the current <a>ApiKeys</a> resource.
     * </p>
     * 
     * @param getApiKeysRequest
     *        A request to get information about the current <a>ApiKeys</a> resource.
     * @return Result of the GetApiKeys operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetApiKeys
     */
    GetApiKeysResult getApiKeys(GetApiKeysRequest getApiKeysRequest);

    /**
     * <p>
     * Describe an existing <a>Authorizer</a> resource.
     * </p>
     * <div class="seeAlso"><a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-authorizer.html">AWS CLI</a></div>
     * 
     * @param getAuthorizerRequest
     *        Request to describe an existing <a>Authorizer</a> resource.
     * @return Result of the GetAuthorizer operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetAuthorizer
     */
    GetAuthorizerResult getAuthorizer(GetAuthorizerRequest getAuthorizerRequest);

    /**
     * <p>
     * Describe an existing <a>Authorizers</a> resource.
     * </p>
     * <div class="seeAlso"><a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-authorizers.html">AWS CLI</a></div>
     * 
     * @param getAuthorizersRequest
     *        Request to describe an existing <a>Authorizers</a> resource.
     * @return Result of the GetAuthorizers operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetAuthorizers
     */
    GetAuthorizersResult getAuthorizers(GetAuthorizersRequest getAuthorizersRequest);

    /**
     * <p>
     * Describe a <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param getBasePathMappingRequest
     *        Request to describe a <a>BasePathMapping</a> resource.
     * @return Result of the GetBasePathMapping operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetBasePathMapping
     */
    GetBasePathMappingResult getBasePathMapping(GetBasePathMappingRequest getBasePathMappingRequest);

    /**
     * <p>
     * Represents a collection of <a>BasePathMapping</a> resources.
     * </p>
     * 
     * @param getBasePathMappingsRequest
     *        A request to get information about a collection of <a>BasePathMapping</a> resources.
     * @return Result of the GetBasePathMappings operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetBasePathMappings
     */
    GetBasePathMappingsResult getBasePathMappings(GetBasePathMappingsRequest getBasePathMappingsRequest);

    /**
     * <p>
     * Gets information about the current <a>ClientCertificate</a> resource.
     * </p>
     * 
     * @param getClientCertificateRequest
     *        A request to get information about the current <a>ClientCertificate</a> resource.
     * @return Result of the GetClientCertificate operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetClientCertificate
     */
    GetClientCertificateResult getClientCertificate(GetClientCertificateRequest getClientCertificateRequest);

    /**
     * <p>
     * Gets a collection of <a>ClientCertificate</a> resources.
     * </p>
     * 
     * @param getClientCertificatesRequest
     *        A request to get information about a collection of <a>ClientCertificate</a> resources.
     * @return Result of the GetClientCertificates operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetClientCertificates
     */
    GetClientCertificatesResult getClientCertificates(GetClientCertificatesRequest getClientCertificatesRequest);

    /**
     * <p>
     * Gets information about a <a>Deployment</a> resource.
     * </p>
     * 
     * @param getDeploymentRequest
     *        Requests API Gateway to get information about a <a>Deployment</a> resource.
     * @return Result of the GetDeployment operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws ServiceUnavailableException
     *         The requested service is not available. For details see the accompanying error message. Retry after the
     *         specified time period.
     * @sample AmazonApiGateway.GetDeployment
     */
    GetDeploymentResult getDeployment(GetDeploymentRequest getDeploymentRequest);

    /**
     * <p>
     * Gets information about a <a>Deployments</a> collection.
     * </p>
     * 
     * @param getDeploymentsRequest
     *        Requests API Gateway to get information about a <a>Deployments</a> collection.
     * @return Result of the GetDeployments operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws ServiceUnavailableException
     *         The requested service is not available. For details see the accompanying error message. Retry after the
     *         specified time period.
     * @sample AmazonApiGateway.GetDeployments
     */
    GetDeploymentsResult getDeployments(GetDeploymentsRequest getDeploymentsRequest);

    /**
     * @param getDocumentationPartRequest
     *        Gets a specified documentation part of a given API.
     * @return Result of the GetDocumentationPart operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetDocumentationPart
     */
    GetDocumentationPartResult getDocumentationPart(GetDocumentationPartRequest getDocumentationPartRequest);

    /**
     * @param getDocumentationPartsRequest
     *        Gets the documentation parts of an API. The result may be filtered by the type, name, or path of API
     *        entities (targets).
     * @return Result of the GetDocumentationParts operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetDocumentationParts
     */
    GetDocumentationPartsResult getDocumentationParts(GetDocumentationPartsRequest getDocumentationPartsRequest);

    /**
     * @param getDocumentationVersionRequest
     *        Gets a documentation snapshot of an API.
     * @return Result of the GetDocumentationVersion operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetDocumentationVersion
     */
    GetDocumentationVersionResult getDocumentationVersion(GetDocumentationVersionRequest getDocumentationVersionRequest);

    /**
     * @param getDocumentationVersionsRequest
     *        Gets the documentation versions of an API.
     * @return Result of the GetDocumentationVersions operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetDocumentationVersions
     */
    GetDocumentationVersionsResult getDocumentationVersions(GetDocumentationVersionsRequest getDocumentationVersionsRequest);

    /**
     * <p>
     * Represents a domain name that is contained in a simpler, more intuitive URL that can be called.
     * </p>
     * 
     * @param getDomainNameRequest
     *        Request to get the name of a <a>DomainName</a> resource.
     * @return Result of the GetDomainName operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws ServiceUnavailableException
     *         The requested service is not available. For details see the accompanying error message. Retry after the
     *         specified time period.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
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
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetDomainNames
     */
    GetDomainNamesResult getDomainNames(GetDomainNamesRequest getDomainNamesRequest);

    /**
     * <p>
     * Exports a deployed version of a <a>RestApi</a> in a specified format.
     * </p>
     * 
     * @param getExportRequest
     *        Request a new export of a <a>RestApi</a> for a particular <a>Stage</a>.
     * @return Result of the GetExport operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetExport
     */
    GetExportResult getExport(GetExportRequest getExportRequest);

    /**
     * <p>
     * Gets a <a>GatewayResponse</a> of a specified response type on the given <a>RestApi</a>.
     * </p>
     * 
     * @param getGatewayResponseRequest
     *        Gets a <a>GatewayResponse</a> of a specified response type on the given <a>RestApi</a>.
     * @return Result of the GetGatewayResponse operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetGatewayResponse
     */
    GetGatewayResponseResult getGatewayResponse(GetGatewayResponseRequest getGatewayResponseRequest);

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
     * @return Result of the GetGatewayResponses operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetGatewayResponses
     */
    GetGatewayResponsesResult getGatewayResponses(GetGatewayResponsesRequest getGatewayResponsesRequest);

    /**
     * <p>
     * Get the integration settings.
     * </p>
     * 
     * @param getIntegrationRequest
     *        Represents a request to get the integration configuration.
     * @return Result of the GetIntegration operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetIntegration
     */
    GetIntegrationResult getIntegration(GetIntegrationRequest getIntegrationRequest);

    /**
     * <p>
     * Represents a get integration response.
     * </p>
     * 
     * @param getIntegrationResponseRequest
     *        Represents a get integration response request.
     * @return Result of the GetIntegrationResponse operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetIntegrationResponse
     */
    GetIntegrationResponseResult getIntegrationResponse(GetIntegrationResponseRequest getIntegrationResponseRequest);

    /**
     * <p>
     * Describe an existing <a>Method</a> resource.
     * </p>
     * 
     * @param getMethodRequest
     *        Request to describe an existing <a>Method</a> resource.
     * @return Result of the GetMethod operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
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
     * @return Result of the GetMethodResponse operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetMethodResponse
     */
    GetMethodResponseResult getMethodResponse(GetMethodResponseRequest getMethodResponseRequest);

    /**
     * <p>
     * Describes an existing model defined for a <a>RestApi</a> resource.
     * </p>
     * 
     * @param getModelRequest
     *        Request to list information about a model in an existing <a>RestApi</a> resource.
     * @return Result of the GetModel operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetModel
     */
    GetModelResult getModel(GetModelRequest getModelRequest);

    /**
     * <p>
     * Generates a sample mapping template that can be used to transform a payload into the structure of a model.
     * </p>
     * 
     * @param getModelTemplateRequest
     *        Request to generate a sample mapping template used to transform the payload.
     * @return Result of the GetModelTemplate operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetModelTemplate
     */
    GetModelTemplateResult getModelTemplate(GetModelTemplateRequest getModelTemplateRequest);

    /**
     * <p>
     * Describes existing <a>Models</a> defined for a <a>RestApi</a> resource.
     * </p>
     * 
     * @param getModelsRequest
     *        Request to list existing <a>Models</a> defined for a <a>RestApi</a> resource.
     * @return Result of the GetModels operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetModels
     */
    GetModelsResult getModels(GetModelsRequest getModelsRequest);

    /**
     * <p>
     * Gets a <a>RequestValidator</a> of a given <a>RestApi</a>.
     * </p>
     * 
     * @param getRequestValidatorRequest
     *        Gets a <a>RequestValidator</a> of a given <a>RestApi</a>.
     * @return Result of the GetRequestValidator operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetRequestValidator
     */
    GetRequestValidatorResult getRequestValidator(GetRequestValidatorRequest getRequestValidatorRequest);

    /**
     * <p>
     * Gets the <a>RequestValidators</a> collection of a given <a>RestApi</a>.
     * </p>
     * 
     * @param getRequestValidatorsRequest
     *        Gets the <a>RequestValidators</a> collection of a given <a>RestApi</a>.
     * @return Result of the GetRequestValidators operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetRequestValidators
     */
    GetRequestValidatorsResult getRequestValidators(GetRequestValidatorsRequest getRequestValidatorsRequest);

    /**
     * <p>
     * Lists information about a resource.
     * </p>
     * 
     * @param getResourceRequest
     *        Request to list information about a resource.
     * @return Result of the GetResource operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
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
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetResources
     */
    GetResourcesResult getResources(GetResourcesRequest getResourcesRequest);

    /**
     * <p>
     * Lists the <a>RestApi</a> resource in the collection.
     * </p>
     * 
     * @param getRestApiRequest
     *        The GET request to list an existing <a>RestApi</a> defined for your collection.
     * @return Result of the GetRestApi operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetRestApi
     */
    GetRestApiResult getRestApi(GetRestApiRequest getRestApiRequest);

    /**
     * <p>
     * Lists the <a>RestApis</a> resources for your collection.
     * </p>
     * 
     * @param getRestApisRequest
     *        The GET request to list existing <a>RestApis</a> defined for your collection.
     * @return Result of the GetRestApis operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetRestApis
     */
    GetRestApisResult getRestApis(GetRestApisRequest getRestApisRequest);

    /**
     * <p>
     * Generates a client SDK for a <a>RestApi</a> and <a>Stage</a>.
     * </p>
     * 
     * @param getSdkRequest
     *        Request a new generated client SDK for a <a>RestApi</a> and <a>Stage</a>.
     * @return Result of the GetSdk operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetSdk
     */
    GetSdkResult getSdk(GetSdkRequest getSdkRequest);

    /**
     * @param getSdkTypeRequest
     *        Get an <a>SdkType</a> instance.
     * @return Result of the GetSdkType operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetSdkType
     */
    GetSdkTypeResult getSdkType(GetSdkTypeRequest getSdkTypeRequest);

    /**
     * @param getSdkTypesRequest
     *        Get the <a>SdkTypes</a> collection.
     * @return Result of the GetSdkTypes operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetSdkTypes
     */
    GetSdkTypesResult getSdkTypes(GetSdkTypesRequest getSdkTypesRequest);

    /**
     * <p>
     * Gets information about a <a>Stage</a> resource.
     * </p>
     * 
     * @param getStageRequest
     *        Requests API Gateway to get information about a <a>Stage</a> resource.
     * @return Result of the GetStage operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetStage
     */
    GetStageResult getStage(GetStageRequest getStageRequest);

    /**
     * <p>
     * Gets information about one or more <a>Stage</a> resources.
     * </p>
     * 
     * @param getStagesRequest
     *        Requests API Gateway to get information about one or more <a>Stage</a> resources.
     * @return Result of the GetStages operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetStages
     */
    GetStagesResult getStages(GetStagesRequest getStagesRequest);

    /**
     * <p>
     * Gets the <a>Tags</a> collection for a given resource.
     * </p>
     * 
     * @param getTagsRequest
     *        Gets the <a>Tags</a> collection for a given resource.
     * @return Result of the GetTags operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetTags
     */
    GetTagsResult getTags(GetTagsRequest getTagsRequest);

    /**
     * <p>
     * Gets the usage data of a usage plan in a specified time interval.
     * </p>
     * 
     * @param getUsageRequest
     *        The GET request to get the usage data of a usage plan in a specified time interval.
     * @return Result of the GetUsage operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetUsage
     */
    GetUsageResult getUsage(GetUsageRequest getUsageRequest);

    /**
     * <p>
     * Gets a usage plan of a given plan identifier.
     * </p>
     * 
     * @param getUsagePlanRequest
     *        The GET request to get a usage plan of a given plan identifier.
     * @return Result of the GetUsagePlan operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetUsagePlan
     */
    GetUsagePlanResult getUsagePlan(GetUsagePlanRequest getUsagePlanRequest);

    /**
     * <p>
     * Gets a usage plan key of a given key identifier.
     * </p>
     * 
     * @param getUsagePlanKeyRequest
     *        The GET request to get a usage plan key of a given key identifier.
     * @return Result of the GetUsagePlanKey operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetUsagePlanKey
     */
    GetUsagePlanKeyResult getUsagePlanKey(GetUsagePlanKeyRequest getUsagePlanKeyRequest);

    /**
     * <p>
     * Gets all the usage plan keys representing the API keys added to a specified usage plan.
     * </p>
     * 
     * @param getUsagePlanKeysRequest
     *        The GET request to get all the usage plan keys representing the API keys added to a specified usage plan.
     * @return Result of the GetUsagePlanKeys operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetUsagePlanKeys
     */
    GetUsagePlanKeysResult getUsagePlanKeys(GetUsagePlanKeysRequest getUsagePlanKeysRequest);

    /**
     * <p>
     * Gets all the usage plans of the caller's account.
     * </p>
     * 
     * @param getUsagePlansRequest
     *        The GET request to get all the usage plans of the caller's account.
     * @return Result of the GetUsagePlans operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @sample AmazonApiGateway.GetUsagePlans
     */
    GetUsagePlansResult getUsagePlans(GetUsagePlansRequest getUsagePlansRequest);

    /**
     * <p>
     * Gets a specified VPC link under the caller's account in a region.
     * </p>
     * 
     * @param getVpcLinkRequest
     *        Gets a specified VPC link under the caller's account in a region.
     * @return Result of the GetVpcLink operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetVpcLink
     */
    GetVpcLinkResult getVpcLink(GetVpcLinkRequest getVpcLinkRequest);

    /**
     * <p>
     * Gets the <a>VpcLinks</a> collection under the caller's account in a selected region.
     * </p>
     * 
     * @param getVpcLinksRequest
     *        Gets the <a>VpcLinks</a> collection under the caller's account in a selected region.
     * @return Result of the GetVpcLinks operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.GetVpcLinks
     */
    GetVpcLinksResult getVpcLinks(GetVpcLinksRequest getVpcLinksRequest);

    /**
     * <p>
     * Import API keys from an external source, such as a CSV-formatted file.
     * </p>
     * 
     * @param importApiKeysRequest
     *        The POST request to import API keys from an external source, such as a CSV-formatted file.
     * @return Result of the ImportApiKeys operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AmazonApiGateway.ImportApiKeys
     */
    ImportApiKeysResult importApiKeys(ImportApiKeysRequest importApiKeysRequest);

    /**
     * @param importDocumentationPartsRequest
     *        Import documentation parts from an external (e.g., OpenAPI) definition file.
     * @return Result of the ImportDocumentationParts operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.ImportDocumentationParts
     */
    ImportDocumentationPartsResult importDocumentationParts(ImportDocumentationPartsRequest importDocumentationPartsRequest);

    /**
     * <p>
     * A feature of the API Gateway control service for creating a new API from an external API definition file.
     * </p>
     * 
     * @param importRestApiRequest
     *        A POST request to import an API to API Gateway using an input of an API definition file.
     * @return Result of the ImportRestApi operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AmazonApiGateway.ImportRestApi
     */
    ImportRestApiResult importRestApi(ImportRestApiRequest importRestApiRequest);

    /**
     * <p>
     * Creates a customization of a <a>GatewayResponse</a> of a specified response type and status code on the given
     * <a>RestApi</a>.
     * </p>
     * 
     * @param putGatewayResponseRequest
     *        Creates a customization of a <a>GatewayResponse</a> of a specified response type and status code on the
     *        given <a>RestApi</a>.
     * @return Result of the PutGatewayResponse operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.PutGatewayResponse
     */
    PutGatewayResponseResult putGatewayResponse(PutGatewayResponseRequest putGatewayResponseRequest);

    /**
     * <p>
     * Sets up a method's integration.
     * </p>
     * 
     * @param putIntegrationRequest
     *        Sets up a method's integration.
     * @return Result of the PutIntegration operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.PutIntegration
     */
    PutIntegrationResult putIntegration(PutIntegrationRequest putIntegrationRequest);

    /**
     * <p>
     * Represents a put integration.
     * </p>
     * 
     * @param putIntegrationResponseRequest
     *        Represents a put integration response request.
     * @return Result of the PutIntegrationResponse operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AmazonApiGateway.PutIntegrationResponse
     */
    PutIntegrationResponseResult putIntegrationResponse(PutIntegrationResponseRequest putIntegrationResponseRequest);

    /**
     * <p>
     * Add a method to an existing <a>Resource</a> resource.
     * </p>
     * 
     * @param putMethodRequest
     *        Request to add a method to an existing <a>Resource</a> resource.
     * @return Result of the PutMethod operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.PutMethod
     */
    PutMethodResult putMethod(PutMethodRequest putMethodRequest);

    /**
     * <p>
     * Adds a <a>MethodResponse</a> to an existing <a>Method</a> resource.
     * </p>
     * 
     * @param putMethodResponseRequest
     *        Request to add a <a>MethodResponse</a> to an existing <a>Method</a> resource.
     * @return Result of the PutMethodResponse operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.PutMethodResponse
     */
    PutMethodResponseResult putMethodResponse(PutMethodResponseRequest putMethodResponseRequest);

    /**
     * <p>
     * A feature of the API Gateway control service for updating an existing API with an input of external API
     * definitions. The update can take the form of merging the supplied definition into the existing API or overwriting
     * the existing API.
     * </p>
     * 
     * @param putRestApiRequest
     *        A PUT request to update an existing API, with external API definitions specified as the request body.
     * @return Result of the PutRestApi operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AmazonApiGateway.PutRestApi
     */
    PutRestApiResult putRestApi(PutRestApiRequest putRestApiRequest);

    /**
     * <p>
     * Adds or updates a tag on a given resource.
     * </p>
     * 
     * @param tagResourceRequest
     *        Adds or updates a tag on a given resource.
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AmazonApiGateway.TagResource
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

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
     * @return Result of the TestInvokeAuthorizer operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.TestInvokeAuthorizer
     */
    TestInvokeAuthorizerResult testInvokeAuthorizer(TestInvokeAuthorizerRequest testInvokeAuthorizerRequest);

    /**
     * <p>
     * Simulate the execution of a <a>Method</a> in your <a>RestApi</a> with headers, parameters, and an incoming
     * request body.
     * </p>
     * 
     * @param testInvokeMethodRequest
     *        Make a request to simulate the execution of a <a>Method</a>.
     * @return Result of the TestInvokeMethod operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.TestInvokeMethod
     */
    TestInvokeMethodResult testInvokeMethod(TestInvokeMethodRequest testInvokeMethodRequest);

    /**
     * <p>
     * Removes a tag from a given resource.
     * </p>
     * 
     * @param untagResourceRequest
     *        Removes a tag from a given resource.
     * @return Result of the UntagResource operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AmazonApiGateway.UntagResource
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Changes information about the current <a>Account</a> resource.
     * </p>
     * 
     * @param updateAccountRequest
     *        Requests API Gateway to change information about the current <a>Account</a> resource.
     * @return Result of the UpdateAccount operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
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
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AmazonApiGateway.UpdateApiKey
     */
    UpdateApiKeyResult updateApiKey(UpdateApiKeyRequest updateApiKeyRequest);

    /**
     * <p>
     * Updates an existing <a>Authorizer</a> resource.
     * </p>
     * <div class="seeAlso"><a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/update-authorizer.html">AWS CLI</a></div>
     * 
     * @param updateAuthorizerRequest
     *        Request to update an existing <a>Authorizer</a> resource.
     * @return Result of the UpdateAuthorizer operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.UpdateAuthorizer
     */
    UpdateAuthorizerResult updateAuthorizer(UpdateAuthorizerRequest updateAuthorizerRequest);

    /**
     * <p>
     * Changes information about the <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param updateBasePathMappingRequest
     *        A request to change information about the <a>BasePathMapping</a> resource.
     * @return Result of the UpdateBasePathMapping operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.UpdateBasePathMapping
     */
    UpdateBasePathMappingResult updateBasePathMapping(UpdateBasePathMappingRequest updateBasePathMappingRequest);

    /**
     * <p>
     * Changes information about an <a>ClientCertificate</a> resource.
     * </p>
     * 
     * @param updateClientCertificateRequest
     *        A request to change information about an <a>ClientCertificate</a> resource.
     * @return Result of the UpdateClientCertificate operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @sample AmazonApiGateway.UpdateClientCertificate
     */
    UpdateClientCertificateResult updateClientCertificate(UpdateClientCertificateRequest updateClientCertificateRequest);

    /**
     * <p>
     * Changes information about a <a>Deployment</a> resource.
     * </p>
     * 
     * @param updateDeploymentRequest
     *        Requests API Gateway to change information about a <a>Deployment</a> resource.
     * @return Result of the UpdateDeployment operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws ServiceUnavailableException
     *         The requested service is not available. For details see the accompanying error message. Retry after the
     *         specified time period.
     * @sample AmazonApiGateway.UpdateDeployment
     */
    UpdateDeploymentResult updateDeployment(UpdateDeploymentRequest updateDeploymentRequest);

    /**
     * @param updateDocumentationPartRequest
     *        Updates an existing documentation part of a given API.
     * @return Result of the UpdateDocumentationPart operation returned by the service.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.UpdateDocumentationPart
     */
    UpdateDocumentationPartResult updateDocumentationPart(UpdateDocumentationPartRequest updateDocumentationPartRequest);

    /**
     * @param updateDocumentationVersionRequest
     *        Updates an existing documentation version of an API.
     * @return Result of the UpdateDocumentationVersion operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.UpdateDocumentationVersion
     */
    UpdateDocumentationVersionResult updateDocumentationVersion(UpdateDocumentationVersionRequest updateDocumentationVersionRequest);

    /**
     * <p>
     * Changes information about the <a>DomainName</a> resource.
     * </p>
     * 
     * @param updateDomainNameRequest
     *        A request to change information about the <a>DomainName</a> resource.
     * @return Result of the UpdateDomainName operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.UpdateDomainName
     */
    UpdateDomainNameResult updateDomainName(UpdateDomainNameRequest updateDomainNameRequest);

    /**
     * <p>
     * Updates a <a>GatewayResponse</a> of a specified response type on the given <a>RestApi</a>.
     * </p>
     * 
     * @param updateGatewayResponseRequest
     *        Updates a <a>GatewayResponse</a> of a specified response type on the given <a>RestApi</a>.
     * @return Result of the UpdateGatewayResponse operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.UpdateGatewayResponse
     */
    UpdateGatewayResponseResult updateGatewayResponse(UpdateGatewayResponseRequest updateGatewayResponseRequest);

    /**
     * <p>
     * Represents an update integration.
     * </p>
     * 
     * @param updateIntegrationRequest
     *        Represents an update integration request.
     * @return Result of the UpdateIntegration operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AmazonApiGateway.UpdateIntegration
     */
    UpdateIntegrationResult updateIntegration(UpdateIntegrationRequest updateIntegrationRequest);

    /**
     * <p>
     * Represents an update integration response.
     * </p>
     * 
     * @param updateIntegrationResponseRequest
     *        Represents an update integration response request.
     * @return Result of the UpdateIntegrationResponse operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.UpdateIntegrationResponse
     */
    UpdateIntegrationResponseResult updateIntegrationResponse(UpdateIntegrationResponseRequest updateIntegrationResponseRequest);

    /**
     * <p>
     * Updates an existing <a>Method</a> resource.
     * </p>
     * 
     * @param updateMethodRequest
     *        Request to update an existing <a>Method</a> resource.
     * @return Result of the UpdateMethod operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
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
     * @return Result of the UpdateMethodResponse operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws LimitExceededException
     *         The request exceeded the rate limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.UpdateMethodResponse
     */
    UpdateMethodResponseResult updateMethodResponse(UpdateMethodResponseRequest updateMethodResponseRequest);

    /**
     * <p>
     * Changes information about a model.
     * </p>
     * 
     * @param updateModelRequest
     *        Request to update an existing model in an existing <a>RestApi</a> resource.
     * @return Result of the UpdateModel operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.UpdateModel
     */
    UpdateModelResult updateModel(UpdateModelRequest updateModelRequest);

    /**
     * <p>
     * Updates a <a>RequestValidator</a> of a given <a>RestApi</a>.
     * </p>
     * 
     * @param updateRequestValidatorRequest
     *        Updates a <a>RequestValidator</a> of a given <a>RestApi</a>.
     * @return Result of the UpdateRequestValidator operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.UpdateRequestValidator
     */
    UpdateRequestValidatorResult updateRequestValidator(UpdateRequestValidatorRequest updateRequestValidatorRequest);

    /**
     * <p>
     * Changes information about a <a>Resource</a> resource.
     * </p>
     * 
     * @param updateResourceRequest
     *        Request to change information about a <a>Resource</a> resource.
     * @return Result of the UpdateResource operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.UpdateResource
     */
    UpdateResourceResult updateResource(UpdateResourceRequest updateResourceRequest);

    /**
     * <p>
     * Changes information about the specified API.
     * </p>
     * 
     * @param updateRestApiRequest
     *        Request to update an existing <a>RestApi</a> resource in your collection.
     * @return Result of the UpdateRestApi operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.UpdateRestApi
     */
    UpdateRestApiResult updateRestApi(UpdateRestApiRequest updateRestApiRequest);

    /**
     * <p>
     * Changes information about a <a>Stage</a> resource.
     * </p>
     * 
     * @param updateStageRequest
     *        Requests API Gateway to change information about a <a>Stage</a> resource.
     * @return Result of the UpdateStage operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.UpdateStage
     */
    UpdateStageResult updateStage(UpdateStageRequest updateStageRequest);

    /**
     * <p>
     * Grants a temporary extension to the remaining quota of a usage plan associated with a specified API key.
     * </p>
     * 
     * @param updateUsageRequest
     *        The PATCH request to grant a temporary extension to the remaining quota of a usage plan associated with a
     *        specified API key.
     * @return Result of the UpdateUsage operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @sample AmazonApiGateway.UpdateUsage
     */
    UpdateUsageResult updateUsage(UpdateUsageRequest updateUsageRequest);

    /**
     * <p>
     * Updates a usage plan of a given plan Id.
     * </p>
     * 
     * @param updateUsagePlanRequest
     *        The PATCH request to update a usage plan of a given plan Id.
     * @return Result of the UpdateUsagePlan operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @sample AmazonApiGateway.UpdateUsagePlan
     */
    UpdateUsagePlanResult updateUsagePlan(UpdateUsagePlanRequest updateUsagePlanRequest);

    /**
     * <p>
     * Updates an existing <a>VpcLink</a> of a specified identifier.
     * </p>
     * 
     * @param updateVpcLinkRequest
     *        Updates an existing <a>VpcLink</a> of a specified identifier.
     * @return Result of the UpdateVpcLink operation returned by the service.
     * @throws UnauthorizedException
     *         The request is denied because the caller has insufficient permissions.
     * @throws NotFoundException
     *         The requested resource is not found. Make sure that the request URI is correct.
     * @throws BadRequestException
     *         The submitted request is not valid, for example, the input is incomplete or incorrect. See the
     *         accompanying error message for details.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws TooManyRequestsException
     *         The request has reached its throttling limit. Retry after the specified time period.
     * @sample AmazonApiGateway.UpdateVpcLink
     */
    UpdateVpcLinkResult updateVpcLink(UpdateVpcLinkRequest updateVpcLinkRequest);

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
